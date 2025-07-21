package com.nytimes.android.performancetrackerclientphoenix.dimodules;

import android.app.Application;
import android.content.SharedPreferences;
import com.nytimes.android.performancetrackerclientphoenix.monitor.MemoryUsageMonitor;
import defpackage.ba2;
import defpackage.cr5;
import defpackage.g16;

/* loaded from: classes4.dex */
public abstract class g implements ba2 {
    public static MemoryUsageMonitor a(Application application, cr5 cr5Var, SharedPreferences sharedPreferences) {
        return (MemoryUsageMonitor) g16.e(PerformanceTrackerClientModule.Companion.g(application, cr5Var, sharedPreferences));
    }
}
