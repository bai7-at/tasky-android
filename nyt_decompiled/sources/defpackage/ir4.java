package defpackage;

import com.facebook.AuthenticationTokenClaims;
import org.threeten.bp.Instant;

/* loaded from: classes4.dex */
public final class ir4 {
    private final String a;
    private final String b;
    private final int c;
    private final Instant d;

    public ir4(String str, String str2, int i, Instant instant) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = instant;
    }

    public final String a() {
        return this.b;
    }

    public final Instant b() {
        return this.d;
    }

    public final String c() {
        return this.a;
    }

    public final int d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ir4)) {
            return false;
        }
        ir4 ir4Var = (ir4) obj;
        return zq3.c(this.a, ir4Var.a) && zq3.c(this.b, ir4Var.b) && this.c == ir4Var.c && zq3.c(this.d, ir4Var.d);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.c)) * 31;
        Instant instant = this.d;
        return hashCode2 + (instant != null ? instant.hashCode() : 0);
    }

    public String toString() {
        return "MessageHistoryItem(name=" + this.a + ", audience=" + this.b + ", viewCount=" + this.c + ", lastSeenOn=" + this.d + ")";
    }
}
