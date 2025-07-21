package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.y;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class vj1 implements hd8 {
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;

    public /* synthetic */ vj1(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8);
    }

    @Override // defpackage.hd8
    public x08 a(boolean z, boolean z2, Composer composer, int i) {
        composer.z(-66424183);
        if (b.G()) {
            b.S(-66424183, i, -1, "androidx.compose.material.DefaultSwitchColors.thumbColor (Switch.kt:367)");
        }
        x08 o = y.o(nn0.j(z ? z2 ? this.a : this.c : z2 ? this.e : this.g), composer, 0);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return o;
    }

    @Override // defpackage.hd8
    public x08 b(boolean z, boolean z2, Composer composer, int i) {
        composer.z(-1176343362);
        if (b.G()) {
            b.S(-1176343362, i, -1, "androidx.compose.material.DefaultSwitchColors.trackColor (Switch.kt:378)");
        }
        x08 o = y.o(nn0.j(z ? z2 ? this.b : this.d : z2 ? this.f : this.h), composer, 0);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vj1.class != obj.getClass()) {
            return false;
        }
        vj1 vj1Var = (vj1) obj;
        return nn0.t(this.a, vj1Var.a) && nn0.t(this.b, vj1Var.b) && nn0.t(this.c, vj1Var.c) && nn0.t(this.d, vj1Var.d) && nn0.t(this.e, vj1Var.e) && nn0.t(this.f, vj1Var.f) && nn0.t(this.g, vj1Var.g) && nn0.t(this.h, vj1Var.h);
    }

    public int hashCode() {
        return (((((((((((((nn0.z(this.a) * 31) + nn0.z(this.b)) * 31) + nn0.z(this.c)) * 31) + nn0.z(this.d)) * 31) + nn0.z(this.e)) * 31) + nn0.z(this.f)) * 31) + nn0.z(this.g)) * 31) + nn0.z(this.h);
    }

    private vj1(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
    }
}
