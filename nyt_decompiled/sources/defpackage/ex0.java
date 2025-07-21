package defpackage;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.c;
import androidx.compose.animation.e;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ex0 {
    private final c a;
    private final e b;
    private final yx4 c;
    private hu7 d;

    public ex0(c cVar, e eVar, float f, hu7 hu7Var) {
        this.a = cVar;
        this.b = eVar;
        this.c = t26.a(f);
        this.d = hu7Var;
    }

    public final e a() {
        return this.b;
    }

    public final hu7 b() {
        return this.d;
    }

    public final c c() {
        return this.a;
    }

    public final float d() {
        return this.c.a();
    }

    public /* synthetic */ ex0(c cVar, e eVar, float f, hu7 hu7Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, eVar, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? AnimatedContentKt.d(false, null, 3, null) : hu7Var);
    }
}
