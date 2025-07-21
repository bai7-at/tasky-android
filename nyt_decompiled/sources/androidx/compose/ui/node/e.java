package androidx.compose.ui.node;

import defpackage.fb;
import defpackage.gb;
import java.util.Map;

/* loaded from: classes.dex */
public final class e extends AlignmentLines {
    public e(gb gbVar) {
        super(gbVar, null);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    protected long d(NodeCoordinator nodeCoordinator, long j) {
        return nodeCoordinator.S2(j);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    protected Map e(NodeCoordinator nodeCoordinator) {
        return nodeCoordinator.V0().f();
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    protected int i(NodeCoordinator nodeCoordinator, fb fbVar) {
        return nodeCoordinator.c0(fbVar);
    }
}
