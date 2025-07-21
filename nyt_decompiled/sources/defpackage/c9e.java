package defpackage;

import android.webkit.WebView;

/* loaded from: classes3.dex */
final class c9e implements Runnable {
    final /* synthetic */ WebView a;
    final /* synthetic */ String b;
    final /* synthetic */ d9e c;

    c9e(d9e d9eVar, WebView webView, String str) {
        this.a = webView;
        this.b = str;
        this.c = d9eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d9e.i(this.a, this.b);
    }
}
