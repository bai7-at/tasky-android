package androidx.compose.material;

import androidx.compose.runtime.Composer;
import defpackage.bu1;
import defpackage.eo3;
import defpackage.fl2;
import defpackage.py1;
import defpackage.x08;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class DefaultFloatingActionButtonElevation implements fl2 {
    private final float a;
    private final float b;
    private final float c;
    private final float d;

    public /* synthetic */ DefaultFloatingActionButtonElevation(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    @Override // defpackage.fl2
    public x08 a(eo3 eo3Var, Composer composer, int i) {
        composer.z(-478475335);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-478475335, i, -1, "androidx.compose.material.DefaultFloatingActionButtonElevation.elevation (FloatingActionButton.kt:269)");
        }
        int i2 = i & 14;
        composer.z(1157296644);
        boolean S = composer.S(eo3Var);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = new FloatingActionButtonElevationAnimatable(this.a, this.b, this.c, this.d, null);
            composer.q(A);
        }
        composer.R();
        FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = (FloatingActionButtonElevationAnimatable) A;
        py1.d(this, new DefaultFloatingActionButtonElevation$elevation$1(floatingActionButtonElevationAnimatable, this, null), composer, ((i >> 3) & 14) | 64);
        py1.d(eo3Var, new DefaultFloatingActionButtonElevation$elevation$2(eo3Var, floatingActionButtonElevationAnimatable, null), composer, i2 | 64);
        x08 c = floatingActionButtonElevationAnimatable.c();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultFloatingActionButtonElevation)) {
            return false;
        }
        DefaultFloatingActionButtonElevation defaultFloatingActionButtonElevation = (DefaultFloatingActionButtonElevation) obj;
        if (bu1.j(this.a, defaultFloatingActionButtonElevation.a) && bu1.j(this.b, defaultFloatingActionButtonElevation.b) && bu1.j(this.c, defaultFloatingActionButtonElevation.c)) {
            return bu1.j(this.d, defaultFloatingActionButtonElevation.d);
        }
        return false;
    }

    public int hashCode() {
        return (((((bu1.k(this.a) * 31) + bu1.k(this.b)) * 31) + bu1.k(this.c)) * 31) + bu1.k(this.d);
    }

    private DefaultFloatingActionButtonElevation(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }
}
