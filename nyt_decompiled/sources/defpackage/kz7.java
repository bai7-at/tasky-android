package defpackage;

/* loaded from: classes5.dex */
abstract class kz7 extends gz7 {
    protected static final long f = mx8.a(kz7.class, "producerIndex");
    private volatile long producerIndex;

    public kz7(int i) {
        super(i);
    }

    protected final long p() {
        return this.producerIndex;
    }

    protected final void q(long j) {
        mx8.a.putOrderedLong(this, f, j);
    }
}
