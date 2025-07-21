package com.nytimes.android.subauth.core.purchase;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$startPolling$1", f = "SubauthPurchaseManager.kt", l = {130, 131}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthPurchaseManager$startPolling$1 extends SuspendLambda implements gt2 {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SubauthPurchaseManager this$0;

    @fc1(c = "com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$startPolling$1$1", f = "SubauthPurchaseManager.kt", l = {143}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$startPolling$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements ss2 {
        int label;
        final /* synthetic */ SubauthPurchaseManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SubauthPurchaseManager subauthPurchaseManager, by0 by0Var) {
            super(1, by0Var);
            this.this$0 = subauthPurchaseManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(by0 by0Var) {
            return new AnonymousClass1(this.this$0, by0Var);
        }

        @Override // defpackage.ss2
        public final Object invoke(by0 by0Var) {
            return ((AnonymousClass1) create(by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                SubauthPurchaseManager subauthPurchaseManager = this.this$0;
                this.label = 1;
                if (subauthPurchaseManager.b0(this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthPurchaseManager$startPolling$1(SubauthPurchaseManager subauthPurchaseManager, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = subauthPurchaseManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        SubauthPurchaseManager$startPolling$1 subauthPurchaseManager$startPolling$1 = new SubauthPurchaseManager$startPolling$1(this.this$0, by0Var);
        subauthPurchaseManager$startPolling$1.L$0 = obj;
        return subauthPurchaseManager$startPolling$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r12.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2b
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r0 = r12.L$0
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            kotlin.f.b(r13)
            goto L69
        L17:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L1f:
            java.lang.Object r1 = r12.L$1
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager r1 = (com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager) r1
            java.lang.Object r3 = r12.L$0
            kotlinx.coroutines.CoroutineScope r3 = (kotlinx.coroutines.CoroutineScope) r3
            kotlin.f.b(r13)
            goto L4c
        L2b:
            kotlin.f.b(r13)
            java.lang.Object r13 = r12.L$0
            kotlinx.coroutines.CoroutineScope r13 = (kotlinx.coroutines.CoroutineScope) r13
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager r1 = r12.this$0
            ba1 r5 = r1.N()
            kotlinx.coroutines.flow.Flow r5 = r5.getData()
            r12.L$0 = r13
            r12.L$1 = r1
            r12.label = r3
            java.lang.Object r3 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r5, r12)
            if (r3 != r0) goto L49
            return r0
        L49:
            r11 = r3
            r3 = r13
            r13 = r11
        L4c:
            s16 r13 = (defpackage.s16) r13
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager.B(r1, r13)
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager r13 = r12.this$0
            ba1 r13 = r13.N()
            kotlinx.coroutines.flow.Flow r13 = r13.getData()
            r12.L$0 = r3
            r12.L$1 = r4
            r12.label = r2
            java.lang.Object r13 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r13, r12)
            if (r13 != r0) goto L68
            return r0
        L68:
            r0 = r3
        L69:
            s16 r13 = (defpackage.s16) r13
            if (r13 == 0) goto L86
            java.lang.String r1 = "com.nytimes.android.subauth.pruchase_override_store_purchase_poll_interval"
            s16$a r1 = defpackage.u16.f(r1)
            java.lang.Object r13 = r13.c(r1)
            java.lang.String r13 = (java.lang.String) r13
            if (r13 == 0) goto L86
            pl5 r13 = defpackage.ql5.a(r13)
            if (r13 == 0) goto L86
            java.lang.Long r13 = r13.a()
            goto L87
        L86:
            r13 = r4
        L87:
            if (r13 == 0) goto L8e
            long r1 = r13.longValue()
            goto L94
        L8e:
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager r13 = r12.this$0
            long r1 = com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager.w(r13)
        L94:
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager r13 = r12.this$0
            kotlinx.coroutines.Job r13 = com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager.x(r13)
            if (r13 == 0) goto La6
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Starting new store purchase polling job"
            r3.<init>(r5)
            r13.cancel(r3)
        La6:
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager r13 = r12.this$0
            com.nytimes.android.subauth.core.util.CoroutineDataStorePoller r3 = new com.nytimes.android.subauth.core.util.CoroutineDataStorePoller
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager r5 = r12.this$0
            ba1 r6 = r5.N()
            s16$a r7 = com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager.v()
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager r5 = r12.this$0
            kotlinx.coroutines.CoroutineDispatcher r9 = r5.P()
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$startPolling$1$1 r10 = new com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$startPolling$1$1
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager r5 = r12.this$0
            r10.<init>(r5, r4)
            r8 = 1
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager r12 = r12.this$0
            kotlinx.coroutines.flow.Flow r1 = r3.f(r1)
            kotlinx.coroutines.Job r0 = kotlinx.coroutines.flow.FlowKt.launchIn(r1, r0)
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager.H(r12, r0)
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager.I(r13, r3)
            ww8 r12 = defpackage.ww8.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$startPolling$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SubauthPurchaseManager$startPolling$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
