package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class GlobalTableDescription implements Serializable {
    private Date creationDateTime;
    private String globalTableArn;
    private String globalTableName;
    private String globalTableStatus;
    private List<ReplicaDescription> replicationGroup;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GlobalTableDescription)) {
            return false;
        }
        GlobalTableDescription globalTableDescription = (GlobalTableDescription) obj;
        if ((globalTableDescription.getReplicationGroup() == null) ^ (getReplicationGroup() == null)) {
            return false;
        }
        if (globalTableDescription.getReplicationGroup() != null && !globalTableDescription.getReplicationGroup().equals(getReplicationGroup())) {
            return false;
        }
        if ((globalTableDescription.getGlobalTableArn() == null) ^ (getGlobalTableArn() == null)) {
            return false;
        }
        if (globalTableDescription.getGlobalTableArn() != null && !globalTableDescription.getGlobalTableArn().equals(getGlobalTableArn())) {
            return false;
        }
        if ((globalTableDescription.getCreationDateTime() == null) ^ (getCreationDateTime() == null)) {
            return false;
        }
        if (globalTableDescription.getCreationDateTime() != null && !globalTableDescription.getCreationDateTime().equals(getCreationDateTime())) {
            return false;
        }
        if ((globalTableDescription.getGlobalTableStatus() == null) ^ (getGlobalTableStatus() == null)) {
            return false;
        }
        if (globalTableDescription.getGlobalTableStatus() != null && !globalTableDescription.getGlobalTableStatus().equals(getGlobalTableStatus())) {
            return false;
        }
        if ((globalTableDescription.getGlobalTableName() == null) ^ (getGlobalTableName() == null)) {
            return false;
        }
        return globalTableDescription.getGlobalTableName() == null || globalTableDescription.getGlobalTableName().equals(getGlobalTableName());
    }

    public Date getCreationDateTime() {
        return this.creationDateTime;
    }

    public String getGlobalTableArn() {
        return this.globalTableArn;
    }

    public String getGlobalTableName() {
        return this.globalTableName;
    }

    public String getGlobalTableStatus() {
        return this.globalTableStatus;
    }

    public List<ReplicaDescription> getReplicationGroup() {
        return this.replicationGroup;
    }

    public int hashCode() {
        return (((((((((getReplicationGroup() == null ? 0 : getReplicationGroup().hashCode()) + 31) * 31) + (getGlobalTableArn() == null ? 0 : getGlobalTableArn().hashCode())) * 31) + (getCreationDateTime() == null ? 0 : getCreationDateTime().hashCode())) * 31) + (getGlobalTableStatus() == null ? 0 : getGlobalTableStatus().hashCode())) * 31) + (getGlobalTableName() != null ? getGlobalTableName().hashCode() : 0);
    }

    public void setCreationDateTime(Date date) {
        this.creationDateTime = date;
    }

    public void setGlobalTableArn(String str) {
        this.globalTableArn = str;
    }

    public void setGlobalTableName(String str) {
        this.globalTableName = str;
    }

    public void setGlobalTableStatus(String str) {
        this.globalTableStatus = str;
    }

    public void setReplicationGroup(Collection<ReplicaDescription> collection) {
        if (collection == null) {
            this.replicationGroup = null;
        } else {
            this.replicationGroup = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getReplicationGroup() != null) {
            sb.append("ReplicationGroup: " + getReplicationGroup() + ",");
        }
        if (getGlobalTableArn() != null) {
            sb.append("GlobalTableArn: " + getGlobalTableArn() + ",");
        }
        if (getCreationDateTime() != null) {
            sb.append("CreationDateTime: " + getCreationDateTime() + ",");
        }
        if (getGlobalTableStatus() != null) {
            sb.append("GlobalTableStatus: " + getGlobalTableStatus() + ",");
        }
        if (getGlobalTableName() != null) {
            sb.append("GlobalTableName: " + getGlobalTableName());
        }
        sb.append("}");
        return sb.toString();
    }

    public GlobalTableDescription withCreationDateTime(Date date) {
        this.creationDateTime = date;
        return this;
    }

    public GlobalTableDescription withGlobalTableArn(String str) {
        this.globalTableArn = str;
        return this;
    }

    public GlobalTableDescription withGlobalTableName(String str) {
        this.globalTableName = str;
        return this;
    }

    public GlobalTableDescription withGlobalTableStatus(String str) {
        this.globalTableStatus = str;
        return this;
    }

    public GlobalTableDescription withReplicationGroup(ReplicaDescription... replicaDescriptionArr) {
        if (getReplicationGroup() == null) {
            this.replicationGroup = new ArrayList(replicaDescriptionArr.length);
        }
        for (ReplicaDescription replicaDescription : replicaDescriptionArr) {
            this.replicationGroup.add(replicaDescription);
        }
        return this;
    }

    public void setGlobalTableStatus(GlobalTableStatus globalTableStatus) {
        this.globalTableStatus = globalTableStatus.toString();
    }

    public GlobalTableDescription withGlobalTableStatus(GlobalTableStatus globalTableStatus) {
        this.globalTableStatus = globalTableStatus.toString();
        return this;
    }

    public GlobalTableDescription withReplicationGroup(Collection<ReplicaDescription> collection) {
        setReplicationGroup(collection);
        return this;
    }
}
