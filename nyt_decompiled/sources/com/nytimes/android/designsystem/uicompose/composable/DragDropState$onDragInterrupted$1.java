package com.nytimes.android.designsystem.uicompose.composable;

import androidx.compose.animation.core.Animatable;
import defpackage.by0;
import defpackage.cc0;
import defpackage.di;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qz7;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.designsystem.uicompose.composable.DragDropState$onDragInterrupted$1", f = "LazyColumnDragAndDrop.kt", l = {109, 110}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DragDropState$onDragInterrupted$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ float $startOffset;
    int label;
    final /* synthetic */ DragDropState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragDropState$onDragInterrupted$1(DragDropState dragDropState, float f, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = dragDropState;
        this.$startOffset = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DragDropState$onDragInterrupted$1(this.this$0, this.$startOffset, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Animatable k = this.this$0.k();
            Float b = cc0.b(this.$startOffset);
            this.label = 1;
            if (k.t(b, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                this.this$0.t(null);
                return ww8.a;
            }
            f.b(obj);
        }
        Animatable k2 = this.this$0.k();
        Float b2 = cc0.b(0.0f);
        qz7 i2 = di.i(0.0f, 400.0f, cc0.b(1.0f), 1, null);
        this.label = 2;
        if (Animatable.f(k2, b2, i2, null, null, this, 12, null) == h) {
            return h;
        }
        this.this$0.t(null);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((DragDropState$onDragInterrupted$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
