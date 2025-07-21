package com.nytimes.android.dailyfive.domain;

import defpackage.et3;
import defpackage.zq3;
import java.util.Map;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class Image {
    public static final a Companion = new a(null);
    public static final int c = 8;
    private final String a;
    private final Map b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public Image(String str, Map map) {
        zq3.h(str, "credit");
        zq3.h(map, "crops");
        this.a = str;
        this.b = map;
    }

    public final String a() {
        return this.a;
    }

    public final Map b() {
        return this.b;
    }

    public final ImageCrop c() {
        ImageCrop imageCrop = (ImageCrop) this.b.get("largeHorizontalJumbo");
        if (imageCrop != null) {
            return imageCrop;
        }
        ImageCrop imageCrop2 = (ImageCrop) this.b.get("mediumThreeByTwo378");
        if (imageCrop2 != null) {
            return imageCrop2;
        }
        ImageCrop imageCrop3 = (ImageCrop) this.b.get("threeByTwoSmallAt2X");
        if (imageCrop3 != null) {
            return imageCrop3;
        }
        ImageCrop imageCrop4 = (ImageCrop) this.b.get("square320");
        return imageCrop4 == null ? (ImageCrop) i.j0(this.b.values()) : imageCrop4;
    }

    public final ImageCrop d() {
        ImageCrop imageCrop = (ImageCrop) this.b.get("square320");
        return imageCrop == null ? (ImageCrop) i.j0(this.b.values()) : imageCrop;
    }

    public final ImageCrop e() {
        ImageCrop imageCrop = (ImageCrop) this.b.get("mediumThreeByTwo378");
        if (imageCrop != null) {
            return imageCrop;
        }
        ImageCrop imageCrop2 = (ImageCrop) this.b.get("largeHorizontalJumbo");
        if (imageCrop2 != null) {
            return imageCrop2;
        }
        ImageCrop imageCrop3 = (ImageCrop) this.b.get("threeByTwoSmallAt2X");
        return imageCrop3 == null ? (ImageCrop) i.j0(this.b.values()) : imageCrop3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Image)) {
            return false;
        }
        Image image = (Image) obj;
        return zq3.c(this.a, image.a) && zq3.c(this.b, image.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "Image(credit=" + this.a + ", crops=" + this.b + ")";
    }
}
