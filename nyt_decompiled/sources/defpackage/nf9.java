package defpackage;

import android.util.Property;
import android.webkit.WebView;

/* loaded from: classes4.dex */
public final class nf9 {
    public static final nf9 a = new nf9();
    private static final Property b = new a(Integer.TYPE);

    public static final class a extends Property {
        a(Class cls) {
            super(cls, "scrollY");
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(WebView webView) {
            zq3.h(webView, "obj");
            return Integer.valueOf(webView.getScrollY());
        }

        public void b(WebView webView, int i) {
            zq3.h(webView, "obj");
            webView.scrollTo(webView.getScrollX(), i);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
            b((WebView) obj, ((Number) obj2).intValue());
        }
    }

    private nf9() {
    }

    public final Property a() {
        return b;
    }
}
