package defpackage;

import android.app.Activity;
import com.nytimes.android.readerhybrid.MainWebViewClient;
import com.nytimes.android.utils.snackbar.SnackbarUtil;

/* loaded from: classes4.dex */
public abstract class je4 implements op4 {
    public static void a(MainWebViewClient mainWebViewClient, Activity activity) {
        mainWebViewClient.context = activity;
    }

    public static void b(MainWebViewClient mainWebViewClient, ld1 ld1Var) {
        mainWebViewClient.deepLinkUtils = ld1Var;
    }

    public static void c(MainWebViewClient mainWebViewClient, ic3 ic3Var) {
        mainWebViewClient.hybridLinkHandler = ic3Var;
    }

    public static void d(MainWebViewClient mainWebViewClient, hd3 hd3Var) {
        mainWebViewClient.hybridPerformanceTracker = hd3Var;
    }

    public static void e(MainWebViewClient mainWebViewClient, uy3 uy3Var) {
        mainWebViewClient.launchProductLandingHelper = uy3Var;
    }

    public static void f(MainWebViewClient mainWebViewClient, SnackbarUtil snackbarUtil) {
        mainWebViewClient.snackbarUtil = snackbarUtil;
    }

    public static void g(MainWebViewClient mainWebViewClient, pe9 pe9Var) {
        mainWebViewClient.webViewCustomHeaders = pe9Var;
    }

    public static void h(MainWebViewClient mainWebViewClient, if9 if9Var) {
        mainWebViewClient.webViewRequestInterceptor = if9Var;
    }
}
