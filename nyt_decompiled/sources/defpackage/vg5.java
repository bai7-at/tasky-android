package defpackage;

/* loaded from: classes3.dex */
public final class vg5 implements rp2 {
    private final String a;
    private final String b;

    public vg5(String str, String str2) {
        zq3.h(str, "__typename");
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
        if (!(obj instanceof vg5)) {
            return false;
        }
        vg5 vg5Var = (vg5) obj;
        return zq3.c(this.a, vg5Var.a) && zq3.c(this.b, vg5Var.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "OnUserStateError(__typename=" + this.a + ", message=" + this.b + ")";
    }
}
