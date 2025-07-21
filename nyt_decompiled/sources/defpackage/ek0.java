package defpackage;

import android.app.Application;
import com.nytimes.abtests.ChartbeatDomainVariants;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.chartbeat.ChartbeatAnalyticsReporterImpl;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class ek0 {
    public static final ek0 a = new ek0();

    private ek0() {
    }

    public final dk0 a(AbraManager abraManager, cb2 cb2Var, Application application, CoroutineScope coroutineScope) {
        zq3.h(abraManager, "abraManager");
        zq3.h(cb2Var, "featureFlagUtil");
        zq3.h(application, "application");
        zq3.h(coroutineScope, "scope");
        return cb2Var.n() ? new ChartbeatAnalyticsReporterImpl(String.valueOf(n0.a(abraManager, ChartbeatDomainVariants.Companion.a())), application, coroutineScope) : new ak0();
    }
}
