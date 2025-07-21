package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import defpackage.by0;
import defpackage.cc0;
import defpackage.ci;
import defpackage.fc1;
import defpackage.gh;
import defpackage.gt2;
import defpackage.qu1;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.yx4;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

@fc1(c = "androidx.compose.material.SwipeableState$animateInternalToOffset$2", f = "Swipeable.kt", l = {228}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SwipeableState$animateInternalToOffset$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ ci $spec;
    final /* synthetic */ float $target;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SwipeableState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeableState$animateInternalToOffset$2(SwipeableState swipeableState, float f, ci ciVar, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = swipeableState;
        this.$target = f;
        this.$spec = ciVar;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(qu1 qu1Var, by0 by0Var) {
        return ((SwipeableState$animateInternalToOffset$2) create(qu1Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        SwipeableState$animateInternalToOffset$2 swipeableState$animateInternalToOffset$2 = new SwipeableState$animateInternalToOffset$2(this.this$0, this.$target, this.$spec, by0Var);
        swipeableState$animateInternalToOffset$2.L$0 = obj;
        return swipeableState$animateInternalToOffset$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        sy4 sy4Var;
        yx4 yx4Var;
        sy4 sy4Var2;
        sy4 sy4Var3;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.f.b(obj);
                final qu1 qu1Var = (qu1) this.L$0;
                final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                yx4Var = this.this$0.g;
                ref$FloatRef.element = yx4Var.a();
                sy4Var2 = this.this$0.h;
                sy4Var2.setValue(cc0.b(this.$target));
                this.this$0.C(true);
                Animatable b = gh.b(ref$FloatRef.element, 0.0f, 2, null);
                Float b2 = cc0.b(this.$target);
                ci ciVar = this.$spec;
                ss2 ss2Var = new ss2() { // from class: androidx.compose.material.SwipeableState$animateInternalToOffset$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(Animatable animatable) {
                        qu1.this.c(((Number) animatable.m()).floatValue() - ref$FloatRef.element);
                        ref$FloatRef.element = ((Number) animatable.m()).floatValue();
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        b((Animatable) obj2);
                        return ww8.a;
                    }
                };
                this.label = 1;
                if (Animatable.f(b, b2, ciVar, null, ss2Var, this, 4, null) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.f.b(obj);
            }
            sy4Var3 = this.this$0.h;
            sy4Var3.setValue(null);
            this.this$0.C(false);
            return ww8.a;
        } catch (Throwable th) {
            sy4Var = this.this$0.h;
            sy4Var.setValue(null);
            this.this$0.C(false);
            throw th;
        }
    }
}
