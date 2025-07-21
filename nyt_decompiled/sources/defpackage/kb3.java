package defpackage;

import android.webkit.WebView;

/* loaded from: classes2.dex */
public interface kb3 {

    public static final class a {
        public static /* synthetic */ void a(kb3 kb3Var, String str, String str2, String str3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initializeMalice");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            kb3Var.b(str, str2, str3);
        }
    }

    boolean a(WebView webView);

    void b(String str, String str2, String str3);

    void c(String str);
}
