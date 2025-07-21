package com.nytimes.android.readerhybrid;

import android.webkit.WebView;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2$4$webUrl$1", f = "WebViewRenderProcessClient.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WebViewRenderProcessClient$observeWebViewResponsiveState$2$4$webUrl$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ WebView $webView;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebViewRenderProcessClient$observeWebViewResponsiveState$2$4$webUrl$1(WebView webView, by0 by0Var) {
        super(2, by0Var);
        this.$webView = webView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new WebViewRenderProcessClient$observeWebViewResponsiveState$2$4$webUrl$1(this.$webView, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        return this.$webView.getUrl();
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((WebViewRenderProcessClient$observeWebViewResponsiveState$2$4$webUrl$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
