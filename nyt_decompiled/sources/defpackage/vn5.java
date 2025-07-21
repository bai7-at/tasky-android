package defpackage;

/* loaded from: classes.dex */
public final class vn5 implements un5 {
    private final int b;

    public vn5(int i) {
        this.b = i;
    }

    @Override // defpackage.un5
    public int a(int i, int i2, float f, int i3, int i4) {
        int i5 = this.b;
        return uo6.m(i2, i - i5, i + i5);
    }

    public boolean equals(Object obj) {
        return (obj instanceof vn5) && this.b == ((vn5) obj).b;
    }

    public int hashCode() {
        return Integer.hashCode(this.b);
    }
}
