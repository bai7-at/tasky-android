package com.nytimes.android.performancetrackerclientphoenix.monitor;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent;
import defpackage.du8;
import defpackage.vr6;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class a extends BroadcastReceiver implements b {
    public static final C0373a Companion = new C0373a(null);
    private final SharedPreferences a;
    private Float b;
    private float c;

    /* renamed from: com.nytimes.android.performancetrackerclientphoenix.monitor.a$a, reason: collision with other inner class name */
    public static final class C0373a {
        public /* synthetic */ C0373a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0373a() {
        }
    }

    public a(Application application, SharedPreferences sharedPreferences) {
        zq3.h(application, "context");
        zq3.h(sharedPreferences, "prefs");
        this.a = sharedPreferences;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        ww8 ww8Var = ww8.a;
        vr6.c(application, this, intentFilter, false, 4, null);
    }

    private final float d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra2 == 0) {
            return -1.0f;
        }
        return (intExtra * 100) / intExtra2;
    }

    private final boolean e() {
        return this.a.getBoolean("PerfBatteryIsCharging", false);
    }

    private final float f() {
        return this.a.getFloat("PerfBatteryLastKnownPercent", -1.0f);
    }

    private final boolean g(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // com.nytimes.android.performancetrackerclientphoenix.monitor.b
    public Map c() {
        return t.m(du8.a("batteryIsCharging", Boolean.valueOf(e())), du8.a("batteryLastPct", Float.valueOf(f())));
    }

    @Override // com.nytimes.android.performancetrackerclientphoenix.monitor.b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public AppEvent.Metric.DeltaBatteryLevel a() {
        float f = f();
        float f2 = f - this.c;
        Float f3 = this.b;
        AppEvent.Metric.DeltaBatteryLevel deltaBatteryLevel = new AppEvent.Metric.DeltaBatteryLevel(f2, f - (f3 != null ? f3.floatValue() : 0.0f), e());
        this.c = f;
        return deltaBatteryLevel;
    }

    @Override // com.nytimes.android.performancetrackerclientphoenix.monitor.b
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public AppEvent.Metric.BatteryLevel b() {
        return new AppEvent.Metric.BatteryLevel(e(), f());
    }

    public final void j(Intent intent) {
        zq3.h(intent, "batteryStatusIntent");
        boolean g = g(intent);
        float d = d(intent);
        if (this.b == null) {
            this.b = Float.valueOf(d);
        }
        SharedPreferences.Editor edit = this.a.edit();
        edit.putBoolean("PerfBatteryIsCharging", g);
        edit.putFloat("PerfBatteryLastKnownPercent", d);
        edit.apply();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            j(intent);
        }
    }
}
