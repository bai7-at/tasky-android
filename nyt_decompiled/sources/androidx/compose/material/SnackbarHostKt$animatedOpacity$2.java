package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import defpackage.by0;
import defpackage.cc0;
import defpackage.ci;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.compose.material.SnackbarHostKt$animatedOpacity$2", f = "SnackbarHost.kt", l = {357}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SnackbarHostKt$animatedOpacity$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ Animatable $alpha;
    final /* synthetic */ ci $animation;
    final /* synthetic */ qs2 $onAnimationFinish;
    final /* synthetic */ boolean $visible;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnackbarHostKt$animatedOpacity$2(Animatable animatable, boolean z, ci ciVar, qs2 qs2Var, by0 by0Var) {
        super(2, by0Var);
        this.$alpha = animatable;
        this.$visible = z;
        this.$animation = ciVar;
        this.$onAnimationFinish = qs2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SnackbarHostKt$animatedOpacity$2(this.$alpha, this.$visible, this.$animation, this.$onAnimationFinish, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            Animatable animatable = this.$alpha;
            Float b = cc0.b(this.$visible ? 1.0f : 0.0f);
            ci ciVar = this.$animation;
            this.label = 1;
            if (Animatable.f(animatable, b, ciVar, null, null, this, 12, null) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        this.$onAnimationFinish.mo865invoke();
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SnackbarHostKt$animatedOpacity$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
