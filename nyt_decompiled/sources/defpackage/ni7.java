package defpackage;

import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.node.c;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.j;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ni7 extends ul1 implements c, cv1, f13 {
    private ui7 s;
    private final TextAnnotatedStringNode t;

    public /* synthetic */ ni7(a aVar, j jVar, e.b bVar, ss2 ss2Var, int i, boolean z, int i2, int i3, List list, ss2 ss2Var2, ui7 ui7Var, do0 do0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, jVar, bVar, ss2Var, i, z, i2, i3, list, ss2Var2, ui7Var, do0Var);
    }

    @Override // androidx.compose.ui.node.c
    public sg4 d(f fVar, qg4 qg4Var, long j) {
        return this.t.s2(fVar, qg4Var, j);
    }

    @Override // androidx.compose.ui.node.c
    public int f(yq3 yq3Var, xq3 xq3Var, int i) {
        return this.t.u2(yq3Var, xq3Var, i);
    }

    public final void j2(a aVar, j jVar, List list, int i, int i2, boolean z, e.b bVar, int i3, ss2 ss2Var, ss2 ss2Var2, ui7 ui7Var, do0 do0Var) {
        TextAnnotatedStringNode textAnnotatedStringNode = this.t;
        textAnnotatedStringNode.l2(textAnnotatedStringNode.y2(do0Var, jVar), this.t.A2(aVar), this.t.z2(jVar, list, i, i2, z, bVar, i3), this.t.x2(ss2Var, ss2Var2, ui7Var));
        qz3.b(this);
    }

    @Override // defpackage.f13
    public void k(cz3 cz3Var) {
    }

    @Override // androidx.compose.ui.node.c
    public int m(yq3 yq3Var, xq3 xq3Var, int i) {
        return this.t.q2(yq3Var, xq3Var, i);
    }

    @Override // androidx.compose.ui.node.c
    public int o(yq3 yq3Var, xq3 xq3Var, int i) {
        return this.t.t2(yq3Var, xq3Var, i);
    }

    @Override // androidx.compose.ui.node.c
    public int u(yq3 yq3Var, xq3 xq3Var, int i) {
        return this.t.r2(yq3Var, xq3Var, i);
    }

    @Override // defpackage.cv1
    public void w(yv0 yv0Var) {
        this.t.m2(yv0Var);
    }

    private ni7(a aVar, j jVar, e.b bVar, ss2 ss2Var, int i, boolean z, int i2, int i3, List list, ss2 ss2Var2, ui7 ui7Var, do0 do0Var) {
        this.t = (TextAnnotatedStringNode) e2(new TextAnnotatedStringNode(aVar, jVar, bVar, ss2Var, i, z, i2, i3, list, ss2Var2, this.s, do0Var, null));
        throw new IllegalArgumentException("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
    }
}
