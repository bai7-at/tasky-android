package defpackage;

/* loaded from: classes2.dex */
public final class p36 {
    private final boolean a;

    public p36(boolean z) {
        this.a = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p36) && this.a == ((p36) obj).a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public String toString() {
        return "ProcessInfo(isMainProcess=" + this.a + ")";
    }
}
