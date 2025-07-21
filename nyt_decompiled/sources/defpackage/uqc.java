package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzdkv;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class uqc extends u0c {
    private final Context j;
    private final WeakReference k;
    private final iic l;
    private final bfc m;
    private final m7c n;
    private final x8c o;
    private final t1c p;
    private final zbb q;
    private final gbe r;
    private final l1e s;
    private boolean t;

    uqc(t0c t0cVar, Context context, wlb wlbVar, iic iicVar, bfc bfcVar, m7c m7cVar, x8c x8cVar, t1c t1cVar, v0e v0eVar, gbe gbeVar, l1e l1eVar) {
        super(t0cVar);
        this.t = false;
        this.j = context;
        this.l = iicVar;
        this.k = new WeakReference(wlbVar);
        this.m = bfcVar;
        this.n = m7cVar;
        this.o = x8cVar;
        this.p = t1cVar;
        this.r = gbeVar;
        zzcag zzcagVar = v0eVar.m;
        this.q = new xcb(zzcagVar != null ? zzcagVar.zza : "", zzcagVar != null ? zzcagVar.zzb : 1);
        this.s = l1eVar;
    }

    public final void finalize() {
        try {
            final wlb wlbVar = (wlb) this.k.get();
            if (((Boolean) pla.c().a(mpa.L6)).booleanValue()) {
                if (!this.t && wlbVar != null) {
                    pgb.e.execute(new Runnable() { // from class: tqc
                        @Override // java.lang.Runnable
                        public final void run() {
                            wlb.this.destroy();
                        }
                    });
                }
            } else if (wlbVar != null) {
                wlbVar.destroy();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final Bundle h() {
        return this.o.M0();
    }

    public final zbb i() {
        return this.q;
    }

    public final l1e j() {
        return this.s;
    }

    public final boolean k() {
        return this.p.a();
    }

    public final boolean l() {
        return this.t;
    }

    public final boolean m() {
        wlb wlbVar = (wlb) this.k.get();
        return (wlbVar == null || wlbVar.S()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.content.Context] */
    public final boolean n(boolean z, Activity activity) {
        if (((Boolean) pla.c().a(mpa.B0)).booleanValue()) {
            dyf.r();
            if (wxf.f(this.j)) {
                fgb.g("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.n.zzb();
                if (((Boolean) pla.c().a(mpa.C0)).booleanValue()) {
                    this.r.a(this.a.b.b.b);
                }
                return false;
            }
        }
        if (this.t) {
            fgb.g("The rewarded ad have been showed.");
            this.n.k(w2e.d(10, null, null));
            return false;
        }
        this.t = true;
        this.m.zzb();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.j;
        }
        try {
            this.l.a(z, activity2, this.n);
            this.m.zza();
            return true;
        } catch (zzdkv e) {
            this.n.l(e);
            return false;
        }
    }
}
