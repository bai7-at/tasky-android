package androidx.compose.animation.core;

import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class Animatable$snapTo$2 extends SuspendLambda implements ss2 {
    final /* synthetic */ Object $targetValue;
    int label;
    final /* synthetic */ Animatable this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Animatable$snapTo$2(Animatable animatable, Object obj, by0 by0Var) {
        super(1, by0Var);
        this.this$0 = animatable;
        this.$targetValue = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new Animatable$snapTo$2(this.this$0, this.$targetValue, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((Animatable$snapTo$2) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.this$0.i();
        h = this.this$0.h(this.$targetValue);
        this.this$0.j().F(h);
        this.this$0.s(h);
        return ww8.a;
    }
}
