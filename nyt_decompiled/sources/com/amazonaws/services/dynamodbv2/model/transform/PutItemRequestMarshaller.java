package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.amazonaws.services.dynamodbv2.model.PutItemRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.Map;

/* loaded from: classes2.dex */
public class PutItemRequestMarshaller implements Marshaller<Request<PutItemRequest>, PutItemRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<PutItemRequest> marshall(PutItemRequest putItemRequest) {
        if (putItemRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(PutItemRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(putItemRequest, "AmazonDynamoDB");
        defaultRequest.addHeader("X-Amz-Target", "DynamoDB_20120810.PutItem");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (putItemRequest.getTableName() != null) {
                String tableName = putItemRequest.getTableName();
                jsonWriter.name("TableName");
                jsonWriter.value(tableName);
            }
            if (putItemRequest.getItem() != null) {
                Map<String, AttributeValue> item = putItemRequest.getItem();
                jsonWriter.name("Item");
                jsonWriter.beginObject();
                for (Map.Entry<String, AttributeValue> entry : item.entrySet()) {
                    AttributeValue value = entry.getValue();
                    if (value != null) {
                        jsonWriter.name(entry.getKey());
                        AttributeValueJsonMarshaller.getInstance().marshall(value, jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }
            if (putItemRequest.getExpected() != null) {
                Map<String, ExpectedAttributeValue> expected = putItemRequest.getExpected();
                jsonWriter.name("Expected");
                jsonWriter.beginObject();
                for (Map.Entry<String, ExpectedAttributeValue> entry2 : expected.entrySet()) {
                    ExpectedAttributeValue value2 = entry2.getValue();
                    if (value2 != null) {
                        jsonWriter.name(entry2.getKey());
                        ExpectedAttributeValueJsonMarshaller.getInstance().marshall(value2, jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }
            if (putItemRequest.getReturnValues() != null) {
                String returnValues = putItemRequest.getReturnValues();
                jsonWriter.name("ReturnValues");
                jsonWriter.value(returnValues);
            }
            if (putItemRequest.getReturnConsumedCapacity() != null) {
                String returnConsumedCapacity = putItemRequest.getReturnConsumedCapacity();
                jsonWriter.name("ReturnConsumedCapacity");
                jsonWriter.value(returnConsumedCapacity);
            }
            if (putItemRequest.getReturnItemCollectionMetrics() != null) {
                String returnItemCollectionMetrics = putItemRequest.getReturnItemCollectionMetrics();
                jsonWriter.name("ReturnItemCollectionMetrics");
                jsonWriter.value(returnItemCollectionMetrics);
            }
            if (putItemRequest.getConditionalOperator() != null) {
                String conditionalOperator = putItemRequest.getConditionalOperator();
                jsonWriter.name("ConditionalOperator");
                jsonWriter.value(conditionalOperator);
            }
            if (putItemRequest.getConditionExpression() != null) {
                String conditionExpression = putItemRequest.getConditionExpression();
                jsonWriter.name("ConditionExpression");
                jsonWriter.value(conditionExpression);
            }
            if (putItemRequest.getExpressionAttributeNames() != null) {
                Map<String, String> expressionAttributeNames = putItemRequest.getExpressionAttributeNames();
                jsonWriter.name("ExpressionAttributeNames");
                jsonWriter.beginObject();
                for (Map.Entry<String, String> entry3 : expressionAttributeNames.entrySet()) {
                    String value3 = entry3.getValue();
                    if (value3 != null) {
                        jsonWriter.name(entry3.getKey());
                        jsonWriter.value(value3);
                    }
                }
                jsonWriter.endObject();
            }
            if (putItemRequest.getExpressionAttributeValues() != null) {
                Map<String, AttributeValue> expressionAttributeValues = putItemRequest.getExpressionAttributeValues();
                jsonWriter.name("ExpressionAttributeValues");
                jsonWriter.beginObject();
                for (Map.Entry<String, AttributeValue> entry4 : expressionAttributeValues.entrySet()) {
                    AttributeValue value4 = entry4.getValue();
                    if (value4 != null) {
                        jsonWriter.name(entry4.getKey());
                        AttributeValueJsonMarshaller.getInstance().marshall(value4, jsonWriter);
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
