package androidx.compose.foundation.gestures;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qc7;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "androidx.compose.foundation.gestures.ScrollDraggableState$drag$2", f = "Scrollable.kt", l = {894}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ScrollDraggableState$drag$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ gt2 $block;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ScrollDraggableState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollDraggableState$drag$2(ScrollDraggableState scrollDraggableState, gt2 gt2Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = scrollDraggableState;
        this.$block = gt2Var;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(qc7 qc7Var, by0 by0Var) {
        return ((ScrollDraggableState$drag$2) create(qc7Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        ScrollDraggableState$drag$2 scrollDraggableState$drag$2 = new ScrollDraggableState$drag$2(this.this$0, this.$block, by0Var);
        scrollDraggableState$drag$2.L$0 = obj;
        return scrollDraggableState$drag$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            this.this$0.d((qc7) this.L$0);
            gt2 gt2Var = this.$block;
            ScrollDraggableState scrollDraggableState = this.this$0;
            this.label = 1;
            if (gt2Var.invoke(scrollDraggableState, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }
}
