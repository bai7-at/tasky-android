package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import defpackage.el5;

/* loaded from: classes.dex */
public final class wx2 implements no7 {
    private final it2 a;

    public wx2(it2 it2Var) {
        this.a = it2Var;
    }

    @Override // defpackage.no7
    public el5 a(long j, LayoutDirection layoutDirection, fm1 fm1Var) {
        ip5 a = cg.a();
        this.a.invoke(a, zt7.c(j), layoutDirection);
        a.close();
        return new el5.a(a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        wx2 wx2Var = obj instanceof wx2 ? (wx2) obj : null;
        return zq3.c(wx2Var != null ? wx2Var.a : null, this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
