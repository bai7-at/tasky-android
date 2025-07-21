package type;

import defpackage.nk5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class BottomSheetInput {
    private final nk5 interacted;
    private final nk5 lastSeenOn;
    private final nk5 viewCount;

    public BottomSheetInput() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ BottomSheetInput copy$default(BottomSheetInput bottomSheetInput, nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, int i, Object obj) {
        if ((i & 1) != 0) {
            nk5Var = bottomSheetInput.interacted;
        }
        if ((i & 2) != 0) {
            nk5Var2 = bottomSheetInput.lastSeenOn;
        }
        if ((i & 4) != 0) {
            nk5Var3 = bottomSheetInput.viewCount;
        }
        return bottomSheetInput.copy(nk5Var, nk5Var2, nk5Var3);
    }

    public final nk5 component1() {
        return this.interacted;
    }

    public final nk5 component2() {
        return this.lastSeenOn;
    }

    public final nk5 component3() {
        return this.viewCount;
    }

    public final BottomSheetInput copy(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3) {
        zq3.h(nk5Var, "interacted");
        zq3.h(nk5Var2, "lastSeenOn");
        zq3.h(nk5Var3, "viewCount");
        return new BottomSheetInput(nk5Var, nk5Var2, nk5Var3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomSheetInput)) {
            return false;
        }
        BottomSheetInput bottomSheetInput = (BottomSheetInput) obj;
        return zq3.c(this.interacted, bottomSheetInput.interacted) && zq3.c(this.lastSeenOn, bottomSheetInput.lastSeenOn) && zq3.c(this.viewCount, bottomSheetInput.viewCount);
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
        return (((this.interacted.hashCode() * 31) + this.lastSeenOn.hashCode()) * 31) + this.viewCount.hashCode();
    }

    public String toString() {
        return "BottomSheetInput(interacted=" + this.interacted + ", lastSeenOn=" + this.lastSeenOn + ", viewCount=" + this.viewCount + ")";
    }

    public BottomSheetInput(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3) {
        zq3.h(nk5Var, "interacted");
        zq3.h(nk5Var2, "lastSeenOn");
        zq3.h(nk5Var3, "viewCount");
        this.interacted = nk5Var;
        this.lastSeenOn = nk5Var2;
        this.viewCount = nk5Var3;
    }

    public /* synthetic */ BottomSheetInput(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? nk5.a.b : nk5Var, (i & 2) != 0 ? nk5.a.b : nk5Var2, (i & 4) != 0 ? nk5.a.b : nk5Var3);
    }
}
