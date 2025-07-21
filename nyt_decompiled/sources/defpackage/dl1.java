package defpackage;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.facebook.AuthenticationTokenClaims;

/* loaded from: classes4.dex */
public final class dl1 implements rf9 {
    private final WebView a;

    public dl1(WebView webView) {
        zq3.h(webView, "webview");
        this.a = webView;
        WebView.setWebContentsDebuggingEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(ss2 ss2Var, String str) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(str);
    }

    @Override // defpackage.rf9
    public void a(Object obj, String str) {
        zq3.h(obj, "obj");
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        this.a.addJavascriptInterface(obj, str);
    }

    @Override // defpackage.rf9
    public void b(String str) {
        zq3.h(str, "script");
        this.a.loadDataWithBaseURL("", str, "text/html; charset=utf-8", "base64", null);
    }

    @Override // defpackage.rf9
    public void c(String str, final ss2 ss2Var) {
        zq3.h(str, "script");
        zq3.h(ss2Var, "callback");
        this.a.evaluateJavascript(str, new ValueCallback() { // from class: cl1
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                dl1.e(ss2.this, (String) obj);
            }
        });
    }
}
