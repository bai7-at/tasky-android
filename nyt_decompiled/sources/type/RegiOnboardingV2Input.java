package type;

import defpackage.nk5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class RegiOnboardingV2Input {
    private final nk5 completed;
    private final nk5 started;

    /* JADX WARN: Multi-variable type inference failed */
    public RegiOnboardingV2Input() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RegiOnboardingV2Input copy$default(RegiOnboardingV2Input regiOnboardingV2Input, nk5 nk5Var, nk5 nk5Var2, int i, Object obj) {
        if ((i & 1) != 0) {
            nk5Var = regiOnboardingV2Input.completed;
        }
        if ((i & 2) != 0) {
            nk5Var2 = regiOnboardingV2Input.started;
        }
        return regiOnboardingV2Input.copy(nk5Var, nk5Var2);
    }

    public final nk5 component1() {
        return this.completed;
    }

    public final nk5 component2() {
        return this.started;
    }

    public final RegiOnboardingV2Input copy(nk5 nk5Var, nk5 nk5Var2) {
        zq3.h(nk5Var, "completed");
        zq3.h(nk5Var2, "started");
        return new RegiOnboardingV2Input(nk5Var, nk5Var2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegiOnboardingV2Input)) {
            return false;
        }
        RegiOnboardingV2Input regiOnboardingV2Input = (RegiOnboardingV2Input) obj;
        return zq3.c(this.completed, regiOnboardingV2Input.completed) && zq3.c(this.started, regiOnboardingV2Input.started);
    }

    public final nk5 getCompleted() {
        return this.completed;
    }

    public final nk5 getStarted() {
        return this.started;
    }

    public int hashCode() {
        return (this.completed.hashCode() * 31) + this.started.hashCode();
    }

    public String toString() {
        return "RegiOnboardingV2Input(completed=" + this.completed + ", started=" + this.started + ")";
    }

    public RegiOnboardingV2Input(nk5 nk5Var, nk5 nk5Var2) {
        zq3.h(nk5Var, "completed");
        zq3.h(nk5Var2, "started");
        this.completed = nk5Var;
        this.started = nk5Var2;
    }

    public /* synthetic */ RegiOnboardingV2Input(nk5 nk5Var, nk5 nk5Var2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? nk5.a.b : nk5Var, (i & 2) != 0 ? nk5.a.b : nk5Var2);
    }
}
