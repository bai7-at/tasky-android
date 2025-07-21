package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class s0e extends kab {
    private final e0e a;
    private final uzd b;
    private final h1e c;
    private uqc d;
    private boolean e = false;

    public s0e(e0e e0eVar, uzd uzdVar, h1e h1eVar) {
        this.a = e0eVar;
        this.b = uzdVar;
        this.c = h1eVar;
    }

    private final synchronized boolean z6() {
        uqc uqcVar = this.d;
        if (uqcVar != null) {
            if (!uqcVar.k()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.lab
    public final synchronized void B(ee3 ee3Var) {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.d != null) {
            this.d.d().O0(ee3Var == null ? null : (Context) fc5.Q1(ee3Var));
        }
    }

    @Override // defpackage.lab
    public final synchronized void E(String str) {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.c.a = str;
    }

    @Override // defpackage.lab
    public final synchronized void F(ee3 ee3Var) {
        try {
            Preconditions.checkMainThread("showAd must be called on the main UI thread.");
            if (this.d != null) {
                Activity activity = null;
                if (ee3Var != null) {
                    Object Q1 = fc5.Q1(ee3Var);
                    if (Q1 instanceof Activity) {
                        activity = (Activity) Q1;
                    }
                }
                this.d.n(this.e, activity);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.lab
    public final synchronized void Z1(String str) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.c.b = str;
    }

    @Override // defpackage.lab
    public final boolean g() {
        uqc uqcVar = this.d;
        return uqcVar != null && uqcVar.m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (((java.lang.Boolean) defpackage.pla.c().a(defpackage.mpa.r5)).booleanValue() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (java.util.regex.Pattern.matches(r1, r0) != false) goto L18;
     */
    @Override // defpackage.lab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void g4(com.google.android.gms.internal.ads.zzcab r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r5.zzb     // Catch: java.lang.Throwable -> L20
            zoa r1 = defpackage.mpa.p5     // Catch: java.lang.Throwable -> L20
            kpa r2 = defpackage.pla.c()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L2c
            if (r0 != 0) goto L19
            goto L2c
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.Throwable -> L20 java.lang.RuntimeException -> L22
            if (r0 == 0) goto L2c
            goto L44
        L20:
            r5 = move-exception
            goto L64
        L22:
            r0 = move-exception
            java.lang.String r1 = "NonagonUtil.isPatternMatched"
            kfb r2 = defpackage.dyf.q()     // Catch: java.lang.Throwable -> L20
            r2.w(r0, r1)     // Catch: java.lang.Throwable -> L20
        L2c:
            boolean r0 = r4.z6()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L46
            zoa r0 = defpackage.mpa.r5     // Catch: java.lang.Throwable -> L20
            kpa r1 = defpackage.pla.c()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L46
        L44:
            monitor-exit(r4)
            return
        L46:
            wzd r0 = new wzd     // Catch: java.lang.Throwable -> L20
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L20
            r4.d = r1     // Catch: java.lang.Throwable -> L20
            e0e r1 = r4.a     // Catch: java.lang.Throwable -> L20
            r2 = 1
            r1.i(r2)     // Catch: java.lang.Throwable -> L20
            e0e r1 = r4.a     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.ads.internal.client.zzl r2 = r5.zza     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r5.zzb     // Catch: java.lang.Throwable -> L20
            q0e r3 = new q0e     // Catch: java.lang.Throwable -> L20
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L20
            r1.a(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r4)
            return
        L64:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L20
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s0e.g4(com.google.android.gms.internal.ads.zzcab):void");
    }

    @Override // defpackage.lab
    public final void i6(rbb rbbVar) {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.b.F(rbbVar);
    }

    @Override // defpackage.lab
    public final void s3(r8b r8bVar) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (r8bVar == null) {
            this.b.t(null);
        } else {
            this.b.t(new r0e(this, r8bVar));
        }
    }

    @Override // defpackage.lab
    public final synchronized void t(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.e = z;
    }

    @Override // defpackage.lab
    public final void v2(jab jabVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.b.I(jabVar);
    }

    @Override // defpackage.lab
    public final Bundle zzb() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        uqc uqcVar = this.d;
        return uqcVar != null ? uqcVar.h() : new Bundle();
    }

    @Override // defpackage.lab
    public final synchronized qkc zzc() {
        uqc uqcVar;
        if (((Boolean) pla.c().a(mpa.N6)).booleanValue() && (uqcVar = this.d) != null) {
            return uqcVar.c();
        }
        return null;
    }

    @Override // defpackage.lab
    public final synchronized String zzd() {
        uqc uqcVar = this.d;
        if (uqcVar == null || uqcVar.c() == null) {
            return null;
        }
        return uqcVar.c().zzg();
    }

    @Override // defpackage.lab
    public final void zze() {
        zzf(null);
    }

    @Override // defpackage.lab
    public final synchronized void zzf(ee3 ee3Var) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.b.t(null);
        if (this.d != null) {
            if (ee3Var != null) {
                context = (Context) fc5.Q1(ee3Var);
            }
            this.d.d().M0(context);
        }
    }

    @Override // defpackage.lab
    public final void zzh() {
        zzi(null);
    }

    @Override // defpackage.lab
    public final synchronized void zzi(ee3 ee3Var) {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.d != null) {
            this.d.d().N0(ee3Var == null ? null : (Context) fc5.Q1(ee3Var));
        }
    }

    @Override // defpackage.lab
    public final void zzj() {
        B(null);
    }

    @Override // defpackage.lab
    public final synchronized void zzq() {
        F(null);
    }

    @Override // defpackage.lab
    public final boolean zzs() {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return z6();
    }
}
