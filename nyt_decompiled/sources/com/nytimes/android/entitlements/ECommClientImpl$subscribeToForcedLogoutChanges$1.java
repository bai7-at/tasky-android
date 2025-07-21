package com.nytimes.android.entitlements;

import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.o98;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.entitlements.ECommClientImpl$subscribeToForcedLogoutChanges$1", f = "ECommClientImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ECommClientImpl$subscribeToForcedLogoutChanges$1 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ECommClientImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ECommClientImpl$subscribeToForcedLogoutChanges$1(ECommClientImpl eCommClientImpl, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = eCommClientImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        ECommClientImpl$subscribeToForcedLogoutChanges$1 eCommClientImpl$subscribeToForcedLogoutChanges$1 = new ECommClientImpl$subscribeToForcedLogoutChanges$1(this.this$0, by0Var);
        eCommClientImpl$subscribeToForcedLogoutChanges$1.L$0 = obj;
        return eCommClientImpl$subscribeToForcedLogoutChanges$1;
    }

    @Override // defpackage.gt2
    public final Object invoke(o98.b bVar, by0 by0Var) {
        return ((ECommClientImpl$subscribeToForcedLogoutChanges$1) create(bVar, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        o98.b bVar = (o98.b) this.L$0;
        this.this$0.D(bVar);
        NYTLogger.A("Force Logged out. (" + bVar.a() + ", " + bVar.b() + ")", new Object[0]);
        return ww8.a;
    }
}
