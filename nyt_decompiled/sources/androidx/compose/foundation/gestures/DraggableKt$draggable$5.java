package androidx.compose.foundation.gestures;

import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.u49;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$5", f = "Draggable.kt", l = {203}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class DraggableKt$draggable$5 extends SuspendLambda implements it2 {
    final /* synthetic */ it2 $onDragStopped;
    final /* synthetic */ Orientation $orientation;
    /* synthetic */ long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DraggableKt$draggable$5(it2 it2Var, Orientation orientation, by0 by0Var) {
        super(3, by0Var);
        this.$onDragStopped = it2Var;
        this.$orientation = orientation;
    }

    public final Object b(CoroutineScope coroutineScope, long j, by0 by0Var) {
        DraggableKt$draggable$5 draggableKt$draggable$5 = new DraggableKt$draggable$5(this.$onDragStopped, this.$orientation, by0Var);
        draggableKt$draggable$5.L$0 = coroutineScope;
        draggableKt$draggable$5.J$0 = j;
        return draggableKt$draggable$5.invokeSuspend(ww8.a);
    }

    @Override // defpackage.it2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return b((CoroutineScope) obj, ((u49) obj2).o(), (by0) obj3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float n;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            long j = this.J$0;
            it2 it2Var = this.$onDragStopped;
            n = DraggableKt.n(j, this.$orientation);
            Float b = cc0.b(n);
            this.label = 1;
            if (it2Var.invoke(coroutineScope, b, this) == h) {
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
