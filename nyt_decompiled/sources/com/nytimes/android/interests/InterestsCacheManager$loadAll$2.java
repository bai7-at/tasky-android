package com.nytimes.android.interests;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.interests.InterestsCacheManager$loadAll$2", f = "InterestsCacheManager.kt", l = {42, 43}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class InterestsCacheManager$loadAll$2 extends SuspendLambda implements gt2 {
    Object L$0;
    int label;
    final /* synthetic */ InterestsCacheManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InterestsCacheManager$loadAll$2(InterestsCacheManager interestsCacheManager, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = interestsCacheManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new InterestsCacheManager$loadAll$2(this.this$0, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005a  */
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r0 = r6.L$0
            java.util.List r0 = (java.util.List) r0
            kotlin.f.b(r7)
            goto L4d
        L16:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L1e:
            kotlin.f.b(r7)
            goto L34
        L22:
            kotlin.f.b(r7)
            com.nytimes.android.interests.InterestsCacheManager r7 = r6.this$0
            gp3 r7 = com.nytimes.android.interests.InterestsCacheManager.b(r7)
            r6.label = r3
            java.lang.Object r7 = r7.a(r6)
            if (r7 != r0) goto L34
            return r0
        L34:
            java.util.List r7 = (java.util.List) r7
            com.nytimes.android.interests.InterestsCacheManager r1 = r6.this$0
            com.nytimes.android.interests.InterestsPreferencesStore r1 = com.nytimes.android.interests.InterestsCacheManager.c(r1)
            kotlinx.coroutines.flow.Flow r1 = r1.d()
            r6.L$0 = r7
            r6.label = r2
            java.lang.Object r1 = kotlinx.coroutines.flow.FlowKt.first(r1, r6)
            if (r1 != r0) goto L4b
            return r0
        L4b:
            r0 = r7
            r7 = r1
        L4d:
            gq3 r7 = (defpackage.gq3) r7
            com.nytimes.android.interests.InterestsOrder r1 = r7.a()
            java.util.List r1 = r1.b()
            r2 = 0
            if (r1 == 0) goto L64
            fp3 r3 = new fp3
            long r4 = r7.b()
            r3.<init>(r0, r1, r4)
            goto L65
        L64:
            r3 = r2
        L65:
            if (r3 == 0) goto L7a
            com.nytimes.android.interests.InterestsCacheManager r6 = r6.this$0
            bq3 r2 = new bq3
            java.util.List r7 = kotlin.collections.i.l()
            j91 r6 = com.nytimes.android.interests.InterestsCacheManager.e(r6)
            org.threeten.bp.Instant r6 = r6.d()
            r2.<init>(r3, r7, r6)
        L7a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.interests.InterestsCacheManager$loadAll$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((InterestsCacheManager$loadAll$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
