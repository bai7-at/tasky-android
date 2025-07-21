package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import defpackage.eg0;
import defpackage.fg0;
import defpackage.ss2;

/* loaded from: classes.dex */
public abstract class a {
    public static final eg0 a(ss2 ss2Var) {
        return new CacheDrawModifierNodeImpl(new fg0(), ss2Var);
    }

    public static final Modifier b(Modifier modifier, ss2 ss2Var) {
        return modifier.h(new DrawBehindElement(ss2Var));
    }

    public static final Modifier c(Modifier modifier, ss2 ss2Var) {
        return modifier.h(new DrawWithCacheElement(ss2Var));
    }

    public static final Modifier d(Modifier modifier, ss2 ss2Var) {
        return modifier.h(new DrawWithContentElement(ss2Var));
    }
}
