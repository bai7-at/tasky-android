package com.google.accompanist.swiperefresh;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.google.accompanist.swiperefresh.SwipeRefreshKt$SwipeRefresh$1$1", f = "SwipeRefresh.kt", l = {281}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SwipeRefreshKt$SwipeRefresh$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ SwipeRefreshState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeRefreshKt$SwipeRefresh$1$1(SwipeRefreshState swipeRefreshState, by0 by0Var) {
        super(2, by0Var);
        this.$state = swipeRefreshState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SwipeRefreshKt$SwipeRefresh$1$1(this.$state, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            if (!this.$state.f()) {
                SwipeRefreshState swipeRefreshState = this.$state;
                this.label = 1;
                if (swipeRefreshState.b(0.0f, this) == h) {
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

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SwipeRefreshKt$SwipeRefresh$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
