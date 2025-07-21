package androidx.compose.foundation.gestures.snapping;

import defpackage.by0;
import defpackage.cc0;
import defpackage.ci;
import defpackage.dw7;
import defpackage.fc1;
import defpackage.fi;
import defpackage.gi;
import defpackage.gt2;
import defpackage.qc7;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", l = {174, 187}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SnapFlingBehavior$fling$result$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ ss2 $onRemainingScrollOffsetUpdate;
    final /* synthetic */ qc7 $this_fling;
    Object L$0;
    int label;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnapFlingBehavior$fling$result$1(SnapFlingBehavior snapFlingBehavior, float f, ss2 ss2Var, qc7 qc7Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = snapFlingBehavior;
        this.$initialVelocity = f;
        this.$onRemainingScrollOffsetUpdate = ss2Var;
        this.$this_fling = qc7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SnapFlingBehavior$fling$result$1(this.this$0, this.$initialVelocity, this.$onRemainingScrollOffsetUpdate, this.$this_fling, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        dw7 dw7Var;
        final Ref$FloatRef ref$FloatRef;
        dw7 dw7Var2;
        ci ciVar;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            dw7Var = this.this$0.a;
            float abs = Math.abs(dw7Var.b(this.$initialVelocity)) * Math.signum(this.$initialVelocity);
            ref$FloatRef = new Ref$FloatRef();
            ref$FloatRef.element = abs;
            this.$onRemainingScrollOffsetUpdate.invoke(cc0.b(abs));
            SnapFlingBehavior snapFlingBehavior = this.this$0;
            qc7 qc7Var = this.$this_fling;
            float f = ref$FloatRef.element;
            float f2 = this.$initialVelocity;
            final ss2 ss2Var = this.$onRemainingScrollOffsetUpdate;
            ss2 ss2Var2 = new ss2() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1$animationState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(float f3) {
                    Ref$FloatRef ref$FloatRef2 = Ref$FloatRef.this;
                    float f4 = ref$FloatRef2.element - f3;
                    ref$FloatRef2.element = f4;
                    ss2Var.invoke(Float.valueOf(f4));
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    b(((Number) obj2).floatValue());
                    return ww8.a;
                }
            };
            this.L$0 = ref$FloatRef;
            this.label = 1;
            obj = snapFlingBehavior.j(qc7Var, f, f2, ss2Var2, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.f.b(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$FloatRef = (Ref$FloatRef) this.L$0;
            kotlin.f.b(obj);
        }
        fi fiVar = (fi) obj;
        dw7Var2 = this.this$0.a;
        float a = dw7Var2.a(((Number) fiVar.t()).floatValue());
        ref$FloatRef.element = a;
        qc7 qc7Var2 = this.$this_fling;
        fi g = gi.g(fiVar, 0.0f, 0.0f, 0L, 0L, false, 30, null);
        ciVar = this.this$0.d;
        final ss2 ss2Var3 = this.$onRemainingScrollOffsetUpdate;
        ss2 ss2Var4 = new ss2() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(float f3) {
                Ref$FloatRef ref$FloatRef2 = Ref$FloatRef.this;
                float f4 = ref$FloatRef2.element - f3;
                ref$FloatRef2.element = f4;
                ss2Var3.invoke(Float.valueOf(f4));
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                b(((Number) obj2).floatValue());
                return ww8.a;
            }
        };
        this.L$0 = null;
        this.label = 2;
        obj = SnapFlingBehaviorKt.h(qc7Var2, a, a, g, ciVar, ss2Var4, this);
        return obj == h ? h : obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SnapFlingBehavior$fling$result$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
