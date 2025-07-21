package defpackage;

import defpackage.nn0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ue0 {
    private final long a;
    private final long b;
    private final long c;
    private final long d;

    public /* synthetic */ ue0(long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4);
    }

    public final long a(boolean z) {
        return z ? this.a : this.c;
    }

    public final long b(boolean z) {
        return z ? this.b : this.d;
    }

    public final ue0 c(long j, long j2, long j3, long j4) {
        nn0.a aVar = nn0.b;
        return new ue0(j != aVar.g() ? j : this.a, j2 != aVar.g() ? j2 : this.b, j3 != aVar.g() ? j3 : this.c, j4 != aVar.g() ? j4 : this.d, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ue0)) {
            return false;
        }
        ue0 ue0Var = (ue0) obj;
        return nn0.t(this.a, ue0Var.a) && nn0.t(this.b, ue0Var.b) && nn0.t(this.c, ue0Var.c) && nn0.t(this.d, ue0Var.d);
    }

    public int hashCode() {
        return (((((nn0.z(this.a) * 31) + nn0.z(this.b)) * 31) + nn0.z(this.c)) * 31) + nn0.z(this.d);
    }

    private ue0(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }
}
