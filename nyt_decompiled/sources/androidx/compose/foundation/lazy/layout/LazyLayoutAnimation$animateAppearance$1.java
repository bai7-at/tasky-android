package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ph2;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$animateAppearance$1", f = "LazyLayoutAnimation.kt", l = {155, 156}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class LazyLayoutAnimation$animateAppearance$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ ph2 $spec;
    int label;
    final /* synthetic */ LazyLayoutAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyLayoutAnimation$animateAppearance$1(LazyLayoutAnimation lazyLayoutAnimation, ph2 ph2Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = lazyLayoutAnimation;
        this.$spec = ph2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new LazyLayoutAnimation$animateAppearance$1(this.this$0, this.$spec, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Animatable animatable;
        Animatable animatable2;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.f.b(obj);
                animatable = this.this$0.h;
                Float b = cc0.b(0.0f);
                this.label = 1;
                if (animatable.t(b, this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.f.b(obj);
                    this.this$0.r(false);
                    return ww8.a;
                }
                kotlin.f.b(obj);
            }
            animatable2 = this.this$0.h;
            Float b2 = cc0.b(1.0f);
            ph2 ph2Var = this.$spec;
            final LazyLayoutAnimation lazyLayoutAnimation = this.this$0;
            ss2 ss2Var = new ss2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$animateAppearance$1.1
                {
                    super(1);
                }

                public final void b(Animatable animatable3) {
                    LazyLayoutAnimation.this.y(((Number) animatable3.m()).floatValue());
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    b((Animatable) obj2);
                    return ww8.a;
                }
            };
            this.label = 2;
            if (Animatable.f(animatable2, b2, ph2Var, null, ss2Var, this, 4, null) == h) {
                return h;
            }
            this.this$0.r(false);
            return ww8.a;
        } catch (Throwable th) {
            this.this$0.r(false);
            throw th;
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((LazyLayoutAnimation$animateAppearance$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
