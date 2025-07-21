package defpackage;

/* loaded from: classes4.dex */
public final class gj3 {
    private final String a;

    public gj3(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.a != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gj3) && zq3.c(this.a, ((gj3) obj).a);
    }

    public int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "IndicatorImage(value=" + this.a + ")";
    }
}
