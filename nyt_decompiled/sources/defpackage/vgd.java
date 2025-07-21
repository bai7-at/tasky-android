package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class vgd extends m3b {
    private final Context a;
    private final pqa b;
    private final s1e c;
    private final nyb d;
    private final ViewGroup e;
    private final zuc f;

    public vgd(Context context, pqa pqaVar, s1e s1eVar, nyb nybVar, zuc zucVar) {
        this.a = context;
        this.b = pqaVar;
        this.c = s1eVar;
        this.d = nybVar;
        this.f = zucVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View i = nybVar.i();
        dyf.r();
        frameLayout.addView(i, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzg().zzc);
        frameLayout.setMinimumWidth(zzg().zzf);
        this.e = frameLayout;
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
        yhd yhdVar = this.c.c;
        if (yhdVar != null) {
            yhdVar.K(ucbVar);
        }
    }

    @Override // defpackage.q4b
    public final void G4(String str) {
    }

    @Override // defpackage.q4b
    public final void I5(boolean z) {
    }

    @Override // defpackage.q4b
    public final void J3(qqa qqaVar) {
        fgb.f("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // defpackage.q4b
    public final void K4(pqa pqaVar) {
        fgb.f("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // defpackage.q4b
    public final void N5(koa koaVar) {
        fgb.f("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // defpackage.q4b
    public final void O3(String str) {
    }

    @Override // defpackage.q4b
    public final boolean T() {
        return false;
    }

    @Override // defpackage.q4b
    public final void T5(cma cmaVar) {
    }

    @Override // defpackage.q4b
    public final boolean V() {
        return false;
    }

    @Override // defpackage.q4b
    public final void V1(fhb fhbVar) {
        fgb.f("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // defpackage.q4b
    public final void W0(zzdu zzduVar) {
    }

    @Override // defpackage.q4b
    public final void W2(zcc zccVar) {
        if (!((Boolean) pla.c().a(mpa.Ya)).booleanValue()) {
            fgb.f("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        yhd yhdVar = this.c.c;
        if (yhdVar != null) {
            try {
                if (!zccVar.zzf()) {
                    this.f.e();
                }
            } catch (RemoteException e) {
                fgb.c("Error in making CSI ping for reporting paid event callback", e);
            }
            yhdVar.I(zccVar);
        }
    }

    @Override // defpackage.q4b
    public final void e() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.d.a();
    }

    @Override // defpackage.q4b
    public final void e3(x7b x7bVar) {
    }

    @Override // defpackage.q4b
    public final void e5(r8b r8bVar) {
        fgb.f("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // defpackage.q4b
    public final String g() {
        if (this.d.c() != null) {
            return this.d.c().zzg();
        }
        return null;
    }

    @Override // defpackage.q4b
    public final void g1() {
    }

    @Override // defpackage.q4b
    public final void i4(ukb ukbVar) {
    }

    @Override // defpackage.q4b
    public final void n3(zzfk zzfkVar) {
        fgb.f("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // defpackage.q4b
    public final void o() {
        this.d.m();
    }

    @Override // defpackage.q4b
    public final boolean p3(zzl zzlVar) {
        fgb.f("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // defpackage.q4b
    public final void q6(boolean z) {
        fgb.f("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // defpackage.q4b
    public final void r6(a8b a8bVar, String str) {
    }

    @Override // defpackage.q4b
    public final void s5(ee3 ee3Var) {
    }

    @Override // defpackage.q4b
    public final void v() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.d.d().O0(null);
    }

    @Override // defpackage.q4b
    public final void x5(zzq zzqVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        nyb nybVar = this.d;
        if (nybVar != null) {
            nybVar.n(this.e, zzqVar);
        }
    }

    @Override // defpackage.q4b
    public final void z() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.d.d().N0(null);
    }

    @Override // defpackage.q4b
    public final Bundle zzd() {
        fgb.f("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // defpackage.q4b
    public final zzq zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        return y1e.a(this.a, Collections.singletonList(this.d.k()));
    }

    @Override // defpackage.q4b
    public final pqa zzi() {
        return this.b;
    }

    @Override // defpackage.q4b
    public final ucb zzj() {
        return this.c.n;
    }

    @Override // defpackage.q4b
    public final qkc zzk() {
        return this.d.c();
    }

    @Override // defpackage.q4b
    public final znc zzl() {
        return this.d.j();
    }

    @Override // defpackage.q4b
    public final ee3 zzn() {
        return fc5.l3(this.e);
    }

    @Override // defpackage.q4b
    public final String zzr() {
        return this.c.f;
    }

    @Override // defpackage.q4b
    public final String zzs() {
        if (this.d.c() != null) {
            return this.d.c().zzg();
        }
        return null;
    }
}
