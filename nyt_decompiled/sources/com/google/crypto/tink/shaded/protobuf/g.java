package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class g {
    int a;
    int b;
    int c;
    h d;
    private boolean e;

    private static final class b extends g {
        private final byte[] f;
        private final boolean g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private boolean m;
        private int n;

        private void K() {
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

        private void N() {
            if (this.h - this.j >= 10) {
                O();
            } else {
                P();
            }
        }

        private void O() {
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

        private void P() {
            for (int i = 0; i < 10; i++) {
                if (D() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public int A() {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public long B() {
            return I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public boolean C(int i) {
            int b = WireFormat.b(i);
            if (b == 0) {
                N();
                return true;
            }
            if (b == 1) {
                M(8);
                return true;
            }
            if (b == 2) {
                M(H());
                return true;
            }
            if (b == 3) {
                L();
                a(WireFormat.c(WireFormat.a(i), 4));
                return true;
            }
            if (b == 4) {
                return false;
            }
            if (b != 5) {
                throw InvalidProtocolBufferException.d();
            }
            M(4);
            return true;
        }

        public byte D() {
            int i = this.j;
            if (i == this.h) {
                throw InvalidProtocolBufferException.j();
            }
            byte[] bArr = this.f;
            this.j = i + 1;
            return bArr[i];
        }

        public byte[] E(int i) {
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
                throw InvalidProtocolBufferException.j();
            }
            if (i == 0) {
                return u.c;
            }
            throw InvalidProtocolBufferException.f();
        }

        public int F() {
            int i = this.j;
            if (this.h - i < 4) {
                throw InvalidProtocolBufferException.j();
            }
            byte[] bArr = this.f;
            this.j = i + 4;
            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
        }

        public long G() {
            int i = this.j;
            if (this.h - i < 8) {
                throw InvalidProtocolBufferException.j();
            }
            byte[] bArr = this.f;
            this.j = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        public int H() {
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
            return (int) J();
        }

        public long I() {
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
            return J();
        }

        long J() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((D() & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public void L() {
            int z;
            do {
                z = z();
                if (z == 0) {
                    return;
                }
            } while (C(z));
        }

        public void M(int i) {
            if (i >= 0) {
                int i2 = this.h;
                int i3 = this.j;
                if (i <= i2 - i3) {
                    this.j = i3 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw InvalidProtocolBufferException.j();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public void a(int i) {
            if (this.l != i) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public int d() {
            return this.j - this.k;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public boolean e() {
            return this.j == this.h;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public void i(int i) {
            this.n = i;
            K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public int j(int i) {
            if (i < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int d = i + d();
            int i2 = this.n;
            if (d > i2) {
                throw InvalidProtocolBufferException.j();
            }
            this.n = d;
            K();
            return i2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public boolean k() {
            return I() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public ByteString l() {
            int H = H();
            if (H > 0) {
                int i = this.h;
                int i2 = this.j;
                if (H <= i - i2) {
                    ByteString F = (this.g && this.m) ? ByteString.F(this.f, i2, H) : ByteString.j(this.f, i2, H);
                    this.j += H;
                    return F;
                }
            }
            return H == 0 ? ByteString.a : ByteString.E(E(H));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public double m() {
            return Double.longBitsToDouble(G());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public int n() {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public int o() {
            return F();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public long p() {
            return G();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public float q() {
            return Float.intBitsToFloat(F());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public int r() {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public long s() {
            return I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public int t() {
            return F();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public long u() {
            return G();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public int v() {
            return g.b(H());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public long w() {
            return g.c(I());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public String x() {
            int H = H();
            if (H > 0) {
                int i = this.h;
                int i2 = this.j;
                if (H <= i - i2) {
                    String str = new String(this.f, i2, H, u.a);
                    this.j += H;
                    return str;
                }
            }
            if (H == 0) {
                return "";
            }
            if (H < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.j();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public String y() {
            int H = H();
            if (H > 0) {
                int i = this.h;
                int i2 = this.j;
                if (H <= i - i2) {
                    String e = Utf8.e(this.f, i2, H);
                    this.j += H;
                    return e;
                }
            }
            if (H == 0) {
                return "";
            }
            if (H <= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.j();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public int z() {
            if (e()) {
                this.l = 0;
                return 0;
            }
            int H = H();
            this.l = H;
            if (WireFormat.a(H) != 0) {
                return this.l;
            }
            throw InvalidProtocolBufferException.b();
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

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static g f(byte[] bArr) {
        return g(bArr, 0, bArr.length);
    }

    public static g g(byte[] bArr, int i, int i2) {
        return h(bArr, i, i2, false);
    }

    static g h(byte[] bArr, int i, int i2, boolean z) {
        b bVar = new b(bArr, i, i2, z);
        try {
            bVar.j(i2);
            return bVar;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract int A();

    public abstract long B();

    public abstract boolean C(int i);

    public abstract void a(int i);

    public abstract int d();

    public abstract boolean e();

    public abstract void i(int i);

    public abstract int j(int i);

    public abstract boolean k();

    public abstract ByteString l();

    public abstract double m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract float q();

    public abstract int r();

    public abstract long s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract String x();

    public abstract String y();

    public abstract int z();

    private g() {
        this.b = 100;
        this.c = Integer.MAX_VALUE;
        this.e = false;
    }
}
