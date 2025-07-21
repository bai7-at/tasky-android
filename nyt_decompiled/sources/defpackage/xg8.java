package defpackage;

/* loaded from: classes4.dex */
public final class xg8 {
    private final String a;
    private final String b;

    public xg8(String str, String str2) {
        zq3.h(str, "tcString");
        zq3.h(str2, "noticeVersion");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg8)) {
            return false;
        }
        xg8 xg8Var = (xg8) obj;
        return zq3.c(this.a, xg8Var.a) && zq3.c(this.b, xg8Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "TcfPreferenceInputData(tcString=" + this.a + ", noticeVersion=" + this.b + ")";
    }
}
