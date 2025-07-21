package com.nytimes.android.utils.snackbar;

import androidx.compose.material.SnackbarHostState;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.tv7;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.utils.snackbar.ShowSnackbarKt$manageSnackbar$1", f = "ShowSnackbar.kt", l = {27}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShowSnackbarKt$manageSnackbar$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ b $content;
    final /* synthetic */ ss2 $onVisibilityChange;
    final /* synthetic */ SnackbarHostState $this_manageSnackbar;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShowSnackbarKt$manageSnackbar$1(SnackbarHostState snackbarHostState, ss2 ss2Var, b bVar, by0 by0Var) {
        super(2, by0Var);
        this.$this_manageSnackbar = snackbarHostState;
        this.$onVisibilityChange = ss2Var;
        this.$content = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ShowSnackbarKt$manageSnackbar$1(this.$this_manageSnackbar, this.$onVisibilityChange, this.$content, by0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, ww8] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                tv7 b = this.$this_manageSnackbar.b();
                if (b != null) {
                    b.dismiss();
                }
                this.$onVisibilityChange.invoke(cc0.a(true));
                SnackbarHostState snackbarHostState = this.$this_manageSnackbar;
                b bVar = this.$content;
                this.label = 1;
                c = ShowSnackbarKt.c(snackbarHostState, bVar, this);
                if (c == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            this.$onVisibilityChange.invoke(cc0.a(false));
            this = ww8.a;
            return this;
        } catch (Throwable th) {
            this.$onVisibilityChange.invoke(cc0.a(false));
            throw th;
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((ShowSnackbarKt$manageSnackbar$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
