package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public class UpdateGlobalTableSettingsResult implements Serializable {
    private String globalTableName;
    private List<ReplicaSettingsDescription> replicaSettings;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateGlobalTableSettingsResult)) {
            return false;
        }
        UpdateGlobalTableSettingsResult updateGlobalTableSettingsResult = (UpdateGlobalTableSettingsResult) obj;
        if ((updateGlobalTableSettingsResult.getGlobalTableName() == null) ^ (getGlobalTableName() == null)) {
            return false;
        }
        if (updateGlobalTableSettingsResult.getGlobalTableName() != null && !updateGlobalTableSettingsResult.getGlobalTableName().equals(getGlobalTableName())) {
            return false;
        }
        if ((updateGlobalTableSettingsResult.getReplicaSettings() == null) ^ (getReplicaSettings() == null)) {
            return false;
        }
        return updateGlobalTableSettingsResult.getReplicaSettings() == null || updateGlobalTableSettingsResult.getReplicaSettings().equals(getReplicaSettings());
    }

    public String getGlobalTableName() {
        return this.globalTableName;
    }

    public List<ReplicaSettingsDescription> getReplicaSettings() {
        return this.replicaSettings;
    }

    public int hashCode() {
        return (((getGlobalTableName() == null ? 0 : getGlobalTableName().hashCode()) + 31) * 31) + (getReplicaSettings() != null ? getReplicaSettings().hashCode() : 0);
    }

    public void setGlobalTableName(String str) {
        this.globalTableName = str;
    }

    public void setReplicaSettings(Collection<ReplicaSettingsDescription> collection) {
        if (collection == null) {
            this.replicaSettings = null;
        } else {
            this.replicaSettings = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGlobalTableName() != null) {
            sb.append("GlobalTableName: " + getGlobalTableName() + ",");
        }
        if (getReplicaSettings() != null) {
            sb.append("ReplicaSettings: " + getReplicaSettings());
        }
        sb.append("}");
        return sb.toString();
    }

    public UpdateGlobalTableSettingsResult withGlobalTableName(String str) {
        this.globalTableName = str;
        return this;
    }

    public UpdateGlobalTableSettingsResult withReplicaSettings(ReplicaSettingsDescription... replicaSettingsDescriptionArr) {
        if (getReplicaSettings() == null) {
            this.replicaSettings = new ArrayList(replicaSettingsDescriptionArr.length);
        }
        for (ReplicaSettingsDescription replicaSettingsDescription : replicaSettingsDescriptionArr) {
            this.replicaSettings.add(replicaSettingsDescription);
        }
        return this;
    }

    public UpdateGlobalTableSettingsResult withReplicaSettings(Collection<ReplicaSettingsDescription> collection) {
        setReplicaSettings(collection);
        return this;
    }
}
