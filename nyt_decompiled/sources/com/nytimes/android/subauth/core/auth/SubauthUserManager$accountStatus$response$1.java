package com.nytimes.android.subauth.core.auth;

import com.nytimes.android.subauth.core.auth.network.UserAPI;
import com.nytimes.android.subauth.core.auth.network.response.EmailStatusResponse;
import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.subauth.core.auth.SubauthUserManager$accountStatus$response$1", f = "SubauthUserManager.kt", l = {147, 152}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthUserManager$accountStatus$response$1 extends SuspendLambda implements ss2 {
    final /* synthetic */ String $email;
    final /* synthetic */ String $taToken;
    int label;
    final /* synthetic */ SubauthUserManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserManager$accountStatus$response$1(String str, SubauthUserManager subauthUserManager, String str2, by0 by0Var) {
        super(1, by0Var);
        this.$taToken = str;
        this.this$0 = subauthUserManager;
        this.$email = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new SubauthUserManager$accountStatus$response$1(this.$taToken, this.this$0, this.$email, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((SubauthUserManager$accountStatus$response$1) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                f.b(obj);
                return (EmailStatusResponse) obj;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            return (EmailStatusResponse) obj;
        }
        f.b(obj);
        if (this.$taToken == null) {
            UserAPI e0 = this.this$0.e0();
            String str = this.$email;
            String b = this.this$0.b();
            this.label = 1;
            obj = e0.emailStatus(str, b, this);
            if (obj == h) {
                return h;
            }
            return (EmailStatusResponse) obj;
        }
        UserAPI e02 = this.this$0.e0();
        String str2 = this.$email;
        String str3 = this.$taToken;
        String b2 = this.this$0.b();
        this.label = 2;
        obj = e02.emailStatusWithToken(str2, str3, b2, this);
        if (obj == h) {
            return h;
        }
        return (EmailStatusResponse) obj;
    }
}
