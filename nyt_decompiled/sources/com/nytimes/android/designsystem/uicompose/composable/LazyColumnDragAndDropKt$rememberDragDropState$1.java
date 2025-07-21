package com.nytimes.android.designsystem.uicompose.composable;

import androidx.compose.foundation.lazy.LazyListState;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.designsystem.uicompose.composable.LazyColumnDragAndDropKt$rememberDragDropState$1", f = "LazyColumnDragAndDrop.kt", l = {57, 58}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LazyColumnDragAndDropKt$rememberDragDropState$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ DragDropState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyColumnDragAndDropKt$rememberDragDropState$1(DragDropState dragDropState, LazyListState lazyListState, by0 by0Var) {
        super(2, by0Var);
        this.$state = dragDropState;
        this.$lazyListState = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new LazyColumnDragAndDropKt$rememberDragDropState$1(this.$state, this.$lazyListState, by0Var);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003b -> B:11:0x001e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L1b
        Lf:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L17:
            kotlin.f.b(r5)
            goto L2d
        L1b:
            kotlin.f.b(r5)
        L1e:
            com.nytimes.android.designsystem.uicompose.composable.DragDropState r5 = r4.$state
            kotlinx.coroutines.channels.Channel r5 = r5.l()
            r4.label = r3
            java.lang.Object r5 = r5.receive(r4)
            if (r5 != r0) goto L2d
            return r0
        L2d:
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            androidx.compose.foundation.lazy.LazyListState r1 = r4.$lazyListState
            r4.label = r2
            java.lang.Object r5 = androidx.compose.foundation.gestures.ScrollExtensionsKt.c(r1, r5, r4)
            if (r5 != r0) goto L1e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.designsystem.uicompose.composable.LazyColumnDragAndDropKt$rememberDragDropState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((LazyColumnDragAndDropKt$rememberDragDropState$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
