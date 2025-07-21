package defpackage;

import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.gson.Gson;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.performancetracker.lib.PerformanceTracker;
import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent;
import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEventFactory;
import com.nytimes.android.performancetrackerclientphoenix.event.base.BasePerformanceTracker;
import com.nytimes.android.performancetrackerclientphoenix.event.base.HybridType;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.t;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class fr extends BasePerformanceTracker implements ze9 {
    private PerformanceTracker.b d;
    private PerformanceTracker.b e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr(cr5 cr5Var, AppEventFactory appEventFactory, CoroutineScope coroutineScope) {
        super(cr5Var, appEventFactory, coroutineScope);
        zq3.h(cr5Var, "performanceTracker");
        zq3.h(appEventFactory, "appEventFactory");
        zq3.h(coroutineScope, "scope");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(fr frVar, String str, WebView webView, String str2) {
        zq3.h(frVar, "this$0");
        zq3.h(webView, "$view");
        List list = (List) new Gson().fromJson(str2, List.class);
        Object obj = list != null ? list.get(0) : null;
        Double d = obj instanceof Double ? (Double) obj : null;
        Object obj2 = list != null ? list.get(1) : null;
        Double d2 = obj2 instanceof Double ? (Double) obj2 : null;
        if (d == null) {
            frVar.q();
            return;
        }
        if (str == null && (str = webView.getUrl()) == null) {
            str = "NO_URL";
        }
        frVar.s(str, d.doubleValue(), d2);
    }

    @Override // defpackage.ze9
    public void a(Uri uri, HybridType hybridType) {
        zq3.h(hybridType, "hybridType");
        this.e = g(new AppEvent.Article.Error.WebViewFroze(uri));
    }

    @Override // defpackage.ze9
    public void d(boolean z, boolean z2, HybridType hybridType) {
        zq3.h(hybridType, "hybridType");
        PerformanceTracker.b bVar = this.e;
        if (bVar == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("webviewFreezeTimedOut", Boolean.valueOf(z));
        linkedHashMap.put("webviewClosedWhileFrozen", Boolean.valueOf(z2));
        i(bVar, linkedHashMap);
        this.e = null;
    }

    public final void m(int i, String str, String str2, Long l, boolean z) {
        String str3;
        Map n = t.n(du8.a("sender", Integer.valueOf(i)));
        if (str != null) {
            n.put("url", str);
        }
        if (str2 != null) {
            n.put("assetType", str2);
        }
        if (l != null) {
            long longValue = l.longValue();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(longValue);
            String date = calendar.getTime().toString();
            zq3.g(date, "toString(...)");
            n.put("lastModified", date);
        }
        this.d = g(z ? new AppEvent.Article.InteractiveLoad(n) : new AppEvent.Article.Load(n));
        boolean z2 = (str2 == null || str == null) ? false : true;
        StringBuilder sb = new StringBuilder("Opened ");
        sb.append(z ? "Interactive Article" : "Article");
        if (z2) {
            str3 = " : (" + str2 + ", " + str + ")";
        } else {
            str3 = "";
        }
        sb.append(str3);
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        h(sb2);
    }

    public final void n(Throwable th, String str, Uri uri, boolean z) {
        AppEvent unableToLoadArticle;
        if (z) {
            unableToLoadArticle = new AppEvent.Article.Error.UnableToLoadInteractive(th, str);
        } else {
            if (uri == null) {
                uri = Uri.EMPTY;
            }
            unableToLoadArticle = new AppEvent.Article.Error.UnableToLoadArticle(th, str, uri);
        }
        k(unableToLoadArticle);
        this.d = null;
    }

    public final void o() {
        PerformanceTracker.b bVar = this.d;
        if (bVar != null) {
            BasePerformanceTracker.j(this, bVar, null, 2, null);
            this.d = null;
        }
    }

    public final void p() {
        k(new AppEvent.Page.View(AssetConstants.ARTICLE_TYPE));
    }

    public final void q() {
        k(new AppEvent.Article.Error.CouldNotFetchPerformanceData());
    }

    public final void r(final WebView webView, final String str) {
        zq3.h(webView, "view");
        webView.evaluateJavascript("(function() {\n    if (!window.performance || !window.performance.timing) {\n        return [];\n    }\n    \n    var tti = window.performance.timing.domInteractive - window.performance.timing\n        .navigationStart;\n        \n    var fcp = null;\n    if (window.performance.getEntriesByName) {\n        var entries = performance.getEntriesByName(\"first-contentful-paint\");\n        if (entries[0]) {\n            fcp = entries[0].startTime;\n        }\n    }\n    \n    return [tti, fcp];\n    \n})()", new ValueCallback() { // from class: er
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                fr.t(fr.this, str, webView, (String) obj);
            }
        });
    }

    public final void s(String str, double d, Double d2) {
        zq3.h(str, "url");
        k(new AppEvent.Article.PerformanceData(str, d, d2));
    }
}
