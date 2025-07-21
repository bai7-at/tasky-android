package com.nytimes.subauth.ui.purr.privacysettings;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.w86;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

@fc1(c = "com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel$handleCCPAUpdateError$2", f = "PrivacySettingsViewModel.kt", l = {119}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PrivacySettingsViewModel$handleCCPAUpdateError$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ Exception $exception;
    int label;
    final /* synthetic */ PrivacySettingsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PrivacySettingsViewModel$handleCCPAUpdateError$2(PrivacySettingsViewModel privacySettingsViewModel, Exception exc, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = privacySettingsViewModel;
        this.$exception = exc;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PrivacySettingsViewModel$handleCCPAUpdateError$2(this.this$0, this.$exception, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            this.this$0.G(this.$exception);
            mutableSharedFlow = this.this$0.e;
            w86 w86Var = new w86("Error: Exception thrown during Purr CCPA opt out", this.$exception);
            this.label = 1;
            if (mutableSharedFlow.emit(w86Var, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((PrivacySettingsViewModel$handleCCPAUpdateError$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
