package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import defpackage.dy4;
import defpackage.it2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ul1;

/* loaded from: classes.dex */
final class ScrollableGesturesNode extends ul1 {
    private final qs2 B;
    private final it2 H;
    private final DraggableNode L;
    private final ScrollingLogic s;
    private final Orientation t;
    private final boolean u;
    private final NestedScrollDispatcher w;
    private final dy4 x;
    private final ScrollDraggableState y;

    public ScrollableGesturesNode(ScrollingLogic scrollingLogic, Orientation orientation, boolean z, NestedScrollDispatcher nestedScrollDispatcher, dy4 dy4Var) {
        ss2 ss2Var;
        it2 it2Var;
        this.s = scrollingLogic;
        this.t = orientation;
        this.u = z;
        this.w = nestedScrollDispatcher;
        this.x = dy4Var;
        e2(new MouseWheelScrollNode(scrollingLogic));
        ScrollDraggableState scrollDraggableState = new ScrollDraggableState(scrollingLogic);
        this.y = scrollDraggableState;
        qs2 qs2Var = new qs2() { // from class: androidx.compose.foundation.gestures.ScrollableGesturesNode$startDragImmediately$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Boolean mo865invoke() {
                return Boolean.valueOf(ScrollableGesturesNode.this.k2().l());
            }
        };
        this.B = qs2Var;
        ScrollableGesturesNode$onDragStopped$1 scrollableGesturesNode$onDragStopped$1 = new ScrollableGesturesNode$onDragStopped$1(this, null);
        this.H = scrollableGesturesNode$onDragStopped$1;
        ss2Var = ScrollableKt.a;
        it2Var = ScrollableKt.b;
        this.L = (DraggableNode) e2(new DraggableNode(scrollDraggableState, ss2Var, orientation, z, dy4Var, qs2Var, it2Var, scrollableGesturesNode$onDragStopped$1, false));
    }

    public final NestedScrollDispatcher j2() {
        return this.w;
    }

    public final ScrollingLogic k2() {
        return this.s;
    }

    public final void l2(Orientation orientation, boolean z, dy4 dy4Var) {
        it2 it2Var;
        ss2 ss2Var;
        DraggableNode draggableNode = this.L;
        ScrollDraggableState scrollDraggableState = this.y;
        qs2 qs2Var = this.B;
        it2Var = ScrollableKt.b;
        it2 it2Var2 = this.H;
        ss2Var = ScrollableKt.a;
        draggableNode.R2(scrollDraggableState, ss2Var, orientation, z, dy4Var, qs2Var, it2Var, it2Var2, false);
    }
}
