package com.nytimes.android.entitlements.purr.client;

import com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$setupPurrManagerClient$2", f = "PurrManagerClientImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PurrManagerClientImpl$setupPurrManagerClient$2 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PurrManagerClientImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurrManagerClientImpl$setupPurrManagerClient$2(PurrManagerClientImpl purrManagerClientImpl, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = purrManagerClientImpl;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(PrivacyConfiguration privacyConfiguration, by0 by0Var) {
        return ((PurrManagerClientImpl$setupPurrManagerClient$2) create(privacyConfiguration, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        PurrManagerClientImpl$setupPurrManagerClient$2 purrManagerClientImpl$setupPurrManagerClient$2 = new PurrManagerClientImpl$setupPurrManagerClient$2(this.this$0, by0Var);
        purrManagerClientImpl$setupPurrManagerClient$2.L$0 = obj;
        return purrManagerClientImpl$setupPurrManagerClient$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.this$0.D((PrivacyConfiguration) this.L$0);
        return ww8.a;
    }
}
