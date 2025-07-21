package com.nytimes.android.api.config.model;

import defpackage.zq3;

/* loaded from: classes3.dex */
public final class AnalyticsValues {
    private final String label;
    private final String moduleName;

    public AnalyticsValues(String str, String str2) {
        zq3.h(str, "moduleName");
        zq3.h(str2, "label");
        this.moduleName = str;
        this.label = str2;
    }

    public static /* synthetic */ AnalyticsValues copy$default(AnalyticsValues analyticsValues, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = analyticsValues.moduleName;
        }
        if ((i & 2) != 0) {
            str2 = analyticsValues.label;
        }
        return analyticsValues.copy(str, str2);
    }

    public final String component1() {
        return this.moduleName;
    }

    public final String component2() {
        return this.label;
    }

    public final AnalyticsValues copy(String str, String str2) {
        zq3.h(str, "moduleName");
        zq3.h(str2, "label");
        return new AnalyticsValues(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalyticsValues)) {
            return false;
        }
        AnalyticsValues analyticsValues = (AnalyticsValues) obj;
        return zq3.c(this.moduleName, analyticsValues.moduleName) && zq3.c(this.label, analyticsValues.label);
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getModuleName() {
        return this.moduleName;
    }

    public int hashCode() {
        return (this.moduleName.hashCode() * 31) + this.label.hashCode();
    }

    public String toString() {
        return "AnalyticsValues(moduleName=" + this.moduleName + ", label=" + this.label + ")";
    }
}
