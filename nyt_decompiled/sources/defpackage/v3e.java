package defpackage;

/* loaded from: classes3.dex */
public final class v3e implements t3e {
    private final String a;

    public v3e(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v3e) {
            return this.a.equals(((v3e) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
