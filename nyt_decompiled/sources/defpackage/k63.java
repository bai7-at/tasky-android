package defpackage;

import com.google.android.exoplayer2.t0;
import defpackage.st8;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class k63 implements uy1 {
    private static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final sz8 a;
    private final yo5 b;
    private final i15 e;
    private b f;
    private long g;
    private String h;
    private yp8 i;
    private boolean j;
    private final boolean[] c = new boolean[4];
    private final a d = new a(128);
    private long k = -9223372036854775807L;

    private static final class a {
        private static final byte[] f = {0, 0, 1};
        private boolean a;
        private int b;
        public int c;
        public int d;
        public byte[] e;

        public a(int i) {
            this.e = new byte[i];
        }

        public void a(byte[] bArr, int i, int i2) {
            if (this.a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.e;
                int length = bArr2.length;
                int i4 = this.c;
                if (length < i4 + i3) {
                    this.e = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.e, this.c, i3);
                this.c += i3;
            }
        }

        public boolean b(int i, int i2) {
            int i3 = this.b;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i == 179 || i == 181) {
                                this.c -= i2;
                                this.a = false;
                                return true;
                            }
                        } else if ((i & 240) != 32) {
                            a84.j("H263Reader", "Unexpected start code value");
                            c();
                        } else {
                            this.d = this.c;
                            this.b = 4;
                        }
                    } else if (i > 31) {
                        a84.j("H263Reader", "Unexpected start code value");
                        c();
                    } else {
                        this.b = 3;
                    }
                } else if (i != 181) {
                    a84.j("H263Reader", "Unexpected start code value");
                    c();
                } else {
                    this.b = 2;
                }
            } else if (i == 176) {
                this.b = 1;
                this.a = true;
            }
            byte[] bArr = f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.a = false;
            this.c = 0;
            this.b = 0;
        }
    }

    private static final class b {
        private final yp8 a;
        private boolean b;
        private boolean c;
        private boolean d;
        private int e;
        private int f;
        private long g;
        private long h;

        public b(yp8 yp8Var) {
            this.a = yp8Var;
        }

        public void a(byte[] bArr, int i, int i2) {
            if (this.c) {
                int i3 = this.f;
                int i4 = (i + 1) - i3;
                if (i4 >= i2) {
                    this.f = i3 + (i2 - i);
                } else {
                    this.d = ((bArr[i4] & 192) >> 6) == 0;
                    this.c = false;
                }
            }
        }

        public void b(long j, int i, boolean z) {
            if (this.e == 182 && z && this.b) {
                long j2 = this.h;
                if (j2 != -9223372036854775807L) {
                    this.a.b(j2, this.d ? 1 : 0, (int) (j - this.g), i, null);
                }
            }
            if (this.e != 179) {
                this.g = j;
            }
        }

        public void c(int i, long j) {
            this.e = i;
            this.d = false;
            this.b = i == 182 || i == 179;
            this.c = i == 182;
            this.f = 0;
            this.h = j;
        }

        public void d() {
            this.b = false;
            this.c = false;
            this.d = false;
            this.e = -1;
        }
    }

    k63(sz8 sz8Var) {
        this.a = sz8Var;
        if (sz8Var != null) {
            this.e = new i15(178, 128);
            this.b = new yo5();
        } else {
            this.e = null;
            this.b = null;
        }
    }

    private static t0 b(a aVar, int i, String str) {
        byte[] copyOf = Arrays.copyOf(aVar.e, aVar.c);
        xo5 xo5Var = new xo5(copyOf);
        xo5Var.s(i);
        xo5Var.s(4);
        xo5Var.q();
        xo5Var.r(8);
        if (xo5Var.g()) {
            xo5Var.r(4);
            xo5Var.r(3);
        }
        int h = xo5Var.h(4);
        float f = 1.0f;
        if (h == 15) {
            int h2 = xo5Var.h(8);
            int h3 = xo5Var.h(8);
            if (h3 == 0) {
                a84.j("H263Reader", "Invalid aspect ratio");
            } else {
                f = h2 / h3;
            }
        } else {
            float[] fArr = l;
            if (h < fArr.length) {
                f = fArr[h];
            } else {
                a84.j("H263Reader", "Invalid aspect ratio");
            }
        }
        if (xo5Var.g()) {
            xo5Var.r(2);
            xo5Var.r(1);
            if (xo5Var.g()) {
                xo5Var.r(15);
                xo5Var.q();
                xo5Var.r(15);
                xo5Var.q();
                xo5Var.r(15);
                xo5Var.q();
                xo5Var.r(3);
                xo5Var.r(11);
                xo5Var.q();
                xo5Var.r(15);
                xo5Var.q();
            }
        }
        if (xo5Var.h(2) != 0) {
            a84.j("H263Reader", "Unhandled video object layer shape");
        }
        xo5Var.q();
        int h4 = xo5Var.h(16);
        xo5Var.q();
        if (xo5Var.g()) {
            if (h4 == 0) {
                a84.j("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i2 = 0;
                for (int i3 = h4 - 1; i3 > 0; i3 >>= 1) {
                    i2++;
                }
                xo5Var.r(i2);
            }
        }
        xo5Var.q();
        int h5 = xo5Var.h(13);
        xo5Var.q();
        int h6 = xo5Var.h(13);
        xo5Var.q();
        xo5Var.q();
        return new t0.b().U(str).g0("video/mp4v-es").n0(h5).S(h6).c0(f).V(Collections.singletonList(copyOf)).G();
    }

    @Override // defpackage.uy1
    public void a(yo5 yo5Var) {
        ur.i(this.f);
        ur.i(this.i);
        int f = yo5Var.f();
        int g = yo5Var.g();
        byte[] e = yo5Var.e();
        this.g += yo5Var.a();
        this.i.a(yo5Var, yo5Var.a());
        while (true) {
            int c = j15.c(e, f, g, this.c);
            if (c == g) {
                break;
            }
            int i = c + 3;
            int i2 = yo5Var.e()[i] & 255;
            int i3 = c - f;
            int i4 = 0;
            if (!this.j) {
                if (i3 > 0) {
                    this.d.a(e, f, c);
                }
                if (this.d.b(i2, i3 < 0 ? -i3 : 0)) {
                    yp8 yp8Var = this.i;
                    a aVar = this.d;
                    yp8Var.d(b(aVar, aVar.d, (String) ur.e(this.h)));
                    this.j = true;
                }
            }
            this.f.a(e, f, c);
            i15 i15Var = this.e;
            if (i15Var != null) {
                if (i3 > 0) {
                    i15Var.a(e, f, c);
                } else {
                    i4 = -i3;
                }
                if (this.e.b(i4)) {
                    i15 i15Var2 = this.e;
                    ((yo5) z19.j(this.b)).S(this.e.d, j15.q(i15Var2.d, i15Var2.e));
                    ((sz8) z19.j(this.a)).a(this.k, this.b);
                }
                if (i2 == 178 && yo5Var.e()[c + 2] == 1) {
                    this.e.e(i2);
                }
            }
            int i5 = g - c;
            this.f.b(this.g - i5, i5, this.j);
            this.f.c(i2, this.k);
            f = i;
        }
        if (!this.j) {
            this.d.a(e, f, g);
        }
        this.f.a(e, f, g);
        i15 i15Var3 = this.e;
        if (i15Var3 != null) {
            i15Var3.a(e, f, g);
        }
    }

    @Override // defpackage.uy1
    public void c() {
        j15.a(this.c);
        this.d.c();
        b bVar = this.f;
        if (bVar != null) {
            bVar.d();
        }
        i15 i15Var = this.e;
        if (i15Var != null) {
            i15Var.d();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // defpackage.uy1
    public void d(a82 a82Var, st8.d dVar) {
        dVar.a();
        this.h = dVar.b();
        yp8 a2 = a82Var.a(dVar.c(), 2);
        this.i = a2;
        this.f = new b(a2);
        sz8 sz8Var = this.a;
        if (sz8Var != null) {
            sz8Var.b(a82Var, dVar);
        }
    }

    @Override // defpackage.uy1
    public void e() {
    }

    @Override // defpackage.uy1
    public void f(long j, int i) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }
}
