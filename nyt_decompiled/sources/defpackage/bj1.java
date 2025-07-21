package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.y;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class bj1 implements no6 {
    private final long a;
    private final long b;
    private final long c;

    public /* synthetic */ bj1(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    @Override // defpackage.no6
    public x08 a(boolean z, boolean z2, Composer composer, int i) {
        x08 o;
        composer.z(1243421834);
        if (b.G()) {
            b.S(1243421834, i, -1, "androidx.compose.material.DefaultRadioButtonColors.radioColor (RadioButton.kt:187)");
        }
        long j = !z ? this.c : !z2 ? this.b : this.a;
        if (z) {
            composer.z(-1052799107);
            o = vt7.a(j, di.k(100, 0, null, 6, null), null, null, composer, 48, 12);
            composer.R();
        } else {
            composer.z(-1052799002);
            o = y.o(nn0.j(j), composer, 0);
            composer.R();
        }
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
        if (obj == null || bj1.class != obj.getClass()) {
            return false;
        }
        bj1 bj1Var = (bj1) obj;
        return nn0.t(this.a, bj1Var.a) && nn0.t(this.b, bj1Var.b) && nn0.t(this.c, bj1Var.c);
    }

    public int hashCode() {
        return (((nn0.z(this.a) * 31) + nn0.z(this.b)) * 31) + nn0.z(this.c);
    }

    private bj1(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }
}
