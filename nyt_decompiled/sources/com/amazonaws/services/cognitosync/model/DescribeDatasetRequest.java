package com.amazonaws.services.cognitosync.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

@Deprecated
/* loaded from: classes.dex */
public class DescribeDatasetRequest extends AmazonWebServiceRequest implements Serializable {
    private String datasetName;
    private String identityId;
    private String identityPoolId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeDatasetRequest)) {
            return false;
        }
        DescribeDatasetRequest describeDatasetRequest = (DescribeDatasetRequest) obj;
        if ((describeDatasetRequest.getIdentityPoolId() == null) ^ (getIdentityPoolId() == null)) {
            return false;
        }
        if (describeDatasetRequest.getIdentityPoolId() != null && !describeDatasetRequest.getIdentityPoolId().equals(getIdentityPoolId())) {
            return false;
        }
        if ((describeDatasetRequest.getIdentityId() == null) ^ (getIdentityId() == null)) {
            return false;
        }
        if (describeDatasetRequest.getIdentityId() != null && !describeDatasetRequest.getIdentityId().equals(getIdentityId())) {
            return false;
        }
        if ((describeDatasetRequest.getDatasetName() == null) ^ (getDatasetName() == null)) {
            return false;
        }
        return describeDatasetRequest.getDatasetName() == null || describeDatasetRequest.getDatasetName().equals(getDatasetName());
    }

    public String getDatasetName() {
        return this.datasetName;
    }

    public String getIdentityId() {
        return this.identityId;
    }

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    public int hashCode() {
        return (((((getIdentityPoolId() == null ? 0 : getIdentityPoolId().hashCode()) + 31) * 31) + (getIdentityId() == null ? 0 : getIdentityId().hashCode())) * 31) + (getDatasetName() != null ? getDatasetName().hashCode() : 0);
    }

    public void setDatasetName(String str) {
        this.datasetName = str;
    }

    public void setIdentityId(String str) {
        this.identityId = str;
    }

    public void setIdentityPoolId(String str) {
        this.identityPoolId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIdentityPoolId() != null) {
            sb.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        }
        if (getIdentityId() != null) {
            sb.append("IdentityId: " + getIdentityId() + ",");
        }
        if (getDatasetName() != null) {
            sb.append("DatasetName: " + getDatasetName());
        }
        sb.append("}");
        return sb.toString();
    }

    public DescribeDatasetRequest withDatasetName(String str) {
        this.datasetName = str;
        return this;
    }

    public DescribeDatasetRequest withIdentityId(String str) {
        this.identityId = str;
        return this;
    }

    public DescribeDatasetRequest withIdentityPoolId(String str) {
        this.identityPoolId = str;
        return this;
    }
}
