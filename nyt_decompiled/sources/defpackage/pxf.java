package defpackage;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.chartbeat.androidsdk.QueryKeys;
import com.google.android.gms.internal.ads.qp;
import okhttp3.internal.http2.Http2;

/* loaded from: classes3.dex */
public final class pxf {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    private final boolean h;

    pxf(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z4;
        this.f = z6;
        this.h = qcb.h(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if ("Nexus 10".equals(r3) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r12) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r15.isFeatureSupported("secure-playback") != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.pxf c(java.lang.String r12, java.lang.String r13, java.lang.String r14, android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r1 = r12
            r4 = r15
            pxf r11 = new pxf
            r0 = 1
            r2 = 0
            if (r4 == 0) goto L3d
            int r3 = defpackage.khe.a
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L3d
            int r3 = defpackage.khe.a
            r5 = 22
            if (r3 > r5) goto L2b
            java.lang.String r3 = defpackage.khe.d
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L2d
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L2b
            goto L2d
        L2b:
            r8 = r0
            goto L3e
        L2d:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L3d
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L2b
        L3d:
            r8 = r2
        L3e:
            if (r4 == 0) goto L4c
            int r3 = defpackage.khe.a
            java.lang.String r3 = "tunneled-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L4c
            r9 = r0
            goto L4d
        L4c:
            r9 = r2
        L4d:
            if (r20 != 0) goto L5b
            if (r4 == 0) goto L5d
            int r3 = defpackage.khe.a
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L5d
        L5b:
            r10 = r0
            goto L5e
        L5d:
            r10 = r2
        L5e:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pxf.c(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):pxf");
    }

    private static Point i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = khe.a;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    private final void j(String str) {
        ezd.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.a + ", " + this.b + "] [" + khe.e + "]");
    }

    private static boolean k(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point i3 = i(videoCapabilities, i, i2);
        int i4 = i3.x;
        int i5 = i3.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i4, i5) : videoCapabilities.areSizeAndRateSupported(i4, i5, Math.floor(d));
    }

