package defpackage;

import android.app.Application;
import android.net.ConnectivityManager;
import com.squareup.moshi.i;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlinx.coroutines.flow.SharedFlow;

/* loaded from: classes4.dex */
public final class m43 {
    public final ConnectivityManager a(Application application) {
        zq3.h(application, "application");
        Object systemService = application.getSystemService("connectivity");
        zq3.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return (ConnectivityManager) systemService;
    }

    public final t53 b(Set set) {
        zq3.h(set, "themes");
        t53 t53Var = (t53) i.l0(set);
        if (t53Var != null) {
            return t53Var;
        }
        return new t53(null, null, null, 7, null);
    }

    public final Set c() {
        return b0.e();
    }

    public final p60 d(ConnectivityManager connectivityManager) {
        zq3.h(connectivityManager, "connectivityManager");
        return new p60(connectivityManager);
    }

    public final SharedFlow e(t43 t43Var) {
        zq3.h(t43Var, "growthUIAuth");
        return t43Var.b();
    }

    public final com.squareup.moshi.i f() {
        com.squareup.moshi.i d = new i.b().d();
        zq3.g(d, "build(...)");
        return d;
    }
}
