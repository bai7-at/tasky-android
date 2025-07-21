package defpackage;

import io.opentelemetry.api.trace.StatusCode;

/* loaded from: classes5.dex */
final class s10 extends bi3 {
    private final StatusCode d;
    private final String e;

    s10(StatusCode statusCode, String str) {
        if (statusCode == null) {
            throw new NullPointerException("Null statusCode");
        }
        this.d = statusCode;
        if (str == null) {
            throw new NullPointerException("Null description");
        }
        this.e = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bi3)) {
            return false;
        }
        bi3 bi3Var = (bi3) obj;
        return this.d.equals(bi3Var.getStatusCode()) && this.e.equals(bi3Var.getDescription());
    }

    @Override // defpackage.v18
    public String getDescription() {
        return this.e;
    }

    @Override // defpackage.v18
    public StatusCode getStatusCode() {
        return this.d;
    }

    public int hashCode() {
        return this.e.hashCode() ^ ((this.d.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "ImmutableStatusData{statusCode=" + this.d + ", description=" + this.e + "}";
    }
}
