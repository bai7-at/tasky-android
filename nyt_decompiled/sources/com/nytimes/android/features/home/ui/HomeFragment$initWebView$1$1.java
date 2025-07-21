package com.nytimes.android.features.home.ui;

import com.nytimes.android.performancetrackerclientphoenix.event.base.HybridType;
import com.nytimes.android.readerhybrid.HybridWebView;
import com.nytimes.android.readerhybrid.WebViewRenderProcessClient;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.hd3;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.home.ui.HomeFragment$initWebView$1$1", f = "HomeFragment.kt", l = {411}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HomeFragment$initWebView$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ HybridWebView $webView;
    int label;
    final /* synthetic */ HomeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeFragment$initWebView$1$1(HybridWebView hybridWebView, HomeFragment homeFragment, by0 by0Var) {
        super(2, by0Var);
        this.$webView = hybridWebView;
        this.this$0 = homeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new HomeFragment$initWebView$1$1(this.$webView, this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            WebViewRenderProcessClient webViewRenderProcessClient = WebViewRenderProcessClient.a;
            HybridType hybridType = HybridType.Today;
            HybridWebView hybridWebView = this.$webView;
            zq3.g(hybridWebView, "$webView");
            hd3 r1 = this.this$0.r1();
            this.label = 1;
            if (webViewRenderProcessClient.a(hybridType, hybridWebView, r1, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((HomeFragment$initWebView$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
