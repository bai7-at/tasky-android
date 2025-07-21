package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzcei;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class pwd extends m3b implements tof, tla {
    private final aob a;
    private final Context b;
    private final String d;
    private final jwd e;
    private final hwd f;
    private final zzcei g;
    private final zuc h;
    private sxb j;
    protected eyb k;
    private AtomicBoolean c = new AtomicBoolean();
    private long i = -1;

    public pwd(aob aobVar, Context context, String str, jwd jwdVar, hwd hwdVar, zzcei zzceiVar, zuc zucVar) {
        this.a = aobVar;
        this.b = context;
        this.d = str;
        this.e = jwdVar;
        this.f = hwdVar;
        this.g = zzceiVar;
        this.h = zucVar;
        hwdVar.v(this);
    }

    private final synchronized void y6(int i) {
        try {
            if (this.c.compareAndSet(false, true)) {
                this.f.l();
                sxb sxbVar = this.j;
                if (sxbVar != null) {
                    dyf.d().e(sxbVar);
                }
                if (this.k != null) {
                    long j = -1;
                    if (this.i != -1) {
                        j = dyf.b().elapsedRealtime() - this.i;
                    }
                    this.k.k(j, i);
                }
                e();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.q4b
    public final void B3(zzl zzlVar, cua cuaVar) {
    }

    @Override // defpackage.q4b
    public final void B4(rbb rbbVar) {
    }

    @Override // defpackage.q4b
    public final void C2(zzw zzwVar) {
        this.e.k(zzwVar);
    }

    @Override // defpackage.q4b
    public final void D0(ucb ucbVar) {
    }

    @Override // defpackage.q4b
    public final void G4(String str) {
    }

    @Override // defpackage.q4b
    public final void I5(boolean z) {
    }

    @Override // defpackage.q4b
    public final synchronized void J3(qqa qqaVar) {
    }

    @Override // defpackage.q4b
    public final void K4(pqa pqaVar) {
    }

    @Override // defpackage.q4b
    public final void N5(koa koaVar) {
    }

    @Override // defpackage.tof
    public final void O() {
    }

    @Override // defpackage.q4b
    public final void O3(String str) {
    }

    @Override // defpackage.tof
    public final void Q1(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            y6(2);
            return;
        }
        if (i2 == 1) {
            y6(4);
        } else if (i2 != 2) {
            y6(6);
        } else {
            y6(3);
        }
    }

    @Override // defpackage.q4b
    public final synchronized boolean T() {
        return this.e.zza();
    }

    @Override // defpackage.q4b
    public final void T5(cma cmaVar) {
        this.f.E(cmaVar);
    }

    @Override // defpackage.q4b
    public final boolean V() {
        return false;
    }

    @Override // defpackage.q4b
    public final synchronized void V1(fhb fhbVar) {
    }

    @Override // defpackage.q4b
    public final void W0(zzdu zzduVar) {
    }

    @Override // defpackage.q4b
    public final void W2(zcc zccVar) {
    }

    @Override // defpackage.tof
    public final void Y4() {
    }

    @Override // defpackage.q4b
    public final synchronized void e() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        eyb eybVar = this.k;
        if (eybVar != null) {
            eybVar.a();
        }
    }

    @Override // defpackage.q4b
    public final void e3(x7b x7bVar) {
    }

    @Override // defpackage.q4b
    public final void e5(r8b r8bVar) {
    }

    @Override // defpackage.q4b
    public final synchronized String g() {
        return null;
    }

    @Override // defpackage.q4b
    public final synchronized void g1() {
    }

    @Override // defpackage.tof
    public final synchronized void h6() {
        eyb eybVar = this.k;
        if (eybVar != null) {
            eybVar.k(dyf.b().elapsedRealtime() - this.i, 1);
        }
    }

    @Override // defpackage.q4b
    public final void i4(ukb ukbVar) {
    }

    @Override // defpackage.q4b
    public final synchronized void n3(zzfk zzfkVar) {
    }

    @Override // defpackage.tof
    public final synchronized void n4() {
        if (this.k != null) {
            this.i = dyf.b().elapsedRealtime();
            int h = this.k.h();
            if (h > 0) {
                sxb sxbVar = new sxb(this.a.d(), dyf.b());
                this.j = sxbVar;
                sxbVar.d(h, new Runnable() { // from class: mwd
                    @Override // java.lang.Runnable
                    public final void run() {
                        pwd.this.zzp();
                    }
                });
            }
        }
    }

    @Override // defpackage.q4b
    public final synchronized void o() {
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f A[Catch: all -> 0x0026, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0001, B:5:0x0010, B:8:0x0028, B:11:0x0045, B:13:0x0050, B:16:0x0055, B:20:0x0067, B:24:0x006f, B:27:0x0040), top: B:2:0x0001 }] */
    @Override // defpackage.q4b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean p3(com.google.android.gms.ads.internal.client.zzl r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            cra r0 = defpackage.ora.d     // Catch: java.lang.Throwable -> L26
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L26
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L26
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L26
            r1 = 0
            if (r0 == 0) goto L24
            zoa r0 = defpackage.mpa.Ga     // Catch: java.lang.Throwable -> L26
            kpa r2 = defpackage.pla.c()     // Catch: java.lang.Throwable -> L26
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L26
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L26
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L24
            r0 = 1
            goto L28
        L24:
            r0 = r1
            goto L28
        L26:
            r6 = move-exception
            goto L8a
        L28:
            com.google.android.gms.internal.ads.zzcei r2 = r5.g     // Catch: java.lang.Throwable -> L26
            int r2 = r2.zzc     // Catch: java.lang.Throwable -> L26
            zoa r3 = defpackage.mpa.Ha     // Catch: java.lang.Throwable -> L26
            kpa r4 = defpackage.pla.c()     // Catch: java.lang.Throwable -> L26
            java.lang.Object r3 = r4.a(r3)     // Catch: java.lang.Throwable -> L26
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L26
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L26
            if (r2 < r3) goto L40
            if (r0 != 0) goto L45
        L40:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L26
        L45:
            defpackage.dyf.r()     // Catch: java.lang.Throwable -> L26
            android.content.Context r0 = r5.b     // Catch: java.lang.Throwable -> L26
            boolean r0 = defpackage.wxf.g(r0)     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L67
            com.google.android.gms.ads.internal.client.zzc r0 = r6.zzs     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L55
            goto L67
        L55:
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            defpackage.fgb.d(r6)     // Catch: java.lang.Throwable -> L26
            hwd r6 = r5.f     // Catch: java.lang.Throwable -> L26
            r0 = 4
            r2 = 0
            com.google.android.gms.ads.internal.client.zze r0 = defpackage.w2e.d(r0, r2, r2)     // Catch: java.lang.Throwable -> L26
            r6.n(r0)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r5)
            return r1
        L67:
            boolean r0 = r5.T()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L6f
            monitor-exit(r5)
            return r1
        L6f:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L26
            r0.<init>()     // Catch: java.lang.Throwable -> L26
            r5.c = r0     // Catch: java.lang.Throwable -> L26
            nwd r0 = new nwd     // Catch: java.lang.Throwable -> L26
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L26
            jwd r1 = r5.e     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = r5.d     // Catch: java.lang.Throwable -> L26
            owd r3 = new owd     // Catch: java.lang.Throwable -> L26
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L26
            boolean r6 = r1.a(r6, r2, r0, r3)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r5)
            return r6
        L8a:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L26
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pwd.p3(com.google.android.gms.ads.internal.client.zzl):boolean");
    }

    @Override // defpackage.q4b
    public final synchronized void q6(boolean z) {
    }

    @Override // defpackage.q4b
    public final void r6(a8b a8bVar, String str) {
    }

    @Override // defpackage.tof
    public final void s4() {
    }

    @Override // defpackage.q4b
    public final void s5(ee3 ee3Var) {
    }

    @Override // defpackage.q4b
    public final synchronized void v() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // defpackage.q4b
    public final synchronized void x5(zzq zzqVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
    }

    @Override // defpackage.q4b
    public final synchronized void z() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }

    @Override // defpackage.tla
    public final void zza() {
        y6(3);
    }

    @Override // defpackage.q4b
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override // defpackage.q4b
    public final synchronized zzq zzg() {
        return null;
    }

    @Override // defpackage.q4b
    public final pqa zzi() {
        return null;
    }

    @Override // defpackage.q4b
    public final ucb zzj() {
        return null;
    }

    @Override // defpackage.q4b
    public final synchronized qkc zzk() {
        return null;
    }

    @Override // defpackage.q4b
    public final synchronized znc zzl() {
        return null;
    }

    @Override // defpackage.q4b
    public final ee3 zzn() {
        return null;
    }

    final /* synthetic */ void zzo() {
        y6(5);
    }

    public final void zzp() {
        this.a.c().execute(new Runnable() { // from class: lwd
            @Override // java.lang.Runnable
            public final void run() {
                pwd.this.zzo();
            }
        });
    }

    @Override // defpackage.q4b
    public final synchronized String zzr() {
        return this.d;
    }

    @Override // defpackage.q4b
    public final synchronized String zzs() {
        return null;
    }
}
