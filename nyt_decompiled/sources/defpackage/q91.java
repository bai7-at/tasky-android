package defpackage;

/* loaded from: classes.dex */
public final class q91 {
    private long a;
    private float b;

    public q91(long j, float f) {
        this.a = j;
        this.b = f;
    }

    public final float a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public final void c(float f) {
        this.b = f;
    }

    public final void d(long j) {
        this.a = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q91)) {
            return false;
        }
        q91 q91Var = (q91) obj;
        return this.a == q91Var.a && Float.compare(this.b, q91Var.b) == 0;
    }

    public int hashCode() {
        return (Long.hashCode(this.a) * 31) + Float.hashCode(this.b);
    }

    public String toString() {
        return "DataPointAtTime(time=" + this.a + ", dataPoint=" + this.b + ')';
    }
}
