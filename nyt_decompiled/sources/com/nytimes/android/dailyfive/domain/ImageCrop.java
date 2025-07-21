package com.nytimes.android.dailyfive.domain;

import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class ImageCrop {
    private final int a;
    private final int b;
    private final String c;

    public ImageCrop(int i, int i2, String str) {
        zq3.h(str, "url");
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final int a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageCrop)) {
            return false;
        }
        ImageCrop imageCrop = (ImageCrop) obj;
        return this.a == imageCrop.a && this.b == imageCrop.b && zq3.c(this.c, imageCrop.c);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b)) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "ImageCrop(width=" + this.a + ", height=" + this.b + ", url=" + this.c + ")";
    }
}
