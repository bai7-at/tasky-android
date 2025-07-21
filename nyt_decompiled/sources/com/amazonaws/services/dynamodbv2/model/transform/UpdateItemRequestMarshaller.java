package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.AttributeValueUpdate;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.amazonaws.services.dynamodbv2.model.UpdateItemRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.Map;

/* loaded from: classes2.dex */
public class UpdateItemRequestMarshaller implements Marshaller<Request<UpdateItemRequest>, UpdateItemRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<UpdateItemRequest> marshall(UpdateItemRequest updateItemRequest) {
        if (updateItemRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(UpdateItemRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(updateItemRequest, "AmazonDynamoDB");
        defaultRequest.addHeader("X-Amz-Target", "DynamoDB_20120810.UpdateItem");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (updateItemRequest.getTableName() != null) {
                String tableName = updateItemRequest.getTableName();
                jsonWriter.name("TableName");
                jsonWriter.value(tableName);
            }
            if (updateItemRequest.getKey() != null) {
                Map<String, AttributeValue> key = updateItemRequest.getKey();
                jsonWriter.name("Key");
                jsonWriter.beginObject();
                for (Map.Entry<String, AttributeValue> entry : key.entrySet()) {
                    AttributeValue value = entry.getValue();
                    if (value != null) {
                        jsonWriter.name(entry.getKey());
                        AttributeValueJsonMarshaller.getInstance().marshall(value, jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }
            if (updateItemRequest.getAttributeUpdates() != null) {
                Map<String, AttributeValueUpdate> attributeUpdates = updateItemRequest.getAttributeUpdates();
                jsonWriter.name("AttributeUpdates");
                jsonWriter.beginObject();
                for (Map.Entry<String, AttributeValueUpdate> entry2 : attributeUpdates.entrySet()) {
                    AttributeValueUpdate value2 = entry2.getValue();
                    if (value2 != null) {
                        jsonWriter.name(entry2.getKey());
                        AttributeValueUpdateJsonMarshaller.getInstance().marshall(value2, jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }
            if (updateItemRequest.getExpected() != null) {
                Map<String, ExpectedAttributeValue> expected = updateItemRequest.getExpected();
                jsonWriter.name("Expected");
                jsonWriter.beginObject();
                for (Map.Entry<String, ExpectedAttributeValue> entry3 : expected.entrySet()) {
                    ExpectedAttributeValue value3 = entry3.getValue();
                    if (value3 != null) {
                        jsonWriter.name(entry3.getKey());
                        ExpectedAttributeValueJsonMarshaller.getInstance().marshall(value3, jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }
            if (updateItemRequest.getConditionalOperator() != null) {
                String conditionalOperator = updateItemRequest.getConditionalOperator();
                jsonWriter.name("ConditionalOperator");
                jsonWriter.value(conditionalOperator);
            }
            if (updateItemRequest.getReturnValues() != null) {
                String returnValues = updateItemRequest.getReturnValues();
                jsonWriter.name("ReturnValues");
                jsonWriter.value(returnValues);
            }
            if (updateItemRequest.getReturnConsumedCapacity() != null) {
                String returnConsumedCapacity = updateItemRequest.getReturnConsumedCapacity();
                jsonWriter.name("ReturnConsumedCapacity");
                jsonWriter.value(returnConsumedCapacity);
            }
            if (updateItemRequest.getReturnItemCollectionMetrics() != null) {
                String returnItemCollectionMetrics = updateItemRequest.getReturnItemCollectionMetrics();
                jsonWriter.name("ReturnItemCollectionMetrics");
                jsonWriter.value(returnItemCollectionMetrics);
            }
            if (updateItemRequest.getUpdateExpression() != null) {
                String updateExpression = updateItemRequest.getUpdateExpression();
                jsonWriter.name("UpdateExpression");
                jsonWriter.value(updateExpression);
            }
            if (updateItemRequest.getConditionExpression() != null) {
                String conditionExpression = updateItemRequest.getConditionExpression();
                jsonWriter.name("ConditionExpression");
                jsonWriter.value(conditionExpression);
            }
            if (updateItemRequest.getExpressionAttributeNames() != null) {
                Map<String, String> expressionAttributeNames = updateItemRequest.getExpressionAttributeNames();
                jsonWriter.name("ExpressionAttributeNames");
                jsonWriter.beginObject();
                for (Map.Entry<String, String> entry4 : expressionAttributeNames.entrySet()) {
                    String value4 = entry4.getValue();
                    if (value4 != null) {
                        jsonWriter.name(entry4.getKey());
                        jsonWriter.value(value4);
                    }
                }
                jsonWriter.endObject();
            }
            if (updateItemRequest.getExpressionAttributeValues() != null) {
                Map<String, AttributeValue> expressionAttributeValues = updateItemRequest.getExpressionAttributeValues();
                jsonWriter.name("ExpressionAttributeValues");
                jsonWriter.beginObject();
                for (Map.Entry<String, AttributeValue> entry5 : expressionAttributeValues.entrySet()) {
                    AttributeValue value5 = entry5.getValue();
                    if (value5 != null) {
                        jsonWriter.name(entry5.getKey());
                        AttributeValueJsonMarshaller.getInstance().marshall(value5, jsonWriter);
                    }
                }
                jsonWriter.endObject();
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
