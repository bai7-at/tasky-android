package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import defpackage.by0;
import defpackage.cc0;
import defpackage.ci;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$2", f = "Ripple.kt", l = {305}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class StateLayer$handleInteraction$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ ci $outgoingAnimationSpec;
    int label;
    final /* synthetic */ StateLayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StateLayer$handleInteraction$2(StateLayer stateLayer, ci ciVar, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = stateLayer;
        this.$outgoingAnimationSpec = ciVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new StateLayer$handleInteraction$2(this.this$0, this.$outgoingAnimationSpec, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Animatable animatable;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            animatable = this.this$0.c;
            Float b = cc0.b(0.0f);
            ci ciVar = this.$outgoingAnimationSpec;
            this.label = 1;
            if (Animatable.f(animatable, b, ciVar, null, null, this, 12, null) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((StateLayer$handleInteraction$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
