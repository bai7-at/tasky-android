package com.nytimes.android.hybrid.bridge;

import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.hybrid.bridge.SetPTREnabledCommand$run$2", f = "SetPTREnabledCommand.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SetPTREnabledCommand$run$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ int $id;
    final /* synthetic */ boolean $pullToRefreshEnabled;
    int label;
    final /* synthetic */ SetPTREnabledCommand this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SetPTREnabledCommand$run$2(SetPTREnabledCommand setPTREnabledCommand, int i, boolean z, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = setPTREnabledCommand;
        this.$id = i;
        this.$pullToRefreshEnabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SetPTREnabledCommand$run$2(this.this$0, this.$id, this.$pullToRefreshEnabled, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gt2 gt2Var;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        gt2Var = this.this$0.c;
        return gt2Var.invoke(cc0.c(this.$id), cc0.a(this.$pullToRefreshEnabled));
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SetPTREnabledCommand$run$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
