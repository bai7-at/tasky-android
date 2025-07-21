package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.KeySchemaElement;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import com.amazonaws.services.dynamodbv2.model.SourceTableDetails;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
class SourceTableDetailsJsonMarshaller {
    private static SourceTableDetailsJsonMarshaller instance;

    SourceTableDetailsJsonMarshaller() {
    }

    public static SourceTableDetailsJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new SourceTableDetailsJsonMarshaller();
        }
        return instance;
    }

    public void marshall(SourceTableDetails sourceTableDetails, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (sourceTableDetails.getTableName() != null) {
            String tableName = sourceTableDetails.getTableName();
            awsJsonWriter.name("TableName");
            awsJsonWriter.value(tableName);
        }
        if (sourceTableDetails.getTableId() != null) {
            String tableId = sourceTableDetails.getTableId();
            awsJsonWriter.name("TableId");
            awsJsonWriter.value(tableId);
        }
        if (sourceTableDetails.getTableArn() != null) {
            String tableArn = sourceTableDetails.getTableArn();
            awsJsonWriter.name("TableArn");
            awsJsonWriter.value(tableArn);
        }
        if (sourceTableDetails.getTableSizeBytes() != null) {
            Long tableSizeBytes = sourceTableDetails.getTableSizeBytes();
            awsJsonWriter.name("TableSizeBytes");
            awsJsonWriter.value(tableSizeBytes);
        }
        if (sourceTableDetails.getKeySchema() != null) {
            List<KeySchemaElement> keySchema = sourceTableDetails.getKeySchema();
            awsJsonWriter.name("KeySchema");
            awsJsonWriter.beginArray();
            for (KeySchemaElement keySchemaElement : keySchema) {
                if (keySchemaElement != null) {
                    KeySchemaElementJsonMarshaller.getInstance().marshall(keySchemaElement, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        if (sourceTableDetails.getTableCreationDateTime() != null) {
            Date tableCreationDateTime = sourceTableDetails.getTableCreationDateTime();
            awsJsonWriter.name("TableCreationDateTime");
            awsJsonWriter.value(tableCreationDateTime);
        }
        if (sourceTableDetails.getProvisionedThroughput() != null) {
            ProvisionedThroughput provisionedThroughput = sourceTableDetails.getProvisionedThroughput();
            awsJsonWriter.name("ProvisionedThroughput");
            ProvisionedThroughputJsonMarshaller.getInstance().marshall(provisionedThroughput, awsJsonWriter);
        }
        if (sourceTableDetails.getItemCount() != null) {
            Long itemCount = sourceTableDetails.getItemCount();
            awsJsonWriter.name("ItemCount");
            awsJsonWriter.value(itemCount);
        }
        awsJsonWriter.endObject();
    }
}
