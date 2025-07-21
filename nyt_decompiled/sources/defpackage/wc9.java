package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.t0;
import okhttp3.internal.http.StatusLine;

/* loaded from: classes2.dex */
public final class wc9 implements y72 {
    public static final d82 h = new d82() { // from class: vc9
        @Override // defpackage.d82
        public final y72[] c() {
            y72[] g;
            g = wc9.g();
            return g;
        }
    };
    private a82 a;
    private yp8 b;
    private b e;
    private int c = 0;
    private long d = -1;
    private int f = -1;
    private long g = -1;

    private static final class a implements b {
        private static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        private static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, StatusLine.HTTP_TEMP_REDIRECT, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
        private final a82 a;
        private final yp8 b;
        private final xc9 c;
        private final int d;
        private final byte[] e;
        private final yo5 f;
        private final int g;
        private final t0 h;
        private int i;
        private long j;
        private int k;
        private long l;

        public a(a82 a82Var, yp8 yp8Var, xc9 xc9Var) {
            this.a = a82Var;
            this.b = yp8Var;
            this.c = xc9Var;
            int max = Math.max(1, xc9Var.c / 10);
            this.g = max;
            yo5 yo5Var = new yo5(xc9Var.g);
            yo5Var.z();
            int z = yo5Var.z();
            this.d = z;
            int i = xc9Var.b;
            int i2 = (((xc9Var.e - (i * 4)) * 8) / (xc9Var.f * i)) + 1;
            if (z == i2) {
                int l = z19.l(max, z);
                this.e = new byte[xc9Var.e * l];
                this.f = new yo5(l * h(z, i));
                int i3 = ((xc9Var.c * xc9Var.e) * 8) / z;
                this.h = new t0.b().g0("audio/raw").I(i3).b0(i3).Y(h(max, i)).J(xc9Var.b).h0(xc9Var.c).a0(2).G();
                return;
            }
            throw ParserException.a("Expected frames per block: " + i2 + "; got: " + z, null);
        }

