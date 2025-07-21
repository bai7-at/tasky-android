package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class TableDescription implements Serializable {
    private List<AttributeDefinition> attributeDefinitions;
    private Date creationDateTime;
    private List<GlobalSecondaryIndexDescription> globalSecondaryIndexes;
    private Long itemCount;
    private List<KeySchemaElement> keySchema;
    private String latestStreamArn;
    private String latestStreamLabel;
    private List<LocalSecondaryIndexDescription> localSecondaryIndexes;
    private ProvisionedThroughputDescription provisionedThroughput;
    private RestoreSummary restoreSummary;
    private SSEDescription sSEDescription;
    private StreamSpecification streamSpecification;
    private String tableArn;
    private String tableId;
    private String tableName;
    private Long tableSizeBytes;
    private String tableStatus;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TableDescription)) {
            return false;
        }
        TableDescription tableDescription = (TableDescription) obj;
        if ((tableDescription.getAttributeDefinitions() == null) ^ (getAttributeDefinitions() == null)) {
            return false;
        }
        if (tableDescription.getAttributeDefinitions() != null && !tableDescription.getAttributeDefinitions().equals(getAttributeDefinitions())) {
            return false;
        }
        if ((tableDescription.getTableName() == null) ^ (getTableName() == null)) {
            return false;
        }
        if (tableDescription.getTableName() != null && !tableDescription.getTableName().equals(getTableName())) {
            return false;
        }
        if ((tableDescription.getKeySchema() == null) ^ (getKeySchema() == null)) {
            return false;
        }
        if (tableDescription.getKeySchema() != null && !tableDescription.getKeySchema().equals(getKeySchema())) {
            return false;
        }
        if ((tableDescription.getTableStatus() == null) ^ (getTableStatus() == null)) {
            return false;
        }
        if (tableDescription.getTableStatus() != null && !tableDescription.getTableStatus().equals(getTableStatus())) {
            return false;
        }
        if ((tableDescription.getCreationDateTime() == null) ^ (getCreationDateTime() == null)) {
            return false;
        }
        if (tableDescription.getCreationDateTime() != null && !tableDescription.getCreationDateTime().equals(getCreationDateTime())) {
            return false;
        }
        if ((tableDescription.getProvisionedThroughput() == null) ^ (getProvisionedThroughput() == null)) {
            return false;
        }
        if (tableDescription.getProvisionedThroughput() != null && !tableDescription.getProvisionedThroughput().equals(getProvisionedThroughput())) {
            return false;
        }
        if ((tableDescription.getTableSizeBytes() == null) ^ (getTableSizeBytes() == null)) {
            return false;
        }
        if (tableDescription.getTableSizeBytes() != null && !tableDescription.getTableSizeBytes().equals(getTableSizeBytes())) {
            return false;
        }
        if ((tableDescription.getItemCount() == null) ^ (getItemCount() == null)) {
            return false;
        }
        if (tableDescription.getItemCount() != null && !tableDescription.getItemCount().equals(getItemCount())) {
            return false;
        }
        if ((tableDescription.getTableArn() == null) ^ (getTableArn() == null)) {
            return false;
        }
        if (tableDescription.getTableArn() != null && !tableDescription.getTableArn().equals(getTableArn())) {
            return false;
        }
        if ((tableDescription.getTableId() == null) ^ (getTableId() == null)) {
            return false;
        }
        if (tableDescription.getTableId() != null && !tableDescription.getTableId().equals(getTableId())) {
            return false;
        }
        if ((tableDescription.getLocalSecondaryIndexes() == null) ^ (getLocalSecondaryIndexes() == null)) {
            return false;
        }
        if (tableDescription.getLocalSecondaryIndexes() != null && !tableDescription.getLocalSecondaryIndexes().equals(getLocalSecondaryIndexes())) {
            return false;
        }
        if ((tableDescription.getGlobalSecondaryIndexes() == null) ^ (getGlobalSecondaryIndexes() == null)) {
            return false;
        }
        if (tableDescription.getGlobalSecondaryIndexes() != null && !tableDescription.getGlobalSecondaryIndexes().equals(getGlobalSecondaryIndexes())) {
            return false;
        }
        if ((tableDescription.getStreamSpecification() == null) ^ (getStreamSpecification() == null)) {
            return false;
        }
        if (tableDescription.getStreamSpecification() != null && !tableDescription.getStreamSpecification().equals(getStreamSpecification())) {
            return false;
        }
        if ((tableDescription.getLatestStreamLabel() == null) ^ (getLatestStreamLabel() == null)) {
            return false;
        }
        if (tableDescription.getLatestStreamLabel() != null && !tableDescription.getLatestStreamLabel().equals(getLatestStreamLabel())) {
            return false;
        }
        if ((tableDescription.getLatestStreamArn() == null) ^ (getLatestStreamArn() == null)) {
            return false;
        }
        if (tableDescription.getLatestStreamArn() != null && !tableDescription.getLatestStreamArn().equals(getLatestStreamArn())) {
            return false;
        }
        if ((tableDescription.getRestoreSummary() == null) ^ (getRestoreSummary() == null)) {
            return false;
        }
        if (tableDescription.getRestoreSummary() != null && !tableDescription.getRestoreSummary().equals(getRestoreSummary())) {
            return false;
        }
        if ((tableDescription.getSSEDescription() == null) ^ (getSSEDescription() == null)) {
            return false;
        }
        return tableDescription.getSSEDescription() == null || tableDescription.getSSEDescription().equals(getSSEDescription());
    }

    public List<AttributeDefinition> getAttributeDefinitions() {
        return this.attributeDefinitions;
    }

    public Date getCreationDateTime() {
        return this.creationDateTime;
    }

    public List<GlobalSecondaryIndexDescription> getGlobalSecondaryIndexes() {
        return this.globalSecondaryIndexes;
    }

    public Long getItemCount() {
        return this.itemCount;
    }

    public List<KeySchemaElement> getKeySchema() {
        return this.keySchema;
    }

    public String getLatestStreamArn() {
        return this.latestStreamArn;
    }

    public String getLatestStreamLabel() {
        return this.latestStreamLabel;
    }

    public List<LocalSecondaryIndexDescription> getLocalSecondaryIndexes() {
        return this.localSecondaryIndexes;
    }

    public ProvisionedThroughputDescription getProvisionedThroughput() {
        return this.provisionedThroughput;
    }

    public RestoreSummary getRestoreSummary() {
        return this.restoreSummary;
    }

    public SSEDescription getSSEDescription() {
        return this.sSEDescription;
    }

    public StreamSpecification getStreamSpecification() {
        return this.streamSpecification;
    }

    public String getTableArn() {
        return this.tableArn;
    }

    public String getTableId() {
        return this.tableId;
    }

    public String getTableName() {
        return this.tableName;
    }

    public Long getTableSizeBytes() {
        return this.tableSizeBytes;
    }

    public String getTableStatus() {
        return this.tableStatus;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((getAttributeDefinitions() == null ? 0 : getAttributeDefinitions().hashCode()) + 31) * 31) + (getTableName() == null ? 0 : getTableName().hashCode())) * 31) + (getKeySchema() == null ? 0 : getKeySchema().hashCode())) * 31) + (getTableStatus() == null ? 0 : getTableStatus().hashCode())) * 31) + (getCreationDateTime() == null ? 0 : getCreationDateTime().hashCode())) * 31) + (getProvisionedThroughput() == null ? 0 : getProvisionedThroughput().hashCode())) * 31) + (getTableSizeBytes() == null ? 0 : getTableSizeBytes().hashCode())) * 31) + (getItemCount() == null ? 0 : getItemCount().hashCode())) * 31) + (getTableArn() == null ? 0 : getTableArn().hashCode())) * 31) + (getTableId() == null ? 0 : getTableId().hashCode())) * 31) + (getLocalSecondaryIndexes() == null ? 0 : getLocalSecondaryIndexes().hashCode())) * 31) + (getGlobalSecondaryIndexes() == null ? 0 : getGlobalSecondaryIndexes().hashCode())) * 31) + (getStreamSpecification() == null ? 0 : getStreamSpecification().hashCode())) * 31) + (getLatestStreamLabel() == null ? 0 : getLatestStreamLabel().hashCode())) * 31) + (getLatestStreamArn() == null ? 0 : getLatestStreamArn().hashCode())) * 31) + (getRestoreSummary() == null ? 0 : getRestoreSummary().hashCode())) * 31) + (getSSEDescription() != null ? getSSEDescription().hashCode() : 0);
    }

    public void setAttributeDefinitions(Collection<AttributeDefinition> collection) {
        if (collection == null) {
            this.attributeDefinitions = null;
        } else {
            this.attributeDefinitions = new ArrayList(collection);
        }
    }

    public void setCreationDateTime(Date date) {
        this.creationDateTime = date;
    }

    public void setGlobalSecondaryIndexes(Collection<GlobalSecondaryIndexDescription> collection) {
        if (collection == null) {
            this.globalSecondaryIndexes = null;
        } else {
            this.globalSecondaryIndexes = new ArrayList(collection);
        }
    }

    public void setItemCount(Long l) {
        this.itemCount = l;
    }

    public void setKeySchema(Collection<KeySchemaElement> collection) {
        if (collection == null) {
            this.keySchema = null;
        } else {
            this.keySchema = new ArrayList(collection);
        }
    }

    public void setLatestStreamArn(String str) {
        this.latestStreamArn = str;
    }

    public void setLatestStreamLabel(String str) {
        this.latestStreamLabel = str;
    }

    public void setLocalSecondaryIndexes(Collection<LocalSecondaryIndexDescription> collection) {
        if (collection == null) {
            this.localSecondaryIndexes = null;
        } else {
            this.localSecondaryIndexes = new ArrayList(collection);
        }
    }

    public void setProvisionedThroughput(ProvisionedThroughputDescription provisionedThroughputDescription) {
        this.provisionedThroughput = provisionedThroughputDescription;
    }

    public void setRestoreSummary(RestoreSummary restoreSummary) {
        this.restoreSummary = restoreSummary;
    }

    public void setSSEDescription(SSEDescription sSEDescription) {
        this.sSEDescription = sSEDescription;
    }

    public void setStreamSpecification(StreamSpecification streamSpecification) {
        this.streamSpecification = streamSpecification;
    }

    public void setTableArn(String str) {
        this.tableArn = str;
    }

    public void setTableId(String str) {
        this.tableId = str;
    }

    public void setTableName(String str) {
        this.tableName = str;
    }

    public void setTableSizeBytes(Long l) {
        this.tableSizeBytes = l;
    }

    public void setTableStatus(String str) {
        this.tableStatus = str;
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
        if (getKeySchema() != null) {
            sb.append("KeySchema: " + getKeySchema() + ",");
        }
        if (getTableStatus() != null) {
            sb.append("TableStatus: " + getTableStatus() + ",");
        }
        if (getCreationDateTime() != null) {
            sb.append("CreationDateTime: " + getCreationDateTime() + ",");
        }
        if (getProvisionedThroughput() != null) {
            sb.append("ProvisionedThroughput: " + getProvisionedThroughput() + ",");
        }
        if (getTableSizeBytes() != null) {
            sb.append("TableSizeBytes: " + getTableSizeBytes() + ",");
        }
        if (getItemCount() != null) {
            sb.append("ItemCount: " + getItemCount() + ",");
        }
        if (getTableArn() != null) {
            sb.append("TableArn: " + getTableArn() + ",");
        }
        if (getTableId() != null) {
            sb.append("TableId: " + getTableId() + ",");
        }
        if (getLocalSecondaryIndexes() != null) {
            sb.append("LocalSecondaryIndexes: " + getLocalSecondaryIndexes() + ",");
        }
        if (getGlobalSecondaryIndexes() != null) {
            sb.append("GlobalSecondaryIndexes: " + getGlobalSecondaryIndexes() + ",");
        }
        if (getStreamSpecification() != null) {
            sb.append("StreamSpecification: " + getStreamSpecification() + ",");
        }
        if (getLatestStreamLabel() != null) {
            sb.append("LatestStreamLabel: " + getLatestStreamLabel() + ",");
        }
        if (getLatestStreamArn() != null) {
            sb.append("LatestStreamArn: " + getLatestStreamArn() + ",");
        }
        if (getRestoreSummary() != null) {
            sb.append("RestoreSummary: " + getRestoreSummary() + ",");
        }
        if (getSSEDescription() != null) {
            sb.append("SSEDescription: " + getSSEDescription());
        }
        sb.append("}");
        return sb.toString();
    }

    public TableDescription withAttributeDefinitions(AttributeDefinition... attributeDefinitionArr) {
        if (getAttributeDefinitions() == null) {
            this.attributeDefinitions = new ArrayList(attributeDefinitionArr.length);
        }
        for (AttributeDefinition attributeDefinition : attributeDefinitionArr) {
            this.attributeDefinitions.add(attributeDefinition);
        }
        return this;
    }

    public TableDescription withCreationDateTime(Date date) {
        this.creationDateTime = date;
        return this;
    }

    public TableDescription withGlobalSecondaryIndexes(GlobalSecondaryIndexDescription... globalSecondaryIndexDescriptionArr) {
        if (getGlobalSecondaryIndexes() == null) {
            this.globalSecondaryIndexes = new ArrayList(globalSecondaryIndexDescriptionArr.length);
        }
        for (GlobalSecondaryIndexDescription globalSecondaryIndexDescription : globalSecondaryIndexDescriptionArr) {
            this.globalSecondaryIndexes.add(globalSecondaryIndexDescription);
        }
        return this;
    }

    public TableDescription withItemCount(Long l) {
        this.itemCount = l;
        return this;
    }

    public TableDescription withKeySchema(KeySchemaElement... keySchemaElementArr) {
        if (getKeySchema() == null) {
            this.keySchema = new ArrayList(keySchemaElementArr.length);
        }
        for (KeySchemaElement keySchemaElement : keySchemaElementArr) {
            this.keySchema.add(keySchemaElement);
        }
        return this;
    }

    public TableDescription withLatestStreamArn(String str) {
        this.latestStreamArn = str;
        return this;
    }

    public TableDescription withLatestStreamLabel(String str) {
        this.latestStreamLabel = str;
        return this;
    }

    public TableDescription withLocalSecondaryIndexes(LocalSecondaryIndexDescription... localSecondaryIndexDescriptionArr) {
        if (getLocalSecondaryIndexes() == null) {
            this.localSecondaryIndexes = new ArrayList(localSecondaryIndexDescriptionArr.length);
        }
        for (LocalSecondaryIndexDescription localSecondaryIndexDescription : localSecondaryIndexDescriptionArr) {
            this.localSecondaryIndexes.add(localSecondaryIndexDescription);
        }
        return this;
    }

    public TableDescription withProvisionedThroughput(ProvisionedThroughputDescription provisionedThroughputDescription) {
        this.provisionedThroughput = provisionedThroughputDescription;
        return this;
    }

    public TableDescription withRestoreSummary(RestoreSummary restoreSummary) {
        this.restoreSummary = restoreSummary;
        return this;
    }

    public TableDescription withSSEDescription(SSEDescription sSEDescription) {
        this.sSEDescription = sSEDescription;
        return this;
    }

    public TableDescription withStreamSpecification(StreamSpecification streamSpecification) {
        this.streamSpecification = streamSpecification;
        return this;
    }

    public TableDescription withTableArn(String str) {
        this.tableArn = str;
        return this;
    }

    public TableDescription withTableId(String str) {
        this.tableId = str;
        return this;
    }

    public TableDescription withTableName(String str) {
        this.tableName = str;
        return this;
    }

    public TableDescription withTableSizeBytes(Long l) {
        this.tableSizeBytes = l;
        return this;
    }

    public TableDescription withTableStatus(String str) {
        this.tableStatus = str;
        return this;
    }

    public void setTableStatus(TableStatus tableStatus) {
        this.tableStatus = tableStatus.toString();
    }

    public TableDescription withTableStatus(TableStatus tableStatus) {
        this.tableStatus = tableStatus.toString();
        return this;
    }

    public TableDescription withAttributeDefinitions(Collection<AttributeDefinition> collection) {
        setAttributeDefinitions(collection);
        return this;
    }

    public TableDescription withGlobalSecondaryIndexes(Collection<GlobalSecondaryIndexDescription> collection) {
        setGlobalSecondaryIndexes(collection);
        return this;
    }

    public TableDescription withKeySchema(Collection<KeySchemaElement> collection) {
        setKeySchema(collection);
        return this;
    }

    public TableDescription withLocalSecondaryIndexes(Collection<LocalSecondaryIndexDescription> collection) {
        setLocalSecondaryIndexes(collection);
        return this;
    }
}
