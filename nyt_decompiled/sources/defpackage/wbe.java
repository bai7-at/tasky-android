package defpackage;

import com.google.android.gms.internal.ads.g2;
import java.io.File;

/* loaded from: classes3.dex */
public final class wbe {
    private final g2 a;
    private final File b;
    private final File c;
    private final File d;
    private byte[] e;

    public wbe(g2 g2Var, File file, File file2, File file3) {
        this.a = g2Var;
        this.b = file;
        this.c = file3;
        this.d = file2;
    }

    public final g2 a() {
        return this.a;
    }

    public final File b() {
        return this.c;
    }

    public final File c() {
        return this.b;
    }

    public final boolean d(long j) {
        return this.a.M() - (System.currentTimeMillis() / 1000) < 3600;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] e() {
        /*
            r9 = this;
            byte[] r0 = r9.e
            r1 = 0
            if (r0 != 0) goto L56
            java.io.File r0 = r9.d
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4f
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4f
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L50
            r0.<init>()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L50
            r3 = 256(0x100, float:3.59E-43)
        L13:
            byte[] r4 = new byte[r3]     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L50
            r5 = 0
            r6 = r5
        L17:
            if (r6 >= r3) goto L27
            int r7 = r3 - r6
            int r7 = r2.read(r4, r6, r7)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L50
            r8 = -1
            if (r7 != r8) goto L23
            goto L27
        L23:
            int r6 = r6 + r7
            goto L17
        L25:
            r9 = move-exception
            goto L48
        L27:
            if (r6 != 0) goto L2b
            r4 = r1
            goto L2f
        L2b:
            com.google.android.gms.internal.ads.zzgyl r4 = com.google.android.gms.internal.ads.zzgyl.D(r4, r5, r6)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L50
        L2f:
            if (r4 != 0) goto L3d
            com.google.android.gms.internal.ads.zzgyl r0 = com.google.android.gms.internal.ads.zzgyl.C(r0)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L50
            byte[] r0 = r0.a()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L50
            com.google.android.gms.common.util.IOUtils.closeQuietly(r2)
            goto L54
        L3d:
            r0.add(r4)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L50
            int r3 = r3 + r3
            r4 = 8192(0x2000, float:1.148E-41)
            int r3 = java.lang.Math.min(r3, r4)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L50
            goto L13
        L48:
            r1 = r2
            goto L4b
        L4a:
            r9 = move-exception
        L4b:
            com.google.android.gms.common.util.IOUtils.closeQuietly(r1)
            throw r9
        L4f:
            r2 = r1
        L50:
            com.google.android.gms.common.util.IOUtils.closeQuietly(r2)
            r0 = r1
        L54:
            r9.e = r0
        L56:
            byte[] r9 = r9.e
            if (r9 != 0) goto L5b
            return r1
        L5b:
            int r0 = r9.length
            byte[] r9 = java.util.Arrays.copyOf(r9, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wbe.e():byte[]");
    }
}
