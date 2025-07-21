package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes3.dex */
public abstract class vf4 {
    static k01 a(int i) {
        return i != 0 ? i != 1 ? b() : new n51() : new f37();
    }

    static k01 b() {
        return new f37();
    }

    static dy1 c() {
        return new dy1();
    }

    public static void d(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof uf4) {
            ((uf4) background).V(f);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof uf4) {
            f(view, (uf4) background);
        }
    }

    public static void f(View view, uf4 uf4Var) {
        if (uf4Var.O()) {
            uf4Var.a0(pb9.h(view));
        }
    }
}
