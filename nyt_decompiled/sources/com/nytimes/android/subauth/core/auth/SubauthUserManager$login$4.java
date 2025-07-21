package com.nytimes.android.subauth.core.auth;

import com.nytimes.android.subauth.core.auth.models.LoginMethod;
import com.nytimes.android.subauth.core.auth.network.response.LoginError;
import com.nytimes.android.subauth.core.auth.network.response.LoginResponse;
import com.nytimes.android.subauth.core.auth.network.response.LoginWithCodeResponse;
import com.nytimes.android.subauth.core.util.NetworkUtils;
import defpackage.by0;
import defpackage.fc1;
import defpackage.oa4;
import defpackage.qa4;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.subauth.core.auth.SubauthUserManager$login$4", f = "SubauthUserManager.kt", l = {239, 247}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthUserManager$login$4 extends SuspendLambda implements ss2 {
    final /* synthetic */ String $code;
    int label;
    final /* synthetic */ SubauthUserManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserManager$login$4(SubauthUserManager subauthUserManager, String str, by0 by0Var) {
        super(1, by0Var);
        this.this$0 = subauthUserManager;
        this.$code = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new SubauthUserManager$login$4(this.this$0, this.$code, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((SubauthUserManager$login$4) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                NetworkUtils networkUtils = NetworkUtils.a;
                SubauthUserManager$login$4$loginCodeResponse$1 subauthUserManager$login$4$loginCodeResponse$1 = new SubauthUserManager$login$4$loginCodeResponse$1(this.this$0, this.$code, null);
                this.label = 1;
                obj = networkUtils.a(LoginWithCodeResponse.class, subauthUserManager$login$4$loginCodeResponse$1, this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.b(obj);
                    return (oa4) obj;
                }
                f.b(obj);
            }
            LoginWithCodeResponse loginWithCodeResponse = (LoginWithCodeResponse) obj;
            LoginResponse a = loginWithCodeResponse != null ? qa4.a(loginWithCodeResponse) : null;
            SubauthUserManager subauthUserManager = this.this$0;
            LoginMethod loginMethod = LoginMethod.LoginMagicLink;
            this.label = 2;
            obj = subauthUserManager.f0(a, "Error on login with code", loginMethod, this);
            if (obj == h) {
                return h;
            }
            return (oa4) obj;
        } catch (Exception e) {
            return new oa4.b(new LoginError(null, null, null, "Exception during login", 7, null), LoginMethod.LoginMagicLink, null, null, null, e, false, 92, null);
        }
    }
}
