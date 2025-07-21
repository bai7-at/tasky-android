package defpackage;

/* loaded from: classes.dex */
public abstract class hd5 {
    public static final long a(float f, float f2) {
        return fd5.g((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    public static final boolean b(long j) {
        float o = fd5.o(j);
        if (!Float.isInfinite(o) && !Float.isNaN(o)) {
            float p = fd5.p(j);
            if (!Float.isInfinite(p) && !Float.isNaN(p)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c(long j) {
        return j != fd5.b.b();
    }

    public static final long d(long j, long j2, float f) {
        return a(cg4.a(fd5.o(j), fd5.o(j2), f), cg4.a(fd5.p(j), fd5.p(j2), f));
    }
}
