package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.n1a;

/* loaded from: classes3.dex */
final class k4 extends v5 {
    static final Pair x = new Pair("", 0L);
    private SharedPreferences c;
    public i4 d;
    public final h4 e;
    public final h4 f;
    public final j4 g;
    private String h;
    private boolean i;
    private long j;
    public final h4 k;
    public final f4 l;
    public final j4 m;
    public final f4 n;
    public final h4 o;
    public boolean p;
    public final f4 q;
    public final f4 r;
    public final h4 s;
    public final j4 t;
    public final j4 u;
    public final h4 v;
    public final g4 w;

    k4(a5 a5Var) {
        super(a5Var);
        this.k = new h4(this, "session_timeout", 1800000L);
        this.l = new f4(this, "start_new_session", true);
        this.o = new h4(this, "last_pause_time", 0L);
        this.m = new j4(this, "non_personalized_ads", null);
        this.n = new f4(this, "allow_remote_dynamite", false);
        this.e = new h4(this, "first_open_time", 0L);
        this.f = new h4(this, "app_install_time", 0L);
        this.g = new j4(this, "app_instance_id", null);
        this.q = new f4(this, "app_backgrounded", false);
        this.r = new f4(this, "deep_link_retrieval_complete", false);
        this.s = new h4(this, "deep_link_retrieval_attempts", 0L);
        this.t = new j4(this, "firebase_feature_rollouts", null);
        this.u = new j4(this, "deferred_attribution_cache", null);
        this.v = new h4(this, "deferred_attribution_cache_timestamp", 0L);
        this.w = new g4(this, "default_event_parameters", null);
    }

    @Override // com.google.android.gms.measurement.internal.v5
    protected final void d() {
        SharedPreferences sharedPreferences = this.a.zzau().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.c = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.p = z;
        if (!z) {
            SharedPreferences.Editor edit = this.c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.a.y();
        this.d = new i4(this, "health_monitor", Math.max(0L, ((Long) m3.d.a(null)).longValue()), null);
    }

    @Override // com.google.android.gms.measurement.internal.v5
    protected final boolean f() {
        return true;
    }

    protected final SharedPreferences k() {
        c();
        g();
        Preconditions.checkNotNull(this.c);
        return this.c;
    }

    final Pair l(String str) {
        c();
        long elapsedRealtime = this.a.p().elapsedRealtime();
        String str2 = this.h;
        if (str2 != null && elapsedRealtime < this.j) {
            return new Pair(str2, Boolean.valueOf(this.i));
        }
        this.j = elapsedRealtime + this.a.y().n(str, m3.c);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.a.zzau());
            this.h = "";
            String id = advertisingIdInfo.getId();
            if (id != null) {
                this.h = id;
            }
            this.i = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e) {
            this.a.o().m().b("Unable to get advertising id", e);
            this.h = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(this.h, Boolean.valueOf(this.i));
    }

    final n1a m() {
        c();
        return n1a.b(k().getString("consent_settings", "G1"));
    }

    final Boolean n() {
        c();
        if (k().contains("measurement_enabled")) {
            return Boolean.valueOf(k().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    final void r(Boolean bool) {
        c();
        SharedPreferences.Editor edit = k().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    final void s(boolean z) {
        c();
        this.a.o().u().b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = k().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    final boolean t() {
        SharedPreferences sharedPreferences = this.c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    final boolean u(long j) {
        return j - this.k.a() > this.o.a();
    }

    final boolean v(int i) {
        return n1a.j(i, k().getInt("consent_source", 100));
    }
}
