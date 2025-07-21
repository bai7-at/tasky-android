package type;

import defpackage.nk5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class SubOnboardingStepInput {
    private final nk5 completed;
    private final nk5 interacted;
    private final nk5 lastSeenOn;
    private final nk5 viewCount;

    public SubOnboardingStepInput() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ SubOnboardingStepInput copy$default(SubOnboardingStepInput subOnboardingStepInput, nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, int i, Object obj) {
        if ((i & 1) != 0) {
            nk5Var = subOnboardingStepInput.completed;
        }
        if ((i & 2) != 0) {
            nk5Var2 = subOnboardingStepInput.interacted;
        }
        if ((i & 4) != 0) {
            nk5Var3 = subOnboardingStepInput.lastSeenOn;
        }
        if ((i & 8) != 0) {
            nk5Var4 = subOnboardingStepInput.viewCount;
        }
        return subOnboardingStepInput.copy(nk5Var, nk5Var2, nk5Var3, nk5Var4);
    }

    public final nk5 component1() {
        return this.completed;
    }

    public final nk5 component2() {
        return this.interacted;
    }

    public final nk5 component3() {
        return this.lastSeenOn;
    }

    public final nk5 component4() {
        return this.viewCount;
    }

    public final SubOnboardingStepInput copy(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4) {
        zq3.h(nk5Var, "completed");
        zq3.h(nk5Var2, "interacted");
        zq3.h(nk5Var3, "lastSeenOn");
        zq3.h(nk5Var4, "viewCount");
        return new SubOnboardingStepInput(nk5Var, nk5Var2, nk5Var3, nk5Var4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubOnboardingStepInput)) {
            return false;
        }
        SubOnboardingStepInput subOnboardingStepInput = (SubOnboardingStepInput) obj;
        return zq3.c(this.completed, subOnboardingStepInput.completed) && zq3.c(this.interacted, subOnboardingStepInput.interacted) && zq3.c(this.lastSeenOn, subOnboardingStepInput.lastSeenOn) && zq3.c(this.viewCount, subOnboardingStepInput.viewCount);
    }

    public final nk5 getCompleted() {
        return this.completed;
    }

    public final nk5 getInteracted() {
        return this.interacted;
    }

    public final nk5 getLastSeenOn() {
        return this.lastSeenOn;
    }

    public final nk5 getViewCount() {
        return this.viewCount;
    }

    public int hashCode() {
        return (((((this.completed.hashCode() * 31) + this.interacted.hashCode()) * 31) + this.lastSeenOn.hashCode()) * 31) + this.viewCount.hashCode();
    }

    public String toString() {
        return "SubOnboardingStepInput(completed=" + this.completed + ", interacted=" + this.interacted + ", lastSeenOn=" + this.lastSeenOn + ", viewCount=" + this.viewCount + ")";
    }

    public SubOnboardingStepInput(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4) {
        zq3.h(nk5Var, "completed");
        zq3.h(nk5Var2, "interacted");
        zq3.h(nk5Var3, "lastSeenOn");
        zq3.h(nk5Var4, "viewCount");
        this.completed = nk5Var;
        this.interacted = nk5Var2;
        this.lastSeenOn = nk5Var3;
        this.viewCount = nk5Var4;
    }

    public /* synthetic */ SubOnboardingStepInput(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? nk5.a.b : nk5Var, (i & 2) != 0 ? nk5.a.b : nk5Var2, (i & 4) != 0 ? nk5.a.b : nk5Var3, (i & 8) != 0 ? nk5.a.b : nk5Var4);
    }
}
