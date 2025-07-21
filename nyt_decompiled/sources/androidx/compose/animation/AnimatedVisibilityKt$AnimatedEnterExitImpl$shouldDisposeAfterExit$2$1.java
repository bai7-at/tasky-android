package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.y;
import com.comscore.streaming.ContentDeliveryAdvertisementCapability;
import defpackage.a46;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.x08;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1", f = "AnimatedVisibility.kt", l = {ContentDeliveryAdvertisementCapability.DYNAMIC_REPLACEMENT}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Transition $childTransition;
    final /* synthetic */ x08 $shouldDisposeBlockUpdated$delegate;
    private /* synthetic */ Object L$0;
    int label;

    static final class a implements FlowCollector {
        final /* synthetic */ a46 a;
        final /* synthetic */ Transition b;
        final /* synthetic */ x08 c;

        a(a46 a46Var, Transition transition, x08 x08Var) {
            this.a = a46Var;
            this.b = transition;
            this.c = x08Var;
        }

        public final Object a(boolean z, by0 by0Var) {
            boolean z2;
            gt2 b;
            a46 a46Var = this.a;
            if (z) {
                b = AnimatedVisibilityKt.b(this.c);
                z2 = ((Boolean) b.invoke(this.b.h(), this.b.n())).booleanValue();
            } else {
                z2 = false;
            }
            a46Var.setValue(cc0.a(z2));
            return ww8.a;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, by0 by0Var) {
            return a(((Boolean) obj).booleanValue(), by0Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(Transition transition, x08 x08Var, by0 by0Var) {
        super(2, by0Var);
        this.$childTransition = transition;
        this.$shouldDisposeBlockUpdated$delegate = x08Var;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(a46 a46Var, by0 by0Var) {
        return ((AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1) create(a46Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(this.$childTransition, this.$shouldDisposeBlockUpdated$delegate, by0Var);
        animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.L$0 = obj;
        return animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            a46 a46Var = (a46) this.L$0;
            final Transition transition = this.$childTransition;
            Flow p = y.p(new qs2() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Boolean mo865invoke() {
                    boolean j;
                    j = AnimatedVisibilityKt.j(Transition.this);
                    return Boolean.valueOf(j);
                }
            });
            a aVar = new a(a46Var, this.$childTransition, this.$shouldDisposeBlockUpdated$delegate);
            this.label = 1;
            if (p.collect(aVar, this) == h) {
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
}
