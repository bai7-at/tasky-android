package com.amazonaws.services.cognitosync.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

@Deprecated
/* loaded from: classes.dex */
public class ListRecordsRequest extends AmazonWebServiceRequest implements Serializable {
    private String datasetName;
    private String identityId;
    private String identityPoolId;
    private Long lastSyncCount;
    private Integer maxResults;
    private String nextToken;
    private String syncSessionToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListRecordsRequest)) {
            return false;
        }
        ListRecordsRequest listRecordsRequest = (ListRecordsRequest) obj;
        if ((listRecordsRequest.getIdentityPoolId() == null) ^ (getIdentityPoolId() == null)) {
            return false;
        }
        if (listRecordsRequest.getIdentityPoolId() != null && !listRecordsRequest.getIdentityPoolId().equals(getIdentityPoolId())) {
            return false;
        }
        if ((listRecordsRequest.getIdentityId() == null) ^ (getIdentityId() == null)) {
            return false;
        }
        if (listRecordsRequest.getIdentityId() != null && !listRecordsRequest.getIdentityId().equals(getIdentityId())) {
            return false;
        }
        if ((listRecordsRequest.getDatasetName() == null) ^ (getDatasetName() == null)) {
            return false;
        }
        if (listRecordsRequest.getDatasetName() != null && !listRecordsRequest.getDatasetName().equals(getDatasetName())) {
            return false;
        }
        if ((listRecordsRequest.getLastSyncCount() == null) ^ (getLastSyncCount() == null)) {
            return false;
        }
        if (listRecordsRequest.getLastSyncCount() != null && !listRecordsRequest.getLastSyncCount().equals(getLastSyncCount())) {
            return false;
        }
        if ((listRecordsRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (listRecordsRequest.getNextToken() != null && !listRecordsRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((listRecordsRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        if (listRecordsRequest.getMaxResults() != null && !listRecordsRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if ((listRecordsRequest.getSyncSessionToken() == null) ^ (getSyncSessionToken() == null)) {
            return false;
        }
        return listRecordsRequest.getSyncSessionToken() == null || listRecordsRequest.getSyncSessionToken().equals(getSyncSessionToken());
    }

    public String getDatasetName() {
        return this.datasetName;
    }

    public String getIdentityId() {
        return this.identityId;
    }

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    public Long getLastSyncCount() {
        return this.lastSyncCount;
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public String getSyncSessionToken() {
        return this.syncSessionToken;
    }

    public int hashCode() {
        return (((((((((((((getIdentityPoolId() == null ? 0 : getIdentityPoolId().hashCode()) + 31) * 31) + (getIdentityId() == null ? 0 : getIdentityId().hashCode())) * 31) + (getDatasetName() == null ? 0 : getDatasetName().hashCode())) * 31) + (getLastSyncCount() == null ? 0 : getLastSyncCount().hashCode())) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getMaxResults() == null ? 0 : getMaxResults().hashCode())) * 31) + (getSyncSessionToken() != null ? getSyncSessionToken().hashCode() : 0);
    }

    public void setDatasetName(String str) {
        this.datasetName = str;
    }

    public void setIdentityId(String str) {
        this.identityId = str;
    }

    public void setIdentityPoolId(String str) {
        this.identityPoolId = str;
    }

    public void setLastSyncCount(Long l) {
        this.lastSyncCount = l;
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setSyncSessionToken(String str) {
        this.syncSessionToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIdentityPoolId() != null) {
            sb.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        }
        if (getIdentityId() != null) {
            sb.append("IdentityId: " + getIdentityId() + ",");
        }
        if (getDatasetName() != null) {
            sb.append("DatasetName: " + getDatasetName() + ",");
        }
        if (getLastSyncCount() != null) {
            sb.append("LastSyncCount: " + getLastSyncCount() + ",");
        }
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken() + ",");
        }
        if (getMaxResults() != null) {
            sb.append("MaxResults: " + getMaxResults() + ",");
        }
        if (getSyncSessionToken() != null) {
            sb.append("SyncSessionToken: " + getSyncSessionToken());
        }
        sb.append("}");
        return sb.toString();
    }

    public ListRecordsRequest withDatasetName(String str) {
        this.datasetName = str;
        return this;
    }

    public ListRecordsRequest withIdentityId(String str) {
        this.identityId = str;
        return this;
    }

    public ListRecordsRequest withIdentityPoolId(String str) {
        this.identityPoolId = str;
        return this;
    }

    public ListRecordsRequest withLastSyncCount(Long l) {
        this.lastSyncCount = l;
        return this;
    }

    public ListRecordsRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListRecordsRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListRecordsRequest withSyncSessionToken(String str) {
        this.syncSessionToken = str;
        return this;
    }
}