        private void d(byte[] bArr, int i, yo5 yo5Var) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < this.c.b; i3++) {
                    e(bArr, i2, i3, yo5Var.e());
                }
            }
            int g = g(this.d * i);
            yo5Var.U(0);
            yo5Var.T(g);
        }

        private void e(byte[] bArr, int i, int i2, byte[] bArr2) {
            xc9 xc9Var = this.c;
            int i3 = xc9Var.e;
            int i4 = xc9Var.b;
            int i5 = (i * i3) + (i2 * 4);
            int i6 = (i4 * 4) + i5;
            int i7 = (i3 / i4) - 4;
            int i8 = (short) (((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255));
            int min = Math.min(bArr[i5 + 2] & 255, 88);
            int i9 = n[min];
            int i10 = ((i * this.d * i4) + i2) * 2;
            bArr2[i10] = (byte) (i8 & 255);
            bArr2[i10 + 1] = (byte) (i8 >> 8);
            for (int i11 = 0; i11 < i7 * 2; i11++) {
                byte b = bArr[((i11 / 8) * i4 * 4) + i6 + ((i11 / 2) % 4)];
                int i12 = i11 % 2 == 0 ? b & 15 : (b & 255) >> 4;
                int i13 = ((((i12 & 7) * 2) + 1) * i9) >> 3;
                if ((i12 & 8) != 0) {
                    i13 = -i13;
                }
                i8 = z19.q(i8 + i13, -32768, 32767);
                i10 += i4 * 2;
                bArr2[i10] = (byte) (i8 & 255);
                bArr2[i10 + 1] = (byte) (i8 >> 8);
                int i14 = min + m[i12];
                int[] iArr = n;
                min = z19.q(i14, 0, iArr.length - 1);
                i9 = iArr[min];
            }
        }

        private int f(int i) {
            return i / (this.c.b * 2);
        }

        private int g(int i) {
            return h(i, this.c.b);
        }

        private static int h(int i, int i2) {
            return i * 2 * i2;
        }

        private void i(int i) {
            long Q0 = this.j + z19.Q0(this.l, 1000000L, this.c.c);
            int g = g(i);
            this.b.b(Q0, 1, g, this.k - g, null);
            this.l += i;
            this.k -= g;
        }

        @Override // wc9.b
        public void a(int i, long j) {
            this.a.p(new zc9(this.c, this.d, i, j));
            this.b.d(this.h);
        }

        @Override // wc9.b
        public void b(long j) {
            this.i = 0;
            this.j = j;
            this.k = 0;
            this.l = 0L;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0035 -> B:3:0x001b). Please report as a decompilation issue!!! */
        @Override // wc9.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean c(defpackage.z72 r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.g
                int r1 = r6.k
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.d
                int r0 = defpackage.z19.l(r0, r1)
                xc9 r1 = r6.c
                int r1 = r1.e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.e
                int r5 = r6.i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.i
                int r4 = r4 + r3
                r6.i = r4
                goto L1e
            L3e:
                int r7 = r6.i
                xc9 r8 = r6.c
                int r8 = r8.e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.e
                yo5 r9 = r6.f
                r6.d(r8, r7, r9)
                int r8 = r6.i
                xc9 r9 = r6.c
                int r9 = r9.e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.i = r8
                yo5 r7 = r6.f
                int r7 = r7.g()
                yp8 r8 = r6.b
                yo5 r9 = r6.f
                r8.a(r9, r7)
                int r8 = r6.k
                int r8 = r8 + r7
                r6.k = r8
                int r7 = r6.f(r8)
                int r8 = r6.g
                if (r7 < r8) goto L75
                r6.i(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.k
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L82
                r6.i(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: wc9.a.c(z72, long):boolean");
        }
    }

    private interface b {
        void a(int i, long j);

        void b(long j);

        boolean c(z72 z72Var, long j);
    }

    private static final class c implements b {
        private final a82 a;
        private final yp8 b;
        private final xc9 c;
        private final t0 d;
        private final int e;
        private long f;
        private int g;
        private long h;

        public c(a82 a82Var, yp8 yp8Var, xc9 xc9Var, String str, int i) {
            this.a = a82Var;
            this.b = yp8Var;
            this.c = xc9Var;
            int i2 = (xc9Var.b * xc9Var.f) / 8;
            if (xc9Var.e == i2) {
                int i3 = xc9Var.c;
                int i4 = i3 * i2 * 8;
                int max = Math.max(i2, (i3 * i2) / 10);
                this.e = max;
                this.d = new t0.b().g0(str).I(i4).b0(i4).Y(max).J(xc9Var.b).h0(xc9Var.c).a0(i).G();
                return;
            }
            throw ParserException.a("Expected block size: " + i2 + "; got: " + xc9Var.e, null);
        }

        @Override // wc9.b
        public void a(int i, long j) {
            this.a.p(new zc9(this.c, 1, i, j));
            this.b.d(this.d);
        }

        @Override // wc9.b
        public void b(long j) {
            this.f = j;
            this.g = 0;
            this.h = 0L;
        }

        @Override // wc9.b
        public boolean c(z72 z72Var, long j) {
            int i;
            int i2;
            long j2 = j;
            while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
                int e = this.b.e(z72Var, (int) Math.min(i2 - i, j2), true);
                if (e == -1) {
                    j2 = 0;
                } else {
                    this.g += e;
                    j2 -= e;
                }
            }
            int i3 = this.c.e;
            int i4 = this.g / i3;
            if (i4 > 0) {
                long Q0 = this.f + z19.Q0(this.h, 1000000L, r1.c);
                int i5 = i4 * i3;
                int i6 = this.g - i5;
                this.b.b(Q0, 1, i5, i6, null);
                this.h += i4;
                this.g = i6;
            }
            return j2 <= 0;
        }
    }

    private void f() {
        ur.i(this.b);
        z19.j(this.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y72[] g() {
        return new y72[]{new wc9()};
    }

    private void h(z72 z72Var) {
        ur.g(z72Var.getPosition() == 0);
        int i = this.f;
        if (i != -1) {
            z72Var.p(i);
            this.c = 4;
        } else {
            if (!yc9.a(z72Var)) {
                throw ParserException.a("Unsupported or unrecognized wav file type.", null);
            }
            z72Var.p((int) (z72Var.l() - z72Var.getPosition()));
            this.c = 1;
        }
    }

    private void i(z72 z72Var) {
        xc9 b2 = yc9.b(z72Var);
        int i = b2.a;
        if (i == 17) {
            this.e = new a(this.a, this.b, b2);
        } else if (i == 6) {
            this.e = new c(this.a, this.b, b2, "audio/g711-alaw", -1);
        } else if (i == 7) {
            this.e = new c(this.a, this.b, b2, "audio/g711-mlaw", -1);
        } else {
            int a2 = ad9.a(i, b2.f);
            if (a2 == 0) {
                throw ParserException.e("Unsupported WAV format type: " + b2.a);
            }
            this.e = new c(this.a, this.b, b2, "audio/raw", a2);
        }
        this.c = 3;
    }

    private void j(z72 z72Var) {
        this.d = yc9.c(z72Var);
        this.c = 2;
    }

    private int k(z72 z72Var) {
        ur.g(this.g != -1);
        return ((b) ur.e(this.e)).c(z72Var, this.g - z72Var.getPosition()) ? -1 : 0;
    }

    private void l(z72 z72Var) {
        Pair e = yc9.e(z72Var);
        this.f = ((Long) e.first).intValue();
        long longValue = ((Long) e.second).longValue();
        long j = this.d;
        if (j != -1 && longValue == 4294967295L) {
            longValue = j;
        }
        this.g = this.f + longValue;
        long length = z72Var.getLength();
        if (length != -1 && this.g > length) {
            a84.j("WavExtractor", "Data exceeds input length: " + this.g + ", " + length);
            this.g = length;
        }
        ((b) ur.e(this.e)).a(this.f, this.g);
        this.c = 4;
    }

    @Override // defpackage.y72
    public void a(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        b bVar = this.e;
        if (bVar != null) {
            bVar.b(j2);
        }
    }

    @Override // defpackage.y72
    public void c(a82 a82Var) {
        this.a = a82Var;
        this.b = a82Var.a(0, 1);
        a82Var.s();
    }

    @Override // defpackage.y72
    public int d(z72 z72Var, e06 e06Var) {
        f();
        int i = this.c;
        if (i == 0) {
            h(z72Var);
            return 0;
        }
        if (i == 1) {
            j(z72Var);
            return 0;
        }
        if (i == 2) {
            i(z72Var);
            return 0;
        }
        if (i == 3) {
            l(z72Var);
            return 0;
        }
        if (i == 4) {
            return k(z72Var);
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.y72
    public boolean e(z72 z72Var) {
        return yc9.a(z72Var);
    }

    @Override // defpackage.y72
    public void release() {
    }
}
