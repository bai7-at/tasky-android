package defpackage;

/* loaded from: classes5.dex */
public abstract class ot0 extends mt0 {
    private static final long g;
    private static final int h;
    protected final long[] f;

    static {
        if (8 != mx8.a.arrayIndexScale(long[].class)) {
            throw new IllegalStateException("Unexpected long[] element size");
        }
        h = mt0.c + 3;
        g = r0.arrayBaseOffset(long[].class) + (32 << (r3 - r2));
    }

    public ot0(int i) {
        super(i);
        int i2 = (int) (this.a + 1);
        this.f = new long[(i2 << mt0.c) + 64];
        for (long j = 0; j < i2; j++) {
            t(this.f, p(j), j);
        }
    }

    protected final long p(long j) {
        return g + ((j & this.a) << h);
    }

    protected final long q(long[] jArr, long j) {
        return mx8.a.getLongVolatile(jArr, j);
    }

    protected final void t(long[] jArr, long j, long j2) {
        mx8.a.putOrderedLong(jArr, j, j2);
    }
}
