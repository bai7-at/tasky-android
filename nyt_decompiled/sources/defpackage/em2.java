package defpackage;

import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class em2 {
    private final Map a = new LinkedHashMap();
    private final vy4 b = new vy4(new qs2[16], 0);
    private boolean c;

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        this.c = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        vy4 vy4Var = this.b;
        int q = vy4Var.q();
        if (q > 0) {
            Object[] p = vy4Var.p();
            int i = 0;
            do {
                ((qs2) p[i]).mo865invoke();
                i++;
            } while (i < q);
        }
        this.b.h();
        this.a.clear();
        this.c = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        Iterator it2 = this.a.keySet().iterator();
        while (it2.hasNext()) {
            ((FocusTargetNode) it2.next()).i2();
        }
        this.a.clear();
        this.c = false;
    }

    public final FocusStateImpl i(FocusTargetNode focusTargetNode) {
        return (FocusStateImpl) this.a.get(focusTargetNode);
    }

    public final void j(FocusTargetNode focusTargetNode, FocusStateImpl focusStateImpl) {
        Map map = this.a;
        if (focusStateImpl == null) {
            throw new IllegalStateException("requires a non-null focus state");
        }
        map.put(focusTargetNode, focusStateImpl);
    }
}
