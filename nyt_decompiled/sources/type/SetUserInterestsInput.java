package type;

import defpackage.zq3;

/* loaded from: classes5.dex */
public final class SetUserInterestsInput {
    private final java.util.List<Integer> interestIds;

    public SetUserInterestsInput(java.util.List<Integer> list) {
        zq3.h(list, "interestIds");
        this.interestIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SetUserInterestsInput copy$default(SetUserInterestsInput setUserInterestsInput, java.util.List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = setUserInterestsInput.interestIds;
        }
        return setUserInterestsInput.copy(list);
    }

    public final java.util.List<Integer> component1() {
        return this.interestIds;
    }

    public final SetUserInterestsInput copy(java.util.List<Integer> list) {
        zq3.h(list, "interestIds");
        return new SetUserInterestsInput(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SetUserInterestsInput) && zq3.c(this.interestIds, ((SetUserInterestsInput) obj).interestIds);
    }

    public final java.util.List<Integer> getInterestIds() {
        return this.interestIds;
    }

    public int hashCode() {
        return this.interestIds.hashCode();
    }

    public String toString() {
        return "SetUserInterestsInput(interestIds=" + this.interestIds + ")";
    }
}
