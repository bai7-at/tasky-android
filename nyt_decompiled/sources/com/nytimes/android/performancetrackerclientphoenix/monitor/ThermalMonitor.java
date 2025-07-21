package com.nytimes.android.performancetrackerclientphoenix.monitor;

import android.content.SharedPreferences;
import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent;
import com.nytimes.android.performancetrackerclientphoenix.monitor.b;
import defpackage.du8;
import defpackage.ss2;
import defpackage.wk8;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class ThermalMonitor implements b {
    public static final a Companion = new a(null);
    private final SharedPreferences a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(int i) {
            switch (i) {
                case 0:
                    return "NONE";
                case 1:
                    return "LIGHT";
                case 2:
                    return "MODERATE";
                case 3:
                    return "SEVERE";
                case 4:
                    return "CRITICAL";
                case 5:
                    return "EMERGENCY";
                case 6:
                    return "SHUTDOWN";
                default:
                    return "UNKNOWN";
            }
        }

        private a() {
        }
    }

    public ThermalMonitor(wk8 wk8Var, SharedPreferences sharedPreferences) {
        zq3.h(wk8Var, "initializer");
        zq3.h(sharedPreferences, "sharedPreferences");
        this.a = sharedPreferences;
        wk8Var.a(new ss2() { // from class: com.nytimes.android.performancetrackerclientphoenix.monitor.ThermalMonitor.1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).intValue());
                return ww8.a;
            }

            public final void invoke(int i) {
                ThermalMonitor.this.f(i);
            }
        });
    }

    private final int e() {
        return this.a.getInt("ThermalStatus", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(int i) {
        SharedPreferences.Editor edit = this.a.edit();
        edit.putInt("ThermalStatus", i);
        edit.apply();
    }

    @Override // com.nytimes.android.performancetrackerclientphoenix.monitor.b
    public AppEvent a() {
        return b.C0374b.b(this);
    }

    @Override // com.nytimes.android.performancetrackerclientphoenix.monitor.b
    public AppEvent b() {
        return new AppEvent.Metric.ThermalState(Companion.a(e()));
    }

    @Override // com.nytimes.android.performancetrackerclientphoenix.monitor.b
    public Map c() {
        return t.f(du8.a("thermal", Companion.a(e())));
    }
}
