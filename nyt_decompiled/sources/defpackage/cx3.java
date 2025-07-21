package defpackage;

/* loaded from: classes3.dex */
public final class cx3 implements rp2 {
    private final String a;

    public cx3(String str) {
        zq3.h(str, "kicker");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cx3) && zq3.c(this.a, ((cx3) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "Kicker(kicker=" + this.a + ")";
    }
}
