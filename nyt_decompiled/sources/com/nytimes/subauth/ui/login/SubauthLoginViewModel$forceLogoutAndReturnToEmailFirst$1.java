package com.nytimes.subauth.ui.login;

import com.nytimes.android.subauth.core.api.listeners.LogoutSource;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.o98;
import defpackage.r54;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.subauth.ui.login.SubauthLoginViewModel$forceLogoutAndReturnToEmailFirst$1", f = "SubauthLoginViewModel.kt", l = {1057}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthLoginViewModel$forceLogoutAndReturnToEmailFirst$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ SubauthLoginViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthLoginViewModel$forceLogoutAndReturnToEmailFirst$1(SubauthLoginViewModel subauthLoginViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = subauthLoginViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SubauthLoginViewModel$forceLogoutAndReturnToEmailFirst$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        o98 o98Var;
        MutableStateFlow mutableStateFlow;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            o98Var = this.this$0.b;
            LogoutSource logoutSource = LogoutSource.UNIFIED_LIRE_FAILED_FORCE;
            this.label = 1;
            if (o98Var.z(logoutSource, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        this.this$0.O();
        mutableStateFlow = this.this$0.r;
        mutableStateFlow.setValue(new r54.e(null, 1, null));
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SubauthLoginViewModel$forceLogoutAndReturnToEmailFirst$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
