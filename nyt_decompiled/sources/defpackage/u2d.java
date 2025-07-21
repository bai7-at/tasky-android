package defpackage;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.internal.ads.vb;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzecf;
import java.io.InputStream;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class u2d {
    private final kke a;
    private final y1d b;
    private final l3f c;
    private final v7e d;
    private final Context e;
    private final zzcei f;

    public u2d(kke kkeVar, y1d y1dVar, l3f l3fVar, v7e v7eVar, Context context, zzcei zzceiVar) {
        this.a = kkeVar;
        this.b = y1dVar;
        this.c = l3fVar;
        this.d = v7eVar;
        this.e = context;
        this.f = zzceiVar;
    }

    private final j64 h(final zzbze zzbzeVar, t2d t2dVar, final t2d t2dVar2, final ake akeVar) {
        j64 f;
        String str = zzbzeVar.zzd;
        dyf.r();
        if (wxf.b(str)) {
            f = zb.g(new zzecf(1));
        } else {
            f = zb.f(t2dVar.a(zzbzeVar), ExecutionException.class, new ake() { // from class: s2d
                @Override // defpackage.ake
                public final j64 zza(Object obj) {
                    Throwable th = (ExecutionException) obj;
                    if (th.getCause() != null) {
                        th = th.getCause();
                    }
                    return zb.g(th);
                }
            }, this.a);
        }
        return zb.f(zb.n(vb.C(f), akeVar, this.a), zzecf.class, new ake() { // from class: r2d
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return u2d.this.c(t2dVar2, zzbzeVar, akeVar, (zzecf) obj);
            }
        }, this.a);
    }

    public final j64 a(final zzbze zzbzeVar) {
        ake akeVar = new ake() { // from class: o2d
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                String str = new String(cje.b((InputStream) obj), ege.c);
                zzbze zzbzeVar2 = zzbze.this;
                zzbzeVar2.zzj = str;
                return zb.h(zzbzeVar2);
            }
        };
        final y1d y1dVar = this.b;
        Objects.requireNonNull(y1dVar);
        return h(zzbzeVar, new t2d() { // from class: p2d
            @Override // defpackage.t2d
            public final j64 a(zzbze zzbzeVar2) {
                return y1d.this.b(zzbzeVar2);
            }
        }, new t2d() { // from class: q2d
            @Override // defpackage.t2d
            public final j64 a(zzbze zzbzeVar2) {
                return u2d.this.d(zzbzeVar2);
            }
        }, akeVar);
    }

    public final j64 b(JSONObject jSONObject) {
        return zb.n(vb.C(zb.h(jSONObject)), dyf.h().a(this.e, this.f, this.d).a("AFMA_getAdDictionary", b2b.b, new w1b() { // from class: k2d
            @Override // defpackage.w1b
            public final Object a(JSONObject jSONObject2) {
                return new v9b(jSONObject2);
            }
        }), this.a);
    }

    final /* synthetic */ j64 c(t2d t2dVar, zzbze zzbzeVar, ake akeVar, zzecf zzecfVar) {
        return zb.n(t2dVar.a(zzbzeVar), akeVar, this.a);
    }

    final /* synthetic */ j64 d(zzbze zzbzeVar) {
        return ((y4d) this.c.zzb()).w6(zzbzeVar, Binder.getCallingUid());
    }

    final /* synthetic */ j64 e(zzbze zzbzeVar) {
        return this.b.c(zzbzeVar.zzh);
    }

    final /* synthetic */ j64 f(zzbze zzbzeVar) {
        return ((y4d) this.c.zzb()).z6(zzbzeVar.zzh);
    }

    public final j64 g(zzbze zzbzeVar) {
        return h(zzbzeVar, new t2d() { // from class: m2d
            @Override // defpackage.t2d
            public final j64 a(zzbze zzbzeVar2) {
                return u2d.this.e(zzbzeVar2);
            }
        }, new t2d() { // from class: n2d
            @Override // defpackage.t2d
            public final j64 a(zzbze zzbzeVar2) {
                return u2d.this.f(zzbzeVar2);
            }
        }, new ake() { // from class: l2d
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return zb.h(null);
            }
        });
    }
}
