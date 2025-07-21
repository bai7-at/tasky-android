package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Utf8;
import com.amazonaws.event.ProgressEvent;
import defpackage.qf0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class CodedOutputStream extends qf0 {
    private static final Logger c = Logger.getLogger(CodedOutputStream.class.getName());
    private static final boolean d = a1.C();
    h a;
    private boolean b;

    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private static abstract class b extends CodedOutputStream {
        final byte[] e;
        final int f;
        int g;
        int h;

        b(int i) {
            super();
            if (i < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i, 20)];
            this.e = bArr;
            this.f = bArr.length;
        }

        final void S0(byte b) {
            byte[] bArr = this.e;
            int i = this.g;
            this.g = i + 1;
            bArr[i] = b;
            this.h++;
        }

        final void T0(int i) {
            byte[] bArr = this.e;
            int i2 = this.g;
            int i3 = i2 + 1;
            this.g = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.g = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.g = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.g = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
            this.h += 4;
        }

        final void U0(long j) {
            byte[] bArr = this.e;
            int i = this.g;
            int i2 = i + 1;
            this.g = i2;
            bArr[i] = (byte) (j & 255);
            int i3 = i + 2;
            this.g = i3;
            bArr[i2] = (byte) ((j >> 8) & 255);
            int i4 = i + 3;
            this.g = i4;
            bArr[i3] = (byte) ((j >> 16) & 255);
            int i5 = i + 4;
            this.g = i5;
            bArr[i4] = (byte) (255 & (j >> 24));
            int i6 = i + 5;
            this.g = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.g = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.g = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.g = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            this.h += 8;
        }

        final void V0(int i) {
            if (i >= 0) {
                X0(i);
            } else {
                Y0(i);
            }
        }

        final void W0(int i, int i2) {
            X0(WireFormat.c(i, i2));
        }

        final void X0(int i) {
            if (!CodedOutputStream.d) {
                while ((i & (-128)) != 0) {
                    byte[] bArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    this.h++;
                    i >>>= 7;
                }
                byte[] bArr2 = this.e;
                int i3 = this.g;
                this.g = i3 + 1;
                bArr2[i3] = (byte) i;
                this.h++;
                return;
            }
            long j = this.g;
            while ((i & (-128)) != 0) {
                byte[] bArr3 = this.e;
                int i4 = this.g;
                this.g = i4 + 1;
                a1.H(bArr3, i4, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            byte[] bArr4 = this.e;
            int i5 = this.g;
            this.g = i5 + 1;
            a1.H(bArr4, i5, (byte) i);
            this.h += (int) (this.g - j);
        }

        final void Y0(long j) {
            if (!CodedOutputStream.d) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    this.h++;
                    j >>>= 7;
                }
                byte[] bArr2 = this.e;
                int i2 = this.g;
                this.g = i2 + 1;
                bArr2[i2] = (byte) j;
                this.h++;
                return;
            }
            long j2 = this.g;
            while ((j & (-128)) != 0) {
                byte[] bArr3 = this.e;
                int i3 = this.g;
                this.g = i3 + 1;
                a1.H(bArr3, i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.e;
            int i4 = this.g;
            this.g = i4 + 1;
            a1.H(bArr4, i4, (byte) j);
            this.h += (int) (this.g - j2);
        }
    }

    private static final class c extends b {
        private final OutputStream i;

        c(OutputStream outputStream, int i) {
            super(i);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.i = outputStream;
        }

        private void Z0() {
            this.i.write(this.e, 0, this.g);
            this.g = 0;
        }

        private void a1(int i) {
            if (this.f - this.g < i) {
                Z0();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void A0(f0 f0Var) {
            P0(f0Var.b());
            f0Var.e(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void B0(int i, f0 f0Var) {
            N0(1, 3);
            O0(2, i);
            c1(3, f0Var);
            N0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void C0(int i, ByteString byteString) {
            N0(1, 3);
            O0(2, i);
            f0(3, byteString);
            N0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void L0(int i, String str) {
            N0(i, 2);
            M0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void M0(String str) {
            int g;
            try {
                int length = str.length() * 3;
                int R = CodedOutputStream.R(length);
                int i = R + length;
                int i2 = this.f;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int f = Utf8.f(str, bArr, 0, length);
                    P0(f);
                    a(bArr, 0, f);
                    return;
                }
                if (i > i2 - this.g) {
                    Z0();
                }
                int R2 = CodedOutputStream.R(str.length());
                int i3 = this.g;
                try {
                    if (R2 == R) {
                        int i4 = i3 + R2;
                        this.g = i4;
                        int f2 = Utf8.f(str, this.e, i4, this.f - i4);
                        this.g = i3;
                        g = (f2 - i3) - R2;
                        X0(g);
                        this.g = f2;
                    } else {
                        g = Utf8.g(str);
                        X0(g);
                        this.g = Utf8.f(str, this.e, this.g, g);
                    }
                    this.h += g;
                } catch (Utf8.UnpairedSurrogateException e) {
                    this.h -= this.g - i3;
                    this.g = i3;
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(e2);
                }
            } catch (Utf8.UnpairedSurrogateException e3) {
                X(str, e3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void N0(int i, int i2) {
            P0(WireFormat.c(i, i2));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void O0(int i, int i2) {
            a1(20);
            W0(i, 0);
            X0(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void P0(int i) {
            a1(5);
            X0(i);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void Q0(int i, long j) {
            a1(20);
            W0(i, 0);
            Y0(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void R0(long j) {
            a1(10);
            Y0(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void W() {
            if (this.g > 0) {
                Z0();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, defpackage.qf0
        public void a(byte[] bArr, int i, int i2) {
            b1(bArr, i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void a0(byte b) {
            if (this.g == this.f) {
                Z0();
            }
            S0(b);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void b0(int i, boolean z) {
            a1(11);
            W0(i, 0);
            S0(z ? (byte) 1 : (byte) 0);
        }

        public void b1(byte[] bArr, int i, int i2) {
            int i3 = this.f;
            int i4 = this.g;
            if (i3 - i4 >= i2) {
                System.arraycopy(bArr, i, this.e, i4, i2);
                this.g += i2;
                this.h += i2;
                return;
            }
            int i5 = i3 - i4;
            System.arraycopy(bArr, i, this.e, i4, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.g = this.f;
            this.h += i5;
            Z0();
            if (i7 <= this.f) {
                System.arraycopy(bArr, i6, this.e, 0, i7);
                this.g = i7;
            } else {
                this.i.write(bArr, i6, i7);
            }
            this.h += i7;
        }

        public void c1(int i, f0 f0Var) {
            N0(i, 2);
            A0(f0Var);
        }

        void d1(f0 f0Var, r0 r0Var) {
            P0(((androidx.datastore.preferences.protobuf.a) f0Var).h(r0Var));
            r0Var.i(f0Var, this.a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void e0(byte[] bArr, int i, int i2) {
            P0(i2);
            b1(bArr, i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void f0(int i, ByteString byteString) {
            N0(i, 2);
            g0(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void g0(ByteString byteString) {
            P0(byteString.size());
            byteString.D(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void l0(int i, int i2) {
            a1(14);
            W0(i, 5);
            T0(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void m0(int i) {
            a1(4);
            T0(i);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void n0(int i, long j) {
            a1(18);
            W0(i, 1);
            U0(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void o0(long j) {
            a1(8);
            U0(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void v0(int i, int i2) {
            a1(20);
            W0(i, 0);
            V0(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void w0(int i) {
            if (i >= 0) {
                P0(i);
            } else {
                R0(i);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        void z0(int i, f0 f0Var, r0 r0Var) {
            N0(i, 2);
            d1(f0Var, r0Var);
        }
    }

    public static int A(f0 f0Var) {
        return y(f0Var.b());
    }

    static int B(f0 f0Var, r0 r0Var) {
        return y(((androidx.datastore.preferences.protobuf.a) f0Var).h(r0Var));
    }

    static int C(int i) {
        return i > 4096 ? ProgressEvent.PART_FAILED_EVENT_CODE : i;
    }

    public static int D(int i, ByteString byteString) {
        return (P(1) * 2) + Q(2, i) + f(3, byteString);
    }

    public static int E(int i) {
        return R(i);
    }

    public static int F(int i, int i2) {
        return P(i) + G(i2);
    }

    public static int G(int i) {
        return 4;
    }

    public static int H(int i, long j) {
        return P(i) + I(j);
    }

    public static int I(long j) {
        return 8;
    }

    public static int J(int i, int i2) {
        return P(i) + K(i2);
    }

    public static int K(int i) {
        return R(U(i));
    }

    public static int L(int i, long j) {
        return P(i) + M(j);
    }

    public static int M(long j) {
        return T(V(j));
    }

    public static int N(int i, String str) {
        return P(i) + O(str);
    }

    public static int O(String str) {
        int length;
        try {
            length = Utf8.g(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(t.a).length;
        }
        return y(length);
    }

    public static int P(int i) {
        return R(WireFormat.c(i, 0));
    }

    public static int Q(int i, int i2) {
        return P(i) + R(i2);
    }

    public static int R(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int S(int i, long j) {
        return P(i) + T(j);
    }

    public static int T(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int U(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long V(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static CodedOutputStream Z(OutputStream outputStream, int i) {
        return new c(outputStream, i);
    }

    public static int c(int i, boolean z) {
        return P(i) + d(z);
    }

    public static int d(boolean z) {
        return 1;
    }

    public static int e(byte[] bArr) {
        return y(bArr.length);
    }

    public static int f(int i, ByteString byteString) {
        return P(i) + g(byteString);
    }

    public static int g(ByteString byteString) {
        return y(byteString.size());
    }

    public static int h(int i, double d2) {
        return P(i) + i(d2);
    }

    public static int i(double d2) {
        return 8;
    }

    public static int j(int i, int i2) {
        return P(i) + k(i2);
    }

    public static int k(int i) {
        return v(i);
    }

    public static int l(int i, int i2) {
        return P(i) + m(i2);
    }

    public static int m(int i) {
        return 4;
    }

    public static int n(int i, long j) {
        return P(i) + o(j);
    }

    public static int o(long j) {
        return 8;
    }

    public static int p(int i, float f) {
        return P(i) + q(f);
    }

    public static int q(float f) {
        return 4;
    }

    static int r(int i, f0 f0Var, r0 r0Var) {
        return (P(i) * 2) + t(f0Var, r0Var);
    }

    public static int s(f0 f0Var) {
        return f0Var.b();
    }

    static int t(f0 f0Var, r0 r0Var) {
        return ((androidx.datastore.preferences.protobuf.a) f0Var).h(r0Var);
    }

    public static int u(int i, int i2) {
        return P(i) + v(i2);
    }

    public static int v(int i) {
        if (i >= 0) {
            return R(i);
        }
        return 10;
    }

    public static int w(int i, long j) {
        return P(i) + x(j);
    }

    public static int x(long j) {
        return T(j);
    }

    static int y(int i) {
        return R(i) + i;
    }

    static int z(int i, f0 f0Var, r0 r0Var) {
        return P(i) + B(f0Var, r0Var);
    }

    public abstract void A0(f0 f0Var);

    public abstract void B0(int i, f0 f0Var);

    public abstract void C0(int i, ByteString byteString);

    public final void D0(int i, int i2) {
        l0(i, i2);
    }

    public final void E0(int i) {
        m0(i);
    }

    public final void F0(int i, long j) {
        n0(i, j);
    }

    public final void G0(long j) {
        o0(j);
    }

    public final void H0(int i, int i2) {
        O0(i, U(i2));
    }

    public final void I0(int i) {
        P0(U(i));
    }

    public final void J0(int i, long j) {
        Q0(i, V(j));
    }

    public final void K0(long j) {
        R0(V(j));
    }

    public abstract void L0(int i, String str);

    public abstract void M0(String str);

    public abstract void N0(int i, int i2);

    public abstract void O0(int i, int i2);

    public abstract void P0(int i);

    public abstract void Q0(int i, long j);

    public abstract void R0(long j);

    public abstract void W();

    final void X(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) {
        c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(t.a);
        try {
            P0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new OutOfSpaceException(e2);
        }
    }

    boolean Y() {
        return this.b;
    }

    @Override // defpackage.qf0
    public abstract void a(byte[] bArr, int i, int i2);

    public abstract void a0(byte b2);

    public abstract void b0(int i, boolean z);

    public final void c0(boolean z) {
        a0(z ? (byte) 1 : (byte) 0);
    }

    public final void d0(byte[] bArr) {
        e0(bArr, 0, bArr.length);
    }

    abstract void e0(byte[] bArr, int i, int i2);

    public abstract void f0(int i, ByteString byteString);

    public abstract void g0(ByteString byteString);

    public final void h0(int i, double d2) {
        n0(i, Double.doubleToRawLongBits(d2));
    }

    public final void i0(double d2) {
        o0(Double.doubleToRawLongBits(d2));
    }

    public final void j0(int i, int i2) {
        v0(i, i2);
    }

    public final void k0(int i) {
        w0(i);
    }

    public abstract void l0(int i, int i2);

    public abstract void m0(int i);

    public abstract void n0(int i, long j);

    public abstract void o0(long j);

    public final void p0(int i, float f) {
        l0(i, Float.floatToRawIntBits(f));
    }

    public final void q0(float f) {
        m0(Float.floatToRawIntBits(f));
    }

    public final void r0(int i, f0 f0Var) {
        N0(i, 3);
        t0(f0Var);
        N0(i, 4);
    }

    final void s0(int i, f0 f0Var, r0 r0Var) {
        N0(i, 3);
        u0(f0Var, r0Var);
        N0(i, 4);
    }

    public final void t0(f0 f0Var) {
        f0Var.e(this);
    }

    final void u0(f0 f0Var, r0 r0Var) {
        r0Var.i(f0Var, this.a);
    }

    public abstract void v0(int i, int i2);

    public abstract void w0(int i);

    public final void x0(int i, long j) {
        Q0(i, j);
    }

    public final void y0(long j) {
        R0(j);
    }

    abstract void z0(int i, f0 f0Var, r0 r0Var);

    private CodedOutputStream() {
    }
}
