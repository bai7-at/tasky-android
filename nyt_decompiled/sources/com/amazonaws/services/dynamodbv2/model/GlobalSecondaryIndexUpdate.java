package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class GlobalSecondaryIndexUpdate implements Serializable {
    private CreateGlobalSecondaryIndexAction create;
    private DeleteGlobalSecondaryIndexAction delete;
    private UpdateGlobalSecondaryIndexAction update;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GlobalSecondaryIndexUpdate)) {
            return false;
        }
        GlobalSecondaryIndexUpdate globalSecondaryIndexUpdate = (GlobalSecondaryIndexUpdate) obj;
        if ((globalSecondaryIndexUpdate.getUpdate() == null) ^ (getUpdate() == null)) {
            return false;
        }
        if (globalSecondaryIndexUpdate.getUpdate() != null && !globalSecondaryIndexUpdate.getUpdate().equals(getUpdate())) {
            return false;
        }
        if ((globalSecondaryIndexUpdate.getCreate() == null) ^ (getCreate() == null)) {
            return false;
        }
        if (globalSecondaryIndexUpdate.getCreate() != null && !globalSecondaryIndexUpdate.getCreate().equals(getCreate())) {
            return false;
        }
        if ((globalSecondaryIndexUpdate.getDelete() == null) ^ (getDelete() == null)) {
            return false;
        }
        return globalSecondaryIndexUpdate.getDelete() == null || globalSecondaryIndexUpdate.getDelete().equals(getDelete());
    }

    public CreateGlobalSecondaryIndexAction getCreate() {
        return this.create;
    }

    public DeleteGlobalSecondaryIndexAction getDelete() {
        return this.delete;
    }

    public UpdateGlobalSecondaryIndexAction getUpdate() {
        return this.update;
    }

    public int hashCode() {
        return (((((getUpdate() == null ? 0 : getUpdate().hashCode()) + 31) * 31) + (getCreate() == null ? 0 : getCreate().hashCode())) * 31) + (getDelete() != null ? getDelete().hashCode() : 0);
    }

    public void setCreate(CreateGlobalSecondaryIndexAction createGlobalSecondaryIndexAction) {
        this.create = createGlobalSecondaryIndexAction;
    }

    public void setDelete(DeleteGlobalSecondaryIndexAction deleteGlobalSecondaryIndexAction) {
        this.delete = deleteGlobalSecondaryIndexAction;
    }

    public void setUpdate(UpdateGlobalSecondaryIndexAction updateGlobalSecondaryIndexAction) {
        this.update = updateGlobalSecondaryIndexAction;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUpdate() != null) {
            sb.append("Update: " + getUpdate() + ",");
        }
        if (getCreate() != null) {
            sb.append("Create: " + getCreate() + ",");
        }
        if (getDelete() != null) {
            sb.append("Delete: " + getDelete());
        }
        sb.append("}");
        return sb.toString();
    }

    public GlobalSecondaryIndexUpdate withCreate(CreateGlobalSecondaryIndexAction createGlobalSecondaryIndexAction) {
        this.create = createGlobalSecondaryIndexAction;
        return this;
    }

    public GlobalSecondaryIndexUpdate withDelete(DeleteGlobalSecondaryIndexAction deleteGlobalSecondaryIndexAction) {
        this.delete = deleteGlobalSecondaryIndexAction;
        return this;
    }

    public GlobalSecondaryIndexUpdate withUpdate(UpdateGlobalSecondaryIndexAction updateGlobalSecondaryIndexAction) {
        this.update = updateGlobalSecondaryIndexAction;
        return this;
    }
}
