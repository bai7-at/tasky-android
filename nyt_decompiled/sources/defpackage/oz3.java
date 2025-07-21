package defpackage;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.node.c;

/* loaded from: classes.dex */
public final class oz3 extends Modifier.c implements c {
    private it2 n;

    public oz3(it2 it2Var) {
        this.n = it2Var;
    }

    @Override // androidx.compose.ui.node.c
    public sg4 d(f fVar, qg4 qg4Var, long j) {
        return (sg4) this.n.invoke(fVar, qg4Var, fv0.b(j));
    }

    public final void e2(it2 it2Var) {
        this.n = it2Var;
    }

    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.n + ')';
    }
}
