package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import defpackage.aj8;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fd5;
import defpackage.fy5;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1", f = "ClickableText.kt", l = {82}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ClickableTextKt$ClickableText$pressIndicator$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ sy4 $layoutResult;
    final /* synthetic */ ss2 $onClick;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClickableTextKt$ClickableText$pressIndicator$1$1(sy4 sy4Var, ss2 ss2Var, by0 by0Var) {
        super(2, by0Var);
        this.$layoutResult = sy4Var;
        this.$onClick = ss2Var;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(fy5 fy5Var, by0 by0Var) {
        return ((ClickableTextKt$ClickableText$pressIndicator$1$1) create(fy5Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        ClickableTextKt$ClickableText$pressIndicator$1$1 clickableTextKt$ClickableText$pressIndicator$1$1 = new ClickableTextKt$ClickableText$pressIndicator$1$1(this.$layoutResult, this.$onClick, by0Var);
        clickableTextKt$ClickableText$pressIndicator$1$1.L$0 = obj;
        return clickableTextKt$ClickableText$pressIndicator$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            fy5 fy5Var = (fy5) this.L$0;
            final sy4 sy4Var = this.$layoutResult;
            final ss2 ss2Var = this.$onClick;
            ss2 ss2Var2 = new ss2() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(long j) {
                    aj8 aj8Var = (aj8) sy4.this.getValue();
                    if (aj8Var != null) {
                        ss2Var.invoke(Integer.valueOf(aj8Var.x(j)));
                    }
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    b(((fd5) obj2).x());
                    return ww8.a;
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.j(fy5Var, null, null, null, ss2Var2, this, 7, null) == h) {
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
