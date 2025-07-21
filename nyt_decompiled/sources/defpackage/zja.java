package defpackage;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* loaded from: classes3.dex */
final class zja implements Runnable {
    final ValueCallback a;
    final /* synthetic */ rja b;
    final /* synthetic */ WebView c;
    final /* synthetic */ boolean d;
    final /* synthetic */ bka e;

    zja(bka bkaVar, final rja rjaVar, final WebView webView, final boolean z) {
        this.b = rjaVar;
        this.c = webView;
        this.d = z;
        this.e = bkaVar;
        this.a = new ValueCallback() { // from class: yja
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                zja.this.e.d(rjaVar, webView, (String) obj, z);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c.getSettings().getJavaScriptEnabled()) {
            try {
                this.c.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.a);
            } catch (Throwable unused) {
                this.a.onReceiveValue("");
            }
        }
    }
}
