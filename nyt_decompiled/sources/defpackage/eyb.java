package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.zzdkv;

/* loaded from: classes3.dex */
public final class eyb extends u0c {
    private final wlb j;
    private final int k;
    private final Context l;
    private final txb m;
    private final iic n;
    private final bfc o;
    private final m7c p;
    private final boolean q;
    private final nfb r;
    private boolean s;

    eyb(t0c t0cVar, Context context, wlb wlbVar, int i, txb txbVar, iic iicVar, bfc bfcVar, m7c m7cVar, nfb nfbVar) {
        super(t0cVar);
        this.s = false;
        this.j = wlbVar;
        this.l = context;
        this.k = i;
        this.m = txbVar;
        this.n = iicVar;
        this.o = bfcVar;
        this.p = m7cVar;
        this.q = ((Boolean) pla.c().a(mpa.k5)).booleanValue();
        this.r = nfbVar;
    }

    @Override // defpackage.u0c
    public final void a() {
        super.a();
        wlb wlbVar = this.j;
        if (wlbVar != null) {
            wlbVar.destroy();
        }
    }

    public final int h() {
        return this.k;
    }

    public final void i(tla tlaVar) {
        wlb wlbVar = this.j;
        if (wlbVar != null) {
            wlbVar.m0(tlaVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [android.content.Context] */
    public final void j(Activity activity, gma gmaVar, boolean z) {
        wlb wlbVar;
        v0e b;
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.l;
        }
        if (this.q) {
            this.o.zzb();
        }
        if (((Boolean) pla.c().a(mpa.B0)).booleanValue()) {
            dyf.r();
            if (wxf.f(activity2)) {
                fgb.g("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.p.zzb();
                if (((Boolean) pla.c().a(mpa.C0)).booleanValue()) {
                    new gbe(activity2.getApplicationContext(), dyf.v().b()).a(this.a.b.b.b);
                    return;
                }
                return;
            }
        }
        if (((Boolean) pla.c().a(mpa.lb)).booleanValue() && (wlbVar = this.j) != null && (b = wlbVar.b()) != null && b.r0 && b.s0 != this.r.b()) {
            fgb.g("The app open consent form has been shown.");
            this.p.k(w2e.d(12, "The consent form has already been shown.", null));
            return;
        }
        if (this.s) {
            fgb.g("App open interstitial ad is already visible.");
            this.p.k(w2e.d(10, null, null));
        }
        if (this.s) {
            return;
        }
        try {
            this.n.a(z, activity2, this.p);
            if (this.q) {
                this.o.zza();
            }
            this.s = true;
        } catch (zzdkv e) {
            this.p.l(e);
        }
    }

    public final void k(long j, int i) {
        this.m.a(j, i);
    }
}
