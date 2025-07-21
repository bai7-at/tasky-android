package type;

import defpackage.nk5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class MessageCapInput {
    private final nk5 dismissed;
    private final nk5 lastSeenOn;
    private final nk5 viewCount;

    public MessageCapInput() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ MessageCapInput copy$default(MessageCapInput messageCapInput, nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, int i, Object obj) {
        if ((i & 1) != 0) {
            nk5Var = messageCapInput.dismissed;
        }
        if ((i & 2) != 0) {
            nk5Var2 = messageCapInput.lastSeenOn;
        }
        if ((i & 4) != 0) {
            nk5Var3 = messageCapInput.viewCount;
        }
        return messageCapInput.copy(nk5Var, nk5Var2, nk5Var3);
    }

    public final nk5 component1() {
        return this.dismissed;
    }

    public final nk5 component2() {
        return this.lastSeenOn;
    }

    public final nk5 component3() {
        return this.viewCount;
    }

    public final MessageCapInput copy(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3) {
        zq3.h(nk5Var, "dismissed");
        zq3.h(nk5Var2, "lastSeenOn");
        zq3.h(nk5Var3, "viewCount");
        return new MessageCapInput(nk5Var, nk5Var2, nk5Var3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageCapInput)) {
            return false;
        }
        MessageCapInput messageCapInput = (MessageCapInput) obj;
        return zq3.c(this.dismissed, messageCapInput.dismissed) && zq3.c(this.lastSeenOn, messageCapInput.lastSeenOn) && zq3.c(this.viewCount, messageCapInput.viewCount);
    }

    public final nk5 getDismissed() {
        return this.dismissed;
    }

    public final nk5 getLastSeenOn() {
        return this.lastSeenOn;
    }

    public final nk5 getViewCount() {
        return this.viewCount;
    }

    public int hashCode() {
        return (((this.dismissed.hashCode() * 31) + this.lastSeenOn.hashCode()) * 31) + this.viewCount.hashCode();
    }

    public String toString() {
        return "MessageCapInput(dismissed=" + this.dismissed + ", lastSeenOn=" + this.lastSeenOn + ", viewCount=" + this.viewCount + ")";
    }

    public MessageCapInput(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3) {
        zq3.h(nk5Var, "dismissed");
        zq3.h(nk5Var2, "lastSeenOn");
        zq3.h(nk5Var3, "viewCount");
        this.dismissed = nk5Var;
        this.lastSeenOn = nk5Var2;
        this.viewCount = nk5Var3;
    }

    public /* synthetic */ MessageCapInput(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? nk5.a.b : nk5Var, (i & 2) != 0 ? nk5.a.b : nk5Var2, (i & 4) != 0 ? nk5.a.b : nk5Var3);
    }
}
