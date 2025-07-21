package defpackage;

/* loaded from: classes4.dex */
public final class gy0 {
    private final String id;
    private final String value;

    public gy0(String str, String str2) {
        zq3.h(str, "id");
        zq3.h(str2, "value");
        this.id = str;
        this.value = str2;
    }

    public final String a() {
        return this.id;
    }

    public final String b() {
        return this.value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy0)) {
            return false;
        }
        gy0 gy0Var = (gy0) obj;
        return zq3.c(this.id, gy0Var.id) && zq3.c(this.value, gy0Var.value);
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return "Cookie(id=" + this.id + ", value=" + this.value + ")";
    }
}
