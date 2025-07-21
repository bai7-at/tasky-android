package com.amazonaws.services.dynamodbv2.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class CreateBackupRequest extends AmazonWebServiceRequest implements Serializable {
    private String backupName;
    private String tableName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateBackupRequest)) {
            return false;
        }
        CreateBackupRequest createBackupRequest = (CreateBackupRequest) obj;
        if ((createBackupRequest.getTableName() == null) ^ (getTableName() == null)) {
            return false;
        }
        if (createBackupRequest.getTableName() != null && !createBackupRequest.getTableName().equals(getTableName())) {
            return false;
        }
        if ((createBackupRequest.getBackupName() == null) ^ (getBackupName() == null)) {
            return false;
        }
        return createBackupRequest.getBackupName() == null || createBackupRequest.getBackupName().equals(getBackupName());
    }

    public String getBackupName() {
        return this.backupName;
    }

    public String getTableName() {
        return this.tableName;
    }

    public int hashCode() {
        return (((getTableName() == null ? 0 : getTableName().hashCode()) + 31) * 31) + (getBackupName() != null ? getBackupName().hashCode() : 0);
    }

    public void setBackupName(String str) {
        this.backupName = str;
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
        if (getBackupName() != null) {
            sb.append("BackupName: " + getBackupName());
        }
        sb.append("}");
        return sb.toString();
    }

    public CreateBackupRequest withBackupName(String str) {
        this.backupName = str;
        return this;
    }

    public CreateBackupRequest withTableName(String str) {
        this.tableName = str;
        return this;
    }
}
