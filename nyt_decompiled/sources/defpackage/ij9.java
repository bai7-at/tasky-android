package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class ij9 implements ca2 {
    private final p76 a;
    private final p76 b;
    private final p76 c;
    private final p76 d;

    public ij9(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4) {
        this.a = p76Var;
        this.b = p76Var2;
        this.c = p76Var3;
        this.d = p76Var4;
    }

    public static ij9 a(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4) {
        return new ij9(p76Var, p76Var2, p76Var3, p76Var4);
    }

    public static hj9 c(Executor executor, w42 w42Var, bk9 bk9Var, md8 md8Var) {
        return new hj9(executor, w42Var, bk9Var, md8Var);
    }

    @Override // defpackage.p76
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public hj9 get() {
        return c((Executor) this.a.get(), (w42) this.b.get(), (bk9) this.c.get(), (md8) this.d.get());
    }
}
