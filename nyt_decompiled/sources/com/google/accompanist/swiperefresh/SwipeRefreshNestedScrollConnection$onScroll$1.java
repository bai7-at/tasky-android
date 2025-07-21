package com.google.accompanist.swiperefresh;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.google.accompanist.swiperefresh.SwipeRefreshNestedScrollConnection$onScroll$1", f = "SwipeRefresh.kt", l = {185}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SwipeRefreshNestedScrollConnection$onScroll$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ float $dragConsumed;
    int label;
    final /* synthetic */ SwipeRefreshNestedScrollConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeRefreshNestedScrollConnection$onScroll$1(SwipeRefreshNestedScrollConnection swipeRefreshNestedScrollConnection, float f, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = swipeRefreshNestedScrollConnection;
        this.$dragConsumed = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SwipeRefreshNestedScrollConnection$onScroll$1(this.this$0, this.$dragConsumed, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SwipeRefreshState swipeRefreshState;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            swipeRefreshState = this.this$0.a;
            float f = this.$dragConsumed;
            this.label = 1;
            if (swipeRefreshState.c(f, this) == h) {
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

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SwipeRefreshNestedScrollConnection$onScroll$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
