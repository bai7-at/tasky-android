package com.amazonaws.services.dynamodbv2.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public class UpdateTableRequest extends AmazonWebServiceRequest implements Serializable {
    private List<AttributeDefinition> attributeDefinitions;
    private List<GlobalSecondaryIndexUpdate> globalSecondaryIndexUpdates;
    private ProvisionedThroughput provisionedThroughput;
    private SSESpecification sSESpecification;
    private StreamSpecification streamSpecification;
    private String tableName;

    public UpdateTableRequest() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateTableRequest)) {
            return false;
        }
        UpdateTableRequest updateTableRequest = (UpdateTableRequest) obj;
        if ((updateTableRequest.getAttributeDefinitions() == null) ^ (getAttributeDefinitions() == null)) {
            return false;
        }
        if (updateTableRequest.getAttributeDefinitions() != null && !updateTableRequest.getAttributeDefinitions().equals(getAttributeDefinitions())) {
            return false;
        }
        if ((updateTableRequest.getTableName() == null) ^ (getTableName() == null)) {
            return false;
        }
        if (updateTableRequest.getTableName() != null && !updateTableRequest.getTableName().equals(getTableName())) {
            return false;
        }
        if ((updateTableRequest.getProvisionedThroughput() == null) ^ (getProvisionedThroughput() == null)) {
            return false;
        }
        if (updateTableRequest.getProvisionedThroughput() != null && !updateTableRequest.getProvisionedThroughput().equals(getProvisionedThroughput())) {
            return false;
        }
        if ((updateTableRequest.getGlobalSecondaryIndexUpdates() == null) ^ (getGlobalSecondaryIndexUpdates() == null)) {
            return false;
        }
        if (updateTableRequest.getGlobalSecondaryIndexUpdates() != null && !updateTableRequest.getGlobalSecondaryIndexUpdates().equals(getGlobalSecondaryIndexUpdates())) {
            return false;
        }
        if ((updateTableRequest.getStreamSpecification() == null) ^ (getStreamSpecification() == null)) {
            return false;
        }
        if (updateTableRequest.getStreamSpecification() != null && !updateTableRequest.getStreamSpecification().equals(getStreamSpecification())) {
            return false;
        }
        if ((updateTableRequest.getSSESpecification() == null) ^ (getSSESpecification() == null)) {
            return false;
        }
        return updateTableRequest.getSSESpecification() == null || updateTableRequest.getSSESpecification().equals(getSSESpecification());
    }

    public List<AttributeDefinition> getAttributeDefinitions() {
        return this.attributeDefinitions;
    }

    public List<GlobalSecondaryIndexUpdate> getGlobalSecondaryIndexUpdates() {
        return this.globalSecondaryIndexUpdates;
    }

    public ProvisionedThroughput getProvisionedThroughput() {
        return this.provisionedThroughput;
    }

    public SSESpecification getSSESpecification() {
        return this.sSESpecification;
    }

    public StreamSpecification getStreamSpecification() {
        return this.streamSpecification;
    }

    public String getTableName() {
        return this.tableName;
    }

    public int hashCode() {
        return (((((((((((getAttributeDefinitions() == null ? 0 : getAttributeDefinitions().hashCode()) + 31) * 31) + (getTableName() == null ? 0 : getTableName().hashCode())) * 31) + (getProvisionedThroughput() == null ? 0 : getProvisionedThroughput().hashCode())) * 31) + (getGlobalSecondaryIndexUpdates() == null ? 0 : getGlobalSecondaryIndexUpdates().hashCode())) * 31) + (getStreamSpecification() == null ? 0 : getStreamSpecification().hashCode())) * 31) + (getSSESpecification() != null ? getSSESpecification().hashCode() : 0);
    }

    public void setAttributeDefinitions(Collection<AttributeDefinition> collection) {
        if (collection == null) {
            this.attributeDefinitions = null;
        } else {
            this.attributeDefinitions = new ArrayList(collection);
        }
    }

    public void setGlobalSecondaryIndexUpdates(Collection<GlobalSecondaryIndexUpdate> collection) {
        if (collection == null) {
            this.globalSecondaryIndexUpdates = null;
        } else {
            this.globalSecondaryIndexUpdates = new ArrayList(collection);
        }
    }

    public void setProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }

    public void setSSESpecification(SSESpecification sSESpecification) {
        this.sSESpecification = sSESpecification;
    }

    public void setStreamSpecification(StreamSpecification streamSpecification) {
        this.streamSpecification = streamSpecification;
    }

    public void setTableName(String str) {
        this.tableName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAttributeDefinitions() != null) {
            sb.append("AttributeDefinitions: " + getAttributeDefinitions() + ",");
        }
        if (getTableName() != null) {
            sb.append("TableName: " + getTableName() + ",");
        }
        if (getProvisionedThroughput() != null) {
            sb.append("ProvisionedThroughput: " + getProvisionedThroughput() + ",");
        }
        if (getGlobalSecondaryIndexUpdates() != null) {
            sb.append("GlobalSecondaryIndexUpdates: " + getGlobalSecondaryIndexUpdates() + ",");
        }
        if (getStreamSpecification() != null) {
            sb.append("StreamSpecification: " + getStreamSpecification() + ",");
        }
        if (getSSESpecification() != null) {
            sb.append("SSESpecification: " + getSSESpecification());
        }
        sb.append("}");
        return sb.toString();
    }

    public UpdateTableRequest withAttributeDefinitions(AttributeDefinition... attributeDefinitionArr) {
        if (getAttributeDefinitions() == null) {
            this.attributeDefinitions = new ArrayList(attributeDefinitionArr.length);
        }
        for (AttributeDefinition attributeDefinition : attributeDefinitionArr) {
            this.attributeDefinitions.add(attributeDefinition);
        }
        return this;
    }

    public UpdateTableRequest withGlobalSecondaryIndexUpdates(GlobalSecondaryIndexUpdate... globalSecondaryIndexUpdateArr) {
        if (getGlobalSecondaryIndexUpdates() == null) {
            this.globalSecondaryIndexUpdates = new ArrayList(globalSecondaryIndexUpdateArr.length);
        }
        for (GlobalSecondaryIndexUpdate globalSecondaryIndexUpdate : globalSecondaryIndexUpdateArr) {
            this.globalSecondaryIndexUpdates.add(globalSecondaryIndexUpdate);
        }
        return this;
    }

    public UpdateTableRequest withProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
        return this;
    }

    public UpdateTableRequest withSSESpecification(SSESpecification sSESpecification) {
        this.sSESpecification = sSESpecification;
        return this;
    }

    public UpdateTableRequest withStreamSpecification(StreamSpecification streamSpecification) {
        this.streamSpecification = streamSpecification;
        return this;
    }

    public UpdateTableRequest withTableName(String str) {
        this.tableName = str;
        return this;
    }

    public UpdateTableRequest(String str, ProvisionedThroughput provisionedThroughput) {
        setTableName(str);
        setProvisionedThroughput(provisionedThroughput);
    }

    public UpdateTableRequest withAttributeDefinitions(Collection<AttributeDefinition> collection) {
        setAttributeDefinitions(collection);
        return this;
    }

    public UpdateTableRequest withGlobalSecondaryIndexUpdates(Collection<GlobalSecondaryIndexUpdate> collection) {
        setGlobalSecondaryIndexUpdates(collection);
        return this;
    }
}
