package defpackage;

import com.nytimes.subauth.ui.purr.PurrUIManager;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* loaded from: classes4.dex */
public final class v96 {
    public final MutableSharedFlow a() {
        return SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
    }

    public final MutableSharedFlow b() {
        return SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
    }

    public final s96 c(Set set, MutableSharedFlow mutableSharedFlow, MutableSharedFlow mutableSharedFlow2) {
        zq3.h(set, "purrUIConfigs");
        zq3.h(mutableSharedFlow, "purrErrorFlow");
        zq3.h(mutableSharedFlow2, "purrTCFAnalyticEventFlow");
        return new PurrUIManager(!set.isEmpty() ? (u96) i.j0(set) : new aj1(null, null, 3, null).a(), mutableSharedFlow, mutableSharedFlow2);
    }

    public final Set d() {
        return b0.e();
    }
}
