package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import defpackage.ss2;

/* loaded from: classes.dex */
public abstract class b {
    public static final Modifier a(Modifier modifier, ss2 ss2Var) {
        return modifier.h(new FocusChangedElement(ss2Var));
    }
}
