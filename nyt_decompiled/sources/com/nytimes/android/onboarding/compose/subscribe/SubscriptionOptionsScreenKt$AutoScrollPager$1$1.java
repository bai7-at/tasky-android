package com.nytimes.android.onboarding.compose.subscribe;

import com.comscore.streaming.ContentType;
import com.google.accompanist.pager.PagerState;
import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.sy4;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

@fc1(c = "com.nytimes.android.onboarding.compose.subscribe.SubscriptionOptionsScreenKt$AutoScrollPager$1$1", f = "SubscriptionOptionsScreen.kt", l = {110, ContentType.SHORT_FORM_ON_DEMAND, 117}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubscriptionOptionsScreenKt$AutoScrollPager$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ sy4 $key$delegate;
    final /* synthetic */ long $pageDelay;
    final /* synthetic */ PagerState $pagerState;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriptionOptionsScreenKt$AutoScrollPager$1$1(PagerState pagerState, long j, sy4 sy4Var, by0 by0Var) {
        super(2, by0Var);
        this.$pagerState = pagerState;
        this.$pageDelay = j;
        this.$key$delegate = sy4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SubscriptionOptionsScreenKt$AutoScrollPager$1$1(this.$pagerState, this.$pageDelay, this.$key$delegate, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean b;
        Exception exc;
        PagerState pagerState;
        Object h = a.h();
        int i = this.label;
        try {
            try {
            } catch (Exception e) {
                long j = this.$pageDelay;
                this.L$0 = e;
                this.label = 3;
                if (DelayKt.delay(j, this) == h) {
                    return h;
                }
                exc = e;
            }
            if (i == 0) {
                f.b(obj);
                pagerState = this.$pagerState;
                long j2 = this.$pageDelay;
                this.L$0 = pagerState;
                this.label = 1;
                if (DelayKt.delay(j2, this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        f.b(obj);
                        return ww8.a;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    exc = (Exception) this.L$0;
                    f.b(obj);
                    NYTLogger.m(exc);
                    return ww8.a;
                }
                pagerState = (PagerState) this.L$0;
                f.b(obj);
            }
            int k = pagerState.k() + 1;
            int q = pagerState.q();
            int i2 = k % q;
            this.L$0 = null;
            this.label = 2;
            if (pagerState.i(i2 + (q & (((i2 ^ q) & ((-i2) | i2)) >> 31)), 0.0f, this) == h) {
                return h;
            }
            return ww8.a;
        } finally {
            sy4 sy4Var = this.$key$delegate;
            b = SubscriptionOptionsScreenKt.b(sy4Var);
            SubscriptionOptionsScreenKt.c(sy4Var, !b);
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SubscriptionOptionsScreenKt$AutoScrollPager$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
