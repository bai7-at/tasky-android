package com.nytimes.android.entitlements;

import com.nytimes.android.subauth.core.api.client.NYTUser;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.m98;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.entitlements.ECommClientImpl$subscribeToUserChanges$1", f = "ECommClientImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ECommClientImpl$subscribeToUserChanges$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ ECommClientImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ECommClientImpl$subscribeToUserChanges$1(ECommClientImpl eCommClientImpl, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = eCommClientImpl;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(NYTUser.StateChangeType stateChangeType, by0 by0Var) {
        return ((ECommClientImpl$subscribeToUserChanges$1) create(stateChangeType, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ECommClientImpl$subscribeToUserChanges$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.this$0.z().onNext(new m98(this.this$0.u(), this.this$0.g(), this.this$0.A().o()));
        return ww8.a;
    }
}
