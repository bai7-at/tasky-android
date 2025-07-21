package com.amazonaws.services.dynamodbv2.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class UpdateContinuousBackupsRequest extends AmazonWebServiceRequest implements Serializable {
    private PointInTimeRecoverySpecification pointInTimeRecoverySpecification;
    private String tableName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateContinuousBackupsRequest)) {
            return false;
        }
        UpdateContinuousBackupsRequest updateContinuousBackupsRequest = (UpdateContinuousBackupsRequest) obj;
        if ((updateContinuousBackupsRequest.getTableName() == null) ^ (getTableName() == null)) {
            return false;
        }
        if (updateContinuousBackupsRequest.getTableName() != null && !updateContinuousBackupsRequest.getTableName().equals(getTableName())) {
            return false;
        }
        if ((updateContinuousBackupsRequest.getPointInTimeRecoverySpecification() == null) ^ (getPointInTimeRecoverySpecification() == null)) {
            return false;
        }
        return updateContinuousBackupsRequest.getPointInTimeRecoverySpecification() == null || updateContinuousBackupsRequest.getPointInTimeRecoverySpecification().equals(getPointInTimeRecoverySpecification());
    }

    public PointInTimeRecoverySpecification getPointInTimeRecoverySpecification() {
        return this.pointInTimeRecoverySpecification;
    }

    public String getTableName() {
        return this.tableName;
    }

    public int hashCode() {
        return (((getTableName() == null ? 0 : getTableName().hashCode()) + 31) * 31) + (getPointInTimeRecoverySpecification() != null ? getPointInTimeRecoverySpecification().hashCode() : 0);
    }

    public void setPointInTimeRecoverySpecification(PointInTimeRecoverySpecification pointInTimeRecoverySpecification) {
        this.pointInTimeRecoverySpecification = pointInTimeRecoverySpecification;
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
        if (getPointInTimeRecoverySpecification() != null) {
            sb.append("PointInTimeRecoverySpecification: " + getPointInTimeRecoverySpecification());
        }
        sb.append("}");
        return sb.toString();
    }

    public UpdateContinuousBackupsRequest withPointInTimeRecoverySpecification(PointInTimeRecoverySpecification pointInTimeRecoverySpecification) {
        this.pointInTimeRecoverySpecification = pointInTimeRecoverySpecification;
        return this;
    }

    public UpdateContinuousBackupsRequest withTableName(String str) {
        this.tableName = str;
        return this;
    }
}
