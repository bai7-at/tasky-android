package com.nytimes.android.performancetrackerclientphoenix.monitor;

import android.content.SharedPreferences;
import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent;
import com.nytimes.android.performancetrackerclientphoenix.monitor.b;
import defpackage.cr5;
import defpackage.du8;
import defpackage.qs2;
import defpackage.zq3;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final class MemoryUsageMonitor implements com.nytimes.android.performancetrackerclientphoenix.monitor.b {
    public static final a Companion = new a(null);
    private final SharedPreferences a;
    private final cr5 b;
    private final qs2 c;
    private final CoroutineScope d;
    private Long e;
    private long f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public interface b {
        long a();

        boolean b();

        long c();
    }

    public MemoryUsageMonitor(SharedPreferences sharedPreferences, cr5 cr5Var, qs2 qs2Var, CoroutineScope coroutineScope) {
        zq3.h(sharedPreferences, "prefs");
        zq3.h(cr5Var, "performanceTrackerClient");
        zq3.h(qs2Var, "memoryInfoProvider");
        zq3.h(coroutineScope, "coroutineScope");
        this.a = sharedPreferences;
        this.b = cr5Var;
        this.c = qs2Var;
        this.d = coroutineScope;
        n();
    }

    private final long i() {
        return this.a.getLong("PrefMemoryAvail", 0L);
    }

    private final long j() {
        return this.a.getLong("PrefMemoryTotal", 0L);
    }

    private final boolean k() {
        return this.a.getBoolean("PrefHasReceivedMemoryWarning", false);
    }

    private final AppEvent.Metric.MemoryUsage l(boolean z) {
        return new AppEvent.Metric.MemoryUsage(h(i()), h(j()), z);
    }

    private final void n() {
        BuildersKt__Builders_commonKt.launch$default(this.d, null, null, new MemoryUsageMonitor$updateMemoryInfo$1(this, null), 3, null);
    }

    @Override // com.nytimes.android.performancetrackerclientphoenix.monitor.b
    public AppEvent a() {
        long i = i();
        float h = h(i - this.f);
        Long l = this.e;
        AppEvent.Metric.DeltaMemoryUsage deltaMemoryUsage = new AppEvent.Metric.DeltaMemoryUsage(h, h(i - (l != null ? l.longValue() : 0L)));
        this.f = i;
        return deltaMemoryUsage;
    }

    @Override // com.nytimes.android.performancetrackerclientphoenix.monitor.b
    public AppEvent b() {
        return l(false);
    }

    @Override // com.nytimes.android.performancetrackerclientphoenix.monitor.b
    public Map c() {
        return t.m(du8.a("memoryAvailable", Float.valueOf(h(i()))), du8.a("memoryTotal", Float.valueOf(h(j()))), du8.a("hasReceivedMemoryWarning", Boolean.valueOf(k())));
    }

    public float h(long j) {
        return b.C0374b.a(this, j);
    }

    public final void m() {
        n();
        this.b.d(AppEvent.toEventConvertible$default(l(true), null, 1, null));
    }

    public /* synthetic */ MemoryUsageMonitor(SharedPreferences sharedPreferences, cr5 cr5Var, qs2 qs2Var, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sharedPreferences, cr5Var, qs2Var, (i & 8) != 0 ? CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()) : coroutineScope);
    }
}
