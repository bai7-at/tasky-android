package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import java.util.Date;

/* loaded from: classes2.dex */
public class BackupDetails implements Serializable {
    private String backupArn;
    private Date backupCreationDateTime;
    private Date backupExpiryDateTime;
    private String backupName;
    private Long backupSizeBytes;
    private String backupStatus;
    private String backupType;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BackupDetails)) {
            return false;
        }
        BackupDetails backupDetails = (BackupDetails) obj;
        if ((backupDetails.getBackupArn() == null) ^ (getBackupArn() == null)) {
            return false;
        }
        if (backupDetails.getBackupArn() != null && !backupDetails.getBackupArn().equals(getBackupArn())) {
            return false;
        }
        if ((backupDetails.getBackupName() == null) ^ (getBackupName() == null)) {
            return false;
        }
        if (backupDetails.getBackupName() != null && !backupDetails.getBackupName().equals(getBackupName())) {
            return false;
        }
        if ((backupDetails.getBackupSizeBytes() == null) ^ (getBackupSizeBytes() == null)) {
            return false;
        }
        if (backupDetails.getBackupSizeBytes() != null && !backupDetails.getBackupSizeBytes().equals(getBackupSizeBytes())) {
            return false;
        }
        if ((backupDetails.getBackupStatus() == null) ^ (getBackupStatus() == null)) {
            return false;
        }
        if (backupDetails.getBackupStatus() != null && !backupDetails.getBackupStatus().equals(getBackupStatus())) {
            return false;
        }
        if ((backupDetails.getBackupType() == null) ^ (getBackupType() == null)) {
            return false;
        }
        if (backupDetails.getBackupType() != null && !backupDetails.getBackupType().equals(getBackupType())) {
            return false;
        }
        if ((backupDetails.getBackupCreationDateTime() == null) ^ (getBackupCreationDateTime() == null)) {
            return false;
        }
        if (backupDetails.getBackupCreationDateTime() != null && !backupDetails.getBackupCreationDateTime().equals(getBackupCreationDateTime())) {
            return false;
        }
        if ((backupDetails.getBackupExpiryDateTime() == null) ^ (getBackupExpiryDateTime() == null)) {
            return false;
        }
        return backupDetails.getBackupExpiryDateTime() == null || backupDetails.getBackupExpiryDateTime().equals(getBackupExpiryDateTime());
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

    public int hashCode() {
        return (((((((((((((getBackupArn() == null ? 0 : getBackupArn().hashCode()) + 31) * 31) + (getBackupName() == null ? 0 : getBackupName().hashCode())) * 31) + (getBackupSizeBytes() == null ? 0 : getBackupSizeBytes().hashCode())) * 31) + (getBackupStatus() == null ? 0 : getBackupStatus().hashCode())) * 31) + (getBackupType() == null ? 0 : getBackupType().hashCode())) * 31) + (getBackupCreationDateTime() == null ? 0 : getBackupCreationDateTime().hashCode())) * 31) + (getBackupExpiryDateTime() != null ? getBackupExpiryDateTime().hashCode() : 0);
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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBackupArn() != null) {
            sb.append("BackupArn: " + getBackupArn() + ",");
        }
        if (getBackupName() != null) {
            sb.append("BackupName: " + getBackupName() + ",");
        }
        if (getBackupSizeBytes() != null) {
            sb.append("BackupSizeBytes: " + getBackupSizeBytes() + ",");
        }
        if (getBackupStatus() != null) {
            sb.append("BackupStatus: " + getBackupStatus() + ",");
        }
        if (getBackupType() != null) {
            sb.append("BackupType: " + getBackupType() + ",");
        }
        if (getBackupCreationDateTime() != null) {
            sb.append("BackupCreationDateTime: " + getBackupCreationDateTime() + ",");
        }
        if (getBackupExpiryDateTime() != null) {
            sb.append("BackupExpiryDateTime: " + getBackupExpiryDateTime());
        }
        sb.append("}");
        return sb.toString();
    }

    public BackupDetails withBackupArn(String str) {
        this.backupArn = str;
        return this;
    }

    public BackupDetails withBackupCreationDateTime(Date date) {
        this.backupCreationDateTime = date;
        return this;
    }

    public BackupDetails withBackupExpiryDateTime(Date date) {
        this.backupExpiryDateTime = date;
        return this;
    }

    public BackupDetails withBackupName(String str) {
        this.backupName = str;
        return this;
    }

    public BackupDetails withBackupSizeBytes(Long l) {
        this.backupSizeBytes = l;
        return this;
    }

    public BackupDetails withBackupStatus(String str) {
        this.backupStatus = str;
        return this;
    }

    public BackupDetails withBackupType(String str) {
        this.backupType = str;
        return this;
    }

    public void setBackupStatus(BackupStatus backupStatus) {
        this.backupStatus = backupStatus.toString();
    }

    public void setBackupType(BackupType backupType) {
        this.backupType = backupType.toString();
    }

    public BackupDetails withBackupStatus(BackupStatus backupStatus) {
        this.backupStatus = backupStatus.toString();
        return this;
    }

    public BackupDetails withBackupType(BackupType backupType) {
        this.backupType = backupType.toString();
        return this;
    }
}
