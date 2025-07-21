package com.nytimes.android.entitlements;

import defpackage.by0;
import defpackage.f98;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.i78;
import defpackage.ww8;
import java.util.UUID;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.entitlements.ECommClientImpl$subscribeToLIREEmailSupportRequests$1", f = "ECommClientImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ECommClientImpl$subscribeToLIREEmailSupportRequests$1 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ECommClientImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ECommClientImpl$subscribeToLIREEmailSupportRequests$1(ECommClientImpl eCommClientImpl, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = eCommClientImpl;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(i78.c cVar, by0 by0Var) {
        return ((ECommClientImpl$subscribeToLIREEmailSupportRequests$1) create(cVar, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        ECommClientImpl$subscribeToLIREEmailSupportRequests$1 eCommClientImpl$subscribeToLIREEmailSupportRequests$1 = new ECommClientImpl$subscribeToLIREEmailSupportRequests$1(this.this$0, by0Var);
        eCommClientImpl$subscribeToLIREEmailSupportRequests$1.L$0 = obj;
        return eCommClientImpl$subscribeToLIREEmailSupportRequests$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        f98 f98Var;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        i78.c cVar = (i78.c) this.L$0;
        String uuid = cVar.b() ? UUID.randomUUID().toString() : null;
        f98Var = this.this$0.l;
        f98Var.a(uuid, "Error Received: " + cVar.a());
        return ww8.a;
    }
}
