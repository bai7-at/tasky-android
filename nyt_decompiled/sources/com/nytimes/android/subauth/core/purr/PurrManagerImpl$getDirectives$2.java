package com.nytimes.android.subauth.core.purr;

import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.subauth.core.purr.PurrManagerImpl$getDirectives$2", f = "PurrManagerImpl.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PurrManagerImpl$getDirectives$2 extends SuspendLambda implements ss2 {
    int label;
    final /* synthetic */ PurrManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurrManagerImpl$getDirectives$2(PurrManagerImpl purrManagerImpl, by0 by0Var) {
        super(1, by0Var);
        this.this$0 = purrManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new PurrManagerImpl$getDirectives$2(this.this$0, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((PurrManagerImpl$getDirectives$2) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            PurrManagerImpl purrManagerImpl = this.this$0;
            this.label = 1;
            obj = purrManagerImpl.P(this);
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
