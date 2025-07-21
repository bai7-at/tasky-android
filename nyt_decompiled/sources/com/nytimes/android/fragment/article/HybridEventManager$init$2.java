package com.nytimes.android.fragment.article;

import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.fragment.article.HybridEventManager$init$2", f = "HybridEventManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HybridEventManager$init$2 extends SuspendLambda implements it2 {
    final /* synthetic */ ss2 $onProgressChanged;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridEventManager$init$2(ss2 ss2Var, by0 by0Var) {
        super(3, by0Var);
        this.$onProgressChanged = ss2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        NYTLogger.i((Throwable) this.L$0, "HybridFragment", new Object[0]);
        this.$onProgressChanged.invoke(cc0.a(false));
        return ww8.a;
    }

    @Override // defpackage.it2
    public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
        HybridEventManager$init$2 hybridEventManager$init$2 = new HybridEventManager$init$2(this.$onProgressChanged, by0Var);
        hybridEventManager$init$2.L$0 = th;
        return hybridEventManager$init$2.invokeSuspend(ww8.a);
    }
}
