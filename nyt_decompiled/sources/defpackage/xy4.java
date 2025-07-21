package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class xy4 {
    public static final int c = vy4.d;
    private final vy4 a;
    private final qs2 b;

    public xy4(vy4 vy4Var, qs2 qs2Var) {
        this.a = vy4Var;
        this.b = qs2Var;
    }

    public final void a(int i, Object obj) {
        this.a.a(i, obj);
        this.b.mo865invoke();
    }

    public final List b() {
        return this.a.g();
    }

    public final void c() {
        this.a.h();
        this.b.mo865invoke();
    }

    public final Object d(int i) {
        return this.a.p()[i];
    }

    public final int e() {
        return this.a.q();
    }

    public final vy4 f() {
        return this.a;
    }

    public final Object g(int i) {
        Object y = this.a.y(i);
        this.b.mo865invoke();
        return y;
    }
}
