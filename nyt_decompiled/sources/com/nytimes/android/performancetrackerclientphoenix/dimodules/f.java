package com.nytimes.android.performancetrackerclientphoenix.dimodules;

import android.app.Application;
import com.nytimes.android.performancetrackerclientphoenix.event.MainThreadTracker;
import defpackage.ba2;
import defpackage.cr5;
import defpackage.g16;

/* loaded from: classes4.dex */
public abstract class f implements ba2 {
    public static MainThreadTracker a(Application application, cr5 cr5Var, boolean z) {
        return (MainThreadTracker) g16.e(PerformanceTrackerClientModule.Companion.f(application, cr5Var, z));
    }
}
