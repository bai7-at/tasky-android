package defpackage;

import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public abstract class vz3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier.c b(ql1 ql1Var) {
        int a = a85.a(4);
        int a2 = a85.a(2);
        Modifier.c C1 = ql1Var.c0().C1();
        if (C1 == null || (C1.B1() & a) == 0) {
            return null;
        }
        while (C1 != null && (C1.G1() & a2) == 0) {
            if ((C1.G1() & a) != 0) {
                return C1;
            }
            C1 = C1.C1();
        }
        return null;
    }
}
