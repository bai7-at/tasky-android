package type;

import defpackage.nk5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class SubscriberOnboardingInput {
    private final nk5 completed;
    private final nk5 neverShow;
    private final nk5 savedArticle;
    private final nk5 snoozed;
    private final nk5 snoozedOn;
    private final nk5 started;

    public SubscriberOnboardingInput() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ SubscriberOnboardingInput copy$default(SubscriberOnboardingInput subscriberOnboardingInput, nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, nk5 nk5Var5, nk5 nk5Var6, int i, Object obj) {
        if ((i & 1) != 0) {
            nk5Var = subscriberOnboardingInput.completed;
        }
        if ((i & 2) != 0) {
            nk5Var2 = subscriberOnboardingInput.neverShow;
        }
        nk5 nk5Var7 = nk5Var2;
        if ((i & 4) != 0) {
            nk5Var3 = subscriberOnboardingInput.savedArticle;
        }
        nk5 nk5Var8 = nk5Var3;
        if ((i & 8) != 0) {
            nk5Var4 = subscriberOnboardingInput.snoozed;
        }
        nk5 nk5Var9 = nk5Var4;
        if ((i & 16) != 0) {
            nk5Var5 = subscriberOnboardingInput.snoozedOn;
        }
        nk5 nk5Var10 = nk5Var5;
        if ((i & 32) != 0) {
            nk5Var6 = subscriberOnboardingInput.started;
        }
        return subscriberOnboardingInput.copy(nk5Var, nk5Var7, nk5Var8, nk5Var9, nk5Var10, nk5Var6);
    }

    public final nk5 component1() {
        return this.completed;
    }

    public final nk5 component2() {
        return this.neverShow;
    }

    public final nk5 component3() {
        return this.savedArticle;
    }

    public final nk5 component4() {
        return this.snoozed;
    }

    public final nk5 component5() {
        return this.snoozedOn;
    }

    public final nk5 component6() {
        return this.started;
    }

    public final SubscriberOnboardingInput copy(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, nk5 nk5Var5, nk5 nk5Var6) {
        zq3.h(nk5Var, "completed");
        zq3.h(nk5Var2, "neverShow");
        zq3.h(nk5Var3, "savedArticle");
        zq3.h(nk5Var4, "snoozed");
        zq3.h(nk5Var5, "snoozedOn");
        zq3.h(nk5Var6, "started");
        return new SubscriberOnboardingInput(nk5Var, nk5Var2, nk5Var3, nk5Var4, nk5Var5, nk5Var6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriberOnboardingInput)) {
            return false;
        }
        SubscriberOnboardingInput subscriberOnboardingInput = (SubscriberOnboardingInput) obj;
        return zq3.c(this.completed, subscriberOnboardingInput.completed) && zq3.c(this.neverShow, subscriberOnboardingInput.neverShow) && zq3.c(this.savedArticle, subscriberOnboardingInput.savedArticle) && zq3.c(this.snoozed, subscriberOnboardingInput.snoozed) && zq3.c(this.snoozedOn, subscriberOnboardingInput.snoozedOn) && zq3.c(this.started, subscriberOnboardingInput.started);
    }

    public final nk5 getCompleted() {
        return this.completed;
    }

    public final nk5 getNeverShow() {
        return this.neverShow;
    }

    public final nk5 getSavedArticle() {
        return this.savedArticle;
    }

    public final nk5 getSnoozed() {
        return this.snoozed;
    }

    public final nk5 getSnoozedOn() {
        return this.snoozedOn;
    }

    public final nk5 getStarted() {
        return this.started;
    }

    public int hashCode() {
        return (((((((((this.completed.hashCode() * 31) + this.neverShow.hashCode()) * 31) + this.savedArticle.hashCode()) * 31) + this.snoozed.hashCode()) * 31) + this.snoozedOn.hashCode()) * 31) + this.started.hashCode();
    }

    public String toString() {
        return "SubscriberOnboardingInput(completed=" + this.completed + ", neverShow=" + this.neverShow + ", savedArticle=" + this.savedArticle + ", snoozed=" + this.snoozed + ", snoozedOn=" + this.snoozedOn + ", started=" + this.started + ")";
    }

    public SubscriberOnboardingInput(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, nk5 nk5Var5, nk5 nk5Var6) {
        zq3.h(nk5Var, "completed");
        zq3.h(nk5Var2, "neverShow");
        zq3.h(nk5Var3, "savedArticle");
        zq3.h(nk5Var4, "snoozed");
        zq3.h(nk5Var5, "snoozedOn");
        zq3.h(nk5Var6, "started");
        this.completed = nk5Var;
        this.neverShow = nk5Var2;
        this.savedArticle = nk5Var3;
        this.snoozed = nk5Var4;
        this.snoozedOn = nk5Var5;
        this.started = nk5Var6;
    }

    public /* synthetic */ SubscriberOnboardingInput(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, nk5 nk5Var5, nk5 nk5Var6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? nk5.a.b : nk5Var, (i & 2) != 0 ? nk5.a.b : nk5Var2, (i & 4) != 0 ? nk5.a.b : nk5Var3, (i & 8) != 0 ? nk5.a.b : nk5Var4, (i & 16) != 0 ? nk5.a.b : nk5Var5, (i & 32) != 0 ? nk5.a.b : nk5Var6);
    }
}
