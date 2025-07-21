package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.Condition;
import com.amazonaws.services.dynamodbv2.model.QueryRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class QueryRequestMarshaller implements Marshaller<Request<QueryRequest>, QueryRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<QueryRequest> marshall(QueryRequest queryRequest) {
        if (queryRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(QueryRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(queryRequest, "AmazonDynamoDB");
        defaultRequest.addHeader("X-Amz-Target", "DynamoDB_20120810.Query");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (queryRequest.getTableName() != null) {
                String tableName = queryRequest.getTableName();
                jsonWriter.name("TableName");
                jsonWriter.value(tableName);
            }
            if (queryRequest.getIndexName() != null) {
                String indexName = queryRequest.getIndexName();
                jsonWriter.name("IndexName");
                jsonWriter.value(indexName);
            }
            if (queryRequest.getSelect() != null) {
                String select = queryRequest.getSelect();
                jsonWriter.name("Select");
                jsonWriter.value(select);
            }
            if (queryRequest.getAttributesToGet() != null) {
                List<String> attributesToGet = queryRequest.getAttributesToGet();
                jsonWriter.name("AttributesToGet");
                jsonWriter.beginArray();
                for (String str : attributesToGet) {
                    if (str != null) {
                        jsonWriter.value(str);
                    }
                }
                jsonWriter.endArray();
            }
            if (queryRequest.getLimit() != null) {
                Integer limit = queryRequest.getLimit();
                jsonWriter.name("Limit");
                jsonWriter.value(limit);
            }
            if (queryRequest.getConsistentRead() != null) {
                Boolean consistentRead = queryRequest.getConsistentRead();
                jsonWriter.name("ConsistentRead");
                jsonWriter.value(consistentRead.booleanValue());
            }
            if (queryRequest.getKeyConditions() != null) {
                Map<String, Condition> keyConditions = queryRequest.getKeyConditions();
                jsonWriter.name("KeyConditions");
                jsonWriter.beginObject();
                for (Map.Entry<String, Condition> entry : keyConditions.entrySet()) {
                    Condition value = entry.getValue();
                    if (value != null) {
                        jsonWriter.name(entry.getKey());
                        ConditionJsonMarshaller.getInstance().marshall(value, jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }
            if (queryRequest.getQueryFilter() != null) {
                Map<String, Condition> queryFilter = queryRequest.getQueryFilter();
                jsonWriter.name("QueryFilter");
                jsonWriter.beginObject();
                for (Map.Entry<String, Condition> entry2 : queryFilter.entrySet()) {
                    Condition value2 = entry2.getValue();
                    if (value2 != null) {
                        jsonWriter.name(entry2.getKey());
                        ConditionJsonMarshaller.getInstance().marshall(value2, jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }
            if (queryRequest.getConditionalOperator() != null) {
                String conditionalOperator = queryRequest.getConditionalOperator();
                jsonWriter.name("ConditionalOperator");
                jsonWriter.value(conditionalOperator);
            }
            if (queryRequest.getScanIndexForward() != null) {
                Boolean scanIndexForward = queryRequest.getScanIndexForward();
                jsonWriter.name("ScanIndexForward");
                jsonWriter.value(scanIndexForward.booleanValue());
            }
            if (queryRequest.getExclusiveStartKey() != null) {
                Map<String, AttributeValue> exclusiveStartKey = queryRequest.getExclusiveStartKey();
                jsonWriter.name("ExclusiveStartKey");
                jsonWriter.beginObject();
                for (Map.Entry<String, AttributeValue> entry3 : exclusiveStartKey.entrySet()) {
                    AttributeValue value3 = entry3.getValue();
                    if (value3 != null) {
                        jsonWriter.name(entry3.getKey());
                        AttributeValueJsonMarshaller.getInstance().marshall(value3, jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }
            if (queryRequest.getReturnConsumedCapacity() != null) {
                String returnConsumedCapacity = queryRequest.getReturnConsumedCapacity();
                jsonWriter.name("ReturnConsumedCapacity");
                jsonWriter.value(returnConsumedCapacity);
            }
            if (queryRequest.getProjectionExpression() != null) {
                String projectionExpression = queryRequest.getProjectionExpression();
                jsonWriter.name("ProjectionExpression");
                jsonWriter.value(projectionExpression);
            }
            if (queryRequest.getFilterExpression() != null) {
                String filterExpression = queryRequest.getFilterExpression();
                jsonWriter.name("FilterExpression");
                jsonWriter.value(filterExpression);
            }
            if (queryRequest.getKeyConditionExpression() != null) {
                String keyConditionExpression = queryRequest.getKeyConditionExpression();
                jsonWriter.name("KeyConditionExpression");
                jsonWriter.value(keyConditionExpression);
            }
            if (queryRequest.getExpressionAttributeNames() != null) {
                Map<String, String> expressionAttributeNames = queryRequest.getExpressionAttributeNames();
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
            if (queryRequest.getExpressionAttributeValues() != null) {
                Map<String, AttributeValue> expressionAttributeValues = queryRequest.getExpressionAttributeValues();
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
