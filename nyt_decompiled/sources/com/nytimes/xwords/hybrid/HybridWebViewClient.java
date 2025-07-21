package com.nytimes.xwords.hybrid;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.nytimes.xwords.hybrid.HybridWebViewClient;
import com.nytimes.xwords.hybrid.view.BaseHybridFragment;
import defpackage.by0;
import defpackage.c54;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.nm6;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.WebViewClientSwazzledHooks;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.collections.t;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.text.h;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvertKt;

/* loaded from: classes4.dex */
public final class HybridWebViewClient extends WebViewClient implements CoroutineScope {
    private final c54 a;
    private final CoroutineContext b;
    private final BaseHybridFragment.b c;
    private final PublishSubject d;

    @fc1(c = "com.nytimes.xwords.hybrid.HybridWebViewClient$1", f = "HybridWebViewClient.kt", l = {58}, m = "invokeSuspend")
    /* renamed from: com.nytimes.xwords.hybrid.HybridWebViewClient$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        int label;

        @fc1(c = "com.nytimes.xwords.hybrid.HybridWebViewClient$1$1", f = "HybridWebViewClient.kt", l = {48}, m = "invokeSuspend")
        /* renamed from: com.nytimes.xwords.hybrid.HybridWebViewClient$1$1, reason: invalid class name and collision with other inner class name */
        static final class C04651 extends SuspendLambda implements it2 {
            final /* synthetic */ Flow<Pair<Context, String>> $urlOpenerFlow;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C04651(Flow flow, by0 by0Var) {
                super(3, by0Var);
                this.$urlOpenerFlow = flow;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object h = kotlin.coroutines.intrinsics.a.h();
                int i = this.label;
                if (i == 0) {
                    f.b(obj);
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    Flow debounce = FlowKt.debounce(FlowKt.drop(this.$urlOpenerFlow, 1), 200L);
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector, debounce, this) == h) {
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

            @Override // defpackage.it2
            public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
                C04651 c04651 = new C04651(this.$urlOpenerFlow, by0Var);
                c04651.L$0 = flowCollector;
                return c04651.invokeSuspend(ww8.a);
            }
        }

        @fc1(c = "com.nytimes.xwords.hybrid.HybridWebViewClient$1$2", f = "HybridWebViewClient.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.nytimes.xwords.hybrid.HybridWebViewClient$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements it2 {
            /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(by0 by0Var) {
                super(3, by0Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.a.h();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                Throwable th = (Throwable) this.L$0;
                if (!(th instanceof CancellationException)) {
                    ul8.a.f(th, "cannot redirect to url", new Object[0]);
                }
                return ww8.a;
            }

            @Override // defpackage.it2
            public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(by0Var);
                anonymousClass2.L$0 = th;
                return anonymousClass2.invokeSuspend(ww8.a);
            }
        }

        /* renamed from: com.nytimes.xwords.hybrid.HybridWebViewClient$1$a */
        static final class a implements FlowCollector {
            final /* synthetic */ HybridWebViewClient a;

            a(HybridWebViewClient hybridWebViewClient) {
                this.a = hybridWebViewClient;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Pair pair, by0 by0Var) {
                this.a.d((String) pair.d());
                return ww8.a;
            }
        }

        AnonymousClass1(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return HybridWebViewClient.this.new AnonymousClass1(by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                Flow asFlow = RxConvertKt.asFlow(HybridWebViewClient.this.d);
                Flow m911catch = FlowKt.m911catch(FlowKt.onCompletion(FlowKt.take(asFlow, 1), new C04651(asFlow, null)), new AnonymousClass2(null));
                a aVar = new a(HybridWebViewClient.this);
                this.label = 1;
                if (m911catch.collect(aVar, this) == h) {
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
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    public HybridWebViewClient(c54 c54Var, CoroutineContext coroutineContext, BaseHybridFragment.b bVar) {
        zq3.h(c54Var, "gameLinkHandler");
        zq3.h(coroutineContext, "coroutineContext");
        zq3.h(bVar, "webViewErrorListener");
        this.a = c54Var;
        this.b = coroutineContext;
        this.c = bVar;
        PublishSubject create = PublishSubject.create();
        zq3.g(create, "create(...)");
        this.d = create;
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(String str) {
        this.a.j(str, t.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(String str) {
    }

    private final boolean f(Context context, String str) {
        if (h.K(str, "file://", false, 2, null)) {
            return false;
        }
        this.d.onNext(new Pair(context, str));
        return true;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.b;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        zq3.h(webView, "view");
        zq3.h(str, "url");
        super.onPageFinished(webView, str);
        webView.evaluateJavascript("(function() {\n    if (!window.performance || !window.performance.timing) {\n        return [];\n    }\n    \n    var tti = window.performance.timing.domInteractive - window.performance.timing\n        .navigationStart;\n        \n    var fcp = null;\n    if (window.performance.getEntriesByName) {\n        var entries = performance.getEntriesByName(\"first-contentful-paint\");\n        if (entries[0]) {\n            fcp = entries[0].startTime;\n        }\n    }\n    \n    return [tti, fcp];\n    \n})()", new ValueCallback() { // from class: pd3
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                HybridWebViewClient.e((String) obj);
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewClientSwazzledHooks._preOnPageStarted(webView, str, bitmap);
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zq3.h(webView, "view");
        zq3.h(webResourceRequest, "request");
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        String string = webView.getContext().getString(nm6.generic_webview_error_msg);
        zq3.g(string, "getString(...)");
        this.c.a(string);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zq3.h(webView, "view");
        zq3.h(str, "url");
        Context context = webView.getContext();
        zq3.g(context, "getContext(...)");
        return f(context, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        zq3.h(webView, "view");
        zq3.h(webResourceRequest, "request");
        Context context = webView.getContext();
        zq3.g(context, "getContext(...)");
        String uri = webResourceRequest.getUrl().toString();
        zq3.g(uri, "toString(...)");
        return f(context, uri);
    }
}
