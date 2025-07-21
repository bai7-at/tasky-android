package com.nytimes.android.subauth.core.auth;

import com.nytimes.android.subauth.core.auth.models.LoginMethod;
import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import com.nytimes.android.subauth.core.auth.network.response.LoginError;
import com.nytimes.android.subauth.core.auth.network.response.LoginResponse;
import com.nytimes.android.subauth.core.util.NetworkUtils;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.oa4;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.subauth.core.auth.SubauthUserManager$loginWithWebSSO$2", f = "SubauthUserManager.kt", l = {312, 322}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthUserManager$loginWithWebSSO$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $accessToken;
    final /* synthetic */ String $marketingOptIn;
    final /* synthetic */ RegiInterface $regiInterface;
    final /* synthetic */ String $ssoProvider;
    int label;
    final /* synthetic */ SubauthUserManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserManager$loginWithWebSSO$2(SubauthUserManager subauthUserManager, String str, RegiInterface regiInterface, String str2, String str3, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = subauthUserManager;
        this.$ssoProvider = str;
        this.$regiInterface = regiInterface;
        this.$marketingOptIn = str2;
        this.$accessToken = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SubauthUserManager$loginWithWebSSO$2(this.this$0, this.$ssoProvider, this.$regiInterface, this.$marketingOptIn, this.$accessToken, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                if (!this.this$0.Y().a()) {
                    return new oa4.b(new LoginError(null, null, null, "Internet Not Connected", 7, null), LoginMethod.WebSSO, null, null, null, null, true, 60, null);
                }
                NetworkUtils networkUtils = NetworkUtils.a;
                SubauthUserManager$loginWithWebSSO$2$response$1 subauthUserManager$loginWithWebSSO$2$response$1 = new SubauthUserManager$loginWithWebSSO$2$response$1(this.this$0, this.$regiInterface, this.$ssoProvider, this.$marketingOptIn, this.$accessToken, null);
                this.label = 1;
                obj = networkUtils.a(LoginResponse.class, subauthUserManager$loginWithWebSSO$2$response$1, this);
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
            String str = "Error on link with SSO " + this.$ssoProvider;
            LoginMethod loginMethod = LoginMethod.WebSSO;
            this.label = 2;
            obj = subauthUserManager.f0((LoginResponse) obj, str, loginMethod, this);
            if (obj == h) {
                return h;
            }
            return (oa4) obj;
        } catch (Exception e) {
            return new oa4.b(new LoginError(null, null, null, "Exception occurred", 7, null), LoginMethod.WebSSO, null, null, null, e, false, 92, null);
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SubauthUserManager$loginWithWebSSO$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
