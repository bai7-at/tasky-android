package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import defpackage.ss2;

/* loaded from: classes.dex */
public abstract class a {
    public static final Modifier a(Modifier modifier, ss2 ss2Var) {
        return modifier.h(new KeyInputElement(ss2Var, null));
    }

    public static final Modifier b(Modifier modifier, ss2 ss2Var) {
        return modifier.h(new KeyInputElement(null, ss2Var));
    }
}
