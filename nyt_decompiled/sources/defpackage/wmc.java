package defpackage;

/* loaded from: classes3.dex */
public final class wmc {
    public static final wmc e = new wmc(0, 0, 0, 1.0f);
    private static final String f = Integer.toString(0, 36);
    private static final String g = Integer.toString(1, 36);
    private static final String h = Integer.toString(2, 36);
    private static final String i = Integer.toString(3, 36);
    public static final zhf j = new zhf() { // from class: tlc
    };
    public final int a;
    public final int b;
    public final int c = 0;
    public final float d;

    public wmc(int i2, int i3, int i4, float f2) {
        this.a = i2;
        this.b = i3;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wmc) {
            wmc wmcVar = (wmc) obj;
            if (this.a == wmcVar.a && this.b == wmcVar.b && this.d == wmcVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a + 217) * 31) + this.b) * 961) + Float.floatToRawIntBits(this.d);
    }
}
