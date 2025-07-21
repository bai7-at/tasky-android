package androidx.compose.material3;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$4$1", f = "ModalBottomSheet.android.kt", l = {282}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ModalBottomSheet_androidKt$ModalBottomSheet$4$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ SheetState $sheetState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModalBottomSheet_androidKt$ModalBottomSheet$4$1(SheetState sheetState, by0 by0Var) {
        super(2, by0Var);
        this.$sheetState = sheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ModalBottomSheet_androidKt$ModalBottomSheet$4$1(this.$sheetState, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            SheetState sheetState = this.$sheetState;
            this.label = 1;
            if (sheetState.r(this) == h) {
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

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((ModalBottomSheet_androidKt$ModalBottomSheet$4$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
