package type;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.nk5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class SubscriberOnboardingV2Input {
    private final nk5 completed;
    private final nk5 interacted;
    private final nk5 lastSeenOn;
    private final nk5 neverShow;
    private final nk5 pointOfOrigin;
    private final nk5 savedArticle;
    private final nk5 snoozed;
    private final nk5 snoozedOn;
    private final nk5 started;
    private final nk5 viewCount;

    public SubscriberOnboardingV2Input() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public final nk5 component1() {
        return this.completed;
    }

    public final nk5 component10() {
        return this.viewCount;
    }

    public final nk5 component2() {
        return this.interacted;
    }

    public final nk5 component3() {
        return this.lastSeenOn;
    }

    public final nk5 component4() {
        return this.neverShow;
    }

    public final nk5 component5() {
        return this.pointOfOrigin;
    }

    public final nk5 component6() {
        return this.savedArticle;
    }

    public final nk5 component7() {
        return this.snoozed;
    }

    public final nk5 component8() {
        return this.snoozedOn;
    }

    public final nk5 component9() {
        return this.started;
    }

    public final SubscriberOnboardingV2Input copy(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, nk5 nk5Var5, nk5 nk5Var6, nk5 nk5Var7, nk5 nk5Var8, nk5 nk5Var9, nk5 nk5Var10) {
        zq3.h(nk5Var, "completed");
        zq3.h(nk5Var2, "interacted");
        zq3.h(nk5Var3, "lastSeenOn");
        zq3.h(nk5Var4, "neverShow");
        zq3.h(nk5Var5, "pointOfOrigin");
        zq3.h(nk5Var6, "savedArticle");
        zq3.h(nk5Var7, "snoozed");
        zq3.h(nk5Var8, "snoozedOn");
        zq3.h(nk5Var9, "started");
        zq3.h(nk5Var10, "viewCount");
        return new SubscriberOnboardingV2Input(nk5Var, nk5Var2, nk5Var3, nk5Var4, nk5Var5, nk5Var6, nk5Var7, nk5Var8, nk5Var9, nk5Var10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriberOnboardingV2Input)) {
            return false;
        }
        SubscriberOnboardingV2Input subscriberOnboardingV2Input = (SubscriberOnboardingV2Input) obj;
        return zq3.c(this.completed, subscriberOnboardingV2Input.completed) && zq3.c(this.interacted, subscriberOnboardingV2Input.interacted) && zq3.c(this.lastSeenOn, subscriberOnboardingV2Input.lastSeenOn) && zq3.c(this.neverShow, subscriberOnboardingV2Input.neverShow) && zq3.c(this.pointOfOrigin, subscriberOnboardingV2Input.pointOfOrigin) && zq3.c(this.savedArticle, subscriberOnboardingV2Input.savedArticle) && zq3.c(this.snoozed, subscriberOnboardingV2Input.snoozed) && zq3.c(this.snoozedOn, subscriberOnboardingV2Input.snoozedOn) && zq3.c(this.started, subscriberOnboardingV2Input.started) && zq3.c(this.viewCount, subscriberOnboardingV2Input.viewCount);
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

    public final nk5 getNeverShow() {
        return this.neverShow;
    }

    public final nk5 getPointOfOrigin() {
        return this.pointOfOrigin;
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

    public final nk5 getViewCount() {
        return this.viewCount;
    }

    public int hashCode() {
        return (((((((((((((((((this.completed.hashCode() * 31) + this.interacted.hashCode()) * 31) + this.lastSeenOn.hashCode()) * 31) + this.neverShow.hashCode()) * 31) + this.pointOfOrigin.hashCode()) * 31) + this.savedArticle.hashCode()) * 31) + this.snoozed.hashCode()) * 31) + this.snoozedOn.hashCode()) * 31) + this.started.hashCode()) * 31) + this.viewCount.hashCode();
    }

    public String toString() {
        return "SubscriberOnboardingV2Input(completed=" + this.completed + ", interacted=" + this.interacted + ", lastSeenOn=" + this.lastSeenOn + ", neverShow=" + this.neverShow + ", pointOfOrigin=" + this.pointOfOrigin + ", savedArticle=" + this.savedArticle + ", snoozed=" + this.snoozed + ", snoozedOn=" + this.snoozedOn + ", started=" + this.started + ", viewCount=" + this.viewCount + ")";
    }

    public SubscriberOnboardingV2Input(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, nk5 nk5Var5, nk5 nk5Var6, nk5 nk5Var7, nk5 nk5Var8, nk5 nk5Var9, nk5 nk5Var10) {
        zq3.h(nk5Var, "completed");
        zq3.h(nk5Var2, "interacted");
        zq3.h(nk5Var3, "lastSeenOn");
        zq3.h(nk5Var4, "neverShow");
        zq3.h(nk5Var5, "pointOfOrigin");
        zq3.h(nk5Var6, "savedArticle");
        zq3.h(nk5Var7, "snoozed");
        zq3.h(nk5Var8, "snoozedOn");
        zq3.h(nk5Var9, "started");
        zq3.h(nk5Var10, "viewCount");
        this.completed = nk5Var;
        this.interacted = nk5Var2;
        this.lastSeenOn = nk5Var3;
        this.neverShow = nk5Var4;
        this.pointOfOrigin = nk5Var5;
        this.savedArticle = nk5Var6;
        this.snoozed = nk5Var7;
        this.snoozedOn = nk5Var8;
        this.started = nk5Var9;
        this.viewCount = nk5Var10;
    }

    public /* synthetic */ SubscriberOnboardingV2Input(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, nk5 nk5Var5, nk5 nk5Var6, nk5 nk5Var7, nk5 nk5Var8, nk5 nk5Var9, nk5 nk5Var10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? nk5.a.b : nk5Var, (i & 2) != 0 ? nk5.a.b : nk5Var2, (i & 4) != 0 ? nk5.a.b : nk5Var3, (i & 8) != 0 ? nk5.a.b : nk5Var4, (i & 16) != 0 ? nk5.a.b : nk5Var5, (i & 32) != 0 ? nk5.a.b : nk5Var6, (i & 64) != 0 ? nk5.a.b : nk5Var7, (i & 128) != 0 ? nk5.a.b : nk5Var8, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? nk5.a.b : nk5Var9, (i & 512) != 0 ? nk5.a.b : nk5Var10);
    }
}
