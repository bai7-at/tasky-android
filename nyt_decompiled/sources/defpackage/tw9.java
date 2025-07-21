package defpackage;

import com.google.android.gms.internal.ads.zzcc;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class tw9 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final float h;
    public final String i;

    private tw9(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, String str) {
        this.a = list;
        this.b = i;
        this.c = i4;
        this.d = i5;
        this.e = i6;
        this.f = i7;
        this.g = i8;
        this.h = f;
        this.i = str;
    }

    public static tw9 a(b9e b9eVar) {
        int i;
        int i2;
        int i3;
        try {
            b9eVar.l(21);
            int B = b9eVar.B() & 3;
            int B2 = b9eVar.B();
            int s = b9eVar.s();
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < B2; i6++) {
                b9eVar.l(1);
                int F = b9eVar.F();
                for (int i7 = 0; i7 < F; i7++) {
                    int F2 = b9eVar.F();
                    i5 += F2 + 4;
                    b9eVar.l(F2);
                }
            }
            b9eVar.k(s);
            byte[] bArr = new byte[i5];
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            String str = null;
            float f = 1.0f;
            int i15 = 0;
            int i16 = 0;
            while (i15 < B2) {
                int B3 = b9eVar.B() & 63;
                int F3 = b9eVar.F();
                int i17 = i4;
                while (i17 < F3) {
                    int F4 = b9eVar.F();
                    int i18 = B2;
                    System.arraycopy(kre.a, i4, bArr, i16, 4);
                    int i19 = i16 + 4;
                    System.arraycopy(b9eVar.m(), b9eVar.s(), bArr, i19, F4);
                    int i20 = i19 + F4;
                    if (B3 == 33 && i17 == 0) {
                        eoe c = kre.c(bArr, i16 + 6, i20);
                        i8 = c.i;
                        i9 = c.j;
                        i10 = c.e + 8;
                        i11 = c.f + 8;
                        int i21 = c.l;
                        int i22 = c.m;
                        int i23 = c.n;
                        i = i20;
                        float f2 = c.k;
                        i2 = B3;
                        i3 = F3;
                        str = edd.b(c.a, c.b, c.c, c.d, c.g, c.h);
                        f = f2;
                        i12 = i21;
                        i13 = i22;
                        i14 = i23;
                        i17 = 0;
                    } else {
                        i = i20;
                        i2 = B3;
                        i3 = F3;
                    }
                    b9eVar.l(F4);
                    i17++;
                    B2 = i18;
                    i16 = i;
                    B3 = i2;
                    F3 = i3;
                    i4 = 0;
                }
                i15++;
                i4 = 0;
            }
            return new tw9(i5 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), B + 1, i8, i9, i10, i11, i12, i13, i14, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzcc.a("Error parsing HEVC config", e);
        }
    }
}
