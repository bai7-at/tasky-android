package defpackage;

import android.graphics.Canvas;

/* loaded from: classes.dex */
public abstract class wd {
    private static final Canvas a = new Canvas();

    public static final ph0 a(sf3 sf3Var) {
        vd vdVar = new vd();
        vdVar.z(new Canvas(AbstractC0565if.b(sf3Var)));
        return vdVar;
    }

    public static final ph0 b(Canvas canvas) {
        vd vdVar = new vd();
        vdVar.z(canvas);
        return vdVar;
    }

    public static final Canvas d(ph0 ph0Var) {
        zq3.f(ph0Var, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        return ((vd) ph0Var).a();
    }
}
