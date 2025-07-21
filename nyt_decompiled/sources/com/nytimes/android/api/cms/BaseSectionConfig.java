package com.nytimes.android.api.cms;

import defpackage.zq3;

/* loaded from: classes3.dex */
public final class BaseSectionConfig {
    private final String sectionIconBaseUrl;

    public BaseSectionConfig(String str) {
        this.sectionIconBaseUrl = str;
    }

    public static /* synthetic */ BaseSectionConfig copy$default(BaseSectionConfig baseSectionConfig, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = baseSectionConfig.sectionIconBaseUrl;
        }
        return baseSectionConfig.copy(str);
    }

    public final String component1() {
        return this.sectionIconBaseUrl;
    }

    public final BaseSectionConfig copy(String str) {
        return new BaseSectionConfig(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaseSectionConfig) && zq3.c(this.sectionIconBaseUrl, ((BaseSectionConfig) obj).sectionIconBaseUrl);
    }

    public final String getSectionIconBaseUrl() {
        return this.sectionIconBaseUrl;
    }

    public int hashCode() {
        String str = this.sectionIconBaseUrl;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "BaseSectionConfig(sectionIconBaseUrl=" + this.sectionIconBaseUrl + ")";
    }
}
