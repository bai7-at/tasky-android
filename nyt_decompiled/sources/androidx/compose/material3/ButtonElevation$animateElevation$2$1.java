package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import defpackage.bo3;
import defpackage.bu1;
import defpackage.by0;
import defpackage.e26;
import defpackage.fc1;
import defpackage.fd5;
import defpackage.gt2;
import defpackage.ka3;
import defpackage.sl2;
import defpackage.ww8;
import defpackage.xy1;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.compose.material3.ButtonElevation$animateElevation$2$1", f = "Button.kt", l = {952, 960}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ButtonElevation$animateElevation$2$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Animatable $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ bo3 $interaction;
    final /* synthetic */ float $target;
    int label;
    final /* synthetic */ ButtonElevation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonElevation$animateElevation$2$1(Animatable animatable, float f, boolean z, ButtonElevation buttonElevation, bo3 bo3Var, by0 by0Var) {
        super(2, by0Var);
        this.$animatable = animatable;
        this.$target = f;
        this.$enabled = z;
        this.this$0 = buttonElevation;
        this.$interaction = bo3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ButtonElevation$animateElevation$2$1(this.$animatable, this.$target, this.$enabled, this.this$0, this.$interaction, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f;
        float f2;
        float f3;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            if (!bu1.j(((bu1) this.$animatable.k()).n(), this.$target)) {
                if (this.$enabled) {
                    float n = ((bu1) this.$animatable.k()).n();
                    f = this.this$0.b;
                    bo3 bo3Var = null;
                    if (bu1.j(n, f)) {
                        bo3Var = new e26(fd5.b.c(), null);
                    } else {
                        f2 = this.this$0.d;
                        if (bu1.j(n, f2)) {
                            bo3Var = new ka3();
                        } else {
                            f3 = this.this$0.c;
                            if (bu1.j(n, f3)) {
                                bo3Var = new sl2();
                            }
                        }
                    }
                    Animatable animatable = this.$animatable;
                    float f4 = this.$target;
                    bo3 bo3Var2 = this.$interaction;
                    this.label = 2;
                    if (xy1.d(animatable, f4, bo3Var, bo3Var2, this) == h) {
                        return h;
                    }
                } else {
                    Animatable animatable2 = this.$animatable;
                    bu1 d = bu1.d(this.$target);
                    this.label = 1;
                    if (animatable2.t(d, this) == h) {
                        return h;
                    }
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((ButtonElevation$animateElevation$2$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
