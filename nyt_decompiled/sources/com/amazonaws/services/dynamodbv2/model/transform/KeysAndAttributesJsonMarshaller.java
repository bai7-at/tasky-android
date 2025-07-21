package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.KeysAndAttributes;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
class KeysAndAttributesJsonMarshaller {
    private static KeysAndAttributesJsonMarshaller instance;

    KeysAndAttributesJsonMarshaller() {
    }

    public static KeysAndAttributesJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new KeysAndAttributesJsonMarshaller();
        }
        return instance;
    }

    public void marshall(KeysAndAttributes keysAndAttributes, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (keysAndAttributes.getKeys() != null) {
            List<Map<String, AttributeValue>> keys = keysAndAttributes.getKeys();
            awsJsonWriter.name("Keys");
            awsJsonWriter.beginArray();
            for (Map<String, AttributeValue> map : keys) {
                if (map != null) {
                    awsJsonWriter.beginObject();
                    for (Map.Entry<String, AttributeValue> entry : map.entrySet()) {
                        AttributeValue value = entry.getValue();
                        if (value != null) {
                            awsJsonWriter.name(entry.getKey());
                            AttributeValueJsonMarshaller.getInstance().marshall(value, awsJsonWriter);
                        }
                    }
                    awsJsonWriter.endObject();
                }
            }
            awsJsonWriter.endArray();
        }
        if (keysAndAttributes.getAttributesToGet() != null) {
            List<String> attributesToGet = keysAndAttributes.getAttributesToGet();
            awsJsonWriter.name("AttributesToGet");
            awsJsonWriter.beginArray();
            for (String str : attributesToGet) {
                if (str != null) {
                    awsJsonWriter.value(str);
                }
            }
            awsJsonWriter.endArray();
        }
        if (keysAndAttributes.getConsistentRead() != null) {
            Boolean consistentRead = keysAndAttributes.getConsistentRead();
            awsJsonWriter.name("ConsistentRead");
            awsJsonWriter.value(consistentRead.booleanValue());
        }
        if (keysAndAttributes.getProjectionExpression() != null) {
            String projectionExpression = keysAndAttributes.getProjectionExpression();
            awsJsonWriter.name("ProjectionExpression");
            awsJsonWriter.value(projectionExpression);
        }
        if (keysAndAttributes.getExpressionAttributeNames() != null) {
            Map<String, String> expressionAttributeNames = keysAndAttributes.getExpressionAttributeNames();
            awsJsonWriter.name("ExpressionAttributeNames");
            awsJsonWriter.beginObject();
            for (Map.Entry<String, String> entry2 : expressionAttributeNames.entrySet()) {
                String value2 = entry2.getValue();
                if (value2 != null) {
                    awsJsonWriter.name(entry2.getKey());
                    awsJsonWriter.value(value2);
                }
            }
            awsJsonWriter.endObject();
        }
        awsJsonWriter.endObject();
    }
}
