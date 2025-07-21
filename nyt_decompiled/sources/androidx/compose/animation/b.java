package androidx.compose.animation;

import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.di;
import defpackage.gt2;
import defpackage.hn3;
import defpackage.in3;
import defpackage.ph2;
import defpackage.pl0;

/* loaded from: classes.dex */
public abstract class b {
    private static final long a = in3.a(RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);

    public static final Modifier a(Modifier modifier, ph2 ph2Var, gt2 gt2Var) {
        return pl0.b(modifier).h(new SizeAnimationModifierElement(ph2Var, gt2Var));
    }

    public static /* synthetic */ Modifier b(Modifier modifier, ph2 ph2Var, gt2 gt2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ph2Var = di.i(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            gt2Var = null;
        }
        return a(modifier, ph2Var, gt2Var);
    }

    public static final long c() {
        return a;
    }

    public static final boolean d(long j) {
        return !hn3.e(j, a);
    }
}
