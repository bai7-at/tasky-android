package com.nytimes.android;

import com.nytimes.android.coroutinesutils.b;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.si1;
import defpackage.ww8;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.HybridWebViewLayoutKt$rememberWebView$1", f = "HybridWebViewLayout.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class HybridWebViewLayoutKt$rememberWebView$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ si1 $hybridWebviewTracer;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridWebViewLayoutKt$rememberWebView$1(si1 si1Var, by0 by0Var) {
        super(2, by0Var);
        this.$hybridWebviewTracer = si1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new HybridWebViewLayoutKt$rememberWebView$1(this.$hybridWebviewTracer, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        b.a.a(this.$hybridWebviewTracer, false, new Pair[0], 1, null);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((HybridWebViewLayoutKt$rememberWebView$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
