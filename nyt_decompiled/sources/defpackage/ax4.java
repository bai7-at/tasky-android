package defpackage;

/* loaded from: classes5.dex */
abstract class ax4 extends yw4 {
    private static final long i = mx8.a(ax4.class, "producerIndex");
    private volatile long producerIndex;

    public ax4(int i2) {
        super(i2);
    }

    protected final boolean u(long j, long j2) {
        return mx8.a.compareAndSwapLong(this, i, j, j2);
    }

    protected final long v() {
        return this.producerIndex;
    }
}
