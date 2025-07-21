package com.nytimes.android.subauth.core.auth;

import defpackage.by0;
import defpackage.c05;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.subauth.core.auth.SubauthUserManager$isNYTSCookieValid$1", f = "SubauthUserManager.kt", l = {899}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthUserManager$isNYTSCookieValid$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ SubauthUserManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserManager$isNYTSCookieValid$1(SubauthUserManager subauthUserManager, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = subauthUserManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SubauthUserManager$isNYTSCookieValid$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            c05 Z = this.this$0.Z();
            this.label = 1;
            obj = Z.o(this);
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

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SubauthUserManager$isNYTSCookieValid$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
