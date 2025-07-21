package com.nytimes.android.features.you.youtab.composable;

import com.nytimes.android.features.you.youtab.YouScreenViewModel;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.x08;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.you.youtab.composable.TabHeaderContentKt$YouTabScreenHeader$1", f = "TabHeaderContent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TabHeaderContentKt$YouTabScreenHeader$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ x08 $shouldUpdateName$delegate;
    final /* synthetic */ YouScreenViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TabHeaderContentKt$YouTabScreenHeader$1(YouScreenViewModel youScreenViewModel, x08 x08Var, by0 by0Var) {
        super(2, by0Var);
        this.$viewModel = youScreenViewModel;
        this.$shouldUpdateName$delegate = x08Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new TabHeaderContentKt$YouTabScreenHeader$1(this.$viewModel, this.$shouldUpdateName$delegate, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean e;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        e = TabHeaderContentKt.e(this.$shouldUpdateName$delegate);
        if (e) {
            this.$viewModel.n0();
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((TabHeaderContentKt$YouTabScreenHeader$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
