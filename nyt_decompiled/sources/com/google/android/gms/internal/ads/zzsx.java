package com.google.android.gms.internal.ads;

import defpackage.l6a;
import defpackage.pxf;

/* loaded from: classes3.dex */
public final class zzsx extends Exception {
    public final String zza;
    public final boolean zzb;
    public final pxf zzc;
    public final String zzd;
    public final zzsx zze;

    public zzsx(l6a l6aVar, Throwable th, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + l6aVar.toString(), th, l6aVar.l, false, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i), null);
    }

    static /* bridge */ /* synthetic */ zzsx a(zzsx zzsxVar, zzsx zzsxVar2) {
        return new zzsx(zzsxVar.getMessage(), zzsxVar.getCause(), zzsxVar.zza, false, zzsxVar.zzc, zzsxVar.zzd, zzsxVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzsx(defpackage.l6a r11, java.lang.Throwable r12, boolean r13, defpackage.pxf r14) {
        /*
            r10 = this;
            java.lang.String r13 = r14.a
            java.lang.String r0 = r11.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Decoder init failed: "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r13 = ", "
            r1.append(r13)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            java.lang.String r5 = r11.l
            int r11 = defpackage.khe.a
            boolean r11 = r12 instanceof android.media.MediaCodec.CodecException
            if (r11 == 0) goto L30
            r11 = r12
            android.media.MediaCodec$CodecException r11 = (android.media.MediaCodec.CodecException) r11
            java.lang.String r11 = r11.getDiagnosticInfo()
        L2e:
            r8 = r11
            goto L32
        L30:
            r11 = 0
            goto L2e
        L32:
            r6 = 0
            r9 = 0
            r2 = r10
            r4 = r12
            r7 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsx.<init>(l6a, java.lang.Throwable, boolean, pxf):void");
    }

    private zzsx(String str, Throwable th, String str2, boolean z, pxf pxfVar, String str3, zzsx zzsxVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = pxfVar;
        this.zzd = str3;
        this.zze = zzsxVar;
    }
}
