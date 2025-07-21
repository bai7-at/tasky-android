package dev.chrisbanes.snapper;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "dev.chrisbanes.snapper.SnapperFlingBehavior", f = "SnapperFlingBehavior.kt", l = {551}, m = "performSpringFling")
/* loaded from: classes4.dex */
final class SnapperFlingBehavior$performSpringFling$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SnapperFlingBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnapperFlingBehavior$performSpringFling$1(SnapperFlingBehavior snapperFlingBehavior, by0 by0Var) {
        super(by0Var);
        this.this$0 = snapperFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object o;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        o = this.this$0.o(null, null, 0, 0.0f, this);
        return o;
    }
}
