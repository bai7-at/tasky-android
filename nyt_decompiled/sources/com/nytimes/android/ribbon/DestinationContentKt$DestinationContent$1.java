package com.nytimes.android.ribbon;

import defpackage.by0;
import defpackage.cn8;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.ribbon.DestinationContentKt$DestinationContent$1", f = "DestinationContent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DestinationContentKt$DestinationContent$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ cn8 $todayTabTracing;
    final /* synthetic */ DestinationContentViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DestinationContentKt$DestinationContent$1(cn8 cn8Var, DestinationContentViewModel destinationContentViewModel, by0 by0Var) {
        super(2, by0Var);
        this.$todayTabTracing = cn8Var;
        this.$viewModel = destinationContentViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DestinationContentKt$DestinationContent$1(this.$todayTabTracing, this.$viewModel, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        cn8 cn8Var = this.$todayTabTracing;
        if (cn8Var != null) {
            cn8Var.b(true, new Pair[0]);
        }
        cn8 cn8Var2 = this.$todayTabTracing;
        if (cn8Var2 != null) {
            cn8Var2.j("TodayPanelStart");
        }
        this.$viewModel.q();
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((DestinationContentKt$DestinationContent$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
