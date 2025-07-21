package com.nytimes.android.features.you.youtab.composable;

import com.nytimes.android.features.you.youtab.YouEventSender;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.you.youtab.composable.LoggedOutContentKt$LoggedOutContent$1", f = "LoggedOutContent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LoggedOutContentKt$LoggedOutContent$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ YouEventSender $eventSender;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoggedOutContentKt$LoggedOutContent$1(YouEventSender youEventSender, by0 by0Var) {
        super(2, by0Var);
        this.$eventSender = youEventSender;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new LoggedOutContentKt$LoggedOutContent$1(this.$eventSender, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.$eventSender.B();
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((LoggedOutContentKt$LoggedOutContent$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
