package defpackage;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class pj {
    @Deprecated
    public static int a(WebSettings webSettings) {
        return webSettings.getForceDark();
    }

    public static WebViewRenderProcess b(WebView webView) {
        return webView.getWebViewRenderProcess();
    }

    public static WebViewRenderProcessClient c(WebView webView) {
        return webView.getWebViewRenderProcessClient();
    }

    @Deprecated
    public static void d(WebSettings webSettings, int i) {
        webSettings.setForceDark(i);
    }

    public static void e(WebView webView, ef9 ef9Var) {
        webView.setWebViewRenderProcessClient(ef9Var != null ? new gf9(ef9Var) : null);
    }

    public static void f(WebView webView, Executor executor, ef9 ef9Var) {
        webView.setWebViewRenderProcessClient(executor, ef9Var != null ? new gf9(ef9Var) : null);
    }

    public static boolean g(WebViewRenderProcess webViewRenderProcess) {
        return webViewRenderProcess.terminate();
    }
}
