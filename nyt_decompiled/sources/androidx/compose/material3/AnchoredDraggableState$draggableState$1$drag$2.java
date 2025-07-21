package androidx.compose.material3;

import androidx.compose.material3.AnchoredDraggableState$draggableState$1;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.id;
import defpackage.it2;
import defpackage.ru1;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "androidx.compose.material3.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", l = {282}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AnchoredDraggableState$draggableState$1$drag$2 extends SuspendLambda implements it2 {
    final /* synthetic */ gt2 $block;
    int label;
    final /* synthetic */ AnchoredDraggableState$draggableState$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableState$draggableState$1$drag$2(AnchoredDraggableState$draggableState$1 anchoredDraggableState$draggableState$1, gt2 gt2Var, by0 by0Var) {
        super(3, by0Var);
        this.this$0 = anchoredDraggableState$draggableState$1;
        this.$block = gt2Var;
    }

    @Override // defpackage.it2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(id idVar, ru1 ru1Var, by0 by0Var) {
        return new AnchoredDraggableState$draggableState$1$drag$2(this.this$0, this.$block, by0Var).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnchoredDraggableState$draggableState$1.a aVar;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            aVar = this.this$0.a;
            gt2 gt2Var = this.$block;
            this.label = 1;
            if (gt2Var.invoke(aVar, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return ww8.a;
    }
}
