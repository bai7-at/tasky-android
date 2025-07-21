package defpackage;

import com.nytimes.android.performancetracker.lib.PerformanceTracker;
import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent;
import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEventFactory;
import com.nytimes.android.performancetrackerclientphoenix.event.base.BasePerformanceTracker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class vb2 extends BasePerformanceTracker {
    private Map d;
    private Map e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb2(cr5 cr5Var, AppEventFactory appEventFactory, CoroutineScope coroutineScope) {
        super(cr5Var, appEventFactory, coroutineScope);
        zq3.h(cr5Var, "performanceTracker");
        zq3.h(appEventFactory, "appEventFactory");
        zq3.h(coroutineScope, "scope");
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
    }

    public final void l(String str) {
        zq3.h(str, "feedId");
        PerformanceTracker.b bVar = (PerformanceTracker.b) this.d.get(str);
        if (bVar != null) {
            BasePerformanceTracker.j(this, bVar, null, 2, null);
        }
        PerformanceTracker.b bVar2 = (PerformanceTracker.b) this.e.get(str);
        if (bVar2 != null) {
            BasePerformanceTracker.j(this, bVar2, null, 2, null);
        }
    }

    public final void m(String str, Throwable th, String str2) {
        zq3.h(str, "feedId");
        if (((PerformanceTracker.b) this.d.remove(str)) != null) {
            k(new AppEvent.SectionFront.Error.CriticalLoadFailure(th, str2, str));
        }
        if (((PerformanceTracker.b) this.e.remove(str)) != null) {
            k(new AppEvent.Error.ContentRefreshFailed(th, str2));
            k(new AppEvent.SectionFront.Error.CriticalLoadFailure(th, str2, str));
        }
    }

    public final void n(String str) {
        zq3.h(str, "feedId");
        PerformanceTracker.b g = g(new AppEvent.SectionFront.TimeToInteractive(str));
        if (g != null) {
            this.d.put(str, g);
        }
        h("Open Section: " + str);
    }

    public final void o(String str) {
        zq3.h(str, "feedId");
        PerformanceTracker.b g = g(new AppEvent.SectionFront.PullToRefresh(str));
        if (g != null) {
            this.e.put(str, g);
        }
    }
}
