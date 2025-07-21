package defpackage;

import java.io.IOException;

/* loaded from: classes5.dex */
public abstract class op2 implements px7 {
    private final px7 delegate;

    public op2(px7 px7Var) {
        zq3.h(px7Var, "delegate");
        this.delegate = px7Var;
    }

    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final px7 m1106deprecated_delegate() {
        return this.delegate;
    }

    @Override // defpackage.px7, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.yt7
    public void close() throws IOException {
        this.delegate.close();
    }

    public final px7 delegate() {
        return this.delegate;
    }

    @Override // defpackage.px7
    public long read(ad0 ad0Var, long j) throws IOException {
        zq3.h(ad0Var, "sink");
        return this.delegate.read(ad0Var, j);
    }

    @Override // defpackage.px7, defpackage.yt7
    public pm8 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
