package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.u;

/* loaded from: classes3.dex */
abstract class e {

    static final class a {
        public int a;
        public long b;
        public Object c;
        public final m d;

        a(m mVar) {
            mVar.getClass();
            this.d = mVar;
        }
    }

    static int A(int i, byte[] bArr, int i2, int i3, u.d dVar, a aVar) {
        x xVar = (x) dVar;
        int K = K(bArr, i2, aVar);
        xVar.c(g.c(aVar.b));
        while (K < i3) {
            int H = H(bArr, K, aVar);
            if (i != aVar.a) {
                break;
            }
            K = K(bArr, H, aVar);
            xVar.c(g.c(aVar.b));
        }
        return K;
    }

    static int B(byte[] bArr, int i, a aVar) {
        int H = H(bArr, i, aVar);
        int i2 = aVar.a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i2 == 0) {
            aVar.c = "";
            return H;
        }
        aVar.c = new String(bArr, H, i2, u.a);
        return H + i2;
    }

    static int C(int i, byte[] bArr, int i2, int i3, u.d dVar, a aVar) {
        int H = H(bArr, i2, aVar);
        int i4 = aVar.a;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i4 == 0) {
            dVar.add("");
        } else {
            dVar.add(new String(bArr, H, i4, u.a));
            H += i4;
        }
        while (H < i3) {
            int H2 = H(bArr, H, aVar);
            if (i != aVar.a) {
                break;
            }
            H = H(bArr, H2, aVar);
            int i5 = aVar.a;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            if (i5 == 0) {
                dVar.add("");
            } else {
                dVar.add(new String(bArr, H, i5, u.a));
                H += i5;
            }
        }
        return H;
    }

    static int D(int i, byte[] bArr, int i2, int i3, u.d dVar, a aVar) {
        int H = H(bArr, i2, aVar);
        int i4 = aVar.a;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i4 == 0) {
            dVar.add("");
        } else {
            int i5 = H + i4;
            if (!Utf8.n(bArr, H, i5)) {
                throw InvalidProtocolBufferException.c();
            }
            dVar.add(new String(bArr, H, i4, u.a));
            H = i5;
        }
        while (H < i3) {
            int H2 = H(bArr, H, aVar);
            if (i != aVar.a) {
                break;
            }
            H = H(bArr, H2, aVar);
            int i6 = aVar.a;
            if (i6 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            if (i6 == 0) {
                dVar.add("");
            } else {
                int i7 = H + i6;
                if (!Utf8.n(bArr, H, i7)) {
                    throw InvalidProtocolBufferException.c();
                }
                dVar.add(new String(bArr, H, i6, u.a));
                H = i7;
            }
        }
        return H;
    }

    static int E(byte[] bArr, int i, a aVar) {
        int H = H(bArr, i, aVar);
        int i2 = aVar.a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i2 == 0) {
            aVar.c = "";
            return H;
        }
        aVar.c = Utf8.e(bArr, H, i2);
        return H + i2;
    }

    static int F(int i, byte[] bArr, int i2, int i3, x0 x0Var, a aVar) {
        if (WireFormat.a(i) == 0) {
            throw InvalidProtocolBufferException.b();
        }
        int b = WireFormat.b(i);
        if (b == 0) {
            int K = K(bArr, i2, aVar);
            x0Var.n(i, Long.valueOf(aVar.b));
            return K;
        }
        if (b == 1) {
            x0Var.n(i, Long.valueOf(i(bArr, i2)));
            return i2 + 8;
        }
        if (b == 2) {
            int H = H(bArr, i2, aVar);
            int i4 = aVar.a;
            if (i4 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            if (i4 > bArr.length - H) {
                throw InvalidProtocolBufferException.j();
            }
            if (i4 == 0) {
                x0Var.n(i, ByteString.a);
            } else {
                x0Var.n(i, ByteString.j(bArr, H, i4));
            }
            return H + i4;
        }
        if (b != 3) {
            if (b != 5) {
                throw InvalidProtocolBufferException.b();
            }
            x0Var.n(i, Integer.valueOf(g(bArr, i2)));
            return i2 + 4;
        }
        x0 l = x0.l();
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int H2 = H(bArr, i2, aVar);
            int i7 = aVar.a;
            if (i7 == i5) {
                i6 = i7;
                i2 = H2;
                break;
            }
            i6 = i7;
            i2 = F(i7, bArr, H2, i3, l, aVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw InvalidProtocolBufferException.g();
        }
        x0Var.n(i, l);
        return i2;
    }

    static int G(int i, byte[] bArr, int i2, a aVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            aVar.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            aVar.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            aVar.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            aVar.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                aVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int H(byte[] bArr, int i, a aVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return G(b, bArr, i2, aVar);
        }
        aVar.a = b;
        return i2;
    }

    static int I(int i, byte[] bArr, int i2, int i3, u.d dVar, a aVar) {
        t tVar = (t) dVar;
        int H = H(bArr, i2, aVar);
        tVar.c(aVar.a);
        while (H < i3) {
            int H2 = H(bArr, H, aVar);
            if (i != aVar.a) {
                break;
            }
            H = H(bArr, H2, aVar);
            tVar.c(aVar.a);
        }
        return H;
    }

    static int J(long j, byte[] bArr, int i, a aVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i3 = 7;
        while (b < 0) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            i3 += 7;
            j2 |= (b2 & Byte.MAX_VALUE) << i3;
            i2 = i4;
            b = b2;
        }
        aVar.b = j2;
        return i2;
    }

    static int K(byte[] bArr, int i, a aVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j < 0) {
            return J(j, bArr, i2, aVar);
        }
        aVar.b = j;
        return i2;
    }

    static int L(int i, byte[] bArr, int i2, int i3, u.d dVar, a aVar) {
        x xVar = (x) dVar;
        int K = K(bArr, i2, aVar);
        xVar.c(aVar.b);
        while (K < i3) {
            int H = H(bArr, K, aVar);
            if (i != aVar.a) {
                break;
            }
            K = K(bArr, H, aVar);
            xVar.c(aVar.b);
        }
        return K;
    }

    static int a(int i, byte[] bArr, int i2, int i3, u.d dVar, a aVar) {
        f fVar = (f) dVar;
        int K = K(bArr, i2, aVar);
        fVar.c(aVar.b != 0);
        while (K < i3) {
            int H = H(bArr, K, aVar);
            if (i != aVar.a) {
                break;
            }
            K = K(bArr, H, aVar);
            fVar.c(aVar.b != 0);
        }
        return K;
    }

    static int b(byte[] bArr, int i, a aVar) {
        int H = H(bArr, i, aVar);
        int i2 = aVar.a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i2 > bArr.length - H) {
            throw InvalidProtocolBufferException.j();
        }
        if (i2 == 0) {
            aVar.c = ByteString.a;
            return H;
        }
        aVar.c = ByteString.j(bArr, H, i2);
        return H + i2;
    }

    static int c(int i, byte[] bArr, int i2, int i3, u.d dVar, a aVar) {
        int H = H(bArr, i2, aVar);
        int i4 = aVar.a;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i4 > bArr.length - H) {
            throw InvalidProtocolBufferException.j();
        }
        if (i4 == 0) {
            dVar.add(ByteString.a);
        } else {
            dVar.add(ByteString.j(bArr, H, i4));
            H += i4;
        }
        while (H < i3) {
            int H2 = H(bArr, H, aVar);
            if (i != aVar.a) {
                break;
            }
            H = H(bArr, H2, aVar);
            int i5 = aVar.a;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            if (i5 > bArr.length - H) {
                throw InvalidProtocolBufferException.j();
            }
            if (i5 == 0) {
                dVar.add(ByteString.a);
            } else {
                dVar.add(ByteString.j(bArr, H, i5));
                H += i5;
            }
        }
        return H;
    }

    static double d(byte[] bArr, int i) {
        return Double.longBitsToDouble(i(bArr, i));
    }

    static int e(int i, byte[] bArr, int i2, int i3, u.d dVar, a aVar) {
        j jVar = (j) dVar;
        jVar.c(d(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int H = H(bArr, i4, aVar);
            if (i != aVar.a) {
                break;
            }
            jVar.c(d(bArr, H));
            i4 = H + 8;
        }
        return i4;
    }

    static int f(int i, byte[] bArr, int i2, int i3, Object obj, f0 f0Var, w0 w0Var, a aVar) {
        aVar.d.a(f0Var, i >>> 3);
        return F(i, bArr, i2, i3, h0.v(obj), aVar);
    }

    static int g(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    static int h(int i, byte[] bArr, int i2, int i3, u.d dVar, a aVar) {
        t tVar = (t) dVar;
        tVar.c(g(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int H = H(bArr, i4, aVar);
            if (i != aVar.a) {
                break;
            }
            tVar.c(g(bArr, H));
            i4 = H + 4;
        }
        return i4;
    }

    static long i(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    static int j(int i, byte[] bArr, int i2, int i3, u.d dVar, a aVar) {
        x xVar = (x) dVar;
        xVar.c(i(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int H = H(bArr, i4, aVar);
            if (i != aVar.a) {
                break;
            }
            xVar.c(i(bArr, H));
            i4 = H + 8;
        }
        return i4;
    }

    static float k(byte[] bArr, int i) {
        return Float.intBitsToFloat(g(bArr, i));
    }

    static int l(int i, byte[] bArr, int i2, int i3, u.d dVar, a aVar) {
        r rVar = (r) dVar;
        rVar.c(k(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int H = H(bArr, i4, aVar);
            if (i != aVar.a) {
                break;
            }
            rVar.c(k(bArr, H));
            i4 = H + 4;
        }
        return i4;
    }

    static int m(r0 r0Var, byte[] bArr, int i, int i2, int i3, a aVar) {
        h0 h0Var = (h0) r0Var;
        Object e = h0Var.e();
        int c0 = h0Var.c0(e, bArr, i, i2, i3, aVar);
        h0Var.b(e);
        aVar.c = e;
        return c0;
    }

    static int n(r0 r0Var, int i, byte[] bArr, int i2, int i3, u.d dVar, a aVar) {
        int i4 = (i & (-8)) | 4;
        int m = m(r0Var, bArr, i2, i3, i4, aVar);
        dVar.add(aVar.c);
        while (m < i3) {
            int H = H(bArr, m, aVar);
            if (i != aVar.a) {
                break;
            }
            m = m(r0Var, bArr, H, i3, i4, aVar);
            dVar.add(aVar.c);
        }
        return m;
    }

    static int o(r0 r0Var, byte[] bArr, int i, int i2, a aVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = G(i4, bArr, i3, aVar);
            i4 = aVar.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw InvalidProtocolBufferException.j();
        }
        Object e = r0Var.e();
        int i6 = i4 + i5;
        r0Var.h(e, bArr, i5, i6, aVar);
        r0Var.b(e);
        aVar.c = e;
        return i6;
    }

    static int p(r0 r0Var, int i, byte[] bArr, int i2, int i3, u.d dVar, a aVar) {
        int o = o(r0Var, bArr, i2, i3, aVar);
        dVar.add(aVar.c);
        while (o < i3) {
            int H = H(bArr, o, aVar);
            if (i != aVar.a) {
                break;
            }
            o = o(r0Var, bArr, H, i3, aVar);
            dVar.add(aVar.c);
        }
        return o;
    }

    static int q(byte[] bArr, int i, u.d dVar, a aVar) {
        f fVar = (f) dVar;
        int H = H(bArr, i, aVar);
        int i2 = aVar.a + H;
        while (H < i2) {
            H = K(bArr, H, aVar);
            fVar.c(aVar.b != 0);
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.j();
    }

    static int r(byte[] bArr, int i, u.d dVar, a aVar) {
        j jVar = (j) dVar;
        int H = H(bArr, i, aVar);
        int i2 = aVar.a + H;
        while (H < i2) {
            jVar.c(d(bArr, H));
            H += 8;
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.j();
    }

    static int s(byte[] bArr, int i, u.d dVar, a aVar) {
        t tVar = (t) dVar;
        int H = H(bArr, i, aVar);
        int i2 = aVar.a + H;
        while (H < i2) {
            tVar.c(g(bArr, H));
            H += 4;
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.j();
    }

    static int t(byte[] bArr, int i, u.d dVar, a aVar) {
        x xVar = (x) dVar;
        int H = H(bArr, i, aVar);
        int i2 = aVar.a + H;
        while (H < i2) {
            xVar.c(i(bArr, H));
            H += 8;
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.j();
    }

    static int u(byte[] bArr, int i, u.d dVar, a aVar) {
        r rVar = (r) dVar;
        int H = H(bArr, i, aVar);
        int i2 = aVar.a + H;
        while (H < i2) {
            rVar.c(k(bArr, H));
            H += 4;
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.j();
    }

    static int v(byte[] bArr, int i, u.d dVar, a aVar) {
        t tVar = (t) dVar;
        int H = H(bArr, i, aVar);
        int i2 = aVar.a + H;
        while (H < i2) {
            H = H(bArr, H, aVar);
            tVar.c(g.b(aVar.a));
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.j();
    }

    static int w(byte[] bArr, int i, u.d dVar, a aVar) {
        x xVar = (x) dVar;
        int H = H(bArr, i, aVar);
        int i2 = aVar.a + H;
        while (H < i2) {
            H = K(bArr, H, aVar);
            xVar.c(g.c(aVar.b));
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.j();
    }

    static int x(byte[] bArr, int i, u.d dVar, a aVar) {
        t tVar = (t) dVar;
        int H = H(bArr, i, aVar);
        int i2 = aVar.a + H;
        while (H < i2) {
            H = H(bArr, H, aVar);
            tVar.c(aVar.a);
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.j();
    }

    static int y(byte[] bArr, int i, u.d dVar, a aVar) {
        x xVar = (x) dVar;
        int H = H(bArr, i, aVar);
        int i2 = aVar.a + H;
        while (H < i2) {
            H = K(bArr, H, aVar);
            xVar.c(aVar.b);
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.j();
    }

    static int z(int i, byte[] bArr, int i2, int i3, u.d dVar, a aVar) {
        t tVar = (t) dVar;
        int H = H(bArr, i2, aVar);
        tVar.c(g.b(aVar.a));
        while (H < i3) {
            int H2 = H(bArr, H, aVar);
            if (i != aVar.a) {
                break;
            }
            H = H(bArr, H2, aVar);
            tVar.c(g.b(aVar.a));
        }
        return H;
    }
}
