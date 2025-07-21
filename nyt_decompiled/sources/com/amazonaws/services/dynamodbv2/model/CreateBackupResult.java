package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class CreateBackupResult implements Serializable {
    private BackupDetails backupDetails;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateBackupResult)) {
            return false;
        }
        CreateBackupResult createBackupResult = (CreateBackupResult) obj;
        if ((createBackupResult.getBackupDetails() == null) ^ (getBackupDetails() == null)) {
            return false;
        }
        return createBackupResult.getBackupDetails() == null || createBackupResult.getBackupDetails().equals(getBackupDetails());
    }

    public BackupDetails getBackupDetails() {
        return this.backupDetails;
    }

    public int hashCode() {
        return 31 + (getBackupDetails() == null ? 0 : getBackupDetails().hashCode());
    }

    public void setBackupDetails(BackupDetails backupDetails) {
        this.backupDetails = backupDetails;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBackupDetails() != null) {
            sb.append("BackupDetails: " + getBackupDetails());
        }
        sb.append("}");
        return sb.toString();
    }

    public CreateBackupResult withBackupDetails(BackupDetails backupDetails) {
        this.backupDetails = backupDetails;
        return this;
    }
}
