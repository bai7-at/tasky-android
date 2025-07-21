package com.nytimes.android.features.settings;

import com.nytimes.android.subauth.core.api.client.NYTUser;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "com.nytimes.android.features.settings.AccountSettingsPresenter$listenToNYTUserChange$1$1", f = "AccountSettingsArchitecture.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AccountSettingsPresenter$listenToNYTUserChange$1$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ AccountSettingsPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSettingsPresenter$listenToNYTUserChange$1$1(AccountSettingsPresenter accountSettingsPresenter, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = accountSettingsPresenter;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(NYTUser.StateChangeType stateChangeType, by0 by0Var) {
        return ((AccountSettingsPresenter$listenToNYTUserChange$1$1) create(stateChangeType, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AccountSettingsPresenter$listenToNYTUserChange$1$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        this.this$0.h();
        return ww8.a;
    }
}
