package androidx.compose.foundation.relocation;

import androidx.compose.ui.Modifier;
import defpackage.qc0;

/* loaded from: classes.dex */
public abstract class b {
    public static final qc0 a() {
        return new BringIntoViewRequesterImpl();
    }

    public static final Modifier b(Modifier modifier, qc0 qc0Var) {
        return modifier.h(new BringIntoViewRequesterElement(qc0Var));
    }
}
