package com.nytimes.subauth.ui.purr.privacysettings;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel", f = "PrivacySettingsViewModel.kt", l = {206, 207}, m = "updateState")
/* loaded from: classes4.dex */
final class PrivacySettingsViewModel$updateState$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PrivacySettingsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PrivacySettingsViewModel$updateState$1(PrivacySettingsViewModel privacySettingsViewModel, by0 by0Var) {
        super(by0Var);
        this.this$0 = privacySettingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.J(this);
    }
}
