package defpackage;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.input.pointer.c;
import kotlin.collections.i;

/* loaded from: classes.dex */
public abstract class bd8 {
    private static final c a = new c(i.l());

    public static final cd8 a(gt2 gt2Var) {
        return new SuspendingPointerInputModifierNodeImpl(gt2Var);
    }

    public static final Modifier c(Modifier modifier, Object obj, gt2 gt2Var) {
        return modifier.h(new SuspendPointerInputElement(obj, null, null, gt2Var, 6, null));
    }

    public static final Modifier d(Modifier modifier, Object obj, Object obj2, gt2 gt2Var) {
        return modifier.h(new SuspendPointerInputElement(obj, obj2, null, gt2Var, 4, null));
    }
}
