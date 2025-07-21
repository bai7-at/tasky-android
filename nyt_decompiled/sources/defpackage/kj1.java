package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class kj1 implements ca2 {
    private final p76 a;
    private final p76 b;
    private final p76 c;
    private final p76 d;
    private final p76 e;

    public kj1(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5) {
        this.a = p76Var;
        this.b = p76Var2;
        this.c = p76Var3;
        this.d = p76Var4;
        this.e = p76Var5;
    }

    public static kj1 a(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5) {
        return new kj1(p76Var, p76Var2, p76Var3, p76Var4, p76Var5);
    }

    public static jj1 c(Executor executor, o30 o30Var, bk9 bk9Var, w42 w42Var, md8 md8Var) {
        return new jj1(executor, o30Var, bk9Var, w42Var, md8Var);
    }

    @Override // defpackage.p76
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public jj1 get() {
        return c((Executor) this.a.get(), (o30) this.b.get(), (bk9) this.c.get(), (w42) this.d.get(), (md8) this.e.get());
    }
}
