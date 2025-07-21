package defpackage;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class vx5 {
    private final long a;
    private final long b;
    private final long c;
    private final boolean d;
    private final float e;
    private final long f;
    private final long g;
    private final boolean h;
    private final int i;
    private final long j;
    private List k;
    private long l;
    private jv0 m;

    public /* synthetic */ vx5(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6);
    }

    public static /* synthetic */ vx5 c(vx5 vx5Var, long j, long j2, long j3, long j4, boolean z, float f, long j5, long j6, boolean z2, int i, List list, long j7, int i2, Object obj) {
        return vx5Var.b((i2 & 1) != 0 ? vx5Var.a : j, (i2 & 2) != 0 ? vx5Var.b : j2, (i2 & 4) != 0 ? vx5Var.c : j3, (i2 & 8) != 0 ? vx5Var.l : j4, (i2 & 16) != 0 ? vx5Var.d : z, (i2 & 32) != 0 ? vx5Var.e : f, (i2 & 64) != 0 ? vx5Var.f : j5, (i2 & 128) != 0 ? vx5Var.g : j6, (i2 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? vx5Var.h : z2, (i2 & 512) != 0 ? vx5Var.i : i, (i2 & 1024) != 0 ? vx5Var.f() : list, (i2 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? vx5Var.j : j7);
    }

    public final void a() {
        this.m.c(true);
        this.m.d(true);
    }

    public final vx5 b(long j, long j2, long j3, long j4, boolean z, float f, long j5, long j6, boolean z2, int i, List list, long j7) {
        vx5 vx5Var = new vx5(j, j2, j3, z, f, j5, j6, z2, false, i, list, j7, j4, null);
        vx5Var.m = this.m;
        return vx5Var;
    }

    public final vx5 d(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, List list, long j6) {
        return c(this, j, j2, j3, 0L, z, this.e, j4, j5, z2, i, list, j6, 8, null);
    }

    public final List f() {
        List list = this.k;
        return list == null ? i.l() : list;
    }

    public final long g() {
        return this.a;
    }

    public final long h() {
        return this.l;
    }

    public final long i() {
        return this.c;
    }

    public final boolean j() {
        return this.d;
    }

    public final float k() {
        return this.e;
    }

    public final long l() {
        return this.g;
    }

    public final boolean m() {
        return this.h;
    }

    public final long n() {
        return this.j;
    }

    public final int o() {
        return this.i;
    }

    public final long p() {
        return this.b;
    }

    public final boolean q() {
        return this.m.a() || this.m.b();
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) tx5.f(this.a)) + ", uptimeMillis=" + this.b + ", position=" + ((Object) fd5.v(this.c)) + ", pressed=" + this.d + ", pressure=" + this.e + ", previousUptimeMillis=" + this.f + ", previousPosition=" + ((Object) fd5.v(this.g)) + ", previousPressed=" + this.h + ", isConsumed=" + q() + ", type=" + ((Object) iy5.i(this.i)) + ", historical=" + f() + ",scrollDelta=" + ((Object) fd5.v(this.j)) + ')';
    }

    public /* synthetic */ vx5(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, List list, long j6, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, list, j6, j7);
    }

    private vx5(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
        this.i = i;
        this.j = j6;
        this.l = fd5.b.c();
        this.m = new jv0(z3, z3);
    }

    public /* synthetic */ vx5(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, (i2 & 512) != 0 ? iy5.a.d() : i, (i2 & 1024) != 0 ? fd5.b.c() : j6, null);
    }

    private vx5(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, List list, long j6, long j7) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6, null);
        this.k = list;
        this.l = j7;
    }
}
