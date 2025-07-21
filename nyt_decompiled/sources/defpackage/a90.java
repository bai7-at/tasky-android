package defpackage;

/* loaded from: classes5.dex */
final class a90 implements yt7 {
    @Override // defpackage.yt7, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // defpackage.yt7, java.io.Flushable
    public void flush() {
    }

    @Override // defpackage.yt7
    public pm8 timeout() {
        return pm8.NONE;
    }

    @Override // defpackage.yt7
    public void write(ad0 ad0Var, long j) {
        zq3.h(ad0Var, "source");
        ad0Var.skip(j);
    }
}
