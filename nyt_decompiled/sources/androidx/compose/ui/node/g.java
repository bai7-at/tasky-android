package androidx.compose.ui.node;

import defpackage.fb;
import defpackage.fd5;
import defpackage.gb;
import defpackage.hd5;
import defpackage.vm3;
import defpackage.zq3;
import java.util.Map;

/* loaded from: classes.dex */
public final class g extends AlignmentLines {
    public g(gb gbVar) {
        super(gbVar, null);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    protected long d(NodeCoordinator nodeCoordinator, long j) {
        i g2 = nodeCoordinator.g2();
        zq3.e(g2);
        long b1 = g2.b1();
        return fd5.t(hd5.a(vm3.j(b1), vm3.k(b1)), j);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    protected Map e(NodeCoordinator nodeCoordinator) {
        i g2 = nodeCoordinator.g2();
        zq3.e(g2);
        return g2.V0().f();
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    protected int i(NodeCoordinator nodeCoordinator, fb fbVar) {
        i g2 = nodeCoordinator.g2();
        zq3.e(g2);
        return g2.c0(fbVar);
    }
}
