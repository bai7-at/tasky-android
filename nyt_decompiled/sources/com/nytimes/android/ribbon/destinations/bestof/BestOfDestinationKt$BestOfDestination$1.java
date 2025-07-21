package com.nytimes.android.ribbon.destinations.bestof;

import defpackage.by0;
import defpackage.fc1;
import defpackage.fm9;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.ribbon.destinations.bestof.BestOfDestinationKt$BestOfDestination$1", f = "BestOfDestination.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class BestOfDestinationKt$BestOfDestination$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ fm9 $tracker;
    final /* synthetic */ BestOfViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BestOfDestinationKt$BestOfDestination$1(BestOfViewModel bestOfViewModel, fm9 fm9Var, by0 by0Var) {
        super(2, by0Var);
        this.$viewModel = bestOfViewModel;
        this.$tracker = fm9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new BestOfDestinationKt$BestOfDestination$1(this.$viewModel, this.$tracker, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.$viewModel.i();
        fm9 fm9Var = this.$tracker;
        if (fm9Var != null) {
            str = BestOfDestinationKt.a;
            fm9Var.n(str);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((BestOfDestinationKt$BestOfDestination$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
