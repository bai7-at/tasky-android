package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.y;
import defpackage.nn0;
import defpackage.ve0;
import defpackage.x08;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class c implements ve0 {
    private final long a;
    private final long b;
    private final long c;
    private final long d;

    public /* synthetic */ c(long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4);
    }

    @Override // defpackage.ve0
    public x08 a(boolean z, Composer composer, int i) {
        composer.z(-655254499);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-655254499, i, -1, "androidx.compose.material.DefaultButtonColors.backgroundColor (Button.kt:585)");
        }
        x08 o = y.o(nn0.j(z ? this.a : this.c), composer, 0);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return o;
    }

    @Override // defpackage.ve0
    public x08 b(boolean z, Composer composer, int i) {
        composer.z(-2133647540);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-2133647540, i, -1, "androidx.compose.material.DefaultButtonColors.contentColor (Button.kt:590)");
        }
        x08 o = y.o(nn0.j(z ? this.b : this.d), composer, 0);
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
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return nn0.t(this.a, cVar.a) && nn0.t(this.b, cVar.b) && nn0.t(this.c, cVar.c) && nn0.t(this.d, cVar.d);
    }

    public int hashCode() {
        return (((((nn0.z(this.a) * 31) + nn0.z(this.b)) * 31) + nn0.z(this.c)) * 31) + nn0.z(this.d);
    }

    private c(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }
}
