package defpackage;

/* loaded from: classes4.dex */
public final class xt2 {
    private final String a;
    private final String b;
    private final String c;

    public xt2(String str, String str2, String str3) {
        zq3.h(str, "gameName");
        zq3.h(str3, "analyticsPuzzleId");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt2)) {
            return false;
        }
        xt2 xt2Var = (xt2) obj;
        return zq3.c(this.a, xt2Var.a) && zq3.c(this.b, xt2Var.b) && zq3.c(this.c, xt2Var.c);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "GameDataResponse(gameName=" + this.a + ", puzzleId=" + this.b + ", analyticsPuzzleId=" + this.c + ")";
    }
}
