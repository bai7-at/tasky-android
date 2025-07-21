package com.nytimes.android.api.cms;

import defpackage.zq3;

/* loaded from: classes3.dex */
public final class FeedPresentationConfigVersion {
    private final String v1;

    public FeedPresentationConfigVersion(String str) {
        zq3.h(str, "v1");
        this.v1 = str;
    }

    public static /* synthetic */ FeedPresentationConfigVersion copy$default(FeedPresentationConfigVersion feedPresentationConfigVersion, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedPresentationConfigVersion.v1;
        }
        return feedPresentationConfigVersion.copy(str);
    }

    public final String component1() {
        return this.v1;
    }

    public final FeedPresentationConfigVersion copy(String str) {
        zq3.h(str, "v1");
        return new FeedPresentationConfigVersion(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeedPresentationConfigVersion) && zq3.c(this.v1, ((FeedPresentationConfigVersion) obj).v1);
    }

    public final String getV1() {
        return this.v1;
    }

    public int hashCode() {
        return this.v1.hashCode();
    }

    public String toString() {
        return "FeedPresentationConfigVersion(v1=" + this.v1 + ")";
    }
}
