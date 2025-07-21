package defpackage;

import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent;
import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEventFactory;
import com.nytimes.android.performancetrackerclientphoenix.event.base.BasePerformanceTracker;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class u93 extends BasePerformanceTracker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u93(cr5 cr5Var, AppEventFactory appEventFactory, CoroutineScope coroutineScope) {
        super(cr5Var, appEventFactory, coroutineScope);
        zq3.h(cr5Var, "performanceTracker");
        zq3.h(appEventFactory, "appEventFactory");
        zq3.h(coroutineScope, "scope");
    }

    public final void l() {
        k(AppEvent.OneWebviewHome.Load.INSTANCE);
        h("Opened Home Screen");
    }

    public final void m() {
        k(new AppEvent.Page.View("hp"));
    }
}
