package defpackage;

/* loaded from: classes.dex */
public final class z49 extends au8 {
    private final String a;

    public z49(String str) {
        super(null);
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z49) && zq3.c(this.a, ((z49) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.a + ')';
    }
}
