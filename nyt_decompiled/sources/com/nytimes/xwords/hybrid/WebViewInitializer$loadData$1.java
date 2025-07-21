package com.nytimes.xwords.hybrid;

import android.webkit.WebView;
import com.nytimes.android.hybrid.HybridConfig;
import com.nytimes.android.hybrid.bridge.NativeBridge;
import defpackage.ac3;
import defpackage.bc3;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.xwords.hybrid.WebViewInitializer$loadData$1", f = "WebViewInitializer.kt", l = {57}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WebViewInitializer$loadData$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $html;
    int label;
    final /* synthetic */ WebViewInitializer this$0;

    @fc1(c = "com.nytimes.xwords.hybrid.WebViewInitializer$loadData$1$1", f = "WebViewInitializer.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.xwords.hybrid.WebViewInitializer$loadData$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ String $bridgeSupportedHtml;
        int label;
        final /* synthetic */ WebViewInitializer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, WebViewInitializer webViewInitializer, by0 by0Var) {
            super(2, by0Var);
            this.$bridgeSupportedHtml = str;
            this.this$0 = webViewInitializer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.$bridgeSupportedHtml, this.this$0, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            WebView webView;
            String str;
            a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            if (this.$bridgeSupportedHtml.length() > 0) {
                webView = this.this$0.i;
                if (webView == null) {
                    zq3.z("webView");
                    webView = null;
                }
                str = this.this$0.a;
                webView.loadDataWithBaseURL(str, this.$bridgeSupportedHtml, "text/html; charset=utf-8", "base64", null);
            }
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebViewInitializer$loadData$1(WebViewInitializer webViewInitializer, String str, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = webViewInitializer;
        this.$html = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new WebViewInitializer$loadData$1(this.this$0, this.$html, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ac3 ac3Var;
        bc3 bc3Var;
        NativeBridge nativeBridge;
        CoroutineDispatcher coroutineDispatcher;
        Object h = a.h();
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    f.b(obj);
                    ac3Var = this.this$0.c;
                    HybridConfig a = ac3Var.a();
                    bc3Var = this.this$0.b;
                    String a2 = bc3Var.a(this.$html, a);
                    nativeBridge = this.this$0.h;
                    if (nativeBridge == null) {
                        zq3.z("nativeBridge");
                        nativeBridge = null;
                    }
                    String e = nativeBridge.e(a2);
                    coroutineDispatcher = this.this$0.e;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(e, this.this$0, null);
                    this.label = 1;
                    if (BuildersKt.withContext(coroutineDispatcher, anonymousClass1, this) == h) {
                        return h;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.b(obj);
                }
            } catch (Exception unused) {
                ul8.a.d(WebViewInitializer.class.getSimpleName() + ": Error during loadData", new Object[0]);
            }
        } catch (Exception e2) {
            ul8.a.d(WebViewInitializer.class.getSimpleName() + ": Unable to inject HybridConfig using raw hybridBody:  " + e2.getMessage(), new Object[0]);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((WebViewInitializer$loadData$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
