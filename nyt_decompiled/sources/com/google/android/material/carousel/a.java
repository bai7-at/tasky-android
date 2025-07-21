package com.google.android.material.carousel;

import defpackage.hg4;

/* loaded from: classes3.dex */
final class a {
    final int a;
    float b;
    int c;
    int d;
    float e;
    float f;
    final int g;
    final float h;

    a(int i, float f, float f2, float f3, int i2, float f4, int i3, float f5, int i4, float f6) {
        this.a = i;
        this.b = hg4.a(f, f2, f3);
        this.c = i2;
        this.e = f4;
        this.d = i3;
        this.f = f5;
        this.g = i4;
        d(f6, f2, f3, f5);
        this.h = b(f5);
    }

    private float a(float f, int i, float f2, int i2, int i3) {
        if (i <= 0) {
            f2 = 0.0f;
        }
        float f3 = i;
        float f4 = i2 / 2.0f;
        return (f - ((f3 + f4) * f2)) / (i3 + f4);
    }

    private float b(float f) {
        if (g()) {
            return Math.abs(f - this.f) * this.a;
        }
        return Float.MAX_VALUE;
    }

    static a c(float f, float f2, float f3, float f4, int[] iArr, float f5, int[] iArr2, float f6, int[] iArr3) {
        a aVar = null;
        int i = 1;
        for (int i2 : iArr3) {
            int length = iArr2.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = iArr2[i3];
                int length2 = iArr.length;
                int i5 = 0;
                while (i5 < length2) {
                    int i6 = i5;
                    int i7 = length2;
                    int i8 = i3;
                    int i9 = length;
                    a aVar2 = new a(i, f2, f3, f4, iArr[i5], f5, i4, f6, i2, f);
                    if (aVar == null || aVar2.h < aVar.h) {
                        if (aVar2.h == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    i++;
                    i5 = i6 + 1;
                    length2 = i7;
                    i3 = i8;
                    length = i9;
                }
                i3++;
            }
        }
        return aVar;
    }

    private void d(float f, float f2, float f3, float f4) {
        float f5 = f - f();
        int i = this.c;
        if (i > 0 && f5 > 0.0f) {
            float f6 = this.b;
            this.b = f6 + Math.min(f5 / i, f3 - f6);
        } else if (i > 0 && f5 < 0.0f) {
            float f7 = this.b;
            this.b = f7 + Math.max(f5 / i, f2 - f7);
        }
        int i2 = this.c;
        float f8 = i2 > 0 ? this.b : 0.0f;
        this.b = f8;
        float a = a(f, i2, f8, this.d, this.g);
        this.f = a;
        float f9 = (this.b + a) / 2.0f;
        this.e = f9;
        int i3 = this.d;
        if (i3 <= 0 || a == f4) {
            return;
        }
        float f10 = (f4 - a) * this.g;
        float min = Math.min(Math.abs(f10), f9 * 0.1f * i3);
        if (f10 > 0.0f) {
            this.e -= min / this.d;
            this.f += min / this.g;
        } else {
            this.e += min / this.d;
            this.f -= min / this.g;
        }
    }

    private float f() {
        return (this.f * this.g) + (this.e * this.d) + (this.b * this.c);
    }

    private boolean g() {
        int i = this.g;
        if (i <= 0 || this.c <= 0 || this.d <= 0) {
            return i <= 0 || this.c <= 0 || this.f > this.b;
        }
        float f = this.f;
        float f2 = this.e;
        return f > f2 && f2 > this.b;
    }

    int e() {
        return this.c + this.d + this.g;
    }

    public String toString() {
        return "Arrangement [priority=" + this.a + ", smallCount=" + this.c + ", smallSize=" + this.b + ", mediumCount=" + this.d + ", mediumSize=" + this.e + ", largeCount=" + this.g + ", largeSize=" + this.f + ", cost=" + this.h + "]";
    }
}
