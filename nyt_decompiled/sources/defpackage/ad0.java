package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import com.amazonaws.event.ProgressEvent;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.collections.d;
import okhttp3.internal.connection.RealConnection;
import okio.ByteString;
import okio.SegmentedByteString;

/* loaded from: classes5.dex */
public final class ad0 implements sd0, qd0, Cloneable, ByteChannel {
    public ji7 a;
    private long b;

    public static final class b extends OutputStream {
        b() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return ad0.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            ad0.this.D0(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            zq3.h(bArr, "data");
            ad0.this.p(bArr, i, i2);
        }
    }

    public static final class c implements Closeable {
        public ad0 a;
        public boolean b;
        private ji7 c;
        public byte[] e;
        public long d = -1;
        public int f = -1;
        public int g = -1;

        public final ji7 a() {
            return this.c;
        }

        public final int b() {
            long j = this.d;
            ad0 ad0Var = this.a;
            zq3.e(ad0Var);
            if (j == ad0Var.h1()) {
                throw new IllegalStateException("no more bytes");
            }
            long j2 = this.d;
            return h(j2 == -1 ? 0L : j2 + (this.g - this.f));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.a == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.a = null;
            i(null);
            this.d = -1L;
            this.e = null;
            this.f = -1;
            this.g = -1;
        }

        public final long d(long j) {
            ad0 ad0Var = this.a;
            if (ad0Var == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.b) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long h1 = ad0Var.h1();
            if (j <= h1) {
                if (j < 0) {
                    throw new IllegalArgumentException(("newSize < 0: " + j).toString());
                }
                long j2 = h1 - j;
                while (true) {
                    if (j2 <= 0) {
                        break;
                    }
                    ji7 ji7Var = ad0Var.a;
                    zq3.e(ji7Var);
                    ji7 ji7Var2 = ji7Var.g;
                    zq3.e(ji7Var2);
                    int i = ji7Var2.c;
                    long j3 = i - ji7Var2.b;
                    if (j3 > j2) {
                        ji7Var2.c = i - ((int) j2);
                        break;
                    }
                    ad0Var.a = ji7Var2.b();
                    li7.b(ji7Var2);
                    j2 -= j3;
                }
                i(null);
                this.d = j;
                this.e = null;
                this.f = -1;
                this.g = -1;
            } else if (j > h1) {
                long j4 = j - h1;
                boolean z = true;
                while (j4 > 0) {
                    ji7 w1 = ad0Var.w1(1);
                    int min = (int) Math.min(j4, 8192 - w1.c);
                    w1.c += min;
                    j4 -= min;
                    if (z) {
                        i(w1);
                        this.d = h1;
                        this.e = w1.a;
                        int i2 = w1.c;
                        this.f = i2 - min;
                        this.g = i2;
                        z = false;
                    }
                }
            }
            ad0Var.e1(j);
            return h1;
        }

        public final int h(long j) {
            ji7 ji7Var;
            ad0 ad0Var = this.a;
            if (ad0Var == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j < -1 || j > ad0Var.h1()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + ad0Var.h1());
            }
            if (j == -1 || j == ad0Var.h1()) {
                i(null);
                this.d = j;
                this.e = null;
                this.f = -1;
                this.g = -1;
                return -1;
            }
            long h1 = ad0Var.h1();
            ji7 ji7Var2 = ad0Var.a;
            long j2 = 0;
            if (a() != null) {
                long j3 = this.d;
                int i = this.f;
                zq3.e(a());
                long j4 = j3 - (i - r9.b);
                if (j4 > j) {
                    ji7Var = ji7Var2;
                    ji7Var2 = a();
                    h1 = j4;
                } else {
                    ji7Var = a();
                    j2 = j4;
                }
            } else {
                ji7Var = ji7Var2;
            }
            if (h1 - j > j - j2) {
                while (true) {
                    zq3.e(ji7Var);
                    int i2 = ji7Var.c;
                    int i3 = ji7Var.b;
                    if (j < (i2 - i3) + j2) {
                        break;
                    }
                    j2 += i2 - i3;
                    ji7Var = ji7Var.f;
                }
            } else {
                while (h1 > j) {
                    zq3.e(ji7Var2);
                    ji7Var2 = ji7Var2.g;
                    zq3.e(ji7Var2);
                    h1 -= ji7Var2.c - ji7Var2.b;
                }
                j2 = h1;
                ji7Var = ji7Var2;
            }
            if (this.b) {
                zq3.e(ji7Var);
                if (ji7Var.d) {
                    ji7 f = ji7Var.f();
                    if (ad0Var.a == ji7Var) {
                        ad0Var.a = f;
                    }
                    ji7Var = ji7Var.c(f);
                    ji7 ji7Var3 = ji7Var.g;
                    zq3.e(ji7Var3);
                    ji7Var3.b();
                }
            }
            i(ji7Var);
            this.d = j;
            zq3.e(ji7Var);
            this.e = ji7Var.a;
            int i4 = ji7Var.b + ((int) (j - j2));
            this.f = i4;
            int i5 = ji7Var.c;
            this.g = i5;
            return i5 - i4;
        }

