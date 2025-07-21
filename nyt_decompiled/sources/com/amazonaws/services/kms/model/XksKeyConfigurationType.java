package com.amazonaws.services.kms.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class XksKeyConfigurationType implements Serializable {
    private String id;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof XksKeyConfigurationType)) {
            return false;
        }
        XksKeyConfigurationType xksKeyConfigurationType = (XksKeyConfigurationType) obj;
        if ((xksKeyConfigurationType.getId() == null) ^ (getId() == null)) {
            return false;
        }
        return xksKeyConfigurationType.getId() == null || xksKeyConfigurationType.getId().equals(getId());
    }

    public String getId() {
        return this.id;
    }

    public int hashCode() {
        return 31 + (getId() == null ? 0 : getId().hashCode());
    }

    public void setId(String str) {
        this.id = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getId() != null) {
            sb.append("Id: " + getId());
        }
        sb.append("}");
        return sb.toString();
    }

    public XksKeyConfigurationType withId(String str) {
        this.id = str;
        return this;
    }
}
