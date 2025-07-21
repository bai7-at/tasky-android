package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.nio.ByteBuffer;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class cq6 implements qd0 {
    public final yt7 a;
    public final ad0 b;
    public boolean c;

    public cq6(yt7 yt7Var) {
        zq3.h(yt7Var, "sink");
        this.a = yt7Var;
        this.b = new ad0();
    }

    @Override // defpackage.qd0
    public qd0 D0(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.D0(i);
        return O();
    }

    @Override // defpackage.qd0
    public qd0 F(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.F(i);
        return O();
    }

    @Override // defpackage.qd0
    public long I0(px7 px7Var) {
        zq3.h(px7Var, "source");
        long j = 0;
        while (true) {
            long read = px7Var.read(this.b, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (read == -1) {
                return j;
            }
            j += read;
            O();
        }
    }

    @Override // defpackage.qd0
    public qd0 O() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        long d = this.b.d();
        if (d > 0) {
            this.a.write(this.b, d);
        }
        return this;
    }

    @Override // defpackage.qd0
    public qd0 V(String str) {
        zq3.h(str, "string");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.V(str);
        return O();
    }

    @Override // defpackage.qd0
    public qd0 Z0(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.Z0(j);
        return O();
    }

    public qd0 a(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.F1(i);
        return O();
    }

    @Override // defpackage.qd0
    public qd0 b0(String str, int i, int i2) {
        zq3.h(str, "string");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.b0(str, i, i2);
        return O();
    }

    @Override // defpackage.yt7, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.c) {
            return;
        }
        try {
            if (this.b.h1() > 0) {
                yt7 yt7Var = this.a;
                ad0 ad0Var = this.b;
                yt7Var.write(ad0Var, ad0Var.h1());
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.a.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.qd0
    public qd0 e() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        long h1 = this.b.h1();
        if (h1 > 0) {
            this.a.write(this.b, h1);
        }
        return this;
    }

    @Override // defpackage.qd0, defpackage.yt7, java.io.Flushable
    public void flush() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (this.b.h1() > 0) {
            yt7 yt7Var = this.a;
            ad0 ad0Var = this.b;
            yt7Var.write(ad0Var, ad0Var.h1());
        }
        this.a.flush();
    }

    @Override // defpackage.qd0
    public ad0 g() {
        return this.b;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.qd0
    public qd0 j0(byte[] bArr) {
        zq3.h(bArr, "source");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.j0(bArr);
        return O();
    }

    @Override // defpackage.qd0
    public qd0 m1(ByteString byteString) {
        zq3.h(byteString, "byteString");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.m1(byteString);
        return O();
    }

    @Override // defpackage.qd0
    public qd0 p(byte[] bArr, int i, int i2) {
        zq3.h(bArr, "source");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.p(bArr, i, i2);
        return O();
    }

    @Override // defpackage.qd0
    public qd0 p0(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.p0(j);
        return O();
    }

    @Override // defpackage.yt7
    public pm8 timeout() {
        return this.a.timeout();
    }

    public String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        zq3.h(byteBuffer, "source");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        int write = this.b.write(byteBuffer);
        O();
        return write;
    }

    @Override // defpackage.qd0
    public qd0 x0(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.x0(i);
        return O();
    }

    @Override // defpackage.yt7
    public void write(ad0 ad0Var, long j) {
        zq3.h(ad0Var, "source");
        if (!this.c) {
            this.b.write(ad0Var, j);
            O();
            return;
        }
        throw new IllegalStateException("closed");
    }
}
