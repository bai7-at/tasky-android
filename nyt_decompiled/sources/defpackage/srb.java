package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
final class srb implements mwc {
    private final gqb a;
    private Context b;
    private vya c;

    /* synthetic */ srb(gqb gqbVar, rrb rrbVar) {
        this.a = gqbVar;
    }

    @Override // defpackage.mwc
    public final /* synthetic */ mwc a(vya vyaVar) {
        vyaVar.getClass();
        this.c = vyaVar;
        return this;
    }

    @Override // defpackage.mwc
    public final /* synthetic */ mwc b(Context context) {
        context.getClass();
        this.b = context;
        return this;
    }

    @Override // defpackage.mwc
    public final nwc zzc() {
        d4f.c(this.b, Context.class);
        d4f.c(this.c, vya.class);
        return new urb(this.a, this.b, this.c, null);
    }
}
