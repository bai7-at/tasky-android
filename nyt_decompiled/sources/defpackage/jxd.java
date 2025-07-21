package defpackage;

import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.n2;
import com.google.android.gms.internal.ads.o2;
import com.google.android.gms.internal.ads.p2;
import com.google.android.gms.internal.ads.s2;
import com.google.android.gms.internal.ads.v2;
import com.google.android.gms.internal.ads.vb;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzead;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class jxd implements gyd {
    private final gyd a;
    private final gyd b;
    private final f4e c;
    private final String d;
    private d6c e;
    private final Executor f;

    public jxd(gyd gydVar, gyd gydVar2, f4e f4eVar, String str, Executor executor) {
        this.a = gydVar;
        this.b = gydVar2;
        this.c = f4eVar;
        this.d = str;
        this.f = executor;
    }

    private final j64 f(s3e s3eVar, hyd hydVar) {
        d6c d6cVar = s3eVar.a;
        this.e = d6cVar;
        if (s3eVar.c != null) {
            if (d6cVar.zzf() != null) {
                s3eVar.c.f().s(s3eVar.a.zzf());
            }
            return zb.h(s3eVar.c);
        }
        d6cVar.zzb().l(s3eVar.b);
        return ((txd) this.a).c(hydVar, null, s3eVar.a);
    }

    @Override // defpackage.gyd
    public final /* bridge */ /* synthetic */ j64 a(hyd hydVar, fyd fydVar, Object obj) {
        return e(hydVar, fydVar, null);
    }

    @Override // defpackage.gyd
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized d6c zzd() {
        return this.e;
    }

    final /* synthetic */ j64 c(hyd hydVar, ixd ixdVar, fyd fydVar, d6c d6cVar, oxd oxdVar) {
        if (oxdVar != null) {
            ixd ixdVar2 = new ixd(ixdVar.a, ixdVar.b, ixdVar.c, ixdVar.d, ixdVar.e, ixdVar.f, oxdVar.a);
            if (oxdVar.c != null) {
                this.e = null;
                this.c.e(ixdVar2);
                return f(oxdVar.c, hydVar);
            }
            j64 a = this.c.a(ixdVar2);
            if (a != null) {
                this.e = null;
                return zb.n(a, new ake() { // from class: fxd
                    @Override // defpackage.ake
                    public final j64 zza(Object obj) {
                        return jxd.this.d((c4e) obj);
                    }
                }, this.f);
            }
            this.c.e(ixdVar2);
            hydVar = new hyd(hydVar.b, oxdVar.b);
        }
        j64 c = ((txd) this.a).c(hydVar, fydVar, d6cVar);
        this.e = d6cVar;
        return c;
    }

    final /* synthetic */ j64 d(c4e c4eVar) {
        e4e e4eVar;
        if (c4eVar == null || c4eVar.a == null || (e4eVar = c4eVar.b) == null) {
            throw new zzead(1, "Empty prefetch");
        }
        p2 L = v2.L();
        n2 L2 = o2.L();
        L2.q(2);
        L2.o(s2.N());
        L.n(L2);
        c4eVar.a.a.zzb().c().K((v2) L.i());
        return f(c4eVar.a, ((ixd) e4eVar).b);
    }

    public final synchronized j64 e(final hyd hydVar, final fyd fydVar, d6c d6cVar) {
        c6c a = fydVar.a(hydVar.b);
        a.j(new kxd(this.d));
        final d6c d6cVar2 = (d6c) a.zzh();
        d6cVar2.zzg();
        d6cVar2.zzg();
        zzl zzlVar = d6cVar2.zzg().d;
        if (zzlVar.zzs == null && zzlVar.zzx == null) {
            s1e zzg = d6cVar2.zzg();
            final ixd ixdVar = new ixd(fydVar, hydVar, zzg.d, zzg.f, this.f, zzg.j, null);
            return zb.n(vb.C(((pxd) this.b).c(hydVar, fydVar, d6cVar2)), new ake() { // from class: gxd
                @Override // defpackage.ake
                public final j64 zza(Object obj) {
                    return jxd.this.c(hydVar, ixdVar, fydVar, d6cVar2, (oxd) obj);
                }
            }, this.f);
        }
        this.e = d6cVar2;
        return ((txd) this.a).c(hydVar, fydVar, d6cVar2);
    }
}
