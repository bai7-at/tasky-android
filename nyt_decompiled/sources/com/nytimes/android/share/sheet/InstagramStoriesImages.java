package com.nytimes.android.share.sheet;

import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class InstagramStoriesImages {
    private final String a;
    private final String b;

    public InstagramStoriesImages(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstagramStoriesImages)) {
            return false;
        }
        InstagramStoriesImages instagramStoriesImages = (InstagramStoriesImages) obj;
        return zq3.c(this.a, instagramStoriesImages.a) && zq3.c(this.b, instagramStoriesImages.b);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "InstagramStoriesImages(backgroundImageData=" + this.a + ", stickerImageData=" + this.b + ")";
    }
}
