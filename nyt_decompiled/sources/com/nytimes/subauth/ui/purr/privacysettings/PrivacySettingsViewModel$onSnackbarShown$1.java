package com.nytimes.subauth.ui.purr.privacysettings;

import com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsSnackbarState;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel$onSnackbarShown$1", f = "PrivacySettingsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PrivacySettingsViewModel$onSnackbarShown$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ PrivacySettingsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PrivacySettingsViewModel$onSnackbarShown$1(PrivacySettingsViewModel privacySettingsViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = privacySettingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PrivacySettingsViewModel$onSnackbarShown$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        mutableStateFlow = this.this$0.r;
        mutableStateFlow.setValue(PrivacySettingsSnackbarState.NONE);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((PrivacySettingsViewModel$onSnackbarShown$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
