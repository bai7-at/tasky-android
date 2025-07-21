package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class s6g {
    private final String[] a;
    private final int[] b;
    private final z2g[] c;
    private final int[] d;
    private final int[][][] e;
    private final z2g f;

    s6g(String[] strArr, int[] iArr, z2g[] z2gVarArr, int[] iArr2, int[][][] iArr3, z2g z2gVar) {
        this.a = strArr;
        this.b = iArr;
        this.c = z2gVarArr;
        this.e = iArr3;
        this.d = iArr2;
        this.f = z2gVar;
    }

    public final int a(int i, int i2, boolean z) {
        int i3 = this.c[i].b(i2).a;
        int[] iArr = new int[1];
        int i4 = 0;
        int i5 = 0;
        for (char c = 0; c <= 0; c = 1) {
            if ((this.e[i][i2][0] & 7) == 4) {
                iArr[i5] = 0;
                i5++;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, i5);
        String str = null;
        int i6 = 16;
        boolean z2 = false;
        int i7 = 0;
        while (i4 < copyOf.length) {
            String str2 = this.c[i].b(i2).b(copyOf[i4]).l;
            int i8 = i7 + 1;
            if (i7 == 0) {
                str = str2;
            } else {
                z2 |= !khe.f(str, str2);
            }
            i6 = Math.min(i6, this.e[i][i2][i4] & 24);
            i4++;
            i7 = i8;
        }
        return z2 ? Math.min(i6, this.d[i]) : i6;
    }

    public final int b(int i, int i2, int i3) {
        return this.e[i][i2][i3];
    }

    public final int c(int i) {
        return this.b[i];
    }

    public final z2g d(int i) {
        return this.c[i];
    }

    public final z2g e() {
        return this.f;
    }
}
