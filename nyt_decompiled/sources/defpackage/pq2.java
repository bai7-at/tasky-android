package defpackage;

/* loaded from: classes2.dex */
public class pq2 {
    public final int a;
    public final int b;
    public final float c;
    public final long d;

    public static final class b {
        private int a;
        private int b;
        private float c = 1.0f;
        private long d;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public pq2 a() {
            return new pq2(this.a, this.b, this.c, this.d);
        }

        public b b(float f) {
            this.c = f;
            return this;
        }
    }

    private pq2(int i, int i2, float f, long j) {
        ur.b(i > 0, "width must be positive, but is: " + i);
        ur.b(i2 > 0, "height must be positive, but is: " + i2);
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = j;
    }
}
