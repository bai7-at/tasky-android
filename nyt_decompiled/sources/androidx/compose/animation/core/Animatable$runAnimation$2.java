package androidx.compose.animation.core;

import defpackage.ai;
import defpackage.bi;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fi;
import defpackage.gi;
import defpackage.mi;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.yh;
import defpackage.zq3;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Ref$BooleanRef;

@fc1(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {312}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class Animatable$runAnimation$2 extends SuspendLambda implements ss2 {
    final /* synthetic */ yh $animation;
    final /* synthetic */ ss2 $block;
    final /* synthetic */ Object $initialVelocity;
    final /* synthetic */ long $startTime;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Animatable this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Animatable$runAnimation$2(Animatable animatable, Object obj, yh yhVar, long j, ss2 ss2Var, by0 by0Var) {
        super(1, by0Var);
        this.this$0 = animatable;
        this.$initialVelocity = obj;
        this.$animation = yhVar;
        this.$startTime = j;
        this.$block = ss2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new Animatable$runAnimation$2(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((Animatable$runAnimation$2) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fi fiVar;
        Ref$BooleanRef ref$BooleanRef;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                this.this$0.j().G((mi) this.this$0.l().a().invoke(this.$initialVelocity));
                this.this$0.s(this.$animation.g());
                this.this$0.r(true);
                final fi h2 = gi.h(this.this$0.j(), null, null, 0L, Long.MIN_VALUE, false, 23, null);
                final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                yh yhVar = this.$animation;
                long j = this.$startTime;
                final Animatable animatable = this.this$0;
                final ss2 ss2Var = this.$block;
                ss2 ss2Var2 = new ss2() { // from class: androidx.compose.animation.core.Animatable$runAnimation$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(bi biVar) {
                        Object h3;
                        SuspendAnimationKt.p(biVar, Animatable.this.j());
                        h3 = Animatable.this.h(biVar.e());
                        if (zq3.c(h3, biVar.e())) {
                            ss2 ss2Var3 = ss2Var;
                            if (ss2Var3 != null) {
                                ss2Var3.invoke(Animatable.this);
                                return;
                            }
                            return;
                        }
                        Animatable.this.j().F(h3);
                        h2.F(h3);
                        ss2 ss2Var4 = ss2Var;
                        if (ss2Var4 != null) {
                            ss2Var4.invoke(Animatable.this);
                        }
                        biVar.a();
                        ref$BooleanRef2.element = true;
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        b((bi) obj2);
                        return ww8.a;
                    }
                };
                this.L$0 = h2;
                this.L$1 = ref$BooleanRef2;
                this.label = 1;
                if (SuspendAnimationKt.c(h2, yhVar, j, ss2Var2, this) == h) {
                    return h;
                }
                fiVar = h2;
                ref$BooleanRef = ref$BooleanRef2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ref$BooleanRef = (Ref$BooleanRef) this.L$1;
                fiVar = (fi) this.L$0;
                f.b(obj);
            }
            AnimationEndReason animationEndReason = ref$BooleanRef.element ? AnimationEndReason.BoundReached : AnimationEndReason.Finished;
            this.this$0.i();
            return new ai(fiVar, animationEndReason);
        } catch (CancellationException e) {
            this.this$0.i();
            throw e;
        }
    }
}
