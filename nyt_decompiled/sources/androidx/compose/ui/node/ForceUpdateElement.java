package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import defpackage.ov4;
import defpackage.zq3;

/* loaded from: classes.dex */
final class ForceUpdateElement extends ov4 {
    private final ov4 b;

    public ForceUpdateElement(ov4 ov4Var) {
        this.b = ov4Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ForceUpdateElement) && zq3.c(this.b, ((ForceUpdateElement) obj).b);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.ov4
    public Modifier.c l() {
        throw new IllegalStateException("Shouldn't be called");
    }

    @Override // defpackage.ov4
    public void r(Modifier.c cVar) {
        throw new IllegalStateException("Shouldn't be called");
    }

    public final ov4 t() {
        return this.b;
    }

    public String toString() {
        return "ForceUpdateElement(original=" + this.b + ')';
    }
}