        public final void i(ji7 ji7Var) {
            this.c = ji7Var;
        }
    }

    public static /* synthetic */ c w0(ad0 ad0Var, c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = p.d();
        }
        return ad0Var.c0(cVar);
    }

    @Override // defpackage.qd0
    /* renamed from: A1, reason: merged with bridge method [inline-methods] */
    public ad0 p(byte[] bArr, int i, int i2) {
        zq3.h(bArr, "source");
        long j = i2;
        p.b(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            ji7 w1 = w1(1);
            int min = Math.min(i3 - i, 8192 - w1.c);
            int i4 = i + min;
            d.f(bArr, w1.a, w1.c, i, i4);
            w1.c += min;
            i = i4;
        }
        e1(h1() + j);
        return this;
    }

    @Override // defpackage.sd0
    public byte[] B0() {
        return i0(h1());
    }

    @Override // defpackage.qd0
    /* renamed from: B1, reason: merged with bridge method [inline-methods] */
    public ad0 D0(int i) {
        ji7 w1 = w1(1);
        byte[] bArr = w1.a;
        int i2 = w1.c;
        w1.c = i2 + 1;
        bArr[i2] = (byte) i;
        e1(h1() + 1);
        return this;
    }

    @Override // defpackage.sd0
    public boolean C0() {
        return this.b == 0;
    }

    @Override // defpackage.qd0
    /* renamed from: C1, reason: merged with bridge method [inline-methods] */
    public ad0 p0(long j) {
        boolean z;
        if (j == 0) {
            return D0(48);
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return V("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < RealConnection.IDLE_CONNECTION_HEALTHY_NS ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        ji7 w1 = w1(i);
        byte[] bArr = w1.a;
        int i2 = w1.c + i;
        while (j != 0) {
            long j2 = 10;
            i2--;
            bArr[i2] = defpackage.b.b()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        w1.c += i;
        e1(h1() + i);
        return this;
    }

    @Override // defpackage.qd0
    /* renamed from: D1, reason: merged with bridge method [inline-methods] */
    public ad0 Z0(long j) {
        if (j == 0) {
            return D0(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        ji7 w1 = w1(i);
        byte[] bArr = w1.a;
        int i2 = w1.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = defpackage.b.b()[(int) (15 & j)];
            j >>>= 4;
        }
        w1.c += i;
        e1(h1() + i);
        return this;
    }

    @Override // defpackage.qd0
    /* renamed from: E1, reason: merged with bridge method [inline-methods] */
    public ad0 F(int i) {
        ji7 w1 = w1(4);
        byte[] bArr = w1.a;
        int i2 = w1.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        w1.c = i2 + 4;
        e1(h1() + 4);
        return this;
    }

    public String F0(long j, Charset charset) {
        zq3.h(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        ji7 ji7Var = this.a;
        zq3.e(ji7Var);
        int i = ji7Var.b;
        if (i + j > ji7Var.c) {
            return new String(i0(j), charset);
        }
        int i2 = (int) j;
        String str = new String(ji7Var.a, i, i2, charset);
        int i3 = ji7Var.b + i2;
        ji7Var.b = i3;
        this.b -= j;
        if (i3 == ji7Var.c) {
            this.a = ji7Var.b();
            li7.b(ji7Var);
        }
        return str;
    }

    public ad0 F1(int i) {
        return F(p.h(i));
    }

    public long G(ByteString byteString, long j) {
        int i;
        int i2;
        zq3.h(byteString, "targetBytes");
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j).toString());
        }
        ji7 ji7Var = this.a;
        if (ji7Var == null) {
            return -1L;
        }
        if (h1() - j < j) {
            j2 = h1();
            while (j2 > j) {
                ji7Var = ji7Var.g;
                zq3.e(ji7Var);
                j2 -= ji7Var.c - ji7Var.b;
            }
            if (byteString.E() == 2) {
                byte g = byteString.g(0);
                byte g2 = byteString.g(1);
                while (j2 < h1()) {
                    byte[] bArr = ji7Var.a;
                    i = (int) ((ji7Var.b + j) - j2);
                    int i3 = ji7Var.c;
                    while (i < i3) {
                        byte b2 = bArr[i];
                        if (b2 != g && b2 != g2) {
                            i++;
                        }
                        i2 = ji7Var.b;
                    }
                    j2 += ji7Var.c - ji7Var.b;
                    ji7Var = ji7Var.f;
                    zq3.e(ji7Var);
                    j = j2;
                }
                return -1L;
            }
            byte[] s = byteString.s();
            while (j2 < h1()) {
                byte[] bArr2 = ji7Var.a;
                i = (int) ((ji7Var.b + j) - j2);
                int i4 = ji7Var.c;
                while (i < i4) {
                    byte b3 = bArr2[i];
                    for (byte b4 : s) {
                        if (b3 == b4) {
                            i2 = ji7Var.b;
                        }
                    }
                    i++;
                }
                j2 += ji7Var.c - ji7Var.b;
                ji7Var = ji7Var.f;
                zq3.e(ji7Var);
                j = j2;
            }
            return -1L;
        }
        while (true) {
            long j3 = (ji7Var.c - ji7Var.b) + j2;
            if (j3 > j) {
                break;
            }
            ji7Var = ji7Var.f;
            zq3.e(ji7Var);
            j2 = j3;
        }
        if (byteString.E() == 2) {
            byte g3 = byteString.g(0);
            byte g4 = byteString.g(1);
            while (j2 < h1()) {
                byte[] bArr3 = ji7Var.a;
                i = (int) ((ji7Var.b + j) - j2);
                int i5 = ji7Var.c;
                while (i < i5) {
                    byte b5 = bArr3[i];
                    if (b5 != g3 && b5 != g4) {
                        i++;
                    }
                    i2 = ji7Var.b;
                }
                j2 += ji7Var.c - ji7Var.b;
                ji7Var = ji7Var.f;
                zq3.e(ji7Var);
                j = j2;
            }
            return -1L;
        }
        byte[] s2 = byteString.s();
        while (j2 < h1()) {
            byte[] bArr4 = ji7Var.a;
            i = (int) ((ji7Var.b + j) - j2);
            int i6 = ji7Var.c;
            while (i < i6) {
                byte b6 = bArr4[i];
                for (byte b7 : s2) {
                    if (b6 == b7) {
                        i2 = ji7Var.b;
                    }
                }
                i++;
            }
            j2 += ji7Var.c - ji7Var.b;
            ji7Var = ji7Var.f;
            zq3.e(ji7Var);
            j = j2;
        }
        return -1L;
        return (i - i2) + j2;
    }

    public ad0 G1(long j) {
        ji7 w1 = w1(8);
        byte[] bArr = w1.a;
        int i = w1.c;
        bArr[i] = (byte) ((j >>> 56) & 255);
        bArr[i + 1] = (byte) ((j >>> 48) & 255);
        bArr[i + 2] = (byte) ((j >>> 40) & 255);
        bArr[i + 3] = (byte) ((j >>> 32) & 255);
        bArr[i + 4] = (byte) ((j >>> 24) & 255);
        bArr[i + 5] = (byte) ((j >>> 16) & 255);
        bArr[i + 6] = (byte) ((j >>> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
        w1.c = i + 8;
        e1(h1() + 8);
        return this;
    }

    @Override // defpackage.qd0
    /* renamed from: H1, reason: merged with bridge method [inline-methods] */
    public ad0 x0(int i) {
        ji7 w1 = w1(2);
        byte[] bArr = w1.a;
        int i2 = w1.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        w1.c = i2 + 2;
        e1(h1() + 2);
        return this;
    }

    @Override // defpackage.qd0
    public long I0(px7 px7Var) {
        zq3.h(px7Var, "source");
        long j = 0;
        while (true) {
            long read = px7Var.read(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    public ad0 I1(String str, int i, int i2, Charset charset) {
        zq3.h(str, "string");
        zq3.h(charset, "charset");
        if (i < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
        }
        if (zq3.c(charset, yj0.b)) {
            return b0(str, i, i2);
        }
        String substring = str.substring(i, i2);
        zq3.g(substring, "substring(...)");
        byte[] bytes = substring.getBytes(charset);
        zq3.g(bytes, "getBytes(...)");
        return p(bytes, 0, bytes.length);
    }

    @Override // defpackage.sd0
    public long J(ByteString byteString) {
        zq3.h(byteString, "bytes");
        return s(byteString, 0L);
    }

    @Override // defpackage.sd0
    public long J0() {
        if (h1() == 0) {
            throw new EOFException();
        }
        int i = 0;
        boolean z = false;
        long j = 0;
        long j2 = -7;
        boolean z2 = false;
        do {
            ji7 ji7Var = this.a;
            zq3.e(ji7Var);
            byte[] bArr = ji7Var.a;
            int i2 = ji7Var.b;
            int i3 = ji7Var.c;
            while (i2 < i3) {
                byte b2 = bArr[i2];
                if (b2 >= 48 && b2 <= 57) {
                    int i4 = 48 - b2;
                    if (j < -922337203685477580L || (j == -922337203685477580L && i4 < j2)) {
                        ad0 D0 = new ad0().p0(j).D0(b2);
                        if (!z) {
                            D0.readByte();
                        }
                        throw new NumberFormatException("Number too large: " + D0.i1());
                    }
                    j = (j * 10) + i4;
                } else {
                    if (b2 != 45 || i != 0) {
                        z2 = true;
                        break;
                    }
                    j2--;
                    z = true;
                }
                i2++;
                i++;
            }
            if (i2 == i3) {
                this.a = ji7Var.b();
                li7.b(ji7Var);
            } else {
                ji7Var.b = i2;
            }
            if (z2) {
                break;
            }
        } while (this.a != null);
        e1(h1() - i);
        if (i >= (z ? 2 : 1)) {
            return z ? j : -j;
        }
        if (h1() == 0) {
            throw new EOFException();
        }
        throw new NumberFormatException((z ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + p.k(r(0L)));
    }

    public ad0 J1(String str, Charset charset) {
        zq3.h(str, "string");
        zq3.h(charset, "charset");
        return I1(str, 0, str.length(), charset);
    }

    @Override // defpackage.qd0
    /* renamed from: K1, reason: merged with bridge method [inline-methods] */
    public ad0 V(String str) {
        zq3.h(str, "string");
        return b0(str, 0, str.length());
    }

    @Override // defpackage.qd0
    /* renamed from: L1, reason: merged with bridge method [inline-methods] */
    public ad0 b0(String str, int i, int i2) {
        char charAt;
        zq3.h(str, "string");
        if (i < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                ji7 w1 = w1(1);
                byte[] bArr = w1.a;
                int i3 = w1.c - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = w1.c;
                int i6 = (i3 + i) - i5;
                w1.c = i5 + i6;
                e1(h1() + i6);
            } else {
                if (charAt2 < 2048) {
                    ji7 w12 = w1(2);
                    byte[] bArr2 = w12.a;
                    int i7 = w12.c;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    w12.c = i7 + 2;
                    e1(h1() + 2);
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    ji7 w13 = w1(3);
                    byte[] bArr3 = w13.a;
                    int i8 = w13.c;
                    bArr3[i8] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    w13.c = i8 + 3;
                    e1(h1() + 3);
                } else {
                    int i9 = i + 1;
                    char charAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        D0(63);
                        i = i9;
                    } else {
                        int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        ji7 w14 = w1(4);
                        byte[] bArr4 = w14.a;
                        int i11 = w14.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        w14.c = i11 + 4;
                        e1(h1() + 4);
                        i += 2;
                    }
                }
                i++;
            }
        }
        return this;
    }

    @Override // defpackage.sd0
    public long M(byte b2, long j, long j2) {
        ji7 ji7Var;
        int i;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + h1() + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        if (j2 > h1()) {
            j2 = h1();
        }
        if (j == j2 || (ji7Var = this.a) == null) {
            return -1L;
        }
        if (h1() - j < j) {
            j3 = h1();
            while (j3 > j) {
                ji7Var = ji7Var.g;
                zq3.e(ji7Var);
                j3 -= ji7Var.c - ji7Var.b;
            }
            while (j3 < j2) {
                byte[] bArr = ji7Var.a;
                int min = (int) Math.min(ji7Var.c, (ji7Var.b + j2) - j3);
                i = (int) ((ji7Var.b + j) - j3);
                while (i < min) {
                    if (bArr[i] != b2) {
                        i++;
                    }
                }
                j3 += ji7Var.c - ji7Var.b;
                ji7Var = ji7Var.f;
                zq3.e(ji7Var);
                j = j3;
            }
            return -1L;
        }
        while (true) {
            long j4 = (ji7Var.c - ji7Var.b) + j3;
            if (j4 > j) {
                break;
            }
            ji7Var = ji7Var.f;
            zq3.e(ji7Var);
            j3 = j4;
        }
        while (j3 < j2) {
            byte[] bArr2 = ji7Var.a;
            int min2 = (int) Math.min(ji7Var.c, (ji7Var.b + j2) - j3);
            i = (int) ((ji7Var.b + j) - j3);
            while (i < min2) {
                if (bArr2[i] != b2) {
                    i++;
                }
            }
            j3 += ji7Var.c - ji7Var.b;
            ji7Var = ji7Var.f;
            zq3.e(ji7Var);
            j = j3;
        }
        return -1L;
        return (i - ji7Var.b) + j3;
    }

    public ad0 M1(int i) {
        if (i < 128) {
            D0(i);
        } else if (i < 2048) {
            ji7 w1 = w1(2);
            byte[] bArr = w1.a;
            int i2 = w1.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            w1.c = i2 + 2;
            e1(h1() + 2);
        } else if (55296 <= i && i < 57344) {
            D0(63);
        } else if (i < 65536) {
            ji7 w12 = w1(3);
            byte[] bArr2 = w12.a;
            int i3 = w12.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            w12.c = i3 + 3;
            e1(h1() + 3);
        } else {
            if (i > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: 0x" + p.l(i));
            }
            ji7 w13 = w1(4);
            byte[] bArr3 = w13.a;
            int i4 = w13.c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            w13.c = i4 + 4;
            e1(h1() + 4);
        }
        return this;
    }

    @Override // defpackage.sd0
    public long N(ByteString byteString) {
        zq3.h(byteString, "targetBytes");
        return G(byteString, 0L);
    }

    public OutputStream P() {
        return new b();
    }

    @Override // defpackage.sd0
    public String Q(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long M = M((byte) 10, 0L, j2);
        if (M != -1) {
            return defpackage.b.d(this, M);
        }
        if (j2 < h1() && r(j2 - 1) == 13 && r(j2) == 10) {
            return defpackage.b.d(this, j2);
        }
        ad0 ad0Var = new ad0();
        i(ad0Var, 0L, Math.min(32, h1()));
        throw new EOFException("\\n not found: limit=" + Math.min(h1(), j) + " content=" + ad0Var.a1().n() + (char) 8230);
    }

    @Override // defpackage.sd0
    public long S0(yt7 yt7Var) {
        zq3.h(yt7Var, "sink");
        long h1 = h1();
        if (h1 > 0) {
            yt7Var.write(this, h1);
        }
        return h1;
    }

    @Override // defpackage.sd0
    public String V0(Charset charset) {
        zq3.h(charset, "charset");
        return F0(this.b, charset);
    }

    @Override // defpackage.sd0
    public boolean W(long j, ByteString byteString) {
        zq3.h(byteString, "bytes");
        return X(j, byteString, 0, byteString.E());
    }

    public int W0() {
        int i;
        int i2;
        int i3;
        if (h1() == 0) {
            throw new EOFException();
        }
        byte r = r(0L);
        if ((r & 128) == 0) {
            i = r & Byte.MAX_VALUE;
            i3 = 0;
            i2 = 1;
        } else if ((r & 224) == 192) {
            i = r & 31;
            i2 = 2;
            i3 = 128;
        } else if ((r & 240) == 224) {
            i = r & 15;
            i2 = 3;
            i3 = ProgressEvent.PART_COMPLETED_EVENT_CODE;
        } else {
            if ((r & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = r & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (h1() < j) {
            throw new EOFException("size < " + i2 + ": " + h1() + " (to read code point prefixed 0x" + p.k(r) + ')');
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte r2 = r(j2);
            if ((r2 & 192) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (r2 & 63);
        }
        skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    public boolean X(long j, ByteString byteString, int i, int i2) {
        zq3.h(byteString, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || h1() - j < i2 || byteString.E() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (r(i3 + j) != byteString.g(i + i3)) {
                return false;
            }
        }
        return true;
    }

    public final void a() {
        skip(h1());
    }

    @Override // defpackage.sd0
    public ByteString a1() {
        return u0(h1());
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ad0 clone() {
        return h();
    }

    public final c c0(c cVar) {
        zq3.h(cVar, "unsafeCursor");
        return defpackage.b.a(this, cVar);
    }

    @Override // defpackage.px7, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.yt7
    public void close() {
    }

    public final long d() {
        long h1 = h1();
        if (h1 == 0) {
            return 0L;
        }
        ji7 ji7Var = this.a;
        zq3.e(ji7Var);
        ji7 ji7Var2 = ji7Var.g;
        zq3.e(ji7Var2);
        if (ji7Var2.c < 8192 && ji7Var2.e) {
            h1 -= r2 - ji7Var2.b;
        }
        return h1;
    }

    public final void e1(long j) {
        this.b = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ad0) {
            ad0 ad0Var = (ad0) obj;
            if (h1() == ad0Var.h1()) {
                if (h1() == 0) {
                    return true;
                }
                ji7 ji7Var = this.a;
                zq3.e(ji7Var);
                ji7 ji7Var2 = ad0Var.a;
                zq3.e(ji7Var2);
                int i = ji7Var.b;
                int i2 = ji7Var2.b;
                long j = 0;
                while (j < h1()) {
                    long min = Math.min(ji7Var.c - i, ji7Var2.c - i2);
                    long j2 = 0;
                    while (j2 < min) {
                        int i3 = i + 1;
                        int i4 = i2 + 1;
                        if (ji7Var.a[i] == ji7Var2.a[i2]) {
                            j2++;
                            i = i3;
                            i2 = i4;
                        }
                    }
                    if (i == ji7Var.c) {
                        ji7Var = ji7Var.f;
                        zq3.e(ji7Var);
                        i = ji7Var.b;
                    }
                    if (i2 == ji7Var2.c) {
                        ji7Var2 = ji7Var2.f;
                        zq3.e(ji7Var2);
                        i2 = ji7Var2.b;
                    }
                    j += min;
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.sd0
    public int f1() {
        return p.h(readInt());
    }

    @Override // defpackage.qd0, defpackage.yt7, java.io.Flushable
    public void flush() {
    }

    @Override // defpackage.sd0, defpackage.qd0
    public ad0 g() {
        return this;
    }

    @Override // defpackage.sd0
    public String g0() {
        return Q(Long.MAX_VALUE);
    }

    public final ad0 h() {
        ad0 ad0Var = new ad0();
        if (h1() != 0) {
            ji7 ji7Var = this.a;
            zq3.e(ji7Var);
            ji7 d = ji7Var.d();
            ad0Var.a = d;
            d.g = d;
            d.f = d;
            for (ji7 ji7Var2 = ji7Var.f; ji7Var2 != ji7Var; ji7Var2 = ji7Var2.f) {
                ji7 ji7Var3 = d.g;
                zq3.e(ji7Var3);
                zq3.e(ji7Var2);
                ji7Var3.c(ji7Var2.d());
            }
            ad0Var.e1(h1());
        }
        return ad0Var;
    }

    public final long h1() {
        return this.b;
    }

    public int hashCode() {
        ji7 ji7Var = this.a;
        if (ji7Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = ji7Var.c;
            for (int i3 = ji7Var.b; i3 < i2; i3++) {
                i = (i * 31) + ji7Var.a[i3];
            }
            ji7Var = ji7Var.f;
            zq3.e(ji7Var);
        } while (ji7Var != this.a);
        return i;
    }

    public final ad0 i(ad0 ad0Var, long j, long j2) {
        zq3.h(ad0Var, "out");
        p.b(h1(), j, j2);
        if (j2 != 0) {
            ad0Var.e1(ad0Var.h1() + j2);
            ji7 ji7Var = this.a;
            while (true) {
                zq3.e(ji7Var);
                int i = ji7Var.c;
                int i2 = ji7Var.b;
                if (j < i - i2) {
                    break;
                }
                j -= i - i2;
                ji7Var = ji7Var.f;
            }
            while (j2 > 0) {
                zq3.e(ji7Var);
                ji7 d = ji7Var.d();
                int i3 = d.b + ((int) j);
                d.b = i3;
                d.c = Math.min(i3 + ((int) j2), d.c);
                ji7 ji7Var2 = ad0Var.a;
                if (ji7Var2 == null) {
                    d.g = d;
                    d.f = d;
                    ad0Var.a = d;
                } else {
                    zq3.e(ji7Var2);
                    ji7 ji7Var3 = ji7Var2.g;
                    zq3.e(ji7Var3);
                    ji7Var3.c(d);
                }
                j2 -= d.c - d.b;
                ji7Var = ji7Var.f;
                j = 0;
            }
        }
        return this;
    }

    @Override // defpackage.sd0
    public byte[] i0(long j) {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (h1() < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    @Override // defpackage.sd0
    public String i1() {
        return F0(this.b, yj0.b);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // defpackage.sd0
    public short k0() {
        return p.j(readShort());
    }

    @Override // defpackage.qd0
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public ad0 e() {
        return this;
    }

    @Override // defpackage.sd0
    public long l0() {
        return p.i(readLong());
    }

    @Override // defpackage.qd0
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public ad0 O() {
        return this;
    }

    @Override // defpackage.sd0
    public void o0(long j) {
        if (this.b < j) {
            throw new EOFException();
        }
    }

    @Override // defpackage.sd0
    public sd0 peek() {
        return wd5.d(new uq5(this));
    }

    public final byte r(long j) {
        p.b(h1(), j, 1L);
        ji7 ji7Var = this.a;
        if (ji7Var == null) {
            zq3.e(null);
            throw null;
        }
        if (h1() - j < j) {
            long h1 = h1();
            while (h1 > j) {
                ji7Var = ji7Var.g;
                zq3.e(ji7Var);
                h1 -= ji7Var.c - ji7Var.b;
            }
            zq3.e(ji7Var);
            return ji7Var.a[(int) ((ji7Var.b + j) - h1)];
        }
        long j2 = 0;
        while (true) {
            long j3 = (ji7Var.c - ji7Var.b) + j2;
            if (j3 > j) {
                zq3.e(ji7Var);
                return ji7Var.a[(int) ((ji7Var.b + j) - j2)];
            }
            ji7Var = ji7Var.f;
            zq3.e(ji7Var);
            j2 = j3;
        }
    }

    @Override // defpackage.sd0
    public void r0(ad0 ad0Var, long j) {
        zq3.h(ad0Var, "sink");
        if (h1() >= j) {
            ad0Var.write(this, j);
        } else {
            ad0Var.write(this, h1());
            throw new EOFException();
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        zq3.h(byteBuffer, "sink");
        ji7 ji7Var = this.a;
        if (ji7Var == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), ji7Var.c - ji7Var.b);
        byteBuffer.put(ji7Var.a, ji7Var.b, min);
        int i = ji7Var.b + min;
        ji7Var.b = i;
        this.b -= min;
        if (i == ji7Var.c) {
            this.a = ji7Var.b();
            li7.b(ji7Var);
        }
        return min;
    }

    @Override // defpackage.sd0
    public byte readByte() {
        if (h1() == 0) {
            throw new EOFException();
        }
        ji7 ji7Var = this.a;
        zq3.e(ji7Var);
        int i = ji7Var.b;
        int i2 = ji7Var.c;
        int i3 = i + 1;
        byte b2 = ji7Var.a[i];
        e1(h1() - 1);
        if (i3 == i2) {
            this.a = ji7Var.b();
            li7.b(ji7Var);
        } else {
            ji7Var.b = i3;
        }
        return b2;
    }

    @Override // defpackage.sd0
    public void readFully(byte[] bArr) {
        zq3.h(bArr, "sink");
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
    }

    @Override // defpackage.sd0
    public int readInt() {
        if (h1() < 4) {
            throw new EOFException();
        }
        ji7 ji7Var = this.a;
        zq3.e(ji7Var);
        int i = ji7Var.b;
        int i2 = ji7Var.c;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = ji7Var.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        e1(h1() - 4);
        if (i5 == i2) {
            this.a = ji7Var.b();
            li7.b(ji7Var);
        } else {
            ji7Var.b = i5;
        }
        return i6;
    }

    @Override // defpackage.sd0
    public long readLong() {
        if (h1() < 8) {
            throw new EOFException();
        }
        ji7 ji7Var = this.a;
        zq3.e(ji7Var);
        int i = ji7Var.b;
        int i2 = ji7Var.c;
        if (i2 - i < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = ji7Var.a;
        int i3 = i + 7;
        long j = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        int i4 = i + 8;
        long j2 = j | (bArr[i3] & 255);
        e1(h1() - 8);
        if (i4 == i2) {
            this.a = ji7Var.b();
            li7.b(ji7Var);
        } else {
            ji7Var.b = i4;
        }
        return j2;
    }

    @Override // defpackage.sd0
    public short readShort() {
        if (h1() < 2) {
            throw new EOFException();
        }
        ji7 ji7Var = this.a;
        zq3.e(ji7Var);
        int i = ji7Var.b;
        int i2 = ji7Var.c;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = ji7Var.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        e1(h1() - 2);
        if (i5 == i2) {
            this.a = ji7Var.b();
            li7.b(ji7Var);
        } else {
            ji7Var.b = i5;
        }
        return (short) i6;
    }

    @Override // defpackage.sd0
    public boolean request(long j) {
        return this.b >= j;
    }

    public long s(ByteString byteString, long j) {
        long j2;
        int i;
        long j3 = j;
        zq3.h(byteString, "bytes");
        if (byteString.E() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j4 = 0;
        if (j3 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j3).toString());
        }
        ji7 ji7Var = this.a;
        if (ji7Var != null) {
            if (h1() - j3 < j3) {
                j2 = h1();
                while (j2 > j3) {
                    ji7Var = ji7Var.g;
                    zq3.e(ji7Var);
                    j2 -= ji7Var.c - ji7Var.b;
                }
                byte[] s = byteString.s();
                byte b2 = s[0];
                int E = byteString.E();
                long h1 = (h1() - E) + 1;
                while (j2 < h1) {
                    byte[] bArr = ji7Var.a;
                    int min = (int) Math.min(ji7Var.c, (ji7Var.b + h1) - j2);
                    i = (int) ((ji7Var.b + j3) - j2);
                    while (i < min) {
                        if (bArr[i] == b2 && defpackage.b.c(ji7Var, i + 1, s, 1, E)) {
                            return (i - ji7Var.b) + j2;
                        }
                        i++;
                    }
                    j2 += ji7Var.c - ji7Var.b;
                    ji7Var = ji7Var.f;
                    zq3.e(ji7Var);
                    j3 = j2;
                }
            } else {
                while (true) {
                    long j5 = (ji7Var.c - ji7Var.b) + j4;
                    if (j5 > j3) {
                        break;
                    }
                    ji7Var = ji7Var.f;
                    zq3.e(ji7Var);
                    j4 = j5;
                }
                byte[] s2 = byteString.s();
                byte b3 = s2[0];
                int E2 = byteString.E();
                long h12 = (h1() - E2) + 1;
                j2 = j4;
                while (j2 < h12) {
                    byte[] bArr2 = ji7Var.a;
                    long j6 = h12;
                    int min2 = (int) Math.min(ji7Var.c, (ji7Var.b + h12) - j2);
                    i = (int) ((ji7Var.b + j3) - j2);
                    while (i < min2) {
                        if (bArr2[i] == b3 && defpackage.b.c(ji7Var, i + 1, s2, 1, E2)) {
                            return (i - ji7Var.b) + j2;
                        }
                        i++;
                    }
                    j2 += ji7Var.c - ji7Var.b;
                    ji7Var = ji7Var.f;
                    zq3.e(ji7Var);
                    h12 = j6;
                    j3 = j2;
                }
            }
        }
        return -1L;
    }

    @Override // defpackage.sd0
    public String s0(long j) {
        return F0(j, yj0.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7 A[EDGE_INSN: B:40:0x00a7->B:37:0x00a7 BREAK  A[LOOP:0: B:4:0x000d->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    @Override // defpackage.sd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long s1() {
        /*
            r14 = this;
            long r0 = r14.h1()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb1
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            ji7 r6 = r14.a
            defpackage.zq3.e(r6)
            byte[] r7 = r6.a
            int r8 = r6.b
            int r9 = r6.c
        L18:
            if (r8 >= r9) goto L93
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L27
            r11 = 57
            if (r10 > r11) goto L27
            int r11 = r10 + (-48)
            goto L3c
        L27:
            r11 = 97
            if (r10 < r11) goto L32
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L32
            int r11 = r10 + (-87)
            goto L3c
        L32:
            r11 = 65
            if (r10 < r11) goto L74
            r11 = 70
            if (r10 > r11) goto L74
            int r11 = r10 + (-55)
        L3c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L4c:
            ad0 r14 = new ad0
            r14.<init>()
            ad0 r14 = r14.Z0(r4)
            ad0 r14 = r14.D0(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Number too large: "
            r1.append(r2)
            java.lang.String r14 = r14.i1()
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        L74:
            if (r0 == 0) goto L78
            r1 = 1
            goto L93
        L78:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.append(r1)
            java.lang.String r1 = defpackage.p.k(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L93:
            if (r8 != r9) goto L9f
            ji7 r7 = r6.b()
            r14.a = r7
            defpackage.li7.b(r6)
            goto La1
        L9f:
            r6.b = r8
        La1:
            if (r1 != 0) goto La7
            ji7 r6 = r14.a
            if (r6 != 0) goto Ld
        La7:
            long r1 = r14.h1()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.e1(r1)
            return r4
        Lb1:
            java.io.EOFException r14 = new java.io.EOFException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ad0.s1():long");
    }

    @Override // defpackage.sd0
    public void skip(long j) {
        while (j > 0) {
            ji7 ji7Var = this.a;
            if (ji7Var == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, ji7Var.c - ji7Var.b);
            long j2 = min;
            e1(h1() - j2);
            j -= j2;
            int i = ji7Var.b + min;
            ji7Var.b = i;
            if (i == ji7Var.c) {
                this.a = ji7Var.b();
                li7.b(ji7Var);
            }
        }
    }

    @Override // defpackage.sd0
    public InputStream t1() {
        return new a();
    }

    @Override // defpackage.px7, defpackage.yt7
    public pm8 timeout() {
        return pm8.NONE;
    }

    public String toString() {
        return u1().toString();
    }

    @Override // defpackage.sd0
    public ByteString u0(long j) {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (h1() < j) {
            throw new EOFException();
        }
        if (j < PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            return new ByteString(i0(j));
        }
        ByteString v1 = v1((int) j);
        skip(j);
        return v1;
    }

    public final ByteString u1() {
        if (h1() <= 2147483647L) {
            return v1((int) h1());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + h1()).toString());
    }

    public final ByteString v1(int i) {
        if (i == 0) {
            return ByteString.d;
        }
        p.b(h1(), 0L, i);
        ji7 ji7Var = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            zq3.e(ji7Var);
            int i5 = ji7Var.c;
            int i6 = ji7Var.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            ji7Var = ji7Var.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        ji7 ji7Var2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            zq3.e(ji7Var2);
            bArr[i7] = ji7Var2.a;
            i2 += ji7Var2.c - ji7Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = ji7Var2.b;
            ji7Var2.d = true;
            i7++;
            ji7Var2 = ji7Var2.f;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    public final ji7 w1(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        ji7 ji7Var = this.a;
        if (ji7Var == null) {
            ji7 c2 = li7.c();
            this.a = c2;
            c2.g = c2;
            c2.f = c2;
            return c2;
        }
        zq3.e(ji7Var);
        ji7 ji7Var2 = ji7Var.g;
        zq3.e(ji7Var2);
        if (ji7Var2.c + i > 8192 || !ji7Var2.e) {
            ji7Var2 = ji7Var2.c(li7.c());
        }
        return ji7Var2;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        zq3.h(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            ji7 w1 = w1(1);
            int min = Math.min(i, 8192 - w1.c);
            byteBuffer.get(w1.a, w1.c, min);
            i -= min;
            w1.c += min;
        }
        this.b += remaining;
        return remaining;
    }

    public ad0 x1(px7 px7Var, long j) {
        zq3.h(px7Var, "source");
        while (j > 0) {
            long read = px7Var.read(this, j);
            if (read == -1) {
                throw new EOFException();
            }
            j -= read;
        }
        return this;
    }

    @Override // defpackage.sd0
    public int y0(tk5 tk5Var) {
        zq3.h(tk5Var, "options");
        int f = defpackage.b.f(this, tk5Var, false, 2, null);
        if (f == -1) {
            return -1;
        }
        skip(tk5Var.g()[f].E());
        return f;
    }

    @Override // defpackage.qd0
    /* renamed from: y1, reason: merged with bridge method [inline-methods] */
    public ad0 m1(ByteString byteString) {
        zq3.h(byteString, "byteString");
        byteString.L(this, 0, byteString.E());
        return this;
    }

    @Override // defpackage.sd0
    public ad0 z() {
        return this;
    }

    @Override // defpackage.qd0
    /* renamed from: z1, reason: merged with bridge method [inline-methods] */
    public ad0 j0(byte[] bArr) {
        zq3.h(bArr, "source");
        return p(bArr, 0, bArr.length);
    }

    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(ad0.this.h1(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (ad0.this.h1() > 0) {
                return ad0.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return ad0.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            zq3.h(bArr, "sink");
            return ad0.this.read(bArr, i, i2);
        }
    }

    @Override // defpackage.yt7
    public void write(ad0 ad0Var, long j) {
        ji7 ji7Var;
        zq3.h(ad0Var, "source");
        if (ad0Var != this) {
            p.b(ad0Var.h1(), 0L, j);
            while (j > 0) {
                ji7 ji7Var2 = ad0Var.a;
                zq3.e(ji7Var2);
                int i = ji7Var2.c;
                zq3.e(ad0Var.a);
                if (j < i - r1.b) {
                    ji7 ji7Var3 = this.a;
                    if (ji7Var3 != null) {
                        zq3.e(ji7Var3);
                        ji7Var = ji7Var3.g;
                    } else {
                        ji7Var = null;
                    }
                    if (ji7Var != null && ji7Var.e) {
                        if ((ji7Var.c + j) - (ji7Var.d ? 0 : ji7Var.b) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                            ji7 ji7Var4 = ad0Var.a;
                            zq3.e(ji7Var4);
                            ji7Var4.g(ji7Var, (int) j);
                            ad0Var.e1(ad0Var.h1() - j);
                            e1(h1() + j);
                            return;
                        }
                    }
                    ji7 ji7Var5 = ad0Var.a;
                    zq3.e(ji7Var5);
                    ad0Var.a = ji7Var5.e((int) j);
                }
                ji7 ji7Var6 = ad0Var.a;
                zq3.e(ji7Var6);
                long j2 = ji7Var6.c - ji7Var6.b;
                ad0Var.a = ji7Var6.b();
                ji7 ji7Var7 = this.a;
                if (ji7Var7 == null) {
                    this.a = ji7Var6;
                    ji7Var6.g = ji7Var6;
                    ji7Var6.f = ji7Var6;
                } else {
                    zq3.e(ji7Var7);
                    ji7 ji7Var8 = ji7Var7.g;
                    zq3.e(ji7Var8);
                    ji7Var8.c(ji7Var6).a();
                }
                ad0Var.e1(ad0Var.h1() - j2);
                e1(h1() + j2);
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    public int read(byte[] bArr, int i, int i2) {
        zq3.h(bArr, "sink");
        p.b(bArr.length, i, i2);
        ji7 ji7Var = this.a;
        if (ji7Var == null) {
            return -1;
        }
        int min = Math.min(i2, ji7Var.c - ji7Var.b);
        byte[] bArr2 = ji7Var.a;
        int i3 = ji7Var.b;
        d.f(bArr2, bArr, i, i3, i3 + min);
        ji7Var.b += min;
        e1(h1() - min);
        if (ji7Var.b == ji7Var.c) {
            this.a = ji7Var.b();
            li7.b(ji7Var);
        }
        return min;
    }

    @Override // defpackage.px7
    public long read(ad0 ad0Var, long j) {
        zq3.h(ad0Var, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (h1() == 0) {
            return -1L;
        }
        if (j > h1()) {
            j = h1();
        }
        ad0Var.write(this, j);
        return j;
    }
}
