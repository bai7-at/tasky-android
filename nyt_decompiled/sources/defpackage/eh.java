package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class eh extends s40 {
    public eh(List list) {
        super(e(list));
    }

    private static rw3 d(rw3 rw3Var) {
        n13 n13Var = (n13) rw3Var.b;
        n13 n13Var2 = (n13) rw3Var.c;
        if (n13Var == null || n13Var2 == null || n13Var.e().length == n13Var2.e().length) {
            return rw3Var;
        }
        float[] f = f(n13Var.e(), n13Var2.e());
        return rw3Var.b(n13Var.b(f), n13Var2.b(f));
    }

    private static List e(List list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, d((rw3) list.get(i)));
        }
        return list;
    }

    static float[] f(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f = Float.NaN;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            float f2 = fArr3[i2];
            if (f2 != f) {
                fArr3[i] = f2;
                i++;
                f = fArr3[i2];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i);
    }

    @Override // defpackage.sh
    public p50 a() {
        return new p13(this.a);
    }

    @Override // defpackage.s40, defpackage.sh
    public /* bridge */ /* synthetic */ List b() {
        return super.b();
    }

    @Override // defpackage.s40, defpackage.sh
    public /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    @Override // defpackage.s40
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
