package defpackage;

import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public abstract class x75 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier.c b(ql1 ql1Var, int i, int i2) {
        Modifier.c C1 = ql1Var.c0().C1();
        if (C1 == null || (C1.B1() & i) == 0) {
            return null;
        }
        while (C1 != null) {
            int G1 = C1.G1();
            if ((G1 & i2) != 0) {
                return null;
            }
            if ((G1 & i) != 0) {
                return C1;
            }
            C1 = C1.C1();
        }
        return null;
    }
}
