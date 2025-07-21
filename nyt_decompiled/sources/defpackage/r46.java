package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class r46 {
    public static final a d = new a(null);
    private static final r46 e = new r46(0.0f, uo6.b(0.0f, 0.0f), 0, 4, null);
    private final float a;
    private final jm0 b;
    private final int c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final r46 a() {
            return r46.e;
        }

        private a() {
        }
    }

    public r46(float f, jm0 jm0Var, int i) {
        this.a = f;
        this.b = jm0Var;
        this.c = i;
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final float b() {
        return this.a;
    }

    public final jm0 c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r46)) {
            return false;
        }
        r46 r46Var = (r46) obj;
        return this.a == r46Var.a && zq3.c(this.b, r46Var.b) && this.c == r46Var.c;
    }

    public int hashCode() {
        return (((Float.hashCode(this.a) * 31) + this.b.hashCode()) * 31) + this.c;
    }

    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.a + ", range=" + this.b + ", steps=" + this.c + ')';
    }

    public /* synthetic */ r46(float f, jm0 jm0Var, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, jm0Var, (i2 & 4) != 0 ? 0 : i);
    }
}
