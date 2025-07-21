package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class ReplicaUpdate implements Serializable {
    private CreateReplicaAction create;
    private DeleteReplicaAction delete;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ReplicaUpdate)) {
            return false;
        }
        ReplicaUpdate replicaUpdate = (ReplicaUpdate) obj;
        if ((replicaUpdate.getCreate() == null) ^ (getCreate() == null)) {
            return false;
        }
        if (replicaUpdate.getCreate() != null && !replicaUpdate.getCreate().equals(getCreate())) {
            return false;
        }
        if ((replicaUpdate.getDelete() == null) ^ (getDelete() == null)) {
            return false;
        }
        return replicaUpdate.getDelete() == null || replicaUpdate.getDelete().equals(getDelete());
    }

    public CreateReplicaAction getCreate() {
        return this.create;
    }

    public DeleteReplicaAction getDelete() {
        return this.delete;
    }

    public int hashCode() {
        return (((getCreate() == null ? 0 : getCreate().hashCode()) + 31) * 31) + (getDelete() != null ? getDelete().hashCode() : 0);
    }

    public void setCreate(CreateReplicaAction createReplicaAction) {
        this.create = createReplicaAction;
    }

    public void setDelete(DeleteReplicaAction deleteReplicaAction) {
        this.delete = deleteReplicaAction;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCreate() != null) {
            sb.append("Create: " + getCreate() + ",");
        }
        if (getDelete() != null) {
            sb.append("Delete: " + getDelete());
        }
        sb.append("}");
        return sb.toString();
    }

    public ReplicaUpdate withCreate(CreateReplicaAction createReplicaAction) {
        this.create = createReplicaAction;
        return this;
    }

    public ReplicaUpdate withDelete(DeleteReplicaAction deleteReplicaAction) {
        this.delete = deleteReplicaAction;
        return this;
    }
}
