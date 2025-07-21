package com.nytimes.android.libs.iterate;

import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.libs.iterate.IterateInitializer$init$3", f = "IterateInitializer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class IterateInitializer$init$3 extends SuspendLambda implements it2 {
    /* synthetic */ Object L$0;
    int label;

    IterateInitializer$init$3(by0 by0Var) {
        super(3, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        NYTLogger.h((Throwable) this.L$0);
        return ww8.a;
    }

    @Override // defpackage.it2
    public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
        IterateInitializer$init$3 iterateInitializer$init$3 = new IterateInitializer$init$3(by0Var);
        iterateInitializer$init$3.L$0 = th;
        return iterateInitializer$init$3.invokeSuspend(ww8.a);
    }
}
