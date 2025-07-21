package com.nytimes.subauth.ui.ui.screens;

import androidx.compose.material.SnackbarDuration;
import androidx.compose.material.SnackbarHostState;
import com.nytimes.subauth.ui.login.SubauthLoginViewModel;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ka7;
import defpackage.na4;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.subauth.ui.ui.screens.LireContainerScreenKt$ContainerErrorHandler$1$1", f = "LireContainerScreen.kt", l = {272}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LireContainerScreenKt$ContainerErrorHandler$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ na4.b $error;
    final /* synthetic */ ka7 $scaffoldState;
    final /* synthetic */ SubauthLoginViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LireContainerScreenKt$ContainerErrorHandler$1$1(ka7 ka7Var, na4.b bVar, SubauthLoginViewModel subauthLoginViewModel, by0 by0Var) {
        super(2, by0Var);
        this.$scaffoldState = ka7Var;
        this.$error = bVar;
        this.$viewModel = subauthLoginViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new LireContainerScreenKt$ContainerErrorHandler$1$1(this.$scaffoldState, this.$error, this.$viewModel, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            SnackbarHostState b = this.$scaffoldState.b();
            String a = this.$error.a();
            SnackbarDuration snackbarDuration = SnackbarDuration.Short;
            this.label = 1;
            if (SnackbarHostState.e(b, a, null, snackbarDuration, this, 2, null) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        this.$viewModel.O();
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((LireContainerScreenKt$ContainerErrorHandler$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
