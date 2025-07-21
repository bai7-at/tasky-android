package defpackage;

/* loaded from: classes4.dex */
public final class mm9 {
    private final boolean a;

    public mm9(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mm9) && this.a == ((mm9) obj).a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public String toString() {
        return "YouTabPreferences(isNew=" + this.a + ")";
    }
}
