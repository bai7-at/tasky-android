package com.google.accompanist.pager;

import defpackage.by0;
import defpackage.fc1;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.google.accompanist.pager.Pager$Pager$6$1", f = "Pager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class Pager$Pager$6$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ fm1 $density;
    final /* synthetic */ float $itemSpacing;
    final /* synthetic */ PagerState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Pager$Pager$6$1(fm1 fm1Var, PagerState pagerState, float f, by0 by0Var) {
        super(2, by0Var);
        this.$density = fm1Var;
        this.$state = pagerState;
        this.$itemSpacing = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new Pager$Pager$6$1(this.$density, this.$state, this.$itemSpacing, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.$state.y(this.$density.l0(this.$itemSpacing));
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((Pager$Pager$6$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
