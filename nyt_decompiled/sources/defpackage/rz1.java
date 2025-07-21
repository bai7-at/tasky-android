package defpackage;

/* loaded from: classes4.dex */
public final class rz1 {
    private final int a;
    private final String b;
    private final String c;
    private final Throwable d;

    public rz1(int i, String str, String str2, Throwable th) {
        zq3.h(str2, "message");
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = th;
    }

    public final String a() {
        return this.c;
    }

    public final int b() {
        return this.a;
    }

    public final Throwable c() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz1)) {
            return false;
        }
        rz1 rz1Var = (rz1) obj;
        return this.a == rz1Var.a && zq3.c(this.b, rz1Var.b) && zq3.c(this.c, rz1Var.c) && zq3.c(this.d, rz1Var.d);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31;
        Throwable th = this.d;
        return hashCode2 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "EmbraceTimberData(priority=" + this.a + ", tag=" + this.b + ", message=" + this.c + ", t=" + this.d + ")";
    }
}
