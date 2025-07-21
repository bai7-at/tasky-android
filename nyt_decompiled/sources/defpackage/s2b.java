package defpackage;

import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzbrm;

/* loaded from: classes3.dex */
public final class s2b {
    private final r1b a;
    private j64 b;

    s2b(r1b r1bVar) {
        this.a = r1bVar;
    }

    private final void d() {
        if (this.b == null) {
            final ugb ugbVar = new ugb();
            this.b = ugbVar;
            this.a.b(null).e(new ygb() { // from class: p2b
                @Override // defpackage.ygb
                public final void zza(Object obj) {
                    ugb.this.c((s1b) obj);
                }
            }, new wgb() { // from class: q2b
                @Override // defpackage.wgb
                public final void zza() {
                    ugb.this.d(new zzbrm("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final v2b a(String str, x1b x1bVar, w1b w1bVar) {
        d();
        return new v2b(this.b, "google.afma.activeView.handleUpdate", x1bVar, w1bVar);
    }

    public final void b(final String str, final uxa uxaVar) {
        d();
        this.b = zb.n(this.b, new ake() { // from class: r2b
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                s1b s1bVar = (s1b) obj;
                s1bVar.E0(str, uxaVar);
                return zb.h(s1bVar);
            }
        }, pgb.f);
    }

    public final void c(final String str, final uxa uxaVar) {
        this.b = zb.m(this.b, new gge() { // from class: o2b
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                s1b s1bVar = (s1b) obj;
                s1bVar.z0(str, uxaVar);
                return s1bVar;
            }
        }, pgb.f);
    }
}
