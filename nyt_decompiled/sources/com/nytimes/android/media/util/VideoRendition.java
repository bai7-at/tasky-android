package com.nytimes.android.media.util;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class VideoRendition {
    private final String aspectRatio;
    private final String encoding;
    private final int height;

    /* renamed from: type, reason: collision with root package name */
    private final String f64type;
    private final String videoUrl;
    private final int width;

    public VideoRendition(String str, String str2, int i, int i2, String str3, String str4) {
        zq3.h(str, "videoUrl");
        zq3.h(str3, TransferTable.COLUMN_TYPE);
        this.videoUrl = str;
        this.encoding = str2;
        this.width = i;
        this.height = i2;
        this.f64type = str3;
        this.aspectRatio = str4;
    }

    public static /* synthetic */ VideoRendition copy$default(VideoRendition videoRendition, String str, String str2, int i, int i2, String str3, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = videoRendition.videoUrl;
        }
        if ((i3 & 2) != 0) {
            str2 = videoRendition.encoding;
        }
        String str5 = str2;
        if ((i3 & 4) != 0) {
            i = videoRendition.width;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = videoRendition.height;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            str3 = videoRendition.f64type;
        }
        String str6 = str3;
        if ((i3 & 32) != 0) {
            str4 = videoRendition.aspectRatio;
        }
        return videoRendition.copy(str, str5, i4, i5, str6, str4);
    }

    public final String component1() {
        return this.videoUrl;
    }

    public final String component2() {
        return this.encoding;
    }

    public final int component3() {
        return this.width;
    }

    public final int component4() {
        return this.height;
    }

    public final String component5() {
        return this.f64type;
    }

    public final String component6() {
        return this.aspectRatio;
    }

    public final VideoRendition copy(String str, String str2, int i, int i2, String str3, String str4) {
        zq3.h(str, "videoUrl");
        zq3.h(str3, TransferTable.COLUMN_TYPE);
        return new VideoRendition(str, str2, i, i2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoRendition)) {
            return false;
        }
        VideoRendition videoRendition = (VideoRendition) obj;
        return zq3.c(this.videoUrl, videoRendition.videoUrl) && zq3.c(this.encoding, videoRendition.encoding) && this.width == videoRendition.width && this.height == videoRendition.height && zq3.c(this.f64type, videoRendition.f64type) && zq3.c(this.aspectRatio, videoRendition.aspectRatio);
    }

    public final String getAspectRatio() {
        return this.aspectRatio;
    }

    public final String getEncoding() {
        return this.encoding;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getType() {
        return this.f64type;
    }

    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int hashCode = this.videoUrl.hashCode() * 31;
        String str = this.encoding;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + this.f64type.hashCode()) * 31;
        String str2 = this.aspectRatio;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "VideoRendition(videoUrl=" + this.videoUrl + ", encoding=" + this.encoding + ", width=" + this.width + ", height=" + this.height + ", type=" + this.f64type + ", aspectRatio=" + this.aspectRatio + ")";
    }
}
