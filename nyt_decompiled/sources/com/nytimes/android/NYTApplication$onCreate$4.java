package com.nytimes.android;

import com.comscore.streaming.ContentFeedType;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.NYTApplication$onCreate$4", f = "NYTApplication.kt", l = {ContentFeedType.OTHER, 301, ContentFeedType.EAST_SD}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class NYTApplication$onCreate$4 extends SuspendLambda implements gt2 {
    Object L$0;
    int label;
    final /* synthetic */ NYTApplication this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NYTApplication$onCreate$4(NYTApplication nYTApplication, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = nYTApplication;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new NYTApplication$onCreate$4(this.this$0, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r6.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2f
            if (r1 == r4) goto L2b
            if (r1 == r3) goto L27
            if (r1 != r2) goto L1f
            java.lang.Object r6 = r6.L$0
            hx1 r6 = (defpackage.hx1) r6
            kotlin.f.b(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.j()
            goto L6a
        L1f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L27:
            kotlin.f.b(r7)
            goto L50
        L2b:
            kotlin.f.b(r7)
            goto L41
        L2f:
            kotlin.f.b(r7)
            com.nytimes.android.NYTApplication r7 = r6.this$0
            com.nytimes.android.recentlyviewed.RecentlyViewedManager r7 = r7.J()
            r6.label = r4
            java.lang.Object r7 = r7.q(r6)
            if (r7 != r0) goto L41
            return r0
        L41:
            com.nytimes.android.NYTApplication r7 = r6.this$0
            com.nytimes.android.utils.LegacyFileUtils r7 = r7.x()
            r6.label = r3
            java.lang.Object r7 = r7.removeLegacyFiles(r6)
            if (r7 != r0) goto L50
            return r0
        L50:
            com.nytimes.android.NYTApplication r7 = r6.this$0
            hx1 r7 = r7.n()
            com.nytimes.android.NYTApplication r1 = r6.this$0
            z58 r1 = r1.O()
            r6.L$0 = r7
            r6.label = r2
            java.lang.Object r6 = r1.f(r6)
            if (r6 != r0) goto L67
            return r0
        L67:
            r5 = r7
            r7 = r6
            r6 = r5
        L6a:
            r6.m(r7)
            ww8 r6 = defpackage.ww8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.NYTApplication$onCreate$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((NYTApplication$onCreate$4) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
