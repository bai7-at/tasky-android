package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public class ListBackupsResult implements Serializable {
    private List<BackupSummary> backupSummaries;
    private String lastEvaluatedBackupArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListBackupsResult)) {
            return false;
        }
        ListBackupsResult listBackupsResult = (ListBackupsResult) obj;
        if ((listBackupsResult.getBackupSummaries() == null) ^ (getBackupSummaries() == null)) {
            return false;
        }
        if (listBackupsResult.getBackupSummaries() != null && !listBackupsResult.getBackupSummaries().equals(getBackupSummaries())) {
            return false;
        }
        if ((listBackupsResult.getLastEvaluatedBackupArn() == null) ^ (getLastEvaluatedBackupArn() == null)) {
            return false;
        }
        return listBackupsResult.getLastEvaluatedBackupArn() == null || listBackupsResult.getLastEvaluatedBackupArn().equals(getLastEvaluatedBackupArn());
    }

    public List<BackupSummary> getBackupSummaries() {
        return this.backupSummaries;
    }

    public String getLastEvaluatedBackupArn() {
        return this.lastEvaluatedBackupArn;
    }

    public int hashCode() {
        return (((getBackupSummaries() == null ? 0 : getBackupSummaries().hashCode()) + 31) * 31) + (getLastEvaluatedBackupArn() != null ? getLastEvaluatedBackupArn().hashCode() : 0);
    }

    public void setBackupSummaries(Collection<BackupSummary> collection) {
        if (collection == null) {
            this.backupSummaries = null;
        } else {
            this.backupSummaries = new ArrayList(collection);
        }
    }

    public void setLastEvaluatedBackupArn(String str) {
        this.lastEvaluatedBackupArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBackupSummaries() != null) {
            sb.append("BackupSummaries: " + getBackupSummaries() + ",");
        }
        if (getLastEvaluatedBackupArn() != null) {
            sb.append("LastEvaluatedBackupArn: " + getLastEvaluatedBackupArn());
        }
        sb.append("}");
        return sb.toString();
    }

    public ListBackupsResult withBackupSummaries(BackupSummary... backupSummaryArr) {
        if (getBackupSummaries() == null) {
            this.backupSummaries = new ArrayList(backupSummaryArr.length);
        }
        for (BackupSummary backupSummary : backupSummaryArr) {
            this.backupSummaries.add(backupSummary);
        }
        return this;
    }

    public ListBackupsResult withLastEvaluatedBackupArn(String str) {
        this.lastEvaluatedBackupArn = str;
        return this;
    }

    public ListBackupsResult withBackupSummaries(Collection<BackupSummary> collection) {
        setBackupSummaries(collection);
        return this;
    }
}
