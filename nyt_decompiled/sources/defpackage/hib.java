package defpackage;

import java.util.Locale;

/* loaded from: classes3.dex */
public final class hib {
    public static final hib d = new hib(1.0f, 1.0f);
    private static final String e = Integer.toString(0, 36);
    private static final String f = Integer.toString(1, 36);
    public static final zhf g = new zhf() { // from class: bhb
    };
    public final float a;
    public final float b;
    private final int c;

    public hib(float f2, float f3) {
        wad.d(f2 > 0.0f);
        wad.d(f3 > 0.0f);
        this.a = f2;
        this.b = f3;
        this.c = Math.round(f2 * 1000.0f);
    }

    public final long a(long j) {
        return j * this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hib.class == obj.getClass()) {
            hib hibVar = (hib) obj;
            if (this.a == hibVar.a && this.b == hibVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.a) + 527) * 31) + Float.floatToRawIntBits(this.b);
    }

    public final String toString() {
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.a), Float.valueOf(this.b));
    }
}
