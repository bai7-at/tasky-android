package defpackage;

import android.app.Activity;
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

/* loaded from: classes3.dex */
public final class gid extends m3b {
    private final zzq a;
    private final Context b;
    private final syd c;
    private final String d;
    private final zzcei e;
    private final yhd f;
    private final uzd g;
    private final gfa h;
    private final zuc i;
    private ygc j;
    private boolean k = ((Boolean) pla.c().a(mpa.D0)).booleanValue();

    public gid(Context context, zzq zzqVar, String str, syd sydVar, yhd yhdVar, uzd uzdVar, zzcei zzceiVar, gfa gfaVar, zuc zucVar) {
        this.a = zzqVar;
        this.d = str;
        this.b = context;
        this.c = sydVar;
        this.f = yhdVar;
        this.g = uzdVar;
        this.e = zzceiVar;
        this.h = gfaVar;
        this.i = zucVar;
    }

    private final synchronized boolean y6() {
        ygc ygcVar = this.j;
        if (ygcVar != null) {
            if (!ygcVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.q4b
    public final void B3(zzl zzlVar, cua cuaVar) {
        this.f.E(cuaVar);
        p3(zzlVar);
    }

    @Override // defpackage.q4b
    public final void B4(rbb rbbVar) {
        this.g.F(rbbVar);
    }

    @Override // defpackage.q4b
    public final void C2(zzw zzwVar) {
    }

    @Override // defpackage.q4b
    public final void D0(ucb ucbVar) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.f.K(ucbVar);
    }

    @Override // defpackage.q4b
    public final void G4(String str) {
    }

    @Override // defpackage.q4b
    public final synchronized void I5(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.k = z;
    }

    @Override // defpackage.q4b
    public final synchronized void J3(qqa qqaVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.c.h(qqaVar);
    }

    @Override // defpackage.q4b
    public final void K4(pqa pqaVar) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.f.t(pqaVar);
    }

    @Override // defpackage.q4b
    public final void N5(koa koaVar) {
    }

    @Override // defpackage.q4b
    public final void O3(String str) {
    }

    @Override // defpackage.q4b
    public final synchronized boolean T() {
        return this.c.zza();
    }

    @Override // defpackage.q4b
    public final void T5(cma cmaVar) {
    }

    @Override // defpackage.q4b
    public final synchronized boolean V() {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return y6();
    }

    @Override // defpackage.q4b
    public final void V1(fhb fhbVar) {
    }

    @Override // defpackage.q4b
    public final void W0(zzdu zzduVar) {
    }

    @Override // defpackage.q4b
    public final void W2(zcc zccVar) {
        Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!zccVar.zzf()) {
                this.i.e();
            }
        } catch (RemoteException e) {
            fgb.c("Error in making CSI ping for reporting paid event callback", e);
        }
        this.f.I(zccVar);
    }

    @Override // defpackage.q4b
    public final synchronized void e() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        ygc ygcVar = this.j;
        if (ygcVar != null) {
            ygcVar.d().M0(null);
        }
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
        ygc ygcVar = this.j;
        if (ygcVar == null || ygcVar.c() == null) {
            return null;
        }
        return ygcVar.c().zzg();
    }

    @Override // defpackage.q4b
    public final synchronized void g1() {
        Preconditions.checkMainThread("showInterstitial must be called on the main UI thread.");
        if (this.j == null) {
            fgb.g("Interstitial can not be shown before loaded.");
            this.f.k(w2e.d(9, null, null));
        } else {
            if (((Boolean) pla.c().a(mpa.z2)).booleanValue()) {
                this.h.c().d(new Throwable().getStackTrace());
            }
            this.j.i(this.k, null);
        }
    }

    @Override // defpackage.q4b
    public final void i4(ukb ukbVar) {
        this.f.O(ukbVar);
    }

    @Override // defpackage.q4b
    public final void n3(zzfk zzfkVar) {
    }

    @Override // defpackage.q4b
    public final void o() {
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006d A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0001, B:5:0x0010, B:8:0x0028, B:11:0x0045, B:13:0x0051, B:15:0x0055, B:17:0x005e, B:21:0x0067, B:23:0x006d, B:26:0x0040), top: B:2:0x0001 }] */
    @Override // defpackage.q4b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean p3(com.google.android.gms.ads.internal.client.zzl r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            cra r0 = defpackage.ora.i     // Catch: java.lang.Throwable -> L26
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
            goto L8e
        L28:
            com.google.android.gms.internal.ads.zzcei r2 = r5.e     // Catch: java.lang.Throwable -> L26
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
            r2 = 0
            if (r0 == 0) goto L67
            com.google.android.gms.ads.internal.client.zzc r0 = r6.zzs     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L67
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            defpackage.fgb.d(r6)     // Catch: java.lang.Throwable -> L26
            yhd r6 = r5.f     // Catch: java.lang.Throwable -> L26
            if (r6 == 0) goto L8c
            r0 = 4
            com.google.android.gms.ads.internal.client.zze r0 = defpackage.w2e.d(r0, r2, r2)     // Catch: java.lang.Throwable -> L26
            r6.n(r0)     // Catch: java.lang.Throwable -> L26
            goto L8c
        L67:
            boolean r0 = r5.y6()     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L8c
            android.content.Context r0 = r5.b     // Catch: java.lang.Throwable -> L26
            boolean r1 = r6.zzf     // Catch: java.lang.Throwable -> L26
            defpackage.r2e.a(r0, r1)     // Catch: java.lang.Throwable -> L26
            r5.j = r2     // Catch: java.lang.Throwable -> L26
            syd r0 = r5.c     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = r5.d     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.ads.internal.client.zzq r2 = r5.a     // Catch: java.lang.Throwable -> L26
            lyd r3 = new lyd     // Catch: java.lang.Throwable -> L26
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L26
            fid r2 = new fid     // Catch: java.lang.Throwable -> L26
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L26
            boolean r6 = r0.a(r6, r1, r3, r2)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r5)
            return r6
        L8c:
            monitor-exit(r5)
            return r1
        L8e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L26
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gid.p3(com.google.android.gms.ads.internal.client.zzl):boolean");
    }

    @Override // defpackage.q4b
    public final void q6(boolean z) {
    }

    @Override // defpackage.q4b
    public final void r6(a8b a8bVar, String str) {
    }

    @Override // defpackage.q4b
    public final synchronized void s5(ee3 ee3Var) {
        if (this.j == null) {
            fgb.g("Interstitial can not be shown before loaded.");
            this.f.k(w2e.d(9, null, null));
            return;
        }
        if (((Boolean) pla.c().a(mpa.z2)).booleanValue()) {
            this.h.c().d(new Throwable().getStackTrace());
        }
        this.j.i(this.k, (Activity) fc5.Q1(ee3Var));
    }

    @Override // defpackage.q4b
    public final synchronized void v() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        ygc ygcVar = this.j;
        if (ygcVar != null) {
            ygcVar.d().O0(null);
        }
    }

    @Override // defpackage.q4b
    public final void x5(zzq zzqVar) {
    }

    @Override // defpackage.q4b
    public final synchronized void z() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        ygc ygcVar = this.j;
        if (ygcVar != null) {
            ygcVar.d().N0(null);
        }
    }

    @Override // defpackage.q4b
    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // defpackage.q4b
    public final zzq zzg() {
        return null;
    }

    @Override // defpackage.q4b
    public final pqa zzi() {
        return this.f.l();
    }

    @Override // defpackage.q4b
    public final ucb zzj() {
        return this.f.s();
    }

    @Override // defpackage.q4b
    public final synchronized qkc zzk() {
        ygc ygcVar;
        if (((Boolean) pla.c().a(mpa.N6)).booleanValue() && (ygcVar = this.j) != null) {
            return ygcVar.c();
        }
        return null;
    }

    @Override // defpackage.q4b
    public final znc zzl() {
        return null;
    }

    @Override // defpackage.q4b
    public final ee3 zzn() {
        return null;
    }

    @Override // defpackage.q4b
    public final synchronized String zzr() {
        return this.d;
    }

    @Override // defpackage.q4b
    public final synchronized String zzs() {
        ygc ygcVar = this.j;
        if (ygcVar == null || ygcVar.c() == null) {
            return null;
        }
        return ygcVar.c().zzg();
    }
}
