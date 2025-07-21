package defpackage;

import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* loaded from: classes5.dex */
public final class h63 implements yt7 {
    private final cq6 a;
    private final Deflater b;
    private final ml1 c;
    private boolean d;
    private final CRC32 e;

    public h63(yt7 yt7Var) {
        zq3.h(yt7Var, "sink");
        cq6 cq6Var = new cq6(yt7Var);
        this.a = cq6Var;
        Deflater deflater = new Deflater(cn9.b(), true);
        this.b = deflater;
        this.c = new ml1((qd0) cq6Var, deflater);
        this.e = new CRC32();
        ad0 ad0Var = cq6Var.b;
        ad0Var.x0(8075);
        ad0Var.D0(8);
        ad0Var.D0(0);
        ad0Var.F(0);
        ad0Var.D0(0);
        ad0Var.D0(0);
    }

    private final void a(ad0 ad0Var, long j) {
        ji7 ji7Var = ad0Var.a;
        zq3.e(ji7Var);
        while (j > 0) {
            int min = (int) Math.min(j, ji7Var.c - ji7Var.b);
            this.e.update(ji7Var.a, ji7Var.b, min);
            j -= min;
            ji7Var = ji7Var.f;
            zq3.e(ji7Var);
        }
    }

    private final void b() {
        this.a.a((int) this.e.getValue());
        this.a.a((int) this.b.getBytesRead());
    }

    @Override // defpackage.yt7, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.d) {
            return;
        }
        try {
            this.c.b();
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
        this.d = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.yt7, java.io.Flushable
    public void flush() {
        this.c.flush();
    }

    @Override // defpackage.yt7
    public pm8 timeout() {
        return this.a.timeout();
    }

    @Override // defpackage.yt7
    public void write(ad0 ad0Var, long j) {
        zq3.h(ad0Var, "source");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (j == 0) {
            return;
        }
        a(ad0Var, j);
        this.c.write(ad0Var, j);
    }
}
