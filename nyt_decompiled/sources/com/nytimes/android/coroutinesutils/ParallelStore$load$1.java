package com.nytimes.android.coroutinesutils;

import com.comscore.android.util.AndroidTcfDataLoader;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.coroutinesutils.ParallelStore$load$1", f = "ParallelStore.kt", l = {57, 59, 64, MdtaMetadataEntry.TYPE_INDICATOR_INT32, 76, AndroidTcfDataLoader.COMSCORE_VENDOR_INDEX, 80, 82}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ParallelStore$load$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Object $currentData;
    final /* synthetic */ ss2 $paramsProvider;
    final /* synthetic */ ParallelDownloadStrategy $strategy;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ParallelStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ParallelStore$load$1(ParallelStore parallelStore, Object obj, ParallelDownloadStrategy parallelDownloadStrategy, ss2 ss2Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = parallelStore;
        this.$currentData = obj;
        this.$strategy = parallelDownloadStrategy;
        this.$paramsProvider = ss2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        ParallelStore$load$1 parallelStore$load$1 = new ParallelStore$load$1(this.this$0, this.$currentData, this.$strategy, this.$paramsProvider, by0Var);
        parallelStore$load$1.L$0 = obj;
        return parallelStore$load$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x010e, code lost:
    
        if (((java.lang.Boolean) r9.invoke(r1)).booleanValue() == false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0154 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.coroutinesutils.ParallelStore$load$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((ParallelStore$load$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
