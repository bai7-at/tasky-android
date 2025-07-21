package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;

/* loaded from: classes.dex */
public class RoleMapping implements Serializable {
    private String ambiguousRoleResolution;
    private RulesConfigurationType rulesConfiguration;

    /* renamed from: type, reason: collision with root package name */
    private String f37type;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RoleMapping)) {
            return false;
        }
        RoleMapping roleMapping = (RoleMapping) obj;
        if ((roleMapping.getType() == null) ^ (getType() == null)) {
            return false;
        }
        if (roleMapping.getType() != null && !roleMapping.getType().equals(getType())) {
            return false;
        }
        if ((roleMapping.getAmbiguousRoleResolution() == null) ^ (getAmbiguousRoleResolution() == null)) {
            return false;
        }
        if (roleMapping.getAmbiguousRoleResolution() != null && !roleMapping.getAmbiguousRoleResolution().equals(getAmbiguousRoleResolution())) {
            return false;
        }
        if ((roleMapping.getRulesConfiguration() == null) ^ (getRulesConfiguration() == null)) {
            return false;
        }
        return roleMapping.getRulesConfiguration() == null || roleMapping.getRulesConfiguration().equals(getRulesConfiguration());
    }

    public String getAmbiguousRoleResolution() {
        return this.ambiguousRoleResolution;
    }

    public RulesConfigurationType getRulesConfiguration() {
        return this.rulesConfiguration;
    }

    public String getType() {
        return this.f37type;
    }

    public int hashCode() {
        return (((((getType() == null ? 0 : getType().hashCode()) + 31) * 31) + (getAmbiguousRoleResolution() == null ? 0 : getAmbiguousRoleResolution().hashCode())) * 31) + (getRulesConfiguration() != null ? getRulesConfiguration().hashCode() : 0);
    }

    public void setAmbiguousRoleResolution(String str) {
        this.ambiguousRoleResolution = str;
    }

    public void setRulesConfiguration(RulesConfigurationType rulesConfigurationType) {
        this.rulesConfiguration = rulesConfigurationType;
    }

    public void setType(String str) {
        this.f37type = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getType() != null) {
            sb.append("Type: " + getType() + ",");
        }
        if (getAmbiguousRoleResolution() != null) {
            sb.append("AmbiguousRoleResolution: " + getAmbiguousRoleResolution() + ",");
        }
        if (getRulesConfiguration() != null) {
            sb.append("RulesConfiguration: " + getRulesConfiguration());
        }
        sb.append("}");
        return sb.toString();
    }

    public RoleMapping withAmbiguousRoleResolution(String str) {
        this.ambiguousRoleResolution = str;
        return this;
    }

    public RoleMapping withRulesConfiguration(RulesConfigurationType rulesConfigurationType) {
        this.rulesConfiguration = rulesConfigurationType;
        return this;
    }

    public RoleMapping withType(String str) {
        this.f37type = str;
        return this;
    }

    public void setAmbiguousRoleResolution(AmbiguousRoleResolutionType ambiguousRoleResolutionType) {
        this.ambiguousRoleResolution = ambiguousRoleResolutionType.toString();
    }

    public void setType(RoleMappingType roleMappingType) {
        this.f37type = roleMappingType.toString();
    }

    public RoleMapping withAmbiguousRoleResolution(AmbiguousRoleResolutionType ambiguousRoleResolutionType) {
        this.ambiguousRoleResolution = ambiguousRoleResolutionType.toString();
        return this;
    }

    public RoleMapping withType(RoleMappingType roleMappingType) {
        this.f37type = roleMappingType.toString();
        return this;
    }
}
