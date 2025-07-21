package defpackage;

/* loaded from: classes5.dex */
final class r10 extends ai3 {
    private final String b;
    private final String c;
    private final ap8 d;
    private final dp8 e;
    private final boolean f;
    private final boolean g;

    r10(String str, String str2, ap8 ap8Var, dp8 dp8Var, boolean z, boolean z2) {
        if (str == null) {
            throw new NullPointerException("Null traceId");
        }
        this.b = str;
        if (str2 == null) {
            throw new NullPointerException("Null spanId");
        }
        this.c = str2;
        if (ap8Var == null) {
            throw new NullPointerException("Null traceFlags");
        }
        this.d = ap8Var;
        if (dp8Var == null) {
            throw new NullPointerException("Null traceState");
        }
        this.e = dp8Var;
        this.f = z;
        this.g = z2;
    }

    @Override // defpackage.ai3, defpackage.xx7
    public boolean c() {
        return this.g;
    }

    @Override // defpackage.xx7
    public boolean d() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ai3)) {
            return false;
        }
        ai3 ai3Var = (ai3) obj;
        return this.b.equals(ai3Var.getTraceId()) && this.c.equals(ai3Var.getSpanId()) && this.d.equals(ai3Var.g()) && this.e.equals(ai3Var.f()) && this.f == ai3Var.d() && this.g == ai3Var.c();
    }

    @Override // defpackage.xx7
    public dp8 f() {
        return this.e;
    }

    @Override // defpackage.xx7
    public ap8 g() {
        return this.d;
    }

    @Override // defpackage.xx7
    public String getSpanId() {
        return this.c;
    }

    @Override // defpackage.xx7
    public String getTraceId() {
        return this.b;
    }

    public int hashCode() {
        return ((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237);
    }

    public String toString() {
        return "ImmutableSpanContext{traceId=" + this.b + ", spanId=" + this.c + ", traceFlags=" + this.d + ", traceState=" + this.e + ", remote=" + this.f + ", valid=" + this.g + "}";
    }
}
