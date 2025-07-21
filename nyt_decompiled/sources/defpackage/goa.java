package defpackage;

import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.internal.Objects;

/* loaded from: classes2.dex */
public final class goa {
    public final String a;
    public final double b;
    public final double c;
    public final double d;
    public final int e;

    public goa(String str, double d, double d2, double d3, int i) {
        this.a = str;
        this.c = d;
        this.b = d2;
        this.d = d3;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof goa)) {
            return false;
        }
        goa goaVar = (goa) obj;
        return Objects.equal(this.a, goaVar.a) && this.b == goaVar.b && this.c == goaVar.c && this.e == goaVar.e && Double.compare(this.d, goaVar.d) == 0;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, Double.valueOf(this.b), Double.valueOf(this.c), Double.valueOf(this.d), Integer.valueOf(this.e));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add(AuthenticationTokenClaims.JSON_KEY_NAME, this.a).add("minBound", Double.valueOf(this.c)).add("maxBound", Double.valueOf(this.b)).add("percent", Double.valueOf(this.d)).add("count", Integer.valueOf(this.e)).toString();
    }
}
