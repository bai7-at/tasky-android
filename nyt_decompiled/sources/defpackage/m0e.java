package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzcbb;
import com.google.android.gms.internal.ads.zzcei;

/* loaded from: classes3.dex */
public final class m0e extends bcb {
    private final e0e a;
    private final uzd b;
    private final String c;
    private final h1e d;
    private final Context e;
    private final zzcei f;
    private final gfa g;
    private final zuc h;
    private uqc i;
    private boolean j = ((Boolean) pla.c().a(mpa.D0)).booleanValue();

    public m0e(String str, e0e e0eVar, Context context, uzd uzdVar, h1e h1eVar, zzcei zzceiVar, gfa gfaVar, zuc zucVar) {
        this.c = str;
        this.a = e0eVar;
        this.b = uzdVar;
        this.d = h1eVar;
        this.e = context;
        this.f = zzceiVar;
        this.g = gfaVar;
        this.h = zucVar;
    }

    private final synchronized void A6(zzl zzlVar, jcb jcbVar, int i) {
        try {
            boolean z = false;
            if (((Boolean) ora.l.e()).booleanValue()) {
                if (((Boolean) pla.c().a(mpa.Ga)).booleanValue()) {
                    z = true;
                }
            }
            if (this.f.zzc < ((Integer) pla.c().a(mpa.Ha)).intValue() || !z) {
                Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
            }
            this.b.E(jcbVar);
            dyf.r();
            if (wxf.g(this.e) && zzlVar.zzs == null) {
                fgb.d("Failed to load the ad because app ID is missing.");
                this.b.n(w2e.d(4, null, null));
                return;
            }
            if (this.i != null) {
                return;
            }
            wzd wzdVar = new wzd(null);
            this.a.i(i);
            this.a.a(zzlVar, this.c, wzdVar, new l0e(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.ccb
    public final synchronized void A4(ee3 ee3Var, boolean z) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.i == null) {
            fgb.g("Rewarded can not be shown before loaded");
            this.b.k(w2e.d(9, null, null));
            return;
        }
        if (((Boolean) pla.c().a(mpa.z2)).booleanValue()) {
            this.g.c().d(new Throwable().getStackTrace());
        }
        this.i.n(z, (Activity) fc5.Q1(ee3Var));
    }

    @Override // defpackage.ccb
    public final synchronized void K1(zzl zzlVar, jcb jcbVar) {
        A6(zzlVar, jcbVar, 3);
    }

    @Override // defpackage.ccb
    public final void U1(j9c j9cVar) {
        if (j9cVar == null) {
            this.b.t(null);
        } else {
            this.b.t(new k0e(this, j9cVar));
        }
    }

    @Override // defpackage.ccb
    public final void U4(kcb kcbVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.b.K(kcbVar);
    }

    @Override // defpackage.ccb
    public final void i2(fcb fcbVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.b.x(fcbVar);
    }

    @Override // defpackage.ccb
    public final synchronized void m2(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.j = z;
    }

    @Override // defpackage.ccb
    public final synchronized void p1(zzl zzlVar, jcb jcbVar) {
        A6(zzlVar, jcbVar, 2);
    }

    @Override // defpackage.ccb
    public final void t6(zcc zccVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zccVar.zzf()) {
                this.h.e();
            }
        } catch (RemoteException e) {
            fgb.c("Error in making CSI ping for reporting paid event callback", e);
        }
        this.b.v(zccVar);
    }

    @Override // defpackage.ccb
    public final synchronized void u3(zzcbb zzcbbVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        h1e h1eVar = this.d;
        h1eVar.a = zzcbbVar.zza;
        h1eVar.b = zzcbbVar.zzb;
    }

    @Override // defpackage.ccb
    public final Bundle zzb() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        uqc uqcVar = this.i;
        return uqcVar != null ? uqcVar.h() : new Bundle();
    }

    @Override // defpackage.ccb
    public final qkc zzc() {
        uqc uqcVar;
        if (((Boolean) pla.c().a(mpa.N6)).booleanValue() && (uqcVar = this.i) != null) {
            return uqcVar.c();
        }
        return null;
    }

    @Override // defpackage.ccb
    public final zbb zzd() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        uqc uqcVar = this.i;
        if (uqcVar != null) {
            return uqcVar.i();
        }
        return null;
    }

    @Override // defpackage.ccb
    public final synchronized String zze() {
        uqc uqcVar = this.i;
        if (uqcVar == null || uqcVar.c() == null) {
            return null;
        }
        return uqcVar.c().zzg();
    }

    @Override // defpackage.ccb
    public final synchronized void zzm(ee3 ee3Var) {
        A4(ee3Var, this.j);
    }

    @Override // defpackage.ccb
    public final boolean zzo() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        uqc uqcVar = this.i;
        return (uqcVar == null || uqcVar.l()) ? false : true;
    }
}
