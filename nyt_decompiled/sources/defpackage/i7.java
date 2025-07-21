package defpackage;

import com.nytimes.android.performancetracker.lib.PerformanceTracker;
import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent;
import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEventFactory;
import com.nytimes.android.performancetrackerclientphoenix.event.base.BasePerformanceTracker;
import kotlin.collections.t;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class i7 extends BasePerformanceTracker {
    private final z58 d;
    private PerformanceTracker.b e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(cr5 cr5Var, AppEventFactory appEventFactory, CoroutineScope coroutineScope, z58 z58Var) {
        super(cr5Var, appEventFactory, coroutineScope);
        zq3.h(cr5Var, "performanceTracker");
        zq3.h(appEventFactory, "appEventFactory");
        zq3.h(coroutineScope, "scope");
        zq3.h(z58Var, "subauth");
        this.d = z58Var;
    }

    private final String l() {
        return this.d.D();
    }

    private final void p(String str, PerformanceTracker.b bVar) {
        if (str == null || bVar == null) {
            return;
        }
        i(bVar, t.f(du8.a("pageType", str)));
    }

    private final void q() {
        this.e = g(new AppEvent.Ads.AliceCall(l()));
    }

    public final void m(String str, String str2, String str3) {
        zq3.h(str, "id");
        k(new AppEvent.Ads.Error.FetchError(str, str2, str3, l()));
    }

    public final void n(String str, String str2, String str3) {
        zq3.h(str, "id");
        k(new AppEvent.Ads.AdFetchSuccess(str, str2, str3, l()));
    }

    public final void o(String str, String str2, String str3) {
        zq3.h(str, "id");
        k(new AppEvent.Ads.AdFetchNoFill(str, str2, str3, l()));
    }

    public final void r(String str) {
        k(new AppEvent.Ads.AliceResponse("failure", str, l()));
        p(str, this.e);
    }

    public final void s(String str) {
        k(new AppEvent.Ads.AliceResponse("success", str, l()));
        p(str, this.e);
    }

    public final void t(String str, Boolean bool, boolean z, boolean z2, boolean z3, String str2, String str3) {
        k(new AppEvent.Ads.AdRequest(str, bool, z, z2, z3, str2, str3, l()));
    }

    public final void u(String str) {
        k(new AppEvent.Ads.AliceRequest(str, l()));
        q();
    }
}
