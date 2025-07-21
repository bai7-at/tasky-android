package com.nytimes.android.ribbon;

import androidx.compose.foundation.pager.PagerState;
import com.nytimes.android.home.ui.hybrid.DestinationTabState;
import com.nytimes.android.ribbon.config.RibbonConfig;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fe4;
import defpackage.gt2;
import defpackage.in1;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "com.nytimes.android.ribbon.DestinationContentKt$DestinationContent$2$2", f = "DestinationContent.kt", l = {135}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DestinationContentKt$DestinationContent$2$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ fe4 $mainTabState;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ in1 $state;
    int label;

    @fc1(c = "com.nytimes.android.ribbon.DestinationContentKt$DestinationContent$2$2$1", f = "DestinationContent.kt", l = {136}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.ribbon.DestinationContentKt$DestinationContent$2$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ PagerState $pagerState;
        final /* synthetic */ in1 $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PagerState pagerState, in1 in1Var, by0 by0Var) {
            super(2, by0Var);
            this.$pagerState = pagerState;
            this.$state = in1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.$pagerState, this.$state, by0Var);
        }

        @Override // defpackage.gt2
        public final Object invoke(ww8 ww8Var, by0 by0Var) {
            return ((AnonymousClass1) create(ww8Var, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                PagerState pagerState = this.$pagerState;
                int f = DestinationTabState.Companion.f(this.$state.f(), RibbonConfig.TODAY.getId());
                this.label = 1;
                if (PagerState.o(pagerState, f, 0.0f, null, this, 6, null) == h) {
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
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DestinationContentKt$DestinationContent$2$2(fe4 fe4Var, PagerState pagerState, in1 in1Var, by0 by0Var) {
        super(2, by0Var);
        this.$mainTabState = fe4Var;
        this.$pagerState = pagerState;
        this.$state = in1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DestinationContentKt$DestinationContent$2$2(this.$mainTabState, this.$pagerState, this.$state, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Flow a = this.$mainTabState.a();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$pagerState, this.$state, null);
            this.label = 1;
            if (FlowKt.collectLatest(a, anonymousClass1, this) == h) {
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
        return ((DestinationContentKt$DestinationContent$2$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
