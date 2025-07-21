package defpackage;

import android.app.Application;
import android.webkit.WebView;
import com.nytimes.android.eventtracker.engine.JavascriptEngine;
import com.nytimes.android.eventtracker.engine.WebviewEngine;
import defpackage.rf9;

/* loaded from: classes4.dex */
public final class js3 {
    public static final js3 a = new js3();

    private js3() {
    }

    public final JavascriptEngine a(rf9 rf9Var, n01 n01Var) {
        zq3.h(rf9Var, "wrapper");
        zq3.h(n01Var, "coroutineDispatchers");
        return new WebviewEngine(rf9Var, n01Var);
    }

    public final rf9 b(Application application) {
        zq3.h(application, "context");
        rf9.a aVar = rf9.Companion;
        WebView webView = new WebView(application);
        webView.getSettings().setJavaScriptEnabled(true);
        return aVar.a(webView);
    }
}
