package defpackage;

/* loaded from: classes2.dex */
public final class cx6 {
    public static final cx6 b = new cx6(false);
    public final boolean a;

    public cx6(boolean z) {
        this.a = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && cx6.class == obj.getClass() && this.a == ((cx6) obj).a;
    }

    public int hashCode() {
        return !this.a ? 1 : 0;
    }
}
