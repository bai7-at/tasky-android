package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class sj8 {
    private final long a;
    private final long b;

    public /* synthetic */ sj8(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    public final long a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj8)) {
            return false;
        }
        sj8 sj8Var = (sj8) obj;
        return nn0.t(this.a, sj8Var.a) && nn0.t(this.b, sj8Var.b);
    }

    public int hashCode() {
        return (nn0.z(this.a) * 31) + nn0.z(this.b);
    }

    public String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) nn0.A(this.a)) + ", selectionBackgroundColor=" + ((Object) nn0.A(this.b)) + ')';
    }

    private sj8(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
