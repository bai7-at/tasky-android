package com.nytimes.subauth.ui.purr.privacysettings;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.i36;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel$updatePrivacySettingsScreenState$2", f = "PrivacySettingsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PrivacySettingsViewModel$updatePrivacySettingsScreenState$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ i36 $screenState;
    int label;
    final /* synthetic */ PrivacySettingsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PrivacySettingsViewModel$updatePrivacySettingsScreenState$2(PrivacySettingsViewModel privacySettingsViewModel, i36 i36Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = privacySettingsViewModel;
        this.$screenState = i36Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PrivacySettingsViewModel$updatePrivacySettingsScreenState$2(this.this$0, this.$screenState, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        mutableStateFlow = this.this$0.t;
        mutableStateFlow.setValue(this.$screenState);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((PrivacySettingsViewModel$updatePrivacySettingsScreenState$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
