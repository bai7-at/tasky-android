package defpackage;

/* loaded from: classes5.dex */
abstract class xw4 extends zw4 {
    private static final long j = mx8.a(xw4.class, "consumerIndex");
    private volatile long consumerIndex;

    public xw4(int i) {
        super(i);
    }

    protected final boolean w(long j2, long j3) {
        return mx8.a.compareAndSwapLong(this, j, j2, j3);
    }

    protected final long x() {
        return this.consumerIndex;
    }
}
