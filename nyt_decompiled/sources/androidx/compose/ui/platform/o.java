package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import defpackage.rf;

/* loaded from: classes.dex */
final class o implements n {
    private final Matrix a = new Matrix();
    private final int[] b = new int[2];

    @Override // androidx.compose.ui.platform.n
    public void a(View view, float[] fArr) {
        this.a.reset();
        view.transformMatrixToGlobal(this.a);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        view.getLocationOnScreen(this.b);
        int[] iArr = this.b;
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.b;
        this.a.postTranslate(iArr2[0] - i, iArr2[1] - i2);
        rf.b(fArr, this.a);
    }
}
