package androidx.compose.material3;

import androidx.compose.animation.core.SuspendAnimationKt;
import defpackage.by0;
import defpackage.ci;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.id;
import defpackage.kt2;
import defpackage.ru1;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

@fc1(c = "androidx.compose.material3.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", l = {696}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AnchoredDraggableKt$animateTo$2 extends SuspendLambda implements kt2 {
    final /* synthetic */ AnchoredDraggableState $this_animateTo;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableKt$animateTo$2(AnchoredDraggableState anchoredDraggableState, float f, by0 by0Var) {
        super(4, by0Var);
        this.$this_animateTo = anchoredDraggableState;
        this.$velocity = f;
    }

    @Override // defpackage.kt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(id idVar, ru1 ru1Var, Object obj, by0 by0Var) {
        AnchoredDraggableKt$animateTo$2 anchoredDraggableKt$animateTo$2 = new AnchoredDraggableKt$animateTo$2(this.$this_animateTo, this.$velocity, by0Var);
        anchoredDraggableKt$animateTo$2.L$0 = idVar;
        anchoredDraggableKt$animateTo$2.L$1 = ru1Var;
        anchoredDraggableKt$animateTo$2.L$2 = obj;
        return anchoredDraggableKt$animateTo$2.invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            final id idVar = (id) this.L$0;
            float e = ((ru1) this.L$1).e(this.L$2);
            if (!Float.isNaN(e)) {
                final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                float w = Float.isNaN(this.$this_animateTo.w()) ? 0.0f : this.$this_animateTo.w();
                ref$FloatRef.element = w;
                float f = this.$velocity;
                ci p = this.$this_animateTo.p();
                gt2 gt2Var = new gt2() { // from class: androidx.compose.material3.AnchoredDraggableKt$animateTo$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(float f2, float f3) {
                        id.this.a(f2, f3);
                        ref$FloatRef.element = f2;
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        b(((Number) obj2).floatValue(), ((Number) obj3).floatValue());
                        return ww8.a;
                    }
                };
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (SuspendAnimationKt.b(w, e, f, p, gt2Var, this) == h) {
                    return h;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return ww8.a;
    }
}
