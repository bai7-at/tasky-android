package defpackage;

import androidx.compose.ui.text.SpanStyleKt;
import androidx.compose.ui.text.f;

/* loaded from: classes.dex */
public abstract class og {
    public static final zu5 a(f fVar, uu5 uu5Var) {
        return new zu5(fVar, uu5Var);
    }

    public static final uu5 b(uu5 uu5Var, uu5 uu5Var2, float f) {
        return uu5Var.c() == uu5Var2.c() ? uu5Var : new uu5(((b02) SpanStyleKt.d(b02.c(uu5Var.b()), b02.c(uu5Var2.b()), f)).i(), ((Boolean) SpanStyleKt.d(Boolean.valueOf(uu5Var.c()), Boolean.valueOf(uu5Var2.c()), f)).booleanValue(), null);
    }

    public static final f c(f fVar, f fVar2, float f) {
        return fVar;
    }
}
