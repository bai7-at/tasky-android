package defpackage;

import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* loaded from: classes2.dex */
public final class f6 {
    public static final f6 a = new f6();

    private f6() {
    }

    public final MutableSharedFlow a() {
        return SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    public final MutableSharedFlow b() {
        return SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    public final e6 c(MutableSharedFlow mutableSharedFlow, MutableSharedFlow mutableSharedFlow2) {
        zq3.h(mutableSharedFlow, "adEventFlow");
        zq3.h(mutableSharedFlow2, "alsEventFlow");
        return new j6(mutableSharedFlow, mutableSharedFlow2);
    }
}
