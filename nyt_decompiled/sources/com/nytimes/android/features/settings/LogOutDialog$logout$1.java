package com.nytimes.android.features.settings;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.settings.LogOutDialog$logout$1", f = "LogOutDialog.kt", l = {43}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LogOutDialog$logout$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ LogOutDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LogOutDialog$logout$1(LogOutDialog logOutDialog, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = logOutDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new LogOutDialog$logout$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            com.nytimes.android.entitlements.a g1 = this.this$0.g1();
            this.label = 1;
            if (g1.d(this) == h) {
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
        return ((LogOutDialog$logout$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
