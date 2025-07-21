package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.TextFieldValue;
import defpackage.aj8;
import defpackage.bj8;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.id5;
import defpackage.qc0;
import defpackage.rh8;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1", f = "CoreTextField.kt", l = {330}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class CoreTextFieldKt$CoreTextField$focusModifier$1$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ qc0 $bringIntoViewRequester;
    final /* synthetic */ bj8 $layoutResult;
    final /* synthetic */ id5 $offsetMapping;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ TextFieldValue $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(qc0 qc0Var, TextFieldValue textFieldValue, TextFieldState textFieldState, bj8 bj8Var, id5 id5Var, by0 by0Var) {
        super(2, by0Var);
        this.$bringIntoViewRequester = qc0Var;
        this.$value = textFieldValue;
        this.$state = textFieldState;
        this.$layoutResult = bj8Var;
        this.$offsetMapping = id5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(this.$bringIntoViewRequester, this.$value, this.$state, this.$layoutResult, this.$offsetMapping, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            qc0 qc0Var = this.$bringIntoViewRequester;
            TextFieldValue textFieldValue = this.$value;
            rh8 s = this.$state.s();
            aj8 f = this.$layoutResult.f();
            id5 id5Var = this.$offsetMapping;
            this.label = 1;
            if (CoreTextFieldKt.m(qc0Var, textFieldValue, s, f, id5Var, this) == h) {
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

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((CoreTextFieldKt$CoreTextField$focusModifier$1$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
