package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzcl;
import defpackage.bne;
import defpackage.d6f;
import defpackage.n1a;
import defpackage.slf;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.DebugKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a5 implements w5 {
    private static volatile a5 H;
    private volatile Boolean A;
    protected Boolean B;
    protected Boolean C;
    private volatile boolean D;
    private int E;
    final long G;
    private final Context a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;
    private final c f;
    private final g g;
    private final k4 h;
    private final x3 i;
    private final y4 j;
    private final b9 k;
    private final x9 l;
    private final r3 m;
    private final Clock n;
    private final m7 o;
    private final z6 p;
    private final y1 q;
    private final c7 r;
    private final String s;
    private q3 t;
    private m8 u;
    private o v;
    private o3 w;
    private Boolean y;
    private long z;
    private boolean x = false;
    private final AtomicInteger F = new AtomicInteger(0);

    a5(y5 y5Var) {
        Bundle bundle;
        Preconditions.checkNotNull(y5Var);
        Context context = y5Var.a;
        c cVar = new c(context);
        this.f = cVar;
        k3.a = cVar;
        this.a = context;
        this.b = y5Var.b;
        this.c = y5Var.c;
        this.d = y5Var.d;
        this.e = y5Var.h;
        this.A = y5Var.e;
        this.s = y5Var.j;
        this.D = true;
        zzcl zzclVar = y5Var.g;
        if (zzclVar != null && (bundle = zzclVar.zzg) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.B = (Boolean) obj;
            }
            Object obj2 = zzclVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.C = (Boolean) obj2;
            }
        }
        d6f.e(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.n = defaultClock;
        Long l = y5Var.i;
        this.G = l != null ? l.longValue() : defaultClock.currentTimeMillis();
        this.g = new g(this);
        k4 k4Var = new k4(this);
        k4Var.h();
        this.h = k4Var;
        x3 x3Var = new x3(this);
        x3Var.h();
        this.i = x3Var;
        x9 x9Var = new x9(this);
        x9Var.h();
        this.l = x9Var;
        this.m = new r3(new x5(y5Var, this));
        this.q = new y1(this);
        m7 m7Var = new m7(this);
        m7Var.f();
        this.o = m7Var;
        z6 z6Var = new z6(this);
        z6Var.f();
        this.p = z6Var;
        b9 b9Var = new b9(this);
        b9Var.f();
        this.k = b9Var;
        c7 c7Var = new c7(this);
        c7Var.h();
        this.r = c7Var;
        y4 y4Var = new y4(this);
        y4Var.h();
        this.j = y4Var;
        zzcl zzclVar2 = y5Var.g;
        boolean z = zzclVar2 == null || zzclVar2.zzb == 0;
        if (context.getApplicationContext() instanceof Application) {
            z6 H2 = H();
            if (H2.a.a.getApplicationContext() instanceof Application) {
                Application application = (Application) H2.a.a.getApplicationContext();
                if (H2.c == null) {
                    H2.c = new y6(H2, null);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(H2.c);
                    application.registerActivityLifecycleCallbacks(H2.c);
                    H2.a.o().u().a("Registered activity lifecycle callback");
                }
            }
        } else {
            o().v().a("Application context is not an Application");
        }
        y4Var.y(new z4(this, y5Var));
    }

    public static a5 G(Context context, zzcl zzclVar, Long l) {
        Bundle bundle;
        if (zzclVar != null && (zzclVar.zze == null || zzclVar.zzf == null)) {
            zzclVar = new zzcl(zzclVar.zza, zzclVar.zzb, zzclVar.zzc, zzclVar.zzd, null, null, zzclVar.zzg, null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (H == null) {
            synchronized (a5.class) {
                try {
                    if (H == null) {
                        H = new a5(new y5(context, zzclVar, l));
                    }
                } finally {
                }
            }
        } else if (zzclVar != null && (bundle = zzclVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.checkNotNull(H);
            H.A = Boolean.valueOf(zzclVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(H);
        return H;
    }

    static /* bridge */ /* synthetic */ void a(a5 a5Var, y5 y5Var) {
        a5Var.e().c();
        a5Var.g.v();
        o oVar = new o(a5Var);
        oVar.h();
        a5Var.v = oVar;
        o3 o3Var = new o3(a5Var, y5Var.f);
        o3Var.f();
        a5Var.w = o3Var;
        q3 q3Var = new q3(a5Var);
        q3Var.f();
        a5Var.t = q3Var;
        m8 m8Var = new m8(a5Var);
        m8Var.f();
        a5Var.u = m8Var;
        a5Var.l.i();
        a5Var.h.i();
        a5Var.w.g();
        u3 t = a5Var.o().t();
        a5Var.g.m();
        t.b("App measurement initialized, version", 64000L);
        a5Var.o().t().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String r = o3Var.r();
        if (TextUtils.isEmpty(a5Var.b)) {
            if (a5Var.M().S(r)) {
                a5Var.o().t().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                a5Var.o().t().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(r)));
            }
        }
        a5Var.o().m().a("Debug-level message logging enabled");
        if (a5Var.E != a5Var.F.get()) {
            a5Var.o().n().c("Not all components initialized", Integer.valueOf(a5Var.E), Integer.valueOf(a5Var.F.get()));
        }
        a5Var.x = true;
    }

    static final void s() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void t(u5 u5Var) {
        if (u5Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void u(w3 w3Var) {
        if (w3Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!w3Var.i()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(w3Var.getClass())));
        }
    }

    private static final void v(v5 v5Var) {
        if (v5Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!v5Var.j()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(v5Var.getClass())));
        }
    }

    public final o3 A() {
        u(this.w);
        return this.w;
    }

    public final q3 B() {
        u(this.t);
        return this.t;
    }

    public final r3 C() {
        return this.m;
    }

    public final x3 D() {
        x3 x3Var = this.i;
        if (x3Var == null || !x3Var.j()) {
            return null;
        }
        return x3Var;
    }

    public final k4 E() {
        t(this.h);
        return this.h;
    }

    final y4 F() {
        return this.j;
    }

    public final z6 H() {
        u(this.p);
        return this.p;
    }

    public final c7 I() {
        v(this.r);
        return this.r;
    }

    public final m7 J() {
        u(this.o);
        return this.o;
    }

    public final m8 K() {
        u(this.u);
        return this.u;
    }

    public final b9 L() {
        u(this.k);
        return this.k;
    }

    public final x9 M() {
        t(this.l);
        return this.l;
    }

    public final String N() {
        return this.b;
    }

    public final String O() {
        return this.c;
    }

    public final String P() {
        return this.d;
    }

    public final String Q() {
        return this.s;
    }

    final void b() {
        this.F.incrementAndGet();
    }

    final /* synthetic */ void c(String str, int i, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        if (i != 200 && i != 204) {
            if (i == 304) {
                i = 304;
            }
            o().v().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
        }
        if (th == null) {
            E().r.a(true);
            if (bArr == null || bArr.length == 0) {
                o().m().a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                if (TextUtils.isEmpty(optString)) {
                    o().m().a("Deferred Deep Link is empty.");
                    return;
                }
                x9 M = M();
                a5 a5Var = M.a;
                if (!TextUtils.isEmpty(optString) && (queryIntentActivities = M.a.a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) != null && !queryIntentActivities.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putString("gclid", optString2);
                    bundle.putString("_cis", "ddp");
                    this.p.u(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_cmp", bundle);
                    x9 M2 = M();
                    if (TextUtils.isEmpty(optString)) {
                        return;
                    }
                    try {
                        SharedPreferences.Editor edit = M2.a.a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                        edit.putString("deeplink", optString);
                        edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                        if (edit.commit()) {
                            M2.a.a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                            return;
                        }
                        return;
                    } catch (RuntimeException e) {
                        M2.a.o().n().b("Failed to persist Deferred Deep Link. exception", e);
                        return;
                    }
                }
                o().v().c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            } catch (JSONException e2) {
                o().n().b("Failed to parse the Deferred Deep Link response. exception", e2);
                return;
            }
        }
        o().v().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
    }

    final void d() {
        this.E++;
    }

    @Override // com.google.android.gms.measurement.internal.w5
    public final y4 e() {
        v(this.j);
        return this.j;
    }

    public final void f() {
        e().c();
        v(I());
        String r = A().r();
        Pair l = E().l(r);
        if (!this.g.z() || ((Boolean) l.second).booleanValue() || TextUtils.isEmpty((CharSequence) l.first)) {
            o().m().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        c7 I = I();
        I.g();
        ConnectivityManager connectivityManager = (ConnectivityManager) I.a.a.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            o().v().a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        x9 M = M();
        A().a.g.m();
        URL r2 = M.r(64000L, r, (String) l.first, (-1) + E().s.a());
        if (r2 != null) {
            c7 I2 = I();
            bne bneVar = new bne(this);
            I2.c();
            I2.g();
            Preconditions.checkNotNull(r2);
            Preconditions.checkNotNull(bneVar);
            I2.a.e().x(new b7(I2, r, r2, null, null, bneVar, null));
        }
    }

    final void g(boolean z) {
        this.A = Boolean.valueOf(z);
    }

    public final void h(boolean z) {
        e().c();
        this.D = z;
    }

    protected final void i(zzcl zzclVar) {
        n1a n1aVar;
        e().c();
        n1a m = E().m();
        k4 E = E();
        a5 a5Var = E.a;
        E.c();
        int i = 100;
        int i2 = E.k().getInt("consent_source", 100);
        g gVar = this.g;
        a5 a5Var2 = gVar.a;
        Boolean s = gVar.s("google_analytics_default_allow_ad_storage");
        g gVar2 = this.g;
        a5 a5Var3 = gVar2.a;
        Boolean s2 = gVar2.s("google_analytics_default_allow_analytics_storage");
        if (!(s == null && s2 == null) && E().v(-10)) {
            n1aVar = new n1a(s, s2);
            i = -10;
        } else {
            if (!TextUtils.isEmpty(A().s()) && (i2 == 0 || i2 == 30 || i2 == 10 || i2 == 30 || i2 == 30 || i2 == 40)) {
                H().G(n1a.b, -10, this.G);
            } else if (TextUtils.isEmpty(A().s()) && zzclVar != null && zzclVar.zzg != null && E().v(30)) {
                n1aVar = n1a.a(zzclVar.zzg);
                if (!n1aVar.equals(n1a.b)) {
                    i = 30;
                }
            }
            n1aVar = null;
        }
        if (n1aVar != null) {
            H().G(n1aVar, i, this.G);
            m = n1aVar;
        }
        H().K(m);
        if (E().e.a() == 0) {
            o().u().b("Persisting first open", Long.valueOf(this.G));
            E().e.b(this.G);
        }
        H().n.c();
        if (n()) {
            if (!TextUtils.isEmpty(A().s()) || !TextUtils.isEmpty(A().n())) {
                x9 M = M();
                String s3 = A().s();
                k4 E2 = E();
                E2.c();
                String string = E2.k().getString("gmp_app_id", null);
                String n = A().n();
                k4 E3 = E();
                E3.c();
                if (M.a0(s3, string, n, E3.k().getString("admob_app_id", null))) {
                    o().t().a("Rechecking which service to use due to a GMP App Id change");
                    k4 E4 = E();
                    E4.c();
                    Boolean n2 = E4.n();
                    SharedPreferences.Editor edit = E4.k().edit();
                    edit.clear();
                    edit.apply();
                    if (n2 != null) {
                        E4.r(n2);
                    }
                    B().m();
                    this.u.P();
                    this.u.O();
                    E().e.b(this.G);
                    E().g.b(null);
                }
                k4 E5 = E();
                String s4 = A().s();
                E5.c();
                SharedPreferences.Editor edit2 = E5.k().edit();
                edit2.putString("gmp_app_id", s4);
                edit2.apply();
                k4 E6 = E();
                String n3 = A().n();
                E6.c();
                SharedPreferences.Editor edit3 = E6.k().edit();
                edit3.putString("admob_app_id", n3);
                edit3.apply();
            }
            if (!E().m().i(zzah.ANALYTICS_STORAGE)) {
                E().g.b(null);
            }
            H().C(E().g.a());
            slf.b();
            if (this.g.A(null, m3.f0)) {
                try {
                    M().a.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(E().t.a())) {
                        o().v().a("Remote config removed with active feature rollouts");
                        E().t.b(null);
                    }
                }
            }
            if (!TextUtils.isEmpty(A().s()) || !TextUtils.isEmpty(A().n())) {
                boolean k = k();
                if (!E().t() && !this.g.D()) {
                    E().s(!k);
                }
                if (k) {
                    H().h0();
                }
                L().d.a();
                K().R(new AtomicReference());
                K().u(E().w.a());
            }
        } else if (k()) {
            if (!M().R("android.permission.INTERNET")) {
                o().n().a("App is missing INTERNET permission");
            }
            if (!M().R("android.permission.ACCESS_NETWORK_STATE")) {
                o().n().a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!Wrappers.packageManager(this.a).isCallerInstantApp() && !this.g.F()) {
                if (!x9.X(this.a)) {
                    o().n().a("AppMeasurementReceiver not registered/enabled");
                }
                if (!x9.Y(this.a, false)) {
                    o().n().a("AppMeasurementService not registered/enabled");
                }
            }
            o().n().a("Uploading is not possible. App measurement disabled");
        }
        E().n.a(true);
    }

    public final boolean j() {
        return this.A != null && this.A.booleanValue();
    }

    public final boolean k() {
        return w() == 0;
    }

    public final boolean l() {
        e().c();
        return this.D;
    }

    public final boolean m() {
        return TextUtils.isEmpty(this.b);
    }

    protected final boolean n() {
        if (!this.x) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        e().c();
        Boolean bool = this.y;
        if (bool == null || this.z == 0 || (!bool.booleanValue() && Math.abs(this.n.elapsedRealtime() - this.z) > 1000)) {
            this.z = this.n.elapsedRealtime();
            boolean z = true;
            Boolean valueOf = Boolean.valueOf(M().R("android.permission.INTERNET") && M().R("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.a).isCallerInstantApp() || this.g.F() || (x9.X(this.a) && x9.Y(this.a, false))));
            this.y = valueOf;
            if (valueOf.booleanValue()) {
                if (!M().K(A().s(), A().n()) && TextUtils.isEmpty(A().n())) {
                    z = false;
                }
                this.y = Boolean.valueOf(z);
            }
        }
        return this.y.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.w5
    public final x3 o() {
        v(this.i);
        return this.i;
    }

    @Override // com.google.android.gms.measurement.internal.w5
    public final Clock p() {
        return this.n;
    }

    @Override // com.google.android.gms.measurement.internal.w5
    public final c q() {
        return this.f;
    }

    public final boolean r() {
        return this.e;
    }

    public final int w() {
        e().c();
        if (this.g.D()) {
            return 1;
        }
        Boolean bool = this.C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        e().c();
        if (!this.D) {
            return 8;
        }
        Boolean n = E().n();
        if (n != null) {
            return n.booleanValue() ? 0 : 3;
        }
        g gVar = this.g;
        c cVar = gVar.a.f;
        Boolean s = gVar.s("firebase_analytics_collection_enabled");
        if (s != null) {
            return s.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.B;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.A == null || this.A.booleanValue()) ? 0 : 7;
    }

    public final y1 x() {
        y1 y1Var = this.q;
        if (y1Var != null) {
            return y1Var;
        }
        throw new IllegalStateException("Component not created");
    }

    public final g y() {
        return this.g;
    }

    public final o z() {
        v(this.v);
        return this.v;
    }

    @Override // com.google.android.gms.measurement.internal.w5
    public final Context zzau() {
        return this.a;
    }
}
