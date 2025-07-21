package androidx.compose.foundation.gestures.snapping;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {165}, m = "fling")
/* loaded from: classes.dex */
final class SnapFlingBehavior$fling$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnapFlingBehavior$fling$1(SnapFlingBehavior snapFlingBehavior, by0 by0Var) {
        super(by0Var);
        this.this$0 = snapFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        f = this.this$0.f(null, 0.0f, null, this);
        return f;
    }
}
