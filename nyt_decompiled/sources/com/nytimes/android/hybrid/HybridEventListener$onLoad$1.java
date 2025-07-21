package com.nytimes.android.hybrid;

import com.nytimes.android.hybrid.HybridEventListener;
import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ld3;
import defpackage.p65;
import defpackage.ww8;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.hybrid.HybridEventListener$onLoad$1", f = "HybridEventListener.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HybridEventListener$onLoad$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ HybridEventListener this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridEventListener$onLoad$1(HybridEventListener hybridEventListener, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = hybridEventListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new HybridEventListener$onLoad$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ld3 ld3Var;
        com.nytimes.android.readerhybrid.HybridWebView hybridWebView;
        MutableStateFlow mutableStateFlow;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                ld3Var = this.this$0.b;
                this.label = 1;
                obj = ld3Var.b(this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            String str = (String) obj;
            hybridWebView = this.this$0.e;
            if (hybridWebView != null) {
                hybridWebView.evaluateJavascript(str, p65.a);
            }
            mutableStateFlow = this.this$0.c;
            mutableStateFlow.setValue(HybridEventListener.a.c.a);
        } catch (Throwable th) {
            if (!(th instanceof CancellationException)) {
                NYTLogger.i(th, "handleScriptInflationError", new Object[0]);
            }
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((HybridEventListener$onLoad$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
