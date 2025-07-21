package defpackage;

import defpackage.nn0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ie3 {
    private final long a;
    private final long b;
    private final long c;
    private final long d;

    public /* synthetic */ ie3(long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4);
    }

    public final long a(boolean z) {
        return z ? this.a : this.c;
    }

    public final long b(boolean z) {
        return z ? this.b : this.d;
    }

    public final ie3 c(long j, long j2, long j3, long j4) {
        nn0.a aVar = nn0.b;
        return new ie3(j != aVar.g() ? j : this.a, j2 != aVar.g() ? j2 : this.b, j3 != aVar.g() ? j3 : this.c, j4 != aVar.g() ? j4 : this.d, null);
    }

    public final long e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ie3)) {
            return false;
        }
        ie3 ie3Var = (ie3) obj;
        return nn0.t(this.a, ie3Var.a) && nn0.t(this.b, ie3Var.b) && nn0.t(this.c, ie3Var.c) && nn0.t(this.d, ie3Var.d);
    }

    public int hashCode() {
        return (((((nn0.z(this.a) * 31) + nn0.z(this.b)) * 31) + nn0.z(this.c)) * 31) + nn0.z(this.d);
    }

    private ie3(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }
}
