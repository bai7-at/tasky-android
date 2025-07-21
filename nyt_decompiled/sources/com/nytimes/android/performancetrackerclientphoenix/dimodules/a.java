package com.nytimes.android.performancetrackerclientphoenix.dimodules;

import android.app.Application;
import com.nytimes.android.performancetrackerclientphoenix.monitor.DiskUsageMonitor;
import defpackage.ba2;
import defpackage.g16;

/* loaded from: classes4.dex */
public abstract class a implements ba2 {
    public static DiskUsageMonitor.a a(Application application) {
        return (DiskUsageMonitor.a) g16.e(PerformanceTrackerClientModule.Companion.a(application));
    }
}
