package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;

@Deprecated
/* loaded from: classes.dex */
public class DescribeDatasetResult implements Serializable {
    private Dataset dataset;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeDatasetResult)) {
            return false;
        }
        DescribeDatasetResult describeDatasetResult = (DescribeDatasetResult) obj;
        if ((describeDatasetResult.getDataset() == null) ^ (getDataset() == null)) {
            return false;
        }
        return describeDatasetResult.getDataset() == null || describeDatasetResult.getDataset().equals(getDataset());
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

    public DescribeDatasetResult withDataset(Dataset dataset) {
        this.dataset = dataset;
        return this;
    }
}
