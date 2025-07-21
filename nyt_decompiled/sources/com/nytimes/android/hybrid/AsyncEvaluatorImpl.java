package com.nytimes.android.hybrid;

import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebView;
import com.nytimes.android.hybrid.AsyncEvaluatorImpl;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;
import defpackage.by0;
import defpackage.et3;
import defpackage.zq3;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public final class AsyncEvaluatorImpl implements com.nytimes.android.hybrid.a {
    public static final a Companion = new a(null);
    private static final String d = "(async function(event) {\n    const fn = new AsyncFunction(event.data);\n    try {\n        const result = await fn();\n        event.ports[0].postMessage(JSON.stringify({\n            success: true,\n            result: JSON.stringify(result)\n        }));\n    } catch (e) {\n        event.ports[0].postMessage(JSON.stringify({\n            success: false,\n            result: e.message\n        }));\n    }\n})";
    private static final String e = h.f("\n            (function(AsyncFunction) {\n                    function receiveInitialMessage(event) {\n                        if (event.data !== \"__asyncJSSetup\") {\n                            return;\n                        }\n                        event.ports[0].addEventListener('message', (async function(event) {\n    const fn = new AsyncFunction(event.data);\n    try {\n        const result = await fn();\n        event.ports[0].postMessage(JSON.stringify({\n            success: true,\n            result: JSON.stringify(result)\n        }));\n    } catch (e) {\n        event.ports[0].postMessage(JSON.stringify({\n            success: false,\n            result: e.message\n        }));\n    }\n}));\n                        event.ports[0].start();\n                        self.removeEventListener('message', receiveInitialMessage);\n                    }\n                    self.addEventListener('message', receiveInitialMessage);\n            })(Object.getPrototypeOf(async function(){}).constructor);\n        ");
    private WebMessagePort a;
    private final AtomicReference b = new AtomicReference(null);
    private final JsonAdapter c = new i.b().d().c(ResultPayload.class);

    public static final class CouldNotDecodeResponseError extends Error {
        public CouldNotDecodeResponseError() {
            super("Could not decode the response sent from the WebView");
        }
    }

    public static final class NotBootstrappedError extends Error {
        public NotBootstrappedError() {
            super("This AsyncEvaluator has not been bootstrapped yet and can't evaluate code. Has the page finished loading?");
        }
    }

    @et3(generateAdapter = true)
    public static final class ResultPayload {
        private final boolean a;
        private final String b;

        public ResultPayload(boolean z, String str) {
            this.a = z;
            this.b = str;
        }

        public final String a() {
            return this.b;
        }

        public final boolean b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResultPayload)) {
                return false;
            }
            ResultPayload resultPayload = (ResultPayload) obj;
            return this.a == resultPayload.a && zq3.c(this.b, resultPayload.b);
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ResultPayload(success=" + this.a + ", result=" + this.b + ")";
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(WebMessagePort webMessagePort, WebView webView, String str) {
        zq3.h(webMessagePort, "$currentPort");
        webView.postWebMessage(new WebMessage("__asyncJSSetup", new WebMessagePort[]{webMessagePort}), Uri.EMPTY);
    }

    @Override // com.nytimes.android.hybrid.a
    public void a(WebView webView) {
        if (webView == null) {
            return;
        }
        WebMessagePort[] createWebMessageChannel = webView.createWebMessageChannel();
        zq3.g(createWebMessageChannel, "createWebMessageChannel(...)");
        this.a = createWebMessageChannel[0];
        this.b.set(createWebMessageChannel[1]);
    }

    @Override // com.nytimes.android.hybrid.a
    public Object b(WebView webView, String str, CoroutineDispatcher coroutineDispatcher, by0 by0Var) {
        return BuildersKt.withContext(coroutineDispatcher, new AsyncEvaluatorImpl$callAsync$2(this, webView, str, null), by0Var);
    }

    @Override // com.nytimes.android.hybrid.a
    public void c(final WebView webView) {
        final WebMessagePort webMessagePort;
        if (webView == null || (webMessagePort = (WebMessagePort) this.b.getAndSet(null)) == null) {
            return;
        }
        webView.evaluateJavascript(e, new ValueCallback() { // from class: hu
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                AsyncEvaluatorImpl.g(webMessagePort, webView, (String) obj);
            }
        });
    }
}
