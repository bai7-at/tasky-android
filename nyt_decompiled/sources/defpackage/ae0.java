package defpackage;

import java.util.Date;

/* loaded from: classes4.dex */
public final class ae0 {
    private final String a;
    private final Date b;
    private final Date c;

    public ae0(String str, Date date, Date date2) {
        zq3.h(str, "buildType");
        zq3.h(date, "buildDate");
        zq3.h(date2, "expireDate");
        this.a = str;
        this.b = date;
        this.c = date2;
    }

    public final Date a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final Date c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae0)) {
            return false;
        }
        ae0 ae0Var = (ae0) obj;
        return zq3.c(this.a, ae0Var.a) && zq3.c(this.b, ae0Var.b) && zq3.c(this.c, ae0Var.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "BuildInfo(buildType=" + this.a + ", buildDate=" + this.b + ", expireDate=" + this.c + ")";
    }
}
