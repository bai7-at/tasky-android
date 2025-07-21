package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.webkit.WebView;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class pe9 {
    public static final a Companion = new a(null);
    public static final int b = 8;
    private final Map a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public pe9(Activity activity) {
        zq3.h(activity, "activity");
        this.a = t.f(du8.a("NYT-App-Type", activity.getString(yl6.webview_header_app_type)));
    }

    private final String a(String str) {
        Uri parse = Uri.parse(str);
        if (zq3.c(parse.getQueryParameter("hide-chrome"), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
            return str;
        }
        String uri = parse.buildUpon().appendQueryParameter("hide-chrome", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE).build().toString();
        zq3.e(uri);
        return uri;
    }

    public final void b(WebView webView, String str) {
        zq3.h(webView, "view");
        zq3.h(str, "url");
        webView.loadUrl(a(h.v0(str, "nytimes://")), this.a);
    }
}
