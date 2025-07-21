package com.nytimes.android.dailyfive.ui;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.dailyfive.ui.DailyFiveFragment$onCreateView$2$1$1", f = "DailyFiveFragment.kt", l = {106}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DailyFiveFragment$onCreateView$2$1$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ DailyFiveFragment this$0;

    static final class a implements FlowCollector {
        final /* synthetic */ DailyFiveFragment a;

        a(DailyFiveFragment dailyFiveFragment) {
            this.a = dailyFiveFragment;
        }

        public final Object a(int i, by0 by0Var) {
            this.a.n0(true);
            return ww8.a;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, by0 by0Var) {
            return a(((Number) obj).intValue(), by0Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DailyFiveFragment$onCreateView$2$1$1(DailyFiveFragment dailyFiveFragment, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = dailyFiveFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DailyFiveFragment$onCreateView$2$1$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Flow c = this.this$0.k1().c();
            a aVar = new a(this.this$0);
            this.label = 1;
            if (c.collect(aVar, this) == h) {
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
        return ((DailyFiveFragment$onCreateView$2$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
