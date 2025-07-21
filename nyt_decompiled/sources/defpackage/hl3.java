package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
class hl3 implements px7 {
    private final InputStream a;
    private final pm8 b;

    public hl3(InputStream inputStream, pm8 pm8Var) {
        zq3.h(inputStream, "input");
        zq3.h(pm8Var, "timeout");
        this.a = inputStream;
        this.b = pm8Var;
    }

    @Override // defpackage.px7, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.yt7
    public void close() {
        this.a.close();
    }

    @Override // defpackage.px7
    public long read(ad0 ad0Var, long j) {
        zq3.h(ad0Var, "sink");
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        try {
            this.b.throwIfReached();
            ji7 w1 = ad0Var.w1(1);
            int read = this.a.read(w1.a, w1.c, (int) Math.min(j, 8192 - w1.c));
            if (read != -1) {
                w1.c += read;
                long j2 = read;
                ad0Var.e1(ad0Var.h1() + j2);
                return j2;
            }
            if (w1.b != w1.c) {
                return -1L;
            }
            ad0Var.a = w1.b();
            li7.b(w1);
            return -1L;
        } catch (AssertionError e) {
            if (wd5.e(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // defpackage.px7, defpackage.yt7
    public pm8 timeout() {
        return this.b;
    }

    public String toString() {
        return "source(" + this.a + ')';
    }
}
