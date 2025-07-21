package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.y;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class bq4 {
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;

    public /* synthetic */ bq4(long j, long j2, long j3, long j4, long j5, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6);
    }

    public final long a(boolean z, Composer composer, int i) {
        composer.z(-395881771);
        if (b.G()) {
            b.S(-395881771, i, -1, "androidx.compose.material3.MenuItemColors.leadingIconColor (Menu.kt:189)");
        }
        long j = z ? this.b : this.e;
        if (b.G()) {
            b.R();
        }
        composer.R();
        return j;
    }

    public final x08 b(boolean z, Composer composer, int i) {
        composer.z(-1023108655);
        if (b.G()) {
            b.S(-1023108655, i, -1, "androidx.compose.material3.MenuItemColors.textColor (Menu.kt:178)");
        }
        x08 o = y.o(nn0.j(z ? this.a : this.d), composer, 0);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return o;
    }

    public final long c(boolean z, Composer composer, int i) {
        composer.z(-892832569);
        if (b.G()) {
            b.S(-892832569, i, -1, "androidx.compose.material3.MenuItemColors.trailingIconColor (Menu.kt:198)");
        }
        long j = z ? this.c : this.f;
        if (b.G()) {
            b.R();
        }
        composer.R();
        return j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bq4)) {
            return false;
        }
        bq4 bq4Var = (bq4) obj;
        return nn0.t(this.a, bq4Var.a) && nn0.t(this.b, bq4Var.b) && nn0.t(this.c, bq4Var.c) && nn0.t(this.d, bq4Var.d) && nn0.t(this.e, bq4Var.e) && nn0.t(this.f, bq4Var.f);
    }

    public int hashCode() {
        return (((((((((nn0.z(this.a) * 31) + nn0.z(this.b)) * 31) + nn0.z(this.c)) * 31) + nn0.z(this.d)) * 31) + nn0.z(this.e)) * 31) + nn0.z(this.f);
    }

    private bq4(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }
}
