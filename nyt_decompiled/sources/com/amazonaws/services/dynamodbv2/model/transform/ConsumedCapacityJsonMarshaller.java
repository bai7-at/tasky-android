package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.Capacity;
import com.amazonaws.services.dynamodbv2.model.ConsumedCapacity;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Map;

/* loaded from: classes2.dex */
class ConsumedCapacityJsonMarshaller {
    private static ConsumedCapacityJsonMarshaller instance;

    ConsumedCapacityJsonMarshaller() {
    }

    public static ConsumedCapacityJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ConsumedCapacityJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ConsumedCapacity consumedCapacity, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (consumedCapacity.getTableName() != null) {
            String tableName = consumedCapacity.getTableName();
            awsJsonWriter.name("TableName");
            awsJsonWriter.value(tableName);
        }
        if (consumedCapacity.getCapacityUnits() != null) {
            Double capacityUnits = consumedCapacity.getCapacityUnits();
            awsJsonWriter.name("CapacityUnits");
            awsJsonWriter.value(capacityUnits);
        }
        if (consumedCapacity.getTable() != null) {
            Capacity table = consumedCapacity.getTable();
            awsJsonWriter.name("Table");
            CapacityJsonMarshaller.getInstance().marshall(table, awsJsonWriter);
        }
        if (consumedCapacity.getLocalSecondaryIndexes() != null) {
            Map<String, Capacity> localSecondaryIndexes = consumedCapacity.getLocalSecondaryIndexes();
            awsJsonWriter.name("LocalSecondaryIndexes");
            awsJsonWriter.beginObject();
            for (Map.Entry<String, Capacity> entry : localSecondaryIndexes.entrySet()) {
                Capacity value = entry.getValue();
                if (value != null) {
                    awsJsonWriter.name(entry.getKey());
                    CapacityJsonMarshaller.getInstance().marshall(value, awsJsonWriter);
                }
            }
            awsJsonWriter.endObject();
        }
        if (consumedCapacity.getGlobalSecondaryIndexes() != null) {
            Map<String, Capacity> globalSecondaryIndexes = consumedCapacity.getGlobalSecondaryIndexes();
            awsJsonWriter.name("GlobalSecondaryIndexes");
            awsJsonWriter.beginObject();
            for (Map.Entry<String, Capacity> entry2 : globalSecondaryIndexes.entrySet()) {
                Capacity value2 = entry2.getValue();
                if (value2 != null) {
                    awsJsonWriter.name(entry2.getKey());
                    CapacityJsonMarshaller.getInstance().marshall(value2, awsJsonWriter);
                }
            }
            awsJsonWriter.endObject();
        }
        awsJsonWriter.endObject();
    }
}
