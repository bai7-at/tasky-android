package defpackage;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.s6;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzflg;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class g2c {
    private final n1d a;
    private final s1e b;
    private final s6 c;
    private final mub d;
    private final udd e;
    private final cdc f;
    private g1e g;
    private final u2d h;
    private final a6c i;
    private final Executor j;
    private final h2d k;
    private final k9d l;
    private final o3d m;
    private final v3d n;

    g2c(n1d n1dVar, s1e s1eVar, s6 s6Var, mub mubVar, udd uddVar, cdc cdcVar, g1e g1eVar, u2d u2dVar, a6c a6cVar, Executor executor, h2d h2dVar, k9d k9dVar, o3d o3dVar, v3d v3dVar) {
        this.a = n1dVar;
        this.b = s1eVar;
        this.c = s6Var;
        this.d = mubVar;
        this.e = uddVar;
        this.f = cdcVar;
        this.g = g1eVar;
        this.h = u2dVar;
        this.i = a6cVar;
        this.j = executor;
        this.k = h2dVar;
        this.l = k9dVar;
        this.m = o3dVar;
        this.n = v3dVar;
    }

    public final zze a(Throwable th) {
        return w2e.b(th, this.l);
    }

    public final cdc c() {
        return this.f;
    }

    final /* synthetic */ g1e d(g1e g1eVar) {
        this.d.a(g1eVar);
        return g1eVar;
    }

    public final j64 e(final zzfjc zzfjcVar) {
        h5e a = this.c.b(zzflg.GET_CACHE_KEY, this.i.c()).f(new ake() { // from class: c2c
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return g2c.this.f(zzfjcVar, (zzbze) obj);
            }
        }).a();
        zb.r(a, new e2c(this), this.j);
        return a;
    }

    final /* synthetic */ j64 f(zzfjc zzfjcVar, zzbze zzbzeVar) {
        zzbzeVar.zzi = zzfjcVar;
        return this.h.a(zzbzeVar);
    }

    final /* synthetic */ j64 g(j64 j64Var, j64 j64Var2, j64 j64Var3) {
        return this.n.c((zzbze) j64Var.get(), (JSONObject) j64Var2.get(), (v9b) j64Var3.get());
    }

    public final j64 h(zzbze zzbzeVar) {
        h5e a = this.c.b(zzflg.NOTIFY_CACHE_HIT, this.h.g(zzbzeVar)).a();
        zb.r(a, new f2c(this), this.j);
        return a;
    }

    public final j64 i(j64 j64Var) {
        w5e f = this.c.b(zzflg.RENDERER, j64Var).e(new f5e() { // from class: x1c
            @Override // defpackage.f5e
            public final Object zza(Object obj) {
                g1e g1eVar = (g1e) obj;
                g2c.this.d(g1eVar);
                return g1eVar;
            }
        }).f(this.e);
        if (!((Boolean) pla.c().a(mpa.v5)).booleanValue()) {
            f = f.i(((Integer) pla.c().a(mpa.x5)).intValue(), TimeUnit.SECONDS);
        }
        return f.a();
    }

    public final j64 j() {
        zzl zzlVar = this.b.d;
        if (zzlVar.zzx == null && zzlVar.zzs == null) {
            return k(this.i.c());
        }
        s6 s6Var = this.c;
        n1d n1dVar = this.a;
        return m5e.c(n1dVar.a(), zzflg.PRELOADED_LOADER, s6Var).a();
    }

    public final j64 k(final j64 j64Var) {
        g1e g1eVar = this.g;
        if (g1eVar != null) {
            return m5e.c(zb.h(g1eVar), zzflg.SERVER_TRANSACTION, this.c).a();
        }
        dyf.e().j();
        if (!((Boolean) pla.c().a(mpa.Va)).booleanValue() || ((Boolean) bsa.c.e()).booleanValue()) {
            w5e b = this.c.b(zzflg.SERVER_TRANSACTION, j64Var);
            final h2d h2dVar = this.k;
            Objects.requireNonNull(h2dVar);
            return b.f(new ake() { // from class: d2c
                @Override // defpackage.ake
                public final j64 zza(Object obj) {
                    return h2d.this.a((zzbze) obj);
                }
            }).a();
        }
        final o3d o3dVar = this.m;
        Objects.requireNonNull(o3dVar);
        final j64 n = zb.n(j64Var, new ake() { // from class: y1c
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return o3d.this.a((zzbze) obj);
            }
        }, this.j);
        w5e b2 = this.c.b(zzflg.BUILD_URL, n);
        final u2d u2dVar = this.h;
        Objects.requireNonNull(u2dVar);
        final h5e a = b2.f(new ake() { // from class: z1c
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return u2d.this.b((JSONObject) obj);
            }
        }).a();
        return this.c.a(zzflg.SERVER_TRANSACTION, j64Var, n, a).a(new Callable() { // from class: a2c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return g2c.this.g(j64Var, n, a);
            }
        }).f(new ake() { // from class: b2c
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return (j64) obj;
            }
        }).a();
    }

    public final void l(g1e g1eVar) {
        this.g = g1eVar;
    }
}
