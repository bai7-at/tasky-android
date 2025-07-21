package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import java.util.Date;

/* loaded from: classes2.dex */
public class BackupSummary implements Serializable {
    private String backupArn;
    private Date backupCreationDateTime;
    private Date backupExpiryDateTime;
    private String backupName;
    private Long backupSizeBytes;
    private String backupStatus;
    private String backupType;
    private String tableArn;
    private String tableId;
    private String tableName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BackupSummary)) {
            return false;
        }
        BackupSummary backupSummary = (BackupSummary) obj;
        if ((backupSummary.getTableName() == null) ^ (getTableName() == null)) {
            return false;
        }
        if (backupSummary.getTableName() != null && !backupSummary.getTableName().equals(getTableName())) {
            return false;
        }
        if ((backupSummary.getTableId() == null) ^ (getTableId() == null)) {
            return false;
        }
        if (backupSummary.getTableId() != null && !backupSummary.getTableId().equals(getTableId())) {
            return false;
        }
        if ((backupSummary.getTableArn() == null) ^ (getTableArn() == null)) {
            return false;
        }
        if (backupSummary.getTableArn() != null && !backupSummary.getTableArn().equals(getTableArn())) {
            return false;
        }
        if ((backupSummary.getBackupArn() == null) ^ (getBackupArn() == null)) {
            return false;
        }
        if (backupSummary.getBackupArn() != null && !backupSummary.getBackupArn().equals(getBackupArn())) {
            return false;
        }
        if ((backupSummary.getBackupName() == null) ^ (getBackupName() == null)) {
            return false;
        }
        if (backupSummary.getBackupName() != null && !backupSummary.getBackupName().equals(getBackupName())) {
            return false;
        }
        if ((backupSummary.getBackupCreationDateTime() == null) ^ (getBackupCreationDateTime() == null)) {
            return false;
        }
        if (backupSummary.getBackupCreationDateTime() != null && !backupSummary.getBackupCreationDateTime().equals(getBackupCreationDateTime())) {
            return false;
        }
        if ((backupSummary.getBackupExpiryDateTime() == null) ^ (getBackupExpiryDateTime() == null)) {
            return false;
        }
        if (backupSummary.getBackupExpiryDateTime() != null && !backupSummary.getBackupExpiryDateTime().equals(getBackupExpiryDateTime())) {
            return false;
        }
        if ((backupSummary.getBackupStatus() == null) ^ (getBackupStatus() == null)) {
            return false;
        }
        if (backupSummary.getBackupStatus() != null && !backupSummary.getBackupStatus().equals(getBackupStatus())) {
            return false;
        }
        if ((backupSummary.getBackupType() == null) ^ (getBackupType() == null)) {
            return false;
        }
        if (backupSummary.getBackupType() != null && !backupSummary.getBackupType().equals(getBackupType())) {
            return false;
        }
        if ((backupSummary.getBackupSizeBytes() == null) ^ (getBackupSizeBytes() == null)) {
            return false;
        }
        return backupSummary.getBackupSizeBytes() == null || backupSummary.getBackupSizeBytes().equals(getBackupSizeBytes());
    }

    public String getBackupArn() {
        return this.backupArn;
    }

    public Date getBackupCreationDateTime() {
        return this.backupCreationDateTime;
    }

    public Date getBackupExpiryDateTime() {
        return this.backupExpiryDateTime;
    }

    public String getBackupName() {
        return this.backupName;
    }

    public Long getBackupSizeBytes() {
        return this.backupSizeBytes;
    }

    public String getBackupStatus() {
        return this.backupStatus;
    }

    public String getBackupType() {
        return this.backupType;
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

    public int hashCode() {
        return (((((((((((((((((((getTableName() == null ? 0 : getTableName().hashCode()) + 31) * 31) + (getTableId() == null ? 0 : getTableId().hashCode())) * 31) + (getTableArn() == null ? 0 : getTableArn().hashCode())) * 31) + (getBackupArn() == null ? 0 : getBackupArn().hashCode())) * 31) + (getBackupName() == null ? 0 : getBackupName().hashCode())) * 31) + (getBackupCreationDateTime() == null ? 0 : getBackupCreationDateTime().hashCode())) * 31) + (getBackupExpiryDateTime() == null ? 0 : getBackupExpiryDateTime().hashCode())) * 31) + (getBackupStatus() == null ? 0 : getBackupStatus().hashCode())) * 31) + (getBackupType() == null ? 0 : getBackupType().hashCode())) * 31) + (getBackupSizeBytes() != null ? getBackupSizeBytes().hashCode() : 0);
    }

    public void setBackupArn(String str) {
        this.backupArn = str;
    }

    public void setBackupCreationDateTime(Date date) {
        this.backupCreationDateTime = date;
    }

    public void setBackupExpiryDateTime(Date date) {
        this.backupExpiryDateTime = date;
    }

    public void setBackupName(String str) {
        this.backupName = str;
    }

    public void setBackupSizeBytes(Long l) {
        this.backupSizeBytes = l;
    }

    public void setBackupStatus(String str) {
        this.backupStatus = str;
    }

    public void setBackupType(String str) {
        this.backupType = str;
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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTableName() != null) {
            sb.append("TableName: " + getTableName() + ",");
        }
        if (getTableId() != null) {
            sb.append("TableId: " + getTableId() + ",");
        }
        if (getTableArn() != null) {
            sb.append("TableArn: " + getTableArn() + ",");
        }
        if (getBackupArn() != null) {
            sb.append("BackupArn: " + getBackupArn() + ",");
        }
        if (getBackupName() != null) {
            sb.append("BackupName: " + getBackupName() + ",");
        }
        if (getBackupCreationDateTime() != null) {
            sb.append("BackupCreationDateTime: " + getBackupCreationDateTime() + ",");
        }
        if (getBackupExpiryDateTime() != null) {
            sb.append("BackupExpiryDateTime: " + getBackupExpiryDateTime() + ",");
        }
        if (getBackupStatus() != null) {
            sb.append("BackupStatus: " + getBackupStatus() + ",");
        }
        if (getBackupType() != null) {
            sb.append("BackupType: " + getBackupType() + ",");
        }
        if (getBackupSizeBytes() != null) {
            sb.append("BackupSizeBytes: " + getBackupSizeBytes());
        }
        sb.append("}");
        return sb.toString();
    }

    public BackupSummary withBackupArn(String str) {
        this.backupArn = str;
        return this;
    }

    public BackupSummary withBackupCreationDateTime(Date date) {
        this.backupCreationDateTime = date;
        return this;
    }

    public BackupSummary withBackupExpiryDateTime(Date date) {
        this.backupExpiryDateTime = date;
        return this;
    }

    public BackupSummary withBackupName(String str) {
        this.backupName = str;
        return this;
    }

    public BackupSummary withBackupSizeBytes(Long l) {
        this.backupSizeBytes = l;
        return this;
    }

    public BackupSummary withBackupStatus(String str) {
        this.backupStatus = str;
        return this;
    }

    public BackupSummary withBackupType(String str) {
        this.backupType = str;
        return this;
    }

    public BackupSummary withTableArn(String str) {
        this.tableArn = str;
        return this;
    }

    public BackupSummary withTableId(String str) {
        this.tableId = str;
        return this;
    }

    public BackupSummary withTableName(String str) {
        this.tableName = str;
        return this;
    }

    public void setBackupStatus(BackupStatus backupStatus) {
        this.backupStatus = backupStatus.toString();
    }

    public void setBackupType(BackupType backupType) {
        this.backupType = backupType.toString();
    }

    public BackupSummary withBackupStatus(BackupStatus backupStatus) {
        this.backupStatus = backupStatus.toString();
        return this;
    }

    public BackupSummary withBackupType(BackupType backupType) {
        this.backupType = backupType.toString();
        return this;
    }
}
