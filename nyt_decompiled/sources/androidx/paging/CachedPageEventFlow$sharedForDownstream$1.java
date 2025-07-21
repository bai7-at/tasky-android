package androidx.paging;

import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "androidx.paging.CachedPageEventFlow$sharedForDownstream$1", f = "CachedPageEventFlow.kt", l = {62, MdtaMetadataEntry.TYPE_INDICATOR_INT32}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class CachedPageEventFlow$sharedForDownstream$1 extends SuspendLambda implements gt2 {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CachedPageEventFlow this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CachedPageEventFlow$sharedForDownstream$1(CachedPageEventFlow cachedPageEventFlow, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = cachedPageEventFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        CachedPageEventFlow$sharedForDownstream$1 cachedPageEventFlow$sharedForDownstream$1 = new CachedPageEventFlow$sharedForDownstream$1(this.this$0, by0Var);
        cachedPageEventFlow$sharedForDownstream$1.L$0 = obj;
        return cachedPageEventFlow$sharedForDownstream$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2a
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r1 = r4.L$1
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r4.L$0
            kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
            kotlin.f.b(r5)
            goto L56
        L1a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L22:
            java.lang.Object r1 = r4.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.f.b(r5)
            goto L43
        L2a:
            kotlin.f.b(r5)
            java.lang.Object r5 = r4.L$0
            r1 = r5
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            androidx.paging.CachedPageEventFlow r5 = r4.this$0
            androidx.paging.FlattenedPageController r5 = androidx.paging.CachedPageEventFlow.c(r5)
            r4.L$0 = r1
            r4.label = r3
            java.lang.Object r5 = r5.b(r4)
            if (r5 != r0) goto L43
            return r0
        L43:
            java.util.List r5 = (java.util.List) r5
            androidx.paging.CachedPageEventFlow r3 = r4.this$0
            kotlinx.coroutines.Job r3 = androidx.paging.CachedPageEventFlow.a(r3)
            r3.start()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            r3 = r1
            r1 = r5
        L56:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L6f
            java.lang.Object r5 = r1.next()
            bj3 r5 = (defpackage.bj3) r5
            r4.L$0 = r3
            r4.L$1 = r1
            r4.label = r2
            java.lang.Object r5 = r3.emit(r5, r4)
            if (r5 != r0) goto L56
            return r0
        L6f:
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.CachedPageEventFlow$sharedForDownstream$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((CachedPageEventFlow$sharedForDownstream$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
