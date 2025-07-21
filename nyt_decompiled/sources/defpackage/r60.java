package defpackage;

/* loaded from: classes2.dex */
public final class r60 {
    private final long a;
    private final boolean b;
    private final long c;

    public r60(long j, boolean z, long j2) {
        this.a = j;
        this.b = z;
        this.c = j2;
    }

    public final long a() {
        return this.c;
    }

    public final boolean b() {
        return this.b;
    }

    public final long c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r60)) {
            return false;
        }
        r60 r60Var = (r60) obj;
        return this.a == r60Var.a && this.b == r60Var.b && this.c == r60Var.c;
    }

    public int hashCode() {
        return (((Long.hashCode(this.a) * 31) + Boolean.hashCode(this.b)) * 31) + Long.hashCode(this.c);
    }

    public String toString() {
        return "BatchClosedMetadata(lastTimeWasUsedInMs=" + this.a + ", forcedNew=" + this.b + ", eventsCount=" + this.c + ")";
    }
}
