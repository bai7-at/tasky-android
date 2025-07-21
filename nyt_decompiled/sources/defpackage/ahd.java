package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzcei;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class ahd extends m3b implements x9c {
    private final Context a;
    private final vwd b;
    private final String c;
    private final yhd d;
    private zzq e;
    private final q1e f;
    private final zzcei g;
    private final zuc h;
    private nyb i;

    public ahd(Context context, zzq zzqVar, String str, vwd vwdVar, yhd yhdVar, zzcei zzceiVar, zuc zucVar) {
        this.a = context;
        this.b = vwdVar;
        this.e = zzqVar;
        this.c = str;
        this.d = yhdVar;
        this.f = vwdVar.h();
        this.g = zzceiVar;
        this.h = zucVar;
        vwdVar.o(this);
    }

    private final boolean A6() {
        boolean z;
        if (((Boolean) ora.f.e()).booleanValue()) {
            if (((Boolean) pla.c().a(mpa.Ga)).booleanValue()) {
                z = true;
                return this.g.zzc >= ((Integer) pla.c().a(mpa.Ha)).intValue() || !z;
            }
        }
        z = false;
        if (this.g.zzc >= ((Integer) pla.c().a(mpa.Ha)).intValue()) {
        }
    }

    private final synchronized void y6(zzq zzqVar) {
        this.f.I(zzqVar);
        this.f.N(this.e.zzn);
    }

    private final synchronized boolean z6(zzl zzlVar) {
        try {
            if (A6()) {
                Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
            }
            dyf.r();
            if (!wxf.g(this.a) || zzlVar.zzs != null) {
                r2e.a(this.a, zzlVar.zzf);
                return this.b.a(zzlVar, this.c, null, new zgd(this));
            }
            fgb.d("Failed to load the ad because app ID is missing.");
            yhd yhdVar = this.d;
            if (yhdVar != null) {
                yhdVar.n(w2e.d(4, null, null));
            }
            return false;
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
    }

    @Override // defpackage.q4b
    public final void D0(ucb ucbVar) {
        if (A6()) {
            Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        }
        this.d.K(ucbVar);
    }

    @Override // defpackage.q4b
    public final void G4(String str) {
    }

    @Override // defpackage.q4b
    public final void I5(boolean z) {
    }

    @Override // defpackage.q4b
    public final synchronized void J3(qqa qqaVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.b.p(qqaVar);
    }

    @Override // defpackage.q4b
    public final void K4(pqa pqaVar) {
        if (A6()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.d.t(pqaVar);
    }

    @Override // defpackage.q4b
    public final void N5(koa koaVar) {
        if (A6()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.b.n(koaVar);
    }

    @Override // defpackage.q4b
    public final void O3(String str) {
    }

    @Override // defpackage.q4b
    public final synchronized boolean T() {
        return this.b.zza();
    }

    @Override // defpackage.q4b
    public final void T5(cma cmaVar) {
    }

    @Override // defpackage.q4b
    public final boolean V() {
        return false;
    }

    @Override // defpackage.q4b
    public final synchronized void V1(fhb fhbVar) {
        Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
        this.f.q(fhbVar);
    }

    @Override // defpackage.q4b
    public final void W0(zzdu zzduVar) {
    }

    @Override // defpackage.q4b
    public final void W2(zcc zccVar) {
        if (A6()) {
            Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!zccVar.zzf()) {
                this.h.e();
            }
        } catch (RemoteException e) {
            fgb.c("Error in making CSI ping for reporting paid event callback", e);
        }
        this.d.I(zccVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003f, B:12:0x0043, B:19:0x003a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[DONT_GENERATE] */
    @Override // defpackage.q4b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void e() {
        /*
            r3 = this;
            monitor-enter(r3)
            cra r0 = defpackage.ora.e     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            zoa r0 = defpackage.mpa.Da     // Catch: java.lang.Throwable -> L38
            kpa r1 = defpackage.pla.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.zzcei r0 = r3.g     // Catch: java.lang.Throwable -> L38
            int r0 = r0.zzc     // Catch: java.lang.Throwable -> L38
            zoa r1 = defpackage.mpa.Ia     // Catch: java.lang.Throwable -> L38
            kpa r2 = defpackage.pla.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L4a
        L3a:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            nyb r0 = r3.i     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L48
            r0.a()     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L48:
            monitor-exit(r3)
            return
        L4a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahd.e():void");
    }

    @Override // defpackage.q4b
    public final void e3(x7b x7bVar) {
    }

    @Override // defpackage.q4b
    public final void e5(r8b r8bVar) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // defpackage.q4b
    public final synchronized String g() {
        nyb nybVar = this.i;
        if (nybVar == null || nybVar.c() == null) {
            return null;
        }
        return nybVar.c().zzg();
    }

    @Override // defpackage.q4b
    public final void g1() {
    }

    @Override // defpackage.q4b
    public final void i4(ukb ukbVar) {
    }

    @Override // defpackage.q4b
    public final synchronized void n3(zzfk zzfkVar) {
        try {
            if (A6()) {
                Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
            }
            this.f.f(zzfkVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.q4b
    public final synchronized void o() {
        Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
        nyb nybVar = this.i;
        if (nybVar != null) {
            nybVar.m();
        }
    }

    @Override // defpackage.q4b
    public final synchronized boolean p3(zzl zzlVar) {
        y6(this.e);
        return z6(zzlVar);
    }

    @Override // defpackage.q4b
    public final synchronized void q6(boolean z) {
        try {
            if (A6()) {
                Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.f.P(z);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.q4b
    public final void r6(a8b a8bVar, String str) {
    }

    @Override // defpackage.q4b
    public final void s5(ee3 ee3Var) {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003f, B:12:0x0043, B:19:0x003a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[DONT_GENERATE] */
    @Override // defpackage.q4b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void v() {
        /*
            r3 = this;
            monitor-enter(r3)
            cra r0 = defpackage.ora.h     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            zoa r0 = defpackage.mpa.Ca     // Catch: java.lang.Throwable -> L38
            kpa r1 = defpackage.pla.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.zzcei r0 = r3.g     // Catch: java.lang.Throwable -> L38
            int r0 = r0.zzc     // Catch: java.lang.Throwable -> L38
            zoa r1 = defpackage.mpa.Ia     // Catch: java.lang.Throwable -> L38
            kpa r2 = defpackage.pla.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L4f
        L3a:
            java.lang.String r0 = "resume must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            nyb r0 = r3.i     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L4d
            y7c r0 = r0.d()     // Catch: java.lang.Throwable -> L38
            r1 = 0
            r0.O0(r1)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L4d:
            monitor-exit(r3)
            return
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahd.v():void");
    }

    @Override // defpackage.q4b
    public final synchronized void x5(zzq zzqVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        this.f.I(zzqVar);
        this.e = zzqVar;
        nyb nybVar = this.i;
        if (nybVar != null) {
            nybVar.n(this.b.c(), zzqVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003f, B:12:0x0043, B:19:0x003a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[DONT_GENERATE] */
    @Override // defpackage.q4b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void z() {
        /*
            r3 = this;
            monitor-enter(r3)
            cra r0 = defpackage.ora.g     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            zoa r0 = defpackage.mpa.Ea     // Catch: java.lang.Throwable -> L38
            kpa r1 = defpackage.pla.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.zzcei r0 = r3.g     // Catch: java.lang.Throwable -> L38
            int r0 = r0.zzc     // Catch: java.lang.Throwable -> L38
            zoa r1 = defpackage.mpa.Ia     // Catch: java.lang.Throwable -> L38
            kpa r2 = defpackage.pla.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L4f
        L3a:
            java.lang.String r0 = "pause must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            nyb r0 = r3.i     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L4d
            y7c r0 = r0.d()     // Catch: java.lang.Throwable -> L38
            r1 = 0
            r0.N0(r1)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L4d:
            monitor-exit(r3)
            return
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahd.z():void");
    }

    @Override // defpackage.x9c
    public final synchronized void zza() {
        try {
            if (!this.b.q()) {
                this.b.m();
                return;
            }
            zzq x = this.f.x();
            nyb nybVar = this.i;
            if (nybVar != null && nybVar.l() != null && this.f.o()) {
                x = y1e.a(this.a, Collections.singletonList(this.i.l()));
            }
            y6(x);
            try {
                z6(this.f.v());
            } catch (RemoteException unused) {
                fgb.g("Failed to refresh the banner ad.");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.q4b
    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // defpackage.q4b
    public final synchronized zzq zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        nyb nybVar = this.i;
        if (nybVar != null) {
            return y1e.a(this.a, Collections.singletonList(nybVar.k()));
        }
        return this.f.x();
    }

    @Override // defpackage.q4b
    public final pqa zzi() {
        return this.d.l();
    }

    @Override // defpackage.q4b
    public final ucb zzj() {
        return this.d.s();
    }

    @Override // defpackage.q4b
    public final synchronized qkc zzk() {
        nyb nybVar;
        if (((Boolean) pla.c().a(mpa.N6)).booleanValue() && (nybVar = this.i) != null) {
            return nybVar.c();
        }
        return null;
    }

    @Override // defpackage.q4b
    public final synchronized znc zzl() {
        Preconditions.checkMainThread("getVideoController must be called from the main thread.");
        nyb nybVar = this.i;
        if (nybVar == null) {
            return null;
        }
        return nybVar.j();
    }

    @Override // defpackage.q4b
    public final ee3 zzn() {
        if (A6()) {
            Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        }
        return fc5.l3(this.b.c());
    }

    @Override // defpackage.q4b
    public final synchronized String zzr() {
        return this.c;
    }

    @Override // defpackage.q4b
    public final synchronized String zzs() {
        nyb nybVar = this.i;
        if (nybVar == null || nybVar.c() == null) {
            return null;
        }
        return nybVar.c().zzg();
    }
}
