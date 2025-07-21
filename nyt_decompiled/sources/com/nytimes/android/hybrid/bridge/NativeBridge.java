package com.nytimes.android.hybrid.bridge;

import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;
import defpackage.by0;
import defpackage.ju;
import defpackage.kf9;
import defpackage.lf9;
import defpackage.mc0;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* loaded from: classes4.dex */
public final class NativeBridge {
    public static final a Companion = new a(null);
    private final WebView a;
    private final i b;
    private final CoroutineDispatcher c;
    private final lf9 d;
    private final NativeToWebCommand e;
    private final List f;
    private CoroutineScope g;

    public static final class NoNativeToWebBridgeError extends Error {
        public NoNativeToWebBridgeError() {
            super("This bridge does not have Native to Web capabilities");
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NativeBridge(WebView webView, i iVar, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, mc0... mc0VarArr) {
        CompletableJob Job$default;
        zq3.h(webView, "webView");
        zq3.h(iVar, "moshi");
        zq3.h(coroutineDispatcher, "defaultDispatcher");
        zq3.h(coroutineDispatcher2, "mainDispatcher");
        zq3.h(mc0VarArr, "extraCommands");
        this.a = webView;
        this.b = iVar;
        this.c = coroutineDispatcher2;
        this.d = new lf9(webView);
        ju juVar = webView instanceof ju ? (ju) webView : null;
        NativeToWebCommand nativeToWebCommand = juVar != null ? new NativeToWebCommand(juVar, iVar) : null;
        this.e = nativeToWebCommand;
        this.f = kotlin.collections.i.F0(kotlin.collections.i.G0(d.C0(mc0VarArr), new b()), kotlin.collections.i.p(nativeToWebCommand));
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.g = CoroutineScopeKt.CoroutineScope(Job$default.plus(coroutineDispatcher));
        webView.addJavascriptInterface(this, "NYTG");
    }

    private final String g() {
        StringBuilder sb = new StringBuilder();
        List a2 = this.d.a();
        ArrayList arrayList = new ArrayList(kotlin.collections.i.w(a2, 10));
        Iterator it2 = a2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((kf9) it2.next()).a());
        }
        sb.append("<script>");
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            sb.append(((String) it3.next()) + " \n");
        }
        sb.append("</script>");
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(BridgeCommandResult bridgeCommandResult, by0 by0Var) {
        if (bridgeCommandResult == null) {
            return ww8.a;
        }
        JsonAdapter c = this.b.c(BridgeCommandResult.class);
        zq3.g(c, "adapter(...)");
        Object withContext = BuildersKt.withContext(this.c, new NativeBridge$onBridgeCommandResult$2(this, "(function(){ window.NYTG.onCommandResult(" + c.toJson(bridgeCommandResult) + ") })()", null), by0Var);
        return withContext == kotlin.coroutines.intrinsics.a.h() ? withContext : ww8.a;
    }

    public final String d() {
        try {
            WebViewStateInjector webViewStateInjector = new WebViewStateInjector();
            List list = this.f;
            ArrayList arrayList = new ArrayList(kotlin.collections.i.w(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((mc0) it2.next()).a());
            }
            kf9 c = webViewStateInjector.c("window.navigator.native.bridgeCommands", arrayList);
            this.d.b(new kf9("bridgeInit", "\n(function() {\n    window.navigator = window.navigator || {};\n    window.navigator.native = window.navigator.native || {};\n})();"), c);
            StringBuilder sb = new StringBuilder();
            Iterator it3 = this.d.a().iterator();
            while (it3.hasNext()) {
                sb.append(((kf9) it3.next()).a());
            }
            String sb2 = sb.toString();
            zq3.g(sb2, "toString(...)");
            return sb2;
        } catch (Throwable th) {
            ul8.a.z("HYBRID").e(th);
            return "";
        }
    }

    public final String e(String str) {
        zq3.h(str, "htmlContent");
        if (str.length() != 0) {
            try {
                WebViewStateInjector webViewStateInjector = new WebViewStateInjector();
                List list = this.f;
                ArrayList arrayList = new ArrayList(kotlin.collections.i.w(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((mc0) it2.next()).a());
                }
                this.d.b(new kf9("bridgeInit", "\n(function() {\n    window.navigator = window.navigator || {};\n    window.navigator.native = window.navigator.native || {};\n})();"), webViewStateInjector.c("window.navigator.native.bridgeCommands", arrayList));
                str = g() + str;
            } catch (Throwable th) {
                ul8.a.z("HYBRID").e(th);
            }
            zq3.e(str);
        }
        return str;
    }

    @JavascriptInterface
    public final void enqueue(String str) {
        zq3.h(str, "commandJson");
        JavascriptEventParameter a2 = str.length() > 0 ? JavascriptEventParameter.Companion.a(str) : null;
        if (a2 != null) {
            BuildersKt__Builders_commonKt.launch$default(this.g, null, null, new NativeBridge$enqueue$1$1(this, a2, null), 3, null);
        }
    }

    public final Object f(JavascriptEventParameter javascriptEventParameter, Class cls, by0 by0Var) {
        NativeToWebCommand nativeToWebCommand = this.e;
        if (nativeToWebCommand != null) {
            return nativeToWebCommand.c(javascriptEventParameter, cls, by0Var);
        }
        throw new NoNativeToWebBridgeError();
    }

    public final void i() {
        CoroutineScopeKt.cancel$default(this.g, null, 1, null);
    }
}
