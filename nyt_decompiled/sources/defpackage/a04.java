package defpackage;

import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public final class a04 extends Modifier.c implements vo5 {
    private float n;
    private boolean r;

    public a04(float f, boolean z) {
        this.n = f;
        this.r = z;
    }

    @Override // defpackage.vo5
    /* renamed from: e2, reason: merged with bridge method [inline-methods] */
    public l37 i(fm1 fm1Var, Object obj) {
        l37 l37Var = obj instanceof l37 ? (l37) obj : null;
        if (l37Var == null) {
            l37Var = new l37(0.0f, false, null, 7, null);
        }
        l37Var.f(this.n);
        l37Var.e(this.r);
        return l37Var;
    }

    public final void f2(boolean z) {
        this.r = z;
    }

    public final void g2(float f) {
        this.n = f;
    }
}
