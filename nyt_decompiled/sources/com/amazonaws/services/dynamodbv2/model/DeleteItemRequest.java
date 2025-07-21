package com.amazonaws.services.dynamodbv2.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class DeleteItemRequest extends AmazonWebServiceRequest implements Serializable {
    private String conditionExpression;
    private String conditionalOperator;
    private Map<String, ExpectedAttributeValue> expected;
    private Map<String, String> expressionAttributeNames;
    private Map<String, AttributeValue> expressionAttributeValues;
    private Map<String, AttributeValue> key;
    private String returnConsumedCapacity;
    private String returnItemCollectionMetrics;
    private String returnValues;
    private String tableName;

    public DeleteItemRequest() {
    }

    public DeleteItemRequest addExpectedEntry(String str, ExpectedAttributeValue expectedAttributeValue) {
        if (this.expected == null) {
            this.expected = new HashMap();
        }
        if (!this.expected.containsKey(str)) {
            this.expected.put(str, expectedAttributeValue);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public DeleteItemRequest addExpressionAttributeNamesEntry(String str, String str2) {
        if (this.expressionAttributeNames == null) {
            this.expressionAttributeNames = new HashMap();
        }
        if (!this.expressionAttributeNames.containsKey(str)) {
            this.expressionAttributeNames.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public DeleteItemRequest addExpressionAttributeValuesEntry(String str, AttributeValue attributeValue) {
        if (this.expressionAttributeValues == null) {
            this.expressionAttributeValues = new HashMap();
        }
        if (!this.expressionAttributeValues.containsKey(str)) {
            this.expressionAttributeValues.put(str, attributeValue);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public DeleteItemRequest addKeyEntry(String str, AttributeValue attributeValue) {
        if (this.key == null) {
            this.key = new HashMap();
        }
        if (!this.key.containsKey(str)) {
            this.key.put(str, attributeValue);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public DeleteItemRequest clearExpectedEntries() {
        this.expected = null;
        return this;
    }

    public DeleteItemRequest clearExpressionAttributeNamesEntries() {
        this.expressionAttributeNames = null;
        return this;
    }

    public DeleteItemRequest clearExpressionAttributeValuesEntries() {
        this.expressionAttributeValues = null;
        return this;
    }

    public DeleteItemRequest clearKeyEntries() {
        this.key = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteItemRequest)) {
            return false;
        }
        DeleteItemRequest deleteItemRequest = (DeleteItemRequest) obj;
        if ((deleteItemRequest.getTableName() == null) ^ (getTableName() == null)) {
            return false;
        }
        if (deleteItemRequest.getTableName() != null && !deleteItemRequest.getTableName().equals(getTableName())) {
            return false;
        }
        if ((deleteItemRequest.getKey() == null) ^ (getKey() == null)) {
            return false;
        }
        if (deleteItemRequest.getKey() != null && !deleteItemRequest.getKey().equals(getKey())) {
            return false;
        }
        if ((deleteItemRequest.getExpected() == null) ^ (getExpected() == null)) {
            return false;
        }
        if (deleteItemRequest.getExpected() != null && !deleteItemRequest.getExpected().equals(getExpected())) {
            return false;
        }
        if ((deleteItemRequest.getConditionalOperator() == null) ^ (getConditionalOperator() == null)) {
            return false;
        }
        if (deleteItemRequest.getConditionalOperator() != null && !deleteItemRequest.getConditionalOperator().equals(getConditionalOperator())) {
            return false;
        }
        if ((deleteItemRequest.getReturnValues() == null) ^ (getReturnValues() == null)) {
            return false;
        }
        if (deleteItemRequest.getReturnValues() != null && !deleteItemRequest.getReturnValues().equals(getReturnValues())) {
            return false;
        }
        if ((deleteItemRequest.getReturnConsumedCapacity() == null) ^ (getReturnConsumedCapacity() == null)) {
            return false;
        }
        if (deleteItemRequest.getReturnConsumedCapacity() != null && !deleteItemRequest.getReturnConsumedCapacity().equals(getReturnConsumedCapacity())) {
            return false;
        }
        if ((deleteItemRequest.getReturnItemCollectionMetrics() == null) ^ (getReturnItemCollectionMetrics() == null)) {
            return false;
        }
        if (deleteItemRequest.getReturnItemCollectionMetrics() != null && !deleteItemRequest.getReturnItemCollectionMetrics().equals(getReturnItemCollectionMetrics())) {
            return false;
        }
        if ((deleteItemRequest.getConditionExpression() == null) ^ (getConditionExpression() == null)) {
            return false;
        }
        if (deleteItemRequest.getConditionExpression() != null && !deleteItemRequest.getConditionExpression().equals(getConditionExpression())) {
            return false;
        }
        if ((deleteItemRequest.getExpressionAttributeNames() == null) ^ (getExpressionAttributeNames() == null)) {
            return false;
        }
        if (deleteItemRequest.getExpressionAttributeNames() != null && !deleteItemRequest.getExpressionAttributeNames().equals(getExpressionAttributeNames())) {
            return false;
        }
        if ((deleteItemRequest.getExpressionAttributeValues() == null) ^ (getExpressionAttributeValues() == null)) {
            return false;
        }
        return deleteItemRequest.getExpressionAttributeValues() == null || deleteItemRequest.getExpressionAttributeValues().equals(getExpressionAttributeValues());
    }

    public String getConditionExpression() {
        return this.conditionExpression;
    }

    public String getConditionalOperator() {
        return this.conditionalOperator;
    }

    public Map<String, ExpectedAttributeValue> getExpected() {
        return this.expected;
    }

    public Map<String, String> getExpressionAttributeNames() {
        return this.expressionAttributeNames;
    }

    public Map<String, AttributeValue> getExpressionAttributeValues() {
        return this.expressionAttributeValues;
    }

    public Map<String, AttributeValue> getKey() {
        return this.key;
    }

    public String getReturnConsumedCapacity() {
        return this.returnConsumedCapacity;
    }

    public String getReturnItemCollectionMetrics() {
        return this.returnItemCollectionMetrics;
    }

    public String getReturnValues() {
        return this.returnValues;
    }

    public String getTableName() {
        return this.tableName;
    }

    public int hashCode() {
        return (((((((((((((((((((getTableName() == null ? 0 : getTableName().hashCode()) + 31) * 31) + (getKey() == null ? 0 : getKey().hashCode())) * 31) + (getExpected() == null ? 0 : getExpected().hashCode())) * 31) + (getConditionalOperator() == null ? 0 : getConditionalOperator().hashCode())) * 31) + (getReturnValues() == null ? 0 : getReturnValues().hashCode())) * 31) + (getReturnConsumedCapacity() == null ? 0 : getReturnConsumedCapacity().hashCode())) * 31) + (getReturnItemCollectionMetrics() == null ? 0 : getReturnItemCollectionMetrics().hashCode())) * 31) + (getConditionExpression() == null ? 0 : getConditionExpression().hashCode())) * 31) + (getExpressionAttributeNames() == null ? 0 : getExpressionAttributeNames().hashCode())) * 31) + (getExpressionAttributeValues() != null ? getExpressionAttributeValues().hashCode() : 0);
    }

    public void setConditionExpression(String str) {
        this.conditionExpression = str;
    }

    public void setConditionalOperator(String str) {
        this.conditionalOperator = str;
    }

    public void setExpected(Map<String, ExpectedAttributeValue> map) {
        this.expected = map;
    }

    public void setExpressionAttributeNames(Map<String, String> map) {
        this.expressionAttributeNames = map;
    }

    public void setExpressionAttributeValues(Map<String, AttributeValue> map) {
        this.expressionAttributeValues = map;
    }

    public void setKey(Map<String, AttributeValue> map) {
        this.key = map;
    }

    public void setReturnConsumedCapacity(String str) {
        this.returnConsumedCapacity = str;
    }

    public void setReturnItemCollectionMetrics(String str) {
        this.returnItemCollectionMetrics = str;
    }

    public void setReturnValues(String str) {
        this.returnValues = str;
    }

    public void setTableName(String str) {
        this.tableName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTableName() != null) {
            sb.append("TableName: " + getTableName() + ",");
        }
        if (getKey() != null) {
            sb.append("Key: " + getKey() + ",");
        }
        if (getExpected() != null) {
            sb.append("Expected: " + getExpected() + ",");
        }
        if (getConditionalOperator() != null) {
            sb.append("ConditionalOperator: " + getConditionalOperator() + ",");
        }
        if (getReturnValues() != null) {
            sb.append("ReturnValues: " + getReturnValues() + ",");
        }
        if (getReturnConsumedCapacity() != null) {
            sb.append("ReturnConsumedCapacity: " + getReturnConsumedCapacity() + ",");
        }
        if (getReturnItemCollectionMetrics() != null) {
            sb.append("ReturnItemCollectionMetrics: " + getReturnItemCollectionMetrics() + ",");
        }
        if (getConditionExpression() != null) {
            sb.append("ConditionExpression: " + getConditionExpression() + ",");
        }
        if (getExpressionAttributeNames() != null) {
            sb.append("ExpressionAttributeNames: " + getExpressionAttributeNames() + ",");
        }
        if (getExpressionAttributeValues() != null) {
            sb.append("ExpressionAttributeValues: " + getExpressionAttributeValues());
        }
        sb.append("}");
        return sb.toString();
    }

    public DeleteItemRequest withConditionExpression(String str) {
        this.conditionExpression = str;
        return this;
    }

    public DeleteItemRequest withConditionalOperator(String str) {
        this.conditionalOperator = str;
        return this;
    }

    public DeleteItemRequest withExpected(Map<String, ExpectedAttributeValue> map) {
        this.expected = map;
        return this;
    }

    public DeleteItemRequest withExpressionAttributeNames(Map<String, String> map) {
        this.expressionAttributeNames = map;
        return this;
    }

    public DeleteItemRequest withExpressionAttributeValues(Map<String, AttributeValue> map) {
        this.expressionAttributeValues = map;
        return this;
    }

    public DeleteItemRequest withKey(Map<String, AttributeValue> map) {
        this.key = map;
        return this;
    }

    public DeleteItemRequest withReturnConsumedCapacity(String str) {
        this.returnConsumedCapacity = str;
        return this;
    }

    public DeleteItemRequest withReturnItemCollectionMetrics(String str) {
        this.returnItemCollectionMetrics = str;
        return this;
    }

    public DeleteItemRequest withReturnValues(String str) {
        this.returnValues = str;
        return this;
    }

    public DeleteItemRequest withTableName(String str) {
        this.tableName = str;
        return this;
    }

    public DeleteItemRequest(String str, Map<String, AttributeValue> map) {
        setTableName(str);
        setKey(map);
    }

    public void setConditionalOperator(ConditionalOperator conditionalOperator) {
        this.conditionalOperator = conditionalOperator.toString();
    }

    public void setReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
    }

    public void setReturnItemCollectionMetrics(ReturnItemCollectionMetrics returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics.toString();
    }

    public void setReturnValues(ReturnValue returnValue) {
        this.returnValues = returnValue.toString();
    }

    public DeleteItemRequest withConditionalOperator(ConditionalOperator conditionalOperator) {
        this.conditionalOperator = conditionalOperator.toString();
        return this;
    }

    public DeleteItemRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
        return this;
    }

    public DeleteItemRequest withReturnItemCollectionMetrics(ReturnItemCollectionMetrics returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics.toString();
        return this;
    }

    public DeleteItemRequest withReturnValues(ReturnValue returnValue) {
        this.returnValues = returnValue.toString();
        return this;
    }

    public DeleteItemRequest(String str, Map<String, AttributeValue> map, String str2) {
        setTableName(str);
        setKey(map);
        setReturnValues(str2);
    }

    public DeleteItemRequest(String str, Map<String, AttributeValue> map, ReturnValue returnValue) {
        setTableName(str);
        setKey(map);
        setReturnValues(returnValue.toString());
    }
}
