package com.nytimes.android.growthui.regibundle;

import android.content.Context;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.t43;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.growthui.regibundle.RegibundleDialogFragment$onRegistrationButtonClick$1", f = "RegibundleDialogFragment.kt", l = {94}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RegibundleDialogFragment$onRegistrationButtonClick$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ RegibundleDialogFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RegibundleDialogFragment$onRegistrationButtonClick$1(RegibundleDialogFragment regibundleDialogFragment, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = regibundleDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new RegibundleDialogFragment$onRegistrationButtonClick$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            t43 j1 = this.this$0.j1();
            Context requireContext = this.this$0.requireContext();
            zq3.g(requireContext, "requireContext(...)");
            this.label = 1;
            if (j1.a(requireContext, this) == h) {
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

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((RegibundleDialogFragment$onRegistrationButtonClick$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
