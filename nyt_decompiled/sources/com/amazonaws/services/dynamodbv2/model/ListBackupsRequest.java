package com.amazonaws.services.dynamodbv2.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.Date;

/* loaded from: classes2.dex */
public class ListBackupsRequest extends AmazonWebServiceRequest implements Serializable {
    private String backupType;
    private String exclusiveStartBackupArn;
    private Integer limit;
    private String tableName;
    private Date timeRangeLowerBound;
    private Date timeRangeUpperBound;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListBackupsRequest)) {
            return false;
        }
        ListBackupsRequest listBackupsRequest = (ListBackupsRequest) obj;
        if ((listBackupsRequest.getTableName() == null) ^ (getTableName() == null)) {
            return false;
        }
        if (listBackupsRequest.getTableName() != null && !listBackupsRequest.getTableName().equals(getTableName())) {
            return false;
        }
        if ((listBackupsRequest.getLimit() == null) ^ (getLimit() == null)) {
            return false;
        }
        if (listBackupsRequest.getLimit() != null && !listBackupsRequest.getLimit().equals(getLimit())) {
            return false;
        }
        if ((listBackupsRequest.getTimeRangeLowerBound() == null) ^ (getTimeRangeLowerBound() == null)) {
            return false;
        }
        if (listBackupsRequest.getTimeRangeLowerBound() != null && !listBackupsRequest.getTimeRangeLowerBound().equals(getTimeRangeLowerBound())) {
            return false;
        }
        if ((listBackupsRequest.getTimeRangeUpperBound() == null) ^ (getTimeRangeUpperBound() == null)) {
            return false;
        }
        if (listBackupsRequest.getTimeRangeUpperBound() != null && !listBackupsRequest.getTimeRangeUpperBound().equals(getTimeRangeUpperBound())) {
            return false;
        }
        if ((listBackupsRequest.getExclusiveStartBackupArn() == null) ^ (getExclusiveStartBackupArn() == null)) {
            return false;
        }
        if (listBackupsRequest.getExclusiveStartBackupArn() != null && !listBackupsRequest.getExclusiveStartBackupArn().equals(getExclusiveStartBackupArn())) {
            return false;
        }
        if ((listBackupsRequest.getBackupType() == null) ^ (getBackupType() == null)) {
            return false;
        }
        return listBackupsRequest.getBackupType() == null || listBackupsRequest.getBackupType().equals(getBackupType());
    }

    public String getBackupType() {
        return this.backupType;
    }

    public String getExclusiveStartBackupArn() {
        return this.exclusiveStartBackupArn;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public String getTableName() {
        return this.tableName;
    }

    public Date getTimeRangeLowerBound() {
        return this.timeRangeLowerBound;
    }

    public Date getTimeRangeUpperBound() {
        return this.timeRangeUpperBound;
    }

    public int hashCode() {
        return (((((((((((getTableName() == null ? 0 : getTableName().hashCode()) + 31) * 31) + (getLimit() == null ? 0 : getLimit().hashCode())) * 31) + (getTimeRangeLowerBound() == null ? 0 : getTimeRangeLowerBound().hashCode())) * 31) + (getTimeRangeUpperBound() == null ? 0 : getTimeRangeUpperBound().hashCode())) * 31) + (getExclusiveStartBackupArn() == null ? 0 : getExclusiveStartBackupArn().hashCode())) * 31) + (getBackupType() != null ? getBackupType().hashCode() : 0);
    }

    public void setBackupType(String str) {
        this.backupType = str;
    }

    public void setExclusiveStartBackupArn(String str) {
        this.exclusiveStartBackupArn = str;
    }

    public void setLimit(Integer num) {
        this.limit = num;
    }

    public void setTableName(String str) {
        this.tableName = str;
    }

    public void setTimeRangeLowerBound(Date date) {
        this.timeRangeLowerBound = date;
    }

    public void setTimeRangeUpperBound(Date date) {
        this.timeRangeUpperBound = date;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTableName() != null) {
            sb.append("TableName: " + getTableName() + ",");
        }
        if (getLimit() != null) {
            sb.append("Limit: " + getLimit() + ",");
        }
        if (getTimeRangeLowerBound() != null) {
            sb.append("TimeRangeLowerBound: " + getTimeRangeLowerBound() + ",");
        }
        if (getTimeRangeUpperBound() != null) {
            sb.append("TimeRangeUpperBound: " + getTimeRangeUpperBound() + ",");
        }
        if (getExclusiveStartBackupArn() != null) {
            sb.append("ExclusiveStartBackupArn: " + getExclusiveStartBackupArn() + ",");
        }
        if (getBackupType() != null) {
            sb.append("BackupType: " + getBackupType());
        }
        sb.append("}");
        return sb.toString();
    }

    public ListBackupsRequest withBackupType(String str) {
        this.backupType = str;
        return this;
    }

    public ListBackupsRequest withExclusiveStartBackupArn(String str) {
        this.exclusiveStartBackupArn = str;
        return this;
    }

    public ListBackupsRequest withLimit(Integer num) {
        this.limit = num;
        return this;
    }

    public ListBackupsRequest withTableName(String str) {
        this.tableName = str;
        return this;
    }

    public ListBackupsRequest withTimeRangeLowerBound(Date date) {
        this.timeRangeLowerBound = date;
        return this;
    }

    public ListBackupsRequest withTimeRangeUpperBound(Date date) {
        this.timeRangeUpperBound = date;
        return this;
    }

    public void setBackupType(BackupTypeFilter backupTypeFilter) {
        this.backupType = backupTypeFilter.toString();
    }

    public ListBackupsRequest withBackupType(BackupTypeFilter backupTypeFilter) {
        this.backupType = backupTypeFilter.toString();
        return this;
    }
}
