package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.text.h;

/* loaded from: classes5.dex */
public final class i63 implements px7 {
    private byte a;
    private final dq6 b;
    private final Inflater c;
    private final qj3 d;
    private final CRC32 e;

    public i63(px7 px7Var) {
        zq3.h(px7Var, "source");
        dq6 dq6Var = new dq6(px7Var);
        this.b = dq6Var;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new qj3((sd0) dq6Var, inflater);
        this.e = new CRC32();
    }

    private final void a(String str, int i, int i2) {
        if (i2 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + h.p0(p.l(i2), 8, '0') + " != expected 0x" + h.p0(p.l(i), 8, '0'));
    }

    private final void b() {
        this.b.o0(10L);
        byte r = this.b.b.r(3L);
        boolean z = ((r >> 1) & 1) == 1;
        if (z) {
            h(this.b.b, 0L, 10L);
        }
        a("ID1ID2", 8075, this.b.readShort());
        this.b.skip(8L);
        if (((r >> 2) & 1) == 1) {
            this.b.o0(2L);
            if (z) {
                h(this.b.b, 0L, 2L);
            }
            long k0 = this.b.b.k0() & 65535;
            this.b.o0(k0);
            if (z) {
                h(this.b.b, 0L, k0);
            }
            this.b.skip(k0);
        }
        if (((r >> 3) & 1) == 1) {
            long a = this.b.a((byte) 0);
            if (a == -1) {
                throw new EOFException();
            }
            if (z) {
                h(this.b.b, 0L, a + 1);
            }
            this.b.skip(a + 1);
        }
        if (((r >> 4) & 1) == 1) {
            long a2 = this.b.a((byte) 0);
            if (a2 == -1) {
                throw new EOFException();
            }
            if (z) {
                h(this.b.b, 0L, a2 + 1);
            }
            this.b.skip(a2 + 1);
        }
        if (z) {
            a("FHCRC", this.b.k0(), (short) this.e.getValue());
            this.e.reset();
        }
    }

    private final void d() {
        a("CRC", this.b.f1(), (int) this.e.getValue());
        a("ISIZE", this.b.f1(), (int) this.c.getBytesWritten());
    }

    private final void h(ad0 ad0Var, long j, long j2) {
        ji7 ji7Var = ad0Var.a;
        zq3.e(ji7Var);
        while (true) {
            int i = ji7Var.c;
            int i2 = ji7Var.b;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            ji7Var = ji7Var.f;
            zq3.e(ji7Var);
        }
        while (j2 > 0) {
            int min = (int) Math.min(ji7Var.c - r6, j2);
            this.e.update(ji7Var.a, (int) (ji7Var.b + j), min);
            j2 -= min;
            ji7Var = ji7Var.f;
            zq3.e(ji7Var);
            j = 0;
        }
    }

    @Override // defpackage.px7, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.yt7
    public void close() {
        this.d.close();
    }

    @Override // defpackage.px7
    public long read(ad0 ad0Var, long j) {
        zq3.h(ad0Var, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (j == 0) {
            return 0L;
        }
        if (this.a == 0) {
            b();
            this.a = (byte) 1;
        }
        if (this.a == 1) {
            long h1 = ad0Var.h1();
            long read = this.d.read(ad0Var, j);
            if (read != -1) {
                h(ad0Var, h1, read);
                return read;
            }
            this.a = (byte) 2;
        }
        if (this.a == 2) {
            d();
            this.a = (byte) 3;
            if (!this.b.C0()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // defpackage.px7, defpackage.yt7
    public pm8 timeout() {
        return this.b.timeout();
    }
}
