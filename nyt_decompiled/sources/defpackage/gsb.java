package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
final class gsb implements o0e {
    private final gqb a;
    private Context b;
    private String c;

    /* synthetic */ gsb(gqb gqbVar, fsb fsbVar) {
        this.a = gqbVar;
    }

    @Override // defpackage.o0e
    public final /* synthetic */ o0e a(String str) {
        this.c = str;
        return this;
    }

    @Override // defpackage.o0e
    public final /* synthetic */ o0e b(Context context) {
        context.getClass();
        this.b = context;
        return this;
    }

    @Override // defpackage.o0e
    public final p0e zzc() {
        d4f.c(this.b, Context.class);
        return new isb(this.a, this.b, this.c, null);
    }
}
