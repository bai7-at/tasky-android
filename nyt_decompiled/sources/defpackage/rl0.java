package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.el5;

/* loaded from: classes.dex */
public abstract class rl0 {
    private static final float a = bu1.g(30);
    private static final Modifier b;
    private static final Modifier c;

    public static final class a implements no7 {
        a() {
        }

        @Override // defpackage.no7
        public el5 a(long j, LayoutDirection layoutDirection, fm1 fm1Var) {
            float l0 = fm1Var.l0(rl0.b());
            return new el5.b(new kt6(0.0f, -l0, zt7.i(j), zt7.g(j) + l0));
        }
    }

    public static final class b implements no7 {
        b() {
        }

        @Override // defpackage.no7
        public el5 a(long j, LayoutDirection layoutDirection, fm1 fm1Var) {
            float l0 = fm1Var.l0(rl0.b());
            return new el5.b(new kt6(-l0, 0.0f, zt7.i(j) + l0, zt7.g(j)));
        }
    }

    static {
        Modifier.a aVar = Modifier.a;
        b = pl0.a(aVar, new a());
        c = pl0.a(aVar, new b());
    }

    public static final Modifier a(Modifier modifier, Orientation orientation) {
        return modifier.h(orientation == Orientation.Vertical ? c : b);
    }

    public static final float b() {
        return a;
    }
}
