package com.nytimes.android;

import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.o98;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.MainActivity$onCreateActivity$2", f = "MainActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class MainActivity$onCreateActivity$2 extends SuspendLambda implements it2 {
    /* synthetic */ Object L$0;
    int label;

    MainActivity$onCreateActivity$2(by0<? super MainActivity$onCreateActivity$2> by0Var) {
        super(3, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        NYTLogger.i((Throwable) this.L$0, "error on forced logout alert", new Object[0]);
        return ww8.a;
    }

    @Override // defpackage.it2
    public final Object invoke(FlowCollector<? super o98.b> flowCollector, Throwable th, by0<? super ww8> by0Var) {
        MainActivity$onCreateActivity$2 mainActivity$onCreateActivity$2 = new MainActivity$onCreateActivity$2(by0Var);
        mainActivity$onCreateActivity$2.L$0 = th;
        return mainActivity$onCreateActivity$2.invokeSuspend(ww8.a);
    }
}
