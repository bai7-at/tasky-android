package androidx.datastore.preferences.protobuf;

import com.amazonaws.event.ProgressEvent;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f {
    int a;
    int b;
    int c;
    g d;
    private boolean e;

    private static final class b extends f {
        private final byte[] f;
        private final boolean g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private boolean m;
        private int n;

        private void M() {
            int i = this.h + this.i;
            this.h = i;
            int i2 = i - this.k;
            int i3 = this.n;
            if (i2 <= i3) {
                this.i = 0;
                return;
            }
            int i4 = i2 - i3;
            this.i = i4;
            this.h = i - i4;
        }

        private void P() {
            if (this.h - this.j >= 10) {
                Q();
            } else {
                R();
            }
        }

        private void Q() {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.f;
                int i2 = this.j;
                this.j = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        private void R() {
            for (int i = 0; i < 10; i++) {
                if (F() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public String A() {
            int J = J();
            if (J > 0) {
                int i = this.h;
                int i2 = this.j;
                if (J <= i - i2) {
                    String e = Utf8.e(this.f, i2, J);
                    this.j += J;
                    return e;
                }
            }
            if (J == 0) {
                return "";
            }
            if (J <= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.k();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public int B() {
            if (e()) {
                this.l = 0;
                return 0;
            }
            int J = J();
            this.l = J;
            if (WireFormat.a(J) != 0) {
                return this.l;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public int C() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public long D() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public boolean E(int i) {
            int b = WireFormat.b(i);
            if (b == 0) {
                P();
                return true;
            }
            if (b == 1) {
                O(8);
                return true;
            }
            if (b == 2) {
                O(J());
                return true;
            }
            if (b == 3) {
                N();
                a(WireFormat.c(WireFormat.a(i), 4));
                return true;
            }
            if (b == 4) {
                return false;
            }
            if (b != 5) {
                throw InvalidProtocolBufferException.d();
            }
            O(4);
            return true;
        }

        public byte F() {
            int i = this.j;
            if (i == this.h) {
                throw InvalidProtocolBufferException.k();
            }
            byte[] bArr = this.f;
            this.j = i + 1;
            return bArr[i];
        }

        public byte[] G(int i) {
            if (i > 0) {
                int i2 = this.h;
                int i3 = this.j;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.j = i4;
                    return Arrays.copyOfRange(this.f, i3, i4);
                }
            }
            if (i > 0) {
                throw InvalidProtocolBufferException.k();
            }
            if (i == 0) {
                return t.c;
            }
            throw InvalidProtocolBufferException.f();
        }

        public int H() {
            int i = this.j;
            if (this.h - i < 4) {
                throw InvalidProtocolBufferException.k();
            }
            byte[] bArr = this.f;
            this.j = i + 4;
            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
        }

        public long I() {
            int i = this.j;
            if (this.h - i < 8) {
                throw InvalidProtocolBufferException.k();
            }
            byte[] bArr = this.f;
            this.j = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        public int J() {
            int i;
            int i2 = this.j;
            int i3 = this.h;
            if (i3 != i2) {
                byte[] bArr = this.f;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.j = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << 14) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.j = i5;
                    return i;
                }
            }
            return (int) L();
        }

        public long K() {
            long j;
            long j2;
            long j3;
            int i = this.j;
            int i2 = this.h;
            if (i2 != i) {
                byte[] bArr = this.f;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.j = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << 14) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << 21);
                            if (i9 < 0) {
                                long j4 = (-2080896) ^ i9;
                                i4 = i8;
                                j = j4;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (bArr[i8] << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i10 = i + 6;
                                    long j7 = j6 ^ (bArr[i4] << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (bArr[i10] << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i10 = i + 8;
                                            j7 = j6 ^ (bArr[i4] << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i11 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i11;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j = j7 ^ j2;
                                    i4 = i10;
                                }
                                j = j6 ^ j3;
                            }
                        }
                    }
                    this.j = i4;
                    return j;
                }
            }
            return L();
        }

        long L() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((F() & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public void N() {
            int B;
            do {
                B = B();
                if (B == 0) {
                    return;
                }
            } while (E(B));
        }

        public void O(int i) {
            if (i >= 0) {
                int i2 = this.h;
                int i3 = this.j;
                if (i <= i2 - i3) {
                    this.j = i3 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw InvalidProtocolBufferException.k();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public void a(int i) {
            if (this.l != i) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public int d() {
            return this.j - this.k;
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public boolean e() {
            return this.j == this.h;
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public void k(int i) {
            this.n = i;
            M();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public int l(int i) {
            if (i < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int d = i + d();
            int i2 = this.n;
            if (d > i2) {
                throw InvalidProtocolBufferException.k();
            }
            this.n = d;
            M();
            return i2;
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public boolean m() {
            return K() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public ByteString n() {
            int J = J();
            if (J > 0) {
                int i = this.h;
                int i2 = this.j;
                if (J <= i - i2) {
                    ByteString C = (this.g && this.m) ? ByteString.C(this.f, i2, J) : ByteString.j(this.f, i2, J);
                    this.j += J;
                    return C;
                }
            }
            return J == 0 ? ByteString.a : ByteString.B(G(J));
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public double o() {
            return Double.longBitsToDouble(I());
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public int p() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public int q() {
            return H();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public long r() {
            return I();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public float s() {
            return Float.intBitsToFloat(H());
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public int t() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public long u() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public int v() {
            return H();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public long w() {
            return I();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public int x() {
            return f.b(J());
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public long y() {
            return f.c(K());
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public String z() {
            int J = J();
            if (J > 0) {
                int i = this.h;
                int i2 = this.j;
                if (J <= i - i2) {
                    String str = new String(this.f, i2, J, t.a);
                    this.j += J;
                    return str;
                }
            }
            if (J == 0) {
                return "";
            }
            if (J < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.k();
        }

        private b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.n = Integer.MAX_VALUE;
            this.f = bArr;
            this.h = i2 + i;
            this.j = i;
            this.k = i;
            this.g = z;
        }
    }

    private static final class c extends f {
        private final InputStream f;
        private final byte[] g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private int m;

        private ByteString F(int i) {
            byte[] I = I(i);
            if (I != null) {
                return ByteString.g(I);
            }
            int i2 = this.j;
            int i3 = this.h;
            int i4 = i3 - i2;
            this.l += i3;
            this.j = 0;
            this.h = 0;
            List<byte[]> J = J(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.g, i2, bArr, 0, i4);
            for (byte[] bArr2 : J) {
                System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return ByteString.B(bArr);
        }

        private byte[] H(int i, boolean z) {
            byte[] I = I(i);
            if (I != null) {
                return z ? (byte[]) I.clone() : I;
            }
            int i2 = this.j;
            int i3 = this.h;
            int i4 = i3 - i2;
            this.l += i3;
            this.j = 0;
            this.h = 0;
            List<byte[]> J = J(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.g, i2, bArr, 0, i4);
            for (byte[] bArr2 : J) {
                System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return bArr;
        }

        private byte[] I(int i) {
            if (i == 0) {
                return t.c;
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int i2 = this.l;
            int i3 = this.j;
            int i4 = i2 + i3 + i;
            if (i4 - this.c > 0) {
                throw InvalidProtocolBufferException.j();
            }
            int i5 = this.m;
            if (i4 > i5) {
                S((i5 - i2) - i3);
                throw InvalidProtocolBufferException.k();
            }
            int i6 = this.h - i3;
            int i7 = i - i6;
            if (i7 >= 4096 && i7 > this.f.available()) {
                return null;
            }
            byte[] bArr = new byte[i];
            System.arraycopy(this.g, this.j, bArr, 0, i6);
            this.l += this.h;
            this.j = 0;
            this.h = 0;
            while (i6 < i) {
                int read = this.f.read(bArr, i6, i - i6);
                if (read == -1) {
                    throw InvalidProtocolBufferException.k();
                }
                this.l += read;
                i6 += read;
            }
            return bArr;
        }

        private List J(int i) {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, ProgressEvent.PART_FAILED_EVENT_CODE);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.f.read(bArr, i2, min - i2);
                    if (read == -1) {
                        throw InvalidProtocolBufferException.k();
                    }
                    this.l += read;
                    i2 += read;
                }
                i -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void P() {
            int i = this.h + this.i;
            this.h = i;
            int i2 = this.l + i;
            int i3 = this.m;
            if (i2 <= i3) {
                this.i = 0;
                return;
            }
            int i4 = i2 - i3;
            this.i = i4;
            this.h = i - i4;
        }

        private void Q(int i) {
            if (X(i)) {
                return;
            }
            if (i <= (this.c - this.l) - this.j) {
                throw InvalidProtocolBufferException.k();
            }
            throw InvalidProtocolBufferException.j();
        }

        private void T(int i) {
            if (i < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int i2 = this.l;
            int i3 = this.j;
            int i4 = i2 + i3 + i;
            int i5 = this.m;
            if (i4 > i5) {
                S((i5 - i2) - i3);
                throw InvalidProtocolBufferException.k();
            }
            this.l = i2 + i3;
            int i6 = this.h - i3;
            this.h = 0;
            this.j = 0;
            while (i6 < i) {
                try {
                    long j = i - i6;
                    long skip = this.f.skip(j);
                    if (skip < 0 || skip > j) {
                        throw new IllegalStateException(this.f.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i6 += (int) skip;
                    }
                } finally {
                    this.l += i6;
                    P();
                }
            }
            if (i6 >= i) {
                return;
            }
            int i7 = this.h;
            int i8 = i7 - this.j;
            this.j = i7;
            Q(1);
            while (true) {
                int i9 = i - i8;
                int i10 = this.h;
                if (i9 <= i10) {
                    this.j = i9;
                    return;
                } else {
                    i8 += i10;
                    this.j = i10;
                    Q(1);
                }
            }
        }

        private void U() {
            if (this.h - this.j >= 10) {
                V();
            } else {
                W();
            }
        }

        private void V() {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.g;
                int i2 = this.j;
                this.j = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        private void W() {
            for (int i = 0; i < 10; i++) {
                if (G() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        private boolean X(int i) {
            int i2 = this.j;
            int i3 = i2 + i;
            int i4 = this.h;
            if (i3 <= i4) {
                throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
            }
            int i5 = this.c;
            int i6 = this.l;
            if (i > (i5 - i6) - i2 || i6 + i2 + i > this.m) {
                return false;
            }
            if (i2 > 0) {
                if (i4 > i2) {
                    byte[] bArr = this.g;
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.l += i2;
                this.h -= i2;
                this.j = 0;
            }
            InputStream inputStream = this.f;
            byte[] bArr2 = this.g;
            int i7 = this.h;
            int read = inputStream.read(bArr2, i7, Math.min(bArr2.length - i7, (this.c - this.l) - i7));
            if (read == 0 || read < -1 || read > this.g.length) {
                throw new IllegalStateException(this.f.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.h += read;
            P();
            if (this.h >= i) {
                return true;
            }
            return X(i);
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public String A() {
            byte[] H;
            int M = M();
            int i = this.j;
            int i2 = this.h;
            if (M <= i2 - i && M > 0) {
                H = this.g;
                this.j = i + M;
            } else {
                if (M == 0) {
                    return "";
                }
                i = 0;
                if (M <= i2) {
                    Q(M);
                    H = this.g;
                    this.j = M;
                } else {
                    H = H(M, false);
                }
            }
            return Utf8.e(H, i, M);
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public int B() {
            if (e()) {
                this.k = 0;
                return 0;
            }
            int M = M();
            this.k = M;
            if (WireFormat.a(M) != 0) {
                return this.k;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public int C() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public long D() {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public boolean E(int i) {
            int b = WireFormat.b(i);
            if (b == 0) {
                U();
                return true;
            }
            if (b == 1) {
                S(8);
                return true;
            }
            if (b == 2) {
                S(M());
                return true;
            }
            if (b == 3) {
                R();
                a(WireFormat.c(WireFormat.a(i), 4));
                return true;
            }
            if (b == 4) {
                return false;
            }
            if (b != 5) {
                throw InvalidProtocolBufferException.d();
            }
            S(4);
            return true;
        }

        public byte G() {
            if (this.j == this.h) {
                Q(1);
            }
            byte[] bArr = this.g;
            int i = this.j;
            this.j = i + 1;
            return bArr[i];
        }

        public int K() {
            int i = this.j;
            if (this.h - i < 4) {
                Q(4);
                i = this.j;
            }
            byte[] bArr = this.g;
            this.j = i + 4;
            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
        }

        public long L() {
            int i = this.j;
            if (this.h - i < 8) {
                Q(8);
                i = this.j;
            }
            byte[] bArr = this.g;
            this.j = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        public int M() {
            int i;
            int i2 = this.j;
            int i3 = this.h;
            if (i3 != i2) {
                byte[] bArr = this.g;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.j = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << 14) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.j = i5;
                    return i;
                }
            }
            return (int) O();
        }

        public long N() {
            long j;
            long j2;
            long j3;
            int i = this.j;
            int i2 = this.h;
            if (i2 != i) {
                byte[] bArr = this.g;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.j = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << 14) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << 21);
                            if (i9 < 0) {
                                long j4 = (-2080896) ^ i9;
                                i4 = i8;
                                j = j4;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (bArr[i8] << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i10 = i + 6;
                                    long j7 = j6 ^ (bArr[i4] << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (bArr[i10] << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i10 = i + 8;
                                            j7 = j6 ^ (bArr[i4] << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i11 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i11;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j = j7 ^ j2;
                                    i4 = i10;
                                }
                                j = j6 ^ j3;
                            }
                        }
                    }
                    this.j = i4;
                    return j;
                }
            }
            return O();
        }

        long O() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((G() & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public void R() {
            int B;
            do {
                B = B();
                if (B == 0) {
                    return;
                }
            } while (E(B));
        }

        public void S(int i) {
            int i2 = this.h;
            int i3 = this.j;
            if (i > i2 - i3 || i < 0) {
                T(i);
            } else {
                this.j = i3 + i;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public void a(int i) {
            if (this.k != i) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public int d() {
            return this.l + this.j;
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public boolean e() {
            return this.j == this.h && !X(1);
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public void k(int i) {
            this.m = i;
            P();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public int l(int i) {
            if (i < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int i2 = i + this.l + this.j;
            int i3 = this.m;
            if (i2 > i3) {
                throw InvalidProtocolBufferException.k();
            }
            this.m = i2;
            P();
            return i3;
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public boolean m() {
            return N() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public ByteString n() {
            int M = M();
            int i = this.h;
            int i2 = this.j;
            if (M > i - i2 || M <= 0) {
                return M == 0 ? ByteString.a : F(M);
            }
            ByteString j = ByteString.j(this.g, i2, M);
            this.j += M;
            return j;
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public double o() {
            return Double.longBitsToDouble(L());
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public int p() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public int q() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public long r() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public float s() {
            return Float.intBitsToFloat(K());
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public int t() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public long u() {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public int v() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public long w() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public int x() {
            return f.b(M());
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public long y() {
            return f.c(N());
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public String z() {
            int M = M();
            if (M > 0) {
                int i = this.h;
                int i2 = this.j;
                if (M <= i - i2) {
                    String str = new String(this.g, i2, M, t.a);
                    this.j += M;
                    return str;
                }
            }
            if (M == 0) {
                return "";
            }
            if (M > this.h) {
                return new String(H(M, false), t.a);
            }
            Q(M);
            String str2 = new String(this.g, this.j, M, t.a);
            this.j += M;
            return str2;
        }

        private c(InputStream inputStream, int i) {
            super();
            this.m = Integer.MAX_VALUE;
            t.b(inputStream, "input");
            this.f = inputStream;
            this.g = new byte[i];
            this.h = 0;
            this.j = 0;
            this.l = 0;
        }
    }

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static f f(InputStream inputStream) {
        return g(inputStream, ProgressEvent.PART_FAILED_EVENT_CODE);
    }

    public static f g(InputStream inputStream, int i) {
        if (i > 0) {
            return inputStream == null ? h(t.c) : new c(inputStream, i);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static f h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static f i(byte[] bArr, int i, int i2) {
        return j(bArr, i, i2, false);
    }

    static f j(byte[] bArr, int i, int i2, boolean z) {
        b bVar = new b(bArr, i, i2, z);
        try {
            bVar.l(i2);
            return bVar;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract String A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract boolean E(int i);

    public abstract void a(int i);

    public abstract int d();

    public abstract boolean e();

    public abstract void k(int i);

    public abstract int l(int i);

    public abstract boolean m();

    public abstract ByteString n();

    public abstract double o();

    public abstract int p();

    public abstract int q();

    public abstract long r();

    public abstract float s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract String z();

    private f() {
        this.b = 100;
        this.c = Integer.MAX_VALUE;
        this.e = false;
    }
}
