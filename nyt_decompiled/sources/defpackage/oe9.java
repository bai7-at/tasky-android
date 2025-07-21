package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.webkit.WebView;
import defpackage.lj;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes.dex */
public abstract class oe9 {
    private static final Uri a = Uri.parse("*");
    private static final Uri b = Uri.parse("");

    public interface a {
        void onPostMessage(WebView webView, td9 td9Var, Uri uri, boolean z, fs3 fs3Var);
    }

    public static void a(WebView webView, String str, Set set, a aVar) {
        if (!se9.U.c()) {
            throw se9.a();
        }
        g(webView).a(str, (String[]) set.toArray(new String[0]), aVar);
    }

    private static WebViewProviderBoundaryInterface b(WebView webView) {
        return e().createWebView(webView);
    }

    public static PackageInfo c() {
        return nj.a();
    }

    public static PackageInfo d(Context context) {
        PackageInfo c = c();
        return c != null ? c : f(context);
    }

    private static bf9 e() {
        return ye9.d();
    }

    private static PackageInfo f(Context context) {
        try {
            String str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    private static af9 g(WebView webView) {
        return new af9(b(webView));
    }

    public static void h(WebView webView, ef9 ef9Var) {
        lj.h hVar = se9.N;
        if (hVar.b()) {
            pj.e(webView, ef9Var);
        } else {
            if (!hVar.c()) {
                throw se9.a();
            }
            g(webView).b(null, ef9Var);
        }
    }
}
