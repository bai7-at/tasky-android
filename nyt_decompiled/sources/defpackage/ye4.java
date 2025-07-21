package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.source.o;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class ye4 extends hq8 {
    private a c;

    public static final class a {
        private final int a;
        private final String[] b;
        private final int[] c;
        private final wp8[] d;
        private final int[] e;
        private final int[][][] f;
        private final wp8 g;

        a(String[] strArr, int[] iArr, wp8[] wp8VarArr, int[] iArr2, int[][][] iArr3, wp8 wp8Var) {
            this.b = strArr;
            this.c = iArr;
            this.d = wp8VarArr;
            this.f = iArr3;
            this.e = iArr2;
            this.g = wp8Var;
            this.a = iArr.length;
        }

        public int a(int i, int i2, boolean z) {
            int i3 = this.d[i].c(i2).a;
            int[] iArr = new int[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                int g = g(i, i2, i5);
                if (g == 4 || (z && g == 3)) {
                    iArr[i4] = i5;
                    i4++;
                }
            }
            return b(i, i2, Arrays.copyOf(iArr, i4));
        }

        public int b(int i, int i2, int[] iArr) {
            int i3 = 0;
            int i4 = 16;
            String str = null;
            boolean z = false;
            int i5 = 0;
            while (i3 < iArr.length) {
                String str2 = this.d[i].c(i2).d(iArr[i3]).l;
                int i6 = i5 + 1;
                if (i5 == 0) {
                    str = str2;
                } else {
                    z |= !z19.c(str, str2);
                }
                i4 = Math.min(i4, a2.q(this.f[i][i2][i3]));
                i3++;
                i5 = i6;
            }
            return z ? Math.min(i4, this.e[i]) : i4;
        }

        public int c(int i, int i2, int i3) {
            return this.f[i][i2][i3];
        }

        public int d() {
            return this.a;
        }

        public int e(int i) {
            return this.c[i];
        }

        public wp8 f(int i) {
            return this.d[i];
        }

        public int g(int i, int i2, int i3) {
            return a2.I(c(i, i2, i3));
        }

        public wp8 h() {
            return this.g;
        }
    }

    private static int l(a2[] a2VarArr, up8 up8Var, int[] iArr, boolean z) {
        int length = a2VarArr.length;
        int i = 0;
        boolean z2 = true;
        for (int i2 = 0; i2 < a2VarArr.length; i2++) {
            a2 a2Var = a2VarArr[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < up8Var.a; i4++) {
                i3 = Math.max(i3, a2.I(a2Var.b(up8Var.d(i4))));
            }
            boolean z3 = iArr[i2] == 0;
            if (i3 > i || (i3 == i && z && !z2 && z3)) {
                length = i2;
                z2 = z3;
                i = i3;
            }
        }
        return length;
    }

    private static int[] m(a2 a2Var, up8 up8Var) {
        int[] iArr = new int[up8Var.a];
        for (int i = 0; i < up8Var.a; i++) {
            iArr[i] = a2Var.b(up8Var.d(i));
        }
        return iArr;
    }

    private static int[] n(a2[] a2VarArr) {
        int length = a2VarArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = a2VarArr[i].C();
        }
        return iArr;
    }

    @Override // defpackage.hq8
    public final void h(Object obj) {
        this.c = (a) obj;
    }

    @Override // defpackage.hq8
    public final jq8 j(a2[] a2VarArr, wp8 wp8Var, o.b bVar, g2 g2Var) {
        int[] iArr = new int[a2VarArr.length + 1];
        int length = a2VarArr.length + 1;
        up8[][] up8VarArr = new up8[length][];
        int[][][] iArr2 = new int[a2VarArr.length + 1][][];
        for (int i = 0; i < length; i++) {
            int i2 = wp8Var.a;
            up8VarArr[i] = new up8[i2];
            iArr2[i] = new int[i2][];
        }
        int[] n = n(a2VarArr);
        for (int i3 = 0; i3 < wp8Var.a; i3++) {
            up8 c = wp8Var.c(i3);
            int l = l(a2VarArr, c, iArr, c.c == 5);
            int[] m = l == a2VarArr.length ? new int[c.a] : m(a2VarArr[l], c);
            int i4 = iArr[l];
            up8VarArr[l][i4] = c;
            iArr2[l][i4] = m;
            iArr[l] = i4 + 1;
        }
        wp8[] wp8VarArr = new wp8[a2VarArr.length];
        String[] strArr = new String[a2VarArr.length];
        int[] iArr3 = new int[a2VarArr.length];
        for (int i5 = 0; i5 < a2VarArr.length; i5++) {
            int i6 = iArr[i5];
            wp8VarArr[i5] = new wp8((up8[]) z19.I0(up8VarArr[i5], i6));
            iArr2[i5] = (int[][]) z19.I0(iArr2[i5], i6);
            strArr[i5] = a2VarArr[i5].getName();
            iArr3[i5] = a2VarArr[i5].f();
        }
        a aVar = new a(strArr, iArr3, wp8VarArr, n, iArr2, new wp8((up8[]) z19.I0(up8VarArr[a2VarArr.length], iArr[a2VarArr.length])));
        Pair o = o(aVar, iArr2, n, bVar, g2Var);
        return new jq8((cx6[]) o.first, (q72[]) o.second, gq8.a(aVar, (aq8[]) o.second), aVar);
    }

    protected abstract Pair o(a aVar, int[][][] iArr, int[] iArr2, o.b bVar, g2 g2Var);
}
