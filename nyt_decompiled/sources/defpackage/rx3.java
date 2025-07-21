package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class rx3 implements Comparable {
    public static final a e = new a(null);
    public static final rx3 f = sx3.a();
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public rx3(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = b(i, i2, i3);
    }

    private final int b(int i, int i2, int i3) {
        if (i >= 0 && i < 256 && i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(rx3 rx3Var) {
        zq3.h(rx3Var, "other");
        return this.d - rx3Var.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        rx3 rx3Var = obj instanceof rx3 ? (rx3) obj : null;
        return rx3Var != null && this.d == rx3Var.d;
    }

    public int hashCode() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('.');
        sb.append(this.b);
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }
}
