package defpackage;

/* loaded from: classes2.dex */
public final class wl8 {
    private final long a;
    private final long b;
    private final long c;
    private final long d;

    public wl8(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final long a() {
        return this.d;
    }

    public final long b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl8)) {
            return false;
        }
        wl8 wl8Var = (wl8) obj;
        return this.a == wl8Var.a && this.b == wl8Var.b && this.c == wl8Var.c && this.d == wl8Var.d;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.a) * 31) + Long.hashCode(this.b)) * 31) + Long.hashCode(this.c)) * 31) + Long.hashCode(this.d);
    }

    public String toString() {
        return "TimeInfo(deviceTimeNs=" + this.a + ", serverTimeNs=" + this.b + ", serverTimeOffsetNs=" + this.c + ", serverTimeOffsetMs=" + this.d + ")";
    }
}
