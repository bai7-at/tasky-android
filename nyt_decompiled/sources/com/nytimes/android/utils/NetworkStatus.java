package com.nytimes.android.utils;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import com.nytimes.android.utils.NetworkStatus;
import defpackage.ss2;
import defpackage.zq3;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.subjects.BehaviorSubject;

/* loaded from: classes4.dex */
public final class NetworkStatus extends BroadcastReceiver {
    private final Application a;
    private final ConnectivityManager b;
    private final WifiManager c;
    private final BehaviorSubject d;

    public NetworkStatus(Application application) {
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

    private final String f(NetworkInfo networkInfo) {
        String typeName;
        String str;
        if (networkInfo.getType() == 0) {
            typeName = networkInfo.getSubtypeName();
            str = "getSubtypeName(...)";
        } else {
            typeName = networkInfo.getTypeName();
            str = "getTypeName(...)";
        }
        zq3.g(typeName, str);
        return typeName;
    }

    private final boolean k(NetworkInfo networkInfo) {
        return networkInfo.getType() == 1 && WifiManager.calculateSignalLevel(this.c.getConnectionInfo().getRssi(), 4) > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return ((Boolean) ss2Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object p(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return ((Boolean) ss2Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object s(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return ss2Var.invoke(obj);
    }

    public final String e() {
        String f;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        return (activeNetworkInfo == null || (f = f(activeNetworkInfo)) == null) ? "None" : f;
    }

    public final boolean g() {
        return i();
    }

    public final boolean h() {
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        return (activeNetworkInfo == null || activeNetworkInfo.getSubtype() == 7 || activeNetworkInfo.getSubtype() == 2) ? false : true;
    }

    public final boolean i() {
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.isConnected();
        }
        return false;
    }

    public final boolean j() {
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        return activeNetworkInfo != null && k(activeNetworkInfo);
    }

    public final boolean l() {
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.getType() == 1;
    }

    public final Observable m() {
        Observable<T> distinctUntilChanged = this.d.distinctUntilChanged();
        zq3.g(distinctUntilChanged, "distinctUntilChanged(...)");
        return distinctUntilChanged;
    }

    public final Observable n() {
        Observable m = m();
        final NetworkStatus$onConnect$1 networkStatus$onConnect$1 = new ss2() { // from class: com.nytimes.android.utils.NetworkStatus$onConnect$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Boolean bool) {
                zq3.h(bool, "connected");
                return bool;
            }
        };
        Observable filter = m.filter(new Predicate() { // from class: b55
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean o;
                o = NetworkStatus.o(ss2.this, obj);
                return o;
            }
        });
        final NetworkStatus$onConnect$2 networkStatus$onConnect$2 = new ss2() { // from class: com.nytimes.android.utils.NetworkStatus$onConnect$2
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Boolean bool) {
                zq3.h(bool, "it");
                return new Object();
            }
        };
        Observable map = filter.map(new Function() { // from class: c55
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Object p;
                p = NetworkStatus.p(ss2.this, obj);
                return p;
            }
        });
        zq3.g(map, "map(...)");
        return map;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        zq3.h(context, "context");
        zq3.h(intent, "intent");
        this.d.onNext(Boolean.valueOf(g()));
    }

    public final Observable q() {
        Observable m = m();
        final NetworkStatus$onDisconnect$1 networkStatus$onDisconnect$1 = new ss2() { // from class: com.nytimes.android.utils.NetworkStatus$onDisconnect$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Boolean bool) {
                zq3.h(bool, "connected");
                return Boolean.valueOf(!bool.booleanValue());
            }
        };
        Observable filter = m.filter(new Predicate() { // from class: d55
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean r;
                r = NetworkStatus.r(ss2.this, obj);
                return r;
            }
        });
        final NetworkStatus$onDisconnect$2 networkStatus$onDisconnect$2 = new ss2() { // from class: com.nytimes.android.utils.NetworkStatus$onDisconnect$2
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Boolean bool) {
                zq3.h(bool, "it");
                return new Object();
            }
        };
        Observable map = filter.map(new Function() { // from class: e55
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Object s;
                s = NetworkStatus.s(ss2.this, obj);
                return s;
            }
        });
        zq3.g(map, "map(...)");
        return map;
    }
}
