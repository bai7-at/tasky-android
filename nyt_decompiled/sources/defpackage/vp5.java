package defpackage;

import defpackage.up5;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class vp5 {
    public static final void a(char c, ArrayList arrayList, float[] fArr, int i) {
        if (c == 'z' || c == 'Z') {
            arrayList.add(up5.b.c);
            return;
        }
        int i2 = 0;
        if (c == 'm') {
            int i3 = i - 2;
            while (i2 <= i3) {
                int i4 = i2 + 1;
                Object nVar = new up5.n(fArr[i2], fArr[i4]);
                if (i2 > 0) {
                    nVar = new up5.m(fArr[i2], fArr[i4]);
                }
                arrayList.add(nVar);
                i2 += 2;
            }
            return;
        }
        if (c == 'M') {
            int i5 = i - 2;
            while (i2 <= i5) {
                int i6 = i2 + 1;
                Object fVar = new up5.f(fArr[i2], fArr[i6]);
                if (i2 > 0) {
                    fVar = new up5.e(fArr[i2], fArr[i6]);
                }
                arrayList.add(fVar);
                i2 += 2;
            }
            return;
        }
        if (c == 'l') {
            int i7 = i - 2;
            while (i2 <= i7) {
                arrayList.add(new up5.m(fArr[i2], fArr[i2 + 1]));
                i2 += 2;
            }
            return;
        }
        if (c == 'L') {
            int i8 = i - 2;
            while (i2 <= i8) {
                arrayList.add(new up5.e(fArr[i2], fArr[i2 + 1]));
                i2 += 2;
            }
            return;
        }
        if (c == 'h') {
            int i9 = i - 1;
            while (i2 <= i9) {
                arrayList.add(new up5.l(fArr[i2]));
                i2++;
            }
            return;
        }
        if (c == 'H') {
            int i10 = i - 1;
            while (i2 <= i10) {
                arrayList.add(new up5.d(fArr[i2]));
                i2++;
            }
            return;
        }
        if (c == 'v') {
            int i11 = i - 1;
            while (i2 <= i11) {
                arrayList.add(new up5.r(fArr[i2]));
                i2++;
            }
            return;
        }
        if (c == 'V') {
            int i12 = i - 1;
            while (i2 <= i12) {
                arrayList.add(new up5.s(fArr[i2]));
                i2++;
            }
            return;
        }
        if (c == 'c') {
            int i13 = i - 6;
            while (i2 <= i13) {
                arrayList.add(new up5.k(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3], fArr[i2 + 4], fArr[i2 + 5]));
                i2 += 6;
            }
            return;
        }
        if (c == 'C') {
            int i14 = i - 6;
            while (i2 <= i14) {
                arrayList.add(new up5.c(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3], fArr[i2 + 4], fArr[i2 + 5]));
                i2 += 6;
            }
            return;
        }
        if (c == 's') {
            int i15 = i - 4;
            while (i2 <= i15) {
                arrayList.add(new up5.p(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                i2 += 4;
            }
            return;
        }
        if (c == 'S') {
            int i16 = i - 4;
            while (i2 <= i16) {
                arrayList.add(new up5.h(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                i2 += 4;
            }
            return;
        }
        if (c == 'q') {
            int i17 = i - 4;
            while (i2 <= i17) {
                arrayList.add(new up5.o(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                i2 += 4;
            }
            return;
        }
        if (c == 'Q') {
            int i18 = i - 4;
            while (i2 <= i18) {
                arrayList.add(new up5.g(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                i2 += 4;
            }
            return;
        }
        if (c == 't') {
            int i19 = i - 2;
            while (i2 <= i19) {
                arrayList.add(new up5.q(fArr[i2], fArr[i2 + 1]));
                i2 += 2;
            }
            return;
        }
        if (c == 'T') {
            int i20 = i - 2;
            while (i2 <= i20) {
                arrayList.add(new up5.i(fArr[i2], fArr[i2 + 1]));
                i2 += 2;
            }
            return;
        }
        if (c == 'a') {
            int i21 = i - 7;
            for (int i22 = 0; i22 <= i21; i22 += 7) {
                arrayList.add(new up5.j(fArr[i22], fArr[i22 + 1], fArr[i22 + 2], Float.compare(fArr[i22 + 3], 0.0f) != 0, Float.compare(fArr[i22 + 4], 0.0f) != 0, fArr[i22 + 5], fArr[i22 + 6]));
            }
            return;
        }
        if (c != 'A') {
            throw new IllegalArgumentException("Unknown command for: " + c);
        }
        int i23 = i - 7;
        for (int i24 = 0; i24 <= i23; i24 += 7) {
            arrayList.add(new up5.a(fArr[i24], fArr[i24 + 1], fArr[i24 + 2], Float.compare(fArr[i24 + 3], 0.0f) != 0, Float.compare(fArr[i24 + 4], 0.0f) != 0, fArr[i24 + 5], fArr[i24 + 6]));
        }
    }
}
