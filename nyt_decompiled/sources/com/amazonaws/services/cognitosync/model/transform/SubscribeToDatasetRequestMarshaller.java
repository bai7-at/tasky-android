package com.amazonaws.services.cognitosync.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitosync.model.SubscribeToDatasetRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import java.io.ByteArrayInputStream;

@Deprecated
/* loaded from: classes.dex */
public class SubscribeToDatasetRequestMarshaller implements Marshaller<Request<SubscribeToDatasetRequest>, SubscribeToDatasetRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<SubscribeToDatasetRequest> marshall(SubscribeToDatasetRequest subscribeToDatasetRequest) {
        if (subscribeToDatasetRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(SubscribeToDatasetRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(subscribeToDatasetRequest, "AmazonCognitoSync");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}/subscriptions/{DeviceId}".replace("{IdentityPoolId}", subscribeToDatasetRequest.getIdentityPoolId() == null ? "" : StringUtils.fromString(subscribeToDatasetRequest.getIdentityPoolId())).replace("{IdentityId}", subscribeToDatasetRequest.getIdentityId() == null ? "" : StringUtils.fromString(subscribeToDatasetRequest.getIdentityId())).replace("{DatasetName}", subscribeToDatasetRequest.getDatasetName() == null ? "" : StringUtils.fromString(subscribeToDatasetRequest.getDatasetName())).replace("{DeviceId}", subscribeToDatasetRequest.getDeviceId() != null ? StringUtils.fromString(subscribeToDatasetRequest.getDeviceId()) : ""));
        defaultRequest.addHeader("Content-Length", "0");
        defaultRequest.setContent(new ByteArrayInputStream(new byte[0]));
        if (!defaultRequest.getHeaders().containsKey("Content-Type")) {
            defaultRequest.addHeader("Content-Type", "application/x-amz-json-1.1");
        }
        return defaultRequest;
    }
}
