package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
final class oqb implements gvd {
    private final gqb a;
    private Context b;
    private String c;

    /* synthetic */ oqb(gqb gqbVar, nqb nqbVar) {
        this.a = gqbVar;
    }

    @Override // defpackage.gvd
    public final /* synthetic */ gvd a(String str) {
        str.getClass();
        this.c = str;
        return this;
    }

    @Override // defpackage.gvd
    public final /* synthetic */ gvd b(Context context) {
        context.getClass();
        this.b = context;
        return this;
    }

    @Override // defpackage.gvd
    public final hvd zzc() {
        d4f.c(this.b, Context.class);
        d4f.c(this.c, String.class);
        return new qqb(this.a, this.b, this.c, null);
    }
}
