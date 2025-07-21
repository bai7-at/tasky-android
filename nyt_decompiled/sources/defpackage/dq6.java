package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class dq6 implements sd0 {
    public final px7 a;
    public final ad0 b;
    public boolean c;

    public dq6(px7 px7Var) {
        zq3.h(px7Var, "source");
        this.a = px7Var;
        this.b = new ad0();
    }

    @Override // defpackage.sd0
    public byte[] B0() {
        this.b.I0(this.a);
        return this.b.B0();
    }

    @Override // defpackage.sd0
    public boolean C0() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        return this.b.C0() && this.a.read(this.b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
    }

    @Override // defpackage.sd0
    public long J(ByteString byteString) {
        zq3.h(byteString, "bytes");
        return b(byteString, 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r0 = new java.lang.StringBuilder();
        r0.append("Expected a digit or '-' but was 0x");
        r1 = java.lang.Integer.toString(r8, kotlin.text.a.a(16));
        defpackage.zq3.g(r1, "toString(...)");
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        throw new java.lang.NumberFormatException(r0.toString());
     */
    @Override // defpackage.sd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long J0() {
        /*
            r10 = this;
            r0 = 1
            r10.o0(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r10.request(r6)
            if (r8 == 0) goto L52
            ad0 r8 = r10.b
            byte r8 = r8.r(r4)
            r9 = 48
            if (r8 < r9) goto L1e
            r9 = 57
            if (r8 <= r9) goto L27
        L1e:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L29
            r5 = 45
            if (r8 == r5) goto L27
            goto L29
        L27:
            r4 = r6
            goto L8
        L29:
            if (r4 == 0) goto L2c
            goto L52
        L2c:
            java.lang.NumberFormatException r10 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected a digit or '-' but was 0x"
            r0.append(r1)
            r1 = 16
            int r1 = kotlin.text.a.a(r1)
            java.lang.String r1 = java.lang.Integer.toString(r8, r1)
            java.lang.String r2 = "toString(...)"
            defpackage.zq3.g(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L52:
            ad0 r10 = r10.b
            long r0 = r10.J0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dq6.J0():long");
    }

    @Override // defpackage.sd0
    public long M(byte b, long j, long j2) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        while (j < j2) {
            long M = this.b.M(b, j, j2);
            if (M != -1) {
                return M;
            }
            long h1 = this.b.h1();
            if (h1 >= j2 || this.a.read(this.b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j = Math.max(j, h1);
        }
        return -1L;
    }

    @Override // defpackage.sd0
    public long N(ByteString byteString) {
        zq3.h(byteString, "targetBytes");
        return d(byteString, 0L);
    }

    @Override // defpackage.sd0
    public String Q(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long M = M((byte) 10, 0L, j2);
        if (M != -1) {
            return b.d(this.b, M);
        }
        if (j2 < Long.MAX_VALUE && request(j2) && this.b.r(j2 - 1) == 13 && request(1 + j2) && this.b.r(j2) == 10) {
            return b.d(this.b, j2);
        }
        ad0 ad0Var = new ad0();
        ad0 ad0Var2 = this.b;
        ad0Var2.i(ad0Var, 0L, Math.min(32, ad0Var2.h1()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.b.h1(), j) + " content=" + ad0Var.a1().n() + (char) 8230);
    }

    @Override // defpackage.sd0
    public long S0(yt7 yt7Var) {
        zq3.h(yt7Var, "sink");
        long j = 0;
        while (this.a.read(this.b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
            long d = this.b.d();
            if (d > 0) {
                j += d;
                yt7Var.write(this.b, d);
            }
        }
        if (this.b.h1() <= 0) {
            return j;
        }
        long h1 = j + this.b.h1();
        ad0 ad0Var = this.b;
        yt7Var.write(ad0Var, ad0Var.h1());
        return h1;
    }

    @Override // defpackage.sd0
    public String V0(Charset charset) {
        zq3.h(charset, "charset");
        this.b.I0(this.a);
        return this.b.V0(charset);
    }

    @Override // defpackage.sd0
    public boolean W(long j, ByteString byteString) {
        zq3.h(byteString, "bytes");
        return h(j, byteString, 0, byteString.E());
    }

    public long a(byte b) {
        return M(b, 0L, Long.MAX_VALUE);
    }

    @Override // defpackage.sd0
    public ByteString a1() {
        this.b.I0(this.a);
        return this.b.a1();
    }

    public long b(ByteString byteString, long j) {
        zq3.h(byteString, "bytes");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long s = this.b.s(byteString, j);
            if (s != -1) {
                return s;
            }
            long h1 = this.b.h1();
            if (this.a.read(this.b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j = Math.max(j, (h1 - byteString.E()) + 1);
        }
    }

    @Override // defpackage.px7, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.yt7
    public void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.close();
        this.b.a();
    }

    public long d(ByteString byteString, long j) {
        zq3.h(byteString, "targetBytes");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long G = this.b.G(byteString, j);
            if (G != -1) {
                return G;
            }
            long h1 = this.b.h1();
            if (this.a.read(this.b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j = Math.max(j, h1);
        }
    }

    @Override // defpackage.sd0
    public int f1() {
        o0(4L);
        return this.b.f1();
    }

    @Override // defpackage.sd0, defpackage.qd0
    public ad0 g() {
        return this.b;
    }

    @Override // defpackage.sd0
    public String g0() {
        return Q(Long.MAX_VALUE);
    }

    public boolean h(long j, ByteString byteString, int i, int i2) {
        zq3.h(byteString, "bytes");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (j < 0 || i < 0 || i2 < 0 || byteString.E() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            long j2 = i3 + j;
            if (!request(1 + j2) || this.b.r(j2) != byteString.g(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.sd0
    public byte[] i0(long j) {
        o0(j);
        return this.b.i0(j);
    }

    @Override // defpackage.sd0
    public String i1() {
        this.b.I0(this.a);
        return this.b.i1();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.sd0
    public short k0() {
        o0(2L);
        return this.b.k0();
    }

    @Override // defpackage.sd0
    public long l0() {
        o0(8L);
        return this.b.l0();
    }

    @Override // defpackage.sd0
    public void o0(long j) {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    @Override // defpackage.sd0
    public sd0 peek() {
        return wd5.d(new uq5(this));
    }

    @Override // defpackage.sd0
    public void r0(ad0 ad0Var, long j) {
        zq3.h(ad0Var, "sink");
        try {
            o0(j);
            this.b.r0(ad0Var, j);
        } catch (EOFException e) {
            ad0Var.I0(this.b);
            throw e;
        }
    }

    @Override // defpackage.px7
    public long read(ad0 ad0Var, long j) {
        zq3.h(ad0Var, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (this.b.h1() == 0 && this.a.read(this.b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1L;
        }
        return this.b.read(ad0Var, Math.min(j, this.b.h1()));
    }

    @Override // defpackage.sd0
    public byte readByte() {
        o0(1L);
        return this.b.readByte();
    }

    @Override // defpackage.sd0
    public void readFully(byte[] bArr) {
        zq3.h(bArr, "sink");
        try {
            o0(bArr.length);
            this.b.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.b.h1() > 0) {
                ad0 ad0Var = this.b;
                int read = ad0Var.read(bArr, i, (int) ad0Var.h1());
                if (read == -1) {
                    throw new AssertionError();
                }
                i += read;
            }
            throw e;
        }
    }

    @Override // defpackage.sd0
    public int readInt() {
        o0(4L);
        return this.b.readInt();
    }

    @Override // defpackage.sd0
    public long readLong() {
        o0(8L);
        return this.b.readLong();
    }

    @Override // defpackage.sd0
    public short readShort() {
        o0(2L);
        return this.b.readShort();
    }

    @Override // defpackage.sd0
    public boolean request(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (this.b.h1() < j) {
            if (this.a.read(this.b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.sd0
    public String s0(long j) {
        o0(j);
        return this.b.s0(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        r0 = new java.lang.StringBuilder();
        r0.append("Expected leading [0-9a-fA-F] character but was 0x");
        r1 = java.lang.Integer.toString(r2, kotlin.text.a.a(16));
        defpackage.zq3.g(r1, "toString(...)");
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        throw new java.lang.NumberFormatException(r0.toString());
     */
    @Override // defpackage.sd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long s1() {
        /*
            r5 = this;
            r0 = 1
            r5.o0(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.request(r2)
            if (r2 == 0) goto L5a
            ad0 r2 = r5.b
            long r3 = (long) r0
            byte r2 = r2.r(r3)
            r3 = 48
            if (r2 < r3) goto L1e
            r3 = 57
            if (r2 <= r3) goto L2f
        L1e:
            r3 = 97
            if (r2 < r3) goto L26
            r3 = 102(0x66, float:1.43E-43)
            if (r2 <= r3) goto L2f
        L26:
            r3 = 65
            if (r2 < r3) goto L31
            r3 = 70
            if (r2 <= r3) goto L2f
            goto L31
        L2f:
            r0 = r1
            goto L6
        L31:
            if (r0 == 0) goto L34
            goto L5a
        L34:
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.append(r1)
            r1 = 16
            int r1 = kotlin.text.a.a(r1)
            java.lang.String r1 = java.lang.Integer.toString(r2, r1)
            java.lang.String r2 = "toString(...)"
            defpackage.zq3.g(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L5a:
            ad0 r5 = r5.b
            long r0 = r5.s1()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dq6.s1():long");
    }

    @Override // defpackage.sd0
    public void skip(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            if (this.b.h1() == 0 && this.a.read(this.b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.b.h1());
            this.b.skip(min);
            j -= min;
        }
    }

    @Override // defpackage.sd0
    public InputStream t1() {
        return new a();
    }

    @Override // defpackage.px7, defpackage.yt7
    public pm8 timeout() {
        return this.a.timeout();
    }

    public String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // defpackage.sd0
    public ByteString u0(long j) {
        o0(j);
        return this.b.u0(j);
    }

    @Override // defpackage.sd0
    public int y0(tk5 tk5Var) {
        zq3.h(tk5Var, "options");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            int e = b.e(this.b, tk5Var, true);
            if (e != -2) {
                if (e != -1) {
                    this.b.skip(tk5Var.g()[e].E());
                    return e;
                }
            } else if (this.a.read(this.b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // defpackage.sd0
    public ad0 z() {
        return this.b;
    }

    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() {
            dq6 dq6Var = dq6.this;
            if (dq6Var.c) {
                throw new IOException("closed");
            }
            return (int) Math.min(dq6Var.b.h1(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            dq6.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            dq6 dq6Var = dq6.this;
            if (dq6Var.c) {
                throw new IOException("closed");
            }
            if (dq6Var.b.h1() == 0) {
                dq6 dq6Var2 = dq6.this;
                if (dq6Var2.a.read(dq6Var2.b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1;
                }
            }
            return dq6.this.b.readByte() & 255;
        }

        public String toString() {
            return dq6.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            zq3.h(bArr, "data");
            if (!dq6.this.c) {
                p.b(bArr.length, i, i2);
                if (dq6.this.b.h1() == 0) {
                    dq6 dq6Var = dq6.this;
                    if (dq6Var.a.read(dq6Var.b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                        return -1;
                    }
                }
                return dq6.this.b.read(bArr, i, i2);
            }
            throw new IOException("closed");
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        zq3.h(byteBuffer, "sink");
        if (this.b.h1() == 0 && this.a.read(this.b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.b.read(byteBuffer);
    }
}
