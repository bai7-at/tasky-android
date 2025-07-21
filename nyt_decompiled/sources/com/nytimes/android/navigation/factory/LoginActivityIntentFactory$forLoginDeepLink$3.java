package com.nytimes.android.navigation.factory;

import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.navigation.factory.LoginActivityIntentFactory$forLoginDeepLink$3", f = "LoginActivityIntentFactory.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LoginActivityIntentFactory$forLoginDeepLink$3 extends SuspendLambda implements it2 {
    /* synthetic */ Object L$0;
    int label;

    LoginActivityIntentFactory$forLoginDeepLink$3(by0 by0Var) {
        super(3, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        NYTLogger.i((Throwable) this.L$0, "LIRE Exit event flow failed", new Object[0]);
        return ww8.a;
    }

    @Override // defpackage.it2
    public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
        LoginActivityIntentFactory$forLoginDeepLink$3 loginActivityIntentFactory$forLoginDeepLink$3 = new LoginActivityIntentFactory$forLoginDeepLink$3(by0Var);
        loginActivityIntentFactory$forLoginDeepLink$3.L$0 = th;
        return loginActivityIntentFactory$forLoginDeepLink$3.invokeSuspend(ww8.a);
    }
}
