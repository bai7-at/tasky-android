package defpackage;

/* loaded from: classes4.dex */
public final class an8 {
    private final e52 a;
    private final ue4 b;

    public an8(e52 e52Var, ue4 ue4Var) {
        zq3.h(e52Var, "subject");
        zq3.h(ue4Var, "extraData");
        this.a = e52Var;
        this.b = ue4Var;
    }

    public final ue4 a() {
        return this.b;
    }

    public final e52 b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an8)) {
            return false;
        }
        an8 an8Var = (an8) obj;
        return zq3.c(this.a, an8Var.a) && zq3.c(this.b, an8Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "TodayEventItem(subject=" + this.a + ", extraData=" + this.b + ")";
    }
}
