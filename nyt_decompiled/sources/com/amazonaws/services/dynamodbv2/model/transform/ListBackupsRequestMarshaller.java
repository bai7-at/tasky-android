package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.dynamodbv2.model.ListBackupsRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.Date;

/* loaded from: classes2.dex */
public class ListBackupsRequestMarshaller implements Marshaller<Request<ListBackupsRequest>, ListBackupsRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<ListBackupsRequest> marshall(ListBackupsRequest listBackupsRequest) {
        if (listBackupsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(ListBackupsRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(listBackupsRequest, "AmazonDynamoDB");
        defaultRequest.addHeader("X-Amz-Target", "DynamoDB_20120810.ListBackups");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (listBackupsRequest.getTableName() != null) {
                String tableName = listBackupsRequest.getTableName();
                jsonWriter.name("TableName");
                jsonWriter.value(tableName);
            }
            if (listBackupsRequest.getLimit() != null) {
                Integer limit = listBackupsRequest.getLimit();
                jsonWriter.name("Limit");
                jsonWriter.value(limit);
            }
            if (listBackupsRequest.getTimeRangeLowerBound() != null) {
                Date timeRangeLowerBound = listBackupsRequest.getTimeRangeLowerBound();
                jsonWriter.name("TimeRangeLowerBound");
                jsonWriter.value(timeRangeLowerBound);
            }
            if (listBackupsRequest.getTimeRangeUpperBound() != null) {
                Date timeRangeUpperBound = listBackupsRequest.getTimeRangeUpperBound();
                jsonWriter.name("TimeRangeUpperBound");
                jsonWriter.value(timeRangeUpperBound);
            }
            if (listBackupsRequest.getExclusiveStartBackupArn() != null) {
                String exclusiveStartBackupArn = listBackupsRequest.getExclusiveStartBackupArn();
                jsonWriter.name("ExclusiveStartBackupArn");
                jsonWriter.value(exclusiveStartBackupArn);
            }
            if (listBackupsRequest.getBackupType() != null) {
                String backupType = listBackupsRequest.getBackupType();
                jsonWriter.name("BackupType");
                jsonWriter.value(backupType);
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
