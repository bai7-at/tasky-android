package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;

@Deprecated
/* loaded from: classes.dex */
public class DeleteDatasetResult implements Serializable {
    private Dataset dataset;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteDatasetResult)) {
            return false;
        }
        DeleteDatasetResult deleteDatasetResult = (DeleteDatasetResult) obj;
        if ((deleteDatasetResult.getDataset() == null) ^ (getDataset() == null)) {
            return false;
        }
        return deleteDatasetResult.getDataset() == null || deleteDatasetResult.getDataset().equals(getDataset());
    }

    public Dataset getDataset() {
        return this.dataset;
    }

    public int hashCode() {
        return 31 + (getDataset() == null ? 0 : getDataset().hashCode());
    }

    public void setDataset(Dataset dataset) {
        this.dataset = dataset;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDataset() != null) {
            sb.append("Dataset: " + getDataset());
        }
        sb.append("}");
        return sb.toString();
    }

    public DeleteDatasetResult withDataset(Dataset dataset) {
        this.dataset = dataset;
        return this;
    }
}
