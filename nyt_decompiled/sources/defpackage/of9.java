package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.webkit.WebView;

/* loaded from: classes4.dex */
public abstract class of9 {
    public static final void a(WebView webView, int i) {
        zq3.h(webView, "<this>");
        webView.flingScroll(0, 0);
        ObjectAnimator.ofInt(webView, (Property<WebView, Integer>) nf9.a.a(), i).setDuration(500L).start();
    }

    public static /* synthetic */ void b(WebView webView, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        a(webView, i);
    }
}
