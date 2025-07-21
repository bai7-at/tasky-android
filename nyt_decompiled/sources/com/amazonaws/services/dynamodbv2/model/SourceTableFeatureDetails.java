package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public class SourceTableFeatureDetails implements Serializable {
    private List<GlobalSecondaryIndexInfo> globalSecondaryIndexes;
    private List<LocalSecondaryIndexInfo> localSecondaryIndexes;
    private SSEDescription sSEDescription;
    private StreamSpecification streamDescription;
    private TimeToLiveDescription timeToLiveDescription;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SourceTableFeatureDetails)) {
            return false;
        }
        SourceTableFeatureDetails sourceTableFeatureDetails = (SourceTableFeatureDetails) obj;
        if ((sourceTableFeatureDetails.getLocalSecondaryIndexes() == null) ^ (getLocalSecondaryIndexes() == null)) {
            return false;
        }
        if (sourceTableFeatureDetails.getLocalSecondaryIndexes() != null && !sourceTableFeatureDetails.getLocalSecondaryIndexes().equals(getLocalSecondaryIndexes())) {
            return false;
        }
        if ((sourceTableFeatureDetails.getGlobalSecondaryIndexes() == null) ^ (getGlobalSecondaryIndexes() == null)) {
            return false;
        }
        if (sourceTableFeatureDetails.getGlobalSecondaryIndexes() != null && !sourceTableFeatureDetails.getGlobalSecondaryIndexes().equals(getGlobalSecondaryIndexes())) {
            return false;
        }
        if ((sourceTableFeatureDetails.getStreamDescription() == null) ^ (getStreamDescription() == null)) {
            return false;
        }
        if (sourceTableFeatureDetails.getStreamDescription() != null && !sourceTableFeatureDetails.getStreamDescription().equals(getStreamDescription())) {
            return false;
        }
        if ((sourceTableFeatureDetails.getTimeToLiveDescription() == null) ^ (getTimeToLiveDescription() == null)) {
            return false;
        }
        if (sourceTableFeatureDetails.getTimeToLiveDescription() != null && !sourceTableFeatureDetails.getTimeToLiveDescription().equals(getTimeToLiveDescription())) {
            return false;
        }
        if ((sourceTableFeatureDetails.getSSEDescription() == null) ^ (getSSEDescription() == null)) {
            return false;
        }
        return sourceTableFeatureDetails.getSSEDescription() == null || sourceTableFeatureDetails.getSSEDescription().equals(getSSEDescription());
    }

    public List<GlobalSecondaryIndexInfo> getGlobalSecondaryIndexes() {
        return this.globalSecondaryIndexes;
    }

    public List<LocalSecondaryIndexInfo> getLocalSecondaryIndexes() {
        return this.localSecondaryIndexes;
    }

    public SSEDescription getSSEDescription() {
        return this.sSEDescription;
    }

    public StreamSpecification getStreamDescription() {
        return this.streamDescription;
    }

    public TimeToLiveDescription getTimeToLiveDescription() {
        return this.timeToLiveDescription;
    }

    public int hashCode() {
        return (((((((((getLocalSecondaryIndexes() == null ? 0 : getLocalSecondaryIndexes().hashCode()) + 31) * 31) + (getGlobalSecondaryIndexes() == null ? 0 : getGlobalSecondaryIndexes().hashCode())) * 31) + (getStreamDescription() == null ? 0 : getStreamDescription().hashCode())) * 31) + (getTimeToLiveDescription() == null ? 0 : getTimeToLiveDescription().hashCode())) * 31) + (getSSEDescription() != null ? getSSEDescription().hashCode() : 0);
    }

    public void setGlobalSecondaryIndexes(Collection<GlobalSecondaryIndexInfo> collection) {
        if (collection == null) {
            this.globalSecondaryIndexes = null;
        } else {
            this.globalSecondaryIndexes = new ArrayList(collection);
        }
    }

    public void setLocalSecondaryIndexes(Collection<LocalSecondaryIndexInfo> collection) {
        if (collection == null) {
            this.localSecondaryIndexes = null;
        } else {
            this.localSecondaryIndexes = new ArrayList(collection);
        }
    }

    public void setSSEDescription(SSEDescription sSEDescription) {
        this.sSEDescription = sSEDescription;
    }

    public void setStreamDescription(StreamSpecification streamSpecification) {
        this.streamDescription = streamSpecification;
    }

    public void setTimeToLiveDescription(TimeToLiveDescription timeToLiveDescription) {
        this.timeToLiveDescription = timeToLiveDescription;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLocalSecondaryIndexes() != null) {
            sb.append("LocalSecondaryIndexes: " + getLocalSecondaryIndexes() + ",");
        }
        if (getGlobalSecondaryIndexes() != null) {
            sb.append("GlobalSecondaryIndexes: " + getGlobalSecondaryIndexes() + ",");
        }
        if (getStreamDescription() != null) {
            sb.append("StreamDescription: " + getStreamDescription() + ",");
        }
        if (getTimeToLiveDescription() != null) {
            sb.append("TimeToLiveDescription: " + getTimeToLiveDescription() + ",");
        }
        if (getSSEDescription() != null) {
            sb.append("SSEDescription: " + getSSEDescription());
        }
        sb.append("}");
        return sb.toString();
    }

    public SourceTableFeatureDetails withGlobalSecondaryIndexes(GlobalSecondaryIndexInfo... globalSecondaryIndexInfoArr) {
        if (getGlobalSecondaryIndexes() == null) {
            this.globalSecondaryIndexes = new ArrayList(globalSecondaryIndexInfoArr.length);
        }
        for (GlobalSecondaryIndexInfo globalSecondaryIndexInfo : globalSecondaryIndexInfoArr) {
            this.globalSecondaryIndexes.add(globalSecondaryIndexInfo);
        }
        return this;
    }

    public SourceTableFeatureDetails withLocalSecondaryIndexes(LocalSecondaryIndexInfo... localSecondaryIndexInfoArr) {
        if (getLocalSecondaryIndexes() == null) {
            this.localSecondaryIndexes = new ArrayList(localSecondaryIndexInfoArr.length);
        }
        for (LocalSecondaryIndexInfo localSecondaryIndexInfo : localSecondaryIndexInfoArr) {
            this.localSecondaryIndexes.add(localSecondaryIndexInfo);
        }
        return this;
    }

    public SourceTableFeatureDetails withSSEDescription(SSEDescription sSEDescription) {
        this.sSEDescription = sSEDescription;
        return this;
    }

    public SourceTableFeatureDetails withStreamDescription(StreamSpecification streamSpecification) {
        this.streamDescription = streamSpecification;
        return this;
    }

    public SourceTableFeatureDetails withTimeToLiveDescription(TimeToLiveDescription timeToLiveDescription) {
        this.timeToLiveDescription = timeToLiveDescription;
        return this;
    }

    public SourceTableFeatureDetails withGlobalSecondaryIndexes(Collection<GlobalSecondaryIndexInfo> collection) {
        setGlobalSecondaryIndexes(collection);
        return this;
    }

    public SourceTableFeatureDetails withLocalSecondaryIndexes(Collection<LocalSecondaryIndexInfo> collection) {
        setLocalSecondaryIndexes(collection);
        return this;
    }
}
