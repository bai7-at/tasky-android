package com.amazonaws.services.dynamodbv2.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class PutItemRequest extends AmazonWebServiceRequest implements Serializable {
    private String conditionExpression;
    private String conditionalOperator;
    private Map<String, ExpectedAttributeValue> expected;
    private Map<String, String> expressionAttributeNames;
    private Map<String, AttributeValue> expressionAttributeValues;
    private Map<String, AttributeValue> item;
    private String returnConsumedCapacity;
    private String returnItemCollectionMetrics;
    private String returnValues;
    private String tableName;

    public PutItemRequest() {
    }

    public PutItemRequest addExpectedEntry(String str, ExpectedAttributeValue expectedAttributeValue) {
        if (this.expected == null) {
            this.expected = new HashMap();
        }
        if (!this.expected.containsKey(str)) {
            this.expected.put(str, expectedAttributeValue);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public PutItemRequest addExpressionAttributeNamesEntry(String str, String str2) {
        if (this.expressionAttributeNames == null) {
            this.expressionAttributeNames = new HashMap();
        }
        if (!this.expressionAttributeNames.containsKey(str)) {
            this.expressionAttributeNames.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public PutItemRequest addExpressionAttributeValuesEntry(String str, AttributeValue attributeValue) {
        if (this.expressionAttributeValues == null) {
            this.expressionAttributeValues = new HashMap();
        }
        if (!this.expressionAttributeValues.containsKey(str)) {
            this.expressionAttributeValues.put(str, attributeValue);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public PutItemRequest addItemEntry(String str, AttributeValue attributeValue) {
        if (this.item == null) {
            this.item = new HashMap();
        }
        if (!this.item.containsKey(str)) {
            this.item.put(str, attributeValue);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public PutItemRequest clearExpectedEntries() {
        this.expected = null;
        return this;
    }

    public PutItemRequest clearExpressionAttributeNamesEntries() {
        this.expressionAttributeNames = null;
        return this;
    }

    public PutItemRequest clearExpressionAttributeValuesEntries() {
        this.expressionAttributeValues = null;
        return this;
    }

    public PutItemRequest clearItemEntries() {
        this.item = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PutItemRequest)) {
            return false;
        }
        PutItemRequest putItemRequest = (PutItemRequest) obj;
        if ((putItemRequest.getTableName() == null) ^ (getTableName() == null)) {
            return false;
        }
        if (putItemRequest.getTableName() != null && !putItemRequest.getTableName().equals(getTableName())) {
            return false;
        }
        if ((putItemRequest.getItem() == null) ^ (getItem() == null)) {
            return false;
        }
        if (putItemRequest.getItem() != null && !putItemRequest.getItem().equals(getItem())) {
            return false;
        }
        if ((putItemRequest.getExpected() == null) ^ (getExpected() == null)) {
            return false;
        }
        if (putItemRequest.getExpected() != null && !putItemRequest.getExpected().equals(getExpected())) {
            return false;
        }
        if ((putItemRequest.getReturnValues() == null) ^ (getReturnValues() == null)) {
            return false;
        }
        if (putItemRequest.getReturnValues() != null && !putItemRequest.getReturnValues().equals(getReturnValues())) {
            return false;
        }
        if ((putItemRequest.getReturnConsumedCapacity() == null) ^ (getReturnConsumedCapacity() == null)) {
            return false;
        }
        if (putItemRequest.getReturnConsumedCapacity() != null && !putItemRequest.getReturnConsumedCapacity().equals(getReturnConsumedCapacity())) {
            return false;
        }
        if ((putItemRequest.getReturnItemCollectionMetrics() == null) ^ (getReturnItemCollectionMetrics() == null)) {
            return false;
        }
        if (putItemRequest.getReturnItemCollectionMetrics() != null && !putItemRequest.getReturnItemCollectionMetrics().equals(getReturnItemCollectionMetrics())) {
            return false;
        }
        if ((putItemRequest.getConditionalOperator() == null) ^ (getConditionalOperator() == null)) {
            return false;
        }
        if (putItemRequest.getConditionalOperator() != null && !putItemRequest.getConditionalOperator().equals(getConditionalOperator())) {
            return false;
        }
        if ((putItemRequest.getConditionExpression() == null) ^ (getConditionExpression() == null)) {
            return false;
        }
        if (putItemRequest.getConditionExpression() != null && !putItemRequest.getConditionExpression().equals(getConditionExpression())) {
            return false;
        }
        if ((putItemRequest.getExpressionAttributeNames() == null) ^ (getExpressionAttributeNames() == null)) {
            return false;
        }
        if (putItemRequest.getExpressionAttributeNames() != null && !putItemRequest.getExpressionAttributeNames().equals(getExpressionAttributeNames())) {
            return false;
        }
        if ((putItemRequest.getExpressionAttributeValues() == null) ^ (getExpressionAttributeValues() == null)) {
            return false;
        }
        return putItemRequest.getExpressionAttributeValues() == null || putItemRequest.getExpressionAttributeValues().equals(getExpressionAttributeValues());
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

    public Map<String, AttributeValue> getItem() {
        return this.item;
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
        return (((((((((((((((((((getTableName() == null ? 0 : getTableName().hashCode()) + 31) * 31) + (getItem() == null ? 0 : getItem().hashCode())) * 31) + (getExpected() == null ? 0 : getExpected().hashCode())) * 31) + (getReturnValues() == null ? 0 : getReturnValues().hashCode())) * 31) + (getReturnConsumedCapacity() == null ? 0 : getReturnConsumedCapacity().hashCode())) * 31) + (getReturnItemCollectionMetrics() == null ? 0 : getReturnItemCollectionMetrics().hashCode())) * 31) + (getConditionalOperator() == null ? 0 : getConditionalOperator().hashCode())) * 31) + (getConditionExpression() == null ? 0 : getConditionExpression().hashCode())) * 31) + (getExpressionAttributeNames() == null ? 0 : getExpressionAttributeNames().hashCode())) * 31) + (getExpressionAttributeValues() != null ? getExpressionAttributeValues().hashCode() : 0);
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

    public void setItem(Map<String, AttributeValue> map) {
        this.item = map;
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
        if (getItem() != null) {
            sb.append("Item: " + getItem() + ",");
        }
        if (getExpected() != null) {
            sb.append("Expected: " + getExpected() + ",");
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
        if (getConditionalOperator() != null) {
            sb.append("ConditionalOperator: " + getConditionalOperator() + ",");
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

    public PutItemRequest withConditionExpression(String str) {
        this.conditionExpression = str;
        return this;
    }

    public PutItemRequest withConditionalOperator(String str) {
        this.conditionalOperator = str;
        return this;
    }

    public PutItemRequest withExpected(Map<String, ExpectedAttributeValue> map) {
        this.expected = map;
        return this;
    }

    public PutItemRequest withExpressionAttributeNames(Map<String, String> map) {
        this.expressionAttributeNames = map;
        return this;
    }

    public PutItemRequest withExpressionAttributeValues(Map<String, AttributeValue> map) {
        this.expressionAttributeValues = map;
        return this;
    }

    public PutItemRequest withItem(Map<String, AttributeValue> map) {
        this.item = map;
        return this;
    }

    public PutItemRequest withReturnConsumedCapacity(String str) {
        this.returnConsumedCapacity = str;
        return this;
    }

    public PutItemRequest withReturnItemCollectionMetrics(String str) {
        this.returnItemCollectionMetrics = str;
        return this;
    }

    public PutItemRequest withReturnValues(String str) {
        this.returnValues = str;
        return this;
    }

    public PutItemRequest withTableName(String str) {
        this.tableName = str;
        return this;
    }

    public PutItemRequest(String str, Map<String, AttributeValue> map) {
        setTableName(str);
        setItem(map);
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

    public PutItemRequest withConditionalOperator(ConditionalOperator conditionalOperator) {
        this.conditionalOperator = conditionalOperator.toString();
        return this;
    }

    public PutItemRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
        return this;
    }

    public PutItemRequest withReturnItemCollectionMetrics(ReturnItemCollectionMetrics returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics.toString();
        return this;
    }

    public PutItemRequest withReturnValues(ReturnValue returnValue) {
        this.returnValues = returnValue.toString();
        return this;
    }

    public PutItemRequest(String str, Map<String, AttributeValue> map, String str2) {
        setTableName(str);
        setItem(map);
        setReturnValues(str2);
    }

    public PutItemRequest(String str, Map<String, AttributeValue> map, ReturnValue returnValue) {
        setTableName(str);
        setItem(map);
        setReturnValues(returnValue.toString());
    }
}
