package com.nytimes.android.logging.remote;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.i84;
import defpackage.ie2;
import defpackage.ww8;
import java.io.File;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.logging.remote.LogUploaderImpl$deleteZippedLog$2", f = "LogUploaderImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LogUploaderImpl$deleteZippedLog$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ i84 $logId;
    int label;
    final /* synthetic */ LogUploaderImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LogUploaderImpl$deleteZippedLog$2(LogUploaderImpl logUploaderImpl, i84 i84Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = logUploaderImpl;
        this.$logId = i84Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new LogUploaderImpl$deleteZippedLog$2(this.this$0, this.$logId, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ie2 ie2Var;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        ie2Var = this.this$0.c;
        File a = ie2Var.a(this.$logId + ".zip");
        if (a.exists()) {
            a.delete();
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((LogUploaderImpl$deleteZippedLog$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
