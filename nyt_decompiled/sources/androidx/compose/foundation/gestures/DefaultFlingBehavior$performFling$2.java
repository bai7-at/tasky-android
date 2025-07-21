package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.SuspendAnimationKt;
import defpackage.bi;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.fi;
import defpackage.gi;
import defpackage.gt2;
import defpackage.oc1;
import defpackage.qc7;
import defpackage.ss2;
import defpackage.ww8;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", l = {965}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class DefaultFlingBehavior$performFling$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ qc7 $this_performFling;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DefaultFlingBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultFlingBehavior$performFling$2(float f, DefaultFlingBehavior defaultFlingBehavior, qc7 qc7Var, by0 by0Var) {
        super(2, by0Var);
        this.$initialVelocity = f;
        this.this$0 = defaultFlingBehavior;
        this.$this_performFling = qc7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DefaultFlingBehavior$performFling$2(this.$initialVelocity, this.this$0, this.$this_performFling, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f;
        Ref$FloatRef ref$FloatRef;
        fi fiVar;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            if (Math.abs(this.$initialVelocity) <= 1.0f) {
                f = this.$initialVelocity;
                return cc0.b(f);
            }
            final Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            ref$FloatRef2.element = this.$initialVelocity;
            final Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
            fi c = gi.c(0.0f, this.$initialVelocity, 0L, 0L, false, 28, null);
            try {
                oc1 b = this.this$0.b();
                final qc7 qc7Var = this.$this_performFling;
                final DefaultFlingBehavior defaultFlingBehavior = this.this$0;
                ss2 ss2Var = new ss2() { // from class: androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(bi biVar) {
                        float floatValue = ((Number) biVar.e()).floatValue() - Ref$FloatRef.this.element;
                        float a = qc7Var.a(floatValue);
                        Ref$FloatRef.this.element = ((Number) biVar.e()).floatValue();
                        ref$FloatRef2.element = ((Number) biVar.f()).floatValue();
                        if (Math.abs(floatValue - a) > 0.5f) {
                            biVar.a();
                        }
                        DefaultFlingBehavior defaultFlingBehavior2 = defaultFlingBehavior;
                        defaultFlingBehavior2.e(defaultFlingBehavior2.c() + 1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        b((bi) obj2);
                        return ww8.a;
                    }
                };
                this.L$0 = ref$FloatRef2;
                this.L$1 = c;
                this.label = 1;
                if (SuspendAnimationKt.i(c, b, false, ss2Var, this, 2, null) == h) {
                    return h;
                }
                ref$FloatRef = ref$FloatRef2;
            } catch (CancellationException unused) {
                ref$FloatRef = ref$FloatRef2;
                fiVar = c;
                ref$FloatRef.element = ((Number) fiVar.t()).floatValue();
                f = ref$FloatRef.element;
                return cc0.b(f);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fiVar = (fi) this.L$1;
            ref$FloatRef = (Ref$FloatRef) this.L$0;
            try {
                f.b(obj);
            } catch (CancellationException unused2) {
                ref$FloatRef.element = ((Number) fiVar.t()).floatValue();
                f = ref$FloatRef.element;
                return cc0.b(f);
            }
        }
        f = ref$FloatRef.element;
        return cc0.b(f);
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((DefaultFlingBehavior$performFling$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
