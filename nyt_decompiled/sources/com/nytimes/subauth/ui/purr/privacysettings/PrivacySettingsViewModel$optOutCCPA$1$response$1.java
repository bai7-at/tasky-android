package com.nytimes.subauth.ui.purr.privacysettings;

import com.nytimes.android.subauth.core.purr.directive.PurrPrivacyPreferenceName;
import com.nytimes.android.subauth.core.purr.directive.PurrPrivacyPreferenceValue;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel$optOutCCPA$1$response$1", f = "PrivacySettingsViewModel.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PrivacySettingsViewModel$optOutCCPA$1$response$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ PrivacySettingsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PrivacySettingsViewModel$optOutCCPA$1$response$1(PrivacySettingsViewModel privacySettingsViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = privacySettingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PrivacySettingsViewModel$optOutCCPA$1$response$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.nytimes.android.subauth.core.purr.a aVar;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            aVar = this.this$0.b;
            PurrPrivacyPreferenceName purrPrivacyPreferenceName = PurrPrivacyPreferenceName.CCPA;
            PurrPrivacyPreferenceValue purrPrivacyPreferenceValue = PurrPrivacyPreferenceValue.OPT_OUT;
            this.label = 1;
            obj = aVar.d(purrPrivacyPreferenceName, purrPrivacyPreferenceValue, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((PrivacySettingsViewModel$optOutCCPA$1$response$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
