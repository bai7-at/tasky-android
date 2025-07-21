package defpackage;

import com.facebook.AuthenticationTokenClaims;
import java.util.List;

/* loaded from: classes4.dex */
public final class bh5 {
    private final int a;
    private final String b;
    private final String c;
    private final String d;
    private final List e;

    public bh5(int i, String str, String str2, String str3, List list) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str2, "title");
        zq3.h(str3, "description");
        zq3.h(list, "interests");
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
    }

    public final String a() {
        return this.d;
    }

    public final int b() {
        return this.a;
    }

    public final List c() {
        return this.e;
    }

    public final String d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh5)) {
            return false;
        }
        bh5 bh5Var = (bh5) obj;
        return this.a == bh5Var.a && zq3.c(this.b, bh5Var.b) && zq3.c(this.c, bh5Var.c) && zq3.c(this.d, bh5Var.d) && zq3.c(this.e, bh5Var.e);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "OnboardingTopic(id=" + this.a + ", name=" + this.b + ", title=" + this.c + ", description=" + this.d + ", interests=" + this.e + ")";
    }
}
