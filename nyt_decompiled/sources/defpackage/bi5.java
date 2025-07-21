package defpackage;

/* loaded from: classes.dex */
public final class bi5 {
    private final String a;

    public bi5(String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bi5) && zq3.c(this.a, ((bi5) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "OpaqueKey(key=" + this.a + ')';
    }
}
