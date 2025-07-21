package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class AutoScalingTargetTrackingScalingPolicyConfigurationUpdate implements Serializable {
    private Boolean disableScaleIn;
    private Integer scaleInCooldown;
    private Integer scaleOutCooldown;
    private Double targetValue;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AutoScalingTargetTrackingScalingPolicyConfigurationUpdate)) {
            return false;
        }
        AutoScalingTargetTrackingScalingPolicyConfigurationUpdate autoScalingTargetTrackingScalingPolicyConfigurationUpdate = (AutoScalingTargetTrackingScalingPolicyConfigurationUpdate) obj;
        if ((autoScalingTargetTrackingScalingPolicyConfigurationUpdate.getDisableScaleIn() == null) ^ (getDisableScaleIn() == null)) {
            return false;
        }
        if (autoScalingTargetTrackingScalingPolicyConfigurationUpdate.getDisableScaleIn() != null && !autoScalingTargetTrackingScalingPolicyConfigurationUpdate.getDisableScaleIn().equals(getDisableScaleIn())) {
            return false;
        }
        if ((autoScalingTargetTrackingScalingPolicyConfigurationUpdate.getScaleInCooldown() == null) ^ (getScaleInCooldown() == null)) {
            return false;
        }
        if (autoScalingTargetTrackingScalingPolicyConfigurationUpdate.getScaleInCooldown() != null && !autoScalingTargetTrackingScalingPolicyConfigurationUpdate.getScaleInCooldown().equals(getScaleInCooldown())) {
            return false;
        }
        if ((autoScalingTargetTrackingScalingPolicyConfigurationUpdate.getScaleOutCooldown() == null) ^ (getScaleOutCooldown() == null)) {
            return false;
        }
        if (autoScalingTargetTrackingScalingPolicyConfigurationUpdate.getScaleOutCooldown() != null && !autoScalingTargetTrackingScalingPolicyConfigurationUpdate.getScaleOutCooldown().equals(getScaleOutCooldown())) {
            return false;
        }
        if ((autoScalingTargetTrackingScalingPolicyConfigurationUpdate.getTargetValue() == null) ^ (getTargetValue() == null)) {
            return false;
        }
        return autoScalingTargetTrackingScalingPolicyConfigurationUpdate.getTargetValue() == null || autoScalingTargetTrackingScalingPolicyConfigurationUpdate.getTargetValue().equals(getTargetValue());
    }

    public Boolean getDisableScaleIn() {
        return this.disableScaleIn;
    }

    public Integer getScaleInCooldown() {
        return this.scaleInCooldown;
    }

    public Integer getScaleOutCooldown() {
        return this.scaleOutCooldown;
    }

    public Double getTargetValue() {
        return this.targetValue;
    }

    public int hashCode() {
        return (((((((getDisableScaleIn() == null ? 0 : getDisableScaleIn().hashCode()) + 31) * 31) + (getScaleInCooldown() == null ? 0 : getScaleInCooldown().hashCode())) * 31) + (getScaleOutCooldown() == null ? 0 : getScaleOutCooldown().hashCode())) * 31) + (getTargetValue() != null ? getTargetValue().hashCode() : 0);
    }

    public Boolean isDisableScaleIn() {
        return this.disableScaleIn;
    }

    public void setDisableScaleIn(Boolean bool) {
        this.disableScaleIn = bool;
    }

    public void setScaleInCooldown(Integer num) {
        this.scaleInCooldown = num;
    }

    public void setScaleOutCooldown(Integer num) {
        this.scaleOutCooldown = num;
    }

    public void setTargetValue(Double d) {
        this.targetValue = d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDisableScaleIn() != null) {
            sb.append("DisableScaleIn: " + getDisableScaleIn() + ",");
        }
        if (getScaleInCooldown() != null) {
            sb.append("ScaleInCooldown: " + getScaleInCooldown() + ",");
        }
        if (getScaleOutCooldown() != null) {
            sb.append("ScaleOutCooldown: " + getScaleOutCooldown() + ",");
        }
        if (getTargetValue() != null) {
            sb.append("TargetValue: " + getTargetValue());
        }
        sb.append("}");
        return sb.toString();
    }

    public AutoScalingTargetTrackingScalingPolicyConfigurationUpdate withDisableScaleIn(Boolean bool) {
        this.disableScaleIn = bool;
        return this;
    }

    public AutoScalingTargetTrackingScalingPolicyConfigurationUpdate withScaleInCooldown(Integer num) {
        this.scaleInCooldown = num;
        return this;
    }

    public AutoScalingTargetTrackingScalingPolicyConfigurationUpdate withScaleOutCooldown(Integer num) {
        this.scaleOutCooldown = num;
        return this;
    }

    public AutoScalingTargetTrackingScalingPolicyConfigurationUpdate withTargetValue(Double d) {
        this.targetValue = d;
        return this;
    }
}
