package com.amazonaws.services.cognitosync.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

@Deprecated
/* loaded from: classes.dex */
public class UnsubscribeFromDatasetRequestMarshaller implements Marshaller<Request<UnsubscribeFromDatasetRequest>, UnsubscribeFromDatasetRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<UnsubscribeFromDatasetRequest> marshall(UnsubscribeFromDatasetRequest unsubscribeFromDatasetRequest) {
        if (unsubscribeFromDatasetRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(UnsubscribeFromDatasetRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(unsubscribeFromDatasetRequest, "AmazonCognitoSync");
        defaultRequest.setHttpMethod(HttpMethodName.DELETE);
        defaultRequest.setResourcePath("/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}/subscriptions/{DeviceId}".replace("{IdentityPoolId}", unsubscribeFromDatasetRequest.getIdentityPoolId() == null ? "" : StringUtils.fromString(unsubscribeFromDatasetRequest.getIdentityPoolId())).replace("{IdentityId}", unsubscribeFromDatasetRequest.getIdentityId() == null ? "" : StringUtils.fromString(unsubscribeFromDatasetRequest.getIdentityId())).replace("{DatasetName}", unsubscribeFromDatasetRequest.getDatasetName() == null ? "" : StringUtils.fromString(unsubscribeFromDatasetRequest.getDatasetName())).replace("{DeviceId}", unsubscribeFromDatasetRequest.getDeviceId() != null ? StringUtils.fromString(unsubscribeFromDatasetRequest.getDeviceId()) : ""));
        if (!defaultRequest.getHeaders().containsKey("Content-Type")) {
            defaultRequest.addHeader("Content-Type", "application/x-amz-json-1.1");
        }
        return defaultRequest;
    }
}
