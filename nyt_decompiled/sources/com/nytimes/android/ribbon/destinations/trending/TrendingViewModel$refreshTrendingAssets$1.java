package com.nytimes.android.ribbon.destinations.trending;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.ribbon.destinations.trending.TrendingViewModel$refreshTrendingAssets$1", f = "TrendingViewModel.kt", l = {31}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TrendingViewModel$refreshTrendingAssets$1 extends SuspendLambda implements gt2 {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ TrendingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrendingViewModel$refreshTrendingAssets$1(TrendingViewModel trendingViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = trendingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new TrendingViewModel$refreshTrendingAssets$1(this.this$0, by0Var);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0043 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0041 -> B:5:0x0044). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L21
            if (r1 != r2) goto L19
            java.lang.Object r1 = r5.L$2
            java.lang.Object r3 = r5.L$1
            com.nytimes.android.ribbon.destinations.trending.TrendingViewModel r3 = (com.nytimes.android.ribbon.destinations.trending.TrendingViewModel) r3
            java.lang.Object r4 = r5.L$0
            kotlinx.coroutines.flow.MutableStateFlow r4 = (kotlinx.coroutines.flow.MutableStateFlow) r4
            kotlin.f.b(r6)
            goto L44
        L19:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L21:
            kotlin.f.b(r6)
            com.nytimes.android.ribbon.destinations.trending.TrendingViewModel r6 = r5.this$0
            kotlinx.coroutines.flow.MutableStateFlow r6 = com.nytimes.android.ribbon.destinations.trending.TrendingViewModel.e(r6)
            com.nytimes.android.ribbon.destinations.trending.TrendingViewModel r1 = r5.this$0
            r4 = r6
            r3 = r1
        L2e:
            java.lang.Object r1 = r4.getValue()
            r6 = r1
            ss8 r6 = (defpackage.ss8) r6
            r5.L$0 = r4
            r5.L$1 = r3
            r5.L$2 = r1
            r5.label = r2
            java.lang.Object r6 = com.nytimes.android.ribbon.destinations.trending.TrendingViewModel.f(r3, r5)
            if (r6 != r0) goto L44
            return r0
        L44:
            ss8 r6 = (defpackage.ss8) r6
            boolean r6 = r4.compareAndSet(r1, r6)
            if (r6 == 0) goto L2e
            ww8 r5 = defpackage.ww8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.trending.TrendingViewModel$refreshTrendingAssets$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((TrendingViewModel$refreshTrendingAssets$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
