package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ni8 {
    public static final a c = new a(null);
    private static final ni8 d = new ni8(0, 0, 3, null);
    private final long a;
    private final long b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ni8 a() {
            return ni8.d;
        }

        private a() {
        }
    }

    public /* synthetic */ ni8(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    public final long b() {
        return this.a;
    }

    public final long c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni8)) {
            return false;
        }
        ni8 ni8Var = (ni8) obj;
        return dk8.e(this.a, ni8Var.a) && dk8.e(this.b, ni8Var.b);
    }

    public int hashCode() {
        return (dk8.i(this.a) * 31) + dk8.i(this.b);
    }

    public String toString() {
        return "TextIndent(firstLine=" + ((Object) dk8.j(this.a)) + ", restLine=" + ((Object) dk8.j(this.b)) + ')';
    }

    private ni8(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public /* synthetic */ ni8(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ek8.g(0) : j, (i & 2) != 0 ? ek8.g(0) : j2, null);
    }
}
