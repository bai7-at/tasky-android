package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;

/* loaded from: classes4.dex */
public final class mf9 {
    public static final mf9 a = new mf9();

    private mf9() {
    }

    public static final String a(String str) {
        zq3.h(str, "url");
        String encodedFragment = Uri.parse(str).getEncodedFragment();
        return encodedFragment == null ? "" : encodedFragment;
    }

    public static final void b(WebView webView, String str) {
        zq3.h(webView, "webView");
        zq3.h(str, "toAnchor");
        webView.loadUrl("javascript:document.getElementById('" + str + "').scrollIntoView()");
    }

    public static final void c(Fragment fragment, String str, WebView webView) {
        String str2;
        zq3.h(fragment, "fragment");
        zq3.h(str, "argKey");
        zq3.h(webView, "webView");
        if (fragment.getArguments() != null) {
            Bundle arguments = fragment.getArguments();
            if (arguments == null || (str2 = arguments.getString(str)) == null) {
                str2 = "";
            }
            if (str2.length() > 0) {
                b(webView, a(str2));
            }
        }
    }
}
