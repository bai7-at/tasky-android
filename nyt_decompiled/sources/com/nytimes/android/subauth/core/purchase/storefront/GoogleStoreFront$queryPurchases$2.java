package com.nytimes.android.subauth.core.purchase.storefront;

import com.android.billingclient.api.d;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.hc1;
import defpackage.lb6;
import defpackage.n86;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.zq3;
import java.util.List;
import kotlin.Result;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront$queryPurchases$2", f = "GoogleStoreFront.kt", l = {559}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GoogleStoreFront$queryPurchases$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $type;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ GoogleStoreFront this$0;

    static final class a implements n86 {
        final /* synthetic */ CancellableContinuation a;

        a(CancellableContinuation cancellableContinuation) {
            this.a = cancellableContinuation;
        }

        @Override // defpackage.n86
        public final void a(d dVar, List list) {
            zq3.h(dVar, "result");
            zq3.h(list, "purchases");
            if (this.a.isActive()) {
                if (dVar.b() == 0) {
                    this.a.resumeWith(Result.b(list));
                    return;
                }
                ul8.a.z("SUBAUTH").a("queryPurchases failure " + dVar.b(), new Object[0]);
                CancellableContinuation cancellableContinuation = this.a;
                Result.a aVar = Result.a;
                cancellableContinuation.resumeWith(Result.b(i.l()));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoogleStoreFront$queryPurchases$2(String str, GoogleStoreFront googleStoreFront, by0 by0Var) {
        super(2, by0Var);
        this.$type = str;
        this.this$0 = googleStoreFront;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new GoogleStoreFront$queryPurchases$2(this.$type, this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.android.billingclient.api.a m;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            String str = this.$type;
            GoogleStoreFront googleStoreFront = this.this$0;
            this.L$0 = str;
            this.L$1 = googleStoreFront;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(this), 1);
            cancellableContinuationImpl.initCancellability();
            lb6 a2 = lb6.a().b(str).a();
            zq3.g(a2, "build(...)");
            m = googleStoreFront.m();
            m.g(a2, new a(cancellableContinuationImpl));
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
        return obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((GoogleStoreFront$queryPurchases$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
