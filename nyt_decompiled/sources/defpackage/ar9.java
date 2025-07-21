package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzabn;
import com.google.android.gms.internal.ads.zzdl;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class ar9 implements ut9, okc, ns9 {
    private static final Executor n = new Executor() { // from class: d9g
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
        }
    };
    private final Context a;
    private final ksb b;
    private final vr9 c;
    private final ps9 d;
    private acd e;
    private pr9 f;
    private kod g;
    private t9g h;
    private List i;
    private Pair j;
    private final rt9 k;
    private final Executor l;
    private int m;

    /* synthetic */ ar9(f9g f9gVar, yq9 yq9Var) {
        Context context;
        ksb ksbVar;
        vr9 vr9Var;
        context = f9gVar.a;
        this.a = context;
        ksbVar = f9gVar.c;
        wad.b(ksbVar);
        this.b = ksbVar;
        vr9Var = f9gVar.d;
        wad.b(vr9Var);
        this.c = vr9Var;
        this.d = new ps9(this, vr9Var);
        this.e = acd.a;
        this.k = rt9.a;
        this.l = n;
        this.m = 0;
    }

    @Override // defpackage.ut9
    public final void d(l6a l6aVar) {
        ayf ayfVar;
        int i;
        wad.f(this.m == 0);
        wad.b(this.i);
        acd acdVar = this.e;
        Looper myLooper = Looper.myLooper();
        wad.b(myLooper);
        this.g = acdVar.a(myLooper, null);
        ayf ayfVar2 = l6aVar.x;
        if (ayfVar2 == null || ((i = ayfVar2.c) != 7 && i != 6)) {
            ayfVar2 = ayf.h;
        }
        ayf ayfVar3 = ayfVar2;
        if (ayfVar3.c == 7) {
            zuf c = ayfVar3.c();
            c.d(6);
            ayfVar = c.g();
        } else {
            ayfVar = ayfVar3;
        }
        try {
            ksb ksbVar = this.b;
            Context context = this.a;
            d2g d2gVar = d2g.a;
            final kod kodVar = this.g;
            Objects.requireNonNull(kodVar);
            ksbVar.a(context, ayfVar3, ayfVar, d2gVar, this, new Executor() { // from class: c9g
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    kod.this.e(runnable);
                }
            }, zzgaa.t(), 0L);
            Pair pair = this.j;
            if (pair != null) {
                dae daeVar = (dae) pair.second;
                daeVar.b();
                daeVar.a();
            }
            this.h = new t9g(this.a, this, null);
            Pair pair2 = this.j;
            if (pair2 == null) {
                this.i.getClass();
                throw null;
            }
            dae daeVar2 = (dae) pair2.second;
            wad.b(null);
            daeVar2.b();
            daeVar2.a();
            throw null;
        } catch (zzdl e) {
            throw new zzabn(e, l6aVar);
        }
    }

    @Override // defpackage.ut9
    public final void e(List list) {
        this.i = list;
        if (zzk()) {
            wad.b(this.h);
            throw null;
        }
    }

    @Override // defpackage.ut9
    public final void f(pr9 pr9Var) {
        this.f = pr9Var;
    }

    @Override // defpackage.ut9
    public final void g(long j) {
        wad.b(this.h);
        throw null;
    }

    @Override // defpackage.ut9
    public final void h(acd acdVar) {
        wad.f(!zzk());
        this.e = acdVar;
    }

    @Override // defpackage.ut9
    public final void i(Surface surface, dae daeVar) {
        Pair pair = this.j;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((dae) this.j.second).equals(daeVar)) {
            return;
        }
        this.j = Pair.create(surface, daeVar);
        daeVar.b();
        daeVar.a();
    }

    @Override // defpackage.ut9
    public final vr9 zza() {
        return this.c;
    }

    @Override // defpackage.ut9
    public final tt9 zzb() {
        t9g t9gVar = this.h;
        wad.b(t9gVar);
        return t9gVar;
    }

    @Override // defpackage.ut9
    public final void zzc() {
        dae daeVar = dae.c;
        daeVar.b();
        daeVar.a();
        this.j = null;
    }

    @Override // defpackage.ut9
    public final void zze() {
        if (this.m == 2) {
            return;
        }
        kod kodVar = this.g;
        if (kodVar != null) {
            kodVar.a(null);
        }
        this.j = null;
        this.m = 2;
    }

    @Override // defpackage.ut9
    public final boolean zzk() {
        return this.m == 1;
    }
}
