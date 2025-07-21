package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes5.dex */
public final class qj3 implements px7 {
    private final sd0 a;
    private final Inflater b;
    private int c;
    private boolean d;

    public qj3(sd0 sd0Var, Inflater inflater) {
        zq3.h(sd0Var, "source");
        zq3.h(inflater, "inflater");
        this.a = sd0Var;
        this.b = inflater;
    }

    private final void d() {
        int i = this.c;
        if (i == 0) {
            return;
        }
        int remaining = i - this.b.getRemaining();
        this.c -= remaining;
        this.a.skip(remaining);
    }

    public final long a(ad0 ad0Var, long j) {
        zq3.h(ad0Var, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return 0L;
        }
        try {
            ji7 w1 = ad0Var.w1(1);
            int min = (int) Math.min(j, 8192 - w1.c);
            b();
            int inflate = this.b.inflate(w1.a, w1.c, min);
            d();
            if (inflate > 0) {
                w1.c += inflate;
                long j2 = inflate;
                ad0Var.e1(ad0Var.h1() + j2);
                return j2;
            }
            if (w1.b == w1.c) {
                ad0Var.a = w1.b();
                li7.b(w1);
            }
            return 0L;
        } catch (DataFormatException e) {
            throw new IOException(e);
        }
    }

    public final boolean b() {
        if (!this.b.needsInput()) {
            return false;
        }
        if (this.a.C0()) {
            return true;
        }
        ji7 ji7Var = this.a.g().a;
        zq3.e(ji7Var);
        int i = ji7Var.c;
        int i2 = ji7Var.b;
        int i3 = i - i2;
        this.c = i3;
        this.b.setInput(ji7Var.a, i2, i3);
        return false;
    }

    @Override // defpackage.px7, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.yt7
    public void close() {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }

    @Override // defpackage.px7
    public long read(ad0 ad0Var, long j) {
        zq3.h(ad0Var, "sink");
        do {
            long a = a(ad0Var, j);
            if (a > 0) {
                return a;
            }
            if (this.b.finished() || this.b.needsDictionary()) {
                return -1L;
            }
        } while (!this.a.C0());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // defpackage.px7, defpackage.yt7
    public pm8 timeout() {
        return this.a.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qj3(px7 px7Var, Inflater inflater) {
        this(wd5.d(px7Var), inflater);
        zq3.h(px7Var, "source");
        zq3.h(inflater, "inflater");
    }
}
