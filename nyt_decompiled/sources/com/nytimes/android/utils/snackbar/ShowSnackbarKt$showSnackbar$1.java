package com.nytimes.android.utils.snackbar;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.utils.snackbar.ShowSnackbarKt", f = "ShowSnackbar.kt", l = {56, 62, 72}, m = "showSnackbar")
/* loaded from: classes4.dex */
final class ShowSnackbarKt$showSnackbar$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    ShowSnackbarKt$showSnackbar$1(by0 by0Var) {
        super(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        c = ShowSnackbarKt.c(null, null, this);
        return c;
    }
}
