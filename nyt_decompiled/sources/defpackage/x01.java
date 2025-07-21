package defpackage;

/* loaded from: classes2.dex */
final class x01 implements yt7 {
    private final yt7 a;
    private long b;

    public x01(yt7 yt7Var) {
        zq3.h(yt7Var, "delegate");
        this.a = yt7Var;
    }

    public final long a() {
        return this.b;
    }

    @Override // defpackage.yt7, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // defpackage.yt7, java.io.Flushable
    public void flush() {
        this.a.flush();
    }

    @Override // defpackage.yt7
    public pm8 timeout() {
        return this.a.timeout();
    }

    @Override // defpackage.yt7
    public void write(ad0 ad0Var, long j) {
        zq3.h(ad0Var, "source");
        this.a.write(ad0Var, j);
        this.b += j;
    }
}
