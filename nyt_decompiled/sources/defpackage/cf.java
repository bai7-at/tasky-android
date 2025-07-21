package defpackage;

/* loaded from: classes.dex */
public final class cf {
    public static final cf a = new cf();
    private static final float[] b;
    private static final float[] c;
    public static final int d;

    public static final class a {
        private final float a;
        private final float b;

        public a(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        public final float a() {
            return this.a;
        }

        public final float b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.a) * 31) + Float.hashCode(this.b);
        }

        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.a + ", velocityCoefficient=" + this.b + ')';
        }
    }

    static {
        float[] fArr = new float[101];
        b = fArr;
        float[] fArr2 = new float[101];
        c = fArr2;
        az7.b(fArr, fArr2, 100);
        d = 8;
    }

    private cf() {
    }

    public final double a(float f, float f2) {
        return Math.log((Math.abs(f) * 0.35f) / f2);
    }

    public final a b(float f) {
        float f2;
        float f3;
        float f4 = 100;
        int i = (int) (f4 * f);
        if (i < 100) {
            float f5 = i / f4;
            int i2 = i + 1;
            float f6 = i2 / f4;
            float[] fArr = b;
            float f7 = fArr[i];
            f3 = (fArr[i2] - f7) / (f6 - f5);
            f2 = f7 + ((f - f5) * f3);
        } else {
            f2 = 1.0f;
            f3 = 0.0f;
        }
        return new a(f2, f3);
    }
}
