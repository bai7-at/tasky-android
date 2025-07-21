package com.nytimes.android.readerhybrid;

import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2$4", f = "WebViewRenderProcessClient.kt", l = {92}, m = "emit")
/* loaded from: classes4.dex */
final class WebViewRenderProcessClient$observeWebViewResponsiveState$2$4$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WebViewRenderProcessClient$observeWebViewResponsiveState$2.AnonymousClass4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebViewRenderProcessClient$observeWebViewResponsiveState$2$4$emit$1(WebViewRenderProcessClient$observeWebViewResponsiveState$2.AnonymousClass4 anonymousClass4, by0 by0Var) {
        super(by0Var);
        this.this$0 = anonymousClass4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.emit(null, this);
    }
}
