package com.nytimes.android.subauth.core.api.setup;

import com.comscore.streaming.AdvertisementType;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.subauth.core.api.setup.Subauth$startup$1", f = "Subauth.kt", l = {196, 207, AdvertisementType.ON_DEMAND_MID_ROLL}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class Subauth$startup$1 extends SuspendLambda implements gt2 {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Subauth this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Subauth$startup$1(Subauth subauth, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = subauth;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new Subauth$startup$1(this.this$0, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
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
            if (r1 == 0) goto L32
            if (r1 == r4) goto L2e
            if (r1 == r3) goto L26
            if (r1 != r2) goto L1e
            java.lang.Object r0 = r6.L$1
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager r0 = (com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager) r0
            java.lang.Object r6 = r6.L$0
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager r6 = (com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager) r6
            kotlin.f.b(r7)
            goto L8f
        L1e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L26:
            java.lang.Object r1 = r6.L$0
            kl7 r1 = (defpackage.kl7) r1
            kotlin.f.b(r7)
            goto L77
        L2e:
            kotlin.f.b(r7)
            goto L48
        L32:
            kotlin.f.b(r7)
            com.nytimes.android.subauth.core.api.setup.Subauth r7 = r6.this$0
            d68 r7 = com.nytimes.android.subauth.core.api.setup.Subauth.c(r7)
            qz8 r7 = r7.m()
            r6.label = r4
            java.lang.Object r7 = r7.e(r6)
            if (r7 != r0) goto L48
            return r0
        L48:
            com.nytimes.android.subauth.core.database.userdata.UserData r7 = (com.nytimes.android.subauth.core.database.userdata.UserData) r7
            if (r7 == 0) goto L5c
            com.nytimes.android.subauth.core.api.setup.Subauth r1 = r6.this$0
            d68 r1 = com.nytimes.android.subauth.core.api.setup.Subauth.c(r1)
            com.nytimes.android.subauth.core.nytuser.NYTUserImpl r1 = r1.l()
            r4 = 0
            com.nytimes.android.subauth.core.api.listeners.NYTUserUpdateSource r5 = com.nytimes.android.subauth.core.api.listeners.NYTUserUpdateSource.DB_INITIAL_LOAD
            r1.D(r7, r4, r5)
        L5c:
            com.nytimes.android.subauth.core.api.setup.Subauth r7 = r6.this$0
            d68 r7 = com.nytimes.android.subauth.core.api.setup.Subauth.c(r7)
            kl7 r7 = r7.k()
            if (r7 == 0) goto L69
            goto L6a
        L69:
            r7 = 0
        L6a:
            if (r7 == 0) goto L77
            r6.L$0 = r7
            r6.label = r3
            java.lang.Object r7 = r7.b(r6)
            if (r7 != r0) goto L77
            return r0
        L77:
            com.nytimes.android.subauth.core.api.setup.Subauth r7 = r6.this$0
            d68 r7 = com.nytimes.android.subauth.core.api.setup.Subauth.c(r7)
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager r7 = r7.q()
            r6.L$0 = r7
            r6.L$1 = r7
            r6.label = r2
            java.lang.Object r6 = r7.b0(r6)
            if (r6 != r0) goto L8e
            return r0
        L8e:
            r0 = r7
        L8f:
            r0.h0()
            ww8 r6 = defpackage.ww8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.api.setup.Subauth$startup$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((Subauth$startup$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
