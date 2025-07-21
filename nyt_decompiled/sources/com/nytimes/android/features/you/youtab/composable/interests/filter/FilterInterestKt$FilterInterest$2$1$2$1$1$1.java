package com.nytimes.android.features.you.youtab.composable.interests.filter;

import androidx.compose.foundation.pager.PagerState;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.sy4;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.you.youtab.composable.interests.filter.FilterInterestKt$FilterInterest$2$1$2$1$1$1", f = "FilterInterest.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FilterInterestKt$FilterInterest$2$1$2$1$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ sy4 $activeInnerPagerState;
    final /* synthetic */ int $index;
    final /* synthetic */ PagerState $innerPagerState;
    final /* synthetic */ PagerState $outerPagerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FilterInterestKt$FilterInterest$2$1$2$1$1$1(PagerState pagerState, int i, sy4 sy4Var, PagerState pagerState2, by0 by0Var) {
        super(2, by0Var);
        this.$outerPagerState = pagerState;
        this.$index = i;
        this.$activeInnerPagerState = sy4Var;
        this.$innerPagerState = pagerState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new FilterInterestKt$FilterInterest$2$1$2$1$1$1(this.$outerPagerState, this.$index, this.$activeInnerPagerState, this.$innerPagerState, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        if (this.$outerPagerState.w() == this.$index) {
            this.$activeInnerPagerState.setValue(this.$innerPagerState);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((FilterInterestKt$FilterInterest$2$1$2$1$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
