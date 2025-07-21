package defpackage;

/* loaded from: classes.dex */
public interface an2 {
    default long A(float f) {
        wm2 wm2Var = wm2.a;
        if (!wm2Var.f(c1()) || bn2.a()) {
            return ek8.f(f / c1());
        }
        vm2 b = wm2Var.b(c1());
        return ek8.f(b != null ? b.a(f) : f / c1());
    }

    default float F(long j) {
        if (!fk8.g(dk8.g(j), fk8.b.b())) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        wm2 wm2Var = wm2.a;
        if (!wm2Var.f(c1()) || bn2.a()) {
            return bu1.g(dk8.h(j) * c1());
        }
        vm2 b = wm2Var.b(c1());
        return b == null ? bu1.g(dk8.h(j) * c1()) : bu1.g(b.b(dk8.h(j)));
    }

    float c1();
}
