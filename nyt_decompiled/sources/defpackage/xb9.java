package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
class xb9 extends wb9 {
    xb9() {
    }

    @Override // defpackage.tb9
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.tb9
    public void d(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.tb9
    public void e(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.tb9
    public void f(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.tb9
    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.tb9
    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
