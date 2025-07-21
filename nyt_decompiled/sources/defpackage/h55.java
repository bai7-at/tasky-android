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
public final class h55 extends BroadcastReceiver {
    private final Application a;
    private final ConnectivityManager b;
    private final WifiManager c;
    private final BehaviorSubject d;

    public h55(Application application) {
        zq3.h(application, "context");
        this.a = application;
        Object systemService = application.getSystemService("connectivity");
        zq3.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.b = (ConnectivityManager) systemService;
        Object systemService2 = application.getSystemService("wifi");
        zq3.f(systemService2, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        this.c = (WifiManager) systemService2;
        BehaviorSubject create = BehaviorSubject.create();
        zq3.g(create, "create(...)");
        this.d = create;
    }

    public final boolean a() {
        return b();
    }

    public final boolean b() {
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.isConnected();
        }
        return false;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        zq3.h(context, "context");
        zq3.h(intent, "intent");
        this.d.onNext(Boolean.valueOf(a()));
    }
}
