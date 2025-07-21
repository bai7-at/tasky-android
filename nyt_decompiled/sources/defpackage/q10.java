package defpackage;

/* loaded from: classes5.dex */
final class q10 extends jh3 {
    private final String a;
    private final hv b;
    private final long c;
    private final int d;

    q10(String str, hv hvVar, long j, int i) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.a = str;
        if (hvVar == null) {
            throw new NullPointerException("Null attributes");
        }
        this.b = hvVar;
        this.c = j;
        this.d = i;
    }

    @Override // defpackage.w32
    public hv a() {
        return this.b;
    }

    @Override // defpackage.w32
    public int c() {
        return this.d;
    }

    @Override // defpackage.w32
    public long e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jh3)) {
            return false;
        }
        jh3 jh3Var = (jh3) obj;
        return this.a.equals(jh3Var.getName()) && this.b.equals(jh3Var.a()) && this.c == jh3Var.e() && this.d == jh3Var.c();
    }

    @Override // defpackage.w32
    public String getName() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        return this.d ^ ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public String toString() {
        return "ImmutableEventData{name=" + this.a + ", attributes=" + this.b + ", epochNanos=" + this.c + ", totalAttributeCount=" + this.d + "}";
    }
}
