package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes.dex */
public abstract class tc0 {

    static final class a implements pc0 {
        final /* synthetic */ ct0 a;

        a(ct0 ct0Var) {
            this.a = ct0Var;
        }

        @Override // defpackage.pc0
        public final Object Y(cz3 cz3Var, qs2 qs2Var, by0 by0Var) {
            View view = (View) dt0.a(this.a, AndroidCompositionLocals_androidKt.k());
            long e = ez3.e(cz3Var);
            kt6 kt6Var = (kt6) qs2Var.mo865invoke();
            kt6 t = kt6Var != null ? kt6Var.t(e) : null;
            if (t != null) {
                view.requestRectangleOnScreen(tc0.c(t), false);
            }
            return ww8.a;
        }
    }

    public static final pc0 b(ct0 ct0Var) {
        return new a(ct0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect c(kt6 kt6Var) {
        return new Rect((int) kt6Var.i(), (int) kt6Var.l(), (int) kt6Var.j(), (int) kt6Var.e());
    }
}
