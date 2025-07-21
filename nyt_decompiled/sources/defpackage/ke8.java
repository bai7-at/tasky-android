package defpackage;

/* loaded from: classes.dex */
public final class ke8 {
    public final String a;
    private final int b;
    public final int c;

    public ke8(String str, int i, int i2) {
        zq3.h(str, "workSpecId");
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final int a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke8)) {
            return false;
        }
        ke8 ke8Var = (ke8) obj;
        return zq3.c(this.a, ke8Var.a) && this.b == ke8Var.b && this.c == ke8Var.c;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c);
    }

    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.a + ", generation=" + this.b + ", systemId=" + this.c + ')';
    }
}
