package com.amazonaws.services.kms.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.kms.model.GetKeyPolicyRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

/* loaded from: classes2.dex */
public class GetKeyPolicyRequestMarshaller implements Marshaller<Request<GetKeyPolicyRequest>, GetKeyPolicyRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<GetKeyPolicyRequest> marshall(GetKeyPolicyRequest getKeyPolicyRequest) {
        if (getKeyPolicyRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(GetKeyPolicyRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(getKeyPolicyRequest, "AWSKMS");
        defaultRequest.addHeader("X-Amz-Target", "TrentService.GetKeyPolicy");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (getKeyPolicyRequest.getKeyId() != null) {
                String keyId = getKeyPolicyRequest.getKeyId();
                jsonWriter.name("KeyId");
                jsonWriter.value(keyId);
            }
            if (getKeyPolicyRequest.getPolicyName() != null) {
                String policyName = getKeyPolicyRequest.getPolicyName();
                jsonWriter.name("PolicyName");
                jsonWriter.value(policyName);
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
