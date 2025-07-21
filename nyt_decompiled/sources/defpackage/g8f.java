package defpackage;

/* loaded from: classes3.dex */
public final class g8f {
    public final String a;
    public final l6a b;
    public final l6a c;
    public final int d;
    public final int e;

    public g8f(String str, l6a l6aVar, l6a l6aVar2, int i, int i2) {
        boolean z = true;
        if (i != 0) {
            if (i2 == 0) {
                i2 = 0;
            } else {
                z = false;
            }
        }
        wad.d(z);
        wad.c(str);
        this.a = str;
        this.b = l6aVar;
        l6aVar2.getClass();
        this.c = l6aVar2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g8f.class == obj.getClass()) {
            g8f g8fVar = (g8f) obj;
            if (this.d == g8fVar.d && this.e == g8fVar.e && this.a.equals(g8fVar.a) && this.b.equals(g8fVar.b) && this.c.equals(g8fVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.d + 527) * 31) + this.e) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
