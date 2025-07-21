package com.nytimes.android;

import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.AbraLoginObserver$initialize$2", f = "AbraLoginObserver.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AbraLoginObserver$initialize$2 extends SuspendLambda implements it2 {
    /* synthetic */ Object L$0;
    int label;

    AbraLoginObserver$initialize$2(by0 by0Var) {
        super(3, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        NYTLogger.g("eCommClient loginChangedObservable error " + ((Throwable) this.L$0), new Object[0]);
        return ww8.a;
    }

    @Override // defpackage.it2
    public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
        AbraLoginObserver$initialize$2 abraLoginObserver$initialize$2 = new AbraLoginObserver$initialize$2(by0Var);
        abraLoginObserver$initialize$2.L$0 = th;
        return abraLoginObserver$initialize$2.invokeSuspend(ww8.a);
    }
}
