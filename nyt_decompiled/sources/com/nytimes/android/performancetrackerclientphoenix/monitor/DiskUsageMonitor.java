package com.nytimes.android.performancetrackerclientphoenix.monitor;

import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent;
import com.nytimes.android.performancetrackerclientphoenix.monitor.b;
import defpackage.du8;
import defpackage.zq3;
import java.util.Map;
import kotlin.collections.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class DiskUsageMonitor implements b {
    private final a a;
    private final CoroutineScope b;
    private float c;
    private float d;

    public interface a {
        Long a();

        long b();
    }

    public DiskUsageMonitor(a aVar, CoroutineScope coroutineScope) {
        zq3.h(aVar, "diskSpaceProvider");
        zq3.h(coroutineScope, "coroutineScope");
        this.a = aVar;
        this.b = coroutineScope;
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Float f() {
        Long a2 = this.a.a();
        if (a2 != null) {
            return Float.valueOf(e(a2.longValue()));
        }
        return null;
    }

    private final float g() {
        return e(this.a.b());
    }

    private final void h() {
        BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new DiskUsageMonitor$initDiskSpaceInfo$1(this, null), 3, null);
    }

    @Override // com.nytimes.android.performancetrackerclientphoenix.monitor.b
    public AppEvent a() {
        Float f = f();
        if (f == null) {
            return null;
        }
        AppEvent.Metric.DeltaDiskUsage deltaDiskUsage = new AppEvent.Metric.DeltaDiskUsage(f.floatValue() - this.d, f.floatValue() - this.c);
        this.d = f.floatValue();
        return deltaDiskUsage;
    }

    @Override // com.nytimes.android.performancetrackerclientphoenix.monitor.b
    public Map c() {
        Map n = t.n(du8.a("diskSpaceTotal", Float.valueOf(g())));
        Float f = f();
        if (f != null) {
            n.put("diskSpaceAvailable", f);
        }
        return n;
    }

    public float e(long j) {
        return b.C0374b.a(this, j);
    }

    @Override // com.nytimes.android.performancetrackerclientphoenix.monitor.b
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public AppEvent.Metric.DiskUsage b() {
        return new AppEvent.Metric.DiskUsage(f(), g());
    }

    public final void j(float f) {
        this.c = f;
    }
}
