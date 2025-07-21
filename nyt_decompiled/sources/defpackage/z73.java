package defpackage;

import com.google.android.exoplayer2.ParserException;
import defpackage.j15;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class z73 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final float h;
    public final String i;

    private z73(List list, int i, int i2, int i3, int i4, int i5, int i6, float f, String str) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = f;
        this.i = str;
    }

    public static z73 a(yo5 yo5Var) {
        int i;
        int i2;
        try {
            yo5Var.V(21);
            int H = yo5Var.H() & 3;
            int H2 = yo5Var.H();
            int f = yo5Var.f();
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < H2; i5++) {
                yo5Var.V(1);
                int N = yo5Var.N();
                for (int i6 = 0; i6 < N; i6++) {
                    int N2 = yo5Var.N();
                    i4 += N2 + 4;
                    yo5Var.V(N2);
                }
            }
            yo5Var.U(f);
            byte[] bArr = new byte[i4];
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            float f2 = 1.0f;
            String str = null;
            int i12 = 0;
            int i13 = 0;
            while (i12 < H2) {
                int H3 = yo5Var.H() & 63;
                int N3 = yo5Var.N();
                int i14 = i3;
                while (i14 < N3) {
                    int N4 = yo5Var.N();
                    byte[] bArr2 = j15.a;
                    int i15 = H2;
                    System.arraycopy(bArr2, i3, bArr, i13, bArr2.length);
                    int length = i13 + bArr2.length;
                    System.arraycopy(yo5Var.e(), yo5Var.f(), bArr, length, N4);
                    if (H3 == 33 && i14 == 0) {
                        j15.a h = j15.h(bArr, length, length + N4);
                        int i16 = h.k;
                        i8 = h.l;
                        i9 = h.n;
                        int i17 = h.o;
                        int i18 = h.p;
                        float f3 = h.m;
                        i = H3;
                        i2 = N3;
                        i7 = i16;
                        str = wm0.c(h.a, h.b, h.c, h.d, h.h, h.i);
                        i11 = i18;
                        i10 = i17;
                        f2 = f3;
                    } else {
                        i = H3;
                        i2 = N3;
                    }
                    i13 = length + N4;
                    yo5Var.V(N4);
                    i14++;
                    H2 = i15;
                    H3 = i;
                    N3 = i2;
                    i3 = 0;
                }
                i12++;
                i3 = 0;
            }
            return new z73(i4 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), H + 1, i7, i8, i9, i10, i11, f2, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.a("Error parsing HEVC config", e);
        }
    }
}
