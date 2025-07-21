package com.nytimes.android.performancetrackerclientphoenix.monitor;

import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent;
import com.nytimes.android.performancetrackerclientphoenix.monitor.b;
import com.nytimes.android.utils.NetworkStatus;
import defpackage.zq3;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class c implements b {
    private final NetworkStatus a;

    public c(NetworkStatus networkStatus) {
        zq3.h(networkStatus, "networkStatus");
        this.a = networkStatus;
    }

    private final boolean d() {
        return !this.a.g();
    }

    @Override // com.nytimes.android.performancetrackerclientphoenix.monitor.b
    public AppEvent a() {
        return b.C0374b.b(this);
    }

    @Override // com.nytimes.android.performancetrackerclientphoenix.monitor.b
    public AppEvent b() {
        return b.C0374b.c(this);
    }

    @Override // com.nytimes.android.performancetrackerclientphoenix.monitor.b
    public Map c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("isOffline", Boolean.valueOf(d()));
        return linkedHashMap;
    }
}
