package androidx.compose.material3;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "androidx.compose.material3.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {732}, m = "restartable")
/* loaded from: classes.dex */
final class AnchoredDraggableKt$restartable$1<I> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    AnchoredDraggableKt$restartable$1(by0 by0Var) {
        super(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object g;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        g = AnchoredDraggableKt.g(null, null, this);
        return g;
    }
}
