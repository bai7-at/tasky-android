package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public class ListRecordsResult implements Serializable {
    private Integer count;
    private Boolean datasetDeletedAfterRequestedSyncCount;
    private Boolean datasetExists;
    private Long datasetSyncCount;
    private String lastModifiedBy;
    private List<String> mergedDatasetNames;
    private String nextToken;
    private List<Record> records;
    private String syncSessionToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListRecordsResult)) {
            return false;
        }
        ListRecordsResult listRecordsResult = (ListRecordsResult) obj;
        if ((listRecordsResult.getRecords() == null) ^ (getRecords() == null)) {
            return false;
        }
        if (listRecordsResult.getRecords() != null && !listRecordsResult.getRecords().equals(getRecords())) {
            return false;
        }
        if ((listRecordsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (listRecordsResult.getNextToken() != null && !listRecordsResult.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((listRecordsResult.getCount() == null) ^ (getCount() == null)) {
            return false;
        }
        if (listRecordsResult.getCount() != null && !listRecordsResult.getCount().equals(getCount())) {
            return false;
        }
        if ((listRecordsResult.getDatasetSyncCount() == null) ^ (getDatasetSyncCount() == null)) {
            return false;
        }
        if (listRecordsResult.getDatasetSyncCount() != null && !listRecordsResult.getDatasetSyncCount().equals(getDatasetSyncCount())) {
            return false;
        }
        if ((listRecordsResult.getLastModifiedBy() == null) ^ (getLastModifiedBy() == null)) {
            return false;
        }
        if (listRecordsResult.getLastModifiedBy() != null && !listRecordsResult.getLastModifiedBy().equals(getLastModifiedBy())) {
            return false;
        }
        if ((listRecordsResult.getMergedDatasetNames() == null) ^ (getMergedDatasetNames() == null)) {
            return false;
        }
        if (listRecordsResult.getMergedDatasetNames() != null && !listRecordsResult.getMergedDatasetNames().equals(getMergedDatasetNames())) {
            return false;
        }
        if ((listRecordsResult.getDatasetExists() == null) ^ (getDatasetExists() == null)) {
            return false;
        }
        if (listRecordsResult.getDatasetExists() != null && !listRecordsResult.getDatasetExists().equals(getDatasetExists())) {
            return false;
        }
        if ((listRecordsResult.getDatasetDeletedAfterRequestedSyncCount() == null) ^ (getDatasetDeletedAfterRequestedSyncCount() == null)) {
            return false;
        }
        if (listRecordsResult.getDatasetDeletedAfterRequestedSyncCount() != null && !listRecordsResult.getDatasetDeletedAfterRequestedSyncCount().equals(getDatasetDeletedAfterRequestedSyncCount())) {
            return false;
        }
        if ((listRecordsResult.getSyncSessionToken() == null) ^ (getSyncSessionToken() == null)) {
            return false;
        }
        return listRecordsResult.getSyncSessionToken() == null || listRecordsResult.getSyncSessionToken().equals(getSyncSessionToken());
    }

    public Integer getCount() {
        return this.count;
    }

    public Boolean getDatasetDeletedAfterRequestedSyncCount() {
        return this.datasetDeletedAfterRequestedSyncCount;
    }

    public Boolean getDatasetExists() {
        return this.datasetExists;
    }

    public Long getDatasetSyncCount() {
        return this.datasetSyncCount;
    }

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    public List<String> getMergedDatasetNames() {
        return this.mergedDatasetNames;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<Record> getRecords() {
        return this.records;
    }

    public String getSyncSessionToken() {
        return this.syncSessionToken;
    }

    public int hashCode() {
        return (((((((((((((((((getRecords() == null ? 0 : getRecords().hashCode()) + 31) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getCount() == null ? 0 : getCount().hashCode())) * 31) + (getDatasetSyncCount() == null ? 0 : getDatasetSyncCount().hashCode())) * 31) + (getLastModifiedBy() == null ? 0 : getLastModifiedBy().hashCode())) * 31) + (getMergedDatasetNames() == null ? 0 : getMergedDatasetNames().hashCode())) * 31) + (getDatasetExists() == null ? 0 : getDatasetExists().hashCode())) * 31) + (getDatasetDeletedAfterRequestedSyncCount() == null ? 0 : getDatasetDeletedAfterRequestedSyncCount().hashCode())) * 31) + (getSyncSessionToken() != null ? getSyncSessionToken().hashCode() : 0);
    }

    public Boolean isDatasetDeletedAfterRequestedSyncCount() {
        return this.datasetDeletedAfterRequestedSyncCount;
    }

    public Boolean isDatasetExists() {
        return this.datasetExists;
    }

    public void setCount(Integer num) {
        this.count = num;
    }

    public void setDatasetDeletedAfterRequestedSyncCount(Boolean bool) {
        this.datasetDeletedAfterRequestedSyncCount = bool;
    }

    public void setDatasetExists(Boolean bool) {
        this.datasetExists = bool;
    }

    public void setDatasetSyncCount(Long l) {
        this.datasetSyncCount = l;
    }

    public void setLastModifiedBy(String str) {
        this.lastModifiedBy = str;
    }

    public void setMergedDatasetNames(Collection<String> collection) {
        if (collection == null) {
            this.mergedDatasetNames = null;
        } else {
            this.mergedDatasetNames = new ArrayList(collection);
        }
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setRecords(Collection<Record> collection) {
        if (collection == null) {
            this.records = null;
        } else {
            this.records = new ArrayList(collection);
        }
    }

    public void setSyncSessionToken(String str) {
        this.syncSessionToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRecords() != null) {
            sb.append("Records: " + getRecords() + ",");
        }
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken() + ",");
        }
        if (getCount() != null) {
            sb.append("Count: " + getCount() + ",");
        }
        if (getDatasetSyncCount() != null) {
            sb.append("DatasetSyncCount: " + getDatasetSyncCount() + ",");
        }
        if (getLastModifiedBy() != null) {
            sb.append("LastModifiedBy: " + getLastModifiedBy() + ",");
        }
        if (getMergedDatasetNames() != null) {
            sb.append("MergedDatasetNames: " + getMergedDatasetNames() + ",");
        }
        if (getDatasetExists() != null) {
            sb.append("DatasetExists: " + getDatasetExists() + ",");
        }
        if (getDatasetDeletedAfterRequestedSyncCount() != null) {
            sb.append("DatasetDeletedAfterRequestedSyncCount: " + getDatasetDeletedAfterRequestedSyncCount() + ",");
        }
        if (getSyncSessionToken() != null) {
            sb.append("SyncSessionToken: " + getSyncSessionToken());
        }
        sb.append("}");
        return sb.toString();
    }

    public ListRecordsResult withCount(Integer num) {
        this.count = num;
        return this;
    }

    public ListRecordsResult withDatasetDeletedAfterRequestedSyncCount(Boolean bool) {
        this.datasetDeletedAfterRequestedSyncCount = bool;
        return this;
    }

    public ListRecordsResult withDatasetExists(Boolean bool) {
        this.datasetExists = bool;
        return this;
    }

    public ListRecordsResult withDatasetSyncCount(Long l) {
        this.datasetSyncCount = l;
        return this;
    }

    public ListRecordsResult withLastModifiedBy(String str) {
        this.lastModifiedBy = str;
        return this;
    }

    public ListRecordsResult withMergedDatasetNames(String... strArr) {
        if (getMergedDatasetNames() == null) {
            this.mergedDatasetNames = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.mergedDatasetNames.add(str);
        }
        return this;
    }

    public ListRecordsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListRecordsResult withRecords(Record... recordArr) {
        if (getRecords() == null) {
            this.records = new ArrayList(recordArr.length);
        }
        for (Record record : recordArr) {
            this.records.add(record);
        }
        return this;
    }

    public ListRecordsResult withSyncSessionToken(String str) {
        this.syncSessionToken = str;
        return this;
    }

    public ListRecordsResult withMergedDatasetNames(Collection<String> collection) {
        setMergedDatasetNames(collection);
        return this;
    }

    public ListRecordsResult withRecords(Collection<Record> collection) {
        setRecords(collection);
        return this;
    }
}
