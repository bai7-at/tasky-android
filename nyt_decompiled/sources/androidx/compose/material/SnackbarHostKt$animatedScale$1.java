package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import defpackage.by0;
import defpackage.cc0;
import defpackage.ci;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.compose.material.SnackbarHostKt$animatedScale$1", f = "SnackbarHost.kt", l = {370}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SnackbarHostKt$animatedScale$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ ci $animation;
    final /* synthetic */ Animatable $scale;
    final /* synthetic */ boolean $visible;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnackbarHostKt$animatedScale$1(Animatable animatable, boolean z, ci ciVar, by0 by0Var) {
        super(2, by0Var);
        this.$scale = animatable;
        this.$visible = z;
        this.$animation = ciVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SnackbarHostKt$animatedScale$1(this.$scale, this.$visible, this.$animation, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            Animatable animatable = this.$scale;
            Float b = cc0.b(this.$visible ? 1.0f : 0.8f);
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
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SnackbarHostKt$animatedScale$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
