package defpackage;

/* loaded from: classes.dex */
public final class zn8 {
    private final long a;
    private final long b;
    private final int c;

    public zn8(long j, long j2, int i) {
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final long a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public final int c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn8)) {
            return false;
        }
        zn8 zn8Var = (zn8) obj;
        return this.a == zn8Var.a && this.b == zn8Var.b && this.c == zn8Var.c;
    }

    public int hashCode() {
        return (((Long.hashCode(this.a) * 31) + Long.hashCode(this.b)) * 31) + Integer.hashCode(this.c);
    }

    public String toString() {
        return "Topic { " + ("TaxonomyVersion=" + this.a + ", ModelVersion=" + this.b + ", TopicCode=" + this.c + " }");
    }
}
