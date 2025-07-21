package defpackage;

/* loaded from: classes3.dex */
final class n1g {
    public final int a;
    public final boolean b;

    public n1g(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n1g.class == obj.getClass()) {
            n1g n1gVar = (n1g) obj;
            if (this.a == n1gVar.a && this.b == n1gVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
