package defpackage;

import com.nytimes.android.eventtracker.pagetracker.scope.ET2SimpleScope;
import com.nytimes.android.productlanding.adapters.GrowthUIAnalyticsAdapter;
import com.nytimes.android.productlanding.adapters.GrowthUIAuthAdapter;
import com.nytimes.android.productlanding.adapters.GrowthUISubscriptionAdapter;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final class k53 {
    public static final k53 a = new k53();

    private k53() {
    }

    public final k43 a(ET2SimpleScope eT2SimpleScope) {
        zq3.h(eT2SimpleScope, "et2Scope");
        return new GrowthUIAnalyticsAdapter(eT2SimpleScope);
    }

    public final t43 b(z58 z58Var) {
        zq3.h(z58Var, "subauthClient");
        return new GrowthUIAuthAdapter(Dispatchers.getIO(), z58Var);
    }

    public final p53 c(qv6 qv6Var) {
        zq3.h(qv6Var, "remoteConfig");
        return new q53(qv6Var);
    }

    public final r53 d(z58 z58Var) {
        zq3.h(z58Var, "subauthClient");
        return new GrowthUISubscriptionAdapter(z58Var);
    }
}
