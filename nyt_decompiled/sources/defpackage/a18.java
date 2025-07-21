package defpackage;

import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public class a18 extends ValueAnimator {
    int a;

    public static a18 a(int i, int... iArr) {
        a18 a18Var = new a18();
        a18Var.a = i;
        a18Var.setIntValues(iArr);
        return a18Var;
    }
}
