package defpackage;

import android.view.View;
import coil.size.ViewSizeResolver;

/* loaded from: classes.dex */
public final class tr6 implements ViewSizeResolver {
    private final View b;
    private final boolean c;

    public tr6(View view, boolean z) {
        this.b = view;
        this.c = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tr6) {
            tr6 tr6Var = (tr6) obj;
            if (zq3.c(getView(), tr6Var.getView()) && l() == tr6Var.l()) {
                return true;
            }
        }
        return false;
    }

    @Override // coil.size.ViewSizeResolver
    public View getView() {
        return this.b;
    }

    public int hashCode() {
        return (getView().hashCode() * 31) + Boolean.hashCode(l());
    }

    @Override // coil.size.ViewSizeResolver
    public boolean l() {
        return this.c;
    }

    @Override // defpackage.fu7
    public Object r(by0 by0Var) {
        return ViewSizeResolver.DefaultImpls.h(this, by0Var);
    }
}
