package com.microsoft.bingads.examples.v11;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v11.bulk.entities.*;
import com.microsoft.bingads.v11.bulk.*;
import com.microsoft.bingads.v11.bulk.ArrayOfDownloadEntity;
import com.microsoft.bingads.v11.campaignmanagement.*;

public class BulkPauseAdGroups extends BulkExampleBase {
	 
    public static void main(String[] args) {
		
        BulkEntityIterable downloadEntities = null;

        try {
            
            AuthorizationData authorizationData = new AuthorizationData();
            authorizationData.setDeveloperToken(DeveloperToken);
            authorizationData.setAuthentication(new PasswordAuthentication(UserName, Password));
            authorizationData.setCustomerId(CustomerId);
            authorizationData.setAccountId(AccountId);

            BulkServiceManager = new BulkServiceManager(authorizationData, API_ENVIRONMENT);
            BulkServiceManager.setStatusPollIntervalInMilliseconds(5000);

            // Complete a full download of all ad groups in the account. 

            ArrayOfDownloadEntity entities = new ArrayOfDownloadEntity();
            entities.getDownloadEntities().add(DownloadEntity.AD_GROUPS);

            DownloadParameters downloadParameters = new DownloadParameters();
            downloadParameters.setDownloadEntities(entities);
            downloadParameters.setFileType(DownloadFileType.CSV);

            // Download all ad groups in the account.
            File bulkFilePath = BulkServiceManager.downloadFileAsync(downloadParameters, null, null).get();
            outputStatusMessage("Downloaded all ad groups in the account.\n"); 
            Reader = new BulkFileReader(bulkFilePath, ResultFileType.FULL_DOWNLOAD, FileType);
            downloadEntities = Reader.getEntities();

            List<BulkEntity> uploadEntities = new ArrayList<BulkEntity>();

            for (BulkEntity entity : downloadEntities) {
                if (entity instanceof BulkAdGroup 
                            && ((BulkAdGroup)entity).getAdGroup().getStatus() == AdGroupStatus.ACTIVE) {
                    outputBulkAdGroups(Arrays.asList((BulkAdGroup) entity) );
                    ((BulkAdGroup)entity).getAdGroup().setStatus(AdGroupStatus.PAUSED);
                    uploadEntities.add(entity);
                }
            }
            downloadEntities.close();
            Reader.close();

            if (!uploadEntities.isEmpty()){
                outputStatusMessage("Changed local status of all Active ad groups to Paused. Ready for upload.\n"); 

                Reader = writeEntitiesAndUploadFile(uploadEntities);
                downloadEntities = Reader.getEntities();
                for (BulkEntity entity : downloadEntities) {
                    if (entity instanceof BulkAdGroup) {
                            outputBulkAdGroups(Arrays.asList((BulkAdGroup) entity) );
                    }
                }
                downloadEntities.close();
                Reader.close();
            }
            else {
                    outputStatusMessage("All ad groups are already Paused. \n"); 
            }

            outputStatusMessage("Program execution completed\n"); 

        } 
        catch (Exception ex) {
            String faultXml = BingAdsExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            String message = BingAdsExceptionHelper.handleBingAdsSDKException(ex, System.out);
            ex.printStackTrace();
        } 
        finally {
            if (downloadEntities != null){
                try {
                    downloadEntities.close();
                } 
                catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }

        System.exit(0);
    }
}
