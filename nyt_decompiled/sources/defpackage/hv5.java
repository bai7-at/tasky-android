package defpackage;

/* loaded from: classes4.dex */
public final class hv5 {
    private final boolean a;

    public hv5(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hv5) && this.a == ((hv5) obj).a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public String toString() {
        return "PlayTabPreferences(isNew=" + this.a + ")";
    }
}
