package androidx.compose.foundation.gestures;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "androidx.compose.foundation.gestures.DraggableKt", f = "Draggable.kt", l = {689}, m = "onDragOrUp-Axegvzg")
/* loaded from: classes.dex */
final class DraggableKt$onDragOrUp$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    DraggableKt$onDragOrUp$1(by0 by0Var) {
        super(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        l = DraggableKt.l(null, null, 0L, null, this);
        return l;
    }
}
