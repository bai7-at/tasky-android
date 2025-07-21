package defpackage;

/* loaded from: classes4.dex */
public final class rb8 {
    private final String a;
    private final String b;

    public rb8(String str, String str2) {
        zq3.h(str, "displayString");
        zq3.h(str2, "tagString");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb8)) {
            return false;
        }
        rb8 rb8Var = (rb8) obj;
        return zq3.c(this.a, rb8Var.a) && zq3.c(this.b, rb8Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "SubscriptionString(displayString=" + this.a + ", tagString=" + this.b + ")";
    }
}
