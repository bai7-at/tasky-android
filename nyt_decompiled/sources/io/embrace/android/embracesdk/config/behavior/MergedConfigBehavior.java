package io.embrace.android.embracesdk.config.behavior;

import defpackage.qs2;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public class MergedConfigBehavior<L, R> {
    private final qs2 localSupplier;
    private final qs2 remoteSupplier;
    private final BehaviorThresholdCheck thresholdCheck;

    public MergedConfigBehavior(BehaviorThresholdCheck behaviorThresholdCheck, qs2 qs2Var, qs2 qs2Var2) {
        zq3.h(behaviorThresholdCheck, "thresholdCheck");
        zq3.h(qs2Var, "localSupplier");
        zq3.h(qs2Var2, "remoteSupplier");
        this.thresholdCheck = behaviorThresholdCheck;
        this.localSupplier = qs2Var;
        this.remoteSupplier = qs2Var2;
    }

    protected final L getLocal() {
        return (L) this.localSupplier.mo865invoke();
    }

    protected final R getRemote() {
        return (R) this.remoteSupplier.mo865invoke();
    }

    protected final BehaviorThresholdCheck getThresholdCheck() {
        return this.thresholdCheck;
    }

    public /* synthetic */ MergedConfigBehavior(BehaviorThresholdCheck behaviorThresholdCheck, qs2 qs2Var, qs2 qs2Var2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(behaviorThresholdCheck, (i & 2) != 0 ? new qs2() { // from class: io.embrace.android.embracesdk.config.behavior.MergedConfigBehavior.1
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Void mo865invoke() {
                return null;
            }
        } : qs2Var, (i & 4) != 0 ? new qs2() { // from class: io.embrace.android.embracesdk.config.behavior.MergedConfigBehavior.2
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Void mo865invoke() {
                return null;
            }
        } : qs2Var2);
    }
}
