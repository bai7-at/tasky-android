package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
final class isb implements p0e {
    private final gqb a;
    private final isb b = this;
    private final e4f c;
    private final e4f d;
    private final e4f e;
    private final e4f f;
    private final e4f g;
    private final e4f h;
    private final e4f i;
    private final e4f j;

    /* synthetic */ isb(gqb gqbVar, Context context, String str, hsb hsbVar) {
        e4f e4fVar;
        e4f e4fVar2;
        e4f e4fVar3;
        e4f e4fVar4;
        e4f e4fVar5;
        e4f e4fVar6;
        e4f e4fVar7;
        e4f e4fVar8;
        this.a = gqbVar;
        v3f a = w3f.a(context);
        this.c = a;
        e4fVar = gqbVar.J0;
        e4fVar2 = gqbVar.K0;
        jyd jydVar = new jyd(a, e4fVar, e4fVar2);
        this.d = jydVar;
        e4fVar3 = gqbVar.J0;
        e4f b = u3f.b(new vzd(e4fVar3));
        this.e = b;
        e4f b2 = u3f.b(p1e.a());
        this.f = b2;
        e4fVar4 = gqbVar.p;
        e4fVar5 = gqbVar.V;
        e4f b3 = u3f.b(new j0e(a, e4fVar4, e4fVar5, jydVar, b, u1e.a(), b2));
        this.g = b3;
        this.h = u3f.b(new t0e(b3, b, b2));
        v3f b4 = w3f.b(str);
        this.i = b4;
        e4fVar6 = gqbVar.i;
        e4fVar7 = gqbVar.W;
        e4fVar8 = gqbVar.a0;
        this.j = u3f.b(new n0e(b4, b3, a, b, b2, e4fVar6, e4fVar7, e4fVar8));
    }

    @Override // defpackage.p0e
    public final m0e zza() {
        return (m0e) this.j.zzb();
    }

    @Override // defpackage.p0e
    public final s0e zzb() {
        return (s0e) this.h.zzb();
    }
}
