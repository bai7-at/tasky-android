package defpackage;

/* loaded from: classes2.dex */
public final class js8 implements ca2 {
    private final p76 a;
    private final p76 b;
    private final p76 c;
    private final p76 d;
    private final p76 e;

    public js8(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5) {
        this.a = p76Var;
        this.b = p76Var2;
        this.c = p76Var3;
        this.d = p76Var4;
        this.e = p76Var5;
    }

    public static js8 a(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5) {
        return new js8(p76Var, p76Var2, p76Var3, p76Var4, p76Var5);
    }

    public static hs8 c(ul0 ul0Var, ul0 ul0Var2, fb7 fb7Var, py8 py8Var, hj9 hj9Var) {
        return new hs8(ul0Var, ul0Var2, fb7Var, py8Var, hj9Var);
    }

    @Override // defpackage.p76
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public hs8 get() {
        return c((ul0) this.a.get(), (ul0) this.b.get(), (fb7) this.c.get(), (py8) this.d.get(), (hj9) this.e.get());
    }
}
