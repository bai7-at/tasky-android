package androidx.compose.material.ripple;

import androidx.compose.runtime.snapshots.k;
import androidx.compose.runtime.y;
import defpackage.e26;
import defpackage.e27;
import defpackage.fd5;
import defpackage.fv1;
import defpackage.nn0;
import defpackage.ov6;
import defpackage.x08;
import defpackage.yv0;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class CommonRippleIndicationInstance extends c implements ov6 {
    private final boolean b;
    private final float c;
    private final x08 d;
    private final x08 e;
    private final k f;

    public /* synthetic */ CommonRippleIndicationInstance(boolean z, float f, x08 x08Var, x08 x08Var2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, x08Var, x08Var2);
    }

    private final void j(fv1 fv1Var, long j) {
        Iterator it2 = this.f.entrySet().iterator();
        while (it2.hasNext()) {
            RippleAnimation rippleAnimation = (RippleAnimation) ((Map.Entry) it2.next()).getValue();
            float d = ((e27) this.e.getValue()).d();
            if (d != 0.0f) {
                rippleAnimation.e(fv1Var, nn0.r(j, d, 0.0f, 0.0f, 0.0f, 14, null));
            }
        }
    }

    @Override // defpackage.fj3
    public void a(yv0 yv0Var) {
        long B = ((nn0) this.d.getValue()).B();
        yv0Var.A1();
        f(yv0Var, this.c, B);
        j(yv0Var, B);
    }

    @Override // androidx.compose.material.ripple.c
    public void b(e26 e26Var, CoroutineScope coroutineScope) {
        Iterator it2 = this.f.entrySet().iterator();
        while (it2.hasNext()) {
            ((RippleAnimation) ((Map.Entry) it2.next()).getValue()).h();
        }
        RippleAnimation rippleAnimation = new RippleAnimation(this.b ? fd5.d(e26Var.a()) : null, this.c, this.b, null);
        this.f.put(e26Var, rippleAnimation);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CommonRippleIndicationInstance$addRipple$2(rippleAnimation, this, e26Var, null), 3, null);
    }

    @Override // defpackage.ov6
    public void c() {
    }

    @Override // defpackage.ov6
    public void d() {
        this.f.clear();
    }

    @Override // defpackage.ov6
    public void e() {
        this.f.clear();
    }

    @Override // androidx.compose.material.ripple.c
    public void g(e26 e26Var) {
        RippleAnimation rippleAnimation = (RippleAnimation) this.f.get(e26Var);
        if (rippleAnimation != null) {
            rippleAnimation.h();
        }
    }

    private CommonRippleIndicationInstance(boolean z, float f, x08 x08Var, x08 x08Var2) {
        super(z, x08Var2);
        this.b = z;
        this.c = f;
        this.d = x08Var;
        this.e = x08Var2;
        this.f = y.h();
    }
}
