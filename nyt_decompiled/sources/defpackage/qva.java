package defpackage;

import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class qva extends rw8 {
    private final pva a;
    private final nta c;
    private final q15 e;
    private final List b = new ArrayList();
    private final a79 d = new a79();
    private final List f = new ArrayList();

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(3:2|3|(2:5|(5:8|(1:22)(2:12|(1:14)(1:21))|(3:16|17|18)(1:20)|19|6)))|(3:24|25|(2:27|(5:30|(1:32)(1:39)|(3:34|35|36)(1:38)|37|28)))|41|42|(7:44|45|46|47|(2:49|50)|52|53)|58|45|46|47|(0)|52|53) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c0, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c1, code lost:
    
        defpackage.fgb.e("", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3 A[Catch: RemoteException -> 0x00c0, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x00c0, blocks: (B:47:0x00ab, B:49:0x00b3), top: B:46:0x00ab }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qva(defpackage.pva r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.b = r1
            a79 r1 = new a79
            r1.<init>()
            r5.d = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f = r1
            r5.a = r6
            r1 = 0
            java.util.List r6 = r6.c()     // Catch: android.os.RemoteException -> L48
            if (r6 == 0) goto L5f
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L48
        L27:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L48
            if (r2 == 0) goto L5f
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L48
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L48
            if (r3 == 0) goto L39
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L48
            if (r2 != 0) goto L3b
        L39:
            r3 = r1
            goto L4f
        L3b:
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch: android.os.RemoteException -> L48
            boolean r4 = r3 instanceof defpackage.mta     // Catch: android.os.RemoteException -> L48
            if (r4 == 0) goto L4a
            mta r3 = (defpackage.mta) r3     // Catch: android.os.RemoteException -> L48
            goto L4f
        L48:
            r6 = move-exception
            goto L5c
        L4a:
            kta r3 = new kta     // Catch: android.os.RemoteException -> L48
            r3.<init>(r2)     // Catch: android.os.RemoteException -> L48
        L4f:
            if (r3 == 0) goto L27
            java.util.List r2 = r5.b     // Catch: android.os.RemoteException -> L48
            nta r4 = new nta     // Catch: android.os.RemoteException -> L48
            r4.<init>(r3)     // Catch: android.os.RemoteException -> L48
            r2.add(r4)     // Catch: android.os.RemoteException -> L48
            goto L27
        L5c:
            defpackage.fgb.e(r0, r6)
        L5f:
            pva r6 = r5.a     // Catch: android.os.RemoteException -> L80
            java.util.List r6 = r6.a()     // Catch: android.os.RemoteException -> L80
            if (r6 == 0) goto L93
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L80
        L6b:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L80
            if (r2 == 0) goto L93
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L80
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L80
            if (r3 == 0) goto L82
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L80
            m0c r2 = defpackage.kzb.w6(r2)     // Catch: android.os.RemoteException -> L80
            goto L83
        L80:
            r6 = move-exception
            goto L90
        L82:
            r2 = r1
        L83:
            if (r2 == 0) goto L6b
            java.util.List r3 = r5.f     // Catch: android.os.RemoteException -> L80
            q1c r4 = new q1c     // Catch: android.os.RemoteException -> L80
            r4.<init>(r2)     // Catch: android.os.RemoteException -> L80
            r3.add(r4)     // Catch: android.os.RemoteException -> L80
            goto L6b
        L90:
            defpackage.fgb.e(r0, r6)
        L93:
            pva r6 = r5.a     // Catch: android.os.RemoteException -> La1
            mta r6 = r6.zzk()     // Catch: android.os.RemoteException -> La1
            if (r6 == 0) goto La3
            nta r2 = new nta     // Catch: android.os.RemoteException -> La1
            r2.<init>(r6)     // Catch: android.os.RemoteException -> La1
            goto La9
        La1:
            r6 = move-exception
            goto La5
        La3:
            r2 = r1
            goto La9
        La5:
            defpackage.fgb.e(r0, r6)
            goto La3
        La9:
            r5.c = r2
            pva r6 = r5.a     // Catch: android.os.RemoteException -> Lc0
            fta r6 = r6.zzi()     // Catch: android.os.RemoteException -> Lc0
            if (r6 == 0) goto Lc4
            gta r6 = new gta     // Catch: android.os.RemoteException -> Lc0
            pva r2 = r5.a     // Catch: android.os.RemoteException -> Lc0
            fta r2 = r2.zzi()     // Catch: android.os.RemoteException -> Lc0
            r6.<init>(r2)     // Catch: android.os.RemoteException -> Lc0
            r1 = r6
            goto Lc4
        Lc0:
            r6 = move-exception
            defpackage.fgb.e(r0, r6)
        Lc4:
            r5.e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qva.<init>(pva):void");
    }

    @Override // defpackage.rw8
    public final a79 a() {
        try {
            if (this.a.zzh() != null) {
                this.d.c(this.a.zzh());
            }
        } catch (RemoteException e) {
            fgb.e("Exception occurred while getting video controller", e);
        }
        return this.d;
    }

    @Override // defpackage.rw8
    public final r15 b() {
        return this.c;
    }

    @Override // defpackage.rw8
    public final Double c() {
        try {
            double zze = this.a.zze();
            if (zze == -1.0d) {
                return null;
            }
            return Double.valueOf(zze);
        } catch (RemoteException e) {
            fgb.e("", e);
            return null;
        }
    }

    @Override // defpackage.rw8
    public final Object d() {
        try {
            ee3 zzl = this.a.zzl();
            if (zzl != null) {
                return fc5.Q1(zzl);
            }
            return null;
        } catch (RemoteException e) {
            fgb.e("", e);
            return null;
        }
    }

    @Override // defpackage.rw8
    public final String e() {
        try {
            return this.a.zzn();
        } catch (RemoteException e) {
            fgb.e("", e);
            return null;
        }
    }

    @Override // defpackage.rw8
    public final String f() {
        try {
            return this.a.zzo();
        } catch (RemoteException e) {
            fgb.e("", e);
            return null;
        }
    }

    @Override // defpackage.rw8
    public final String g() {
        try {
            return this.a.zzp();
        } catch (RemoteException e) {
            fgb.e("", e);
            return null;
        }
    }

    @Override // defpackage.rw8
    public final String h() {
        try {
            return this.a.zzq();
        } catch (RemoteException e) {
            fgb.e("", e);
            return null;
        }
    }

    @Override // defpackage.rw8
    public final String i() {
        try {
            return this.a.zzs();
        } catch (RemoteException e) {
            fgb.e("", e);
            return null;
        }
    }

    @Override // defpackage.rw8
    public final String j() {
        try {
            return this.a.g();
        } catch (RemoteException e) {
            fgb.e("", e);
            return null;
        }
    }

    @Override // defpackage.rw8
    public final List k() {
        return this.b;
    }
}
