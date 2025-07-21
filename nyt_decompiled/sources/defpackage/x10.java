package defpackage;

/* loaded from: classes2.dex */
final class x10 extends z84 {
    private final long a;

    x10(long j) {
        this.a = j;
    }

    @Override // defpackage.z84
    public long c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof z84) && this.a == ((z84) obj).c();
    }

    public int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.a + "}";
    }
}
