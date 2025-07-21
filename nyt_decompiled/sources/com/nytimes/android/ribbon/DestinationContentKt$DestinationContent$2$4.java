package com.nytimes.android.ribbon;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.y;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ww8;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "com.nytimes.android.ribbon.DestinationContentKt$DestinationContent$2$4", f = "DestinationContent.kt", l = {161}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DestinationContentKt$DestinationContent$2$4 extends SuspendLambda implements gt2 {
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ DestinationContentViewModel $viewModel;
    int label;

    @fc1(c = "com.nytimes.android.ribbon.DestinationContentKt$DestinationContent$2$4$2", f = "DestinationContent.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.ribbon.DestinationContentKt$DestinationContent$2$4$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements gt2 {
        final /* synthetic */ DestinationContentViewModel $viewModel;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(DestinationContentViewModel destinationContentViewModel, by0 by0Var) {
            super(2, by0Var);
            this.$viewModel = destinationContentViewModel;
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Pair pair, by0 by0Var) {
            return ((AnonymousClass2) create(pair, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$viewModel, by0Var);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            Pair pair = (Pair) this.L$0;
            boolean booleanValue = ((Boolean) pair.a()).booleanValue();
            int intValue = ((Number) pair.b()).intValue();
            if (!booleanValue) {
                this.$viewModel.r(this.$viewModel.t(intValue));
            }
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DestinationContentKt$DestinationContent$2$4(PagerState pagerState, DestinationContentViewModel destinationContentViewModel, by0 by0Var) {
        super(2, by0Var);
        this.$pagerState = pagerState;
        this.$viewModel = destinationContentViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DestinationContentKt$DestinationContent$2$4(this.$pagerState, this.$viewModel, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            final PagerState pagerState = this.$pagerState;
            Flow p = y.p(new qs2() { // from class: com.nytimes.android.ribbon.DestinationContentKt$DestinationContent$2$4.1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Pair mo865invoke() {
                    return new Pair(Boolean.valueOf(PagerState.this.c()), Integer.valueOf(PagerState.this.P()));
                }
            });
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$viewModel, null);
            this.label = 1;
            if (FlowKt.collectLatest(p, anonymousClass2, this) == h) {
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
        return ((DestinationContentKt$DestinationContent$2$4) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
