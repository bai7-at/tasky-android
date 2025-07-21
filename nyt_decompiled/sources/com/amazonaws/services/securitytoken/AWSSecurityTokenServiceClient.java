package com.amazonaws.services.securitytoken;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.http.DefaultErrorResponseHandler;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.http.HttpClient;
import com.amazonaws.http.StaxResponseHandler;
import com.amazonaws.http.UrlHttpClient;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.regions.ServiceAbbreviations;
import com.amazonaws.services.securitytoken.model.AssumeRoleRequest;
import com.amazonaws.services.securitytoken.model.AssumeRoleResult;
import com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLRequest;
import com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLResult;
import com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest;
import com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityResult;
import com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageRequest;
import com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageResult;
import com.amazonaws.services.securitytoken.model.GetAccessKeyInfoRequest;
import com.amazonaws.services.securitytoken.model.GetAccessKeyInfoResult;
import com.amazonaws.services.securitytoken.model.GetCallerIdentityRequest;
import com.amazonaws.services.securitytoken.model.GetCallerIdentityResult;
import com.amazonaws.services.securitytoken.model.GetFederationTokenRequest;
import com.amazonaws.services.securitytoken.model.GetFederationTokenResult;
import com.amazonaws.services.securitytoken.model.GetSessionTokenRequest;
import com.amazonaws.services.securitytoken.model.GetSessionTokenResult;
import com.amazonaws.services.securitytoken.model.transform.AssumeRoleRequestMarshaller;
import com.amazonaws.services.securitytoken.model.transform.AssumeRoleResultStaxUnmarshaller;
import com.amazonaws.services.securitytoken.model.transform.AssumeRoleWithSAMLRequestMarshaller;
import com.amazonaws.services.securitytoken.model.transform.AssumeRoleWithSAMLResultStaxUnmarshaller;
import com.amazonaws.services.securitytoken.model.transform.AssumeRoleWithWebIdentityRequestMarshaller;
import com.amazonaws.services.securitytoken.model.transform.AssumeRoleWithWebIdentityResultStaxUnmarshaller;
import com.amazonaws.services.securitytoken.model.transform.DecodeAuthorizationMessageRequestMarshaller;
import com.amazonaws.services.securitytoken.model.transform.DecodeAuthorizationMessageResultStaxUnmarshaller;
import com.amazonaws.services.securitytoken.model.transform.ExpiredTokenExceptionUnmarshaller;
import com.amazonaws.services.securitytoken.model.transform.GetAccessKeyInfoRequestMarshaller;
import com.amazonaws.services.securitytoken.model.transform.GetAccessKeyInfoResultStaxUnmarshaller;
import com.amazonaws.services.securitytoken.model.transform.GetCallerIdentityRequestMarshaller;
import com.amazonaws.services.securitytoken.model.transform.GetCallerIdentityResultStaxUnmarshaller;
import com.amazonaws.services.securitytoken.model.transform.GetFederationTokenRequestMarshaller;
import com.amazonaws.services.securitytoken.model.transform.GetFederationTokenResultStaxUnmarshaller;
import com.amazonaws.services.securitytoken.model.transform.GetSessionTokenRequestMarshaller;
import com.amazonaws.services.securitytoken.model.transform.GetSessionTokenResultStaxUnmarshaller;
import com.amazonaws.services.securitytoken.model.transform.IDPCommunicationErrorExceptionUnmarshaller;
import com.amazonaws.services.securitytoken.model.transform.IDPRejectedClaimExceptionUnmarshaller;
import com.amazonaws.services.securitytoken.model.transform.InvalidAuthorizationMessageExceptionUnmarshaller;
import com.amazonaws.services.securitytoken.model.transform.InvalidIdentityTokenExceptionUnmarshaller;
import com.amazonaws.services.securitytoken.model.transform.MalformedPolicyDocumentExceptionUnmarshaller;
import com.amazonaws.services.securitytoken.model.transform.PackedPolicyTooLargeExceptionUnmarshaller;
import com.amazonaws.services.securitytoken.model.transform.RegionDisabledExceptionUnmarshaller;
import com.amazonaws.transform.StandardErrorUnmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.AWSRequestMetrics;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Node;

/* loaded from: classes2.dex */
public class AWSSecurityTokenServiceClient extends AmazonWebServiceClient implements AWSSecurityTokenService {
    private AWSCredentialsProvider awsCredentialsProvider;
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers;

