package com.amazonaws.services.cognitosync.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitosync.model.RegisterDeviceRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

@Deprecated
/* loaded from: classes.dex */
public class RegisterDeviceRequestMarshaller implements Marshaller<Request<RegisterDeviceRequest>, RegisterDeviceRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<RegisterDeviceRequest> marshall(RegisterDeviceRequest registerDeviceRequest) {
        if (registerDeviceRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(RegisterDeviceRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(registerDeviceRequest, "AmazonCognitoSync");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/identitypools/{IdentityPoolId}/identity/{IdentityId}/device".replace("{IdentityPoolId}", registerDeviceRequest.getIdentityPoolId() == null ? "" : StringUtils.fromString(registerDeviceRequest.getIdentityPoolId())).replace("{IdentityId}", registerDeviceRequest.getIdentityId() != null ? StringUtils.fromString(registerDeviceRequest.getIdentityId()) : ""));
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (registerDeviceRequest.getPlatform() != null) {
                String platform = registerDeviceRequest.getPlatform();
                jsonWriter.name("Platform");
                jsonWriter.value(platform);
            }
            if (registerDeviceRequest.getToken() != null) {
                String token = registerDeviceRequest.getToken();
                jsonWriter.name("Token");
                jsonWriter.value(token);
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
