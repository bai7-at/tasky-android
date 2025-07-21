package androidx.compose.material.ripple;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.y;
import com.comscore.streaming.ContentType;
import defpackage.bu1;
import defpackage.ej3;
import defpackage.eo3;
import defpackage.fj3;
import defpackage.nn0;
import defpackage.py1;
import defpackage.x08;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class Ripple implements ej3 {
    private final boolean a;
    private final float b;
    private final x08 c;

    public /* synthetic */ Ripple(boolean z, float f, x08 x08Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, x08Var);
    }

    @Override // defpackage.ej3
    public final fj3 a(eo3 eo3Var, Composer composer, int i) {
        composer.z(988743187);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(988743187, i, -1, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:115)");
        }
        d dVar = (d) composer.m(RippleThemeKt.d());
        composer.z(-1524341038);
        long B = ((nn0) this.c.getValue()).B() != nn0.b.g() ? ((nn0) this.c.getValue()).B() : dVar.a(composer, 0);
        composer.R();
        c b = b(eo3Var, this.a, this.b, y.o(nn0.j(B), composer, 0), y.o(dVar.b(composer, 0), composer, 0), composer, (i & 14) | ((i << 12) & 458752));
        py1.e(b, eo3Var, new Ripple$rememberUpdatedInstance$1(eo3Var, b, null), composer, ((i << 3) & ContentType.LONG_FORM_ON_DEMAND) | 520);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return b;
    }

    public abstract c b(eo3 eo3Var, boolean z, float f, x08 x08Var, x08 x08Var2, Composer composer, int i);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ripple)) {
            return false;
        }
        Ripple ripple = (Ripple) obj;
        return this.a == ripple.a && bu1.j(this.b, ripple.b) && zq3.c(this.c, ripple.c);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.a) * 31) + bu1.k(this.b)) * 31) + this.c.hashCode();
    }

    private Ripple(boolean z, float f, x08 x08Var) {
        this.a = z;
        this.b = f;
        this.c = x08Var;
    }
}
