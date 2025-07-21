package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* loaded from: classes3.dex */
public final class nta extends r15 {
    private final mta a;
    private final Drawable b;
    private final Uri c;
    private final double d;
    private final int e;
    private final int f;

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|(2:2|3)|(15:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19)|34|6|7|8|9|10|11|12|13|14|15|16|17|18|19) */
    /* JADX WARN: Can't wrap try/catch for region: R(20:0|1|2|3|(15:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19)|34|6|7|8|9|10|11|12|13|14|15|16|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        defpackage.fgb.e("", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        defpackage.fgb.e("", r1);
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0033, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0034, code lost:
    
        defpackage.fgb.e("", r4);
        r1 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0026, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0027, code lost:
    
        defpackage.fgb.e("", r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public nta(defpackage.mta r4) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            r3.<init>()
            r3.a = r4
            r1 = 0
            ee3 r4 = r4.zzf()     // Catch: android.os.RemoteException -> L15
            if (r4 == 0) goto L17
            java.lang.Object r4 = defpackage.fc5.Q1(r4)     // Catch: android.os.RemoteException -> L15
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4     // Catch: android.os.RemoteException -> L15
            goto L1d
        L15:
            r4 = move-exception
            goto L19
        L17:
            r4 = r1
            goto L1d
        L19:
            defpackage.fgb.e(r0, r4)
            goto L17
        L1d:
            r3.b = r4
            mta r4 = r3.a     // Catch: android.os.RemoteException -> L26
            android.net.Uri r1 = r4.zze()     // Catch: android.os.RemoteException -> L26
            goto L2a
        L26:
            r4 = move-exception
            defpackage.fgb.e(r0, r4)
        L2a:
            r3.c = r1
            mta r4 = r3.a     // Catch: android.os.RemoteException -> L33
            double r1 = r4.zzb()     // Catch: android.os.RemoteException -> L33
            goto L39
        L33:
            r4 = move-exception
            defpackage.fgb.e(r0, r4)
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L39:
            r3.d = r1
            r4 = -1
            mta r1 = r3.a     // Catch: android.os.RemoteException -> L43
            int r1 = r1.zzd()     // Catch: android.os.RemoteException -> L43
            goto L48
        L43:
            r1 = move-exception
            defpackage.fgb.e(r0, r1)
            r1 = r4
        L48:
            r3.e = r1
            mta r1 = r3.a     // Catch: android.os.RemoteException -> L51
            int r4 = r1.zzc()     // Catch: android.os.RemoteException -> L51
            goto L55
        L51:
            r1 = move-exception
            defpackage.fgb.e(r0, r1)
        L55:
            r3.f = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nta.<init>(mta):void");
    }

    @Override // defpackage.r15
    public final Drawable a() {
        return this.b;
    }

    @Override // defpackage.r15
    public final double b() {
        return this.d;
    }

    @Override // defpackage.r15
    public final Uri c() {
        return this.c;
    }

    @Override // defpackage.r15
    public final int d() {
        return this.f;
    }

    @Override // defpackage.r15
    public final int e() {
        return this.e;
    }
}
