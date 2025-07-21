package com.airbnb.android.showkase.ui;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.airbnb.android.showkase.ui.BackButtonHandlerKt$handler$2", f = "BackButtonHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class BackButtonHandlerKt$handler$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ a $handler;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BackButtonHandlerKt$handler$2(a aVar, boolean z, by0 by0Var) {
        super(2, by0Var);
        this.$handler = aVar;
        this.$enabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new BackButtonHandlerKt$handler$2(this.$handler, this.$enabled, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.$handler.setEnabled(this.$enabled);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((BackButtonHandlerKt$handler$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
