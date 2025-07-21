package androidx.compose.foundation.gestures.snapping;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {409}, m = "animateWithTarget")
/* loaded from: classes.dex */
final class SnapFlingBehaviorKt$animateWithTarget$1 extends ContinuationImpl {
    float F$0;
    float F$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    SnapFlingBehaviorKt$animateWithTarget$1(by0 by0Var) {
        super(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        h = SnapFlingBehaviorKt.h(null, 0.0f, 0.0f, null, null, null, this);
        return h;
    }
}
