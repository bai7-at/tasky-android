package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import defpackage.qs2;
import defpackage.rl1;
import defpackage.xc5;

/* loaded from: classes.dex */
public abstract class l {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Modifier.c cVar, qs2 qs2Var) {
        ObserverNodeOwnerScope H1 = cVar.H1();
        if (H1 == null) {
            H1 = new ObserverNodeOwnerScope((xc5) cVar);
            cVar.Z1(H1);
        }
        rl1.l(cVar).getSnapshotObserver().i(H1, ObserverNodeOwnerScope.b.a(), qs2Var);
    }
}
