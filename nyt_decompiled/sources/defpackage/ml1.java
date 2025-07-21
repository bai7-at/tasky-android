package defpackage;

import java.io.IOException;
import java.util.zip.Deflater;

/* loaded from: classes5.dex */
public final class ml1 implements yt7 {
    private final qd0 a;
    private final Deflater b;
    private boolean c;

    public ml1(qd0 qd0Var, Deflater deflater) {
        zq3.h(qd0Var, "sink");
        zq3.h(deflater, "deflater");
        this.a = qd0Var;
        this.b = deflater;
    }

    private final void a(boolean z) {
        ji7 w1;
        int deflate;
        ad0 g = this.a.g();
        while (true) {
            w1 = g.w1(1);
            if (z) {
                try {
                    Deflater deflater = this.b;
                    byte[] bArr = w1.a;
                    int i = w1.c;
                    deflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                Deflater deflater2 = this.b;
                byte[] bArr2 = w1.a;
                int i2 = w1.c;
                deflate = deflater2.deflate(bArr2, i2, 8192 - i2);
            }
            if (deflate > 0) {
                w1.c += deflate;
                g.e1(g.h1() + deflate);
                this.a.O();
            } else if (this.b.needsInput()) {
                break;
            }
        }
        if (w1.b == w1.c) {
            g.a = w1.b();
            li7.b(w1);
        }
    }

    public final void b() {
        this.b.finish();
        a(false);
    }

    @Override // defpackage.yt7, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.c) {
            return;
        }
        try {
            b();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.b.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.yt7, java.io.Flushable
    public void flush() {
        a(true);
        this.a.flush();
    }

    @Override // defpackage.yt7
    public pm8 timeout() {
        return this.a.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.a + ')';
    }

    @Override // defpackage.yt7
    public void write(ad0 ad0Var, long j) {
        zq3.h(ad0Var, "source");
        p.b(ad0Var.h1(), 0L, j);
        while (j > 0) {
            ji7 ji7Var = ad0Var.a;
            zq3.e(ji7Var);
            int min = (int) Math.min(j, ji7Var.c - ji7Var.b);
            this.b.setInput(ji7Var.a, ji7Var.b, min);
            a(false);
            long j2 = min;
            ad0Var.e1(ad0Var.h1() - j2);
            int i = ji7Var.b + min;
            ji7Var.b = i;
            if (i == ji7Var.c) {
                ad0Var.a = ji7Var.b();
                li7.b(ji7Var);
            }
            j -= j2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ml1(yt7 yt7Var, Deflater deflater) {
        this(wd5.c(yt7Var), deflater);
        zq3.h(yt7Var, "sink");
        zq3.h(deflater, "deflater");
    }
}
