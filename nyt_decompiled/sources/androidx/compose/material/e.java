package androidx.compose.material;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.y;
import defpackage.di;
import defpackage.di8;
import defpackage.eo3;
import defpackage.nn0;
import defpackage.vt7;
import defpackage.x08;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class e implements di8 {
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;
    private final long i;
    private final long j;
    private final long k;
    private final long l;
    private final long m;
    private final long n;
    private final long o;
    private final long p;
    private final long q;
    private final long r;
    private final long s;
    private final long t;
    private final long u;

    public /* synthetic */ e(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21);
    }

    private static final boolean j(x08 x08Var) {
        return ((Boolean) x08Var.getValue()).booleanValue();
    }

    private static final boolean k(x08 x08Var) {
        return ((Boolean) x08Var.getValue()).booleanValue();
    }

    @Override // defpackage.di8
    public x08 a(boolean z, Composer composer, int i) {
        composer.z(-1423938813);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1423938813, i, -1, "androidx.compose.material.DefaultTextFieldColors.backgroundColor (TextFieldDefaults.kt:791)");
        }
        x08 o = y.o(nn0.j(this.o), composer, 0);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return o;
    }

    @Override // defpackage.di8
    public x08 b(boolean z, boolean z2, Composer composer, int i) {
        composer.z(1016171324);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1016171324, i, -1, "androidx.compose.material.DefaultTextFieldColors.leadingIconColor (TextFieldDefaults.kt:717)");
        }
        x08 o = y.o(nn0.j(!z ? this.j : z2 ? this.k : this.i), composer, 0);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return o;
    }

    @Override // defpackage.di8
    public x08 c(boolean z, Composer composer, int i) {
        composer.z(264799724);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(264799724, i, -1, "androidx.compose.material.DefaultTextFieldColors.placeholderColor (TextFieldDefaults.kt:796)");
        }
        x08 o = y.o(nn0.j(z ? this.t : this.u), composer, 0);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return o;
    }

    @Override // defpackage.di8
    public x08 d(boolean z, boolean z2, eo3 eo3Var, Composer composer, int i) {
        composer.z(727091888);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(727091888, i, -1, "androidx.compose.material.DefaultTextFieldColors.labelColor (TextFieldDefaults.kt:805)");
        }
        x08 o = y.o(nn0.j(!z ? this.r : z2 ? this.s : k(FocusInteractionKt.a(eo3Var, composer, (i >> 6) & 14)) ? this.p : this.q), composer, 0);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return o;
    }

    @Override // defpackage.di8
    public x08 e(boolean z, Composer composer, int i) {
        composer.z(9804418);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(9804418, i, -1, "androidx.compose.material.DefaultTextFieldColors.textColor (TextFieldDefaults.kt:818)");
        }
        x08 o = y.o(nn0.j(z ? this.a : this.b), composer, 0);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return nn0.t(this.a, eVar.a) && nn0.t(this.b, eVar.b) && nn0.t(this.c, eVar.c) && nn0.t(this.d, eVar.d) && nn0.t(this.e, eVar.e) && nn0.t(this.f, eVar.f) && nn0.t(this.g, eVar.g) && nn0.t(this.h, eVar.h) && nn0.t(this.i, eVar.i) && nn0.t(this.j, eVar.j) && nn0.t(this.k, eVar.k) && nn0.t(this.l, eVar.l) && nn0.t(this.m, eVar.m) && nn0.t(this.n, eVar.n) && nn0.t(this.o, eVar.o) && nn0.t(this.p, eVar.p) && nn0.t(this.q, eVar.q) && nn0.t(this.r, eVar.r) && nn0.t(this.s, eVar.s) && nn0.t(this.t, eVar.t) && nn0.t(this.u, eVar.u);
    }

    @Override // defpackage.di8
    public x08 f(boolean z, Composer composer, int i) {
        composer.z(-1446422485);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1446422485, i, -1, "androidx.compose.material.DefaultTextFieldColors.cursorColor (TextFieldDefaults.kt:823)");
        }
        x08 o = y.o(nn0.j(z ? this.d : this.c), composer, 0);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return o;
    }

    @Override // defpackage.di8
    public x08 g(boolean z, boolean z2, eo3 eo3Var, Composer composer, int i) {
        composer.z(-1519634405);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1519634405, i, -1, "androidx.compose.material.DefaultTextFieldColors.leadingIconColor (TextFieldDefaults.kt:732)");
        }
        x08 o = y.o(nn0.j(!z ? this.j : z2 ? this.k : this.i), composer, 0);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return o;
    }

    @Override // defpackage.di8
    public x08 h(boolean z, boolean z2, eo3 eo3Var, Composer composer, int i) {
        composer.z(1383318157);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1383318157, i, -1, "androidx.compose.material.DefaultTextFieldColors.trailingIconColor (TextFieldDefaults.kt:759)");
        }
        x08 o = y.o(nn0.j(!z ? this.m : z2 ? this.n : this.l), composer, 0);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return o;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((nn0.z(this.a) * 31) + nn0.z(this.b)) * 31) + nn0.z(this.c)) * 31) + nn0.z(this.d)) * 31) + nn0.z(this.e)) * 31) + nn0.z(this.f)) * 31) + nn0.z(this.g)) * 31) + nn0.z(this.h)) * 31) + nn0.z(this.i)) * 31) + nn0.z(this.j)) * 31) + nn0.z(this.k)) * 31) + nn0.z(this.l)) * 31) + nn0.z(this.m)) * 31) + nn0.z(this.n)) * 31) + nn0.z(this.o)) * 31) + nn0.z(this.p)) * 31) + nn0.z(this.q)) * 31) + nn0.z(this.r)) * 31) + nn0.z(this.s)) * 31) + nn0.z(this.t)) * 31) + nn0.z(this.u);
    }

    @Override // defpackage.di8
    public x08 i(boolean z, boolean z2, eo3 eo3Var, Composer composer, int i) {
        x08 o;
        composer.z(998675979);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(998675979, i, -1, "androidx.compose.material.DefaultTextFieldColors.indicatorColor (TextFieldDefaults.kt:774)");
        }
        long j = !z ? this.h : z2 ? this.g : j(FocusInteractionKt.a(eo3Var, composer, (i >> 6) & 14)) ? this.e : this.f;
        if (z) {
            composer.z(-2054188841);
            o = vt7.a(j, di.k(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer.R();
        } else {
            composer.z(-2054188736);
            o = y.o(nn0.j(j), composer, 0);
            composer.R();
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return o;
    }

    private e(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
        this.m = j13;
        this.n = j14;
        this.o = j15;
        this.p = j16;
        this.q = j17;
        this.r = j18;
        this.s = j19;
        this.t = j20;
        this.u = j21;
    }
}
