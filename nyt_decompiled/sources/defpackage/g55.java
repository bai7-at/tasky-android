package defpackage;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import io.reactivex.subjects.BehaviorSubject;

/* loaded from: classes4.dex */
public final class g55 extends BroadcastReceiver {
    private final ConnectivityManager a;
    private final WifiManager b;
    private final BehaviorSubject c;

    public g55(Application application) {
        zq3.h(application, "context");
        Object systemService = application.getSystemService("connectivity");
        zq3.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.a = (ConnectivityManager) systemService;
        Object systemService2 = application.getSystemService("wifi");
        zq3.f(systemService2, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        this.b = (WifiManager) systemService2;
        BehaviorSubject create = BehaviorSubject.create();
        zq3.g(create, "create(...)");
        this.c = create;
    }

    private final boolean e(NetworkInfo networkInfo) {
        return networkInfo.getType() == 1 && WifiManager.calculateSignalLevel(this.b.getConnectionInfo().getRssi(), 4) > 0;
    }

    public final boolean a() {
        return c();
    }

    public final boolean b() {
        NetworkInfo activeNetworkInfo = this.a.getActiveNetworkInfo();
        return (activeNetworkInfo == null || activeNetworkInfo.getSubtype() == 7 || activeNetworkInfo.getSubtype() == 2) ? false : true;
    }

    public final boolean c() {
        NetworkInfo activeNetworkInfo = this.a.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.isConnected();
        }
        return false;
    }

    public final boolean d() {
        NetworkInfo activeNetworkInfo = this.a.getActiveNetworkInfo();
        return activeNetworkInfo != null && e(activeNetworkInfo);
    }

    public final boolean f() {
        NetworkInfo activeNetworkInfo = this.a.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.getType() == 1;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        zq3.h(context, "context");
        zq3.h(intent, "intent");
        this.c.onNext(Boolean.valueOf(a()));
    }
}
