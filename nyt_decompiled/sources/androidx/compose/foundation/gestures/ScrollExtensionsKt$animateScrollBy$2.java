package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.SuspendAnimationKt;
import defpackage.by0;
import defpackage.ci;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qc7;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Ref$FloatRef;

@fc1(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ScrollExtensionsKt$animateScrollBy$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ ci $animationSpec;
    final /* synthetic */ Ref$FloatRef $previousValue;
    final /* synthetic */ float $value;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollExtensionsKt$animateScrollBy$2(float f, ci ciVar, Ref$FloatRef ref$FloatRef, by0 by0Var) {
        super(2, by0Var);
        this.$value = f;
        this.$animationSpec = ciVar;
        this.$previousValue = ref$FloatRef;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(qc7 qc7Var, by0 by0Var) {
        return ((ScrollExtensionsKt$animateScrollBy$2) create(qc7Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        ScrollExtensionsKt$animateScrollBy$2 scrollExtensionsKt$animateScrollBy$2 = new ScrollExtensionsKt$animateScrollBy$2(this.$value, this.$animationSpec, this.$previousValue, by0Var);
        scrollExtensionsKt$animateScrollBy$2.L$0 = obj;
        return scrollExtensionsKt$animateScrollBy$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            final qc7 qc7Var = (qc7) this.L$0;
            float f = this.$value;
            ci ciVar = this.$animationSpec;
            final Ref$FloatRef ref$FloatRef = this.$previousValue;
            gt2 gt2Var = new gt2() { // from class: androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(float f2, float f3) {
                    Ref$FloatRef ref$FloatRef2 = Ref$FloatRef.this;
                    float f4 = ref$FloatRef2.element;
                    ref$FloatRef2.element = f4 + qc7Var.a(f2 - f4);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    b(((Number) obj2).floatValue(), ((Number) obj3).floatValue());
                    return ww8.a;
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.e(0.0f, f, 0.0f, ciVar, gt2Var, this, 4, null) == h) {
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
}
