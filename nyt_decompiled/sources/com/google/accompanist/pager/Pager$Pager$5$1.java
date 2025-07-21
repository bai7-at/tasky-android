package com.google.accompanist.pager;

import androidx.compose.runtime.y;
import defpackage.by0;
import defpackage.fc1;
import defpackage.g14;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "com.google.accompanist.pager.Pager$Pager$5$1", f = "Pager.kt", l = {354}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class Pager$Pager$5$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ PagerState $state;
    int label;

    static final class a implements FlowCollector {
        final /* synthetic */ PagerState a;

        a(PagerState pagerState) {
            this.a = pagerState;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(Integer num, by0 by0Var) {
            this.a.A();
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Pager$Pager$5$1(PagerState pagerState, by0 by0Var) {
        super(2, by0Var);
        this.$state = pagerState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new Pager$Pager$5$1(this.$state, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            final PagerState pagerState = this.$state;
            Flow distinctUntilChanged = FlowKt.distinctUntilChanged(y.p(new qs2() { // from class: com.google.accompanist.pager.Pager$Pager$5$1.1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Integer mo865invoke() {
                    g14 p = PagerState.this.p();
                    if (p != null) {
                        return Integer.valueOf(p.getIndex());
                    }
                    return null;
                }
            }));
            a aVar = new a(this.$state);
            this.label = 1;
            if (distinctUntilChanged.collect(aVar, this) == h) {
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
        return ((Pager$Pager$5$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
