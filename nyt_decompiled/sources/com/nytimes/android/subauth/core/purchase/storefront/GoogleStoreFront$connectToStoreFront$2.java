package com.nytimes.android.subauth.core.purchase.storefront;

import com.android.billingclient.api.d;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.h80;
import defpackage.hc1;
import defpackage.p28;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront$connectToStoreFront$2", f = "GoogleStoreFront.kt", l = {559}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GoogleStoreFront$connectToStoreFront$2 extends SuspendLambda implements gt2 {
    Object L$0;
    int label;
    final /* synthetic */ GoogleStoreFront this$0;

    public static final class a implements h80 {
        final /* synthetic */ CancellableContinuation a;

        a(CancellableContinuation cancellableContinuation) {
            this.a = cancellableContinuation;
        }

        @Override // defpackage.h80
        public void a(d dVar) {
            zq3.h(dVar, "result");
            if (this.a.isActive()) {
                ul8.a.z("SUBAUTH").a("GoogleServiceProvider setup finished with result %s: %s", Integer.valueOf(dVar.b()), dVar.a());
                if (dVar.b() == 0) {
                    CancellableContinuation cancellableContinuation = this.a;
                    Result.a aVar = Result.a;
                    cancellableContinuation.resumeWith(Result.b(p28.b.a));
                } else {
                    CancellableContinuation cancellableContinuation2 = this.a;
                    Result.a aVar2 = Result.a;
                    cancellableContinuation2.resumeWith(Result.b(new p28.c("Google BillingClient not ready")));
                }
            }
        }

        @Override // defpackage.h80
        public void b() {
            if (this.a.isActive()) {
                ul8.a.z("SUBAUTH").a("Google BillingClient disconnected", new Object[0]);
                CancellableContinuation cancellableContinuation = this.a;
                Result.a aVar = Result.a;
                cancellableContinuation.resumeWith(Result.b(new p28.c("Google BillingClient not ready")));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoogleStoreFront$connectToStoreFront$2(GoogleStoreFront googleStoreFront, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = googleStoreFront;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new GoogleStoreFront$connectToStoreFront$2(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.android.billingclient.api.a m;
        com.android.billingclient.api.a m2;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            m = this.this$0.m();
            if (m.c()) {
                return p28.b.a;
            }
            GoogleStoreFront googleStoreFront = this.this$0;
            this.L$0 = googleStoreFront;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(this), 1);
            cancellableContinuationImpl.initCancellability();
            m2 = googleStoreFront.m();
            m2.i(new a(cancellableContinuationImpl));
            obj = cancellableContinuationImpl.getResult();
            if (obj == kotlin.coroutines.intrinsics.a.h()) {
                hc1.c(this);
            }
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return (p28) obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((GoogleStoreFront$connectToStoreFront$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
