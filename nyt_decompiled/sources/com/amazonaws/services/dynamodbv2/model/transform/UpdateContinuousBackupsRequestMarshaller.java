package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.dynamodbv2.model.PointInTimeRecoverySpecification;
import com.amazonaws.services.dynamodbv2.model.UpdateContinuousBackupsRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

/* loaded from: classes2.dex */
public class UpdateContinuousBackupsRequestMarshaller implements Marshaller<Request<UpdateContinuousBackupsRequest>, UpdateContinuousBackupsRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<UpdateContinuousBackupsRequest> marshall(UpdateContinuousBackupsRequest updateContinuousBackupsRequest) {
        if (updateContinuousBackupsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(UpdateContinuousBackupsRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(updateContinuousBackupsRequest, "AmazonDynamoDB");
        defaultRequest.addHeader("X-Amz-Target", "DynamoDB_20120810.UpdateContinuousBackups");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (updateContinuousBackupsRequest.getTableName() != null) {
                String tableName = updateContinuousBackupsRequest.getTableName();
                jsonWriter.name("TableName");
                jsonWriter.value(tableName);
            }
            if (updateContinuousBackupsRequest.getPointInTimeRecoverySpecification() != null) {
                PointInTimeRecoverySpecification pointInTimeRecoverySpecification = updateContinuousBackupsRequest.getPointInTimeRecoverySpecification();
                jsonWriter.name("PointInTimeRecoverySpecification");
                PointInTimeRecoverySpecificationJsonMarshaller.getInstance().marshall(pointInTimeRecoverySpecification, jsonWriter);
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
