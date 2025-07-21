package defpackage;

import androidx.compose.foundation.lazy.LazyListState;

/* loaded from: classes4.dex */
public abstract class p14 {
    public static final int a(LazyListState lazyListState, int i) {
        zq3.h(lazyListState, "<this>");
        return (int) ((lazyListState.s() / (i - lazyListState.x().k().size())) * 100.0f);
    }

    public static final float b(j14 j14Var, g14 g14Var) {
        zq3.h(j14Var, "<this>");
        zq3.h(g14Var, "info");
        return Math.max(0.0f, 1.0f - ((Math.max(0.0f, j14Var.j() - g14Var.b()) + Math.max(0.0f, (g14Var.b() + g14Var.a()) - j14Var.g())) / g14Var.a()));
    }
}
