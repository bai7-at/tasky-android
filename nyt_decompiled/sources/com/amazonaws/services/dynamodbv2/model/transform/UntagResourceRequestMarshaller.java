package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.dynamodbv2.model.UntagResourceRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.List;

/* loaded from: classes2.dex */
public class UntagResourceRequestMarshaller implements Marshaller<Request<UntagResourceRequest>, UntagResourceRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<UntagResourceRequest> marshall(UntagResourceRequest untagResourceRequest) {
        if (untagResourceRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(UntagResourceRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(untagResourceRequest, "AmazonDynamoDB");
        defaultRequest.addHeader("X-Amz-Target", "DynamoDB_20120810.UntagResource");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (untagResourceRequest.getResourceArn() != null) {
                String resourceArn = untagResourceRequest.getResourceArn();
                jsonWriter.name("ResourceArn");
                jsonWriter.value(resourceArn);
            }
            if (untagResourceRequest.getTagKeys() != null) {
                List<String> tagKeys = untagResourceRequest.getTagKeys();
                jsonWriter.name("TagKeys");
                jsonWriter.beginArray();
                for (String str : tagKeys) {
                    if (str != null) {
                        jsonWriter.value(str);
                    }
                }
                jsonWriter.endArray();
            }
            jsonWriter.endObject();
            jsonWriter.close();
            String stringWriter2 = stringWriter.toString();
            byte[] bytes = stringWriter2.getBytes(StringUtils.UTF8);
            defaultRequest.setContent(new StringInputStream(stringWriter2));
            defaultRequest.addHeader("Content-Length", Integer.toString(bytes.length));
            if (!defaultRequest.getHeaders().containsKey("Content-Type")) {
                defaultRequest.addHeader("Content-Type", "application/x-amz-json-1.0");
            }
            return defaultRequest;
        } catch (Throwable th) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + th.getMessage(), th);
        }
    }
}
