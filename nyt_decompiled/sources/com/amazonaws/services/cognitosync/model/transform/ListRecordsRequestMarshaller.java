package com.amazonaws.services.cognitosync.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitosync.model.ListRecordsRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

@Deprecated
/* loaded from: classes.dex */
public class ListRecordsRequestMarshaller implements Marshaller<Request<ListRecordsRequest>, ListRecordsRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<ListRecordsRequest> marshall(ListRecordsRequest listRecordsRequest) {
        if (listRecordsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(ListRecordsRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(listRecordsRequest, "AmazonCognitoSync");
        defaultRequest.setHttpMethod(HttpMethodName.GET);
        String replace = "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}/records".replace("{IdentityPoolId}", listRecordsRequest.getIdentityPoolId() == null ? "" : StringUtils.fromString(listRecordsRequest.getIdentityPoolId())).replace("{IdentityId}", listRecordsRequest.getIdentityId() == null ? "" : StringUtils.fromString(listRecordsRequest.getIdentityId())).replace("{DatasetName}", listRecordsRequest.getDatasetName() != null ? StringUtils.fromString(listRecordsRequest.getDatasetName()) : "");
        if (listRecordsRequest.getLastSyncCount() != null) {
            defaultRequest.addParameter("lastSyncCount", StringUtils.fromLong(listRecordsRequest.getLastSyncCount()));
        }
        if (listRecordsRequest.getNextToken() != null) {
            defaultRequest.addParameter("nextToken", StringUtils.fromString(listRecordsRequest.getNextToken()));
        }
        if (listRecordsRequest.getMaxResults() != null) {
            defaultRequest.addParameter("maxResults", StringUtils.fromInteger(listRecordsRequest.getMaxResults()));
        }
        if (listRecordsRequest.getSyncSessionToken() != null) {
            defaultRequest.addParameter("syncSessionToken", StringUtils.fromString(listRecordsRequest.getSyncSessionToken()));
        }
        defaultRequest.setResourcePath(replace);
        if (!defaultRequest.getHeaders().containsKey("Content-Type")) {
            defaultRequest.addHeader("Content-Type", "application/x-amz-json-1.1");
        }
        return defaultRequest;
    }
}
