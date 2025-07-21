package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.y;
import defpackage.bo3;
import defpackage.bu1;
import defpackage.e26;
import defpackage.eo3;
import defpackage.gt2;
import defpackage.ka3;
import defpackage.py1;
import defpackage.sl2;
import defpackage.x08;
import defpackage.xe0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class DefaultButtonElevation implements xe0 {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;

    public /* synthetic */ DefaultButtonElevation(float f, float f2, float f3, float f4, float f5, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5);
    }

    @Override // defpackage.xe0
    public x08 a(boolean z, eo3 eo3Var, Composer composer, int i) {
        composer.z(-1588756907);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1588756907, i, -1, "androidx.compose.material.DefaultButtonElevation.elevation (Button.kt:504)");
        }
        composer.z(-492369756);
        Object A = composer.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            A = y.f();
            composer.q(A);
        }
        composer.R();
        SnapshotStateList snapshotStateList = (SnapshotStateList) A;
        composer.z(1621959150);
        boolean S = composer.S(eo3Var) | composer.S(snapshotStateList);
        Object A2 = composer.A();
        if (S || A2 == aVar.a()) {
            A2 = new DefaultButtonElevation$elevation$1$1(eo3Var, snapshotStateList, null);
            composer.q(A2);
        }
        composer.R();
        py1.d(eo3Var, (gt2) A2, composer, ((i >> 3) & 14) | 64);
        bo3 bo3Var = (bo3) kotlin.collections.i.y0(snapshotStateList);
        float f = !z ? this.c : bo3Var instanceof e26 ? this.b : bo3Var instanceof ka3 ? this.d : bo3Var instanceof sl2 ? this.e : this.a;
        composer.z(-492369756);
        Object A3 = composer.A();
        if (A3 == aVar.a()) {
            A3 = new Animatable(bu1.d(f), VectorConvertersKt.b(bu1.b), null, null, 12, null);
            composer.q(A3);
        }
        composer.R();
        Animatable animatable = (Animatable) A3;
        py1.d(bu1.d(f), new DefaultButtonElevation$elevation$2(animatable, f, z, this, bo3Var, null), composer, 64);
        x08 g = animatable.g();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return g;
    }

    private DefaultButtonElevation(float f, float f2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }
}
