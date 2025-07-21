package com.nytimes.android.share.sheet;

import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class ShareInstagramStoriesAssets {
    private final HexCodes a;
    private final InstagramStoriesImages b;

    public ShareInstagramStoriesAssets(HexCodes hexCodes, InstagramStoriesImages instagramStoriesImages) {
        zq3.h(hexCodes, "hexCodes");
        zq3.h(instagramStoriesImages, "assets");
        this.a = hexCodes;
        this.b = instagramStoriesImages;
    }

    public final InstagramStoriesImages a() {
        return this.b;
    }

    public final HexCodes b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareInstagramStoriesAssets)) {
            return false;
        }
        ShareInstagramStoriesAssets shareInstagramStoriesAssets = (ShareInstagramStoriesAssets) obj;
        return zq3.c(this.a, shareInstagramStoriesAssets.a) && zq3.c(this.b, shareInstagramStoriesAssets.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "ShareInstagramStoriesAssets(hexCodes=" + this.a + ", assets=" + this.b + ")";
    }
}
