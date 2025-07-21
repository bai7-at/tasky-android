package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
final class urb implements nwc {
    private final Context a;
    private final vya b;
    private final gqb c;
    private final urb d = this;
    private final e4f e;
    private final e4f f;
    private final e4f g;
    private final e4f h;

    /* synthetic */ urb(gqb gqbVar, Context context, vya vyaVar, trb trbVar) {
        this.c = gqbVar;
        this.a = context;
        this.b = vyaVar;
        v3f a = w3f.a(this);
        this.e = a;
        v3f a2 = w3f.a(vyaVar);
        this.f = a2;
        jwc jwcVar = new jwc(a2);
        this.g = jwcVar;
        this.h = u3f.b(new lwc(a, jwcVar));
    }

    @Override // defpackage.nwc
    public final ewc zzb() {
        return new orb(this.c, this.d, null);
    }

    @Override // defpackage.nwc
    public final kwc zzd() {
        return (kwc) this.h.zzb();
    }
}
