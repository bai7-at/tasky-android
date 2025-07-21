package com.nytimes.android.utils.snackbar;

import androidx.compose.material.SnackbarHostState;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.tv7;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.utils.snackbar.ShowSnackbarKt$manageSnackbar$3$1", f = "ShowSnackbar.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShowSnackbarKt$manageSnackbar$3$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ SnackbarHostState $this_manageSnackbar;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShowSnackbarKt$manageSnackbar$3$1(SnackbarHostState snackbarHostState, by0 by0Var) {
        super(2, by0Var);
        this.$this_manageSnackbar = snackbarHostState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ShowSnackbarKt$manageSnackbar$3$1(this.$this_manageSnackbar, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        tv7 b = this.$this_manageSnackbar.b();
        if (b != null) {
            b.dismiss();
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((ShowSnackbarKt$manageSnackbar$3$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
