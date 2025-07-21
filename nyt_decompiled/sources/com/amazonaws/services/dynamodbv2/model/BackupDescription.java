package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class BackupDescription implements Serializable {
    private BackupDetails backupDetails;
    private SourceTableDetails sourceTableDetails;
    private SourceTableFeatureDetails sourceTableFeatureDetails;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BackupDescription)) {
            return false;
        }
        BackupDescription backupDescription = (BackupDescription) obj;
        if ((backupDescription.getBackupDetails() == null) ^ (getBackupDetails() == null)) {
            return false;
        }
        if (backupDescription.getBackupDetails() != null && !backupDescription.getBackupDetails().equals(getBackupDetails())) {
            return false;
        }
        if ((backupDescription.getSourceTableDetails() == null) ^ (getSourceTableDetails() == null)) {
            return false;
        }
        if (backupDescription.getSourceTableDetails() != null && !backupDescription.getSourceTableDetails().equals(getSourceTableDetails())) {
            return false;
        }
        if ((backupDescription.getSourceTableFeatureDetails() == null) ^ (getSourceTableFeatureDetails() == null)) {
            return false;
        }
        return backupDescription.getSourceTableFeatureDetails() == null || backupDescription.getSourceTableFeatureDetails().equals(getSourceTableFeatureDetails());
    }

    public BackupDetails getBackupDetails() {
        return this.backupDetails;
    }

    public SourceTableDetails getSourceTableDetails() {
        return this.sourceTableDetails;
    }

    public SourceTableFeatureDetails getSourceTableFeatureDetails() {
        return this.sourceTableFeatureDetails;
    }

    public int hashCode() {
        return (((((getBackupDetails() == null ? 0 : getBackupDetails().hashCode()) + 31) * 31) + (getSourceTableDetails() == null ? 0 : getSourceTableDetails().hashCode())) * 31) + (getSourceTableFeatureDetails() != null ? getSourceTableFeatureDetails().hashCode() : 0);
    }

    public void setBackupDetails(BackupDetails backupDetails) {
        this.backupDetails = backupDetails;
    }

    public void setSourceTableDetails(SourceTableDetails sourceTableDetails) {
        this.sourceTableDetails = sourceTableDetails;
    }

    public void setSourceTableFeatureDetails(SourceTableFeatureDetails sourceTableFeatureDetails) {
        this.sourceTableFeatureDetails = sourceTableFeatureDetails;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBackupDetails() != null) {
            sb.append("BackupDetails: " + getBackupDetails() + ",");
        }
        if (getSourceTableDetails() != null) {
            sb.append("SourceTableDetails: " + getSourceTableDetails() + ",");
        }
        if (getSourceTableFeatureDetails() != null) {
            sb.append("SourceTableFeatureDetails: " + getSourceTableFeatureDetails());
        }
        sb.append("}");
        return sb.toString();
    }

    public BackupDescription withBackupDetails(BackupDetails backupDetails) {
        this.backupDetails = backupDetails;
        return this;
    }

    public BackupDescription withSourceTableDetails(SourceTableDetails sourceTableDetails) {
        this.sourceTableDetails = sourceTableDetails;
        return this;
    }

    public BackupDescription withSourceTableFeatureDetails(SourceTableFeatureDetails sourceTableFeatureDetails) {
        this.sourceTableFeatureDetails = sourceTableFeatureDetails;
        return this;
    }
}
