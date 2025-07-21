package com.nytimes.android.features.you.youtab;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.you.youtab.YouScreenViewModel$loadSaved$1", f = "YouScreenViewModel.kt", l = {481, 482, 780, 485}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class YouScreenViewModel$loadSaved$1 extends SuspendLambda implements gt2 {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ YouScreenViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    YouScreenViewModel$loadSaved$1(YouScreenViewModel youScreenViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = youScreenViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new YouScreenViewModel$loadSaved$1(this.this$0, by0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:9:0x0020, B:11:0x0085, B:16:0x0098, B:18:0x00a0, B:20:0x00ae, B:23:0x00c0, B:31:0x003c, B:34:0x0081), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0 A[Catch: all -> 0x0025, TRY_LEAVE, TryCatch #0 {all -> 0x0025, blocks: (B:9:0x0020, B:11:0x0085, B:16:0x0098, B:18:0x00a0, B:20:0x00ae, B:23:0x00c0, B:31:0x003c, B:34:0x0081), top: B:2:0x000a }] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00ac -> B:10:0x00bd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00ba -> B:10:0x00bd). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.you.youtab.YouScreenViewModel$loadSaved$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((YouScreenViewModel$loadSaved$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
