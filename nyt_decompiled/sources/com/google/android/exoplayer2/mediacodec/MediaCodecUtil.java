package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.t0;
import com.google.common.collect.ImmutableList;
import defpackage.a84;
import defpackage.ku4;
import defpackage.sn0;
import defpackage.tr;
import defpackage.z19;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import okhttp3.internal.http2.Http2;

/* loaded from: classes2.dex */
public abstract class MediaCodecUtil {
    private static final Pattern a = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap b = new HashMap();
    private static int c = -1;

    public static class DecoderQueryException extends Exception {
        private DecoderQueryException(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    private static final class b {
        public final String a;
        public final boolean b;
        public final boolean c;

        public b(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            return TextUtils.equals(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c;
        }

        public int hashCode() {
            return ((((this.a.hashCode() + 31) * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
        }
    }

    private interface c {
        MediaCodecInfo a(int i);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    private static final class d implements c {
        private d() {
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public MediaCodecInfo a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public int d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean e() {
            return false;
        }
    }

    private static final class e implements c {
        private final int a;
        private MediaCodecInfo[] b;

        public e(boolean z, boolean z2) {
            this.a = (z || z2) ? 1 : 0;
        }

        private void f() {
            if (this.b == null) {
                this.b = new MediaCodecList(this.a).getCodecInfos();
            }
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public MediaCodecInfo a(int i) {
            f();
            return this.b[i];
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public int d() {
            f();
            return this.b.length;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean e() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface f {
        int a(Object obj);
    }

    private static Pair A(String str, String[] strArr) {
        if (strArr.length < 3) {
            a84.j("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int T = T(parseInt);
            if (T == -1) {
                a84.j("MediaCodecUtil", "Unknown VP9 profile: " + parseInt);
                return null;
            }
            int S = S(parseInt2);
            if (S != -1) {
                return new Pair(Integer.valueOf(T), Integer.valueOf(S));
            }
            a84.j("MediaCodecUtil", "Unknown VP9 level: " + parseInt2);
            return null;
        } catch (NumberFormatException unused) {
            a84.j("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    private static Integer B(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    private static boolean C(MediaCodecInfo mediaCodecInfo) {
        return z19.a >= 29 && D(mediaCodecInfo);
    }

    private static boolean D(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean E(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = z19.a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = z19.b;
            if ("a70".equals(str3) || ("Xiaomi".equals(z19.c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = z19.b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = z19.b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(z19.c))) {
            String str6 = z19.b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(z19.c)) {
            String str7 = z19.b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i <= 19 && z19.b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    private static boolean F(MediaCodecInfo mediaCodecInfo, String str) {
        return z19.a >= 29 ? G(mediaCodecInfo) : !H(mediaCodecInfo, str);
    }

    private static boolean G(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean H(MediaCodecInfo mediaCodecInfo, String str) {
        if (z19.a >= 29) {
            return I(mediaCodecInfo);
        }
        if (ku4.o(str)) {
            return true;
        }
        String e2 = tr.e(mediaCodecInfo.getName());
        if (e2.startsWith("arc.")) {
            return false;
        }
        if (e2.startsWith("omx.google.") || e2.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((e2.startsWith("omx.sec.") && e2.contains(".sw.")) || e2.equals("omx.qcom.video.decoder.hevcswvdec") || e2.startsWith("c2.android.") || e2.startsWith("c2.google.")) {
            return true;
        }
        return (e2.startsWith("omx.") || e2.startsWith("c2.")) ? false : true;
    }

    private static boolean I(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean J(MediaCodecInfo mediaCodecInfo) {
        if (z19.a >= 29) {
            return K(mediaCodecInfo);
        }
        String e2 = tr.e(mediaCodecInfo.getName());
        return (e2.startsWith("omx.google.") || e2.startsWith("c2.android.") || e2.startsWith("c2.google.")) ? false : true;
    }

    private static boolean K(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int L(k kVar) {
        String str = kVar.a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (z19.a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int M(k kVar) {
        return kVar.a.startsWith("OMX.google") ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int N(t0 t0Var, k kVar) {
        return kVar.n(t0Var) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int O(f fVar, Object obj, Object obj2) {
        return fVar.a(obj2) - fVar.a(obj);
    }

    public static int P() {
        if (c == -1) {
            int i = 0;
            k s = s("video/avc", false, false);
            if (s != null) {
                MediaCodecInfo.CodecProfileLevel[] h = s.h();
                int length = h.length;
                int i2 = 0;
                while (i < length) {
                    i2 = Math.max(h(h[i].level), i2);
                    i++;
                }
                i = Math.max(i2, z19.a >= 21 ? 345600 : 172800);
            }
            c = i;
        }
        return c;
    }

    private static int Q(int i) {
        int i2 = 17;
        if (i != 17) {
            i2 = 20;
            if (i != 20) {
                i2 = 23;
                if (i != 23) {
                    i2 = 29;
                    if (i != 29) {
                        i2 = 39;
                        if (i != 39) {
                            i2 = 42;
                            if (i != 42) {
                                switch (i) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i2;
    }

    private static void R(List list, final f fVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.exoplayer2.mediacodec.p
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int O;
                O = MediaCodecUtil.O(MediaCodecUtil.f.this, obj, obj2);
                return O;
            }
        });
    }

    private static int S(int i) {
        if (i == 10) {
            return 1;
        }
        if (i == 11) {
            return 2;
        }
        if (i == 20) {
            return 4;
        }
        if (i == 21) {
            return 8;
        }
        if (i == 30) {
            return 16;
        }
        if (i == 31) {
            return 32;
        }
        if (i == 40) {
            return 64;
        }
        if (i == 41) {
            return 128;
        }
        if (i == 50) {
            return JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        }
        if (i == 51) {
            return 512;
        }
        switch (i) {
            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                return ProgressEvent.PART_COMPLETED_EVENT_CODE;
            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                return ProgressEvent.PART_FAILED_EVENT_CODE;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    private static int T(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? -1 : 8;
        }
        return 4;
    }

    private static void e(String str, List list) {
        if ("audio/raw".equals(str)) {
            if (z19.a < 26 && z19.b.equals("R9") && list.size() == 1 && ((k) list.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(k.F("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            R(list, new f() { // from class: com.google.android.exoplayer2.mediacodec.m
                @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
                public final int a(Object obj) {
                    int L;
                    L = MediaCodecUtil.L((k) obj);
                    return L;
                }
            });
        }
        int i = z19.a;
        if (i < 21 && list.size() > 1) {
            String str2 = ((k) list.get(0)).a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                R(list, new f() { // from class: com.google.android.exoplayer2.mediacodec.n
                    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
                    public final int a(Object obj) {
                        int M;
                        M = MediaCodecUtil.M((k) obj);
                        return M;
                    }
                });
            }
        }
        if (i >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((k) list.get(0)).a)) {
            return;
        }
        list.add((k) list.remove(0));
    }

    private static int f(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return ProgressEvent.PART_COMPLETED_EVENT_CODE;
            case 12:
                return ProgressEvent.PART_FAILED_EVENT_CODE;
            case 13:
                return 8192;
            case 14:
                return Http2.INITIAL_MAX_FRAME_SIZE;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return Constants.MB;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int g(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i) {
                            case 30:
                                return JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i) {
                                    case 40:
                                        return ProgressEvent.PART_COMPLETED_EVENT_CODE;
                                    case 41:
                                        return ProgressEvent.PART_FAILED_EVENT_CODE;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i) {
                                            case 50:
                                                return Http2.INITIAL_MAX_FRAME_SIZE;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int h(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case JceEncryptionConstants.SYMMETRIC_KEY_LENGTH /* 256 */:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case ProgressEvent.PART_COMPLETED_EVENT_CODE /* 2048 */:
            case ProgressEvent.PART_FAILED_EVENT_CODE /* 4096 */:
                return 2097152;
            case 8192:
                return 2228224;
            case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    private static int i(int i) {
        if (i == 66) {
            return 1;
        }
        if (i == 77) {
            return 2;
        }
        if (i == 88) {
            return 4;
        }
        if (i == 100) {
            return 8;
        }
        if (i == 110) {
            return 16;
        }
        if (i != 122) {
            return i != 244 ? -1 : 64;
        }
        return 32;
    }

    private static Integer j(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    private static Integer k(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    private static Pair l(String str, String[] strArr) {
        int Q;
        if (strArr.length != 3) {
            a84.j("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(ku4.h(Integer.parseInt(strArr[1], 16))) && (Q = Q(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair(Integer.valueOf(Q), 0);
            }
        } catch (NumberFormatException unused) {
            a84.j("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    public static String m(t0 t0Var) {
        Pair r;
        if ("audio/eac3-joc".equals(t0Var.l)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(t0Var.l) || (r = r(t0Var)) == null) {
            return null;
        }
        int intValue = ((Integer) r.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static List n(l lVar, t0 t0Var, boolean z, boolean z2) {
        String m = m(t0Var);
        return m == null ? ImmutableList.x() : lVar.a(m, z, z2);
    }

    private static Pair o(String str, String[] strArr, sn0 sn0Var) {
        int i;
        if (strArr.length < 4) {
            a84.j("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2].substring(0, 2));
            int parseInt3 = Integer.parseInt(strArr[3]);
            if (parseInt != 0) {
                a84.j("MediaCodecUtil", "Unknown AV1 profile: " + parseInt);
                return null;
            }
            if (parseInt3 != 8 && parseInt3 != 10) {
                a84.j("MediaCodecUtil", "Unknown AV1 bit depth: " + parseInt3);
                return null;
            }
            int i2 = parseInt3 != 8 ? (sn0Var == null || !(sn0Var.d != null || (i = sn0Var.c) == 7 || i == 6)) ? 2 : ProgressEvent.PART_FAILED_EVENT_CODE : 1;
            int f2 = f(parseInt2);
            if (f2 != -1) {
                return new Pair(Integer.valueOf(i2), Integer.valueOf(f2));
            }
            a84.j("MediaCodecUtil", "Unknown AV1 level: " + parseInt2);
            return null;
        } catch (NumberFormatException unused) {
            a84.j("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    private static Pair p(String str, String[] strArr) {
        int parseInt;
        int i;
        if (strArr.length < 2) {
            a84.j("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i = Integer.parseInt(strArr[1].substring(0, 2), 16);
                parseInt = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    a84.j("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int parseInt2 = Integer.parseInt(strArr[1]);
                parseInt = Integer.parseInt(strArr[2]);
                i = parseInt2;
            }
            int i2 = i(i);
            if (i2 == -1) {
                a84.j("MediaCodecUtil", "Unknown AVC profile: " + i);
                return null;
            }
            int g = g(parseInt);
            if (g != -1) {
                return new Pair(Integer.valueOf(i2), Integer.valueOf(g));
            }
            a84.j("MediaCodecUtil", "Unknown AVC level: " + parseInt);
            return null;
        } catch (NumberFormatException unused) {
            a84.j("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    private static String q(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0075, code lost:
    
        if (r3.equals("av01") == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair r(com.google.android.exoplayer2.t0 r6) {
        /*
            r0 = 0
            java.lang.String r1 = r6.i
            r2 = 0
            if (r1 != 0) goto L7
            return r2
        L7:
            java.lang.String r3 = "\\."
            java.lang.String[] r1 = r1.split(r3)
            java.lang.String r3 = "video/dolby-vision"
            java.lang.String r4 = r6.l
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L1e
            java.lang.String r6 = r6.i
            android.util.Pair r6 = y(r6, r1)
            return r6
        L1e:
            r3 = r1[r0]
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case 3004662: goto L6f;
                case 3006243: goto L64;
                case 3006244: goto L59;
                case 3199032: goto L4e;
                case 3214780: goto L43;
                case 3356560: goto L38;
                case 3624515: goto L2d;
                default: goto L2b;
            }
        L2b:
            r0 = r4
            goto L78
        L2d:
            java.lang.String r0 = "vp09"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L36
            goto L2b
        L36:
            r0 = 6
            goto L78
        L38:
            java.lang.String r0 = "mp4a"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L41
            goto L2b
        L41:
            r0 = 5
            goto L78
        L43:
            java.lang.String r0 = "hvc1"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L4c
            goto L2b
        L4c:
            r0 = 4
            goto L78
        L4e:
            java.lang.String r0 = "hev1"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L57
            goto L2b
        L57:
            r0 = 3
            goto L78
        L59:
            java.lang.String r0 = "avc2"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L62
            goto L2b
        L62:
            r0 = 2
            goto L78
        L64:
            java.lang.String r0 = "avc1"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L6d
            goto L2b
        L6d:
            r0 = 1
            goto L78
        L6f:
            java.lang.String r5 = "av01"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L78
            goto L2b
        L78:
            switch(r0) {
                case 0: goto L9a;
                case 1: goto L93;
                case 2: goto L93;
                case 3: goto L8a;
                case 4: goto L8a;
                case 5: goto L83;
                case 6: goto L7c;
                default: goto L7b;
            }
        L7b:
            return r2
        L7c:
            java.lang.String r6 = r6.i
            android.util.Pair r6 = A(r6, r1)
            return r6
        L83:
            java.lang.String r6 = r6.i
            android.util.Pair r6 = l(r6, r1)
            return r6
        L8a:
            java.lang.String r0 = r6.i
            sn0 r6 = r6.L
            android.util.Pair r6 = z(r0, r1, r6)
            return r6
        L93:
            java.lang.String r6 = r6.i
            android.util.Pair r6 = p(r6, r1)
            return r6
        L9a:
            java.lang.String r0 = r6.i
            sn0 r6 = r6.L
            android.util.Pair r6 = o(r0, r1, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.r(com.google.android.exoplayer2.t0):android.util.Pair");
    }

    public static k s(String str, boolean z, boolean z2) {
        List t = t(str, z, z2);
        if (t.isEmpty()) {
            return null;
        }
        return (k) t.get(0);
    }

    public static synchronized List t(String str, boolean z, boolean z2) {
        synchronized (MediaCodecUtil.class) {
            try {
                b bVar = new b(str, z, z2);
                HashMap hashMap = b;
                List list = (List) hashMap.get(bVar);
                if (list != null) {
                    return list;
                }
                int i = z19.a;
                ArrayList u = u(bVar, i >= 21 ? new e(z, z2) : new d());
                if (z && u.isEmpty() && 21 <= i && i <= 23) {
                    u = u(bVar, new d());
                    if (!u.isEmpty()) {
                        a84.j("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((k) u.get(0)).a);
                    }
                }
                e(str, u);
                ImmutableList t = ImmutableList.t(u);
                hashMap.put(bVar, t);
                return t;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:28|(4:(2:72|73)|53|(9:56|57|58|59|60|61|62|64|65)|9)|32|33|34|36|9) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x008c, code lost:
    
        if (r1.b == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105 A[Catch: Exception -> 0x012e, TRY_ENTER, TryCatch #1 {Exception -> 0x012e, blocks: (B:3:0x0008, B:5:0x001b, B:9:0x0124, B:10:0x002d, B:13:0x0038, B:39:0x00fd, B:42:0x0105, B:44:0x010b, B:47:0x0130, B:48:0x0153), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0130 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList u(com.google.android.exoplayer2.mediacodec.MediaCodecUtil.b r24, com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c r25) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.u(com.google.android.exoplayer2.mediacodec.MediaCodecUtil$b, com.google.android.exoplayer2.mediacodec.MediaCodecUtil$c):java.util.ArrayList");
    }

    public static List v(l lVar, t0 t0Var, boolean z, boolean z2) {
        List a2 = lVar.a(t0Var.l, z, z2);
        return ImmutableList.p().j(a2).j(n(lVar, t0Var, z, z2)).k();
    }

    public static List w(List list, final t0 t0Var) {
        ArrayList arrayList = new ArrayList(list);
        R(arrayList, new f() { // from class: com.google.android.exoplayer2.mediacodec.o
            @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
            public final int a(Object obj) {
                int N;
                N = MediaCodecUtil.N(t0.this, (k) obj);
                return N;
            }
        });
        return arrayList;
    }

    public static k x() {
        return s("audio/raw", false, false);
    }

    private static Pair y(String str, String[] strArr) {
        if (strArr.length < 3) {
            a84.j("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = a.matcher(strArr[1]);
        if (!matcher.matches()) {
            a84.j("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        Integer k = k(group);
        if (k == null) {
            a84.j("MediaCodecUtil", "Unknown Dolby Vision profile string: " + group);
            return null;
        }
        String str2 = strArr[2];
        Integer j = j(str2);
        if (j != null) {
            return new Pair(k, j);
        }
        a84.j("MediaCodecUtil", "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    private static Pair z(String str, String[] strArr, sn0 sn0Var) {
        if (strArr.length < 4) {
            a84.j("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i = 1;
        Matcher matcher = a.matcher(strArr[1]);
        if (!matcher.matches()) {
            a84.j("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        if (!IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(group)) {
            if (!"2".equals(group)) {
                a84.j("MediaCodecUtil", "Unknown HEVC profile string: " + group);
                return null;
            }
            i = (sn0Var == null || sn0Var.c != 6) ? 2 : ProgressEvent.PART_FAILED_EVENT_CODE;
        }
        String str2 = strArr[3];
        Integer B = B(str2);
        if (B != null) {
            return new Pair(Integer.valueOf(i), B);
        }
        a84.j("MediaCodecUtil", "Unknown HEVC level string: " + str2);
        return null;
    }
}
