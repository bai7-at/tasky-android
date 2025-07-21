package androidx.compose.material3;

import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3$1$4$1", f = "ModalBottomSheet.android.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ModalBottomSheet_androidKt$ModalBottomSheet$3$1$4$1 extends SuspendLambda implements it2 {
    final /* synthetic */ ss2 $settleToDismiss;
    /* synthetic */ float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModalBottomSheet_androidKt$ModalBottomSheet$3$1$4$1(ss2 ss2Var, by0 by0Var) {
        super(3, by0Var);
        this.$settleToDismiss = ss2Var;
    }

    public final Object b(CoroutineScope coroutineScope, float f, by0 by0Var) {
        ModalBottomSheet_androidKt$ModalBottomSheet$3$1$4$1 modalBottomSheet_androidKt$ModalBottomSheet$3$1$4$1 = new ModalBottomSheet_androidKt$ModalBottomSheet$3$1$4$1(this.$settleToDismiss, by0Var);
        modalBottomSheet_androidKt$ModalBottomSheet$3$1$4$1.F$0 = f;
        return modalBottomSheet_androidKt$ModalBottomSheet$3$1$4$1.invokeSuspend(ww8.a);
    }

    @Override // defpackage.it2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return b((CoroutineScope) obj, ((Number) obj2).floatValue(), (by0) obj3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        this.$settleToDismiss.invoke(cc0.b(this.F$0));
        return ww8.a;
    }
}
