package defpackage;

/* loaded from: classes.dex */
public final class w27 {
    private final float a;
    private final float b;
    private final long c;
    private final int d;

    public w27(float f, float f2, long j, int i) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = i;
    }

    public boolean equals(Object obj) {
        if (obj instanceof w27) {
            w27 w27Var = (w27) obj;
            if (w27Var.a == this.a && w27Var.b == this.b && w27Var.c == this.c && w27Var.d == this.d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.a) * 31) + Float.hashCode(this.b)) * 31) + Long.hashCode(this.c)) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.a + ",horizontalScrollPixels=" + this.b + ",uptimeMillis=" + this.c + ",deviceId=" + this.d + ')';
    }
}
