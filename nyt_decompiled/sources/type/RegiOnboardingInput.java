package type;

import defpackage.nk5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class RegiOnboardingInput {
    private final nk5 hasSeenUpsell;

    /* JADX WARN: Multi-variable type inference failed */
    public RegiOnboardingInput() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RegiOnboardingInput copy$default(RegiOnboardingInput regiOnboardingInput, nk5 nk5Var, int i, Object obj) {
        if ((i & 1) != 0) {
            nk5Var = regiOnboardingInput.hasSeenUpsell;
        }
        return regiOnboardingInput.copy(nk5Var);
    }

    public final nk5 component1() {
        return this.hasSeenUpsell;
    }

    public final RegiOnboardingInput copy(nk5 nk5Var) {
        zq3.h(nk5Var, "hasSeenUpsell");
        return new RegiOnboardingInput(nk5Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RegiOnboardingInput) && zq3.c(this.hasSeenUpsell, ((RegiOnboardingInput) obj).hasSeenUpsell);
    }

    public final nk5 getHasSeenUpsell() {
        return this.hasSeenUpsell;
    }

    public int hashCode() {
        return this.hasSeenUpsell.hashCode();
    }

    public String toString() {
        return "RegiOnboardingInput(hasSeenUpsell=" + this.hasSeenUpsell + ")";
    }

    public RegiOnboardingInput(nk5 nk5Var) {
        zq3.h(nk5Var, "hasSeenUpsell");
        this.hasSeenUpsell = nk5Var;
    }

    public /* synthetic */ RegiOnboardingInput(nk5 nk5Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? nk5.a.b : nk5Var);
    }
}
