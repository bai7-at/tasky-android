package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class jv1 implements j07 {
    private final w80 a;
    private final j07 b;
    private final j07 c;

    public jv1(w80 w80Var, j07 j07Var, j07 j07Var2) {
        this.a = w80Var;
        this.b = j07Var;
        this.c = j07Var2;
    }

    private static cz6 b(cz6 cz6Var) {
        return cz6Var;
    }

    @Override // defpackage.j07
    public cz6 a(cz6 cz6Var, sk5 sk5Var) {
        Drawable drawable = (Drawable) cz6Var.get();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a(y80.f(((BitmapDrawable) drawable).getBitmap(), this.a), sk5Var);
        }
        if (drawable instanceof lz2) {
            return this.c.a(b(cz6Var), sk5Var);
        }
        return null;
    }
}
