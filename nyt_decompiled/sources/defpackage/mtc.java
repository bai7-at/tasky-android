package defpackage;

import com.comscore.streaming.WindowState;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class mtc {
    private final int a;
    private final int b;
    private final float c;
    private final float d;
    private final float e;
    private final int f;
    private final int g;
    private final int h;
    private final short[] i;
    private short[] j;
    private int k;
    private short[] l;
    private int m;
    private short[] n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;

    public mtc(int i, int i2, float f, float f2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i / i3;
        this.f = i / WindowState.NORMAL;
        int i4 = i / 65;
        this.g = i4;
        int i5 = i4 + i4;
        this.h = i5;
        this.i = new short[i5];
        int i6 = i5 * i2;
        this.j = new short[i6];
        this.l = new short[i6];
        this.n = new short[i6];
    }

    private final int g(short[] sArr, int i, int i2, int i3) {
        int i4 = 1;
        int i5 = 255;
        int i6 = 0;
        int i7 = 0;
        while (i2 <= i3) {
            int i8 = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                int i10 = this.b * i;
                i8 += Math.abs(sArr[i10 + i9] - sArr[(i10 + i2) + i9]);
            }
            int i11 = i8 * i6;
            int i12 = i4 * i2;
            if (i11 < i12) {
                i4 = i8;
            }
            if (i11 < i12) {
                i6 = i2;
            }
            int i13 = i8 * i5;
            int i14 = i7 * i2;
            if (i13 > i14) {
                i7 = i8;
            }
            if (i13 > i14) {
                i5 = i2;
            }
            i2++;
        }
        this.u = i4 / i6;
        this.v = i7 / i5;
        return i6;
    }

    private final void h(short[] sArr, int i, int i2) {
        short[] l = l(this.l, this.m, i2);
        this.l = l;
        int i3 = this.m;
        int i4 = this.b;
        System.arraycopy(sArr, i * i4, l, i3 * i4, i2 * i4);
        this.m += i2;
    }

    private final void i(short[] sArr, int i, int i2) {
        int i3;
        for (int i4 = 0; i4 < this.h / i2; i4++) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = this.b;
                i3 = i7 * i2;
                if (i5 < i3) {
                    i6 += sArr[(i7 * i) + (i3 * i4) + i5];
                    i5++;
                }
            }
            this.i[i4] = (short) (i6 / i3);
        }
    }

    private static void j(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr2[i7] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }

    private final void k() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        float f = this.c / this.d;
        double d = f;
        int i9 = this.m;
        if (d > 1.00001d || d < 0.99999d) {
            int i10 = this.k;
            if (i10 >= this.h) {
                int i11 = 0;
                do {
                    int i12 = this.r;
                    if (i12 > 0) {
                        int min = Math.min(this.h, i12);
                        h(this.j, i11, min);
                        this.r -= min;
                        i11 += min;
                    } else {
                        short[] sArr = this.j;
                        int i13 = this.a;
                        int i14 = i13 > 4000 ? i13 / 4000 : 1;
                        if (this.b == 1 && i14 == 1) {
                            i = g(sArr, i11, this.f, this.g);
                        } else {
                            i(sArr, i11, i14);
                            int g = g(this.i, 0, this.f / i14, this.g / i14);
                            if (i14 != 1) {
                                int i15 = g * i14;
                                int i16 = i14 * 4;
                                int i17 = this.f;
                                int i18 = i15 - i16;
                                if (i18 >= i17) {
                                    i17 = i18;
                                }
                                int i19 = i15 + i16;
                                int i20 = this.g;
                                if (i19 > i20) {
                                    i19 = i20;
                                }
                                if (this.b == 1) {
                                    i = g(sArr, i11, i17, i19);
                                } else {
                                    i(sArr, i11, 1);
                                    i = g(this.i, 0, i17, i19);
                                }
                            } else {
                                i = g;
                            }
                        }
                        int i21 = this.u;
                        int i22 = (i21 == 0 || (i4 = this.s) == 0 || this.v > i21 * 3 || i21 + i21 <= this.t * 3) ? i : i4;
                        int i23 = i11 + i22;
                        this.t = i21;
                        this.s = i;
                        float f2 = i22;
                        if (d > 1.0d) {
                            short[] sArr2 = this.j;
                            float f3 = (-1.0f) + f;
                            if (f >= 2.0f) {
                                i3 = (int) (f2 / f3);
                            } else {
                                this.r = (int) ((f2 * (2.0f - f)) / f3);
                                i3 = i22;
                            }
                            short[] l = l(this.l, this.m, i3);
                            this.l = l;
                            int i24 = i3;
                            j(i3, this.b, l, this.m, sArr2, i11, sArr2, i23);
                            this.m += i24;
                            i11 += i22 + i24;
                        } else {
                            int i25 = i22;
                            short[] sArr3 = this.j;
                            float f4 = 1.0f - f;
                            if (f < 0.5f) {
                                i2 = (int) ((f2 * f) / f4);
                            } else {
                                this.r = (int) ((f2 * ((f + f) - 1.0f)) / f4);
                                i2 = i25;
                            }
                            int i26 = i25 + i2;
                            short[] l2 = l(this.l, this.m, i26);
                            this.l = l2;
                            int i27 = this.b;
                            System.arraycopy(sArr3, i11 * i27, l2, this.m * i27, i27 * i25);
                            j(i2, this.b, this.l, this.m + i25, sArr3, i23, sArr3, i11);
                            this.m += i26;
                            i11 += i2;
                        }
                    }
                } while (this.h + i11 <= i10);
                int i28 = this.k - i11;
                short[] sArr4 = this.j;
                int i29 = this.b;
                System.arraycopy(sArr4, i11 * i29, sArr4, 0, i29 * i28);
                this.k = i28;
            }
        } else {
            h(this.j, 0, this.k);
            this.k = 0;
        }
        float f5 = this.e * this.d;
        if (f5 == 1.0f || this.m == i9) {
            return;
        }
        int i30 = this.a;
        int i31 = (int) (i30 / f5);
        while (true) {
            if (i31 <= 16384 && i30 <= 16384) {
                break;
            }
            i31 /= 2;
            i30 /= 2;
        }
        int i32 = this.m - i9;
        short[] l3 = l(this.n, this.o, i32);
        this.n = l3;
        short[] sArr5 = this.l;
        int i33 = this.b;
        System.arraycopy(sArr5, i9 * i33, l3, this.o * i33, i33 * i32);
        this.m = i9;
        this.o += i32;
        int i34 = 0;
        while (true) {
            i5 = this.o;
            i6 = i5 - 1;
            if (i34 >= i6) {
                break;
            }
            while (true) {
                i7 = this.p + 1;
                int i35 = i7 * i31;
                i8 = this.q;
                if (i35 <= i8 * i30) {
                    break;
                }
                this.l = l(this.l, this.m, 1);
                int i36 = 0;
                while (true) {
                    int i37 = this.b;
                    if (i36 < i37) {
                        short[] sArr6 = this.l;
                        int i38 = this.m * i37;
                        short[] sArr7 = this.n;
                        int i39 = (i34 * i37) + i36;
                        short s = sArr7[i39];
                        short s2 = sArr7[i39 + i37];
                        int i40 = this.q * i30;
                        int i41 = this.p;
                        int i42 = i41 * i31;
                        int i43 = (i41 + 1) * i31;
                        int i44 = i43 - i40;
                        int i45 = i43 - i42;
                        sArr6[i38 + i36] = (short) (((s * i44) + ((i45 - i44) * s2)) / i45);
                        i36++;
                    }
                }
                this.q++;
                this.m++;
            }
            this.p = i7;
            if (i7 == i30) {
                this.p = 0;
                wad.f(i8 == i31);
                this.q = 0;
            }
            i34++;
        }
        if (i6 != 0) {
            short[] sArr8 = this.n;
            int i46 = this.b;
            System.arraycopy(sArr8, i6 * i46, sArr8, 0, (i5 - i6) * i46);
            this.o -= i6;
        }
    }

    private final short[] l(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public final int a() {
        int i = this.m * this.b;
        return i + i;
    }

    public final int b() {
        int i = this.k * this.b;
        return i + i;
    }

    public final void c() {
        this.k = 0;
        this.m = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
    }

    public final void d(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.b, this.m);
        shortBuffer.put(this.l, 0, this.b * min);
        int i = this.m - min;
        this.m = i;
        int i2 = this.b;
        short[] sArr = this.l;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    public final void e() {
        int i;
        int i2 = this.k;
        int i3 = this.m;
        float f = this.o;
        float f2 = this.c;
        float f3 = this.e;
        float f4 = this.d;
        int i4 = i3 + ((int) ((((i2 / (f2 / f4)) + f) / (f3 * f4)) + 0.5f));
        int i5 = this.h;
        this.j = l(this.j, i2, i5 + i5 + i2);
        int i6 = 0;
        while (true) {
            int i7 = this.h;
            int i8 = this.b;
            i = i7 + i7;
            if (i6 >= i * i8) {
                break;
            }
            this.j[(i8 * i2) + i6] = 0;
            i6++;
        }
        this.k += i;
        k();
        if (this.m > i4) {
            this.m = i4;
        }
        this.k = 0;
        this.r = 0;
        this.o = 0;
    }

    public final void f(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.b;
        int i2 = remaining / i;
        int i3 = i * i2;
        short[] l = l(this.j, this.k, i2);
        this.j = l;
        shortBuffer.get(l, this.k * this.b, (i3 + i3) / 2);
        this.k += i2;
        k();
    }
}
