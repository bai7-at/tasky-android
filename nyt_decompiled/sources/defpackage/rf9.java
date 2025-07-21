package defpackage;

import android.webkit.WebView;

/* loaded from: classes4.dex */
public interface rf9 {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final rf9 a(WebView webView) {
            zq3.h(webView, "webview");
            return new dl1(webView);
        }
    }

    void a(Object obj, String str);

    void b(String str);

    void c(String str, ss2 ss2Var);
}
