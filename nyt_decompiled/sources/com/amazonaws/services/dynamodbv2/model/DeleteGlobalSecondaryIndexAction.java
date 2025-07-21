package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class DeleteGlobalSecondaryIndexAction implements Serializable {
    private String indexName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteGlobalSecondaryIndexAction)) {
            return false;
        }
        DeleteGlobalSecondaryIndexAction deleteGlobalSecondaryIndexAction = (DeleteGlobalSecondaryIndexAction) obj;
        if ((deleteGlobalSecondaryIndexAction.getIndexName() == null) ^ (getIndexName() == null)) {
            return false;
        }
        return deleteGlobalSecondaryIndexAction.getIndexName() == null || deleteGlobalSecondaryIndexAction.getIndexName().equals(getIndexName());
    }

    public String getIndexName() {
        return this.indexName;
    }

    public int hashCode() {
        return 31 + (getIndexName() == null ? 0 : getIndexName().hashCode());
    }

    public void setIndexName(String str) {
        this.indexName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIndexName() != null) {
            sb.append("IndexName: " + getIndexName());
        }
        sb.append("}");
        return sb.toString();
    }

    public DeleteGlobalSecondaryIndexAction withIndexName(String str) {
        this.indexName = str;
        return this;
    }
}
