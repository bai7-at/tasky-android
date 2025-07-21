package com.nytimes.android.messaging.regibundle;

import com.nytimes.android.subauth.core.auth.models.LoginMethod;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.p98;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.messaging.regibundle.RegibundleFragment$listenForLireEvents$3", f = "RegibundleFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RegibundleFragment$listenForLireEvents$3 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RegibundleFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RegibundleFragment$listenForLireEvents$3(RegibundleFragment regibundleFragment, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = regibundleFragment;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(LoginMethod loginMethod, by0 by0Var) {
        return ((RegibundleFragment$listenForLireEvents$3) create(loginMethod, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        RegibundleFragment$listenForLireEvents$3 regibundleFragment$listenForLireEvents$3 = new RegibundleFragment$listenForLireEvents$3(this.this$0, by0Var);
        regibundleFragment$listenForLireEvents$3.L$0 = obj;
        return regibundleFragment$listenForLireEvents$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.this$0.i1().c(p98.a((LoginMethod) this.L$0));
        this.this$0.dismissAllowingStateLoss();
        return ww8.a;
    }
}
