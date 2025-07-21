package androidx.compose.foundation.lazy;

import androidx.compose.ui.Modifier;
import defpackage.ph2;

/* loaded from: classes.dex */
public abstract class b {
    public static final Modifier a(Modifier modifier, ph2 ph2Var, ph2 ph2Var2) {
        return (ph2Var == null && ph2Var2 == null) ? modifier : modifier.h(new AnimateItemElement(ph2Var, ph2Var2));
    }
}
