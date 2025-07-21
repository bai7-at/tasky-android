package defpackage;

import com.google.android.exoplayer2.ParserException;
import defpackage.j15;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class v20 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final float h;
    public final String i;

    private v20(List list, int i, int i2, int i3, int i4, int i5, int i6, float f, String str) {
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

    private static byte[] a(yo5 yo5Var) {
        int N = yo5Var.N();
        int f = yo5Var.f();
        yo5Var.V(N);
        return wm0.d(yo5Var.e(), f, N);
    }

    public static v20 b(yo5 yo5Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        String str;
        try {
            yo5Var.V(4);
            int H = (yo5Var.H() & 3) + 1;
            if (H == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int H2 = yo5Var.H() & 31;
            for (int i6 = 0; i6 < H2; i6++) {
                arrayList.add(a(yo5Var));
            }
            int H3 = yo5Var.H();
            for (int i7 = 0; i7 < H3; i7++) {
                arrayList.add(a(yo5Var));
            }
            if (H2 > 0) {
                j15.c l = j15.l((byte[]) arrayList.get(0), H, ((byte[]) arrayList.get(0)).length);
                int i8 = l.f;
                int i9 = l.g;
                int i10 = l.o;
                int i11 = l.p;
                int i12 = l.q;
                float f2 = l.h;
                str = wm0.a(l.a, l.b, l.c);
                i4 = i11;
                i5 = i12;
                f = f2;
                i = i8;
                i2 = i9;
                i3 = i10;
            } else {
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                f = 1.0f;
                str = null;
            }
            return new v20(arrayList, H, i, i2, i3, i4, i5, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.a("Error parsing AVC config", e);
        }
    }
}
