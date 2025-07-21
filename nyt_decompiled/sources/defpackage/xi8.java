package defpackage;

import androidx.compose.ui.text.g;

/* loaded from: classes.dex */
public final class xi8 {
    private final fd4 a;

    public xi8(int i) {
        this.a = new fd4(i);
    }

    public final aj8 a(g gVar) {
        aj8 aj8Var = (aj8) this.a.d(new ng0(gVar));
        if (aj8Var == null || aj8Var.w().j().c()) {
            return null;
        }
        return aj8Var;
    }

    public final aj8 b(g gVar, aj8 aj8Var) {
        return (aj8) this.a.e(new ng0(gVar), aj8Var);
    }
}