    private final boolean l(l6a l6aVar, boolean z) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair a = qp.a(l6aVar);
        if (a != null) {
            int intValue = ((Integer) a.first).intValue();
            int intValue2 = ((Integer) a.second).intValue();
            int i = 8;
            if ("video/dolby-vision".equals(l6aVar.l)) {
                if ("video/avc".equals(this.b)) {
                    intValue = 8;
                } else if ("video/hevc".equals(this.b)) {
                    intValue = 2;
                }
                intValue2 = 0;
            }
            if (!this.h) {
                if (intValue == 42) {
                    intValue = 42;
                }
            }
            MediaCodecInfo.CodecProfileLevel[] h = h();
            if (khe.a <= 23 && "video/x-vnd.on2.vp9".equals(this.b) && h.length == 0) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                if (intValue3 >= 180000000) {
                    i = 1024;
                } else if (intValue3 >= 120000000) {
                    i = 512;
                } else if (intValue3 >= 60000000) {
                    i = JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
                } else if (intValue3 >= 30000000) {
                    i = 128;
                } else if (intValue3 >= 18000000) {
                    i = 64;
                } else if (intValue3 >= 12000000) {
                    i = 32;
                } else if (intValue3 >= 7200000) {
                    i = 16;
                } else if (intValue3 < 3600000) {
                    i = intValue3 >= 1800000 ? 4 : intValue3 >= 800000 ? 2 : 1;
                }
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                codecProfileLevel.profile = 1;
                codecProfileLevel.level = i;
                h = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : h) {
                if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z)) {
                    if ("video/hevc".equals(this.b) && intValue == 2) {
                        String str = khe.b;
                        if (!"sailfish".equals(str) && !"marlin".equals(str)) {
                        }
                    }
                }
            }
            j("codec.profileLevel, " + l6aVar.i + ", " + this.c);
            return false;
        }
        return true;
    }

    private final boolean m(l6a l6aVar) {
        return this.b.equals(l6aVar.l) || this.b.equals(qp.c(l6aVar));
    }

    public final Point a(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return i(videoCapabilities, i, i2);
    }

    public final g8f b(l6a l6aVar, l6a l6aVar2) {
        int i = true != khe.f(l6aVar.l, l6aVar2.l) ? 8 : 0;
        if (this.h) {
            if (l6aVar.t != l6aVar2.t) {
                i |= 1024;
            }
            if (!this.e && (l6aVar.q != l6aVar2.q || l6aVar.r != l6aVar2.r)) {
                i |= 512;
            }
            if (!khe.f(l6aVar.x, l6aVar2.x)) {
                i |= ProgressEvent.PART_COMPLETED_EVENT_CODE;
            }
            String str = this.a;
            if (khe.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !l6aVar.d(l6aVar2)) {
                i |= 2;
            }
            if (i == 0) {
                return new g8f(this.a, l6aVar, l6aVar2, true != l6aVar.d(l6aVar2) ? 2 : 3, 0);
            }
        } else {
            if (l6aVar.y != l6aVar2.y) {
                i |= ProgressEvent.PART_FAILED_EVENT_CODE;
            }
            if (l6aVar.z != l6aVar2.z) {
                i |= 8192;
            }
            if (l6aVar.A != l6aVar2.A) {
                i |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.b)) {
                Pair a = qp.a(l6aVar);
                Pair a2 = qp.a(l6aVar2);
                if (a != null && a2 != null) {
                    int intValue = ((Integer) a.first).intValue();
                    int intValue2 = ((Integer) a2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new g8f(this.a, l6aVar, l6aVar2, 3, 0);
                    }
                }
            }
            if (!l6aVar.d(l6aVar2)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.b)) {
                i |= 2;
            }
            if (i == 0) {
                return new g8f(this.a, l6aVar, l6aVar2, 1, 0);
            }
        }
        return new g8f(this.a, l6aVar, l6aVar2, 0, i);
    }

    public final boolean d(l6a l6aVar) {
        return m(l6aVar) && l(l6aVar, false);
    }

    public final boolean e(l6a l6aVar) {
        int i;
        if (!m(l6aVar) || !l(l6aVar, true)) {
            return false;
        }
        if (this.h) {
            int i2 = l6aVar.q;
            if (i2 <= 0 || (i = l6aVar.r) <= 0) {
                return true;
            }
            int i3 = khe.a;
            return g(i2, i, l6aVar.s);
        }
        int i4 = khe.a;
        int i5 = l6aVar.z;
        if (i5 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (codecCapabilities == null) {
                j("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                j("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i5)) {
                j("sampleRate.support, " + i5);
                return false;
            }
        }
        int i6 = l6aVar.y;
        if (i6 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.d;
            if (codecCapabilities2 == null) {
                j("channelCount.caps");
            } else {
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    j("channelCount.aCaps");
                } else {
                    String str = this.a;
                    String str2 = this.b;
                    int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                    if (maxInputChannelCount <= 1 && ((khe.a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                        int i7 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                        ezd.f("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i7 + "]");
                        maxInputChannelCount = i7;
                    }
                    if (maxInputChannelCount < i6) {
                        j("channelCount.support, " + i6);
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f(l6a l6aVar) {
        if (this.h) {
            return this.e;
        }
        Pair a = qp.a(l6aVar);
        return a != null && ((Integer) a.first).intValue() == 42;
    }

    public final boolean g(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            j("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            j("sizeAndRate.vCaps");
            return false;
        }
        if (khe.a >= 29) {
            int a = oxf.a(videoCapabilities, this.b, i, i2, d);
            if (a != 2) {
                if (a == 1) {
                    j("sizeAndRate.cover, " + i + QueryKeys.SCROLL_POSITION_TOP + i2 + "@" + d);
                    return false;
                }
            }
            return true;
        }
        if (!k(videoCapabilities, i, i2, d)) {
            if (i >= i2 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.a) && "mcv5a".equals(khe.b)) || !k(videoCapabilities, i2, i, d))) {
                j("sizeAndRate.support, " + i + QueryKeys.SCROLL_POSITION_TOP + i2 + "@" + d);
                return false;
            }
            ezd.b("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i + QueryKeys.SCROLL_POSITION_TOP + i2 + "@" + d) + "] [" + this.a + ", " + this.b + "] [" + khe.e + "]");
        }
        return true;
    }

    public final MediaCodecInfo.CodecProfileLevel[] h() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final String toString() {
        return this.a;
    }
}
