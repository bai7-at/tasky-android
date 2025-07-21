package androidx.compose.animation;

import androidx.compose.animation.SizeAnimationModifierNode;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationEndReason;
import defpackage.ai;
import defpackage.by0;
import defpackage.ci;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.hn3;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1", f = "AnimationModifier.kt", l = {175}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SizeAnimationModifierNode$animateTo$data$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ long $targetSize;
    final /* synthetic */ SizeAnimationModifierNode.a $this_apply;
    int label;
    final /* synthetic */ SizeAnimationModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SizeAnimationModifierNode$animateTo$data$1$1(SizeAnimationModifierNode.a aVar, long j, SizeAnimationModifierNode sizeAnimationModifierNode, by0 by0Var) {
        super(2, by0Var);
        this.$this_apply = aVar;
        this.$targetSize = j;
        this.this$0 = sizeAnimationModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SizeAnimationModifierNode$animateTo$data$1$1(this.$this_apply, this.$targetSize, this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gt2 h2;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            Animatable a = this.$this_apply.a();
            hn3 b = hn3.b(this.$targetSize);
            ci g2 = this.this$0.g2();
            this.label = 1;
            obj = Animatable.f(a, b, g2, null, null, this, 12, null);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        ai aiVar = (ai) obj;
        if (aiVar.a() == AnimationEndReason.Finished && (h2 = this.this$0.h2()) != null) {
            h2.invoke(hn3.b(this.$this_apply.b()), aiVar.b().getValue());
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SizeAnimationModifierNode$animateTo$data$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
