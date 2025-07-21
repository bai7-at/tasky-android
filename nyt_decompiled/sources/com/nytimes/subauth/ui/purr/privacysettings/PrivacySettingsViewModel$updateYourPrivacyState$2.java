package com.nytimes.subauth.ui.purr.privacysettings;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qm9;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel$updateYourPrivacyState$2", f = "PrivacySettingsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PrivacySettingsViewModel$updateYourPrivacyState$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ boolean $optOutValue;
    final /* synthetic */ boolean $showPreferenceWillBeForgotten;
    int label;
    final /* synthetic */ PrivacySettingsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PrivacySettingsViewModel$updateYourPrivacyState$2(PrivacySettingsViewModel privacySettingsViewModel, boolean z, boolean z2, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = privacySettingsViewModel;
        this.$optOutValue = z;
        this.$showPreferenceWillBeForgotten = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PrivacySettingsViewModel$updateYourPrivacyState$2(this.this$0, this.$optOutValue, this.$showPreferenceWillBeForgotten, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        mutableStateFlow = this.this$0.m;
        mutableStateFlow.setValue(new qm9(this.$optOutValue, this.$showPreferenceWillBeForgotten));
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((PrivacySettingsViewModel$updateYourPrivacyState$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
