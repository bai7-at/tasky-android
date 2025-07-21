package com.nytimes.android.ads.hybrid;

import android.webkit.WebView;
import com.comscore.streaming.ContentType;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.nb3;
import defpackage.ww8;
import defpackage.zq3;
import java.lang.ref.WeakReference;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.ads.hybrid.HybridAdManagerImpl$updatePageViewId$1", f = "HybridAdManager.kt", l = {ContentType.SHORT_FORM_ON_DEMAND}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class HybridAdManagerImpl$updatePageViewId$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $pageViewId;
    Object L$0;
    int label;
    final /* synthetic */ HybridAdManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridAdManagerImpl$updatePageViewId$1(HybridAdManagerImpl hybridAdManagerImpl, String str, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = hybridAdManagerImpl;
        this.$pageViewId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new HybridAdManagerImpl$updatePageViewId$1(this.this$0, this.$pageViewId, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WeakReference weakReference;
        nb3 nb3Var;
        WebView webView;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            weakReference = this.this$0.h;
            if (weakReference == null) {
                zq3.z("hybridWebView");
                weakReference = null;
            }
            WebView webView2 = (WebView) weakReference.get();
            if (webView2 != null) {
                nb3Var = this.this$0.g;
                if (nb3Var == null) {
                    zq3.z("hybridScripts");
                    nb3Var = null;
                }
                String str = this.$pageViewId;
                this.L$0 = webView2;
                this.label = 1;
                Object b = nb3Var.b(str, this);
                if (b == h) {
                    return h;
                }
                obj = b;
                webView = webView2;
            }
            return ww8.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        webView = (WebView) this.L$0;
        f.b(obj);
        webView.evaluateJavascript((String) obj, null);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((HybridAdManagerImpl$updatePageViewId$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
