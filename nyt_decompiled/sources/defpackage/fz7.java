package defpackage;

/* loaded from: classes5.dex */
abstract class fz7 extends hz7 {
    protected static final long g = mx8.a(fz7.class, "consumerIndex");
    private volatile long consumerIndex;

    public fz7(int i) {
        super(i);
    }

    protected final boolean t(long j, long j2) {
        return mx8.a.compareAndSwapLong(this, g, j, j2);
    }

    protected final long u() {
        return this.consumerIndex;
    }
}
