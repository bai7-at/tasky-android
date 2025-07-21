package com.nytimes.android.messaging.regibundle;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.messaging.regibundle.RegibundleFragment$listenForLireEvents$1", f = "RegibundleFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RegibundleFragment$listenForLireEvents$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ RegibundleFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RegibundleFragment$listenForLireEvents$1(RegibundleFragment regibundleFragment, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = regibundleFragment;
    }

    public final Object b(boolean z, by0 by0Var) {
        return ((RegibundleFragment$listenForLireEvents$1) create(Boolean.valueOf(z), by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new RegibundleFragment$listenForLireEvents$1(this.this$0, by0Var);
    }

    @Override // defpackage.gt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return b(((Boolean) obj).booleanValue(), (by0) obj2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.this$0.dismissAllowingStateLoss();
        return ww8.a;
    }
}
