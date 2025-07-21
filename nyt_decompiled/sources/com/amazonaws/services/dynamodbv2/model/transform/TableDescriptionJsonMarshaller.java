package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.AttributeDefinition;
import com.amazonaws.services.dynamodbv2.model.GlobalSecondaryIndexDescription;
import com.amazonaws.services.dynamodbv2.model.KeySchemaElement;
import com.amazonaws.services.dynamodbv2.model.LocalSecondaryIndexDescription;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughputDescription;
import com.amazonaws.services.dynamodbv2.model.RestoreSummary;
import com.amazonaws.services.dynamodbv2.model.SSEDescription;
import com.amazonaws.services.dynamodbv2.model.StreamSpecification;
import com.amazonaws.services.dynamodbv2.model.TableDescription;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
class TableDescriptionJsonMarshaller {
    private static TableDescriptionJsonMarshaller instance;

    TableDescriptionJsonMarshaller() {
    }

    public static TableDescriptionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new TableDescriptionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(TableDescription tableDescription, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (tableDescription.getAttributeDefinitions() != null) {
            List<AttributeDefinition> attributeDefinitions = tableDescription.getAttributeDefinitions();
            awsJsonWriter.name("AttributeDefinitions");
            awsJsonWriter.beginArray();
            for (AttributeDefinition attributeDefinition : attributeDefinitions) {
                if (attributeDefinition != null) {
                    AttributeDefinitionJsonMarshaller.getInstance().marshall(attributeDefinition, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        if (tableDescription.getTableName() != null) {
            String tableName = tableDescription.getTableName();
            awsJsonWriter.name("TableName");
            awsJsonWriter.value(tableName);
        }
        if (tableDescription.getKeySchema() != null) {
            List<KeySchemaElement> keySchema = tableDescription.getKeySchema();
            awsJsonWriter.name("KeySchema");
            awsJsonWriter.beginArray();
            for (KeySchemaElement keySchemaElement : keySchema) {
                if (keySchemaElement != null) {
                    KeySchemaElementJsonMarshaller.getInstance().marshall(keySchemaElement, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        if (tableDescription.getTableStatus() != null) {
            String tableStatus = tableDescription.getTableStatus();
            awsJsonWriter.name("TableStatus");
            awsJsonWriter.value(tableStatus);
        }
        if (tableDescription.getCreationDateTime() != null) {
            Date creationDateTime = tableDescription.getCreationDateTime();
            awsJsonWriter.name("CreationDateTime");
            awsJsonWriter.value(creationDateTime);
        }
        if (tableDescription.getProvisionedThroughput() != null) {
            ProvisionedThroughputDescription provisionedThroughput = tableDescription.getProvisionedThroughput();
            awsJsonWriter.name("ProvisionedThroughput");
            ProvisionedThroughputDescriptionJsonMarshaller.getInstance().marshall(provisionedThroughput, awsJsonWriter);
        }
        if (tableDescription.getTableSizeBytes() != null) {
            Long tableSizeBytes = tableDescription.getTableSizeBytes();
            awsJsonWriter.name("TableSizeBytes");
            awsJsonWriter.value(tableSizeBytes);
        }
        if (tableDescription.getItemCount() != null) {
            Long itemCount = tableDescription.getItemCount();
            awsJsonWriter.name("ItemCount");
            awsJsonWriter.value(itemCount);
        }
        if (tableDescription.getTableArn() != null) {
            String tableArn = tableDescription.getTableArn();
            awsJsonWriter.name("TableArn");
            awsJsonWriter.value(tableArn);
        }
        if (tableDescription.getTableId() != null) {
            String tableId = tableDescription.getTableId();
            awsJsonWriter.name("TableId");
            awsJsonWriter.value(tableId);
        }
        if (tableDescription.getLocalSecondaryIndexes() != null) {
            List<LocalSecondaryIndexDescription> localSecondaryIndexes = tableDescription.getLocalSecondaryIndexes();
            awsJsonWriter.name("LocalSecondaryIndexes");
            awsJsonWriter.beginArray();
            for (LocalSecondaryIndexDescription localSecondaryIndexDescription : localSecondaryIndexes) {
                if (localSecondaryIndexDescription != null) {
                    LocalSecondaryIndexDescriptionJsonMarshaller.getInstance().marshall(localSecondaryIndexDescription, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        if (tableDescription.getGlobalSecondaryIndexes() != null) {
            List<GlobalSecondaryIndexDescription> globalSecondaryIndexes = tableDescription.getGlobalSecondaryIndexes();
            awsJsonWriter.name("GlobalSecondaryIndexes");
            awsJsonWriter.beginArray();
            for (GlobalSecondaryIndexDescription globalSecondaryIndexDescription : globalSecondaryIndexes) {
                if (globalSecondaryIndexDescription != null) {
                    GlobalSecondaryIndexDescriptionJsonMarshaller.getInstance().marshall(globalSecondaryIndexDescription, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        if (tableDescription.getStreamSpecification() != null) {
            StreamSpecification streamSpecification = tableDescription.getStreamSpecification();
            awsJsonWriter.name("StreamSpecification");
            StreamSpecificationJsonMarshaller.getInstance().marshall(streamSpecification, awsJsonWriter);
        }
        if (tableDescription.getLatestStreamLabel() != null) {
            String latestStreamLabel = tableDescription.getLatestStreamLabel();
            awsJsonWriter.name("LatestStreamLabel");
            awsJsonWriter.value(latestStreamLabel);
        }
        if (tableDescription.getLatestStreamArn() != null) {
            String latestStreamArn = tableDescription.getLatestStreamArn();
            awsJsonWriter.name("LatestStreamArn");
            awsJsonWriter.value(latestStreamArn);
        }
        if (tableDescription.getRestoreSummary() != null) {
            RestoreSummary restoreSummary = tableDescription.getRestoreSummary();
            awsJsonWriter.name("RestoreSummary");
            RestoreSummaryJsonMarshaller.getInstance().marshall(restoreSummary, awsJsonWriter);
        }
        if (tableDescription.getSSEDescription() != null) {
            SSEDescription sSEDescription = tableDescription.getSSEDescription();
            awsJsonWriter.name("SSEDescription");
            SSEDescriptionJsonMarshaller.getInstance().marshall(sSEDescription, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
