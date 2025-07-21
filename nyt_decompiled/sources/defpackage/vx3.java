package defpackage;

/* loaded from: classes3.dex */
public final class vx3 {
    private final long a;
    private final Long b;

    public vx3(long j, Long l) {
        this.a = j;
        this.b = l;
    }

    public final long a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx3)) {
            return false;
        }
        vx3 vx3Var = (vx3) obj;
        return this.a == vx3Var.a && zq3.c(this.b, vx3Var.b);
    }

    public int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        Long l = this.b;
        return i + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "KronosTime(posixTimeMs=" + this.a + ", timeSinceLastNtpSyncMs=" + this.b + ")";
    }
}
