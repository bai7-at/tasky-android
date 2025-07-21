package androidx.compose.foundation.gestures;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "androidx.compose.foundation.gestures.AbstractDraggableNode", f = "Draggable.kt", l = {546, 549}, m = "processDragStop")
/* loaded from: classes.dex */
final class AbstractDraggableNode$processDragStop$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractDraggableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractDraggableNode$processDragStop$1(AbstractDraggableNode abstractDraggableNode, by0 by0Var) {
        super(by0Var);
        this.this$0 = abstractDraggableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object E2;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        E2 = this.this$0.E2(null, null, this);
        return E2;
    }
}
