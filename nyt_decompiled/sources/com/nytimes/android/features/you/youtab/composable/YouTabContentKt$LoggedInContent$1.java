package com.nytimes.android.features.you.youtab.composable;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.f;
import com.nytimes.android.features.you.youtab.YouScreenViewModel;
import defpackage.bs3;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$1", f = "YouTabContent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class YouTabContentKt$LoggedInContent$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ f $activity;
    final /* synthetic */ YouScreenViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    YouTabContentKt$LoggedInContent$1(YouScreenViewModel youScreenViewModel, f fVar, by0 by0Var) {
        super(2, by0Var);
        this.$viewModel = youScreenViewModel;
        this.$activity = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new YouTabContentKt$LoggedInContent$1(this.$viewModel, this.$activity, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        bs3 J = this.$viewModel.J();
        FragmentManager supportFragmentManager = this.$activity.getSupportFragmentManager();
        zq3.g(supportFragmentManager, "getSupportFragmentManager(...)");
        J.f(supportFragmentManager);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((YouTabContentKt$LoggedInContent$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
