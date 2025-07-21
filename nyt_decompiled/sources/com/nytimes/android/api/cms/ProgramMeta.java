package com.nytimes.android.api.cms;

import defpackage.zq3;

/* loaded from: classes3.dex */
public final class ProgramMeta {
    private final boolean defaultProgram;
    private final FeedPresentationConfigVersion feedPresentationConfig;
    private final String oneWebViewGraphQLId;
    private final String programId;
    private final int rank;
    private final String title;

    public ProgramMeta(String str, String str2, FeedPresentationConfigVersion feedPresentationConfigVersion, boolean z, int i, String str3) {
        zq3.h(str, "programId");
        zq3.h(str2, "title");
        zq3.h(feedPresentationConfigVersion, "feedPresentationConfig");
        zq3.h(str3, "oneWebViewGraphQLId");
        this.programId = str;
        this.title = str2;
        this.feedPresentationConfig = feedPresentationConfigVersion;
        this.defaultProgram = z;
        this.rank = i;
        this.oneWebViewGraphQLId = str3;
    }

    private final FeedPresentationConfigVersion component3() {
        return this.feedPresentationConfig;
    }

    public static /* synthetic */ ProgramMeta copy$default(ProgramMeta programMeta, String str, String str2, FeedPresentationConfigVersion feedPresentationConfigVersion, boolean z, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = programMeta.programId;
        }
        if ((i2 & 2) != 0) {
            str2 = programMeta.title;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            feedPresentationConfigVersion = programMeta.feedPresentationConfig;
        }
        FeedPresentationConfigVersion feedPresentationConfigVersion2 = feedPresentationConfigVersion;
        if ((i2 & 8) != 0) {
            z = programMeta.defaultProgram;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            i = programMeta.rank;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            str3 = programMeta.oneWebViewGraphQLId;
        }
        return programMeta.copy(str, str4, feedPresentationConfigVersion2, z2, i3, str3);
    }

    public final String component1() {
        return this.programId;
    }

    public final String component2() {
        return this.title;
    }

    public final boolean component4() {
        return this.defaultProgram;
    }

    public final int component5() {
        return this.rank;
    }

    public final String component6() {
        return this.oneWebViewGraphQLId;
    }

    public final ProgramMeta copy(String str, String str2, FeedPresentationConfigVersion feedPresentationConfigVersion, boolean z, int i, String str3) {
        zq3.h(str, "programId");
        zq3.h(str2, "title");
        zq3.h(feedPresentationConfigVersion, "feedPresentationConfig");
        zq3.h(str3, "oneWebViewGraphQLId");
        return new ProgramMeta(str, str2, feedPresentationConfigVersion, z, i, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgramMeta)) {
            return false;
        }
        ProgramMeta programMeta = (ProgramMeta) obj;
        return zq3.c(this.programId, programMeta.programId) && zq3.c(this.title, programMeta.title) && zq3.c(this.feedPresentationConfig, programMeta.feedPresentationConfig) && this.defaultProgram == programMeta.defaultProgram && this.rank == programMeta.rank && zq3.c(this.oneWebViewGraphQLId, programMeta.oneWebViewGraphQLId);
    }

    public final boolean getDefaultProgram() {
        return this.defaultProgram;
    }

    public final String getFeedVersion() {
        return this.feedPresentationConfig.getV1();
    }

    public final String getOneWebViewGraphQLId() {
        return this.oneWebViewGraphQLId;
    }

    public final String getProgramId() {
        return this.programId;
    }

    public final int getRank() {
        return this.rank;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((this.programId.hashCode() * 31) + this.title.hashCode()) * 31) + this.feedPresentationConfig.hashCode()) * 31) + Boolean.hashCode(this.defaultProgram)) * 31) + Integer.hashCode(this.rank)) * 31) + this.oneWebViewGraphQLId.hashCode();
    }

    public final SectionConfigEntry toSectionConfigEntry() {
        Integer valueOf = Integer.valueOf(this.rank);
        boolean z = this.defaultProgram;
        return new SectionConfigEntry(valueOf, z, z, null);
    }

    public String toString() {
        return "ProgramMeta(programId=" + this.programId + ", title=" + this.title + ", feedPresentationConfig=" + this.feedPresentationConfig + ", defaultProgram=" + this.defaultProgram + ", rank=" + this.rank + ", oneWebViewGraphQLId=" + this.oneWebViewGraphQLId + ")";
    }
}
