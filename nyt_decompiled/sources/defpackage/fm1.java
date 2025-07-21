package defpackage;

/* loaded from: classes.dex */
public interface fm1 extends an2 {
    default long B(long j) {
        return j != zt7.b.a() ? du1.b(X0(zt7.i(j)), X0(zt7.g(j))) : fu1.b.a();
    }

    default long Q(float f) {
        return A(X0(f));
    }

    default float X0(float f) {
        return bu1.g(f / getDensity());
    }

    default float f1(float f) {
        return f * getDensity();
    }

    float getDensity();

    default int k1(long j) {
        return dg4.d(t0(j));
    }

    default int l0(float f) {
        float f1 = f1(f);
        if (Float.isInfinite(f1)) {
            return Integer.MAX_VALUE;
        }
        return dg4.d(f1);
    }

    default float t0(long j) {
        if (fk8.g(dk8.g(j), fk8.b.b())) {
            return f1(F(j));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    default float v(int i) {
        return bu1.g(i / getDensity());
    }

    default long v1(long j) {
        return j != fu1.b.a() ? du7.a(f1(fu1.h(j)), f1(fu1.g(j))) : zt7.b.a();
    }
}
