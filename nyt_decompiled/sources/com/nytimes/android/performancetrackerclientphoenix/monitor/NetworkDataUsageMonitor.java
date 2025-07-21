package com.nytimes.android.performancetrackerclientphoenix.monitor;

import android.net.TrafficStats;
import android.os.Process;
import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent;
import com.nytimes.android.performancetrackerclientphoenix.monitor.b;
import defpackage.zq3;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class NetworkDataUsageMonitor implements b {
    private final CoroutineScope a;
    private Float b;

    public NetworkDataUsageMonitor(CoroutineScope coroutineScope) {
        zq3.h(coroutineScope, "coroutineScope");
        this.a = coroutineScope;
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Float g() {
        int myUid = Process.myUid();
        long uidTxBytes = TrafficStats.getUidTxBytes(myUid);
        long uidRxBytes = TrafficStats.getUidRxBytes(myUid);
        if (((int) uidTxBytes) == -1 || ((int) uidRxBytes) == -1) {
            return null;
        }
        return Float.valueOf(f(TrafficStats.getUidTxBytes(myUid) + TrafficStats.getUidRxBytes(myUid)));
    }

    private final void h() {
        BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new NetworkDataUsageMonitor$initNetworkDataUsage$1(this, null), 3, null);
    }

    @Override // com.nytimes.android.performancetrackerclientphoenix.monitor.b
    public AppEvent a() {
        Float g = g();
        if (g == null) {
            return null;
        }
        float floatValue = g.floatValue();
        Float f = this.b;
        return new AppEvent.Metric.DeltaNetworkDataUsage(floatValue - (f != null ? f.floatValue() : 0.0f));
    }

    @Override // com.nytimes.android.performancetrackerclientphoenix.monitor.b
    public Map c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Float g = g();
        if (g != null) {
            linkedHashMap.put("used", g);
        }
        return linkedHashMap;
    }

    public float f(long j) {
        return b.C0374b.a(this, j);
    }

    @Override // com.nytimes.android.performancetrackerclientphoenix.monitor.b
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public AppEvent.Metric.NetworkDataUsage b() {
        Float g = g();
        if (g != null) {
            return new AppEvent.Metric.NetworkDataUsage(g.floatValue());
        }
        return null;
    }
}
