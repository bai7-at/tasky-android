package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public class LocalSecondaryIndexInfo implements Serializable {
    private String indexName;
    private List<KeySchemaElement> keySchema;
    private Projection projection;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof LocalSecondaryIndexInfo)) {
            return false;
        }
        LocalSecondaryIndexInfo localSecondaryIndexInfo = (LocalSecondaryIndexInfo) obj;
        if ((localSecondaryIndexInfo.getIndexName() == null) ^ (getIndexName() == null)) {
            return false;
        }
        if (localSecondaryIndexInfo.getIndexName() != null && !localSecondaryIndexInfo.getIndexName().equals(getIndexName())) {
            return false;
        }
        if ((localSecondaryIndexInfo.getKeySchema() == null) ^ (getKeySchema() == null)) {
            return false;
        }
        if (localSecondaryIndexInfo.getKeySchema() != null && !localSecondaryIndexInfo.getKeySchema().equals(getKeySchema())) {
            return false;
        }
        if ((localSecondaryIndexInfo.getProjection() == null) ^ (getProjection() == null)) {
            return false;
        }
        return localSecondaryIndexInfo.getProjection() == null || localSecondaryIndexInfo.getProjection().equals(getProjection());
    }

    public String getIndexName() {
        return this.indexName;
    }

    public List<KeySchemaElement> getKeySchema() {
        return this.keySchema;
    }

    public Projection getProjection() {
        return this.projection;
    }

    public int hashCode() {
        return (((((getIndexName() == null ? 0 : getIndexName().hashCode()) + 31) * 31) + (getKeySchema() == null ? 0 : getKeySchema().hashCode())) * 31) + (getProjection() != null ? getProjection().hashCode() : 0);
    }

    public void setIndexName(String str) {
        this.indexName = str;
    }

    public void setKeySchema(Collection<KeySchemaElement> collection) {
        if (collection == null) {
            this.keySchema = null;
        } else {
            this.keySchema = new ArrayList(collection);
        }
    }

    public void setProjection(Projection projection) {
        this.projection = projection;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIndexName() != null) {
            sb.append("IndexName: " + getIndexName() + ",");
        }
        if (getKeySchema() != null) {
            sb.append("KeySchema: " + getKeySchema() + ",");
        }
        if (getProjection() != null) {
            sb.append("Projection: " + getProjection());
        }
        sb.append("}");
        return sb.toString();
    }

    public LocalSecondaryIndexInfo withIndexName(String str) {
        this.indexName = str;
        return this;
    }

    public LocalSecondaryIndexInfo withKeySchema(KeySchemaElement... keySchemaElementArr) {
        if (getKeySchema() == null) {
            this.keySchema = new ArrayList(keySchemaElementArr.length);
        }
        for (KeySchemaElement keySchemaElement : keySchemaElementArr) {
            this.keySchema.add(keySchemaElement);
        }
        return this;
    }

    public LocalSecondaryIndexInfo withProjection(Projection projection) {
        this.projection = projection;
        return this;
    }

    public LocalSecondaryIndexInfo withKeySchema(Collection<KeySchemaElement> collection) {
        setKeySchema(collection);
        return this;
    }
}
