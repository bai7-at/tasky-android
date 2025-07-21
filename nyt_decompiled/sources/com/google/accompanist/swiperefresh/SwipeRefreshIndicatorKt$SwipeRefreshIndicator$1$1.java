package com.google.accompanist.swiperefresh;

import androidx.compose.animation.core.SuspendAnimationKt;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.sy4;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.google.accompanist.swiperefresh.SwipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1", f = "SwipeRefreshIndicator.kt", l = {148}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SwipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ int $indicatorHeight;
    final /* synthetic */ sy4 $offset$delegate;
    final /* synthetic */ float $refreshingOffsetPx;
    final /* synthetic */ SwipeRefreshState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1(SwipeRefreshState swipeRefreshState, int i, float f, sy4 sy4Var, by0 by0Var) {
        super(2, by0Var);
        this.$state = swipeRefreshState;
        this.$indicatorHeight = i;
        this.$refreshingOffsetPx = f;
        this.$offset$delegate = sy4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SwipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1(this.$state, this.$indicatorHeight, this.$refreshingOffsetPx, this.$offset$delegate, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float b;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            b = SwipeRefreshIndicatorKt.b(this.$offset$delegate);
            float f = this.$state.e() ? this.$indicatorHeight + this.$refreshingOffsetPx : 0.0f;
            final sy4 sy4Var = this.$offset$delegate;
            gt2 gt2Var = new gt2() { // from class: com.google.accompanist.swiperefresh.SwipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1.1
                {
                    super(2);
                }

                public final void b(float f2, float f3) {
                    SwipeRefreshIndicatorKt.c(sy4.this, f2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    b(((Number) obj2).floatValue(), ((Number) obj3).floatValue());
                    return ww8.a;
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.e(b, f, 0.0f, null, gt2Var, this, 12, null) == h) {
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
        return ((SwipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
