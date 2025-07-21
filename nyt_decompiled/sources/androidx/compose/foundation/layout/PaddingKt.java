package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.bu1;
import defpackage.lh4;
import defpackage.ml3;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.ym5;
import defpackage.zm5;

/* loaded from: classes.dex */
public abstract class PaddingKt {
    public static final ym5 a(float f) {
        return new zm5(f, f, f, f, null);
    }

    public static final ym5 b(float f, float f2) {
        return new zm5(f, f2, f, f2, null);
    }

    public static /* synthetic */ ym5 c(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = bu1.g(0);
        }
        if ((i & 2) != 0) {
            f2 = bu1.g(0);
        }
        return b(f, f2);
    }

    public static final ym5 d(float f, float f2, float f3, float f4) {
        return new zm5(f, f2, f3, f4, null);
    }

    public static /* synthetic */ ym5 e(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = bu1.g(0);
        }
        if ((i & 2) != 0) {
            f2 = bu1.g(0);
        }
        if ((i & 4) != 0) {
            f3 = bu1.g(0);
        }
        if ((i & 8) != 0) {
            f4 = bu1.g(0);
        }
        return d(f, f2, f3, f4);
    }

    public static final float f(ym5 ym5Var, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? ym5Var.c(layoutDirection) : ym5Var.b(layoutDirection);
    }

    public static final float g(ym5 ym5Var, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? ym5Var.b(layoutDirection) : ym5Var.c(layoutDirection);
    }

    public static final Modifier h(Modifier modifier, final ym5 ym5Var) {
        return modifier.h(new PaddingValuesElement(ym5Var, new ss2() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$4
            {
                super(1);
            }

            public final void b(ml3 ml3Var) {
                throw null;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                lh4.a(obj);
                b(null);
                return ww8.a;
            }
        }));
    }

    public static final Modifier i(Modifier modifier, final float f) {
        return modifier.h(new PaddingElement(f, f, f, f, true, new ss2() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(ml3 ml3Var) {
                throw null;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                lh4.a(obj);
                b(null);
                return ww8.a;
            }
        }, null));
    }

    public static final Modifier j(Modifier modifier, final float f, final float f2) {
        return modifier.h(new PaddingElement(f, f2, f, f2, true, new ss2() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(ml3 ml3Var) {
                throw null;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                lh4.a(obj);
                b(null);
                return ww8.a;
            }
        }, null));
    }

    public static /* synthetic */ Modifier k(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = bu1.g(0);
        }
        if ((i & 2) != 0) {
            f2 = bu1.g(0);
        }
        return j(modifier, f, f2);
    }

    public static final Modifier l(Modifier modifier, final float f, final float f2, final float f3, final float f4) {
        return modifier.h(new PaddingElement(f, f2, f3, f4, true, new ss2() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(ml3 ml3Var) {
                throw null;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                lh4.a(obj);
                b(null);
                return ww8.a;
            }
        }, null));
    }

    public static /* synthetic */ Modifier m(Modifier modifier, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = bu1.g(0);
        }
        if ((i & 2) != 0) {
            f2 = bu1.g(0);
        }
        if ((i & 4) != 0) {
            f3 = bu1.g(0);
        }
        if ((i & 8) != 0) {
            f4 = bu1.g(0);
        }
        return l(modifier, f, f2, f3, f4);
    }
}
