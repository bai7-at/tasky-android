package com.nytimes.subauth.ui.login;

import com.nytimes.android.subauth.core.auth.network.response.a;
import com.nytimes.android.subauth.core.devsettings.models.LIREErrorStateOverride;
import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.subauth.ui.login.SubauthLoginViewModel$onEmailFirstCheckEmailStatus$1", f = "SubauthLoginViewModel.kt", l = {165, 169, 171}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthLoginViewModel$onEmailFirstCheckEmailStatus$1 extends SuspendLambda implements ss2 {
    final /* synthetic */ String $email;
    int label;
    final /* synthetic */ SubauthLoginViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthLoginViewModel$onEmailFirstCheckEmailStatus$1(SubauthLoginViewModel subauthLoginViewModel, String str, by0 by0Var) {
        super(1, by0Var);
        this.this$0 = subauthLoginViewModel;
        this.$email = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new SubauthLoginViewModel$onEmailFirstCheckEmailStatus$1(this.this$0, this.$email, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((SubauthLoginViewModel$onEmailFirstCheckEmailStatus$1) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object M;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            SubauthLIREFlowAnalyticsManager subauthLIREFlowAnalyticsManager = this.this$0.j;
            this.label = 1;
            if (subauthLIREFlowAnalyticsManager.h(this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                return ww8.a;
            }
            f.b(obj);
        }
        if (this.this$0.Z().e() == LIREErrorStateOverride.EmailFirstUnknownError) {
            SubauthLoginViewModel subauthLoginViewModel = this.this$0;
            String str = this.$email;
            a.e eVar = a.e.a;
            this.label = 2;
            if (SubauthLoginViewModel.f0(subauthLoginViewModel, str, eVar, false, this, 4, null) == h) {
                return h;
            }
        } else {
            SubauthLoginViewModel subauthLoginViewModel2 = this.this$0;
            String str2 = this.$email;
            this.label = 3;
            M = subauthLoginViewModel2.M(str2, this);
            if (M == h) {
                return h;
            }
        }
        return ww8.a;
    }
}
