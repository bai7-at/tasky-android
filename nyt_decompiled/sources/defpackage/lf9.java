package defpackage;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public class lf9 {
    public static final a Companion = new a(null);
    private final WebView a;
    private final List b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public lf9(WebView webView) {
        zq3.h(webView, "webView");
        this.a = webView;
        this.b = new ArrayList();
    }

    public final List a() {
        return this.b;
    }

    public final void b(kf9... kf9VarArr) {
        zq3.h(kf9VarArr, "webViewScript");
        i.C(this.b, kf9VarArr);
    }
}
