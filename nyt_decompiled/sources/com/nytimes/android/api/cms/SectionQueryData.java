package com.nytimes.android.api.cms;

import defpackage.zq3;

/* loaded from: classes3.dex */
public final class SectionQueryData {
    private final String queryParam;
    private final SectionQueryType queryType;

    public SectionQueryData(SectionQueryType sectionQueryType, String str) {
        zq3.h(sectionQueryType, "queryType");
        this.queryType = sectionQueryType;
        this.queryParam = str;
    }

    public static /* synthetic */ SectionQueryData copy$default(SectionQueryData sectionQueryData, SectionQueryType sectionQueryType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            sectionQueryType = sectionQueryData.queryType;
        }
        if ((i & 2) != 0) {
            str = sectionQueryData.queryParam;
        }
        return sectionQueryData.copy(sectionQueryType, str);
    }

    public final SectionQueryType component1() {
        return this.queryType;
    }

    public final String component2() {
        return this.queryParam;
    }

    public final SectionQueryData copy(SectionQueryType sectionQueryType, String str) {
        zq3.h(sectionQueryType, "queryType");
        return new SectionQueryData(sectionQueryType, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionQueryData)) {
            return false;
        }
        SectionQueryData sectionQueryData = (SectionQueryData) obj;
        return this.queryType == sectionQueryData.queryType && zq3.c(this.queryParam, sectionQueryData.queryParam);
    }

    public final String getQueryParam() {
        return this.queryParam;
    }

    public final SectionQueryType getQueryType() {
        return this.queryType;
    }

    public int hashCode() {
        int hashCode = this.queryType.hashCode() * 31;
        String str = this.queryParam;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SectionQueryData(queryType=" + this.queryType + ", queryParam=" + this.queryParam + ")";
    }
}
