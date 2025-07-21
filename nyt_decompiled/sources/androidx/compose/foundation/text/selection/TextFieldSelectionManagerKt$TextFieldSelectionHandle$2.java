package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fy5;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.xh8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$2", f = "TextFieldSelectionManager.kt", l = {969}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class TextFieldSelectionManagerKt$TextFieldSelectionHandle$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ xh8 $observer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionManagerKt$TextFieldSelectionHandle$2(xh8 xh8Var, by0 by0Var) {
        super(2, by0Var);
        this.$observer = xh8Var;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(fy5 fy5Var, by0 by0Var) {
        return ((TextFieldSelectionManagerKt$TextFieldSelectionHandle$2) create(fy5Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        TextFieldSelectionManagerKt$TextFieldSelectionHandle$2 textFieldSelectionManagerKt$TextFieldSelectionHandle$2 = new TextFieldSelectionManagerKt$TextFieldSelectionHandle$2(this.$observer, by0Var);
        textFieldSelectionManagerKt$TextFieldSelectionHandle$2.L$0 = obj;
        return textFieldSelectionManagerKt$TextFieldSelectionHandle$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            fy5 fy5Var = (fy5) this.L$0;
            xh8 xh8Var = this.$observer;
            this.label = 1;
            if (LongPressTextDragObserverKt.c(fy5Var, xh8Var, this) == h) {
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
