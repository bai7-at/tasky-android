package defpackage;

/* loaded from: classes.dex */
public final class am1 implements fy1 {
    private final int a;
    private final int b;

    public am1(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.").toString());
        }
    }

    @Override // defpackage.fy1
    public void a(ly1 ly1Var) {
        int j = ly1Var.j();
        int i = this.b;
        int i2 = j + i;
        if (((j ^ i2) & (i ^ i2)) < 0) {
            i2 = ly1Var.h();
        }
        ly1Var.b(ly1Var.j(), Math.min(i2, ly1Var.h()));
        int k = ly1Var.k();
        int i3 = this.a;
        int i4 = k - i3;
        if (((i3 ^ k) & (k ^ i4)) < 0) {
            i4 = 0;
        }
        ly1Var.b(Math.max(0, i4), ly1Var.k());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am1)) {
            return false;
        }
        am1 am1Var = (am1) obj;
        return this.a == am1Var.a && this.b == am1Var.b;
    }

    public int hashCode() {
        return (this.a * 31) + this.b;
    }

    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.a + ", lengthAfterCursor=" + this.b + ')';
    }
}
