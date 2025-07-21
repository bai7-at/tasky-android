package defpackage;

import io.embrace.android.embracesdk.gating.SessionGatingKeys;
import java.util.List;
import org.threeten.bp.Instant;

/* loaded from: classes4.dex */
public final class bq3 {
    private final fp3 a;
    private final List b;
    private final Instant c;

    public bq3(fp3 fp3Var, List list, Instant instant) {
        zq3.h(list, SessionGatingKeys.FULL_SESSION_ERROR_LOGS);
        zq3.h(instant, "fetchingDate");
        this.a = fp3Var;
        this.b = list;
        this.c = instant;
    }

    public final List a() {
        return this.b;
    }

    public final Instant b() {
        return this.c;
    }

    public final fp3 c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq3)) {
            return false;
        }
        bq3 bq3Var = (bq3) obj;
        return zq3.c(this.a, bq3Var.a) && zq3.c(this.b, bq3Var.b) && zq3.c(this.c, bq3Var.c);
    }

    public int hashCode() {
        fp3 fp3Var = this.a;
        return ((((fp3Var == null ? 0 : fp3Var.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "InterestResponse(interests=" + this.a + ", errors=" + this.b + ", fetchingDate=" + this.c + ")";
    }
}
