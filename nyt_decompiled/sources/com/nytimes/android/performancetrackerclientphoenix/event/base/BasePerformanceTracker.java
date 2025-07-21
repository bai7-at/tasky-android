package com.nytimes.android.performancetrackerclientphoenix.event.base;

import com.nytimes.android.performancetracker.lib.PerformanceTracker;
import defpackage.cr5;
import defpackage.zq3;
import java.util.Map;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public abstract class BasePerformanceTracker {
    private final cr5 a;
    private final AppEventFactory b;
    private final CoroutineScope c;

    public BasePerformanceTracker(cr5 cr5Var, AppEventFactory appEventFactory, CoroutineScope coroutineScope) {
        zq3.h(cr5Var, "performanceTracker");
        zq3.h(appEventFactory, "appEventFactory");
        zq3.h(coroutineScope, "scope");
        this.a = cr5Var;
        this.b = appEventFactory;
        this.c = coroutineScope;
    }

    public static /* synthetic */ void j(BasePerformanceTracker basePerformanceTracker, PerformanceTracker.b bVar, Map map, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: end");
        }
        if ((i & 2) != 0) {
            map = null;
        }
        basePerformanceTracker.i(bVar, map);
    }

    public final PerformanceTracker.b g(AppEvent appEvent) {
        zq3.h(appEvent, "event");
        return this.a.b(this.b.a(appEvent));
    }

    public final void h(String str) {
        zq3.h(str, "message");
        this.a.c(str);
    }

    public final void i(PerformanceTracker.b bVar, Map map) {
        zq3.h(bVar, "token");
        BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new BasePerformanceTracker$end$1(this, bVar, map, null), 3, null);
    }

    public final void k(AppEvent appEvent) {
        zq3.h(appEvent, "event");
        BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new BasePerformanceTracker$trackEvent$1(this, appEvent, null), 3, null);
    }
}
