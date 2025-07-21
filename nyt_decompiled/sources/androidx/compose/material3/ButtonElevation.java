package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.y;
import com.comscore.streaming.ContentType;
import defpackage.bo3;
import defpackage.bu1;
import defpackage.e26;
import defpackage.eo3;
import defpackage.gt2;
import defpackage.ka3;
import defpackage.py1;
import defpackage.sl2;
import defpackage.x08;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ButtonElevation {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;

    public /* synthetic */ ButtonElevation(float f, float f2, float f3, float f4, float f5, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5);
    }

    private final x08 d(boolean z, eo3 eo3Var, Composer composer, int i) {
        composer.z(-1312510462);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1312510462, i, -1, "androidx.compose.material3.ButtonElevation.animateElevation (Button.kt:895)");
        }
        composer.z(-719928578);
        Object A = composer.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            A = y.f();
            composer.q(A);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) A;
        composer.R();
        composer.z(-719928489);
        boolean z2 = true;
        boolean z3 = (((i & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && composer.S(eo3Var)) || (i & 48) == 32;
        Object A2 = composer.A();
        if (z3 || A2 == aVar.a()) {
            A2 = new ButtonElevation$animateElevation$1$1(eo3Var, snapshotStateList, null);
            composer.q(A2);
        }
        composer.R();
        py1.d(eo3Var, (gt2) A2, composer, (i >> 3) & 14);
        bo3 bo3Var = (bo3) kotlin.collections.i.y0(snapshotStateList);
        float f = !z ? this.e : bo3Var instanceof e26 ? this.b : bo3Var instanceof ka3 ? this.d : bo3Var instanceof sl2 ? this.c : this.a;
        composer.z(-719926909);
        Object A3 = composer.A();
        if (A3 == aVar.a()) {
            A3 = new Animatable(bu1.d(f), VectorConvertersKt.b(bu1.b), null, null, 12, null);
            composer.q(A3);
        }
        Animatable animatable = (Animatable) A3;
        composer.R();
        bu1 d = bu1.d(f);
        composer.z(-719926825);
        boolean C = composer.C(animatable) | composer.b(f) | ((((i & 14) ^ 6) > 4 && composer.a(z)) || (i & 6) == 4);
        if ((((i & 896) ^ 384) <= 256 || !composer.S(this)) && (i & 384) != 256) {
            z2 = false;
        }
        boolean C2 = C | z2 | composer.C(bo3Var);
        Object A4 = composer.A();
        if (C2 || A4 == aVar.a()) {
            Object buttonElevation$animateElevation$2$1 = new ButtonElevation$animateElevation$2$1(animatable, f, z, this, bo3Var, null);
            composer.q(buttonElevation$animateElevation$2$1);
            A4 = buttonElevation$animateElevation$2$1;
        }
        composer.R();
        py1.d(d, (gt2) A4, composer, 0);
        x08 g = animatable.g();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return g;
    }

    public final x08 e(boolean z, eo3 eo3Var, Composer composer, int i) {
        composer.z(-2045116089);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-2045116089, i, -1, "androidx.compose.material3.ButtonElevation.shadowElevation (Button.kt:887)");
        }
        x08 d = d(z, eo3Var, composer, i & 1022);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ButtonElevation)) {
            return false;
        }
        ButtonElevation buttonElevation = (ButtonElevation) obj;
        return bu1.j(this.a, buttonElevation.a) && bu1.j(this.b, buttonElevation.b) && bu1.j(this.c, buttonElevation.c) && bu1.j(this.d, buttonElevation.d) && bu1.j(this.e, buttonElevation.e);
    }

    public final float f(boolean z) {
        return z ? this.a : this.e;
    }

    public int hashCode() {
        return (((((((bu1.k(this.a) * 31) + bu1.k(this.b)) * 31) + bu1.k(this.c)) * 31) + bu1.k(this.d)) * 31) + bu1.k(this.e);
    }

    private ButtonElevation(float f, float f2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }
}
