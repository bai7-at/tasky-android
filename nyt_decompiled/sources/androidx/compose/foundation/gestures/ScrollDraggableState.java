package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import defpackage.by0;
import defpackage.g35;
import defpackage.gt2;
import defpackage.qc7;
import defpackage.qu1;
import defpackage.vu1;
import defpackage.ww8;

/* loaded from: classes.dex */
final class ScrollDraggableState implements vu1, qu1 {
    private ScrollingLogic a;
    private qc7 b;

    public ScrollDraggableState(ScrollingLogic scrollingLogic) {
        qc7 qc7Var;
        this.a = scrollingLogic;
        qc7Var = ScrollableKt.c;
        this.b = qc7Var;
    }

    @Override // defpackage.vu1
    public Object b(MutatePriority mutatePriority, gt2 gt2Var, by0 by0Var) {
        Object b = this.a.e().b(mutatePriority, new ScrollDraggableState$drag$2(this, gt2Var, null), by0Var);
        return b == kotlin.coroutines.intrinsics.a.h() ? b : ww8.a;
    }

    @Override // defpackage.qu1
    public void c(float f) {
        ScrollingLogic scrollingLogic = this.a;
        scrollingLogic.c(this.b, scrollingLogic.q(f), g35.a.a());
    }

    public final void d(qc7 qc7Var) {
        this.b = qc7Var;
    }
}
