package com.nytimes.android.readerhybrid;

import com.comscore.streaming.EventType;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.readerhybrid.HybridUserInfoBuilder$buildUserInfo$2", f = "HybridUserInfoBuilder.kt", l = {21, EventType.CDN}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HybridUserInfoBuilder$buildUserInfo$2 extends SuspendLambda implements gt2 {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ HybridUserInfoBuilder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridUserInfoBuilder$buildUserInfo$2(HybridUserInfoBuilder hybridUserInfoBuilder, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = hybridUserInfoBuilder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new HybridUserInfoBuilder$buildUserInfo$2(this.this$0, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0089  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 == r3) goto L2a
            if (r1 != r2) goto L22
            java.lang.Object r0 = r7.L$2
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r7.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r7.L$0
            java.lang.String r2 = (java.lang.String) r2
            kotlin.f.b(r8)
            r3 = r0
            r6 = r2
            r2 = r1
            r1 = r6
            goto L6f
        L22:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2a:
            kotlin.f.b(r8)
            goto L40
        L2e:
            kotlin.f.b(r8)
            com.nytimes.android.readerhybrid.HybridUserInfoBuilder r8 = r7.this$0
            ab6 r8 = com.nytimes.android.readerhybrid.HybridUserInfoBuilder.a(r8)
            r7.label = r3
            java.lang.Object r8 = r8.a(r7)
            if (r8 != r0) goto L40
            return r0
        L40:
            java.lang.String r8 = (java.lang.String) r8
            com.nytimes.android.readerhybrid.HybridUserInfoBuilder r1 = r7.this$0
            z58 r1 = com.nytimes.android.readerhybrid.HybridUserInfoBuilder.b(r1)
            java.lang.String r1 = r1.G()
            com.nytimes.android.readerhybrid.HybridUserInfoBuilder r3 = r7.this$0
            z58 r3 = com.nytimes.android.readerhybrid.HybridUserInfoBuilder.b(r3)
            java.lang.String r3 = r3.D()
            com.nytimes.android.readerhybrid.HybridUserInfoBuilder r4 = r7.this$0
            z58 r4 = com.nytimes.android.readerhybrid.HybridUserInfoBuilder.b(r4)
            r7.L$0 = r1
            r7.L$1 = r3
            r7.L$2 = r8
            r7.label = r2
            java.lang.Object r2 = r4.C(r7)
            if (r2 != r0) goto L6b
            return r0
        L6b:
            r6 = r3
            r3 = r8
            r8 = r2
            r2 = r6
        L6f:
            r4 = r8
            java.lang.String r4 = (java.lang.String) r4
            com.nytimes.android.readerhybrid.HybridUserInfoBuilder r7 = r7.this$0
            z58 r7 = com.nytimes.android.readerhybrid.HybridUserInfoBuilder.b(r7)
            com.nytimes.android.subauth.core.api.client.NYTUser r7 = r7.h()
            java.util.List r7 = r7.i()
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r8 = r7.isEmpty()
            r0 = 0
            if (r8 == 0) goto L8a
            r7 = r0
        L8a:
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L96
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Set r7 = kotlin.collections.i.c1(r7)
            r5 = r7
            goto L97
        L96:
            r5 = r0
        L97:
            com.nytimes.android.hybrid.HybridUserInfo r7 = new com.nytimes.android.hybrid.HybridUserInfo
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.readerhybrid.HybridUserInfoBuilder$buildUserInfo$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((HybridUserInfoBuilder$buildUserInfo$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
