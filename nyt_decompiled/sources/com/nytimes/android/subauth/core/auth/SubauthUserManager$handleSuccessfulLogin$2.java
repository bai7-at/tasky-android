package com.nytimes.android.subauth.core.auth;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.mg8;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.subauth.core.auth.SubauthUserManager$handleSuccessfulLogin$2", f = "SubauthUserManager.kt", l = {793}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthUserManager$handleSuccessfulLogin$2 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ SubauthUserManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserManager$handleSuccessfulLogin$2(SubauthUserManager subauthUserManager, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = subauthUserManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SubauthUserManager$handleSuccessfulLogin$2(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            mg8 d0 = this.this$0.d0();
            this.label = 1;
            if (mg8.a.a(d0, false, this, 1, null) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SubauthUserManager$handleSuccessfulLogin$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
