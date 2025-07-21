package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class AutoScalingSettingsUpdate implements Serializable {
    private Boolean autoScalingDisabled;
    private String autoScalingRoleArn;
    private Long maximumUnits;
    private Long minimumUnits;
    private AutoScalingPolicyUpdate scalingPolicyUpdate;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AutoScalingSettingsUpdate)) {
            return false;
        }
        AutoScalingSettingsUpdate autoScalingSettingsUpdate = (AutoScalingSettingsUpdate) obj;
        if ((autoScalingSettingsUpdate.getMinimumUnits() == null) ^ (getMinimumUnits() == null)) {
            return false;
        }
        if (autoScalingSettingsUpdate.getMinimumUnits() != null && !autoScalingSettingsUpdate.getMinimumUnits().equals(getMinimumUnits())) {
            return false;
        }
        if ((autoScalingSettingsUpdate.getMaximumUnits() == null) ^ (getMaximumUnits() == null)) {
            return false;
        }
        if (autoScalingSettingsUpdate.getMaximumUnits() != null && !autoScalingSettingsUpdate.getMaximumUnits().equals(getMaximumUnits())) {
            return false;
        }
        if ((autoScalingSettingsUpdate.getAutoScalingDisabled() == null) ^ (getAutoScalingDisabled() == null)) {
            return false;
        }
        if (autoScalingSettingsUpdate.getAutoScalingDisabled() != null && !autoScalingSettingsUpdate.getAutoScalingDisabled().equals(getAutoScalingDisabled())) {
            return false;
        }
        if ((autoScalingSettingsUpdate.getAutoScalingRoleArn() == null) ^ (getAutoScalingRoleArn() == null)) {
            return false;
        }
        if (autoScalingSettingsUpdate.getAutoScalingRoleArn() != null && !autoScalingSettingsUpdate.getAutoScalingRoleArn().equals(getAutoScalingRoleArn())) {
            return false;
        }
        if ((autoScalingSettingsUpdate.getScalingPolicyUpdate() == null) ^ (getScalingPolicyUpdate() == null)) {
            return false;
        }
        return autoScalingSettingsUpdate.getScalingPolicyUpdate() == null || autoScalingSettingsUpdate.getScalingPolicyUpdate().equals(getScalingPolicyUpdate());
    }

    public Boolean getAutoScalingDisabled() {
        return this.autoScalingDisabled;
    }

    public String getAutoScalingRoleArn() {
        return this.autoScalingRoleArn;
    }

    public Long getMaximumUnits() {
        return this.maximumUnits;
    }

    public Long getMinimumUnits() {
        return this.minimumUnits;
    }

    public AutoScalingPolicyUpdate getScalingPolicyUpdate() {
        return this.scalingPolicyUpdate;
    }

    public int hashCode() {
        return (((((((((getMinimumUnits() == null ? 0 : getMinimumUnits().hashCode()) + 31) * 31) + (getMaximumUnits() == null ? 0 : getMaximumUnits().hashCode())) * 31) + (getAutoScalingDisabled() == null ? 0 : getAutoScalingDisabled().hashCode())) * 31) + (getAutoScalingRoleArn() == null ? 0 : getAutoScalingRoleArn().hashCode())) * 31) + (getScalingPolicyUpdate() != null ? getScalingPolicyUpdate().hashCode() : 0);
    }

    public Boolean isAutoScalingDisabled() {
        return this.autoScalingDisabled;
    }

    public void setAutoScalingDisabled(Boolean bool) {
        this.autoScalingDisabled = bool;
    }

    public void setAutoScalingRoleArn(String str) {
        this.autoScalingRoleArn = str;
    }

    public void setMaximumUnits(Long l) {
        this.maximumUnits = l;
    }

    public void setMinimumUnits(Long l) {
        this.minimumUnits = l;
    }

    public void setScalingPolicyUpdate(AutoScalingPolicyUpdate autoScalingPolicyUpdate) {
        this.scalingPolicyUpdate = autoScalingPolicyUpdate;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMinimumUnits() != null) {
            sb.append("MinimumUnits: " + getMinimumUnits() + ",");
        }
        if (getMaximumUnits() != null) {
            sb.append("MaximumUnits: " + getMaximumUnits() + ",");
        }
        if (getAutoScalingDisabled() != null) {
            sb.append("AutoScalingDisabled: " + getAutoScalingDisabled() + ",");
        }
        if (getAutoScalingRoleArn() != null) {
            sb.append("AutoScalingRoleArn: " + getAutoScalingRoleArn() + ",");
        }
        if (getScalingPolicyUpdate() != null) {
            sb.append("ScalingPolicyUpdate: " + getScalingPolicyUpdate());
        }
        sb.append("}");
        return sb.toString();
    }

    public AutoScalingSettingsUpdate withAutoScalingDisabled(Boolean bool) {
        this.autoScalingDisabled = bool;
        return this;
    }

    public AutoScalingSettingsUpdate withAutoScalingRoleArn(String str) {
        this.autoScalingRoleArn = str;
        return this;
    }

    public AutoScalingSettingsUpdate withMaximumUnits(Long l) {
        this.maximumUnits = l;
        return this;
    }

    public AutoScalingSettingsUpdate withMinimumUnits(Long l) {
        this.minimumUnits = l;
        return this;
    }

    public AutoScalingSettingsUpdate withScalingPolicyUpdate(AutoScalingPolicyUpdate autoScalingPolicyUpdate) {
        this.scalingPolicyUpdate = autoScalingPolicyUpdate;
        return this;
    }
}
