package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import defpackage.hz3;
import defpackage.qg4;

/* loaded from: classes.dex */
public abstract class b {
    public static final Object a(qg4 qg4Var) {
        Object d = qg4Var.d();
        hz3 hz3Var = d instanceof hz3 ? (hz3) d : null;
        if (hz3Var != null) {
            return hz3Var.L0();
        }
        return null;
    }

    public static final Modifier b(Modifier modifier, Object obj) {
        return modifier.h(new LayoutIdElement(obj));
    }
}
