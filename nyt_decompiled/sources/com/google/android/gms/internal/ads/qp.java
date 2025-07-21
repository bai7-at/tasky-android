package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Pair;
import defpackage.ezd;
import defpackage.fyf;
import defpackage.khe;
import defpackage.l6a;
import defpackage.pxf;
import defpackage.qcb;
import defpackage.yfe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public abstract class qp {
    private static final Pattern a = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap b = new HashMap();
    public static final /* synthetic */ int c = 0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02bf A[Catch: NumberFormatException -> 0x02d0, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x02d0, blocks: (B:122:0x0268, B:124:0x027a, B:135:0x0296, B:138:0x02bf), top: B:121:0x0268 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x07a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair a(defpackage.l6a r17) {
        /*
            Method dump skipped, instructions count: 2508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qp.a(l6a):android.util.Pair");
    }

    public static pxf b() {
        List e = e("audio/raw", false, false);
        if (e.isEmpty()) {
            return null;
        }
        return (pxf) e.get(0);
    }

    public static String c(l6a l6aVar) {
        Pair a2;
        if ("audio/eac3-joc".equals(l6aVar.l)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(l6aVar.l) || (a2 = a(l6aVar)) == null) {
            return null;
        }
        int intValue = ((Integer) a2.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static List d(fyf fyfVar, l6a l6aVar, boolean z, boolean z2) {
        String c2 = c(l6aVar);
        return c2 == null ? zzgaa.t() : e(c2, z, z2);
    }

    public static synchronized List e(String str, boolean z, boolean z2) {
        synchronized (qp.class) {
            try {
                lp lpVar = new lp(str, z, z2);
                HashMap hashMap = b;
                List list = (List) hashMap.get(lpVar);
                if (list != null) {
                    return list;
                }
                int i = khe.a;
                ArrayList h = h(lpVar, new op(z, z2));
                if (z && h.isEmpty() && khe.a <= 23) {
                    h = h(lpVar, new np(null));
                    if (!h.isEmpty()) {
                        ezd.f("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((pxf) h.get(0)).a);
                    }
                }
                if ("audio/raw".equals(str)) {
                    if (khe.a < 26 && khe.b.equals("R9") && h.size() == 1 && ((pxf) h.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        h.add(pxf.c("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                    }
                    i(h, new pp() { // from class: com.google.android.gms.internal.ads.jp
                        @Override // com.google.android.gms.internal.ads.pp
                        public final int zza(Object obj) {
                            int i2 = qp.c;
                            String str2 = ((pxf) obj).a;
                            if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                                return 1;
                            }
                            return (khe.a >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                        }
                    });
                }
                if (khe.a < 32 && h.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((pxf) h.get(0)).a)) {
                    h.add((pxf) h.remove(0));
                }
                zzgaa p = zzgaa.p(h);
                hashMap.put(lpVar, p);
                return p;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static List f(fyf fyfVar, l6a l6aVar, boolean z, boolean z2) {
        List e = e(l6aVar.l, z, z2);
        List d = d(fyfVar, l6aVar, z, z2);
        h9 h9Var = new h9();
        h9Var.i(e);
        h9Var.i(d);
        return h9Var.j();
    }

    public static List g(List list, final l6a l6aVar) {
        ArrayList arrayList = new ArrayList(list);
        i(arrayList, new pp() { // from class: com.google.android.gms.internal.ads.kp
            @Override // com.google.android.gms.internal.ads.pp
            public final int zza(Object obj) {
                int i = qp.c;
                return ((pxf) obj).d(l6a.this) ? 1 : 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:64|65|(1:67)(2:128|(1:130)(1:131))|68|(1:70)(2:120|(1:127)(1:126))|(4:(2:114|115)|94|(8:97|98|99|100|101|102|103|105)|11)|74|75|76|77|11) */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01be, code lost:
    
        if (r1.b == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a9, code lost:
    
        if ("SCV31".equals(r10) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01dc, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x022b, code lost:
    
        defpackage.ezd.c("MediaCodecUtil", "Skipping codec " + r1 + " (failed to query capabilities)");
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018f A[Catch: Exception -> 0x016e, TryCatch #0 {Exception -> 0x016e, blocks: (B:57:0x0137, B:61:0x014e, B:65:0x0163, B:67:0x0169, B:68:0x0182, B:70:0x018a, B:72:0x01b6, B:120:0x018f, B:122:0x019f, B:124:0x01a7, B:128:0x0177), top: B:56:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0177 A[Catch: Exception -> 0x016e, TryCatch #0 {Exception -> 0x016e, blocks: (B:57:0x0137, B:61:0x014e, B:65:0x0163, B:67:0x0169, B:68:0x0182, B:70:0x018a, B:72:0x01b6, B:120:0x018f, B:122:0x019f, B:124:0x01a7, B:128:0x0177), top: B:56:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0169 A[Catch: Exception -> 0x016e, TryCatch #0 {Exception -> 0x016e, blocks: (B:57:0x0137, B:61:0x014e, B:65:0x0163, B:67:0x0169, B:68:0x0182, B:70:0x018a, B:72:0x01b6, B:120:0x018f, B:122:0x019f, B:124:0x01a7, B:128:0x0177), top: B:56:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018a A[Catch: Exception -> 0x016e, TryCatch #0 {Exception -> 0x016e, blocks: (B:57:0x0137, B:61:0x014e, B:65:0x0163, B:67:0x0169, B:68:0x0182, B:70:0x018a, B:72:0x01b6, B:120:0x018f, B:122:0x019f, B:124:0x01a7, B:128:0x0177), top: B:56:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0225 A[Catch: Exception -> 0x0034, TRY_ENTER, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:80:0x021d, B:83:0x0225, B:85:0x022b, B:88:0x0245, B:89:0x0266, B:52:0x00d1, B:140:0x00d4, B:142:0x00dc, B:145:0x00e7, B:147:0x00ef, B:152:0x00fd, B:154:0x0105, B:157:0x0110, B:159:0x0118, B:162:0x0123, B:164:0x012b), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0245 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList h(com.google.android.gms.internal.ads.lp r23, com.google.android.gms.internal.ads.mp r24) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qp.h(com.google.android.gms.internal.ads.lp, com.google.android.gms.internal.ads.mp):java.util.ArrayList");
    }

    private static void i(List list, final pp ppVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.ip
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i = qp.c;
                pp ppVar2 = pp.this;
                return ppVar2.zza(obj2) - ppVar2.zza(obj);
            }
        });
    }

    private static boolean j(MediaCodecInfo mediaCodecInfo, String str) {
        if (khe.a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (qcb.g(str)) {
            return true;
        }
        String a2 = yfe.a(mediaCodecInfo.getName());
        if (a2.startsWith("arc.")) {
            return false;
        }
        if (a2.startsWith("omx.google.") || a2.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((a2.startsWith("omx.sec.") && a2.contains(".sw.")) || a2.equals("omx.qcom.video.decoder.hevcswvdec") || a2.startsWith("c2.android.") || a2.startsWith("c2.google.")) {
            return true;
        }
        return (a2.startsWith("omx.") || a2.startsWith("c2.")) ? false : true;
    }
}
