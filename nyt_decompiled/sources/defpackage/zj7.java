package defpackage;

import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent;
import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEventFactory;
import com.nytimes.android.performancetrackerclientphoenix.event.base.BasePerformanceTracker;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class zj7 extends BasePerformanceTracker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj7(cr5 cr5Var, AppEventFactory appEventFactory, CoroutineScope coroutineScope) {
        super(cr5Var, appEventFactory, coroutineScope);
        zq3.h(cr5Var, "performanceTracker");
        zq3.h(appEventFactory, "appEventFactory");
        zq3.h(coroutineScope, "scope");
    }

    public final void l(String str, String str2, String str3, String str4, String str5, String str6) {
        zq3.h(str, "eventId");
        zq3.h(str2, "message");
        zq3.h(str3, "level");
        zq3.h(str4, "platform");
        zq3.h(str5, "request");
        zq3.h(str6, "sentryUrl");
        k(new AppEvent.Sentry(str, str2, str3, str4, str5, str6));
    }
}
