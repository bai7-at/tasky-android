package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class jo7 {
    public static final a d = new a(null);
    private static final jo7 e = new jo7(0, 0, 0.0f, 7, null);
    private final long a;
    private final long b;
    private final float c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final jo7 a() {
            return jo7.e;
        }

        private a() {
        }
    }

    public /* synthetic */ jo7(long j, long j2, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, f);
    }

    public final float b() {
        return this.c;
    }

    public final long c() {
        return this.a;
    }

    public final long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo7)) {
            return false;
        }
        jo7 jo7Var = (jo7) obj;
        return nn0.t(this.a, jo7Var.a) && fd5.l(this.b, jo7Var.b) && this.c == jo7Var.c;
    }

    public int hashCode() {
        return (((nn0.z(this.a) * 31) + fd5.q(this.b)) * 31) + Float.hashCode(this.c);
    }

    public String toString() {
        return "Shadow(color=" + ((Object) nn0.A(this.a)) + ", offset=" + ((Object) fd5.v(this.b)) + ", blurRadius=" + this.c + ')';
    }

    private jo7(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public /* synthetic */ jo7(long j, long j2, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? wn0.d(4278190080L) : j, (i & 2) != 0 ? fd5.b.c() : j2, (i & 4) != 0 ? 0.0f : f, null);
    }
}
