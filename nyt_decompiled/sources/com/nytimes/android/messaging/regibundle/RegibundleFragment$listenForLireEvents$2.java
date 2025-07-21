package com.nytimes.android.messaging.regibundle;

import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.messaging.regibundle.RegibundleFragment$listenForLireEvents$2", f = "RegibundleFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RegibundleFragment$listenForLireEvents$2 extends SuspendLambda implements it2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RegibundleFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RegibundleFragment$listenForLireEvents$2(RegibundleFragment regibundleFragment, by0 by0Var) {
        super(3, by0Var);
        this.this$0 = regibundleFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        NYTLogger.h((Throwable) this.L$0);
        this.this$0.dismissAllowingStateLoss();
        return ww8.a;
    }

    @Override // defpackage.it2
    public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
        RegibundleFragment$listenForLireEvents$2 regibundleFragment$listenForLireEvents$2 = new RegibundleFragment$listenForLireEvents$2(this.this$0, by0Var);
        regibundleFragment$listenForLireEvents$2.L$0 = th;
        return regibundleFragment$listenForLireEvents$2.invokeSuspend(ww8.a);
    }
}
