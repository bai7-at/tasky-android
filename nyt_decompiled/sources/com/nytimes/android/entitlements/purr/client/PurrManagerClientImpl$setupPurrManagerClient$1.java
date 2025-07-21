package com.nytimes.android.entitlements.purr.client;

import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$setupPurrManagerClient$1", f = "PurrManagerClientImpl.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PurrManagerClientImpl$setupPurrManagerClient$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ PurrManagerClientImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurrManagerClientImpl$setupPurrManagerClient$1(PurrManagerClientImpl purrManagerClientImpl, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = purrManagerClientImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PurrManagerClientImpl$setupPurrManagerClient$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                PurrManagerClientImpl purrManagerClientImpl = this.this$0;
                this.label = 1;
                obj = purrManagerClientImpl.a(this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            NYTLogger.d("Initialized privacy configuration for PurrManager: " + ((PrivacyConfiguration) obj), new Object[0]);
        } catch (Exception e) {
            NYTLogger.g("Exception initializing privacy configuration for PurrManager", e);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((PurrManagerClientImpl$setupPurrManagerClient$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
