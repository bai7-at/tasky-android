package com.google.android.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.chartbeat.androidsdk.QueryKeys;
import com.google.android.exoplayer2.t0;
import defpackage.a84;
import defpackage.ku4;
import defpackage.ur;
import defpackage.yc1;
import defpackage.z19;
import java.util.List;
import okhttp3.internal.http2.Http2;

/* loaded from: classes2.dex */
public final class k {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    private final boolean k;

    private static final class a {
        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
            List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty() || k.C()) {
                return 0;
            }
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d);
            for (int i3 = 0; i3 < supportedPerformancePoints.size(); i3++) {
                if (supportedPerformancePoints.get(i3).covers(performancePoint)) {
                    return 2;
                }
            }
            return 1;
        }
    }

    k(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = (String) ur.e(str);
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.k = ku4.s(str2);
    }

    private static boolean A(String str) {
        return z19.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean B(String str) {
        if (z19.a <= 22) {
            String str2 = z19.d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean C() {
        String str = z19.b;
        if (!str.equals("sabrina") && !str.equals("boreal")) {
            String str2 = z19.d;
            if (!str2.startsWith("Lenovo TB-X605") && !str2.startsWith("Lenovo TB-X606") && !str2.startsWith("Lenovo TB-X616")) {
                return false;
            }
        }
        return true;
    }

    private static boolean D(String str, int i) {
        if ("video/hevc".equals(str) && 2 == i) {
            String str2 = z19.b;
            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean E(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(z19.b)) ? false : true;
    }

    public static k F(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new k(str, str2, str3, codecCapabilities, z, z2, z3, (z4 || codecCapabilities == null || !i(codecCapabilities) || B(str)) ? false : true, codecCapabilities != null && u(codecCapabilities), z5 || (codecCapabilities != null && s(codecCapabilities)));
    }

    private static int b(String str, String str2, int i) {
        if (i > 1 || ((z19.a >= 26 && i > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i;
        }
        int i2 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        a84.j("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i2 + "]");
        return i2;
    }

    private static Point d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(z19.l(i, widthAlignment) * widthAlignment, z19.l(i2, heightAlignment) * heightAlignment);
    }

    private static boolean e(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point d2 = d(videoCapabilities, i, i2);
        int i3 = d2.x;
        int i4 = d2.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    private static MediaCodecInfo.CodecProfileLevel[] g(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int intValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
        int i = intValue >= 180000000 ? 1024 : intValue >= 120000000 ? 512 : intValue >= 60000000 ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : intValue >= 30000000 ? 128 : intValue >= 18000000 ? 64 : intValue >= 12000000 ? 32 : intValue >= 7200000 ? 16 : intValue >= 3600000 ? 8 : intValue >= 1800000 ? 4 : intValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    private static boolean i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return z19.a >= 19 && j(codecCapabilities);
    }

    private static boolean j(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private boolean m(t0 t0Var, boolean z) {
        Pair r = MediaCodecUtil.r(t0Var);
        if (r == null) {
            return true;
        }
        int intValue = ((Integer) r.first).intValue();
        int intValue2 = ((Integer) r.second).intValue();
        if ("video/dolby-vision".equals(t0Var.l)) {
            if (!"video/avc".equals(this.b)) {
                intValue = "video/hevc".equals(this.b) ? 2 : 8;
            }
            intValue2 = 0;
        }
        if (!this.k && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] h = h();
        if (z19.a <= 23 && "video/x-vnd.on2.vp9".equals(this.b) && h.length == 0) {
            h = g(this.d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : h) {
            if (codecProfileLevel.profile == intValue && ((codecProfileLevel.level >= intValue2 || !z) && !D(this.b, intValue))) {
                return true;
            }
        }
        y("codec.profileLevel, " + t0Var.i + ", " + this.c);
        return false;
    }

    private boolean q(t0 t0Var) {
        return this.b.equals(t0Var.l) || this.b.equals(MediaCodecUtil.m(t0Var));
    }

    private static boolean s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return z19.a >= 21 && t(codecCapabilities);
    }

    private static boolean t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean u(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return z19.a >= 21 && v(codecCapabilities);
    }

    private static boolean v(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void x(String str) {
        a84.b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.a + ", " + this.b + "] [" + z19.e + "]");
    }

    private void y(String str) {
        a84.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.a + ", " + this.b + "] [" + z19.e + "]");
    }

    private static boolean z(String str) {
        return "audio/opus".equals(str);
    }

    public Point c(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return d(videoCapabilities, i, i2);
    }

    public yc1 f(t0 t0Var, t0 t0Var2) {
        int i = !z19.c(t0Var.l, t0Var2.l) ? 8 : 0;
        if (this.k) {
            if (t0Var.x != t0Var2.x) {
                i |= 1024;
            }
            if (!this.e && (t0Var.t != t0Var2.t || t0Var.u != t0Var2.u)) {
                i |= 512;
            }
            if (!z19.c(t0Var.L, t0Var2.L)) {
                i |= ProgressEvent.PART_COMPLETED_EVENT_CODE;
            }
            if (A(this.a) && !t0Var.h(t0Var2)) {
                i |= 2;
            }
            if (i == 0) {
                return new yc1(this.a, t0Var, t0Var2, t0Var.h(t0Var2) ? 3 : 2, 0);
            }
        } else {
            if (t0Var.M != t0Var2.M) {
                i |= ProgressEvent.PART_FAILED_EVENT_CODE;
            }
            if (t0Var.N != t0Var2.N) {
                i |= 8192;
            }
            if (t0Var.Q != t0Var2.Q) {
                i |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.b)) {
                Pair r = MediaCodecUtil.r(t0Var);
                Pair r2 = MediaCodecUtil.r(t0Var2);
                if (r != null && r2 != null) {
                    int intValue = ((Integer) r.first).intValue();
                    int intValue2 = ((Integer) r2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new yc1(this.a, t0Var, t0Var2, 3, 0);
                    }
                }
            }
            if (!t0Var.h(t0Var2)) {
                i |= 32;
            }
            if (z(this.b)) {
                i |= 2;
            }
            if (i == 0) {
                return new yc1(this.a, t0Var, t0Var2, 1, 0);
            }
        }
        return new yc1(this.a, t0Var, t0Var2, 0, i);
    }

    public MediaCodecInfo.CodecProfileLevel[] h() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean k(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            y("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            y("channelCount.aCaps");
            return false;
        }
        if (b(this.a, this.b, audioCapabilities.getMaxInputChannelCount()) >= i) {
            return true;
        }
        y("channelCount.support, " + i);
        return false;
    }

    public boolean l(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            y("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            y("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        }
        y("sampleRate.support, " + i);
        return false;
    }

    public boolean n(t0 t0Var) {
        return q(t0Var) && m(t0Var, false);
    }

    public boolean o(t0 t0Var) {
        int i;
        if (!q(t0Var) || !m(t0Var, true)) {
            return false;
        }
        if (!this.k) {
            if (z19.a >= 21) {
                int i2 = t0Var.N;
                if (i2 != -1 && !l(i2)) {
                    return false;
                }
                int i3 = t0Var.M;
                if (i3 != -1 && !k(i3)) {
                    return false;
                }
            }
            return true;
        }
        int i4 = t0Var.t;
        if (i4 <= 0 || (i = t0Var.u) <= 0) {
            return true;
        }
        if (z19.a >= 21) {
            return w(i4, i, t0Var.w);
        }
        boolean z = i4 * i <= MediaCodecUtil.P();
        if (!z) {
            y("legacyFrameSize, " + t0Var.t + QueryKeys.SCROLL_POSITION_TOP + t0Var.u);
        }
        return z;
    }

    public boolean p() {
        if (z19.a >= 29 && "video/x-vnd.on2.vp9".equals(this.b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : h()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean r(t0 t0Var) {
        if (this.k) {
            return this.e;
        }
        Pair r = MediaCodecUtil.r(t0Var);
        return r != null && ((Integer) r.first).intValue() == 42;
    }

    public String toString() {
        return this.a;
    }

    public boolean w(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            y("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            y("sizeAndRate.vCaps");
            return false;
        }
        if (z19.a >= 29) {
            int a2 = a.a(videoCapabilities, i, i2, d);
            if (a2 == 2) {
                return true;
            }
            if (a2 == 1) {
                y("sizeAndRate.cover, " + i + QueryKeys.SCROLL_POSITION_TOP + i2 + "@" + d);
                return false;
            }
        }
        if (!e(videoCapabilities, i, i2, d)) {
            if (i >= i2 || !E(this.a) || !e(videoCapabilities, i2, i, d)) {
                y("sizeAndRate.support, " + i + QueryKeys.SCROLL_POSITION_TOP + i2 + "@" + d);
                return false;
            }
            x("sizeAndRate.rotated, " + i + QueryKeys.SCROLL_POSITION_TOP + i2 + "@" + d);
        }
        return true;
    }
}
