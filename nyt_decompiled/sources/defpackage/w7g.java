package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;

/* loaded from: classes2.dex */
public final class w7g extends j7b {
    private final AdOverlayInfoParcel a;
    private final Activity b;
    private boolean c = false;
    private boolean d = false;
    private boolean e = false;

    public w7g(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.a = adOverlayInfoParcel;
        this.b = activity;
    }

    private final synchronized void zzb() {
        try {
            if (this.d) {
                return;
            }
            tof tofVar = this.a.zzc;
            if (tofVar != null) {
                tofVar.Q1(4);
            }
            this.d = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.k7b
    public final void B(ee3 ee3Var) {
    }

    @Override // defpackage.k7b
    public final void E4(int i, int i2, Intent intent) {
    }

    @Override // defpackage.k7b
    public final void H1(int i, String[] strArr, int[] iArr) {
    }

    @Override // defpackage.k7b
    public final void a() {
        tof tofVar = this.a.zzc;
        if (tofVar != null) {
            tofVar.h6();
        }
    }

    @Override // defpackage.k7b
    public final void c() {
        if (this.b.isFinishing()) {
            zzb();
        }
    }

    @Override // defpackage.k7b
    public final void e() {
        this.e = true;
    }

    @Override // defpackage.k7b
    public final void g() {
    }

    @Override // defpackage.k7b
    public final void j0(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.c);
    }

    @Override // defpackage.k7b
    public final boolean m() {
        return false;
    }

    @Override // defpackage.k7b
    public final void p2(Bundle bundle) {
        tof tofVar;
        if (((Boolean) pla.c().a(mpa.L8)).booleanValue() && !this.e) {
            this.b.requestWindowFeature(1);
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.a;
        if (adOverlayInfoParcel == null) {
            this.b.finish();
            return;
        }
        if (z) {
            this.b.finish();
            return;
        }
        if (bundle == null) {
            jq9 jq9Var = adOverlayInfoParcel.zzb;
            if (jq9Var != null) {
                jq9Var.v();
            }
            bgc bgcVar = this.a.zzu;
            if (bgcVar != null) {
                bgcVar.zzs();
            }
            if (this.b.getIntent() != null && this.b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (tofVar = this.a.zzc) != null) {
                tofVar.n4();
            }
        }
        Activity activity = this.b;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.a;
        dyf.j();
        zzc zzcVar = adOverlayInfoParcel2.zza;
        if (kq9.b(activity, zzcVar, adOverlayInfoParcel2.zzi, zzcVar.zzi)) {
            return;
        }
        this.b.finish();
    }

    @Override // defpackage.k7b
    public final void zzi() {
    }

    @Override // defpackage.k7b
    public final void zzm() {
        if (this.b.isFinishing()) {
            zzb();
        }
    }

    @Override // defpackage.k7b
    public final void zzo() {
        tof tofVar = this.a.zzc;
        if (tofVar != null) {
            tofVar.s4();
        }
        if (this.b.isFinishing()) {
            zzb();
        }
    }

    @Override // defpackage.k7b
    public final void zzq() {
    }

    @Override // defpackage.k7b
    public final void zzr() {
        if (this.c) {
            this.b.finish();
            return;
        }
        this.c = true;
        tof tofVar = this.a.zzc;
        if (tofVar != null) {
            tofVar.Y4();
        }
    }
}
