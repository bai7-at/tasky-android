package defpackage;

/* loaded from: classes4.dex */
public final class e19 {
    private final boolean a;

    public e19(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e19) && this.a == ((e19) obj).a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public String toString() {
        return "UserState(isUserSubscribed=" + this.a + ")";
    }
}
