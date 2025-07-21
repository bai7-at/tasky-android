package defpackage;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class mc7 {
    private final List a = new ArrayList();

    public final void a(WebView webView) {
        if (webView == null) {
            return;
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            webView.evaluateJavascript((String) it2.next(), null);
        }
    }
}
