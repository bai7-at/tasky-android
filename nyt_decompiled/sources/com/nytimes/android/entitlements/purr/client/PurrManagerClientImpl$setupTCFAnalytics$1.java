package com.nytimes.android.entitlements.purr.client;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.q96;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$setupTCFAnalytics$1", f = "PurrManagerClientImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PurrManagerClientImpl$setupTCFAnalytics$1 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PurrManagerClientImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurrManagerClientImpl$setupTCFAnalytics$1(PurrManagerClientImpl purrManagerClientImpl, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = purrManagerClientImpl;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(q96 q96Var, by0 by0Var) {
        return ((PurrManagerClientImpl$setupTCFAnalytics$1) create(q96Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        PurrManagerClientImpl$setupTCFAnalytics$1 purrManagerClientImpl$setupTCFAnalytics$1 = new PurrManagerClientImpl$setupTCFAnalytics$1(this.this$0, by0Var);
        purrManagerClientImpl$setupTCFAnalytics$1.L$0 = obj;
        return purrManagerClientImpl$setupTCFAnalytics$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        q96 q96Var = (q96) this.L$0;
        this.this$0.y(q96Var);
        this.this$0.r().a(q96Var);
        return ww8.a;
    }
}
