package com.amazonaws.services.dynamodbv2;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.dynamodbv2.model.BatchGetItemRequest;
import com.amazonaws.services.dynamodbv2.model.BatchGetItemResult;
import com.amazonaws.services.dynamodbv2.model.BatchWriteItemRequest;
import com.amazonaws.services.dynamodbv2.model.BatchWriteItemResult;
import com.amazonaws.services.dynamodbv2.model.CreateBackupRequest;
import com.amazonaws.services.dynamodbv2.model.CreateBackupResult;
import com.amazonaws.services.dynamodbv2.model.CreateGlobalTableRequest;
import com.amazonaws.services.dynamodbv2.model.CreateGlobalTableResult;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.CreateTableResult;
import com.amazonaws.services.dynamodbv2.model.DeleteBackupRequest;
import com.amazonaws.services.dynamodbv2.model.DeleteBackupResult;
import com.amazonaws.services.dynamodbv2.model.DeleteItemRequest;
import com.amazonaws.services.dynamodbv2.model.DeleteItemResult;
import com.amazonaws.services.dynamodbv2.model.DeleteTableRequest;
import com.amazonaws.services.dynamodbv2.model.DeleteTableResult;
import com.amazonaws.services.dynamodbv2.model.DescribeBackupRequest;
import com.amazonaws.services.dynamodbv2.model.DescribeBackupResult;
import com.amazonaws.services.dynamodbv2.model.DescribeContinuousBackupsRequest;
import com.amazonaws.services.dynamodbv2.model.DescribeContinuousBackupsResult;
import com.amazonaws.services.dynamodbv2.model.DescribeEndpointsRequest;
import com.amazonaws.services.dynamodbv2.model.DescribeEndpointsResult;
import com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableRequest;
import com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableResult;
import com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableSettingsRequest;
import com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableSettingsResult;
import com.amazonaws.services.dynamodbv2.model.DescribeLimitsRequest;
import com.amazonaws.services.dynamodbv2.model.DescribeLimitsResult;
import com.amazonaws.services.dynamodbv2.model.DescribeTableRequest;
import com.amazonaws.services.dynamodbv2.model.DescribeTableResult;
import com.amazonaws.services.dynamodbv2.model.DescribeTimeToLiveRequest;
import com.amazonaws.services.dynamodbv2.model.DescribeTimeToLiveResult;
import com.amazonaws.services.dynamodbv2.model.GetItemRequest;
import com.amazonaws.services.dynamodbv2.model.GetItemResult;
import com.amazonaws.services.dynamodbv2.model.ListBackupsRequest;
import com.amazonaws.services.dynamodbv2.model.ListBackupsResult;
import com.amazonaws.services.dynamodbv2.model.ListGlobalTablesRequest;
import com.amazonaws.services.dynamodbv2.model.ListGlobalTablesResult;
import com.amazonaws.services.dynamodbv2.model.ListTablesRequest;
import com.amazonaws.services.dynamodbv2.model.ListTablesResult;
import com.amazonaws.services.dynamodbv2.model.ListTagsOfResourceRequest;
import com.amazonaws.services.dynamodbv2.model.ListTagsOfResourceResult;
import com.amazonaws.services.dynamodbv2.model.PutItemRequest;
import com.amazonaws.services.dynamodbv2.model.PutItemResult;
import com.amazonaws.services.dynamodbv2.model.QueryRequest;
import com.amazonaws.services.dynamodbv2.model.QueryResult;
import com.amazonaws.services.dynamodbv2.model.RestoreTableFromBackupRequest;
import com.amazonaws.services.dynamodbv2.model.RestoreTableFromBackupResult;
import com.amazonaws.services.dynamodbv2.model.RestoreTableToPointInTimeRequest;
import com.amazonaws.services.dynamodbv2.model.RestoreTableToPointInTimeResult;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;
import com.amazonaws.services.dynamodbv2.model.ScanResult;
import com.amazonaws.services.dynamodbv2.model.TagResourceRequest;
import com.amazonaws.services.dynamodbv2.model.UntagResourceRequest;
import com.amazonaws.services.dynamodbv2.model.UpdateContinuousBackupsRequest;
import com.amazonaws.services.dynamodbv2.model.UpdateContinuousBackupsResult;
import com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableRequest;
import com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableResult;
import com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableSettingsRequest;
import com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableSettingsResult;
import com.amazonaws.services.dynamodbv2.model.UpdateItemRequest;
import com.amazonaws.services.dynamodbv2.model.UpdateItemResult;
import com.amazonaws.services.dynamodbv2.model.UpdateTableRequest;
import com.amazonaws.services.dynamodbv2.model.UpdateTableResult;
import com.amazonaws.services.dynamodbv2.model.UpdateTimeToLiveRequest;
import com.amazonaws.services.dynamodbv2.model.UpdateTimeToLiveResult;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public class AmazonDynamoDBAsyncClient extends AmazonDynamoDBClient implements AmazonDynamoDBAsync {
    private static final int DEFAULT_THREAD_POOL_SIZE = 10;
    private ExecutorService executorService;

    @Deprecated
    public AmazonDynamoDBAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<BatchGetItemResult> batchGetItemAsync(final BatchGetItemRequest batchGetItemRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<BatchGetItemResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public BatchGetItemResult call() throws Exception {
                return AmazonDynamoDBAsyncClient.this.batchGetItem(batchGetItemRequest);
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<BatchWriteItemResult> batchWriteItemAsync(final BatchWriteItemRequest batchWriteItemRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<BatchWriteItemResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public BatchWriteItemResult call() throws Exception {
                return AmazonDynamoDBAsyncClient.this.batchWriteItem(batchWriteItemRequest);
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<CreateBackupResult> createBackupAsync(final CreateBackupRequest createBackupRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<CreateBackupResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public CreateBackupResult call() throws Exception {
                return AmazonDynamoDBAsyncClient.this.createBackup(createBackupRequest);
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<CreateGlobalTableResult> createGlobalTableAsync(final CreateGlobalTableRequest createGlobalTableRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<CreateGlobalTableResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public CreateGlobalTableResult call() throws Exception {
                return AmazonDynamoDBAsyncClient.this.createGlobalTable(createGlobalTableRequest);
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<CreateTableResult> createTableAsync(final CreateTableRequest createTableRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<CreateTableResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public CreateTableResult call() throws Exception {
                return AmazonDynamoDBAsyncClient.this.createTable(createTableRequest);
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<DeleteBackupResult> deleteBackupAsync(final DeleteBackupRequest deleteBackupRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<DeleteBackupResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public DeleteBackupResult call() throws Exception {
                return AmazonDynamoDBAsyncClient.this.deleteBackup(deleteBackupRequest);
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<DeleteItemResult> deleteItemAsync(final DeleteItemRequest deleteItemRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<DeleteItemResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public DeleteItemResult call() throws Exception {
                return AmazonDynamoDBAsyncClient.this.deleteItem(deleteItemRequest);
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<DeleteTableResult> deleteTableAsync(final DeleteTableRequest deleteTableRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<DeleteTableResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.15
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public DeleteTableResult call() throws Exception {
                return AmazonDynamoDBAsyncClient.this.deleteTable(deleteTableRequest);
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<DescribeBackupResult> describeBackupAsync(final DescribeBackupRequest describeBackupRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<DescribeBackupResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.17
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public DescribeBackupResult call() throws Exception {
                return AmazonDynamoDBAsyncClient.this.describeBackup(describeBackupRequest);
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<DescribeContinuousBackupsResult> describeContinuousBackupsAsync(final DescribeContinuousBackupsRequest describeContinuousBackupsRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<DescribeContinuousBackupsResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.19
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public DescribeContinuousBackupsResult call() throws Exception {
                return AmazonDynamoDBAsyncClient.this.describeContinuousBackups(describeContinuousBackupsRequest);
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<DescribeEndpointsResult> describeEndpointsAsync(final DescribeEndpointsRequest describeEndpointsRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<DescribeEndpointsResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.21
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public DescribeEndpointsResult call() throws Exception {
                return AmazonDynamoDBAsyncClient.this.describeEndpoints(describeEndpointsRequest);
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<DescribeGlobalTableResult> describeGlobalTableAsync(final DescribeGlobalTableRequest describeGlobalTableRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<DescribeGlobalTableResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.23
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public DescribeGlobalTableResult call() throws Exception {
                return AmazonDynamoDBAsyncClient.this.describeGlobalTable(describeGlobalTableRequest);
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<DescribeGlobalTableSettingsResult> describeGlobalTableSettingsAsync(final DescribeGlobalTableSettingsRequest describeGlobalTableSettingsRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<DescribeGlobalTableSettingsResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.25
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public DescribeGlobalTableSettingsResult call() throws Exception {
                return AmazonDynamoDBAsyncClient.this.describeGlobalTableSettings(describeGlobalTableSettingsRequest);
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<DescribeLimitsResult> describeLimitsAsync(final DescribeLimitsRequest describeLimitsRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<DescribeLimitsResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.27
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public DescribeLimitsResult call() throws Exception {
                return AmazonDynamoDBAsyncClient.this.describeLimits(describeLimitsRequest);
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<DescribeTableResult> describeTableAsync(final DescribeTableRequest describeTableRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<DescribeTableResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.29
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public DescribeTableResult call() throws Exception {
                return AmazonDynamoDBAsyncClient.this.describeTable(describeTableRequest);
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<DescribeTimeToLiveResult> describeTimeToLiveAsync(final DescribeTimeToLiveRequest describeTimeToLiveRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<DescribeTimeToLiveResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.31
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public DescribeTimeToLiveResult call() throws Exception {
                return AmazonDynamoDBAsyncClient.this.describeTimeToLive(describeTimeToLiveRequest);
            }
        });
    }

    public ExecutorService getExecutorService() {
        return this.executorService;
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<GetItemResult> getItemAsync(final GetItemRequest getItemRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<GetItemResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.33
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public GetItemResult call() throws Exception {
                return AmazonDynamoDBAsyncClient.this.getItem(getItemRequest);
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<ListBackupsResult> listBackupsAsync(final ListBackupsRequest listBackupsRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<ListBackupsResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.35
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public ListBackupsResult call() throws Exception {
                return AmazonDynamoDBAsyncClient.this.listBackups(listBackupsRequest);
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<ListGlobalTablesResult> listGlobalTablesAsync(final ListGlobalTablesRequest listGlobalTablesRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<ListGlobalTablesResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.37
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public ListGlobalTablesResult call() throws Exception {
                return AmazonDynamoDBAsyncClient.this.listGlobalTables(listGlobalTablesRequest);
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<ListTablesResult> listTablesAsync(final ListTablesRequest listTablesRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<ListTablesResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.39
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public ListTablesResult call() throws Exception {
                return AmazonDynamoDBAsyncClient.this.listTables(listTablesRequest);
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<ListTagsOfResourceResult> listTagsOfResourceAsync(final ListTagsOfResourceRequest listTagsOfResourceRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<ListTagsOfResourceResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.41
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public ListTagsOfResourceResult call() throws Exception {
                return AmazonDynamoDBAsyncClient.this.listTagsOfResource(listTagsOfResourceRequest);
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<PutItemResult> putItemAsync(final PutItemRequest putItemRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<PutItemResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.43
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public PutItemResult call() throws Exception {
                return AmazonDynamoDBAsyncClient.this.putItem(putItemRequest);
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<QueryResult> queryAsync(final QueryRequest queryRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<QueryResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.45
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public QueryResult call() throws Exception {
                return AmazonDynamoDBAsyncClient.this.query(queryRequest);
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<RestoreTableFromBackupResult> restoreTableFromBackupAsync(final RestoreTableFromBackupRequest restoreTableFromBackupRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<RestoreTableFromBackupResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.47
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RestoreTableFromBackupResult call() throws Exception {
                return AmazonDynamoDBAsyncClient.this.restoreTableFromBackup(restoreTableFromBackupRequest);
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<RestoreTableToPointInTimeResult> restoreTableToPointInTimeAsync(final RestoreTableToPointInTimeRequest restoreTableToPointInTimeRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<RestoreTableToPointInTimeResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.49
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RestoreTableToPointInTimeResult call() throws Exception {
                return AmazonDynamoDBAsyncClient.this.restoreTableToPointInTime(restoreTableToPointInTimeRequest);
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<ScanResult> scanAsync(final ScanRequest scanRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<ScanResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.51
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public ScanResult call() throws Exception {
                return AmazonDynamoDBAsyncClient.this.scan(scanRequest);
            }
        });
    }

    @Override // com.amazonaws.AmazonWebServiceClient, com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public void shutdown() {
        super.shutdown();
        this.executorService.shutdownNow();
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<Void> tagResourceAsync(final TagResourceRequest tagResourceRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<Void>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.53
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                AmazonDynamoDBAsyncClient.this.tagResource(tagResourceRequest);
                return null;
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<Void> untagResourceAsync(final UntagResourceRequest untagResourceRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<Void>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.55
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                AmazonDynamoDBAsyncClient.this.untagResource(untagResourceRequest);
                return null;
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<UpdateContinuousBackupsResult> updateContinuousBackupsAsync(final UpdateContinuousBackupsRequest updateContinuousBackupsRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<UpdateContinuousBackupsResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.57
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public UpdateContinuousBackupsResult call() throws Exception {
                return AmazonDynamoDBAsyncClient.this.updateContinuousBackups(updateContinuousBackupsRequest);
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<UpdateGlobalTableResult> updateGlobalTableAsync(final UpdateGlobalTableRequest updateGlobalTableRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<UpdateGlobalTableResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.59
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public UpdateGlobalTableResult call() throws Exception {
                return AmazonDynamoDBAsyncClient.this.updateGlobalTable(updateGlobalTableRequest);
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<UpdateGlobalTableSettingsResult> updateGlobalTableSettingsAsync(final UpdateGlobalTableSettingsRequest updateGlobalTableSettingsRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<UpdateGlobalTableSettingsResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.61
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public UpdateGlobalTableSettingsResult call() throws Exception {
                return AmazonDynamoDBAsyncClient.this.updateGlobalTableSettings(updateGlobalTableSettingsRequest);
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<UpdateItemResult> updateItemAsync(final UpdateItemRequest updateItemRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<UpdateItemResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.63
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public UpdateItemResult call() throws Exception {
                return AmazonDynamoDBAsyncClient.this.updateItem(updateItemRequest);
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<UpdateTableResult> updateTableAsync(final UpdateTableRequest updateTableRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<UpdateTableResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.65
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public UpdateTableResult call() throws Exception {
                return AmazonDynamoDBAsyncClient.this.updateTable(updateTableRequest);
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<UpdateTimeToLiveResult> updateTimeToLiveAsync(final UpdateTimeToLiveRequest updateTimeToLiveRequest) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<UpdateTimeToLiveResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.67
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public UpdateTimeToLiveResult call() throws Exception {
                return AmazonDynamoDBAsyncClient.this.updateTimeToLive(updateTimeToLiveRequest);
            }
        });
    }

    @Deprecated
    public AmazonDynamoDBAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<BatchGetItemResult> batchGetItemAsync(final BatchGetItemRequest batchGetItemRequest, final AsyncHandler<BatchGetItemRequest, BatchGetItemResult> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<BatchGetItemResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public BatchGetItemResult call() throws Exception {
                try {
                    BatchGetItemResult batchGetItem = AmazonDynamoDBAsyncClient.this.batchGetItem(batchGetItemRequest);
                    asyncHandler.onSuccess(batchGetItemRequest, batchGetItem);
                    return batchGetItem;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<BatchWriteItemResult> batchWriteItemAsync(final BatchWriteItemRequest batchWriteItemRequest, final AsyncHandler<BatchWriteItemRequest, BatchWriteItemResult> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<BatchWriteItemResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public BatchWriteItemResult call() throws Exception {
                try {
                    BatchWriteItemResult batchWriteItem = AmazonDynamoDBAsyncClient.this.batchWriteItem(batchWriteItemRequest);
                    asyncHandler.onSuccess(batchWriteItemRequest, batchWriteItem);
                    return batchWriteItem;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<CreateBackupResult> createBackupAsync(final CreateBackupRequest createBackupRequest, final AsyncHandler<CreateBackupRequest, CreateBackupResult> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<CreateBackupResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public CreateBackupResult call() throws Exception {
                try {
                    CreateBackupResult createBackup = AmazonDynamoDBAsyncClient.this.createBackup(createBackupRequest);
                    asyncHandler.onSuccess(createBackupRequest, createBackup);
                    return createBackup;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<CreateGlobalTableResult> createGlobalTableAsync(final CreateGlobalTableRequest createGlobalTableRequest, final AsyncHandler<CreateGlobalTableRequest, CreateGlobalTableResult> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<CreateGlobalTableResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public CreateGlobalTableResult call() throws Exception {
                try {
                    CreateGlobalTableResult createGlobalTable = AmazonDynamoDBAsyncClient.this.createGlobalTable(createGlobalTableRequest);
                    asyncHandler.onSuccess(createGlobalTableRequest, createGlobalTable);
                    return createGlobalTable;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<CreateTableResult> createTableAsync(final CreateTableRequest createTableRequest, final AsyncHandler<CreateTableRequest, CreateTableResult> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<CreateTableResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public CreateTableResult call() throws Exception {
                try {
                    CreateTableResult createTable = AmazonDynamoDBAsyncClient.this.createTable(createTableRequest);
                    asyncHandler.onSuccess(createTableRequest, createTable);
                    return createTable;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<DeleteBackupResult> deleteBackupAsync(final DeleteBackupRequest deleteBackupRequest, final AsyncHandler<DeleteBackupRequest, DeleteBackupResult> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<DeleteBackupResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public DeleteBackupResult call() throws Exception {
                try {
                    DeleteBackupResult deleteBackup = AmazonDynamoDBAsyncClient.this.deleteBackup(deleteBackupRequest);
                    asyncHandler.onSuccess(deleteBackupRequest, deleteBackup);
                    return deleteBackup;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<DeleteItemResult> deleteItemAsync(final DeleteItemRequest deleteItemRequest, final AsyncHandler<DeleteItemRequest, DeleteItemResult> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<DeleteItemResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.14
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public DeleteItemResult call() throws Exception {
                try {
                    DeleteItemResult deleteItem = AmazonDynamoDBAsyncClient.this.deleteItem(deleteItemRequest);
                    asyncHandler.onSuccess(deleteItemRequest, deleteItem);
                    return deleteItem;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<DeleteTableResult> deleteTableAsync(final DeleteTableRequest deleteTableRequest, final AsyncHandler<DeleteTableRequest, DeleteTableResult> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<DeleteTableResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.16
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public DeleteTableResult call() throws Exception {
                try {
                    DeleteTableResult deleteTable = AmazonDynamoDBAsyncClient.this.deleteTable(deleteTableRequest);
                    asyncHandler.onSuccess(deleteTableRequest, deleteTable);
                    return deleteTable;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<DescribeBackupResult> describeBackupAsync(final DescribeBackupRequest describeBackupRequest, final AsyncHandler<DescribeBackupRequest, DescribeBackupResult> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<DescribeBackupResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.18
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public DescribeBackupResult call() throws Exception {
                try {
                    DescribeBackupResult describeBackup = AmazonDynamoDBAsyncClient.this.describeBackup(describeBackupRequest);
                    asyncHandler.onSuccess(describeBackupRequest, describeBackup);
                    return describeBackup;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<DescribeContinuousBackupsResult> describeContinuousBackupsAsync(final DescribeContinuousBackupsRequest describeContinuousBackupsRequest, final AsyncHandler<DescribeContinuousBackupsRequest, DescribeContinuousBackupsResult> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<DescribeContinuousBackupsResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.20
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public DescribeContinuousBackupsResult call() throws Exception {
                try {
                    DescribeContinuousBackupsResult describeContinuousBackups = AmazonDynamoDBAsyncClient.this.describeContinuousBackups(describeContinuousBackupsRequest);
                    asyncHandler.onSuccess(describeContinuousBackupsRequest, describeContinuousBackups);
                    return describeContinuousBackups;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<DescribeEndpointsResult> describeEndpointsAsync(final DescribeEndpointsRequest describeEndpointsRequest, final AsyncHandler<DescribeEndpointsRequest, DescribeEndpointsResult> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<DescribeEndpointsResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.22
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public DescribeEndpointsResult call() throws Exception {
                try {
                    DescribeEndpointsResult describeEndpoints = AmazonDynamoDBAsyncClient.this.describeEndpoints(describeEndpointsRequest);
                    asyncHandler.onSuccess(describeEndpointsRequest, describeEndpoints);
                    return describeEndpoints;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<DescribeGlobalTableResult> describeGlobalTableAsync(final DescribeGlobalTableRequest describeGlobalTableRequest, final AsyncHandler<DescribeGlobalTableRequest, DescribeGlobalTableResult> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<DescribeGlobalTableResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.24
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public DescribeGlobalTableResult call() throws Exception {
                try {
                    DescribeGlobalTableResult describeGlobalTable = AmazonDynamoDBAsyncClient.this.describeGlobalTable(describeGlobalTableRequest);
                    asyncHandler.onSuccess(describeGlobalTableRequest, describeGlobalTable);
                    return describeGlobalTable;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<DescribeGlobalTableSettingsResult> describeGlobalTableSettingsAsync(final DescribeGlobalTableSettingsRequest describeGlobalTableSettingsRequest, final AsyncHandler<DescribeGlobalTableSettingsRequest, DescribeGlobalTableSettingsResult> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<DescribeGlobalTableSettingsResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.26
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public DescribeGlobalTableSettingsResult call() throws Exception {
                try {
                    DescribeGlobalTableSettingsResult describeGlobalTableSettings = AmazonDynamoDBAsyncClient.this.describeGlobalTableSettings(describeGlobalTableSettingsRequest);
                    asyncHandler.onSuccess(describeGlobalTableSettingsRequest, describeGlobalTableSettings);
                    return describeGlobalTableSettings;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<DescribeLimitsResult> describeLimitsAsync(final DescribeLimitsRequest describeLimitsRequest, final AsyncHandler<DescribeLimitsRequest, DescribeLimitsResult> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<DescribeLimitsResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.28
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public DescribeLimitsResult call() throws Exception {
                try {
                    DescribeLimitsResult describeLimits = AmazonDynamoDBAsyncClient.this.describeLimits(describeLimitsRequest);
                    asyncHandler.onSuccess(describeLimitsRequest, describeLimits);
                    return describeLimits;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<DescribeTableResult> describeTableAsync(final DescribeTableRequest describeTableRequest, final AsyncHandler<DescribeTableRequest, DescribeTableResult> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<DescribeTableResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.30
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public DescribeTableResult call() throws Exception {
                try {
                    DescribeTableResult describeTable = AmazonDynamoDBAsyncClient.this.describeTable(describeTableRequest);
                    asyncHandler.onSuccess(describeTableRequest, describeTable);
                    return describeTable;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<DescribeTimeToLiveResult> describeTimeToLiveAsync(final DescribeTimeToLiveRequest describeTimeToLiveRequest, final AsyncHandler<DescribeTimeToLiveRequest, DescribeTimeToLiveResult> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<DescribeTimeToLiveResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.32
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public DescribeTimeToLiveResult call() throws Exception {
                try {
                    DescribeTimeToLiveResult describeTimeToLive = AmazonDynamoDBAsyncClient.this.describeTimeToLive(describeTimeToLiveRequest);
                    asyncHandler.onSuccess(describeTimeToLiveRequest, describeTimeToLive);
                    return describeTimeToLive;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<GetItemResult> getItemAsync(final GetItemRequest getItemRequest, final AsyncHandler<GetItemRequest, GetItemResult> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<GetItemResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.34
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public GetItemResult call() throws Exception {
                try {
                    GetItemResult item = AmazonDynamoDBAsyncClient.this.getItem(getItemRequest);
                    asyncHandler.onSuccess(getItemRequest, item);
                    return item;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<ListBackupsResult> listBackupsAsync(final ListBackupsRequest listBackupsRequest, final AsyncHandler<ListBackupsRequest, ListBackupsResult> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<ListBackupsResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.36
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public ListBackupsResult call() throws Exception {
                try {
                    ListBackupsResult listBackups = AmazonDynamoDBAsyncClient.this.listBackups(listBackupsRequest);
                    asyncHandler.onSuccess(listBackupsRequest, listBackups);
                    return listBackups;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<ListGlobalTablesResult> listGlobalTablesAsync(final ListGlobalTablesRequest listGlobalTablesRequest, final AsyncHandler<ListGlobalTablesRequest, ListGlobalTablesResult> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<ListGlobalTablesResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.38
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public ListGlobalTablesResult call() throws Exception {
                try {
                    ListGlobalTablesResult listGlobalTables = AmazonDynamoDBAsyncClient.this.listGlobalTables(listGlobalTablesRequest);
                    asyncHandler.onSuccess(listGlobalTablesRequest, listGlobalTables);
                    return listGlobalTables;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<ListTablesResult> listTablesAsync(final ListTablesRequest listTablesRequest, final AsyncHandler<ListTablesRequest, ListTablesResult> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<ListTablesResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.40
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public ListTablesResult call() throws Exception {
                try {
                    ListTablesResult listTables = AmazonDynamoDBAsyncClient.this.listTables(listTablesRequest);
                    asyncHandler.onSuccess(listTablesRequest, listTables);
                    return listTables;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<ListTagsOfResourceResult> listTagsOfResourceAsync(final ListTagsOfResourceRequest listTagsOfResourceRequest, final AsyncHandler<ListTagsOfResourceRequest, ListTagsOfResourceResult> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<ListTagsOfResourceResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.42
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public ListTagsOfResourceResult call() throws Exception {
                try {
                    ListTagsOfResourceResult listTagsOfResource = AmazonDynamoDBAsyncClient.this.listTagsOfResource(listTagsOfResourceRequest);
                    asyncHandler.onSuccess(listTagsOfResourceRequest, listTagsOfResource);
                    return listTagsOfResource;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<PutItemResult> putItemAsync(final PutItemRequest putItemRequest, final AsyncHandler<PutItemRequest, PutItemResult> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<PutItemResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.44
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public PutItemResult call() throws Exception {
                try {
                    PutItemResult putItem = AmazonDynamoDBAsyncClient.this.putItem(putItemRequest);
                    asyncHandler.onSuccess(putItemRequest, putItem);
                    return putItem;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<QueryResult> queryAsync(final QueryRequest queryRequest, final AsyncHandler<QueryRequest, QueryResult> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<QueryResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.46
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public QueryResult call() throws Exception {
                try {
                    QueryResult query = AmazonDynamoDBAsyncClient.this.query(queryRequest);
                    asyncHandler.onSuccess(queryRequest, query);
                    return query;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<RestoreTableFromBackupResult> restoreTableFromBackupAsync(final RestoreTableFromBackupRequest restoreTableFromBackupRequest, final AsyncHandler<RestoreTableFromBackupRequest, RestoreTableFromBackupResult> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<RestoreTableFromBackupResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.48
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RestoreTableFromBackupResult call() throws Exception {
                try {
                    RestoreTableFromBackupResult restoreTableFromBackup = AmazonDynamoDBAsyncClient.this.restoreTableFromBackup(restoreTableFromBackupRequest);
                    asyncHandler.onSuccess(restoreTableFromBackupRequest, restoreTableFromBackup);
                    return restoreTableFromBackup;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<RestoreTableToPointInTimeResult> restoreTableToPointInTimeAsync(final RestoreTableToPointInTimeRequest restoreTableToPointInTimeRequest, final AsyncHandler<RestoreTableToPointInTimeRequest, RestoreTableToPointInTimeResult> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<RestoreTableToPointInTimeResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.50
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RestoreTableToPointInTimeResult call() throws Exception {
                try {
                    RestoreTableToPointInTimeResult restoreTableToPointInTime = AmazonDynamoDBAsyncClient.this.restoreTableToPointInTime(restoreTableToPointInTimeRequest);
                    asyncHandler.onSuccess(restoreTableToPointInTimeRequest, restoreTableToPointInTime);
                    return restoreTableToPointInTime;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<ScanResult> scanAsync(final ScanRequest scanRequest, final AsyncHandler<ScanRequest, ScanResult> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<ScanResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.52
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public ScanResult call() throws Exception {
                try {
                    ScanResult scan = AmazonDynamoDBAsyncClient.this.scan(scanRequest);
                    asyncHandler.onSuccess(scanRequest, scan);
                    return scan;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<Void> tagResourceAsync(final TagResourceRequest tagResourceRequest, final AsyncHandler<TagResourceRequest, Void> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<Void>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.54
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                try {
                    AmazonDynamoDBAsyncClient.this.tagResource(tagResourceRequest);
                    asyncHandler.onSuccess(tagResourceRequest, null);
                    return null;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<Void> untagResourceAsync(final UntagResourceRequest untagResourceRequest, final AsyncHandler<UntagResourceRequest, Void> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<Void>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.56
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                try {
                    AmazonDynamoDBAsyncClient.this.untagResource(untagResourceRequest);
                    asyncHandler.onSuccess(untagResourceRequest, null);
                    return null;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<UpdateContinuousBackupsResult> updateContinuousBackupsAsync(final UpdateContinuousBackupsRequest updateContinuousBackupsRequest, final AsyncHandler<UpdateContinuousBackupsRequest, UpdateContinuousBackupsResult> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<UpdateContinuousBackupsResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.58
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public UpdateContinuousBackupsResult call() throws Exception {
                try {
                    UpdateContinuousBackupsResult updateContinuousBackups = AmazonDynamoDBAsyncClient.this.updateContinuousBackups(updateContinuousBackupsRequest);
                    asyncHandler.onSuccess(updateContinuousBackupsRequest, updateContinuousBackups);
                    return updateContinuousBackups;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<UpdateGlobalTableResult> updateGlobalTableAsync(final UpdateGlobalTableRequest updateGlobalTableRequest, final AsyncHandler<UpdateGlobalTableRequest, UpdateGlobalTableResult> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<UpdateGlobalTableResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.60
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public UpdateGlobalTableResult call() throws Exception {
                try {
                    UpdateGlobalTableResult updateGlobalTable = AmazonDynamoDBAsyncClient.this.updateGlobalTable(updateGlobalTableRequest);
                    asyncHandler.onSuccess(updateGlobalTableRequest, updateGlobalTable);
                    return updateGlobalTable;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<UpdateGlobalTableSettingsResult> updateGlobalTableSettingsAsync(final UpdateGlobalTableSettingsRequest updateGlobalTableSettingsRequest, final AsyncHandler<UpdateGlobalTableSettingsRequest, UpdateGlobalTableSettingsResult> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<UpdateGlobalTableSettingsResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.62
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public UpdateGlobalTableSettingsResult call() throws Exception {
                try {
                    UpdateGlobalTableSettingsResult updateGlobalTableSettings = AmazonDynamoDBAsyncClient.this.updateGlobalTableSettings(updateGlobalTableSettingsRequest);
                    asyncHandler.onSuccess(updateGlobalTableSettingsRequest, updateGlobalTableSettings);
                    return updateGlobalTableSettings;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<UpdateItemResult> updateItemAsync(final UpdateItemRequest updateItemRequest, final AsyncHandler<UpdateItemRequest, UpdateItemResult> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<UpdateItemResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.64
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public UpdateItemResult call() throws Exception {
                try {
                    UpdateItemResult updateItem = AmazonDynamoDBAsyncClient.this.updateItem(updateItemRequest);
                    asyncHandler.onSuccess(updateItemRequest, updateItem);
                    return updateItem;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<UpdateTableResult> updateTableAsync(final UpdateTableRequest updateTableRequest, final AsyncHandler<UpdateTableRequest, UpdateTableResult> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<UpdateTableResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.66
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public UpdateTableResult call() throws Exception {
                try {
                    UpdateTableResult updateTable = AmazonDynamoDBAsyncClient.this.updateTable(updateTableRequest);
                    asyncHandler.onSuccess(updateTableRequest, updateTable);
                    return updateTable;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
    public Future<UpdateTimeToLiveResult> updateTimeToLiveAsync(final UpdateTimeToLiveRequest updateTimeToLiveRequest, final AsyncHandler<UpdateTimeToLiveRequest, UpdateTimeToLiveResult> asyncHandler) throws AmazonServiceException, AmazonClientException {
        return this.executorService.submit(new Callable<UpdateTimeToLiveResult>() { // from class: com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient.68
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public UpdateTimeToLiveResult call() throws Exception {
                try {
                    UpdateTimeToLiveResult updateTimeToLive = AmazonDynamoDBAsyncClient.this.updateTimeToLive(updateTimeToLiveRequest);
                    asyncHandler.onSuccess(updateTimeToLiveRequest, updateTimeToLive);
                    return updateTimeToLive;
                } catch (Exception e) {
                    asyncHandler.onError(e);
                    throw e;
                }
            }
        });
    }

    public AmazonDynamoDBAsyncClient(AWSCredentials aWSCredentials) {
        this(aWSCredentials, Executors.newFixedThreadPool(10));
    }

    public AmazonDynamoDBAsyncClient(AWSCredentials aWSCredentials, ExecutorService executorService) {
        super(aWSCredentials);
        this.executorService = executorService;
    }

    public AmazonDynamoDBAsyncClient(AWSCredentials aWSCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(aWSCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    public AmazonDynamoDBAsyncClient(AWSCredentialsProvider aWSCredentialsProvider) {
        this(aWSCredentialsProvider, Executors.newFixedThreadPool(10));
    }

    public AmazonDynamoDBAsyncClient(AWSCredentialsProvider aWSCredentialsProvider, ExecutorService executorService) {
        this(aWSCredentialsProvider, new ClientConfiguration(), executorService);
    }

    public AmazonDynamoDBAsyncClient(AWSCredentialsProvider aWSCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(aWSCredentialsProvider, clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    public AmazonDynamoDBAsyncClient(AWSCredentialsProvider aWSCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(aWSCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }
}
