package androidx.compose.ui.text.font;

import android.graphics.Typeface;
import androidx.compose.ui.text.font.w;
import defpackage.bv5;
import defpackage.hu5;
import defpackage.ss2;
import defpackage.uu8;

/* loaded from: classes.dex */
public final class q {
    private final bv5 a = t.a();

    public w a(uu8 uu8Var, hu5 hu5Var, ss2 ss2Var, ss2 ss2Var2) {
        Typeface a;
        e c = uu8Var.c();
        if (c == null ? true : c instanceof b) {
            a = this.a.b(uu8Var.f(), uu8Var.d());
        } else {
            if (!(c instanceof p)) {
                return null;
            }
            a = this.a.a((p) uu8Var.c(), uu8Var.f(), uu8Var.d());
        }
        return new w.b(a, false, 2, null);
    }
}
