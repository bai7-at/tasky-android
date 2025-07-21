package com.nytimes.android.entitlements;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.z58;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.entitlements.ECommClientImpl$subscribeToUserChanges$2", f = "ECommClientImpl.kt", l = {340}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ECommClientImpl$subscribeToUserChanges$2 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ ECommClientImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ECommClientImpl$subscribeToUserChanges$2(ECommClientImpl eCommClientImpl, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = eCommClientImpl;
    }

    public final Object b(boolean z, by0 by0Var) {
        return ((ECommClientImpl$subscribeToUserChanges$2) create(Boolean.valueOf(z), by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ECommClientImpl$subscribeToUserChanges$2(this.this$0, by0Var);
    }

    @Override // defpackage.gt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return b(((Boolean) obj).booleanValue(), (by0) obj2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            z58 A = this.this$0.A();
            this.label = 1;
            if (A.b(this) == h) {
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
}
