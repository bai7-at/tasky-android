package defpackage;

import android.text.Spannable;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import defpackage.du5;
import defpackage.fk8;
import java.util.List;

/* loaded from: classes.dex */
public abstract class xt5 {
    private static final int a(long j) {
        long g = dk8.g(j);
        fk8.a aVar = fk8.b;
        if (fk8.g(g, aVar.b())) {
            return 0;
        }
        return fk8.g(g, aVar.a()) ? 1 : 2;
    }

    private static final int b(int i) {
        du5.a aVar = du5.a;
        if (du5.i(i, aVar.a())) {
            return 0;
        }
        if (du5.i(i, aVar.g())) {
            return 1;
        }
        if (du5.i(i, aVar.b())) {
            return 2;
        }
        if (du5.i(i, aVar.c())) {
            return 3;
        }
        if (du5.i(i, aVar.f())) {
            return 4;
        }
        if (du5.i(i, aVar.d())) {
            return 5;
        }
        if (du5.i(i, aVar.e())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign");
    }

    private static final void c(Spannable spannable, vt5 vt5Var, int i, int i2, fm1 fm1Var) {
        for (Object obj : spannable.getSpans(i, i2, a02.class)) {
            spannable.removeSpan((a02) obj);
        }
        SpannableExtensions_androidKt.u(spannable, new bu5(dk8.h(vt5Var.c()), a(vt5Var.c()), dk8.h(vt5Var.a()), a(vt5Var.a()), fm1Var.c1() * fm1Var.getDensity(), b(vt5Var.b())), i, i2);
    }

    public static final void d(Spannable spannable, List list, fm1 fm1Var) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a.b bVar = (a.b) list.get(i);
            c(spannable, (vt5) bVar.a(), bVar.b(), bVar.c(), fm1Var);
        }
    }
}
