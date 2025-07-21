package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.zzdkv;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class ygc extends u0c {
    private final Context j;
    private final WeakReference k;
    private final bfc l;
    private final iic m;
    private final t1c n;
    private final gbe o;
    private final m7c p;
    private final nfb q;
    private boolean r;

    ygc(t0c t0cVar, Context context, wlb wlbVar, bfc bfcVar, iic iicVar, t1c t1cVar, gbe gbeVar, m7c m7cVar, nfb nfbVar) {
        super(t0cVar);
        this.r = false;
        this.j = context;
        this.k = new WeakReference(wlbVar);
        this.l = bfcVar;
        this.m = iicVar;
        this.n = t1cVar;
        this.o = gbeVar;
        this.p = m7cVar;
        this.q = nfbVar;
    }

    public final void finalize() {
        try {
            final wlb wlbVar = (wlb) this.k.get();
            if (((Boolean) pla.c().a(mpa.L6)).booleanValue()) {
                if (!this.r && wlbVar != null) {
                    pgb.e.execute(new Runnable() { // from class: xgc
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

    public final boolean h() {
        return this.n.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.content.Context] */
    public final boolean i(boolean z, Activity activity) {
        v0e b;
        this.l.zzb();
        if (((Boolean) pla.c().a(mpa.B0)).booleanValue()) {
            dyf.r();
            if (wxf.f(this.j)) {
                fgb.g("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.p.zzb();
                if (((Boolean) pla.c().a(mpa.C0)).booleanValue()) {
                    this.o.a(this.a.b.b.b);
                }
                return false;
            }
        }
        wlb wlbVar = (wlb) this.k.get();
        if (!((Boolean) pla.c().a(mpa.lb)).booleanValue() || wlbVar == null || (b = wlbVar.b()) == null || !b.r0 || b.s0 == this.q.b()) {
            if (this.r) {
                fgb.g("The interstitial ad has been shown.");
                this.p.k(w2e.d(10, null, null));
            }
            Activity activity2 = activity;
            if (!this.r) {
                if (activity == null) {
                    activity2 = this.j;
                }
                try {
                    this.m.a(z, activity2, this.p);
                    this.l.zza();
                    this.r = true;
                    return true;
                } catch (zzdkv e) {
                    this.p.l(e);
                }
            }
        } else {
            fgb.g("The interstitial consent form has been shown.");
            this.p.k(w2e.d(12, "The consent form has already been shown.", null));
        }
        return false;
    }
}
