package com.nytimes.android.libs.messagingarchitecture.betasettings.composable;

import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.betasettings.composable.CachedMessageHistoryScreenKt$CachedMessageHistoryScreen$1", f = "CachedMessageHistoryScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CachedMessageHistoryScreenKt$CachedMessageHistoryScreen$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ SnackbarUtil $snackbar;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CachedMessageHistoryScreenKt$CachedMessageHistoryScreen$1(SnackbarUtil snackbarUtil, by0 by0Var) {
        super(2, by0Var);
        this.$snackbar = snackbarUtil;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new CachedMessageHistoryScreenKt$CachedMessageHistoryScreen$1(this.$snackbar, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        SnackbarUtil.z(this.$snackbar, "Tap to expand", 0, false, 6, null);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((CachedMessageHistoryScreenKt$CachedMessageHistoryScreen$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
