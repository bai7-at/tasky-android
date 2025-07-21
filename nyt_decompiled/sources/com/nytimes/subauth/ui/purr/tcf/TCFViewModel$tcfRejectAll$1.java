package com.nytimes.subauth.ui.purr.tcf;

import com.nytimes.android.subauth.core.purr.a;
import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.subauth.ui.purr.tcf.TCFViewModel$tcfRejectAll$1", f = "TCFViewModel.kt", l = {136}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TCFViewModel$tcfRejectAll$1 extends SuspendLambda implements ss2 {
    int label;
    final /* synthetic */ TCFViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TCFViewModel$tcfRejectAll$1(TCFViewModel tCFViewModel, by0 by0Var) {
        super(1, by0Var);
        this.this$0 = tCFViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new TCFViewModel$tcfRejectAll$1(this.this$0, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((TCFViewModel$tcfRejectAll$1) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            com.nytimes.android.subauth.core.purr.a aVar = this.this$0.a;
            this.label = 1;
            obj = a.C0419a.b(aVar, null, this, 1, null);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return obj;
    }
}
