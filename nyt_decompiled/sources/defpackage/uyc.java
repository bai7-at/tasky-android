package defpackage;

/* loaded from: classes3.dex */
final class uyc extends r17 {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ yyc c;

    uyc(yyc yycVar, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = yycVar;
    }

    @Override // defpackage.p6
    public final void a(t64 t64Var) {
        String F6;
        yyc yycVar = this.c;
        F6 = yyc.F6(t64Var);
        yycVar.G6(F6, this.b);
    }

    @Override // defpackage.p6
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str = this.b;
        this.c.A6(this.a, (q17) obj, str);
    }
}
