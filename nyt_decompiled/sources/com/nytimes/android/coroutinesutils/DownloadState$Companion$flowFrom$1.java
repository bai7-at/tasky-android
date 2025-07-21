package com.nytimes.android.coroutinesutils;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.coroutinesutils.DownloadState$Companion$flowFrom$1", f = "DownloadState.kt", l = {76, 78, 78, 80}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DownloadState$Companion$flowFrom$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ ss2 $call;
    final /* synthetic */ qs2 $currentData;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadState$Companion$flowFrom$1(qs2 qs2Var, ss2 ss2Var, by0 by0Var) {
        super(2, by0Var);
        this.$currentData = qs2Var;
        this.$call = ss2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        DownloadState$Companion$flowFrom$1 downloadState$Companion$flowFrom$1 = new DownloadState$Companion$flowFrom$1(this.$currentData, this.$call, by0Var);
        downloadState$Companion$flowFrom$1.L$0 = obj;
        return downloadState$Companion$flowFrom$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r8.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L44
            if (r1 == r5) goto L3c
            if (r1 == r4) goto L2d
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            kotlin.f.b(r9)
            goto L9e
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L22:
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.f.b(r9)     // Catch: java.lang.Exception -> L2b
            goto L9e
        L2b:
            r9 = move-exception
            goto L85
        L2d:
            java.lang.Object r1 = r8.L$1
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            java.lang.Object r4 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            kotlin.f.b(r9)     // Catch: java.lang.Exception -> L39
            goto L73
        L39:
            r9 = move-exception
            r1 = r4
            goto L85
        L3c:
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.f.b(r9)
            goto L63
        L44:
            kotlin.f.b(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
            com.nytimes.android.coroutinesutils.DownloadState$Companion r1 = com.nytimes.android.coroutinesutils.DownloadState.Companion
            qs2 r7 = r8.$currentData
            java.lang.Object r7 = r7.mo865invoke()
            com.nytimes.android.coroutinesutils.DownloadState r1 = r1.b(r7)
            r8.L$0 = r9
            r8.label = r5
            java.lang.Object r1 = r9.emit(r1, r8)
            if (r1 != r0) goto L62
            return r0
        L62:
            r1 = r9
        L63:
            ss2 r9 = r8.$call     // Catch: java.lang.Exception -> L2b
            r8.L$0 = r1     // Catch: java.lang.Exception -> L2b
            r8.L$1 = r1     // Catch: java.lang.Exception -> L2b
            r8.label = r4     // Catch: java.lang.Exception -> L2b
            java.lang.Object r9 = r9.invoke(r8)     // Catch: java.lang.Exception -> L2b
            if (r9 != r0) goto L72
            return r0
        L72:
            r4 = r1
        L73:
            com.nytimes.android.coroutinesutils.DownloadState$e r5 = new com.nytimes.android.coroutinesutils.DownloadState$e     // Catch: java.lang.Exception -> L39
            r5.<init>(r9)     // Catch: java.lang.Exception -> L39
            r8.L$0 = r4     // Catch: java.lang.Exception -> L39
            r8.L$1 = r6     // Catch: java.lang.Exception -> L39
            r8.label = r3     // Catch: java.lang.Exception -> L39
            java.lang.Object r8 = r1.emit(r5, r8)     // Catch: java.lang.Exception -> L39
            if (r8 != r0) goto L9e
            return r0
        L85:
            com.nytimes.android.coroutinesutils.DownloadState$Companion r3 = com.nytimes.android.coroutinesutils.DownloadState.Companion
            qs2 r4 = r8.$currentData
            java.lang.Object r4 = r4.mo865invoke()
            com.nytimes.android.coroutinesutils.DownloadState r9 = r3.a(r4, r9)
            r8.L$0 = r6
            r8.L$1 = r6
            r8.label = r2
            java.lang.Object r8 = r1.emit(r9, r8)
            if (r8 != r0) goto L9e
            return r0
        L9e:
            ww8 r8 = defpackage.ww8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.coroutinesutils.DownloadState$Companion$flowFrom$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((DownloadState$Companion$flowFrom$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
