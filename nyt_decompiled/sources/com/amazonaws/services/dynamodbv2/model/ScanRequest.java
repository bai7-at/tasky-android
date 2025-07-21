package com.amazonaws.services.dynamodbv2.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class ScanRequest extends AmazonWebServiceRequest implements Serializable {
    private List<String> attributesToGet;
    private String conditionalOperator;
    private Boolean consistentRead;
    private Map<String, AttributeValue> exclusiveStartKey;
    private Map<String, String> expressionAttributeNames;
    private Map<String, AttributeValue> expressionAttributeValues;
    private String filterExpression;
    private String indexName;
    private Integer limit;
    private String projectionExpression;
    private String returnConsumedCapacity;
    private Map<String, Condition> scanFilter;
    private Integer segment;
    private String select;
    private String tableName;
    private Integer totalSegments;

    public ScanRequest() {
    }

    public ScanRequest addExclusiveStartKeyEntry(String str, AttributeValue attributeValue) {
        if (this.exclusiveStartKey == null) {
            this.exclusiveStartKey = new HashMap();
        }
        if (!this.exclusiveStartKey.containsKey(str)) {
            this.exclusiveStartKey.put(str, attributeValue);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public ScanRequest addExpressionAttributeNamesEntry(String str, String str2) {
        if (this.expressionAttributeNames == null) {
            this.expressionAttributeNames = new HashMap();
        }
        if (!this.expressionAttributeNames.containsKey(str)) {
            this.expressionAttributeNames.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public ScanRequest addExpressionAttributeValuesEntry(String str, AttributeValue attributeValue) {
        if (this.expressionAttributeValues == null) {
            this.expressionAttributeValues = new HashMap();
        }
        if (!this.expressionAttributeValues.containsKey(str)) {
            this.expressionAttributeValues.put(str, attributeValue);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public ScanRequest addScanFilterEntry(String str, Condition condition) {
        if (this.scanFilter == null) {
            this.scanFilter = new HashMap();
        }
        if (!this.scanFilter.containsKey(str)) {
            this.scanFilter.put(str, condition);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public ScanRequest clearExclusiveStartKeyEntries() {
        this.exclusiveStartKey = null;
        return this;
    }

    public ScanRequest clearExpressionAttributeNamesEntries() {
        this.expressionAttributeNames = null;
        return this;
    }

    public ScanRequest clearExpressionAttributeValuesEntries() {
        this.expressionAttributeValues = null;
        return this;
    }

    public ScanRequest clearScanFilterEntries() {
        this.scanFilter = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ScanRequest)) {
            return false;
        }
        ScanRequest scanRequest = (ScanRequest) obj;
        if ((scanRequest.getTableName() == null) ^ (getTableName() == null)) {
            return false;
        }
        if (scanRequest.getTableName() != null && !scanRequest.getTableName().equals(getTableName())) {
            return false;
        }
        if ((scanRequest.getIndexName() == null) ^ (getIndexName() == null)) {
            return false;
        }
        if (scanRequest.getIndexName() != null && !scanRequest.getIndexName().equals(getIndexName())) {
            return false;
        }
        if ((scanRequest.getAttributesToGet() == null) ^ (getAttributesToGet() == null)) {
            return false;
        }
        if (scanRequest.getAttributesToGet() != null && !scanRequest.getAttributesToGet().equals(getAttributesToGet())) {
            return false;
        }
        if ((scanRequest.getLimit() == null) ^ (getLimit() == null)) {
            return false;
        }
        if (scanRequest.getLimit() != null && !scanRequest.getLimit().equals(getLimit())) {
            return false;
        }
        if ((scanRequest.getSelect() == null) ^ (getSelect() == null)) {
            return false;
        }
        if (scanRequest.getSelect() != null && !scanRequest.getSelect().equals(getSelect())) {
            return false;
        }
        if ((scanRequest.getScanFilter() == null) ^ (getScanFilter() == null)) {
            return false;
        }
        if (scanRequest.getScanFilter() != null && !scanRequest.getScanFilter().equals(getScanFilter())) {
            return false;
        }
        if ((scanRequest.getConditionalOperator() == null) ^ (getConditionalOperator() == null)) {
            return false;
        }
        if (scanRequest.getConditionalOperator() != null && !scanRequest.getConditionalOperator().equals(getConditionalOperator())) {
            return false;
        }
        if ((scanRequest.getExclusiveStartKey() == null) ^ (getExclusiveStartKey() == null)) {
            return false;
        }
        if (scanRequest.getExclusiveStartKey() != null && !scanRequest.getExclusiveStartKey().equals(getExclusiveStartKey())) {
            return false;
        }
        if ((scanRequest.getReturnConsumedCapacity() == null) ^ (getReturnConsumedCapacity() == null)) {
            return false;
        }
        if (scanRequest.getReturnConsumedCapacity() != null && !scanRequest.getReturnConsumedCapacity().equals(getReturnConsumedCapacity())) {
            return false;
        }
        if ((scanRequest.getTotalSegments() == null) ^ (getTotalSegments() == null)) {
            return false;
        }
        if (scanRequest.getTotalSegments() != null && !scanRequest.getTotalSegments().equals(getTotalSegments())) {
            return false;
        }
        if ((scanRequest.getSegment() == null) ^ (getSegment() == null)) {
            return false;
        }
        if (scanRequest.getSegment() != null && !scanRequest.getSegment().equals(getSegment())) {
            return false;
        }
        if ((scanRequest.getProjectionExpression() == null) ^ (getProjectionExpression() == null)) {
            return false;
        }
        if (scanRequest.getProjectionExpression() != null && !scanRequest.getProjectionExpression().equals(getProjectionExpression())) {
            return false;
        }
        if ((scanRequest.getFilterExpression() == null) ^ (getFilterExpression() == null)) {
            return false;
        }
        if (scanRequest.getFilterExpression() != null && !scanRequest.getFilterExpression().equals(getFilterExpression())) {
            return false;
        }
        if ((scanRequest.getExpressionAttributeNames() == null) ^ (getExpressionAttributeNames() == null)) {
            return false;
        }
        if (scanRequest.getExpressionAttributeNames() != null && !scanRequest.getExpressionAttributeNames().equals(getExpressionAttributeNames())) {
            return false;
        }
        if ((scanRequest.getExpressionAttributeValues() == null) ^ (getExpressionAttributeValues() == null)) {
            return false;
        }
        if (scanRequest.getExpressionAttributeValues() != null && !scanRequest.getExpressionAttributeValues().equals(getExpressionAttributeValues())) {
            return false;
        }
        if ((scanRequest.getConsistentRead() == null) ^ (getConsistentRead() == null)) {
            return false;
        }
        return scanRequest.getConsistentRead() == null || scanRequest.getConsistentRead().equals(getConsistentRead());
    }

    public List<String> getAttributesToGet() {
        return this.attributesToGet;
    }

    public String getConditionalOperator() {
        return this.conditionalOperator;
    }

    public Boolean getConsistentRead() {
        return this.consistentRead;
    }

    public Map<String, AttributeValue> getExclusiveStartKey() {
        return this.exclusiveStartKey;
    }

    public Map<String, String> getExpressionAttributeNames() {
        return this.expressionAttributeNames;
    }

    public Map<String, AttributeValue> getExpressionAttributeValues() {
        return this.expressionAttributeValues;
    }

    public String getFilterExpression() {
        return this.filterExpression;
    }

    public String getIndexName() {
        return this.indexName;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public String getProjectionExpression() {
        return this.projectionExpression;
    }

    public String getReturnConsumedCapacity() {
        return this.returnConsumedCapacity;
    }

    public Map<String, Condition> getScanFilter() {
        return this.scanFilter;
    }

    public Integer getSegment() {
        return this.segment;
    }

    public String getSelect() {
        return this.select;
    }

    public String getTableName() {
        return this.tableName;
    }

    public Integer getTotalSegments() {
        return this.totalSegments;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((getTableName() == null ? 0 : getTableName().hashCode()) + 31) * 31) + (getIndexName() == null ? 0 : getIndexName().hashCode())) * 31) + (getAttributesToGet() == null ? 0 : getAttributesToGet().hashCode())) * 31) + (getLimit() == null ? 0 : getLimit().hashCode())) * 31) + (getSelect() == null ? 0 : getSelect().hashCode())) * 31) + (getScanFilter() == null ? 0 : getScanFilter().hashCode())) * 31) + (getConditionalOperator() == null ? 0 : getConditionalOperator().hashCode())) * 31) + (getExclusiveStartKey() == null ? 0 : getExclusiveStartKey().hashCode())) * 31) + (getReturnConsumedCapacity() == null ? 0 : getReturnConsumedCapacity().hashCode())) * 31) + (getTotalSegments() == null ? 0 : getTotalSegments().hashCode())) * 31) + (getSegment() == null ? 0 : getSegment().hashCode())) * 31) + (getProjectionExpression() == null ? 0 : getProjectionExpression().hashCode())) * 31) + (getFilterExpression() == null ? 0 : getFilterExpression().hashCode())) * 31) + (getExpressionAttributeNames() == null ? 0 : getExpressionAttributeNames().hashCode())) * 31) + (getExpressionAttributeValues() == null ? 0 : getExpressionAttributeValues().hashCode())) * 31) + (getConsistentRead() != null ? getConsistentRead().hashCode() : 0);
    }

    public Boolean isConsistentRead() {
        return this.consistentRead;
    }

    public void setAttributesToGet(Collection<String> collection) {
        if (collection == null) {
            this.attributesToGet = null;
        } else {
            this.attributesToGet = new ArrayList(collection);
        }
    }

    public void setConditionalOperator(String str) {
        this.conditionalOperator = str;
    }

    public void setConsistentRead(Boolean bool) {
        this.consistentRead = bool;
    }

    public void setExclusiveStartKey(Map<String, AttributeValue> map) {
        this.exclusiveStartKey = map;
    }

    public void setExpressionAttributeNames(Map<String, String> map) {
        this.expressionAttributeNames = map;
    }

    public void setExpressionAttributeValues(Map<String, AttributeValue> map) {
        this.expressionAttributeValues = map;
    }

    public void setFilterExpression(String str) {
        this.filterExpression = str;
    }

    public void setIndexName(String str) {
        this.indexName = str;
    }

    public void setLimit(Integer num) {
        this.limit = num;
    }

    public void setProjectionExpression(String str) {
        this.projectionExpression = str;
    }

    public void setReturnConsumedCapacity(String str) {
        this.returnConsumedCapacity = str;
    }

    public void setScanFilter(Map<String, Condition> map) {
        this.scanFilter = map;
    }

    public void setSegment(Integer num) {
        this.segment = num;
    }

    public void setSelect(String str) {
        this.select = str;
    }

    public void setTableName(String str) {
        this.tableName = str;
    }

    public void setTotalSegments(Integer num) {
        this.totalSegments = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTableName() != null) {
            sb.append("TableName: " + getTableName() + ",");
        }
        if (getIndexName() != null) {
            sb.append("IndexName: " + getIndexName() + ",");
        }
        if (getAttributesToGet() != null) {
            sb.append("AttributesToGet: " + getAttributesToGet() + ",");
        }
        if (getLimit() != null) {
            sb.append("Limit: " + getLimit() + ",");
        }
        if (getSelect() != null) {
            sb.append("Select: " + getSelect() + ",");
        }
        if (getScanFilter() != null) {
            sb.append("ScanFilter: " + getScanFilter() + ",");
        }
        if (getConditionalOperator() != null) {
            sb.append("ConditionalOperator: " + getConditionalOperator() + ",");
        }
        if (getExclusiveStartKey() != null) {
            sb.append("ExclusiveStartKey: " + getExclusiveStartKey() + ",");
        }
        if (getReturnConsumedCapacity() != null) {
            sb.append("ReturnConsumedCapacity: " + getReturnConsumedCapacity() + ",");
        }
        if (getTotalSegments() != null) {
            sb.append("TotalSegments: " + getTotalSegments() + ",");
        }
        if (getSegment() != null) {
            sb.append("Segment: " + getSegment() + ",");
        }
        if (getProjectionExpression() != null) {
            sb.append("ProjectionExpression: " + getProjectionExpression() + ",");
        }
        if (getFilterExpression() != null) {
            sb.append("FilterExpression: " + getFilterExpression() + ",");
        }
        if (getExpressionAttributeNames() != null) {
            sb.append("ExpressionAttributeNames: " + getExpressionAttributeNames() + ",");
        }
        if (getExpressionAttributeValues() != null) {
            sb.append("ExpressionAttributeValues: " + getExpressionAttributeValues() + ",");
        }
        if (getConsistentRead() != null) {
            sb.append("ConsistentRead: " + getConsistentRead());
        }
        sb.append("}");
        return sb.toString();
    }

    public ScanRequest withAttributesToGet(String... strArr) {
        if (getAttributesToGet() == null) {
            this.attributesToGet = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.attributesToGet.add(str);
        }
        return this;
    }

    public ScanRequest withConditionalOperator(String str) {
        this.conditionalOperator = str;
        return this;
    }

    public ScanRequest withConsistentRead(Boolean bool) {
        this.consistentRead = bool;
        return this;
    }

    public ScanRequest withExclusiveStartKey(Map<String, AttributeValue> map) {
        this.exclusiveStartKey = map;
        return this;
    }

    public ScanRequest withExpressionAttributeNames(Map<String, String> map) {
        this.expressionAttributeNames = map;
        return this;
    }

    public ScanRequest withExpressionAttributeValues(Map<String, AttributeValue> map) {
        this.expressionAttributeValues = map;
        return this;
    }

    public ScanRequest withFilterExpression(String str) {
        this.filterExpression = str;
        return this;
    }

    public ScanRequest withIndexName(String str) {
        this.indexName = str;
        return this;
    }

    public ScanRequest withLimit(Integer num) {
        this.limit = num;
        return this;
    }

    public ScanRequest withProjectionExpression(String str) {
        this.projectionExpression = str;
        return this;
    }

    public ScanRequest withReturnConsumedCapacity(String str) {
        this.returnConsumedCapacity = str;
        return this;
    }

    public ScanRequest withScanFilter(Map<String, Condition> map) {
        this.scanFilter = map;
        return this;
    }

    public ScanRequest withSegment(Integer num) {
        this.segment = num;
        return this;
    }

    public ScanRequest withSelect(String str) {
        this.select = str;
        return this;
    }

    public ScanRequest withTableName(String str) {
        this.tableName = str;
        return this;
    }

    public ScanRequest withTotalSegments(Integer num) {
        this.totalSegments = num;
        return this;
    }

    public ScanRequest(String str) {
        setTableName(str);
    }

    public void setConditionalOperator(ConditionalOperator conditionalOperator) {
        this.conditionalOperator = conditionalOperator.toString();
    }

    public void setReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
    }

    public void setSelect(Select select) {
        this.select = select.toString();
    }

    public ScanRequest withConditionalOperator(ConditionalOperator conditionalOperator) {
        this.conditionalOperator = conditionalOperator.toString();
        return this;
    }

    public ScanRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
        return this;
    }

    public ScanRequest withSelect(Select select) {
        this.select = select.toString();
        return this;
    }

    public ScanRequest withAttributesToGet(Collection<String> collection) {
        setAttributesToGet(collection);
        return this;
    }
}
