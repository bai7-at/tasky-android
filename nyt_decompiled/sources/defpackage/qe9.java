package defpackage;

import android.webkit.WebView;

/* loaded from: classes4.dex */
public final class qe9 {
    private final j65 a;

    public qe9(j65 j65Var) {
        zq3.h(j65Var, "nightModeProvider");
        this.a = j65Var;
    }

    public final void a(WebView webView) {
        zq3.h(webView, "webView");
        if (this.a.b() && re9.a("ALGORITHMIC_DARKENING")) {
            ge9.b(webView.getSettings(), false);
        }
    }
}
