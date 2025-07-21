package com.google.accompanist.pager;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.uo6;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.google.accompanist.pager.Pager$Pager$3$1", f = "Pager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class Pager$Pager$3$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ int $count;
    final /* synthetic */ PagerState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Pager$Pager$3$1(PagerState pagerState, int i, by0 by0Var) {
        super(2, by0Var);
        this.$state = pagerState;
        this.$count = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new Pager$Pager$3$1(this.$state, this.$count, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        PagerState pagerState = this.$state;
        pagerState.w(uo6.d(Math.min(this.$count - 1, pagerState.k()), 0));
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((Pager$Pager$3$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
