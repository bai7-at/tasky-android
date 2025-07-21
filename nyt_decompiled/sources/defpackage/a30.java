package defpackage;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.c;

/* loaded from: classes.dex */
public interface a30 extends fm1 {
    static /* synthetic */ Object d0(a30 a30Var, PointerEventPass pointerEventPass, by0 by0Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if ((i & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return a30Var.E(pointerEventPass, by0Var);
    }

    Object A0(long j, gt2 gt2Var, by0 by0Var);

    Object E(PointerEventPass pointerEventPass, by0 by0Var);

    c I0();

    long a();

    long e0();

    r99 getViewConfiguration();

    Object p0(long j, gt2 gt2Var, by0 by0Var);
}
