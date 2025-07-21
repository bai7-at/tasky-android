package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DraggableNode;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qu1;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "androidx.compose.foundation.gestures.DraggableNode$drag$2", f = "Draggable.kt", l = {322}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class DraggableNode$drag$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ gt2 $block;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DraggableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DraggableNode$drag$2(DraggableNode draggableNode, gt2 gt2Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = draggableNode;
        this.$block = gt2Var;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(qu1 qu1Var, by0 by0Var) {
        return ((DraggableNode$drag$2) create(qu1Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        DraggableNode$drag$2 draggableNode$drag$2 = new DraggableNode$drag$2(this.this$0, this.$block, by0Var);
        draggableNode$drag$2.L$0 = obj;
        return draggableNode$drag$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DraggableNode.a aVar;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            this.this$0.Q2((qu1) this.L$0);
            gt2 gt2Var = this.$block;
            aVar = this.this$0.f0;
            this.label = 1;
            if (gt2Var.invoke(aVar, this) == h) {
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
