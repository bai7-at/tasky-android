package defpackage;

import com.nytimes.android.interests.InterestsOrder;

/* loaded from: classes4.dex */
public final class gq3 {
    private final InterestsOrder a;
    private final long b;

    public gq3(InterestsOrder interestsOrder, long j) {
        zq3.h(interestsOrder, "interestsOrder");
        this.a = interestsOrder;
        this.b = j;
    }

    public final InterestsOrder a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq3)) {
            return false;
        }
        gq3 gq3Var = (gq3) obj;
        return zq3.c(this.a, gq3Var.a) && this.b == gq3Var.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Long.hashCode(this.b);
    }

    public String toString() {
        return "InterestsPreferences(interestsOrder=" + this.a + ", lastAutoAddedAtEpochSeconds=" + this.b + ")";
    }
}
