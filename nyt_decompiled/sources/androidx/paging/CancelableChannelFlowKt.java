package androidx.paging;

import defpackage.gt2;
import defpackage.zq3;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public abstract class CancelableChannelFlowKt {
    public static final Flow a(Job job, gt2 gt2Var) {
        zq3.h(job, "controller");
        zq3.h(gt2Var, "block");
        return SimpleChannelFlowKt.a(new CancelableChannelFlowKt$cancelableChannelFlow$1(job, gt2Var, null));
    }
}
