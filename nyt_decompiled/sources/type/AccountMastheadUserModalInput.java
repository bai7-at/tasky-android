package type;

import defpackage.nk5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class AccountMastheadUserModalInput {
    private final nk5 clickedOnAccountButtonBadge;
    private final nk5 dismissedOnboardingMessage;

    /* JADX WARN: Multi-variable type inference failed */
    public AccountMastheadUserModalInput() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AccountMastheadUserModalInput copy$default(AccountMastheadUserModalInput accountMastheadUserModalInput, nk5 nk5Var, nk5 nk5Var2, int i, Object obj) {
        if ((i & 1) != 0) {
            nk5Var = accountMastheadUserModalInput.clickedOnAccountButtonBadge;
        }
        if ((i & 2) != 0) {
            nk5Var2 = accountMastheadUserModalInput.dismissedOnboardingMessage;
        }
        return accountMastheadUserModalInput.copy(nk5Var, nk5Var2);
    }

    public final nk5 component1() {
        return this.clickedOnAccountButtonBadge;
    }

    public final nk5 component2() {
        return this.dismissedOnboardingMessage;
    }

    public final AccountMastheadUserModalInput copy(nk5 nk5Var, nk5 nk5Var2) {
        zq3.h(nk5Var, "clickedOnAccountButtonBadge");
        zq3.h(nk5Var2, "dismissedOnboardingMessage");
        return new AccountMastheadUserModalInput(nk5Var, nk5Var2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountMastheadUserModalInput)) {
            return false;
        }
        AccountMastheadUserModalInput accountMastheadUserModalInput = (AccountMastheadUserModalInput) obj;
        return zq3.c(this.clickedOnAccountButtonBadge, accountMastheadUserModalInput.clickedOnAccountButtonBadge) && zq3.c(this.dismissedOnboardingMessage, accountMastheadUserModalInput.dismissedOnboardingMessage);
    }

    public final nk5 getClickedOnAccountButtonBadge() {
        return this.clickedOnAccountButtonBadge;
    }

    public final nk5 getDismissedOnboardingMessage() {
        return this.dismissedOnboardingMessage;
    }

    public int hashCode() {
        return (this.clickedOnAccountButtonBadge.hashCode() * 31) + this.dismissedOnboardingMessage.hashCode();
    }

    public String toString() {
        return "AccountMastheadUserModalInput(clickedOnAccountButtonBadge=" + this.clickedOnAccountButtonBadge + ", dismissedOnboardingMessage=" + this.dismissedOnboardingMessage + ")";
    }

    public AccountMastheadUserModalInput(nk5 nk5Var, nk5 nk5Var2) {
        zq3.h(nk5Var, "clickedOnAccountButtonBadge");
        zq3.h(nk5Var2, "dismissedOnboardingMessage");
        this.clickedOnAccountButtonBadge = nk5Var;
        this.dismissedOnboardingMessage = nk5Var2;
    }

    public /* synthetic */ AccountMastheadUserModalInput(nk5 nk5Var, nk5 nk5Var2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? nk5.a.b : nk5Var, (i & 2) != 0 ? nk5.a.b : nk5Var2);
    }
}
