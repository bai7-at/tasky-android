package defpackage;

/* loaded from: classes.dex */
public interface w04 {
    boolean a();

    int b();

    int c();

    default float d() {
        return b() + (c() * 500);
    }

    hn0 e();

    Object f(int i, by0 by0Var);

    Object g(float f, by0 by0Var);

    default float h() {
        return a() ? d() + 100 : d();
    }
}
