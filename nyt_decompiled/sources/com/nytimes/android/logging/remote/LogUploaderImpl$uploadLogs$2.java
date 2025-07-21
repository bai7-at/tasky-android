package com.nytimes.android.logging.remote;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.i84;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.logging.remote.LogUploaderImpl$uploadLogs$2", f = "LogUploaderImpl.kt", l = {40, 41, 42}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LogUploaderImpl$uploadLogs$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ i84 $logId;
    Object L$0;
    int label;
    final /* synthetic */ LogUploaderImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LogUploaderImpl$uploadLogs$2(LogUploaderImpl logUploaderImpl, i84 i84Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = logUploaderImpl;
        this.$logId = i84Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new LogUploaderImpl$uploadLogs$2(this.this$0, this.$logId, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a6 A[Catch: Exception -> 0x0017, TryCatch #0 {Exception -> 0x0017, blocks: (B:7:0x0012, B:8:0x009c, B:10:0x00a6, B:11:0x00ac, B:17:0x0022, B:18:0x008f, B:22:0x002a, B:23:0x0080, B:27:0x0031, B:29:0x0041, B:31:0x0048), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.logging.remote.LogUploaderImpl$uploadLogs$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((LogUploaderImpl$uploadLogs$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
