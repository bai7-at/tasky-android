package com.nytimes.subauth.ui.ui.dialogs;

import com.nytimes.subauth.ui.accountdelete.AccountDeleteViewModel;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.subauth.ui.ui.dialogs.DeleteAccountDialogsKt$DialogContent$1$1", f = "DeleteAccountDialogs.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DeleteAccountDialogsKt$DialogContent$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ AccountDeleteViewModel.AccountDeleteDialogState $dialog;
    final /* synthetic */ ss2 $onDialogVisible;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeleteAccountDialogsKt$DialogContent$1$1(ss2 ss2Var, AccountDeleteViewModel.AccountDeleteDialogState accountDeleteDialogState, by0 by0Var) {
        super(2, by0Var);
        this.$onDialogVisible = ss2Var;
        this.$dialog = accountDeleteDialogState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DeleteAccountDialogsKt$DialogContent$1$1(this.$onDialogVisible, this.$dialog, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.$onDialogVisible.invoke(this.$dialog);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((DeleteAccountDialogsKt$DialogContent$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
