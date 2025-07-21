package defpackage;

import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.gson.Gson;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.performancetracker.lib.PerformanceTracker;
import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent;
import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEventFactory;
import com.nytimes.android.performancetrackerclientphoenix.event.base.BasePerformanceTracker;
import com.nytimes.android.performancetrackerclientphoenix.event.base.HybridType;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class hd3 extends BasePerformanceTracker implements ze9 {
    private final fr d;
    private PerformanceTracker.b e;
    private PerformanceTracker.b f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd3(fr frVar, cr5 cr5Var, AppEventFactory appEventFactory, CoroutineScope coroutineScope) {
        super(cr5Var, appEventFactory, coroutineScope);
        zq3.h(frVar, "articlePerformanceTracker");
        zq3.h(cr5Var, "performanceTracker");
        zq3.h(appEventFactory, "appEventFactory");
        zq3.h(coroutineScope, "scope");
        this.d = frVar;
    }

    private final void r(HybridType hybridType) {
        k(new AppEvent.Hybrid.Error.CouldNotFetchPerformanceData(hybridType));
    }

    private final void t(HybridType hybridType, String str, double d, Double d2) {
        k(new AppEvent.Hybrid.PerformanceData(hybridType, str, d, d2));
    }

    public static /* synthetic */ void u(hd3 hd3Var, WebView webView, String str, HybridType hybridType, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        hd3Var.s(webView, str, hybridType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(hd3 hd3Var, HybridType hybridType, String str, WebView webView, String str2) {
        zq3.h(hd3Var, "this$0");
        zq3.h(hybridType, "$hybridType");
        zq3.h(webView, "$view");
        List list = (List) new Gson().fromJson(str2, List.class);
        Object obj = list != null ? list.get(0) : null;
        Double d = obj instanceof Double ? (Double) obj : null;
        Object obj2 = list != null ? list.get(1) : null;
        Double d2 = obj2 instanceof Double ? (Double) obj2 : null;
        if (d == null) {
            hd3Var.r(hybridType);
            return;
        }
        if (str == null && (str = webView.getUrl()) == null) {
            str = "NO_URL";
        }
        hd3Var.t(hybridType, str, d.doubleValue(), d2);
    }

    @Override // defpackage.ze9
    public void a(Uri uri, HybridType hybridType) {
        zq3.h(hybridType, "hybridType");
        this.f = g(new AppEvent.Hybrid.Error.WebViewFroze(hybridType, uri));
        this.d.a(uri, hybridType);
    }

    @Override // defpackage.ze9
    public void d(boolean z, boolean z2, HybridType hybridType) {
        zq3.h(hybridType, "hybridType");
        PerformanceTracker.b bVar = this.f;
        if (bVar == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("hybridType", hybridType);
        linkedHashMap.put("webviewFreezeTimedOut", Boolean.valueOf(z));
        linkedHashMap.put("webviewClosedWhileFrozen", Boolean.valueOf(z2));
        i(bVar, linkedHashMap);
        this.f = null;
        this.d.d(z, z2, hybridType);
    }

    public final void m(int i, Asset asset, HybridType hybridType) {
        zq3.h(hybridType, "hybridType");
        n(i, asset != null ? asset.getUrl() : null, asset != null ? asset.getAssetType() : null, asset != null ? Long.valueOf(asset.getLastModified()) : null, hybridType);
    }

    public final void n(int i, String str, String str2, Long l, HybridType hybridType) {
        String str3;
        zq3.h(hybridType, "hybridType");
        this.e = g(new AppEvent.Hybrid.Load(l, i, str, str2, hybridType));
        boolean z = (str2 == null || str == null) ? false : true;
        StringBuilder sb = new StringBuilder("Opened ");
        sb.append(hybridType);
        if (z) {
            str3 = " : (" + str2 + ", " + str + ")";
        } else {
            str3 = "";
        }
        sb.append(str3);
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        h(sb2);
        this.d.m(i, str, str2, l, hybridType == HybridType.Interactive);
    }

    public final void o(Throwable th, String str, Uri uri, HybridType hybridType) {
        zq3.h(hybridType, "hybridType");
        k(new AppEvent.Hybrid.Error.UnableToLoadData(hybridType, th, str, uri));
        this.e = null;
        this.d.n(th, str, uri, hybridType == HybridType.Interactive);
    }

    public final void p() {
        PerformanceTracker.b bVar = this.e;
        if (bVar != null) {
            BasePerformanceTracker.j(this, bVar, null, 2, null);
            this.e = null;
        }
        this.d.o();
    }

    public final void q(HybridType hybridType) {
        zq3.h(hybridType, "hybridType");
        String lowerCase = hybridType.name().toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        k(new AppEvent.Page.View(lowerCase));
        this.d.p();
    }

    public final void s(final WebView webView, final String str, final HybridType hybridType) {
        zq3.h(webView, "view");
        zq3.h(hybridType, "hybridType");
        webView.evaluateJavascript("(function() {\n    if (!window.performance || !window.performance.timing) {\n        return [];\n    }\n    \n    var tti = window.performance.timing.domInteractive - window.performance.timing\n        .navigationStart;\n        \n    var fcp = null;\n    if (window.performance.getEntriesByName) {\n        var entries = performance.getEntriesByName(\"first-contentful-paint\");\n        if (entries[0]) {\n            fcp = entries[0].startTime;\n        }\n    }\n    \n    return [tti, fcp];\n    \n})()", new ValueCallback() { // from class: gd3
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                hd3.v(hd3.this, hybridType, str, webView, (String) obj);
            }
        });
        this.d.r(webView, str);
    }
}
