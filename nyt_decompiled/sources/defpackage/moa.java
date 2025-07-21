package defpackage;

/* loaded from: classes3.dex */
public final class moa {
    public static final moa f = new moa(new vna());
    private static final String g = Integer.toString(0, 36);
    private static final String h = Integer.toString(1, 36);
    private static final String i = Integer.toString(2, 36);
    private static final String j = Integer.toString(3, 36);
    private static final String k = Integer.toString(4, 36);
    public static final zhf l = new zhf() { // from class: pna
    };
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    private moa(vna vnaVar) {
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
        this.c = -9223372036854775807L;
        this.d = -3.4028235E38f;
        this.e = -3.4028235E38f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof moa)) {
            return false;
        }
        long j2 = ((moa) obj).a;
        return true;
    }

    public final int hashCode() {
        int i2 = (int) (-9223372034707292159L);
        return (((((((i2 * 31) + i2) * 31) + i2) * 31) + Float.floatToIntBits(-3.4028235E38f)) * 31) + Float.floatToIntBits(-3.4028235E38f);
    }
}
