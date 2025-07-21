package com.nytimes.android.fragment;

import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.performancetrackerclientphoenix.event.base.HybridType;
import com.nytimes.android.readerhybrid.HybridWebView;
import com.nytimes.android.readerhybrid.WebViewRenderProcessClient;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.hd3;
import defpackage.ww8;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.fragment.WebViewFragment$onActivityCreated$3$1", f = "WebViewFragment.kt", l = {222}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WebViewFragment$onActivityCreated$3$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ HybridWebView $it;
    int label;
    final /* synthetic */ WebViewFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebViewFragment$onActivityCreated$3$1(HybridWebView hybridWebView, WebViewFragment webViewFragment, by0 by0Var) {
        super(2, by0Var);
        this.$it = hybridWebView;
        this.this$0 = webViewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new WebViewFragment$onActivityCreated$3$1(this.$it, this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                WebViewRenderProcessClient webViewRenderProcessClient = WebViewRenderProcessClient.a;
                HybridType hybridType = HybridType.Interactive;
                HybridWebView hybridWebView = this.$it;
                hd3 p1 = this.this$0.p1();
                this.label = 1;
                if (webViewRenderProcessClient.a(hybridType, hybridWebView, p1, this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
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
        return ((WebViewFragment$onActivityCreated$3$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
