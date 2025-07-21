package defpackage;

import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface;

/* loaded from: classes.dex */
public class ff9 implements WebViewRendererClientBoundaryInterface {
    private static final String[] c = {"WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"};
    private final Executor a;
    private final ef9 b;

    class a implements Runnable {
        final /* synthetic */ ef9 a;
        final /* synthetic */ WebView b;
        final /* synthetic */ df9 c;

        a(ef9 ef9Var, WebView webView, df9 df9Var) {
            this.a = ef9Var;
            this.b = webView;
            this.c = df9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.b(this.b, this.c);
        }
    }

    class b implements Runnable {
        final /* synthetic */ ef9 a;
        final /* synthetic */ WebView b;
        final /* synthetic */ df9 c;

        b(ef9 ef9Var, WebView webView, df9 df9Var) {
            this.a = ef9Var;
            this.b = webView;
            this.c = df9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(this.b, this.c);
        }
    }

    public ff9(Executor executor, ef9 ef9Var) {
        this.a = executor;
        this.b = ef9Var;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return c;
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererResponsive(WebView webView, InvocationHandler invocationHandler) {
        hf9 b2 = hf9.b(invocationHandler);
        ef9 ef9Var = this.b;
        Executor executor = this.a;
        if (executor == null) {
            ef9Var.a(webView, b2);
        } else {
            executor.execute(new b(ef9Var, webView, b2));
        }
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererUnresponsive(WebView webView, InvocationHandler invocationHandler) {
        hf9 b2 = hf9.b(invocationHandler);
        ef9 ef9Var = this.b;
        Executor executor = this.a;
        if (executor == null) {
            ef9Var.b(webView, b2);
        } else {
            executor.execute(new a(ef9Var, webView, b2));
        }
    }
}
