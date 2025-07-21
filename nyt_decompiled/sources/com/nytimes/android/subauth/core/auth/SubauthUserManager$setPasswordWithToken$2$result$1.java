package com.nytimes.android.subauth.core.auth;

import com.nytimes.android.subauth.core.auth.network.UserAPI;
import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.subauth.core.auth.SubauthUserManager$setPasswordWithToken$2$result$1", f = "SubauthUserManager.kt", l = {1059}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthUserManager$setPasswordWithToken$2$result$1 extends SuspendLambda implements ss2 {
    final /* synthetic */ String $password;
    final /* synthetic */ String $token;
    int label;
    final /* synthetic */ SubauthUserManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserManager$setPasswordWithToken$2$result$1(SubauthUserManager subauthUserManager, String str, String str2, by0 by0Var) {
        super(1, by0Var);
        this.this$0 = subauthUserManager;
        this.$token = str;
        this.$password = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new SubauthUserManager$setPasswordWithToken$2$result$1(this.this$0, this.$token, this.$password, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((SubauthUserManager$setPasswordWithToken$2$result$1) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            UserAPI e0 = this.this$0.e0();
            String str = this.$token;
            String str2 = this.$password;
            String b = this.this$0.b();
            this.label = 1;
            obj = e0.setPassword(str, str2, b, this);
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
}
