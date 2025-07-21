package com.nytimes.subauth.ui.login;

import androidx.fragment.app.f;
import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "com.nytimes.subauth.ui.login.SubauthLoginViewModel$onCreateAccountPressed$1", f = "SubauthLoginViewModel.kt", l = {490, 491}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthLoginViewModel$onCreateAccountPressed$1 extends SuspendLambda implements ss2 {
    final /* synthetic */ f $activity;
    final /* synthetic */ boolean $isOfferChecked;
    final /* synthetic */ String $password;
    final /* synthetic */ String $username;
    int label;
    final /* synthetic */ SubauthLoginViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthLoginViewModel$onCreateAccountPressed$1(SubauthLoginViewModel subauthLoginViewModel, String str, String str2, boolean z, f fVar, by0 by0Var) {
        super(1, by0Var);
        this.this$0 = subauthLoginViewModel;
        this.$username = str;
        this.$password = str2;
        this.$isOfferChecked = z;
        this.$activity = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new SubauthLoginViewModel$onCreateAccountPressed$1(this.this$0, this.$username, this.$password, this.$isOfferChecked, this.$activity, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((SubauthLoginViewModel$onCreateAccountPressed$1) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object K;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            SubauthLIREFlowAnalyticsManager subauthLIREFlowAnalyticsManager = this.this$0.j;
            this.label = 1;
            if (subauthLIREFlowAnalyticsManager.o(this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.f.b(obj);
                return ww8.a;
            }
            kotlin.f.b(obj);
        }
        SubauthLoginViewModel subauthLoginViewModel = this.this$0;
        String str = this.$username;
        String str2 = this.$password;
        boolean z = this.$isOfferChecked;
        f fVar = this.$activity;
        this.label = 2;
        K = subauthLoginViewModel.K(str, str2, z, fVar, this);
        if (K == h) {
            return h;
        }
        return ww8.a;
    }
}
