package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class vt5 {
    private final long a;
    private final long b;
    private final int c;

    public /* synthetic */ vt5(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, i);
    }

    public final long a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final long c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt5)) {
            return false;
        }
        vt5 vt5Var = (vt5) obj;
        return dk8.e(this.a, vt5Var.a) && dk8.e(this.b, vt5Var.b) && du5.i(this.c, vt5Var.c);
    }

    public int hashCode() {
        return (((dk8.i(this.a) * 31) + dk8.i(this.b)) * 31) + du5.j(this.c);
    }

    public String toString() {
        return "Placeholder(width=" + ((Object) dk8.j(this.a)) + ", height=" + ((Object) dk8.j(this.b)) + ", placeholderVerticalAlign=" + ((Object) du5.k(this.c)) + ')';
    }

    private vt5(long j, long j2, int i) {
        this.a = j;
        this.b = j2;
        this.c = i;
        if (ek8.h(j)) {
            throw new IllegalArgumentException("width cannot be TextUnit.Unspecified");
        }
        if (ek8.h(j2)) {
            throw new IllegalArgumentException("height cannot be TextUnit.Unspecified");
        }
    }
}
