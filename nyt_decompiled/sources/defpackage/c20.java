package defpackage;

import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.sdk.logs.data.Body;

/* loaded from: classes5.dex */
final class c20 extends xc7 {
    private final bz6 a;
    private final lm3 b;
    private final long c;
    private final long d;
    private final xx7 e;
    private final Severity f;
    private final String g;
    private final Body h;
    private final hv i;
    private final int j;

    c20(bz6 bz6Var, lm3 lm3Var, long j, long j2, xx7 xx7Var, Severity severity, String str, Body body, hv hvVar, int i) {
        if (bz6Var == null) {
            throw new NullPointerException("Null resource");
        }
        this.a = bz6Var;
        if (lm3Var == null) {
            throw new NullPointerException("Null instrumentationScopeInfo");
        }
        this.b = lm3Var;
        this.c = j;
        this.d = j2;
        if (xx7Var == null) {
            throw new NullPointerException("Null spanContext");
        }
        this.e = xx7Var;
        if (severity == null) {
            throw new NullPointerException("Null severity");
        }
        this.f = severity;
        this.g = str;
        if (body == null) {
            throw new NullPointerException("Null body");
        }
        this.h = body;
        if (hvVar == null) {
            throw new NullPointerException("Null attributes");
        }
        this.i = hvVar;
        this.j = i;
    }

    @Override // defpackage.s84
    public hv a() {
        return this.i;
    }

    @Override // defpackage.s84
    public xx7 b() {
        return this.e;
    }

    @Override // defpackage.s84
    public int c() {
        return this.j;
    }

    @Override // defpackage.s84
    public Severity d() {
        return this.f;
    }

    @Override // defpackage.s84
    public long e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xc7)) {
            return false;
        }
        xc7 xc7Var = (xc7) obj;
        return this.a.equals(xc7Var.i()) && this.b.equals(xc7Var.g()) && this.c == xc7Var.f() && this.d == xc7Var.e() && this.e.equals(xc7Var.b()) && this.f.equals(xc7Var.d()) && ((str = this.g) != null ? str.equals(xc7Var.h()) : xc7Var.h() == null) && this.h.equals(xc7Var.getBody()) && this.i.equals(xc7Var.a()) && this.j == xc7Var.c();
    }

    @Override // defpackage.s84
    public long f() {
        return this.c;
    }

    @Override // defpackage.s84
    public lm3 g() {
        return this.b;
    }

    @Override // defpackage.s84
    public Body getBody() {
        return this.h;
    }

    @Override // defpackage.s84
    public String h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        int i = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.d;
        int hashCode2 = (((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
        String str = this.g;
        return this.j ^ ((((((hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003);
    }

    @Override // defpackage.s84
    public bz6 i() {
        return this.a;
    }

    public String toString() {
        return "SdkLogRecordData{resource=" + this.a + ", instrumentationScopeInfo=" + this.b + ", timestampEpochNanos=" + this.c + ", observedTimestampEpochNanos=" + this.d + ", spanContext=" + this.e + ", severity=" + this.f + ", severityText=" + this.g + ", body=" + this.h + ", attributes=" + this.i + ", totalAttributeCount=" + this.j + "}";
    }
}
