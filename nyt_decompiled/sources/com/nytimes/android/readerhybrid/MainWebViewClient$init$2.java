package com.nytimes.android.readerhybrid;

import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.readerhybrid.MainWebViewClient$init$2", f = "MainWebViewClient.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MainWebViewClient$init$2 extends SuspendLambda implements it2 {
    /* synthetic */ Object L$0;
    int label;

    MainWebViewClient$init$2(by0 by0Var) {
        super(3, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        NYTLogger.i((Throwable) this.L$0, "cannot redirect to url", new Object[0]);
        return ww8.a;
    }

    @Override // defpackage.it2
    public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
        MainWebViewClient$init$2 mainWebViewClient$init$2 = new MainWebViewClient$init$2(by0Var);
        mainWebViewClient$init$2.L$0 = th;
        return mainWebViewClient$init$2.invokeSuspend(ww8.a);
    }
}
