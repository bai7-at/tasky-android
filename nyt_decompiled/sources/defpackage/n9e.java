package defpackage;

import android.webkit.WebView;

/* loaded from: classes3.dex */
final class n9e implements Runnable {
    private final WebView a;
    final /* synthetic */ o9e b;

    n9e(o9e o9eVar) {
        WebView webView;
        this.b = o9eVar;
        webView = o9eVar.d;
        this.a = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.destroy();
    }
}
