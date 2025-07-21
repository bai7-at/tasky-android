package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class DescribeBackupResult implements Serializable {
    private BackupDescription backupDescription;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeBackupResult)) {
            return false;
        }
        DescribeBackupResult describeBackupResult = (DescribeBackupResult) obj;
        if ((describeBackupResult.getBackupDescription() == null) ^ (getBackupDescription() == null)) {
            return false;
        }
        return describeBackupResult.getBackupDescription() == null || describeBackupResult.getBackupDescription().equals(getBackupDescription());
    }

    public BackupDescription getBackupDescription() {
        return this.backupDescription;
    }

    public int hashCode() {
        return 31 + (getBackupDescription() == null ? 0 : getBackupDescription().hashCode());
    }

    public void setBackupDescription(BackupDescription backupDescription) {
        this.backupDescription = backupDescription;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBackupDescription() != null) {
            sb.append("BackupDescription: " + getBackupDescription());
        }
        sb.append("}");
        return sb.toString();
    }

    public DescribeBackupResult withBackupDescription(BackupDescription backupDescription) {
        this.backupDescription = backupDescription;
        return this;
    }
}
