package com.nytimes.android.designsystem.uicompose.composable;

import androidx.compose.foundation.lazy.LazyListState;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.g14;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.designsystem.uicompose.composable.DragDropState$onDrag$1", f = "LazyColumnDragAndDrop.kt", l = {159}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DragDropState$onDrag$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ g14 $draggingItem;
    final /* synthetic */ Integer $scrollToIndex;
    final /* synthetic */ g14 $targetItem;
    int label;
    final /* synthetic */ DragDropState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragDropState$onDrag$1(DragDropState dragDropState, Integer num, g14 g14Var, g14 g14Var2, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = dragDropState;
        this.$scrollToIndex = num;
        this.$draggingItem = g14Var;
        this.$targetItem = g14Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DragDropState$onDrag$1(this.this$0, this.$scrollToIndex, this.$draggingItem, this.$targetItem, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LazyListState lazyListState;
        LazyListState lazyListState2;
        gt2 gt2Var;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            lazyListState = this.this$0.b;
            int intValue = this.$scrollToIndex.intValue();
            lazyListState2 = this.this$0.b;
            int t = lazyListState2.t();
            this.label = 1;
            if (lazyListState.K(intValue, t, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        gt2Var = this.this$0.f;
        gt2Var.invoke(cc0.c(this.$draggingItem.getIndex()), cc0.c(this.$targetItem.getIndex()));
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((DragDropState$onDrag$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
