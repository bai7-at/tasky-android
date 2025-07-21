package com.nytimes.android.ribbon.destinations.greatreads;

import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.ribbon.destinations.greatreads.GreatReadsFetcher$getGreatReads$1", f = "GreatReadsFetcher.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GreatReadsFetcher$getGreatReads$1 extends SuspendLambda implements ss2 {
    int label;

    GreatReadsFetcher$getGreatReads$1(by0 by0Var) {
        super(1, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new GreatReadsFetcher$getGreatReads$1(by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((GreatReadsFetcher$getGreatReads$1) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        return ww8.a;
    }
}
