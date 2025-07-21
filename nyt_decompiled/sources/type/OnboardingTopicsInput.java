package type;

import com.facebook.AuthenticationTokenClaims;
import defpackage.nk5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class OnboardingTopicsInput {
    private final nk5 name;
    private final nk5 selected;

    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingTopicsInput() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ OnboardingTopicsInput copy$default(OnboardingTopicsInput onboardingTopicsInput, nk5 nk5Var, nk5 nk5Var2, int i, Object obj) {
        if ((i & 1) != 0) {
            nk5Var = onboardingTopicsInput.name;
        }
        if ((i & 2) != 0) {
            nk5Var2 = onboardingTopicsInput.selected;
        }
        return onboardingTopicsInput.copy(nk5Var, nk5Var2);
    }

    public final nk5 component1() {
        return this.name;
    }

    public final nk5 component2() {
        return this.selected;
    }

    public final OnboardingTopicsInput copy(nk5 nk5Var, nk5 nk5Var2) {
        zq3.h(nk5Var, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(nk5Var2, "selected");
        return new OnboardingTopicsInput(nk5Var, nk5Var2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingTopicsInput)) {
            return false;
        }
        OnboardingTopicsInput onboardingTopicsInput = (OnboardingTopicsInput) obj;
        return zq3.c(this.name, onboardingTopicsInput.name) && zq3.c(this.selected, onboardingTopicsInput.selected);
    }

    public final nk5 getName() {
        return this.name;
    }

    public final nk5 getSelected() {
        return this.selected;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.selected.hashCode();
    }

    public String toString() {
        return "OnboardingTopicsInput(name=" + this.name + ", selected=" + this.selected + ")";
    }

    public OnboardingTopicsInput(nk5 nk5Var, nk5 nk5Var2) {
        zq3.h(nk5Var, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(nk5Var2, "selected");
        this.name = nk5Var;
        this.selected = nk5Var2;
    }

    public /* synthetic */ OnboardingTopicsInput(nk5 nk5Var, nk5 nk5Var2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? nk5.a.b : nk5Var, (i & 2) != 0 ? nk5.a.b : nk5Var2);
    }
}
