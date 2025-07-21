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
import java.io.IOException;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.subauth.core.auth.SubauthUserManager$login$2", f = "SubauthUserManager.kt", l = {204, 214}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthUserManager$login$2 extends SuspendLambda implements ss2 {
    final /* synthetic */ String $password;
    final /* synthetic */ RegiInterface $regiInterface;
    final /* synthetic */ String $username;
    int label;
    final /* synthetic */ SubauthUserManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserManager$login$2(SubauthUserManager subauthUserManager, String str, String str2, RegiInterface regiInterface, by0 by0Var) {
        super(1, by0Var);
        this.this$0 = subauthUserManager;
        this.$username = str;
        this.$password = str2;
        this.$regiInterface = regiInterface;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new SubauthUserManager$login$2(this.this$0, this.$username, this.$password, this.$regiInterface, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((SubauthUserManager$login$2) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                NetworkUtils networkUtils = NetworkUtils.a;
                SubauthUserManager$login$2$loginResponse$1 subauthUserManager$login$2$loginResponse$1 = new SubauthUserManager$login$2$loginResponse$1(this.this$0, this.$username, this.$password, this.$regiInterface, null);
                this.label = 1;
                obj = networkUtils.a(LoginResponse.class, subauthUserManager$login$2$loginResponse$1, this);
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
            LoginMethod loginMethod = LoginMethod.LoginCredentials;
            this.label = 2;
            obj = subauthUserManager.f0((LoginResponse) obj, "Error on login with username & password", loginMethod, this);
            if (obj == h) {
                return h;
            }
            return (oa4) obj;
        } catch (IOException e) {
            return new oa4.b(new LoginError(null, null, null, "Network Connectivity Issues. Error during credential login", 7, null), LoginMethod.LoginCredentials, null, null, null, e, true, 28, null);
        } catch (Exception e2) {
            return new oa4.b(new LoginError(null, null, null, "Exception during credential login", 7, null), LoginMethod.LoginCredentials, null, null, null, e2, false, 92, null);
        }
    }
}
