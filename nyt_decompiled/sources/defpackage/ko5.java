package defpackage;

/* loaded from: classes.dex */
public final class ko5 {
    private final lo5 a;
    private final int b;
    private final int c;

    public ko5(lo5 lo5Var, int i, int i2) {
        this.a = lo5Var;
        this.b = i;
        this.c = i2;
    }

    public final int a() {
        return this.c;
    }

    public final lo5 b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko5)) {
            return false;
        }
        ko5 ko5Var = (ko5) obj;
        return zq3.c(this.a, ko5Var.a) && this.b == ko5Var.b && this.c == ko5Var.c;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c);
    }

    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ')';
    }
}
