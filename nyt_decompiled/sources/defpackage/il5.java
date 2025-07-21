package defpackage;

import java.io.OutputStream;

/* loaded from: classes5.dex */
final class il5 implements yt7 {
    private final OutputStream a;
    private final pm8 b;

    public il5(OutputStream outputStream, pm8 pm8Var) {
        zq3.h(outputStream, "out");
        zq3.h(pm8Var, "timeout");
        this.a = outputStream;
        this.b = pm8Var;
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
        return this.b;
    }

    public String toString() {
        return "sink(" + this.a + ')';
    }

    @Override // defpackage.yt7
    public void write(ad0 ad0Var, long j) {
        zq3.h(ad0Var, "source");
        p.b(ad0Var.h1(), 0L, j);
        while (j > 0) {
            this.b.throwIfReached();
            ji7 ji7Var = ad0Var.a;
            zq3.e(ji7Var);
            int min = (int) Math.min(j, ji7Var.c - ji7Var.b);
            this.a.write(ji7Var.a, ji7Var.b, min);
            ji7Var.b += min;
            long j2 = min;
            j -= j2;
            ad0Var.e1(ad0Var.h1() - j2);
            if (ji7Var.b == ji7Var.c) {
                ad0Var.a = ji7Var.b();
                li7.b(ji7Var);
            }
        }
    }
}
