package defpackage;

import android.content.SharedPreferences;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.readerhybrid.HybridConfigManager;
import com.nytimes.android.readerhybrid.HybridWebView;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public abstract class xd3 implements op4 {
    public static void a(HybridWebView hybridWebView, qe9 qe9Var) {
        hybridWebView.darkModeManager = qe9Var;
    }

    public static void b(HybridWebView hybridWebView, ET2Scope eT2Scope) {
        hybridWebView.et2Scope = eT2Scope;
    }

    public static void c(HybridWebView hybridWebView, HybridConfigManager hybridConfigManager) {
        hybridWebView.hybridConfigManager = hybridConfigManager;
    }

    public static void d(HybridWebView hybridWebView, sd3 sd3Var) {
        hybridWebView.hybridWebViewConfigurer = sd3Var;
    }

    public static void e(HybridWebView hybridWebView, CoroutineDispatcher coroutineDispatcher) {
        hybridWebView.ioDispatcher = coroutineDispatcher;
    }

    public static void f(HybridWebView hybridWebView, y15 y15Var) {
        hybridWebView.nativeBridgeFactory = y15Var;
    }

    public static void g(HybridWebView hybridWebView, SharedPreferences sharedPreferences) {
        hybridWebView.prefs = sharedPreferences;
    }
}
