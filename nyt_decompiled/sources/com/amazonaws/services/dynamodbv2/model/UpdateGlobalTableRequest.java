package com.amazonaws.services.dynamodbv2.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public class UpdateGlobalTableRequest extends AmazonWebServiceRequest implements Serializable {
    private String globalTableName;
    private List<ReplicaUpdate> replicaUpdates;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateGlobalTableRequest)) {
            return false;
        }
        UpdateGlobalTableRequest updateGlobalTableRequest = (UpdateGlobalTableRequest) obj;
        if ((updateGlobalTableRequest.getGlobalTableName() == null) ^ (getGlobalTableName() == null)) {
            return false;
        }
        if (updateGlobalTableRequest.getGlobalTableName() != null && !updateGlobalTableRequest.getGlobalTableName().equals(getGlobalTableName())) {
            return false;
        }
        if ((updateGlobalTableRequest.getReplicaUpdates() == null) ^ (getReplicaUpdates() == null)) {
            return false;
        }
        return updateGlobalTableRequest.getReplicaUpdates() == null || updateGlobalTableRequest.getReplicaUpdates().equals(getReplicaUpdates());
    }

    public String getGlobalTableName() {
        return this.globalTableName;
    }

    public List<ReplicaUpdate> getReplicaUpdates() {
        return this.replicaUpdates;
    }

    public int hashCode() {
        return (((getGlobalTableName() == null ? 0 : getGlobalTableName().hashCode()) + 31) * 31) + (getReplicaUpdates() != null ? getReplicaUpdates().hashCode() : 0);
    }

    public void setGlobalTableName(String str) {
        this.globalTableName = str;
    }

    public void setReplicaUpdates(Collection<ReplicaUpdate> collection) {
        if (collection == null) {
            this.replicaUpdates = null;
        } else {
            this.replicaUpdates = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGlobalTableName() != null) {
            sb.append("GlobalTableName: " + getGlobalTableName() + ",");
        }
        if (getReplicaUpdates() != null) {
            sb.append("ReplicaUpdates: " + getReplicaUpdates());
        }
        sb.append("}");
        return sb.toString();
    }

    public UpdateGlobalTableRequest withGlobalTableName(String str) {
        this.globalTableName = str;
        return this;
    }

    public UpdateGlobalTableRequest withReplicaUpdates(ReplicaUpdate... replicaUpdateArr) {
        if (getReplicaUpdates() == null) {
            this.replicaUpdates = new ArrayList(replicaUpdateArr.length);
        }
        for (ReplicaUpdate replicaUpdate : replicaUpdateArr) {
            this.replicaUpdates.add(replicaUpdate);
        }
        return this;
    }

    public UpdateGlobalTableRequest withReplicaUpdates(Collection<ReplicaUpdate> collection) {
        setReplicaUpdates(collection);
        return this;
    }
}
