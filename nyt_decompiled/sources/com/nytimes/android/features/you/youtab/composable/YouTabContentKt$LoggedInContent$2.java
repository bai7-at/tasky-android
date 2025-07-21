package com.nytimes.android.features.you.youtab.composable;

import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.features.you.youtab.YouScreenViewModel;
import com.nytimes.android.features.you.youtab.b;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$2", f = "YouTabContent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class YouTabContentKt$LoggedInContent$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ YouScreenViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    YouTabContentKt$LoggedInContent$2(YouScreenViewModel youScreenViewModel, by0 by0Var) {
        super(2, by0Var);
        this.$viewModel = youScreenViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new YouTabContentKt$LoggedInContent$2(this.$viewModel, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        YouScreenViewModel youScreenViewModel = this.$viewModel;
        YouScreenViewModel.a0(youScreenViewModel, (b) ((DownloadState) youScreenViewModel.H().getValue()).a(), false, 2, null);
        this.$viewModel.e0();
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((YouTabContentKt$LoggedInContent$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
