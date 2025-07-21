package defpackage;

import com.nytimes.android.performancetracker.lib.PerformanceTracker;
import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent;
import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEventFactory;
import com.nytimes.android.performancetrackerclientphoenix.event.base.BasePerformanceTracker;
import io.embrace.android.embracesdk.Embrace;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class fm9 extends BasePerformanceTracker {
    private Map d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm9(cr5 cr5Var, AppEventFactory appEventFactory, CoroutineScope coroutineScope) {
        super(cr5Var, appEventFactory, coroutineScope);
        zq3.h(cr5Var, "performanceTracker");
        zq3.h(appEventFactory, "appEventFactory");
        zq3.h(coroutineScope, "scope");
        this.d = new LinkedHashMap();
    }

    private final String l(String str) {
        return "load-destination:" + str;
    }

    public final void m(String str) {
        zq3.h(str, "destination");
        PerformanceTracker.b bVar = (PerformanceTracker.b) this.d.get(str);
        if (bVar != null) {
            BasePerformanceTracker.j(this, bVar, null, 2, null);
            this.d.remove(str);
            Embrace.getInstance().endMoment(l(str));
        }
    }

    public final void n(String str) {
        zq3.h(str, "destination");
        PerformanceTracker.b g = g(new AppEvent.CrossProduct.TimeToInteractive(str));
        if (g != null) {
            this.d.put(str, g);
        }
        h("Open Destination: " + str);
        Embrace.getInstance().startMoment(l(str));
    }
}
