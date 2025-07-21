package type;

import defpackage.nk5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class MastheadUserModalAppDownloadInput {
    private final nk5 clickedOnBar1;
    private final nk5 clickedOnDownloadButtonBadge;
    private final nk5 dismissedModal;
    private final nk5 dismissedOnboardingMessage;
    private final nk5 viewCount;

    public MastheadUserModalAppDownloadInput() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ MastheadUserModalAppDownloadInput copy$default(MastheadUserModalAppDownloadInput mastheadUserModalAppDownloadInput, nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, nk5 nk5Var5, int i, Object obj) {
        if ((i & 1) != 0) {
            nk5Var = mastheadUserModalAppDownloadInput.clickedOnBar1;
        }
        if ((i & 2) != 0) {
            nk5Var2 = mastheadUserModalAppDownloadInput.clickedOnDownloadButtonBadge;
        }
        nk5 nk5Var6 = nk5Var2;
        if ((i & 4) != 0) {
            nk5Var3 = mastheadUserModalAppDownloadInput.dismissedModal;
        }
        nk5 nk5Var7 = nk5Var3;
        if ((i & 8) != 0) {
            nk5Var4 = mastheadUserModalAppDownloadInput.dismissedOnboardingMessage;
        }
        nk5 nk5Var8 = nk5Var4;
        if ((i & 16) != 0) {
            nk5Var5 = mastheadUserModalAppDownloadInput.viewCount;
        }
        return mastheadUserModalAppDownloadInput.copy(nk5Var, nk5Var6, nk5Var7, nk5Var8, nk5Var5);
    }

    public final nk5 component1() {
        return this.clickedOnBar1;
    }

    public final nk5 component2() {
        return this.clickedOnDownloadButtonBadge;
    }

    public final nk5 component3() {
        return this.dismissedModal;
    }

    public final nk5 component4() {
        return this.dismissedOnboardingMessage;
    }

    public final nk5 component5() {
        return this.viewCount;
    }

    public final MastheadUserModalAppDownloadInput copy(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, nk5 nk5Var5) {
        zq3.h(nk5Var, "clickedOnBar1");
        zq3.h(nk5Var2, "clickedOnDownloadButtonBadge");
        zq3.h(nk5Var3, "dismissedModal");
        zq3.h(nk5Var4, "dismissedOnboardingMessage");
        zq3.h(nk5Var5, "viewCount");
        return new MastheadUserModalAppDownloadInput(nk5Var, nk5Var2, nk5Var3, nk5Var4, nk5Var5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MastheadUserModalAppDownloadInput)) {
            return false;
        }
        MastheadUserModalAppDownloadInput mastheadUserModalAppDownloadInput = (MastheadUserModalAppDownloadInput) obj;
        return zq3.c(this.clickedOnBar1, mastheadUserModalAppDownloadInput.clickedOnBar1) && zq3.c(this.clickedOnDownloadButtonBadge, mastheadUserModalAppDownloadInput.clickedOnDownloadButtonBadge) && zq3.c(this.dismissedModal, mastheadUserModalAppDownloadInput.dismissedModal) && zq3.c(this.dismissedOnboardingMessage, mastheadUserModalAppDownloadInput.dismissedOnboardingMessage) && zq3.c(this.viewCount, mastheadUserModalAppDownloadInput.viewCount);
    }

    public final nk5 getClickedOnBar1() {
        return this.clickedOnBar1;
    }

    public final nk5 getClickedOnDownloadButtonBadge() {
        return this.clickedOnDownloadButtonBadge;
    }

    public final nk5 getDismissedModal() {
        return this.dismissedModal;
    }

    public final nk5 getDismissedOnboardingMessage() {
        return this.dismissedOnboardingMessage;
    }

    public final nk5 getViewCount() {
        return this.viewCount;
    }

    public int hashCode() {
        return (((((((this.clickedOnBar1.hashCode() * 31) + this.clickedOnDownloadButtonBadge.hashCode()) * 31) + this.dismissedModal.hashCode()) * 31) + this.dismissedOnboardingMessage.hashCode()) * 31) + this.viewCount.hashCode();
    }

    public String toString() {
        return "MastheadUserModalAppDownloadInput(clickedOnBar1=" + this.clickedOnBar1 + ", clickedOnDownloadButtonBadge=" + this.clickedOnDownloadButtonBadge + ", dismissedModal=" + this.dismissedModal + ", dismissedOnboardingMessage=" + this.dismissedOnboardingMessage + ", viewCount=" + this.viewCount + ")";
    }

    public MastheadUserModalAppDownloadInput(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, nk5 nk5Var5) {
        zq3.h(nk5Var, "clickedOnBar1");
        zq3.h(nk5Var2, "clickedOnDownloadButtonBadge");
        zq3.h(nk5Var3, "dismissedModal");
        zq3.h(nk5Var4, "dismissedOnboardingMessage");
        zq3.h(nk5Var5, "viewCount");
        this.clickedOnBar1 = nk5Var;
        this.clickedOnDownloadButtonBadge = nk5Var2;
        this.dismissedModal = nk5Var3;
        this.dismissedOnboardingMessage = nk5Var4;
        this.viewCount = nk5Var5;
    }

    public /* synthetic */ MastheadUserModalAppDownloadInput(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, nk5 nk5Var5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? nk5.a.b : nk5Var, (i & 2) != 0 ? nk5.a.b : nk5Var2, (i & 4) != 0 ? nk5.a.b : nk5Var3, (i & 8) != 0 ? nk5.a.b : nk5Var4, (i & 16) != 0 ? nk5.a.b : nk5Var5);
    }
}
