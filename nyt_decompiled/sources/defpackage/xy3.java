package defpackage;

import android.graphics.Matrix;

/* loaded from: classes.dex */
public final class xy3 {
    private final gt2 a;
    private Matrix b;
    private Matrix c;
    private float[] d;
    private float[] e;
    private boolean f = true;
    private boolean g = true;
    private boolean h = true;

    public xy3(gt2 gt2Var) {
        this.a = gt2Var;
    }

    public final float[] a(Object obj) {
        float[] fArr = this.e;
        if (fArr == null) {
            fArr = kg4.c(null, 1, null);
            this.e = fArr;
        }
        if (this.g) {
            this.h = er3.a(b(obj), fArr);
            this.g = false;
        }
        if (this.h) {
            return fArr;
        }
        return null;
    }

    public final float[] b(Object obj) {
        float[] fArr = this.d;
        if (fArr == null) {
            fArr = kg4.c(null, 1, null);
            this.d = fArr;
        }
        if (!this.f) {
            return fArr;
        }
        Matrix matrix = this.b;
        if (matrix == null) {
            matrix = new Matrix();
            this.b = matrix;
        }
        this.a.invoke(obj, matrix);
        Matrix matrix2 = this.c;
        if (matrix2 == null || !zq3.c(matrix, matrix2)) {
            rf.b(fArr, matrix);
            this.b = matrix2;
            this.c = matrix;
        }
        this.f = false;
        return fArr;
    }

    public final void c() {
        this.f = true;
        this.g = true;
    }
}
