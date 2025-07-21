package defpackage;

import com.google.android.gms.internal.ads.zzcc;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class hu9 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final String k;

    private hu9(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, String str) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = f;
        this.k = str;
    }

    public static hu9 a(b9e b9eVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String str;
        float f;
        try {
            b9eVar.l(4);
            int B = b9eVar.B() & 3;
            int i8 = B + 1;
            if (i8 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int B2 = b9eVar.B() & 31;
            for (int i9 = 0; i9 < B2; i9++) {
                arrayList.add(b(b9eVar));
            }
            int B3 = b9eVar.B();
            for (int i10 = 0; i10 < B3; i10++) {
                arrayList.add(b(b9eVar));
            }
            if (B2 > 0) {
                iqe e = kre.e((byte[]) arrayList.get(0), B + 2, ((byte[]) arrayList.get(0)).length);
                int i11 = e.e;
                int i12 = e.f;
                int i13 = e.h + 8;
                int i14 = e.i + 8;
                int i15 = e.j;
                int i16 = e.k;
                int i17 = e.l;
                float f2 = e.g;
                str = edd.a(e.a, e.b, e.c);
                i6 = i16;
                i7 = i17;
                f = f2;
                i3 = i13;
                i4 = i14;
                i5 = i15;
                i = i11;
                i2 = i12;
            } else {
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                str = null;
                f = 1.0f;
            }
            return new hu9(arrayList, i8, i, i2, i3, i4, i5, i6, i7, f, str);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw zzcc.a("Error parsing AVC config", e2);
        }
    }

    private static byte[] b(b9e b9eVar) {
        int F = b9eVar.F();
        int s = b9eVar.s();
        b9eVar.l(F);
        return edd.c(b9eVar.m(), s, F);
    }
}
