package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
final class qqb implements hvd {
    private final gqb a;
    private final qqb b = this;
    private final e4f c;
    private final e4f d;
    private final e4f e;
    private final e4f f;
    private final e4f g;
    private final e4f h;

    /* synthetic */ qqb(gqb gqbVar, Context context, String str, pqb pqbVar) {
        e4f e4fVar;
        e4f e4fVar2;
        e4f e4fVar3;
        e4f e4fVar4;
        e4f e4fVar5;
        e4f e4fVar6;
        e4f e4fVar7;
        e4f e4fVar8;
        e4f e4fVar9;
        this.a = gqbVar;
        v3f a = w3f.a(context);
        this.c = a;
        v3f a2 = w3f.a(str);
        this.d = a2;
        e4fVar = gqbVar.J0;
        e4fVar2 = gqbVar.K0;
        iyd iydVar = new iyd(a, e4fVar, e4fVar2);
        this.e = iydVar;
        e4fVar3 = gqbVar.J0;
        e4f b = u3f.b(new iwd(e4fVar3));
        this.f = b;
        e4fVar4 = gqbVar.p;
        e4fVar5 = gqbVar.V;
        u1e a3 = u1e.a();
        e4fVar6 = gqbVar.i;
        e4f b2 = u3f.b(new kwd(a, e4fVar4, e4fVar5, iydVar, b, a3, e4fVar6));
        this.g = b2;
        e4fVar7 = gqbVar.V;
        e4fVar8 = gqbVar.i;
        e4fVar9 = gqbVar.a0;
        this.h = u3f.b(new qwd(e4fVar7, a, a2, b2, b, e4fVar8, e4fVar9));
    }

    @Override // defpackage.hvd
    public final pwd zza() {
        return (pwd) this.h.zzb();
    }
}
