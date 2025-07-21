package defpackage;

import android.webkit.WebView;

/* loaded from: classes4.dex */
public final class fz8 {
    private final String a;
    private final WebView b;

    public fz8(String str, WebView webView) {
        zq3.h(str, "url");
        zq3.h(webView, "webView");
        this.a = str;
        this.b = webView;
    }

    public final String a() {
        return this.a;
    }

    public final WebView b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz8)) {
            return false;
        }
        fz8 fz8Var = (fz8) obj;
        return zq3.c(this.a, fz8Var.a) && zq3.c(this.b, fz8Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "UrlOpenerData(url=" + this.a + ", webView=" + this.b + ")";
    }
}
