package com.amazonaws.services.kms.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.kms.model.ListResourceTagsRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

/* loaded from: classes2.dex */
public class ListResourceTagsRequestMarshaller implements Marshaller<Request<ListResourceTagsRequest>, ListResourceTagsRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<ListResourceTagsRequest> marshall(ListResourceTagsRequest listResourceTagsRequest) {
        if (listResourceTagsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(ListResourceTagsRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(listResourceTagsRequest, "AWSKMS");
        defaultRequest.addHeader("X-Amz-Target", "TrentService.ListResourceTags");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (listResourceTagsRequest.getKeyId() != null) {
                String keyId = listResourceTagsRequest.getKeyId();
                jsonWriter.name("KeyId");
                jsonWriter.value(keyId);
            }
            if (listResourceTagsRequest.getLimit() != null) {
                Integer limit = listResourceTagsRequest.getLimit();
                jsonWriter.name("Limit");
                jsonWriter.value(limit);
            }
            if (listResourceTagsRequest.getMarker() != null) {
                String marker = listResourceTagsRequest.getMarker();
                jsonWriter.name("Marker");
                jsonWriter.value(marker);
            }
            jsonWriter.endObject();
            jsonWriter.close();
            String stringWriter2 = stringWriter.toString();
            byte[] bytes = stringWriter2.getBytes(StringUtils.UTF8);
            defaultRequest.setContent(new StringInputStream(stringWriter2));
            defaultRequest.addHeader("Content-Length", Integer.toString(bytes.length));
            if (!defaultRequest.getHeaders().containsKey("Content-Type")) {
                defaultRequest.addHeader("Content-Type", "application/x-amz-json-1.1");
            }
            return defaultRequest;
        } catch (Throwable th) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + th.getMessage(), th);
        }
    }
}
