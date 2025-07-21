package androidx.compose.foundation.pager;

import androidx.compose.animation.core.SuspendAnimationKt;
import defpackage.by0;
import defpackage.ci;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.i04;
import defpackage.qc7;
import defpackage.uo6;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Ref$FloatRef;

@fc1(c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3$1", f = "PagerState.kt", l = {552}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class PagerState$animateScrollToPage$3$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ ci $animationSpec;
    final /* synthetic */ int $targetPage;
    final /* synthetic */ int $targetPageOffsetToSnappedPosition;
    final /* synthetic */ i04 $this_with;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PagerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagerState$animateScrollToPage$3$1(PagerState pagerState, int i, i04 i04Var, int i2, ci ciVar, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = pagerState;
        this.$targetPage = i;
        this.$this_with = i04Var;
        this.$targetPageOffsetToSnappedPosition = i2;
        this.$animationSpec = ciVar;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(qc7 qc7Var, by0 by0Var) {
        return ((PagerState$animateScrollToPage$3$1) create(qc7Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        PagerState$animateScrollToPage$3$1 pagerState$animateScrollToPage$3$1 = new PagerState$animateScrollToPage$3$1(this.this$0, this.$targetPage, this.$this_with, this.$targetPageOffsetToSnappedPosition, this.$animationSpec, by0Var);
        pagerState$animateScrollToPage$3$1.L$0 = obj;
        return pagerState$animateScrollToPage$3$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            final qc7 qc7Var = (qc7) this.L$0;
            this.this$0.o0(qc7Var, this.$targetPage);
            boolean z = this.$targetPage > this.$this_with.c();
            int e = (this.$this_with.e() - this.$this_with.c()) + 1;
            if (((z && this.$targetPage > this.$this_with.e()) || (!z && this.$targetPage < this.$this_with.c())) && Math.abs(this.$targetPage - this.$this_with.c()) >= 3) {
                this.$this_with.g(qc7Var, z ? uo6.d(this.$targetPage - e, this.$this_with.c()) : uo6.i(this.$targetPage + e, this.$this_with.c()), 0);
            }
            int d = this.$this_with.d();
            int w = this.this$0.w();
            float x = (((this.$targetPage * d) - (w * d)) + this.$targetPageOffsetToSnappedPosition) - (d * this.this$0.x());
            final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
            ci ciVar = this.$animationSpec;
            gt2 gt2Var = new gt2() { // from class: androidx.compose.foundation.pager.PagerState$animateScrollToPage$3$1.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(float f, float f2) {
                    Ref$FloatRef.this.element += qc7Var.a(f - Ref$FloatRef.this.element);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    b(((Number) obj2).floatValue(), ((Number) obj3).floatValue());
                    return ww8.a;
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.e(0.0f, x, 0.0f, ciVar, gt2Var, this, 4, null) == h) {
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
