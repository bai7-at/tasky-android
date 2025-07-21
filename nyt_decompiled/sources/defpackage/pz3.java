package defpackage;

import androidx.compose.ui.node.h;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class pz3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(h hVar, fb fbVar) {
        h S0 = hVar.S0();
        if (S0 == null) {
            throw new IllegalStateException(("Child of " + hVar + " cannot be null when calculating alignment line").toString());
        }
        if (hVar.V0().f().containsKey(fbVar)) {
            Integer num = (Integer) hVar.V0().f().get(fbVar);
            return num != null ? num.intValue() : RecyclerView.UNDEFINED_DURATION;
        }
        int c0 = S0.c0(fbVar);
        if (c0 == Integer.MIN_VALUE) {
            return RecyclerView.UNDEFINED_DURATION;
        }
        S0.x1(true);
        hVar.w1(true);
        hVar.u1();
        S0.x1(false);
        hVar.w1(false);
        return c0 + (fbVar instanceof ba3 ? vm3.k(S0.b1()) : vm3.j(S0.b1()));
    }
}
