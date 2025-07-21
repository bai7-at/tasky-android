package com.nytimes.android.subauth.core.auth;

import com.nytimes.android.subauth.core.auth.models.b;
import com.nytimes.android.subauth.core.auth.network.UserAPI;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ul8;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Response;

@fc1(c = "com.nytimes.android.subauth.core.auth.SubauthUserManager$requestVerificationCode$2", f = "SubauthUserManager.kt", l = {976}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthUserManager$requestVerificationCode$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $email;
    int label;
    final /* synthetic */ SubauthUserManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserManager$requestVerificationCode$2(SubauthUserManager subauthUserManager, String str, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = subauthUserManager;
        this.$email = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SubauthUserManager$requestVerificationCode$2(this.this$0, this.$email, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b n0;
        Object h = a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                if (!this.this$0.Y().a()) {
                    return b.a.C0409b.c;
                }
                UserAPI e0 = this.this$0.e0();
                String str = this.$email;
                String b = this.this$0.b();
                this.label = 1;
                obj = e0.emailCode(str, b, this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            n0 = this.this$0.n0((Response) obj);
            return n0;
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            ul8.a.z("SUBAUTH").d("Failed on send email code: " + message, new Object[0]);
            return new b.a.d(message);
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SubauthUserManager$requestVerificationCode$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
