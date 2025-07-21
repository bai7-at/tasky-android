package com.nytimes.android.subauth.core.purr;

import android.content.SharedPreferences;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ul8;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.subauth.core.purr.PurrManagerImpl$checkLastEmailOptInAttemptFailedRetry$1", f = "PurrManagerImpl.kt", l = {714}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PurrManagerImpl$checkLastEmailOptInAttemptFailedRetry$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ PurrManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurrManagerImpl$checkLastEmailOptInAttemptFailedRetry$1(PurrManagerImpl purrManagerImpl, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = purrManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PurrManagerImpl$checkLastEmailOptInAttemptFailedRetry$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SharedPreferences sharedPreferences;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ul8.a.z("PURR").a("Last Email Opt In Attempt Failed. Retrying on app open.", new Object[0]);
            sharedPreferences = this.this$0.f;
            boolean z = sharedPreferences.getBoolean("last_email_opt_in", false);
            PurrManagerImpl purrManagerImpl = this.this$0;
            Boolean a = cc0.a(z);
            this.label = 1;
            if (purrManagerImpl.y(a, this) == h) {
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
        return ((PurrManagerImpl$checkLastEmailOptInAttemptFailedRetry$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
