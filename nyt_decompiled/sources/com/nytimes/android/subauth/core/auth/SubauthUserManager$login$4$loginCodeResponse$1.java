package com.nytimes.android.subauth.core.auth;

import com.nytimes.android.subauth.core.auth.network.UserAPI;
import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.subauth.core.auth.SubauthUserManager$login$4$loginCodeResponse$1", f = "SubauthUserManager.kt", l = {240}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthUserManager$login$4$loginCodeResponse$1 extends SuspendLambda implements ss2 {
    final /* synthetic */ String $code;
    int label;
    final /* synthetic */ SubauthUserManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserManager$login$4$loginCodeResponse$1(SubauthUserManager subauthUserManager, String str, by0 by0Var) {
        super(1, by0Var);
        this.this$0 = subauthUserManager;
        this.$code = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new SubauthUserManager$login$4$loginCodeResponse$1(this.this$0, this.$code, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((SubauthUserManager$login$4$loginCodeResponse$1) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            UserAPI e0 = this.this$0.e0();
            String str = this.$code;
            String b = this.this$0.b();
            this.label = 1;
            obj = UserAPI.b.a(e0, str, null, null, b, this, 6, null);
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