    @Deprecated
    public AWSSecurityTokenServiceClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration clientConfiguration) {
        return clientConfiguration;
    }

    private void init() {
        this.exceptionUnmarshallers.add(new ExpiredTokenExceptionUnmarshaller());
        this.exceptionUnmarshallers.add(new IDPCommunicationErrorExceptionUnmarshaller());
        this.exceptionUnmarshallers.add(new IDPRejectedClaimExceptionUnmarshaller());
        this.exceptionUnmarshallers.add(new InvalidAuthorizationMessageExceptionUnmarshaller());
        this.exceptionUnmarshallers.add(new InvalidIdentityTokenExceptionUnmarshaller());
        this.exceptionUnmarshallers.add(new MalformedPolicyDocumentExceptionUnmarshaller());
        this.exceptionUnmarshallers.add(new PackedPolicyTooLargeExceptionUnmarshaller());
        this.exceptionUnmarshallers.add(new RegionDisabledExceptionUnmarshaller());
        this.exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        setEndpoint("sts.amazonaws.com");
        this.endpointPrefix = ServiceAbbreviations.STS;
        HandlerChainFactory handlerChainFactory = new HandlerChainFactory();
        this.requestHandler2s.addAll(handlerChainFactory.newRequestHandlerChain("/com/amazonaws/services/securitytoken/request.handlers"));
        this.requestHandler2s.addAll(handlerChainFactory.newRequestHandler2Chain("/com/amazonaws/services/securitytoken/request.handler2s"));
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, Unmarshaller<X, StaxUnmarshallerContext> unmarshaller, ExecutionContext executionContext) {
        request.setEndpoint(this.endpoint);
        request.setTimeOffset(this.timeOffset);
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        AWSCredentials credentials = this.awsCredentialsProvider.getCredentials();
        if (originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }
        executionContext.setCredentials(credentials);
        return this.client.execute(request, new StaxResponseHandler(unmarshaller), new DefaultErrorResponseHandler(this.exceptionUnmarshallers), executionContext);
    }

    @Override // com.amazonaws.services.securitytoken.AWSSecurityTokenService
    public AssumeRoleResult assumeRole(AssumeRoleRequest assumeRoleRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(assumeRoleRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<AssumeRoleRequest> request = null;
        Response<?> response2 = null;
        try {
            Request<AssumeRoleRequest> marshall = new AssumeRoleRequestMarshaller().marshall(assumeRoleRequest);
            try {
                marshall.setAWSRequestMetrics(awsRequestMetrics);
                response2 = invoke(marshall, new AssumeRoleResultStaxUnmarshaller(), createExecutionContext);
                AssumeRoleResult assumeRoleResult = (AssumeRoleResult) response2.getAwsResponse();
                awsRequestMetrics.endEvent(field);
                endClientExecution(awsRequestMetrics, marshall, response2);
                return assumeRoleResult;
            } catch (Throwable th) {
                th = th;
                Response<?> response3 = response2;
                request = marshall;
                response = response3;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            response = null;
        }
    }

    @Override // com.amazonaws.services.securitytoken.AWSSecurityTokenService
    public AssumeRoleWithSAMLResult assumeRoleWithSAML(AssumeRoleWithSAMLRequest assumeRoleWithSAMLRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(assumeRoleWithSAMLRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<AssumeRoleWithSAMLRequest> request = null;
        Response<?> response2 = null;
        try {
            Request<AssumeRoleWithSAMLRequest> marshall = new AssumeRoleWithSAMLRequestMarshaller().marshall(assumeRoleWithSAMLRequest);
            try {
                marshall.setAWSRequestMetrics(awsRequestMetrics);
                response2 = invoke(marshall, new AssumeRoleWithSAMLResultStaxUnmarshaller(), createExecutionContext);
                AssumeRoleWithSAMLResult assumeRoleWithSAMLResult = (AssumeRoleWithSAMLResult) response2.getAwsResponse();
                awsRequestMetrics.endEvent(field);
                endClientExecution(awsRequestMetrics, marshall, response2);
                return assumeRoleWithSAMLResult;
            } catch (Throwable th) {
                th = th;
                Response<?> response3 = response2;
                request = marshall;
                response = response3;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            response = null;
        }
    }

    @Override // com.amazonaws.services.securitytoken.AWSSecurityTokenService
    public AssumeRoleWithWebIdentityResult assumeRoleWithWebIdentity(AssumeRoleWithWebIdentityRequest assumeRoleWithWebIdentityRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(assumeRoleWithWebIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<AssumeRoleWithWebIdentityRequest> request = null;
        Response<?> response2 = null;
        try {
            Request<AssumeRoleWithWebIdentityRequest> marshall = new AssumeRoleWithWebIdentityRequestMarshaller().marshall(assumeRoleWithWebIdentityRequest);
            try {
                marshall.setAWSRequestMetrics(awsRequestMetrics);
                response2 = invoke(marshall, new AssumeRoleWithWebIdentityResultStaxUnmarshaller(), createExecutionContext);
                AssumeRoleWithWebIdentityResult assumeRoleWithWebIdentityResult = (AssumeRoleWithWebIdentityResult) response2.getAwsResponse();
                awsRequestMetrics.endEvent(field);
                endClientExecution(awsRequestMetrics, marshall, response2);
                return assumeRoleWithWebIdentityResult;
            } catch (Throwable th) {
                th = th;
                Response<?> response3 = response2;
                request = marshall;
                response = response3;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            response = null;
        }
    }

    @Override // com.amazonaws.services.securitytoken.AWSSecurityTokenService
    public DecodeAuthorizationMessageResult decodeAuthorizationMessage(DecodeAuthorizationMessageRequest decodeAuthorizationMessageRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(decodeAuthorizationMessageRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<DecodeAuthorizationMessageRequest> request = null;
        Response<?> response2 = null;
        try {
            Request<DecodeAuthorizationMessageRequest> marshall = new DecodeAuthorizationMessageRequestMarshaller().marshall(decodeAuthorizationMessageRequest);
            try {
                marshall.setAWSRequestMetrics(awsRequestMetrics);
                response2 = invoke(marshall, new DecodeAuthorizationMessageResultStaxUnmarshaller(), createExecutionContext);
                DecodeAuthorizationMessageResult decodeAuthorizationMessageResult = (DecodeAuthorizationMessageResult) response2.getAwsResponse();
                awsRequestMetrics.endEvent(field);
                endClientExecution(awsRequestMetrics, marshall, response2);
                return decodeAuthorizationMessageResult;
            } catch (Throwable th) {
                th = th;
                Response<?> response3 = response2;
                request = marshall;
                response = response3;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            response = null;
        }
    }

    @Override // com.amazonaws.services.securitytoken.AWSSecurityTokenService
    public GetAccessKeyInfoResult getAccessKeyInfo(GetAccessKeyInfoRequest getAccessKeyInfoRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(getAccessKeyInfoRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<GetAccessKeyInfoRequest> request = null;
        Response<?> response2 = null;
        try {
            Request<GetAccessKeyInfoRequest> marshall = new GetAccessKeyInfoRequestMarshaller().marshall(getAccessKeyInfoRequest);
            try {
                marshall.setAWSRequestMetrics(awsRequestMetrics);
                response2 = invoke(marshall, new GetAccessKeyInfoResultStaxUnmarshaller(), createExecutionContext);
                GetAccessKeyInfoResult getAccessKeyInfoResult = (GetAccessKeyInfoResult) response2.getAwsResponse();
                awsRequestMetrics.endEvent(field);
                endClientExecution(awsRequestMetrics, marshall, response2);
                return getAccessKeyInfoResult;
            } catch (Throwable th) {
                th = th;
                Response<?> response3 = response2;
                request = marshall;
                response = response3;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            response = null;
        }
    }

    @Override // com.amazonaws.services.securitytoken.AWSSecurityTokenService
    @Deprecated
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest amazonWebServiceRequest) {
        return this.client.getResponseMetadataForRequest(amazonWebServiceRequest);
    }

    @Override // com.amazonaws.services.securitytoken.AWSSecurityTokenService
    public GetCallerIdentityResult getCallerIdentity(GetCallerIdentityRequest getCallerIdentityRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(getCallerIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<GetCallerIdentityRequest> request = null;
        Response<?> response2 = null;
        try {
            Request<GetCallerIdentityRequest> marshall = new GetCallerIdentityRequestMarshaller().marshall(getCallerIdentityRequest);
            try {
                marshall.setAWSRequestMetrics(awsRequestMetrics);
                response2 = invoke(marshall, new GetCallerIdentityResultStaxUnmarshaller(), createExecutionContext);
                GetCallerIdentityResult getCallerIdentityResult = (GetCallerIdentityResult) response2.getAwsResponse();
                awsRequestMetrics.endEvent(field);
                endClientExecution(awsRequestMetrics, marshall, response2);
                return getCallerIdentityResult;
            } catch (Throwable th) {
                th = th;
                Response<?> response3 = response2;
                request = marshall;
                response = response3;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            response = null;
        }
    }

    @Override // com.amazonaws.services.securitytoken.AWSSecurityTokenService
    public GetFederationTokenResult getFederationToken(GetFederationTokenRequest getFederationTokenRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(getFederationTokenRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<GetFederationTokenRequest> request = null;
        Response<?> response2 = null;
        try {
            Request<GetFederationTokenRequest> marshall = new GetFederationTokenRequestMarshaller().marshall(getFederationTokenRequest);
            try {
                marshall.setAWSRequestMetrics(awsRequestMetrics);
                response2 = invoke(marshall, new GetFederationTokenResultStaxUnmarshaller(), createExecutionContext);
                GetFederationTokenResult getFederationTokenResult = (GetFederationTokenResult) response2.getAwsResponse();
                awsRequestMetrics.endEvent(field);
                endClientExecution(awsRequestMetrics, marshall, response2);
                return getFederationTokenResult;
            } catch (Throwable th) {
                th = th;
                Response<?> response3 = response2;
                request = marshall;
                response = response3;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            response = null;
        }
    }

    @Override // com.amazonaws.services.securitytoken.AWSSecurityTokenService
    public GetSessionTokenResult getSessionToken(GetSessionTokenRequest getSessionTokenRequest) throws AmazonServiceException, AmazonClientException {
        Response<?> response;
        ExecutionContext createExecutionContext = createExecutionContext(getSessionTokenRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent(field);
        Request<GetSessionTokenRequest> request = null;
        Response<?> response2 = null;
        try {
            Request<GetSessionTokenRequest> marshall = new GetSessionTokenRequestMarshaller().marshall(getSessionTokenRequest);
            try {
                marshall.setAWSRequestMetrics(awsRequestMetrics);
                response2 = invoke(marshall, new GetSessionTokenResultStaxUnmarshaller(), createExecutionContext);
                GetSessionTokenResult getSessionTokenResult = (GetSessionTokenResult) response2.getAwsResponse();
                awsRequestMetrics.endEvent(field);
                endClientExecution(awsRequestMetrics, marshall, response2);
                return getSessionTokenResult;
            } catch (Throwable th) {
                th = th;
                Response<?> response3 = response2;
                request = marshall;
                response = response3;
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, response);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            response = null;
        }
    }

    @Deprecated
    public AWSSecurityTokenServiceClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    public AWSSecurityTokenServiceClient(AWSCredentials aWSCredentials) {
        this(aWSCredentials, new ClientConfiguration());
    }

    public AWSSecurityTokenServiceClient(AWSCredentials aWSCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(aWSCredentials), clientConfiguration);
    }

    public AWSSecurityTokenServiceClient(AWSCredentialsProvider aWSCredentialsProvider) {
        this(aWSCredentialsProvider, new ClientConfiguration());
    }

    public AWSSecurityTokenServiceClient(AWSCredentialsProvider aWSCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(aWSCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    @Deprecated
    public AWSSecurityTokenServiceClient(AWSCredentialsProvider aWSCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);
        this.exceptionUnmarshallers = new ArrayList();
        this.awsCredentialsProvider = aWSCredentialsProvider;
        init();
    }

    public AWSSecurityTokenServiceClient(AWSCredentialsProvider aWSCredentialsProvider, ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);
        this.exceptionUnmarshallers = new ArrayList();
        this.awsCredentialsProvider = aWSCredentialsProvider;
        init();
    }

    @Override // com.amazonaws.services.securitytoken.AWSSecurityTokenService
    public GetCallerIdentityResult getCallerIdentity() throws AmazonServiceException, AmazonClientException {
        return getCallerIdentity(new GetCallerIdentityRequest());
    }

    @Override // com.amazonaws.services.securitytoken.AWSSecurityTokenService
    public GetSessionTokenResult getSessionToken() throws AmazonServiceException, AmazonClientException {
        return getSessionToken(new GetSessionTokenRequest());
    }
}
