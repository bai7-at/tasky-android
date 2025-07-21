package com.google.android.gms.internal.ads;

import com.comscore.streaming.ContentMediaFormat;
import defpackage.khe;
import defpackage.l6a;
import defpackage.wad;
import defpackage.zhf;
import defpackage.zzf;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zziz extends zzce {
    public static final zhf g = new zhf() { // from class: n8f
    };
    private static final String h = Integer.toString(1001, 36);
    private static final String i = Integer.toString(ContentMediaFormat.FULL_CONTENT_EPISODE, 36);
    private static final String j = Integer.toString(ContentMediaFormat.FULL_CONTENT_MOVIE, 36);
    private static final String k = Integer.toString(ContentMediaFormat.PARTIAL_CONTENT_GENERIC, 36);
    private static final String l = Integer.toString(1005, 36);
    private static final String m = Integer.toString(ContentMediaFormat.PARTIAL_CONTENT_MOVIE, 36);
    public final int zze;
    public final String zzf;
    public final int zzg;
    public final l6a zzh;
    public final int zzi;
    public final zzf zzj;
    final boolean zzk;

    private zziz(int i2, Throwable th, int i3) {
        this(i2, th, null, i3, null, -1, null, 4, false);
    }

    public static zziz b(Throwable th, String str, int i2, l6a l6aVar, int i3, boolean z, int i4) {
        return new zziz(1, th, null, i4, str, i2, l6aVar, l6aVar == null ? 4 : i3, z);
    }

    public static zziz c(IOException iOException, int i2) {
        return new zziz(0, iOException, i2);
    }

    public static zziz d(RuntimeException runtimeException, int i2) {
        return new zziz(2, runtimeException, i2);
    }

    final zziz a(zzf zzfVar) {
        String message = getMessage();
        int i2 = khe.a;
        return new zziz(message, getCause(), this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, zzfVar, this.zzc, this.zzk);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private zziz(int r14, java.lang.Throwable r15, java.lang.String r16, int r17, java.lang.String r18, int r19, defpackage.l6a r20, int r21, boolean r22) {
        /*
            r13 = this;
            r4 = r14
            r8 = r21
            if (r4 == 0) goto L5f
            r0 = 1
            if (r4 == r0) goto Lf
            java.lang.String r0 = "Unexpected runtime error"
            r5 = r18
            r6 = r19
            goto L65
        Lf:
            java.lang.String r1 = java.lang.String.valueOf(r20)
            int r2 = defpackage.khe.a
            if (r8 == 0) goto L34
            if (r8 == r0) goto L31
            r0 = 2
            if (r8 == r0) goto L2e
            r0 = 3
            if (r8 == r0) goto L2b
            r0 = 4
            if (r8 != r0) goto L25
            java.lang.String r0 = "YES"
            goto L36
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L2b:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L36
        L2e:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L36
        L31:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L36
        L34:
            java.lang.String r0 = "NO"
        L36:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r18
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r19
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", format_supported="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L65
        L5f:
            r5 = r18
            r6 = r19
            java.lang.String r0 = "Source error"
        L65:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L72
            java.lang.String r1 = ": null"
            java.lang.String r0 = r0.concat(r1)
        L72:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r17
            r4 = r14
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zziz.<init>(int, java.lang.Throwable, java.lang.String, int, java.lang.String, int, l6a, int, boolean):void");
    }

    private zziz(String str, Throwable th, int i2, int i3, String str2, int i4, l6a l6aVar, int i5, zzf zzfVar, long j2, boolean z) {
        super(str, th, i2, j2);
        int i6;
        boolean z2;
        if (z) {
            i6 = i3;
            if (i6 == 1) {
                i6 = 1;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            i6 = i3;
            z2 = true;
        }
        wad.d(z2);
        wad.d(th != null);
        this.zze = i6;
        this.zzf = str2;
        this.zzg = i4;
        this.zzh = l6aVar;
        this.zzi = i5;
        this.zzj = zzfVar;
        this.zzk = z;
    }
}
