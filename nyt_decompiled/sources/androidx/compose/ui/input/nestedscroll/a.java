package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.Modifier;
import defpackage.d35;

/* loaded from: classes.dex */
public abstract class a {
    public static final Modifier a(Modifier modifier, d35 d35Var, NestedScrollDispatcher nestedScrollDispatcher) {
        return modifier.h(new NestedScrollElement(d35Var, nestedScrollDispatcher));
    }

    public static /* synthetic */ Modifier b(Modifier modifier, d35 d35Var, NestedScrollDispatcher nestedScrollDispatcher, int i, Object obj) {
        if ((i & 2) != 0) {
            nestedScrollDispatcher = null;
        }
        return a(modifier, d35Var, nestedScrollDispatcher);
    }
}
