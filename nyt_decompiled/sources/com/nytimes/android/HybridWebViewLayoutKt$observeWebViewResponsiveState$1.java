package com.nytimes.android;

import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.performancetrackerclientphoenix.event.base.HybridType;
import com.nytimes.android.readerhybrid.HybridWebView;
import com.nytimes.android.readerhybrid.WebViewRenderProcessClient;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.hd3;
import defpackage.td3;
import defpackage.ww8;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.HybridWebViewLayoutKt$observeWebViewResponsiveState$1", f = "HybridWebViewLayout.kt", l = {509}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class HybridWebViewLayoutKt$observeWebViewResponsiveState$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ td3 $entryPoint;
    final /* synthetic */ HybridType $hybridType;
    final /* synthetic */ HybridWebView $webView;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridWebViewLayoutKt$observeWebViewResponsiveState$1(HybridType hybridType, HybridWebView hybridWebView, td3 td3Var, by0 by0Var) {
        super(2, by0Var);
        this.$hybridType = hybridType;
        this.$webView = hybridWebView;
        this.$entryPoint = td3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new HybridWebViewLayoutKt$observeWebViewResponsiveState$1(this.$hybridType, this.$webView, this.$entryPoint, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.f.b(obj);
                WebViewRenderProcessClient webViewRenderProcessClient = WebViewRenderProcessClient.a;
                HybridType hybridType = this.$hybridType;
                HybridWebView hybridWebView = this.$webView;
                hd3 u = this.$entryPoint.u();
                this.label = 1;
                if (webViewRenderProcessClient.a(hybridType, hybridWebView, u, this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.f.b(obj);
            }
        } catch (Throwable th) {
            if (!(th instanceof CancellationException)) {
                NYTLogger.h(th);
            }
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((HybridWebViewLayoutKt$observeWebViewResponsiveState$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
