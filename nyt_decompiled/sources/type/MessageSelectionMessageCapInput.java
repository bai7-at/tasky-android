package type;

import defpackage.nk5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class MessageSelectionMessageCapInput {
    private final nk5 audience;
    private final nk5 campaign;
    private final nk5 dismissed;
    private final nk5 lastSeenOn;
    private final nk5 unit;
    private final nk5 viewCount;

    public MessageSelectionMessageCapInput() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ MessageSelectionMessageCapInput copy$default(MessageSelectionMessageCapInput messageSelectionMessageCapInput, nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, nk5 nk5Var5, nk5 nk5Var6, int i, Object obj) {
        if ((i & 1) != 0) {
            nk5Var = messageSelectionMessageCapInput.audience;
        }
        if ((i & 2) != 0) {
            nk5Var2 = messageSelectionMessageCapInput.campaign;
        }
        nk5 nk5Var7 = nk5Var2;
        if ((i & 4) != 0) {
            nk5Var3 = messageSelectionMessageCapInput.dismissed;
        }
        nk5 nk5Var8 = nk5Var3;
        if ((i & 8) != 0) {
            nk5Var4 = messageSelectionMessageCapInput.lastSeenOn;
        }
        nk5 nk5Var9 = nk5Var4;
        if ((i & 16) != 0) {
            nk5Var5 = messageSelectionMessageCapInput.unit;
        }
        nk5 nk5Var10 = nk5Var5;
        if ((i & 32) != 0) {
            nk5Var6 = messageSelectionMessageCapInput.viewCount;
        }
        return messageSelectionMessageCapInput.copy(nk5Var, nk5Var7, nk5Var8, nk5Var9, nk5Var10, nk5Var6);
    }

    public final nk5 component1() {
        return this.audience;
    }

    public final nk5 component2() {
        return this.campaign;
    }

    public final nk5 component3() {
        return this.dismissed;
    }

    public final nk5 component4() {
        return this.lastSeenOn;
    }

    public final nk5 component5() {
        return this.unit;
    }

    public final nk5 component6() {
        return this.viewCount;
    }

    public final MessageSelectionMessageCapInput copy(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, nk5 nk5Var5, nk5 nk5Var6) {
        zq3.h(nk5Var, "audience");
        zq3.h(nk5Var2, "campaign");
        zq3.h(nk5Var3, "dismissed");
        zq3.h(nk5Var4, "lastSeenOn");
        zq3.h(nk5Var5, "unit");
        zq3.h(nk5Var6, "viewCount");
        return new MessageSelectionMessageCapInput(nk5Var, nk5Var2, nk5Var3, nk5Var4, nk5Var5, nk5Var6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageSelectionMessageCapInput)) {
            return false;
        }
        MessageSelectionMessageCapInput messageSelectionMessageCapInput = (MessageSelectionMessageCapInput) obj;
        return zq3.c(this.audience, messageSelectionMessageCapInput.audience) && zq3.c(this.campaign, messageSelectionMessageCapInput.campaign) && zq3.c(this.dismissed, messageSelectionMessageCapInput.dismissed) && zq3.c(this.lastSeenOn, messageSelectionMessageCapInput.lastSeenOn) && zq3.c(this.unit, messageSelectionMessageCapInput.unit) && zq3.c(this.viewCount, messageSelectionMessageCapInput.viewCount);
    }

    public final nk5 getAudience() {
        return this.audience;
    }

    public final nk5 getCampaign() {
        return this.campaign;
    }

    public final nk5 getDismissed() {
        return this.dismissed;
    }

    public final nk5 getLastSeenOn() {
        return this.lastSeenOn;
    }

    public final nk5 getUnit() {
        return this.unit;
    }

    public final nk5 getViewCount() {
        return this.viewCount;
    }

    public int hashCode() {
        return (((((((((this.audience.hashCode() * 31) + this.campaign.hashCode()) * 31) + this.dismissed.hashCode()) * 31) + this.lastSeenOn.hashCode()) * 31) + this.unit.hashCode()) * 31) + this.viewCount.hashCode();
    }

    public String toString() {
        return "MessageSelectionMessageCapInput(audience=" + this.audience + ", campaign=" + this.campaign + ", dismissed=" + this.dismissed + ", lastSeenOn=" + this.lastSeenOn + ", unit=" + this.unit + ", viewCount=" + this.viewCount + ")";
    }

    public MessageSelectionMessageCapInput(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, nk5 nk5Var5, nk5 nk5Var6) {
        zq3.h(nk5Var, "audience");
        zq3.h(nk5Var2, "campaign");
        zq3.h(nk5Var3, "dismissed");
        zq3.h(nk5Var4, "lastSeenOn");
        zq3.h(nk5Var5, "unit");
        zq3.h(nk5Var6, "viewCount");
        this.audience = nk5Var;
        this.campaign = nk5Var2;
        this.dismissed = nk5Var3;
        this.lastSeenOn = nk5Var4;
        this.unit = nk5Var5;
        this.viewCount = nk5Var6;
    }

    public /* synthetic */ MessageSelectionMessageCapInput(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, nk5 nk5Var5, nk5 nk5Var6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? nk5.a.b : nk5Var, (i & 2) != 0 ? nk5.a.b : nk5Var2, (i & 4) != 0 ? nk5.a.b : nk5Var3, (i & 8) != 0 ? nk5.a.b : nk5Var4, (i & 16) != 0 ? nk5.a.b : nk5Var5, (i & 32) != 0 ? nk5.a.b : nk5Var6);
    }
}
