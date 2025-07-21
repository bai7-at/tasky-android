package com.amazonaws.services.cognitosync.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitosync.model.RecordPatch;
import com.amazonaws.services.cognitosync.model.UpdateRecordsRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public class UpdateRecordsRequestMarshaller implements Marshaller<Request<UpdateRecordsRequest>, UpdateRecordsRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<UpdateRecordsRequest> marshall(UpdateRecordsRequest updateRecordsRequest) {
        if (updateRecordsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(UpdateRecordsRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(updateRecordsRequest, "AmazonCognitoSync");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        if (updateRecordsRequest.getClientContext() != null) {
            defaultRequest.addHeader("x-amz-Client-Context", StringUtils.fromString(updateRecordsRequest.getClientContext()));
        }
        defaultRequest.setResourcePath("/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}".replace("{IdentityPoolId}", updateRecordsRequest.getIdentityPoolId() == null ? "" : StringUtils.fromString(updateRecordsRequest.getIdentityPoolId())).replace("{IdentityId}", updateRecordsRequest.getIdentityId() == null ? "" : StringUtils.fromString(updateRecordsRequest.getIdentityId())).replace("{DatasetName}", updateRecordsRequest.getDatasetName() != null ? StringUtils.fromString(updateRecordsRequest.getDatasetName()) : ""));
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (updateRecordsRequest.getDeviceId() != null) {
                String deviceId = updateRecordsRequest.getDeviceId();
                jsonWriter.name("DeviceId");
                jsonWriter.value(deviceId);
            }
            if (updateRecordsRequest.getRecordPatches() != null) {
                List<RecordPatch> recordPatches = updateRecordsRequest.getRecordPatches();
                jsonWriter.name("RecordPatches");
                jsonWriter.beginArray();
                for (RecordPatch recordPatch : recordPatches) {
                    if (recordPatch != null) {
                        RecordPatchJsonMarshaller.getInstance().marshall(recordPatch, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateRecordsRequest.getSyncSessionToken() != null) {
                String syncSessionToken = updateRecordsRequest.getSyncSessionToken();
                jsonWriter.name("SyncSessionToken");
                jsonWriter.value(syncSessionToken);
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
