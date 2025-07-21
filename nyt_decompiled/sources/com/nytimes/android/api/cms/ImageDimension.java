package com.nytimes.android.api.cms;

import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class ImageDimension {
    public static final Companion Companion = new Companion(null);
    private static final String DEFAULT_STRING = "";
    private final int height;
    private final String url;
    private final int width;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ImageDimension(int i, int i2, String str) {
        this.width = i;
        this.height = i2;
        this.url = str;
    }

    public static /* synthetic */ ImageDimension copy$default(ImageDimension imageDimension, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = imageDimension.width;
        }
        if ((i3 & 2) != 0) {
            i2 = imageDimension.height;
        }
        if ((i3 & 4) != 0) {
            str = imageDimension.url;
        }
        return imageDimension.copy(i, i2, str);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final String component3() {
        return this.url;
    }

    public final ImageDimension copy(int i, int i2, String str) {
        return new ImageDimension(i, i2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageDimension)) {
            return false;
        }
        ImageDimension imageDimension = (ImageDimension) obj;
        return this.width == imageDimension.width && this.height == imageDimension.height && zq3.c(this.url, imageDimension.url);
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getNonNullableUrl() {
        String str = this.url;
        return (str == null || str.length() == 0) ? "" : this.url;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height)) * 31;
        String str = this.url;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean isLandscape() {
        return this.width > this.height;
    }

    public final boolean isPortrait() {
        return this.height > this.width;
    }

    public String toString() {
        return "ImageDimension(width=" + this.width + ", height=" + this.height + ", url=" + this.url + ")";
    }
}
