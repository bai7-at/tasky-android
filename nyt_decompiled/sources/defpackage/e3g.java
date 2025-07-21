package defpackage;

/* loaded from: classes3.dex */
public final class e3g {
    public final long a;
    public final long b;

    public e3g(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3g)) {
            return false;
        }
        e3g e3gVar = (e3g) obj;
        return this.a == e3gVar.a && this.b == e3gVar.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
