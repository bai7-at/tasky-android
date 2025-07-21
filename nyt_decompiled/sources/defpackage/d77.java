package defpackage;

/* loaded from: classes2.dex */
public final class d77 implements ca2 {
    private final p76 a;
    private final p76 b;
    private final p76 c;
    private final p76 d;
    private final p76 e;

    public d77(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5) {
        this.a = p76Var;
        this.b = p76Var2;
        this.c = p76Var3;
        this.d = p76Var4;
        this.e = p76Var5;
    }

    public static d77 a(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5) {
        return new d77(p76Var, p76Var2, p76Var3, p76Var4, p76Var5);
    }

    public static c77 c(ul0 ul0Var, ul0 ul0Var2, Object obj, Object obj2, p76 p76Var) {
        return new c77(ul0Var, ul0Var2, (x42) obj, (wb7) obj2, p76Var);
    }

    @Override // defpackage.p76
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c77 get() {
        return c((ul0) this.a.get(), (ul0) this.b.get(), this.c.get(), this.d.get(), this.e);
    }
}
