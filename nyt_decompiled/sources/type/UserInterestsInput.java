package type;

import defpackage.zq3;

/* loaded from: classes5.dex */
public final class UserInterestsInput {
    private final java.util.List<Integer> interestIds;

    public UserInterestsInput(java.util.List<Integer> list) {
        zq3.h(list, "interestIds");
        this.interestIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserInterestsInput copy$default(UserInterestsInput userInterestsInput, java.util.List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = userInterestsInput.interestIds;
        }
        return userInterestsInput.copy(list);
    }

    public final java.util.List<Integer> component1() {
        return this.interestIds;
    }

    public final UserInterestsInput copy(java.util.List<Integer> list) {
        zq3.h(list, "interestIds");
        return new UserInterestsInput(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserInterestsInput) && zq3.c(this.interestIds, ((UserInterestsInput) obj).interestIds);
    }

    public final java.util.List<Integer> getInterestIds() {
        return this.interestIds;
    }

    public int hashCode() {
        return this.interestIds.hashCode();
    }

    public String toString() {
        return "UserInterestsInput(interestIds=" + this.interestIds + ")";
    }
}
