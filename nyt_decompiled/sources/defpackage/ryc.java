package defpackage;

/* loaded from: classes3.dex */
final class ryc extends o6 {
    final /* synthetic */ String a;
    final /* synthetic */ a8 b;
    final /* synthetic */ String c;
    final /* synthetic */ yyc d;

    ryc(yyc yycVar, String str, a8 a8Var, String str2) {
        this.a = str;
        this.b = a8Var;
        this.c = str2;
        this.d = yycVar;
    }

    @Override // defpackage.o6
    public final void n(t64 t64Var) {
        String F6;
        yyc yycVar = this.d;
        F6 = yyc.F6(t64Var);
        yycVar.G6(F6, this.c);
    }

    @Override // defpackage.o6
    public final void t() {
        this.d.A6(this.a, this.b, this.c);
    }
}
