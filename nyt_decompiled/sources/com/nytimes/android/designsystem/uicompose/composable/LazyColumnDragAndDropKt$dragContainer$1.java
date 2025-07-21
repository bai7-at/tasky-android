package com.nytimes.android.designsystem.uicompose.composable;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fd5;
import defpackage.fy5;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.vx5;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.designsystem.uicompose.composable.LazyColumnDragAndDropKt$dragContainer$1", f = "LazyColumnDragAndDrop.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LazyColumnDragAndDropKt$dragContainer$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ DragDropState $dragDropState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyColumnDragAndDropKt$dragContainer$1(DragDropState dragDropState, by0 by0Var) {
        super(2, by0Var);
        this.$dragDropState = dragDropState;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(fy5 fy5Var, by0 by0Var) {
        return ((LazyColumnDragAndDropKt$dragContainer$1) create(fy5Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        LazyColumnDragAndDropKt$dragContainer$1 lazyColumnDragAndDropKt$dragContainer$1 = new LazyColumnDragAndDropKt$dragContainer$1(this.$dragDropState, by0Var);
        lazyColumnDragAndDropKt$dragContainer$1.L$0 = obj;
        return lazyColumnDragAndDropKt$dragContainer$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            fy5 fy5Var = (fy5) this.L$0;
            if (this.$dragDropState.m()) {
                final DragDropState dragDropState = this.$dragDropState;
                ss2 ss2Var = new ss2() { // from class: com.nytimes.android.designsystem.uicompose.composable.LazyColumnDragAndDropKt$dragContainer$1.1
                    {
                        super(1);
                    }

                    public final void b(long j) {
                        DragDropState.this.p(j);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        b(((fd5) obj2).x());
                        return ww8.a;
                    }
                };
                final DragDropState dragDropState2 = this.$dragDropState;
                qs2 qs2Var = new qs2() { // from class: com.nytimes.android.designsystem.uicompose.composable.LazyColumnDragAndDropKt$dragContainer$1.2
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m342invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m342invoke() {
                        DragDropState.this.o();
                    }
                };
                final DragDropState dragDropState3 = this.$dragDropState;
                qs2 qs2Var2 = new qs2() { // from class: com.nytimes.android.designsystem.uicompose.composable.LazyColumnDragAndDropKt$dragContainer$1.3
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m343invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m343invoke() {
                        DragDropState.this.o();
                    }
                };
                final DragDropState dragDropState4 = this.$dragDropState;
                gt2 gt2Var = new gt2() { // from class: com.nytimes.android.designsystem.uicompose.composable.LazyColumnDragAndDropKt$dragContainer$1.4
                    {
                        super(2);
                    }

                    public final void b(vx5 vx5Var, long j) {
                        zq3.h(vx5Var, "change");
                        vx5Var.a();
                        DragDropState.this.n(j);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        b((vx5) obj2, ((fd5) obj3).x());
                        return ww8.a;
                    }
                };
                this.label = 1;
                if (DragGestureDetectorKt.e(fy5Var, ss2Var, qs2Var, qs2Var2, gt2Var, this) == h) {
                    return h;
                }
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
