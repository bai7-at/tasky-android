package com.amazonaws.services.cognitosync.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public class UpdateRecordsRequest extends AmazonWebServiceRequest implements Serializable {
    private String clientContext;
    private String datasetName;
    private String deviceId;
    private String identityId;
    private String identityPoolId;
    private List<RecordPatch> recordPatches;
    private String syncSessionToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateRecordsRequest)) {
            return false;
        }
        UpdateRecordsRequest updateRecordsRequest = (UpdateRecordsRequest) obj;
        if ((updateRecordsRequest.getIdentityPoolId() == null) ^ (getIdentityPoolId() == null)) {
            return false;
        }
        if (updateRecordsRequest.getIdentityPoolId() != null && !updateRecordsRequest.getIdentityPoolId().equals(getIdentityPoolId())) {
            return false;
        }
        if ((updateRecordsRequest.getIdentityId() == null) ^ (getIdentityId() == null)) {
            return false;
        }
        if (updateRecordsRequest.getIdentityId() != null && !updateRecordsRequest.getIdentityId().equals(getIdentityId())) {
            return false;
        }
        if ((updateRecordsRequest.getDatasetName() == null) ^ (getDatasetName() == null)) {
            return false;
        }
        if (updateRecordsRequest.getDatasetName() != null && !updateRecordsRequest.getDatasetName().equals(getDatasetName())) {
            return false;
        }
        if ((updateRecordsRequest.getDeviceId() == null) ^ (getDeviceId() == null)) {
            return false;
        }
        if (updateRecordsRequest.getDeviceId() != null && !updateRecordsRequest.getDeviceId().equals(getDeviceId())) {
            return false;
        }
        if ((updateRecordsRequest.getRecordPatches() == null) ^ (getRecordPatches() == null)) {
            return false;
        }
        if (updateRecordsRequest.getRecordPatches() != null && !updateRecordsRequest.getRecordPatches().equals(getRecordPatches())) {
            return false;
        }
        if ((updateRecordsRequest.getSyncSessionToken() == null) ^ (getSyncSessionToken() == null)) {
            return false;
        }
        if (updateRecordsRequest.getSyncSessionToken() != null && !updateRecordsRequest.getSyncSessionToken().equals(getSyncSessionToken())) {
            return false;
        }
        if ((updateRecordsRequest.getClientContext() == null) ^ (getClientContext() == null)) {
            return false;
        }
        return updateRecordsRequest.getClientContext() == null || updateRecordsRequest.getClientContext().equals(getClientContext());
    }

    public String getClientContext() {
        return this.clientContext;
    }

    public String getDatasetName() {
        return this.datasetName;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getIdentityId() {
        return this.identityId;
    }

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    public List<RecordPatch> getRecordPatches() {
        return this.recordPatches;
    }

    public String getSyncSessionToken() {
        return this.syncSessionToken;
    }

    public int hashCode() {
        return (((((((((((((getIdentityPoolId() == null ? 0 : getIdentityPoolId().hashCode()) + 31) * 31) + (getIdentityId() == null ? 0 : getIdentityId().hashCode())) * 31) + (getDatasetName() == null ? 0 : getDatasetName().hashCode())) * 31) + (getDeviceId() == null ? 0 : getDeviceId().hashCode())) * 31) + (getRecordPatches() == null ? 0 : getRecordPatches().hashCode())) * 31) + (getSyncSessionToken() == null ? 0 : getSyncSessionToken().hashCode())) * 31) + (getClientContext() != null ? getClientContext().hashCode() : 0);
    }

    public void setClientContext(String str) {
        this.clientContext = str;
    }

    public void setDatasetName(String str) {
        this.datasetName = str;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setIdentityId(String str) {
        this.identityId = str;
    }

    public void setIdentityPoolId(String str) {
        this.identityPoolId = str;
    }

    public void setRecordPatches(Collection<RecordPatch> collection) {
        if (collection == null) {
            this.recordPatches = null;
        } else {
            this.recordPatches = new ArrayList(collection);
        }
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
        if (getDeviceId() != null) {
            sb.append("DeviceId: " + getDeviceId() + ",");
        }
        if (getRecordPatches() != null) {
            sb.append("RecordPatches: " + getRecordPatches() + ",");
        }
        if (getSyncSessionToken() != null) {
            sb.append("SyncSessionToken: " + getSyncSessionToken() + ",");
        }
        if (getClientContext() != null) {
            sb.append("ClientContext: " + getClientContext());
        }
        sb.append("}");
        return sb.toString();
    }

    public UpdateRecordsRequest withClientContext(String str) {
        this.clientContext = str;
        return this;
    }

    public UpdateRecordsRequest withDatasetName(String str) {
        this.datasetName = str;
        return this;
    }

    public UpdateRecordsRequest withDeviceId(String str) {
        this.deviceId = str;
        return this;
    }

    public UpdateRecordsRequest withIdentityId(String str) {
        this.identityId = str;
        return this;
    }

    public UpdateRecordsRequest withIdentityPoolId(String str) {
        this.identityPoolId = str;
        return this;
    }

    public UpdateRecordsRequest withRecordPatches(RecordPatch... recordPatchArr) {
        if (getRecordPatches() == null) {
            this.recordPatches = new ArrayList(recordPatchArr.length);
        }
        for (RecordPatch recordPatch : recordPatchArr) {
            this.recordPatches.add(recordPatch);
        }
        return this;
    }

    public UpdateRecordsRequest withSyncSessionToken(String str) {
        this.syncSessionToken = str;
        return this;
    }

    public UpdateRecordsRequest withRecordPatches(Collection<RecordPatch> collection) {
        setRecordPatches(collection);
        return this;
    }
}
