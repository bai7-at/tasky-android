package com.amazonaws.services.dynamodbv2;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.http.HttpClient;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.http.JsonResponseHandler;
import com.amazonaws.http.UrlHttpClient;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.regions.ServiceAbbreviations;
import com.amazonaws.retry.PredefinedRetryPolicies;
import com.amazonaws.services.dynamodbv2.model.AttributeDefinition;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.AttributeValueUpdate;
import com.amazonaws.services.dynamodbv2.model.BatchGetItemRequest;
import com.amazonaws.services.dynamodbv2.model.BatchGetItemResult;
import com.amazonaws.services.dynamodbv2.model.BatchWriteItemRequest;
import com.amazonaws.services.dynamodbv2.model.BatchWriteItemResult;
import com.amazonaws.services.dynamodbv2.model.Condition;
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
import com.amazonaws.services.dynamodbv2.model.KeySchemaElement;
import com.amazonaws.services.dynamodbv2.model.KeysAndAttributes;
import com.amazonaws.services.dynamodbv2.model.ListBackupsRequest;
import com.amazonaws.services.dynamodbv2.model.ListBackupsResult;
import com.amazonaws.services.dynamodbv2.model.ListGlobalTablesRequest;
import com.amazonaws.services.dynamodbv2.model.ListGlobalTablesResult;
import com.amazonaws.services.dynamodbv2.model.ListTablesRequest;
import com.amazonaws.services.dynamodbv2.model.ListTablesResult;
import com.amazonaws.services.dynamodbv2.model.ListTagsOfResourceRequest;
import com.amazonaws.services.dynamodbv2.model.ListTagsOfResourceResult;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
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
import com.amazonaws.services.dynamodbv2.model.WriteRequest;
import com.amazonaws.services.dynamodbv2.model.transform.BackupInUseExceptionUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.BackupNotFoundExceptionUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.BatchGetItemRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.BatchGetItemResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.BatchWriteItemRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.BatchWriteItemResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.ConditionalCheckFailedExceptionUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.ContinuousBackupsUnavailableExceptionUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.CreateBackupRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.CreateBackupResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.CreateGlobalTableRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.CreateGlobalTableResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.CreateTableRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.CreateTableResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.DeleteBackupRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.DeleteBackupResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.DeleteItemRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.DeleteItemResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.DeleteTableRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.DeleteTableResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.DescribeBackupRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.DescribeBackupResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.DescribeContinuousBackupsRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.DescribeContinuousBackupsResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.DescribeEndpointsRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.DescribeEndpointsResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.DescribeGlobalTableRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.DescribeGlobalTableResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.DescribeGlobalTableSettingsRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.DescribeGlobalTableSettingsResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.DescribeLimitsRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.DescribeLimitsResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.DescribeTableRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.DescribeTableResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.DescribeTimeToLiveRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.DescribeTimeToLiveResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.GetItemRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.GetItemResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.GlobalTableAlreadyExistsExceptionUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.GlobalTableNotFoundExceptionUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.IndexNotFoundExceptionUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.InternalServerErrorExceptionUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.InvalidRestoreTimeExceptionUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.ItemCollectionSizeLimitExceededExceptionUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.LimitExceededExceptionUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.ListBackupsRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.ListBackupsResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.ListGlobalTablesRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.ListGlobalTablesResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.ListTablesRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.ListTablesResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.ListTagsOfResourceRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.ListTagsOfResourceResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.PointInTimeRecoveryUnavailableExceptionUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.ProvisionedThroughputExceededExceptionUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.PutItemRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.PutItemResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.QueryRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.QueryResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.ReplicaAlreadyExistsExceptionUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.ReplicaNotFoundExceptionUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.ResourceInUseExceptionUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.ResourceNotFoundExceptionUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.RestoreTableFromBackupRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.RestoreTableFromBackupResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.RestoreTableToPointInTimeRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.RestoreTableToPointInTimeResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.ScanRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.ScanResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.TableAlreadyExistsExceptionUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.TableInUseExceptionUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.TableNotFoundExceptionUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.TagResourceRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.UntagResourceRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.UpdateContinuousBackupsRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.UpdateContinuousBackupsResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.UpdateGlobalTableRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.UpdateGlobalTableResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.UpdateGlobalTableSettingsRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.UpdateGlobalTableSettingsResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.UpdateItemRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.UpdateItemResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.UpdateTableRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.UpdateTableResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.UpdateTimeToLiveRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.UpdateTimeToLiveResultJsonUnmarshaller;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.util.AWSRequestMetrics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class AmazonDynamoDBClient extends AmazonWebServiceClient implements AmazonDynamoDB {
    private AWSCredentialsProvider awsCredentialsProvider;
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    @Deprecated
    public AmazonDynamoDBClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration clientConfiguration) {
        ClientConfiguration clientConfiguration2 = new ClientConfiguration(clientConfiguration);
        if (clientConfiguration2.getRetryPolicy() == PredefinedRetryPolicies.DEFAULT) {
            clientConfiguration2.setRetryPolicy(PredefinedRetryPolicies.DYNAMODB_DEFAULT);
        }
        return clientConfiguration2;
    }

    private void init() {
        ArrayList arrayList = new ArrayList();
        this.jsonErrorUnmarshallers = arrayList;
        arrayList.add(new BackupInUseExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new BackupNotFoundExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new ConditionalCheckFailedExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new ContinuousBackupsUnavailableExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new GlobalTableAlreadyExistsExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new GlobalTableNotFoundExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new IndexNotFoundExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new InternalServerErrorExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new InvalidRestoreTimeExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new ItemCollectionSizeLimitExceededExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new PointInTimeRecoveryUnavailableExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new ProvisionedThroughputExceededExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new ReplicaAlreadyExistsExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new ReplicaNotFoundExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new ResourceInUseExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new TableAlreadyExistsExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new TableInUseExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new TableNotFoundExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());
        setEndpoint("dynamodb.us-east-1.amazonaws.com");
        this.endpointPrefix = ServiceAbbreviations.Dynamodb;
        HandlerChainFactory handlerChainFactory = new HandlerChainFactory();
        this.requestHandler2s.addAll(handlerChainFactory.newRequestHandlerChain("/com/amazonaws/services/dynamodbv2/request.handlers"));
        this.requestHandler2s.addAll(handlerChainFactory.newRequestHandler2Chain("/com/amazonaws/services/dynamodbv2/request.handler2s"));
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> httpResponseHandler, ExecutionContext executionContext) {
        request.setEndpoint(this.endpoint);
        request.setTimeOffset(this.timeOffset);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.CredentialsRequestTime;
        awsRequestMetrics.startEvent(field);
        try {
            AWSCredentials credentials = this.awsCredentialsProvider.getCredentials();
            awsRequestMetrics.endEvent(field);
            AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
            if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
                credentials = originalRequest.getRequestCredentials();
            }
            executionContext.setCredentials(credentials);
            return this.client.execute(request, httpResponseHandler, new JsonErrorResponseHandler(this.jsonErrorUnmarshallers), executionContext);
        } catch (Throwable th) {
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.CredentialsRequestTime);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public BatchGetItemResult batchGetItem(BatchGetItemRequest batchGetItemRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(batchGetItemRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<?> request = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<BatchGetItemRequest> marshall = new BatchGetItemRequestMarshaller().marshall(batchGetItemRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        Response<?> invoke = invoke(marshall, new JsonResponseHandler(new BatchGetItemResultJsonUnmarshaller()), createExecutionContext);
                        BatchGetItemResult batchGetItemResult = (BatchGetItemResult) invoke.getAwsResponse();
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, invoke, true);
                        return batchGetItemResult;
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                response = null;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = batchGetItemRequest;
            response = null;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public BatchWriteItemResult batchWriteItem(BatchWriteItemRequest batchWriteItemRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(batchWriteItemRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<?> request = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<BatchWriteItemRequest> marshall = new BatchWriteItemRequestMarshaller().marshall(batchWriteItemRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        Response<?> invoke = invoke(marshall, new JsonResponseHandler(new BatchWriteItemResultJsonUnmarshaller()), createExecutionContext);
                        BatchWriteItemResult batchWriteItemResult = (BatchWriteItemResult) invoke.getAwsResponse();
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, invoke, true);
                        return batchWriteItemResult;
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                response = null;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = batchWriteItemRequest;
            response = null;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public CreateBackupResult createBackup(CreateBackupRequest createBackupRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(createBackupRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<?> request = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<CreateBackupRequest> marshall = new CreateBackupRequestMarshaller().marshall(createBackupRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        Response<?> invoke = invoke(marshall, new JsonResponseHandler(new CreateBackupResultJsonUnmarshaller()), createExecutionContext);
                        CreateBackupResult createBackupResult = (CreateBackupResult) invoke.getAwsResponse();
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, invoke, true);
                        return createBackupResult;
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                response = null;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = createBackupRequest;
            response = null;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public CreateGlobalTableResult createGlobalTable(CreateGlobalTableRequest createGlobalTableRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(createGlobalTableRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<?> request = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<CreateGlobalTableRequest> marshall = new CreateGlobalTableRequestMarshaller().marshall(createGlobalTableRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        Response<?> invoke = invoke(marshall, new JsonResponseHandler(new CreateGlobalTableResultJsonUnmarshaller()), createExecutionContext);
                        CreateGlobalTableResult createGlobalTableResult = (CreateGlobalTableResult) invoke.getAwsResponse();
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, invoke, true);
                        return createGlobalTableResult;
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                response = null;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = createGlobalTableRequest;
            response = null;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public CreateTableResult createTable(CreateTableRequest createTableRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(createTableRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<?> request = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<CreateTableRequest> marshall = new CreateTableRequestMarshaller().marshall(createTableRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        Response<?> invoke = invoke(marshall, new JsonResponseHandler(new CreateTableResultJsonUnmarshaller()), createExecutionContext);
                        CreateTableResult createTableResult = (CreateTableResult) invoke.getAwsResponse();
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, invoke, true);
                        return createTableResult;
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                response = null;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = createTableRequest;
            response = null;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public DeleteBackupResult deleteBackup(DeleteBackupRequest deleteBackupRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(deleteBackupRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<?> request = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<DeleteBackupRequest> marshall = new DeleteBackupRequestMarshaller().marshall(deleteBackupRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        Response<?> invoke = invoke(marshall, new JsonResponseHandler(new DeleteBackupResultJsonUnmarshaller()), createExecutionContext);
                        DeleteBackupResult deleteBackupResult = (DeleteBackupResult) invoke.getAwsResponse();
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, invoke, true);
                        return deleteBackupResult;
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                response = null;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = deleteBackupRequest;
            response = null;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public DeleteItemResult deleteItem(DeleteItemRequest deleteItemRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(deleteItemRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<?> request = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<DeleteItemRequest> marshall = new DeleteItemRequestMarshaller().marshall(deleteItemRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        Response<?> invoke = invoke(marshall, new JsonResponseHandler(new DeleteItemResultJsonUnmarshaller()), createExecutionContext);
                        DeleteItemResult deleteItemResult = (DeleteItemResult) invoke.getAwsResponse();
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, invoke, true);
                        return deleteItemResult;
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                response = null;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = deleteItemRequest;
            response = null;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public DeleteTableResult deleteTable(DeleteTableRequest deleteTableRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(deleteTableRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<?> request = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<DeleteTableRequest> marshall = new DeleteTableRequestMarshaller().marshall(deleteTableRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        Response<?> invoke = invoke(marshall, new JsonResponseHandler(new DeleteTableResultJsonUnmarshaller()), createExecutionContext);
                        DeleteTableResult deleteTableResult = (DeleteTableResult) invoke.getAwsResponse();
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, invoke, true);
                        return deleteTableResult;
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                response = null;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = deleteTableRequest;
            response = null;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public DescribeBackupResult describeBackup(DescribeBackupRequest describeBackupRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(describeBackupRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<?> request = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<DescribeBackupRequest> marshall = new DescribeBackupRequestMarshaller().marshall(describeBackupRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        Response<?> invoke = invoke(marshall, new JsonResponseHandler(new DescribeBackupResultJsonUnmarshaller()), createExecutionContext);
                        DescribeBackupResult describeBackupResult = (DescribeBackupResult) invoke.getAwsResponse();
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, invoke, true);
                        return describeBackupResult;
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                response = null;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = describeBackupRequest;
            response = null;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public DescribeContinuousBackupsResult describeContinuousBackups(DescribeContinuousBackupsRequest describeContinuousBackupsRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(describeContinuousBackupsRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<?> request = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<DescribeContinuousBackupsRequest> marshall = new DescribeContinuousBackupsRequestMarshaller().marshall(describeContinuousBackupsRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        Response<?> invoke = invoke(marshall, new JsonResponseHandler(new DescribeContinuousBackupsResultJsonUnmarshaller()), createExecutionContext);
                        DescribeContinuousBackupsResult describeContinuousBackupsResult = (DescribeContinuousBackupsResult) invoke.getAwsResponse();
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, invoke, true);
                        return describeContinuousBackupsResult;
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                response = null;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = describeContinuousBackupsRequest;
            response = null;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public DescribeEndpointsResult describeEndpoints(DescribeEndpointsRequest describeEndpointsRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(describeEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<?> request = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<DescribeEndpointsRequest> marshall = new DescribeEndpointsRequestMarshaller().marshall(describeEndpointsRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        Response<?> invoke = invoke(marshall, new JsonResponseHandler(new DescribeEndpointsResultJsonUnmarshaller()), createExecutionContext);
                        DescribeEndpointsResult describeEndpointsResult = (DescribeEndpointsResult) invoke.getAwsResponse();
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, invoke, true);
                        return describeEndpointsResult;
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                response = null;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = describeEndpointsRequest;
            response = null;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public DescribeGlobalTableResult describeGlobalTable(DescribeGlobalTableRequest describeGlobalTableRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(describeGlobalTableRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<?> request = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<DescribeGlobalTableRequest> marshall = new DescribeGlobalTableRequestMarshaller().marshall(describeGlobalTableRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        Response<?> invoke = invoke(marshall, new JsonResponseHandler(new DescribeGlobalTableResultJsonUnmarshaller()), createExecutionContext);
                        DescribeGlobalTableResult describeGlobalTableResult = (DescribeGlobalTableResult) invoke.getAwsResponse();
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, invoke, true);
                        return describeGlobalTableResult;
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                response = null;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = describeGlobalTableRequest;
            response = null;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public DescribeGlobalTableSettingsResult describeGlobalTableSettings(DescribeGlobalTableSettingsRequest describeGlobalTableSettingsRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(describeGlobalTableSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<?> request = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<DescribeGlobalTableSettingsRequest> marshall = new DescribeGlobalTableSettingsRequestMarshaller().marshall(describeGlobalTableSettingsRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        Response<?> invoke = invoke(marshall, new JsonResponseHandler(new DescribeGlobalTableSettingsResultJsonUnmarshaller()), createExecutionContext);
                        DescribeGlobalTableSettingsResult describeGlobalTableSettingsResult = (DescribeGlobalTableSettingsResult) invoke.getAwsResponse();
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, invoke, true);
                        return describeGlobalTableSettingsResult;
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                response = null;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = describeGlobalTableSettingsRequest;
            response = null;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public DescribeLimitsResult describeLimits(DescribeLimitsRequest describeLimitsRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(describeLimitsRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<?> request = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<DescribeLimitsRequest> marshall = new DescribeLimitsRequestMarshaller().marshall(describeLimitsRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        Response<?> invoke = invoke(marshall, new JsonResponseHandler(new DescribeLimitsResultJsonUnmarshaller()), createExecutionContext);
                        DescribeLimitsResult describeLimitsResult = (DescribeLimitsResult) invoke.getAwsResponse();
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, invoke, true);
                        return describeLimitsResult;
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                response = null;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = describeLimitsRequest;
            response = null;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public DescribeTableResult describeTable(DescribeTableRequest describeTableRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(describeTableRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<?> request = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<DescribeTableRequest> marshall = new DescribeTableRequestMarshaller().marshall(describeTableRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        Response<?> invoke = invoke(marshall, new JsonResponseHandler(new DescribeTableResultJsonUnmarshaller()), createExecutionContext);
                        DescribeTableResult describeTableResult = (DescribeTableResult) invoke.getAwsResponse();
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, invoke, true);
                        return describeTableResult;
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                response = null;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = describeTableRequest;
            response = null;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public DescribeTimeToLiveResult describeTimeToLive(DescribeTimeToLiveRequest describeTimeToLiveRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(describeTimeToLiveRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<?> request = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<DescribeTimeToLiveRequest> marshall = new DescribeTimeToLiveRequestMarshaller().marshall(describeTimeToLiveRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        Response<?> invoke = invoke(marshall, new JsonResponseHandler(new DescribeTimeToLiveResultJsonUnmarshaller()), createExecutionContext);
                        DescribeTimeToLiveResult describeTimeToLiveResult = (DescribeTimeToLiveResult) invoke.getAwsResponse();
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, invoke, true);
                        return describeTimeToLiveResult;
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                response = null;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = describeTimeToLiveRequest;
            response = null;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, true);
            throw th;
        }
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    @Deprecated
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest amazonWebServiceRequest) {
        return this.client.getResponseMetadataForRequest(amazonWebServiceRequest);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public GetItemResult getItem(GetItemRequest getItemRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(getItemRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<?> request = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<GetItemRequest> marshall = new GetItemRequestMarshaller().marshall(getItemRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        Response<?> invoke = invoke(marshall, new JsonResponseHandler(new GetItemResultJsonUnmarshaller()), createExecutionContext);
                        GetItemResult getItemResult = (GetItemResult) invoke.getAwsResponse();
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, invoke, true);
                        return getItemResult;
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                response = null;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = getItemRequest;
            response = null;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public ListBackupsResult listBackups(ListBackupsRequest listBackupsRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(listBackupsRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<?> request = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<ListBackupsRequest> marshall = new ListBackupsRequestMarshaller().marshall(listBackupsRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        Response<?> invoke = invoke(marshall, new JsonResponseHandler(new ListBackupsResultJsonUnmarshaller()), createExecutionContext);
                        ListBackupsResult listBackupsResult = (ListBackupsResult) invoke.getAwsResponse();
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, invoke, true);
                        return listBackupsResult;
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                response = null;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = listBackupsRequest;
            response = null;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public ListGlobalTablesResult listGlobalTables(ListGlobalTablesRequest listGlobalTablesRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(listGlobalTablesRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<?> request = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<ListGlobalTablesRequest> marshall = new ListGlobalTablesRequestMarshaller().marshall(listGlobalTablesRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        Response<?> invoke = invoke(marshall, new JsonResponseHandler(new ListGlobalTablesResultJsonUnmarshaller()), createExecutionContext);
                        ListGlobalTablesResult listGlobalTablesResult = (ListGlobalTablesResult) invoke.getAwsResponse();
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, invoke, true);
                        return listGlobalTablesResult;
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                response = null;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = listGlobalTablesRequest;
            response = null;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public ListTablesResult listTables(ListTablesRequest listTablesRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(listTablesRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<?> request = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<ListTablesRequest> marshall = new ListTablesRequestMarshaller().marshall(listTablesRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        Response<?> invoke = invoke(marshall, new JsonResponseHandler(new ListTablesResultJsonUnmarshaller()), createExecutionContext);
                        ListTablesResult listTablesResult = (ListTablesResult) invoke.getAwsResponse();
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, invoke, true);
                        return listTablesResult;
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                response = null;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = listTablesRequest;
            response = null;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public ListTagsOfResourceResult listTagsOfResource(ListTagsOfResourceRequest listTagsOfResourceRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(listTagsOfResourceRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<?> request = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<ListTagsOfResourceRequest> marshall = new ListTagsOfResourceRequestMarshaller().marshall(listTagsOfResourceRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        Response<?> invoke = invoke(marshall, new JsonResponseHandler(new ListTagsOfResourceResultJsonUnmarshaller()), createExecutionContext);
                        ListTagsOfResourceResult listTagsOfResourceResult = (ListTagsOfResourceResult) invoke.getAwsResponse();
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, invoke, true);
                        return listTagsOfResourceResult;
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                response = null;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = listTagsOfResourceRequest;
            response = null;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public PutItemResult putItem(PutItemRequest putItemRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(putItemRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<?> request = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<PutItemRequest> marshall = new PutItemRequestMarshaller().marshall(putItemRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        Response<?> invoke = invoke(marshall, new JsonResponseHandler(new PutItemResultJsonUnmarshaller()), createExecutionContext);
                        PutItemResult putItemResult = (PutItemResult) invoke.getAwsResponse();
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, invoke, true);
                        return putItemResult;
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                response = null;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = putItemRequest;
            response = null;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public QueryResult query(QueryRequest queryRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(queryRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<?> request = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<QueryRequest> marshall = new QueryRequestMarshaller().marshall(queryRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        Response<?> invoke = invoke(marshall, new JsonResponseHandler(new QueryResultJsonUnmarshaller()), createExecutionContext);
                        QueryResult queryResult = (QueryResult) invoke.getAwsResponse();
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, invoke, true);
                        return queryResult;
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                response = null;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = queryRequest;
            response = null;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public RestoreTableFromBackupResult restoreTableFromBackup(RestoreTableFromBackupRequest restoreTableFromBackupRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(restoreTableFromBackupRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<?> request = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<RestoreTableFromBackupRequest> marshall = new RestoreTableFromBackupRequestMarshaller().marshall(restoreTableFromBackupRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        Response<?> invoke = invoke(marshall, new JsonResponseHandler(new RestoreTableFromBackupResultJsonUnmarshaller()), createExecutionContext);
                        RestoreTableFromBackupResult restoreTableFromBackupResult = (RestoreTableFromBackupResult) invoke.getAwsResponse();
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, invoke, true);
                        return restoreTableFromBackupResult;
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                response = null;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = restoreTableFromBackupRequest;
            response = null;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public RestoreTableToPointInTimeResult restoreTableToPointInTime(RestoreTableToPointInTimeRequest restoreTableToPointInTimeRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(restoreTableToPointInTimeRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<?> request = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<RestoreTableToPointInTimeRequest> marshall = new RestoreTableToPointInTimeRequestMarshaller().marshall(restoreTableToPointInTimeRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        Response<?> invoke = invoke(marshall, new JsonResponseHandler(new RestoreTableToPointInTimeResultJsonUnmarshaller()), createExecutionContext);
                        RestoreTableToPointInTimeResult restoreTableToPointInTimeResult = (RestoreTableToPointInTimeResult) invoke.getAwsResponse();
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, invoke, true);
                        return restoreTableToPointInTimeResult;
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                response = null;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = restoreTableToPointInTimeRequest;
            response = null;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public ScanResult scan(ScanRequest scanRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(scanRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<?> request = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<ScanRequest> marshall = new ScanRequestMarshaller().marshall(scanRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        Response<?> invoke = invoke(marshall, new JsonResponseHandler(new ScanResultJsonUnmarshaller()), createExecutionContext);
                        ScanResult scanResult = (ScanResult) invoke.getAwsResponse();
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, invoke, true);
                        return scanResult;
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                response = null;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = scanRequest;
            response = null;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.amazonaws.AmazonWebServiceClient, com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.amazonaws.AmazonWebServiceRequest, com.amazonaws.services.dynamodbv2.model.TagResourceRequest] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.amazonaws.Request] */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public void tagResource(TagResourceRequest tagResourceRequest) throws AmazonServiceException, AmazonClientException {
        ExecutionContext createExecutionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<TagResourceRequest> marshall = new TagResourceRequestMarshaller().marshall((TagResourceRequest) tagResourceRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        invoke(marshall, new JsonResponseHandler(null), createExecutionContext);
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, null, true);
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, tagResourceRequest, null, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            tagResourceRequest = 0;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, tagResourceRequest, null, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.amazonaws.AmazonWebServiceClient, com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.amazonaws.AmazonWebServiceRequest, com.amazonaws.services.dynamodbv2.model.UntagResourceRequest] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.amazonaws.Request] */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public void untagResource(UntagResourceRequest untagResourceRequest) throws AmazonServiceException, AmazonClientException {
        ExecutionContext createExecutionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<UntagResourceRequest> marshall = new UntagResourceRequestMarshaller().marshall((UntagResourceRequest) untagResourceRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        invoke(marshall, new JsonResponseHandler(null), createExecutionContext);
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, null, true);
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, untagResourceRequest, null, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            untagResourceRequest = 0;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, untagResourceRequest, null, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public UpdateContinuousBackupsResult updateContinuousBackups(UpdateContinuousBackupsRequest updateContinuousBackupsRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(updateContinuousBackupsRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<?> request = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<UpdateContinuousBackupsRequest> marshall = new UpdateContinuousBackupsRequestMarshaller().marshall(updateContinuousBackupsRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        Response<?> invoke = invoke(marshall, new JsonResponseHandler(new UpdateContinuousBackupsResultJsonUnmarshaller()), createExecutionContext);
                        UpdateContinuousBackupsResult updateContinuousBackupsResult = (UpdateContinuousBackupsResult) invoke.getAwsResponse();
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, invoke, true);
                        return updateContinuousBackupsResult;
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                response = null;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = updateContinuousBackupsRequest;
            response = null;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public UpdateGlobalTableResult updateGlobalTable(UpdateGlobalTableRequest updateGlobalTableRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(updateGlobalTableRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<?> request = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<UpdateGlobalTableRequest> marshall = new UpdateGlobalTableRequestMarshaller().marshall(updateGlobalTableRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        Response<?> invoke = invoke(marshall, new JsonResponseHandler(new UpdateGlobalTableResultJsonUnmarshaller()), createExecutionContext);
                        UpdateGlobalTableResult updateGlobalTableResult = (UpdateGlobalTableResult) invoke.getAwsResponse();
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, invoke, true);
                        return updateGlobalTableResult;
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                response = null;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = updateGlobalTableRequest;
            response = null;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public UpdateGlobalTableSettingsResult updateGlobalTableSettings(UpdateGlobalTableSettingsRequest updateGlobalTableSettingsRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(updateGlobalTableSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<?> request = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<UpdateGlobalTableSettingsRequest> marshall = new UpdateGlobalTableSettingsRequestMarshaller().marshall(updateGlobalTableSettingsRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        Response<?> invoke = invoke(marshall, new JsonResponseHandler(new UpdateGlobalTableSettingsResultJsonUnmarshaller()), createExecutionContext);
                        UpdateGlobalTableSettingsResult updateGlobalTableSettingsResult = (UpdateGlobalTableSettingsResult) invoke.getAwsResponse();
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, invoke, true);
                        return updateGlobalTableSettingsResult;
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                response = null;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = updateGlobalTableSettingsRequest;
            response = null;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public UpdateItemResult updateItem(UpdateItemRequest updateItemRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(updateItemRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<?> request = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<UpdateItemRequest> marshall = new UpdateItemRequestMarshaller().marshall(updateItemRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        Response<?> invoke = invoke(marshall, new JsonResponseHandler(new UpdateItemResultJsonUnmarshaller()), createExecutionContext);
                        UpdateItemResult updateItemResult = (UpdateItemResult) invoke.getAwsResponse();
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, invoke, true);
                        return updateItemResult;
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                response = null;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = updateItemRequest;
            response = null;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public UpdateTableResult updateTable(UpdateTableRequest updateTableRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(updateTableRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<?> request = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<UpdateTableRequest> marshall = new UpdateTableRequestMarshaller().marshall(updateTableRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        Response<?> invoke = invoke(marshall, new JsonResponseHandler(new UpdateTableResultJsonUnmarshaller()), createExecutionContext);
                        UpdateTableResult updateTableResult = (UpdateTableResult) invoke.getAwsResponse();
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, invoke, true);
                        return updateTableResult;
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                response = null;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = updateTableRequest;
            response = null;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public UpdateTimeToLiveResult updateTimeToLive(UpdateTimeToLiveRequest updateTimeToLiveRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(updateTimeToLiveRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<?> request = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                awsRequestMetrics.startEvent(field2);
                try {
                    Request<UpdateTimeToLiveRequest> marshall = new UpdateTimeToLiveRequestMarshaller().marshall(updateTimeToLiveRequest);
                    try {
                        marshall.setAWSRequestMetrics(awsRequestMetrics);
                        awsRequestMetrics.endEvent(field2);
                        Response<?> invoke = invoke(marshall, new JsonResponseHandler(new UpdateTimeToLiveResultJsonUnmarshaller()), createExecutionContext);
                        UpdateTimeToLiveResult updateTimeToLiveResult = (UpdateTimeToLiveResult) invoke.getAwsResponse();
                        awsRequestMetrics.endEvent(field);
                        endClientExecution(awsRequestMetrics, marshall, invoke, true);
                        return updateTimeToLiveResult;
                    } catch (Throwable th) {
                        th = th;
                        awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                response = null;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = updateTimeToLiveRequest;
            response = null;
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, true);
            throw th;
        }
    }

    @Deprecated
    public AmazonDynamoDBClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    public AmazonDynamoDBClient(AWSCredentials aWSCredentials) {
        this(aWSCredentials, new ClientConfiguration());
    }

    public AmazonDynamoDBClient(AWSCredentials aWSCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(aWSCredentials), clientConfiguration);
    }

    public AmazonDynamoDBClient(AWSCredentialsProvider aWSCredentialsProvider) {
        this(aWSCredentialsProvider, new ClientConfiguration());
    }

    public AmazonDynamoDBClient(AWSCredentialsProvider aWSCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(aWSCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    @Deprecated
    public AmazonDynamoDBClient(AWSCredentialsProvider aWSCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);
        this.awsCredentialsProvider = aWSCredentialsProvider;
        init();
    }

    public AmazonDynamoDBClient(AWSCredentialsProvider aWSCredentialsProvider, ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);
        this.awsCredentialsProvider = aWSCredentialsProvider;
        init();
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public BatchGetItemResult batchGetItem(Map<String, KeysAndAttributes> map, String str) throws AmazonServiceException, AmazonClientException {
        BatchGetItemRequest batchGetItemRequest = new BatchGetItemRequest();
        batchGetItemRequest.setRequestItems(map);
        batchGetItemRequest.setReturnConsumedCapacity(str);
        return batchGetItem(batchGetItemRequest);
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public BatchWriteItemResult batchWriteItem(Map<String, List<WriteRequest>> map) throws AmazonServiceException, AmazonClientException {
        BatchWriteItemRequest batchWriteItemRequest = new BatchWriteItemRequest();
        batchWriteItemRequest.setRequestItems(map);
        return batchWriteItem(batchWriteItemRequest);
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public CreateTableResult createTable(List<AttributeDefinition> list, String str, List<KeySchemaElement> list2, ProvisionedThroughput provisionedThroughput) throws AmazonServiceException, AmazonClientException {
        CreateTableRequest createTableRequest = new CreateTableRequest();
        createTableRequest.setAttributeDefinitions(list);
        createTableRequest.setTableName(str);
        createTableRequest.setKeySchema(list2);
        createTableRequest.setProvisionedThroughput(provisionedThroughput);
        return createTable(createTableRequest);
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public DeleteItemResult deleteItem(String str, Map<String, AttributeValue> map) throws AmazonServiceException, AmazonClientException {
        DeleteItemRequest deleteItemRequest = new DeleteItemRequest();
        deleteItemRequest.setTableName(str);
        deleteItemRequest.setKey(map);
        return deleteItem(deleteItemRequest);
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public DeleteTableResult deleteTable(String str) throws AmazonServiceException, AmazonClientException {
        DeleteTableRequest deleteTableRequest = new DeleteTableRequest();
        deleteTableRequest.setTableName(str);
        return deleteTable(deleteTableRequest);
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public DescribeTableResult describeTable(String str) throws AmazonServiceException, AmazonClientException {
        DescribeTableRequest describeTableRequest = new DescribeTableRequest();
        describeTableRequest.setTableName(str);
        return describeTable(describeTableRequest);
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public GetItemResult getItem(String str, Map<String, AttributeValue> map) throws AmazonServiceException, AmazonClientException {
        GetItemRequest getItemRequest = new GetItemRequest();
        getItemRequest.setTableName(str);
        getItemRequest.setKey(map);
        return getItem(getItemRequest);
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public ListTablesResult listTables() throws AmazonServiceException, AmazonClientException {
        return listTables(new ListTablesRequest());
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public PutItemResult putItem(String str, Map<String, AttributeValue> map) throws AmazonServiceException, AmazonClientException {
        PutItemRequest putItemRequest = new PutItemRequest();
        putItemRequest.setTableName(str);
        putItemRequest.setItem(map);
        return putItem(putItemRequest);
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public ScanResult scan(String str, List<String> list) throws AmazonServiceException, AmazonClientException {
        ScanRequest scanRequest = new ScanRequest();
        scanRequest.setTableName(str);
        scanRequest.setAttributesToGet(list);
        return scan(scanRequest);
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public UpdateItemResult updateItem(String str, Map<String, AttributeValue> map, Map<String, AttributeValueUpdate> map2) throws AmazonServiceException, AmazonClientException {
        UpdateItemRequest updateItemRequest = new UpdateItemRequest();
        updateItemRequest.setTableName(str);
        updateItemRequest.setKey(map);
        updateItemRequest.setAttributeUpdates(map2);
        return updateItem(updateItemRequest);
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public UpdateTableResult updateTable(String str, ProvisionedThroughput provisionedThroughput) throws AmazonServiceException, AmazonClientException {
        UpdateTableRequest updateTableRequest = new UpdateTableRequest();
        updateTableRequest.setTableName(str);
        updateTableRequest.setProvisionedThroughput(provisionedThroughput);
        return updateTable(updateTableRequest);
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public ListTablesResult listTables(String str) throws AmazonServiceException, AmazonClientException {
        ListTablesRequest listTablesRequest = new ListTablesRequest();
        listTablesRequest.setExclusiveStartTableName(str);
        return listTables(listTablesRequest);
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public BatchGetItemResult batchGetItem(Map<String, KeysAndAttributes> map) throws AmazonServiceException, AmazonClientException {
        BatchGetItemRequest batchGetItemRequest = new BatchGetItemRequest();
        batchGetItemRequest.setRequestItems(map);
        return batchGetItem(batchGetItemRequest);
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public DeleteItemResult deleteItem(String str, Map<String, AttributeValue> map, String str2) throws AmazonServiceException, AmazonClientException {
        DeleteItemRequest deleteItemRequest = new DeleteItemRequest();
        deleteItemRequest.setTableName(str);
        deleteItemRequest.setKey(map);
        deleteItemRequest.setReturnValues(str2);
        return deleteItem(deleteItemRequest);
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public GetItemResult getItem(String str, Map<String, AttributeValue> map, Boolean bool) throws AmazonServiceException, AmazonClientException {
        GetItemRequest getItemRequest = new GetItemRequest();
        getItemRequest.setTableName(str);
        getItemRequest.setKey(map);
        getItemRequest.setConsistentRead(bool);
        return getItem(getItemRequest);
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public PutItemResult putItem(String str, Map<String, AttributeValue> map, String str2) throws AmazonServiceException, AmazonClientException {
        PutItemRequest putItemRequest = new PutItemRequest();
        putItemRequest.setTableName(str);
        putItemRequest.setItem(map);
        putItemRequest.setReturnValues(str2);
        return putItem(putItemRequest);
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public ScanResult scan(String str, Map<String, Condition> map) throws AmazonServiceException, AmazonClientException {
        ScanRequest scanRequest = new ScanRequest();
        scanRequest.setTableName(str);
        scanRequest.setScanFilter(map);
        return scan(scanRequest);
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public ListTablesResult listTables(String str, Integer num) throws AmazonServiceException, AmazonClientException {
        ListTablesRequest listTablesRequest = new ListTablesRequest();
        listTablesRequest.setExclusiveStartTableName(str);
        listTablesRequest.setLimit(num);
        return listTables(listTablesRequest);
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public UpdateItemResult updateItem(String str, Map<String, AttributeValue> map, Map<String, AttributeValueUpdate> map2, String str2) throws AmazonServiceException, AmazonClientException {
        UpdateItemRequest updateItemRequest = new UpdateItemRequest();
        updateItemRequest.setTableName(str);
        updateItemRequest.setKey(map);
        updateItemRequest.setAttributeUpdates(map2);
        updateItemRequest.setReturnValues(str2);
        return updateItem(updateItemRequest);
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public ScanResult scan(String str, List<String> list, Map<String, Condition> map) throws AmazonServiceException, AmazonClientException {
        ScanRequest scanRequest = new ScanRequest();
        scanRequest.setTableName(str);
        scanRequest.setAttributesToGet(list);
        scanRequest.setScanFilter(map);
        return scan(scanRequest);
    }

    @Override // com.amazonaws.services.dynamodbv2.AmazonDynamoDB
    public ListTablesResult listTables(Integer num) throws AmazonServiceException, AmazonClientException {
        ListTablesRequest listTablesRequest = new ListTablesRequest();
        listTablesRequest.setLimit(num);
        return listTables(listTablesRequest);
    }
}
