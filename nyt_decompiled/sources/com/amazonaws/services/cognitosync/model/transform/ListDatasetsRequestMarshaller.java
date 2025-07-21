package com.amazonaws.services.cognitosync.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitosync.model.ListDatasetsRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

@Deprecated
/* loaded from: classes.dex */
public class ListDatasetsRequestMarshaller implements Marshaller<Request<ListDatasetsRequest>, ListDatasetsRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<ListDatasetsRequest> marshall(ListDatasetsRequest listDatasetsRequest) {
        if (listDatasetsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(ListDatasetsRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(listDatasetsRequest, "AmazonCognitoSync");
        defaultRequest.setHttpMethod(HttpMethodName.GET);
        String replace = "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets".replace("{IdentityPoolId}", listDatasetsRequest.getIdentityPoolId() == null ? "" : StringUtils.fromString(listDatasetsRequest.getIdentityPoolId())).replace("{IdentityId}", listDatasetsRequest.getIdentityId() != null ? StringUtils.fromString(listDatasetsRequest.getIdentityId()) : "");
        if (listDatasetsRequest.getNextToken() != null) {
            defaultRequest.addParameter("nextToken", StringUtils.fromString(listDatasetsRequest.getNextToken()));
        }
        if (listDatasetsRequest.getMaxResults() != null) {
            defaultRequest.addParameter("maxResults", StringUtils.fromInteger(listDatasetsRequest.getMaxResults()));
        }
        defaultRequest.setResourcePath(replace);
        if (!defaultRequest.getHeaders().containsKey("Content-Type")) {
            defaultRequest.addHeader("Content-Type", "application/x-amz-json-1.1");
        }
        return defaultRequest;
    }
}
