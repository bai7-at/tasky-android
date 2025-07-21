package defpackage;

/* loaded from: classes4.dex */
public final class rb6 {
    private final String a;

    public rb6(String str) {
        zq3.h(str, "description");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rb6) && zq3.c(this.a, ((rb6) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "User " + this.a;
    }
}
