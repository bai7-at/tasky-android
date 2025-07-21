package com.amazonaws.services.cognitosync;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.regions.Region;
import com.amazonaws.services.cognitosync.model.DeleteDatasetRequest;
import com.amazonaws.services.cognitosync.model.DeleteDatasetResult;
import com.amazonaws.services.cognitosync.model.DescribeDatasetRequest;
import com.amazonaws.services.cognitosync.model.DescribeDatasetResult;
import com.amazonaws.services.cognitosync.model.ListDatasetsRequest;
import com.amazonaws.services.cognitosync.model.ListDatasetsResult;
import com.amazonaws.services.cognitosync.model.ListRecordsRequest;
import com.amazonaws.services.cognitosync.model.ListRecordsResult;
import com.amazonaws.services.cognitosync.model.RegisterDeviceRequest;
import com.amazonaws.services.cognitosync.model.RegisterDeviceResult;
import com.amazonaws.services.cognitosync.model.SubscribeToDatasetRequest;
import com.amazonaws.services.cognitosync.model.SubscribeToDatasetResult;
import com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetRequest;
import com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetResult;
import com.amazonaws.services.cognitosync.model.UpdateRecordsRequest;
import com.amazonaws.services.cognitosync.model.UpdateRecordsResult;

@Deprecated
/* loaded from: classes.dex */
public interface AmazonCognitoSync {
    DeleteDatasetResult deleteDataset(DeleteDatasetRequest deleteDatasetRequest) throws AmazonClientException, AmazonServiceException;

    DescribeDatasetResult describeDataset(DescribeDatasetRequest describeDatasetRequest) throws AmazonClientException, AmazonServiceException;

    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest amazonWebServiceRequest);

    ListDatasetsResult listDatasets(ListDatasetsRequest listDatasetsRequest) throws AmazonClientException, AmazonServiceException;

    ListRecordsResult listRecords(ListRecordsRequest listRecordsRequest) throws AmazonClientException, AmazonServiceException;

    RegisterDeviceResult registerDevice(RegisterDeviceRequest registerDeviceRequest) throws AmazonClientException, AmazonServiceException;

    void setEndpoint(String str) throws IllegalArgumentException;

    void setRegion(Region region) throws IllegalArgumentException;

    void shutdown();

    SubscribeToDatasetResult subscribeToDataset(SubscribeToDatasetRequest subscribeToDatasetRequest) throws AmazonClientException, AmazonServiceException;

    UnsubscribeFromDatasetResult unsubscribeFromDataset(UnsubscribeFromDatasetRequest unsubscribeFromDatasetRequest) throws AmazonClientException, AmazonServiceException;

    UpdateRecordsResult updateRecords(UpdateRecordsRequest updateRecordsRequest) throws AmazonClientException, AmazonServiceException;
}
