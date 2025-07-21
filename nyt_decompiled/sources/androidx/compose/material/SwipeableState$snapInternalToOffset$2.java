package androidx.compose.material;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qu1;
import defpackage.ww8;
import defpackage.yx4;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "androidx.compose.material.SwipeableState$snapInternalToOffset$2", f = "Swipeable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SwipeableState$snapInternalToOffset$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ float $target;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SwipeableState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeableState$snapInternalToOffset$2(float f, SwipeableState swipeableState, by0 by0Var) {
        super(2, by0Var);
        this.$target = f;
        this.this$0 = swipeableState;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(qu1 qu1Var, by0 by0Var) {
        return ((SwipeableState$snapInternalToOffset$2) create(qu1Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        SwipeableState$snapInternalToOffset$2 swipeableState$snapInternalToOffset$2 = new SwipeableState$snapInternalToOffset$2(this.$target, this.this$0, by0Var);
        swipeableState$snapInternalToOffset$2.L$0 = obj;
        return swipeableState$snapInternalToOffset$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yx4 yx4Var;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        qu1 qu1Var = (qu1) this.L$0;
        float f = this.$target;
        yx4Var = this.this$0.g;
        qu1Var.c(f - yx4Var.a());
        return ww8.a;
    }
}
