package defpackage;

/* loaded from: classes.dex */
public abstract class ek8 {
    public static final long a(float f, long j) {
        return j(j, f);
    }

    public static final void b(long j) {
        if (h(j)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void c(long j, long j2) {
        if (h(j) || h(j2)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (fk8.g(dk8.g(j), dk8.g(j2))) {
            return;
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) fk8.i(dk8.g(j))) + " and " + ((Object) fk8.i(dk8.g(j2)))).toString());
    }

    public static final long d(double d) {
        return j(8589934592L, (float) d);
    }

    public static final long e(double d) {
        return j(4294967296L, (float) d);
    }

    public static final long f(float f) {
        return j(4294967296L, f);
    }

    public static final long g(int i) {
        return j(4294967296L, i);
    }

    public static final boolean h(long j) {
        return dk8.f(j) == 0;
    }

    public static final long i(long j, long j2, float f) {
        c(j, j2);
        return j(dk8.f(j), cg4.a(dk8.h(j), dk8.h(j2), f));
    }

    public static final long j(long j, float f) {
        return dk8.c(j | (Float.floatToIntBits(f) & 4294967295L));
    }
}
