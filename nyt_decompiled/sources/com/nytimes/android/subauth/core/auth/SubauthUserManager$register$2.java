package com.nytimes.android.subauth.core.auth;

import com.nytimes.android.subauth.core.auth.models.LoginMethod;
import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import com.nytimes.android.subauth.core.auth.network.response.LoginError;
import com.nytimes.android.subauth.core.auth.network.response.LoginResponse;
import com.nytimes.android.subauth.core.util.NetworkUtils;
import defpackage.by0;
import defpackage.fc1;
import defpackage.oa4;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.subauth.core.auth.SubauthUserManager$register$2", f = "SubauthUserManager.kt", l = {616, 627}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthUserManager$register$2 extends SuspendLambda implements ss2 {
    final /* synthetic */ String $email;
    final /* synthetic */ String $marketingOptIn;
    final /* synthetic */ String $marketingOptInDefaultState;
    final /* synthetic */ String $password;
    final /* synthetic */ RegiInterface $regiInterface;
    int label;
    final /* synthetic */ SubauthUserManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserManager$register$2(SubauthUserManager subauthUserManager, RegiInterface regiInterface, String str, String str2, String str3, String str4, by0 by0Var) {
        super(1, by0Var);
        this.this$0 = subauthUserManager;
        this.$regiInterface = regiInterface;
        this.$email = str;
        this.$password = str2;
        this.$marketingOptInDefaultState = str3;
        this.$marketingOptIn = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new SubauthUserManager$register$2(this.this$0, this.$regiInterface, this.$email, this.$password, this.$marketingOptInDefaultState, this.$marketingOptIn, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((SubauthUserManager$register$2) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                NetworkUtils networkUtils = NetworkUtils.a;
                SubauthUserManager$register$2$loginResponse$1 subauthUserManager$register$2$loginResponse$1 = new SubauthUserManager$register$2$loginResponse$1(this.this$0, this.$regiInterface, this.$email, this.$password, this.$marketingOptInDefaultState, this.$marketingOptIn, null);
                this.label = 1;
                obj = networkUtils.a(LoginResponse.class, subauthUserManager$register$2$loginResponse$1, this);
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
            SubauthUserManager subauthUserManager = this.this$0;
            LoginMethod loginMethod = LoginMethod.RegisterCredentials;
            this.label = 2;
            obj = subauthUserManager.f0((LoginResponse) obj, "Error on register user", loginMethod, this);
            if (obj == h) {
                return h;
            }
            return (oa4) obj;
        } catch (Exception e) {
            return new oa4.b(new LoginError(null, null, null, "Exception during Registration of credentials", 7, null), LoginMethod.RegisterCredentials, null, null, null, e, false, 92, null);
        }
    }
}
