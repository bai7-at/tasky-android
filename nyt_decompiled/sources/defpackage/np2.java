package defpackage;

import java.io.IOException;

/* loaded from: classes5.dex */
public abstract class np2 implements yt7 {
    private final yt7 delegate;

    public np2(yt7 yt7Var) {
        zq3.h(yt7Var, "delegate");
        this.delegate = yt7Var;
    }

    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final yt7 m970deprecated_delegate() {
        return this.delegate;
    }

    @Override // defpackage.yt7, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final yt7 delegate() {
        return this.delegate;
    }

    @Override // defpackage.yt7, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // defpackage.yt7
    public pm8 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // defpackage.yt7
    public void write(ad0 ad0Var, long j) throws IOException {
        zq3.h(ad0Var, "source");
        this.delegate.write(ad0Var, j);
    }
}
