package defpackage;

import com.nytimes.android.performancetracker.lib.PerformanceTracker;
import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent;
import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEventFactory;
import com.nytimes.android.performancetrackerclientphoenix.event.base.BasePerformanceTracker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class gv5 extends BasePerformanceTracker {
    public static final a Companion = new a(null);
    private static Map d = new LinkedHashMap();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv5(cr5 cr5Var, AppEventFactory appEventFactory, CoroutineScope coroutineScope) {
        super(cr5Var, appEventFactory, coroutineScope);
        zq3.h(cr5Var, "performanceTracker");
        zq3.h(appEventFactory, "appEventFactory");
        zq3.h(coroutineScope, "scope");
    }

    public final void l(String str) {
        zq3.h(str, "feedId");
        PerformanceTracker.b bVar = (PerformanceTracker.b) d.get(str);
        if (bVar != null) {
            BasePerformanceTracker.j(this, bVar, null, 2, null);
        }
    }

    public final void m(String str) {
        zq3.h(str, "feedId");
        PerformanceTracker.b g = g(new AppEvent.PlayTab.TimeToInteractive(str));
        if (g != null) {
            d.put(str, g);
        }
        h("Open Section: " + str);
    }

    public final void n() {
        k(AppEvent.PlayTab.Load.INSTANCE);
        h("Opened Play Tab Screen");
    }
}
