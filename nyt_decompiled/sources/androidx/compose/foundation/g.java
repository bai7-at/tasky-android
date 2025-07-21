package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import defpackage.dy4;

/* loaded from: classes.dex */
public abstract class g {
    public static final Modifier a(Modifier modifier, dy4 dy4Var, boolean z) {
        return modifier.h(z ? new HoverableElement(dy4Var) : Modifier.a);
    }
}
