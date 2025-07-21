package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.Utf8;
import defpackage.pf0;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class CodedOutputStream extends pf0 {
    private static final Logger c = Logger.getLogger(CodedOutputStream.class.getName());
    private static final boolean d = z0.C();
    i a;
    private boolean b;

    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    private static class b extends CodedOutputStream {
        private final byte[] e;
        private final int f;
        private final int g;
        private int h;

        b(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            this.e = bArr;
            this.f = i;
            this.h = i;
            this.g = i3;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void C0(int i, String str) {
            D0(i, 2);
            M0(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void D0(int i, int i2) {
            F0(WireFormat.c(i, i2));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void E0(int i, int i2) {
            D0(i, 0);
            F0(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void F0(int i) {
            if (!CodedOutputStream.d || d.c() || W() < 5) {
                while ((i & (-128)) != 0) {
                    try {
                        byte[] bArr = this.e;
                        int i2 = this.h;
                        this.h = i2 + 1;
                        bArr[i2] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
                    }
                }
                byte[] bArr2 = this.e;
                int i3 = this.h;
                this.h = i3 + 1;
                bArr2[i3] = (byte) i;
                return;
            }
            if ((i & (-128)) == 0) {
                byte[] bArr3 = this.e;
                int i4 = this.h;
                this.h = i4 + 1;
                z0.H(bArr3, i4, (byte) i);
                return;
            }
            byte[] bArr4 = this.e;
            int i5 = this.h;
            this.h = i5 + 1;
            z0.H(bArr4, i5, (byte) (i | 128));
            int i6 = i >>> 7;
            if ((i6 & (-128)) == 0) {
                byte[] bArr5 = this.e;
                int i7 = this.h;
                this.h = i7 + 1;
                z0.H(bArr5, i7, (byte) i6);
                return;
            }
            byte[] bArr6 = this.e;
            int i8 = this.h;
            this.h = i8 + 1;
            z0.H(bArr6, i8, (byte) (i6 | 128));
            int i9 = i >>> 14;
            if ((i9 & (-128)) == 0) {
                byte[] bArr7 = this.e;
                int i10 = this.h;
                this.h = i10 + 1;
                z0.H(bArr7, i10, (byte) i9);
                return;
            }
            byte[] bArr8 = this.e;
            int i11 = this.h;
            this.h = i11 + 1;
            z0.H(bArr8, i11, (byte) (i9 | 128));
            int i12 = i >>> 21;
            if ((i12 & (-128)) == 0) {
                byte[] bArr9 = this.e;
                int i13 = this.h;
                this.h = i13 + 1;
                z0.H(bArr9, i13, (byte) i12);
                return;
            }
            byte[] bArr10 = this.e;
            int i14 = this.h;
            this.h = i14 + 1;
            z0.H(bArr10, i14, (byte) (i12 | 128));
            byte[] bArr11 = this.e;
            int i15 = this.h;
            this.h = i15 + 1;
            z0.H(bArr11, i15, (byte) (i >>> 28));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void G0(int i, long j) {
            D0(i, 0);
            H0(j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void H0(long j) {
            if (CodedOutputStream.d && W() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.e;
                    int i = this.h;
                    this.h = i + 1;
                    z0.H(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.e;
                int i2 = this.h;
                this.h = i2 + 1;
                z0.H(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.e;
                    int i3 = this.h;
                    this.h = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
                }
            }
            byte[] bArr4 = this.e;
            int i4 = this.h;
            this.h = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        public final void I0(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.e, this.h, i2);
                this.h += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), Integer.valueOf(i2)), e);
            }
        }

        public final void J0(ByteString byteString) {
            F0(byteString.size());
            byteString.H(this);
        }

        public final void K0(int i, f0 f0Var) {
            D0(i, 2);
            L0(f0Var);
        }

        public final void L0(f0 f0Var) {
            F0(f0Var.b());
            f0Var.g(this);
        }

        public final void M0(String str) {
            int i = this.h;
            try {
                int N = CodedOutputStream.N(str.length() * 3);
                int N2 = CodedOutputStream.N(str.length());
                if (N2 == N) {
                    int i2 = i + N2;
                    this.h = i2;
                    int f = Utf8.f(str, this.e, i2, W());
                    this.h = i;
                    F0((f - i) - N2);
                    this.h = f;
                } else {
                    F0(Utf8.g(str));
                    this.h = Utf8.f(str, this.e, this.h, W());
                }
            } catch (Utf8.UnpairedSurrogateException e) {
                this.h = i;
                S(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final int W() {
            return this.g - this.h;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void X(byte b) {
            try {
                byte[] bArr = this.e;
                int i = this.h;
                this.h = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void Y(int i, boolean z) {
            D0(i, 0);
            X(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, defpackage.pf0
        public final void a(byte[] bArr, int i, int i2) {
            I0(bArr, i, i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void a0(int i, ByteString byteString) {
            D0(i, 2);
            J0(byteString);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void f0(int i, int i2) {
            D0(i, 5);
            g0(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void g0(int i) {
            try {
                byte[] bArr = this.e;
                int i2 = this.h;
                int i3 = i2 + 1;
                this.h = i3;
                bArr[i2] = (byte) (i & 255);
                int i4 = i2 + 2;
                this.h = i4;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i2 + 3;
                this.h = i5;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.h = i2 + 4;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void h0(int i, long j) {
            D0(i, 1);
            i0(j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void i0(long j) {
            try {
                byte[] bArr = this.e;
                int i = this.h;
                int i2 = i + 1;
                this.h = i2;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i + 2;
                this.h = i3;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i + 3;
                this.h = i4;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i + 4;
                this.h = i5;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i + 5;
                this.h = i6;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i + 6;
                this.h = i7;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i + 7;
                this.h = i8;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.h = i + 8;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void n0(int i, int i2) {
            D0(i, 0);
            o0(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void o0(int i) {
            if (i >= 0) {
                F0(i);
            } else {
                H0(i);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        final void r0(int i, f0 f0Var, r0 r0Var) {
            D0(i, 2);
            F0(((com.google.crypto.tink.shaded.protobuf.a) f0Var).i(r0Var));
            r0Var.j(f0Var, this.a);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void s0(int i, f0 f0Var) {
            D0(1, 3);
            E0(2, i);
            K0(3, f0Var);
            D0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void t0(int i, ByteString byteString) {
            D0(1, 3);
            E0(2, i);
            a0(3, byteString);
            D0(1, 4);
        }
    }

    public static int A(int i, ByteString byteString) {
        return (L(1) * 2) + M(2, i) + f(3, byteString);
    }

    public static int B(int i, int i2) {
        return L(i) + C(i2);
    }

    public static int C(int i) {
        return 4;
    }

    public static int D(int i, long j) {
        return L(i) + E(j);
    }

    public static int E(long j) {
        return 8;
    }

    public static int F(int i, int i2) {
        return L(i) + G(i2);
    }

    public static int G(int i) {
        return N(Q(i));
    }

    public static int H(int i, long j) {
        return L(i) + I(j);
    }

    public static int I(long j) {
        return P(R(j));
    }

    public static int J(int i, String str) {
        return L(i) + K(str);
    }

    public static int K(String str) {
        int length;
        try {
            length = Utf8.g(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(u.a).length;
        }
        return x(length);
    }

    public static int L(int i) {
        return N(WireFormat.c(i, 0));
    }

    public static int M(int i, int i2) {
        return L(i) + N(i2);
    }

    public static int N(int i) {
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

    public static int O(int i, long j) {
        return L(i) + P(j);
    }

    public static int P(long j) {
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

    public static int Q(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long R(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static CodedOutputStream U(byte[] bArr) {
        return V(bArr, 0, bArr.length);
    }

    public static CodedOutputStream V(byte[] bArr, int i, int i2) {
        return new b(bArr, i, i2);
    }

    public static int d(int i, boolean z) {
        return L(i) + e(z);
    }

    public static int e(boolean z) {
        return 1;
    }

    public static int f(int i, ByteString byteString) {
        return L(i) + g(byteString);
    }

    public static int g(ByteString byteString) {
        return x(byteString.size());
    }

    public static int h(int i, double d2) {
        return L(i) + i(d2);
    }

    public static int i(double d2) {
        return 8;
    }

    public static int j(int i, int i2) {
        return L(i) + k(i2);
    }

    public static int k(int i) {
        return u(i);
    }

    public static int l(int i, int i2) {
        return L(i) + m(i2);
    }

    public static int m(int i) {
        return 4;
    }

    public static int n(int i, long j) {
        return L(i) + o(j);
    }

    public static int o(long j) {
        return 8;
    }

    public static int p(int i, float f) {
        return L(i) + q(f);
    }

    public static int q(float f) {
        return 4;
    }

    static int r(int i, f0 f0Var, r0 r0Var) {
        return (L(i) * 2) + s(f0Var, r0Var);
    }

    static int s(f0 f0Var, r0 r0Var) {
        return ((com.google.crypto.tink.shaded.protobuf.a) f0Var).i(r0Var);
    }

    public static int t(int i, int i2) {
        return L(i) + u(i2);
    }

    public static int u(int i) {
        if (i >= 0) {
            return N(i);
        }
        return 10;
    }

    public static int v(int i, long j) {
        return L(i) + w(j);
    }

    public static int w(long j) {
        return P(j);
    }

    static int x(int i) {
        return N(i) + i;
    }

    static int y(int i, f0 f0Var, r0 r0Var) {
        return L(i) + z(f0Var, r0Var);
    }

    static int z(f0 f0Var, r0 r0Var) {
        return x(((com.google.crypto.tink.shaded.protobuf.a) f0Var).i(r0Var));
    }

    public final void A0(int i, long j) {
        G0(i, R(j));
    }

    public final void B0(long j) {
        H0(R(j));
    }

    public abstract void C0(int i, String str);

    public abstract void D0(int i, int i2);

    public abstract void E0(int i, int i2);

    public abstract void F0(int i);

    public abstract void G0(int i, long j);

    public abstract void H0(long j);

    final void S(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) {
        c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(u.a);
        try {
            F0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new OutOfSpaceException(e2);
        }
    }

    boolean T() {
        return this.b;
    }

    public abstract int W();

    public abstract void X(byte b2);

    public abstract void Y(int i, boolean z);

    public final void Z(boolean z) {
        X(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.pf0
    public abstract void a(byte[] bArr, int i, int i2);

    public abstract void a0(int i, ByteString byteString);

    public final void b0(int i, double d2) {
        h0(i, Double.doubleToRawLongBits(d2));
    }

    public final void c() {
        if (W() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void c0(double d2) {
        i0(Double.doubleToRawLongBits(d2));
    }

    public final void d0(int i, int i2) {
        n0(i, i2);
    }

    public final void e0(int i) {
        o0(i);
    }

    public abstract void f0(int i, int i2);

    public abstract void g0(int i);

    public abstract void h0(int i, long j);

    public abstract void i0(long j);

    public final void j0(int i, float f) {
        f0(i, Float.floatToRawIntBits(f));
    }

    public final void k0(float f) {
        g0(Float.floatToRawIntBits(f));
    }

    final void l0(int i, f0 f0Var, r0 r0Var) {
        D0(i, 3);
        m0(f0Var, r0Var);
        D0(i, 4);
    }

    final void m0(f0 f0Var, r0 r0Var) {
        r0Var.j(f0Var, this.a);
    }

    public abstract void n0(int i, int i2);

    public abstract void o0(int i);

    public final void p0(int i, long j) {
        G0(i, j);
    }

    public final void q0(long j) {
        H0(j);
    }

    abstract void r0(int i, f0 f0Var, r0 r0Var);

    public abstract void s0(int i, f0 f0Var);

    public abstract void t0(int i, ByteString byteString);

    public final void u0(int i, int i2) {
        f0(i, i2);
    }

    public final void v0(int i) {
        g0(i);
    }

    public final void w0(int i, long j) {
        h0(i, j);
    }

    public final void x0(long j) {
        i0(j);
    }

    public final void y0(int i, int i2) {
        E0(i, Q(i2));
    }

    public final void z0(int i) {
        F0(Q(i));
    }

    private CodedOutputStream() {
    }
}
