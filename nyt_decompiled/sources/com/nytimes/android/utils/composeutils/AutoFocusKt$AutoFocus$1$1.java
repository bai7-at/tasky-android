package com.nytimes.android.utils.composeutils;

import androidx.compose.ui.focus.FocusRequester;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.utils.composeutils.AutoFocusKt$AutoFocus$1$1", f = "AutoFocus.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AutoFocusKt$AutoFocus$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ FocusRequester $focusRequester;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoFocusKt$AutoFocus$1$1(FocusRequester focusRequester, by0 by0Var) {
        super(2, by0Var);
        this.$focusRequester = focusRequester;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AutoFocusKt$AutoFocus$1$1(this.$focusRequester, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.$focusRequester.e();
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AutoFocusKt$AutoFocus$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
