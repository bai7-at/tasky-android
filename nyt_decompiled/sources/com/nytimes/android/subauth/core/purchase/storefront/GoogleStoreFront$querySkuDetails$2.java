package com.nytimes.android.subauth.core.purchase.storefront;

import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.d;
import com.android.billingclient.api.g;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.hc1;
import defpackage.ku7;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront$querySkuDetails$2", f = "GoogleStoreFront.kt", l = {559}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GoogleStoreFront$querySkuDetails$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ Set<String> $skus;
    final /* synthetic */ int $type;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ GoogleStoreFront this$0;

    static final class a implements ku7 {
        final /* synthetic */ CancellableContinuation a;
        final /* synthetic */ GoogleStoreFront b;

        a(CancellableContinuation cancellableContinuation, GoogleStoreFront googleStoreFront) {
            this.a = cancellableContinuation;
            this.b = googleStoreFront;
        }

        @Override // defpackage.ku7
        public final void a(d dVar, List list) {
            Map map;
            zq3.h(dVar, "result");
            if (this.a.isActive()) {
                ul8.a.z("SUBAUTH").l("onSkuDetailsResponse: " + dVar.b() + " " + dVar.a(), new Object[0]);
                if (list != null) {
                    GoogleStoreFront googleStoreFront = this.b;
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        SkuDetails skuDetails = (SkuDetails) it2.next();
                        map = googleStoreFront.f;
                        String j = skuDetails.j();
                        zq3.g(j, "getSku(...)");
                        zq3.e(skuDetails);
                        map.put(j, skuDetails);
                    }
                }
                CancellableContinuation cancellableContinuation = this.a;
                Result.a aVar = Result.a;
                if (list == null) {
                    list = i.l();
                }
                cancellableContinuation.resumeWith(Result.b(list));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoogleStoreFront$querySkuDetails$2(int i, Set set, GoogleStoreFront googleStoreFront, by0 by0Var) {
        super(2, by0Var);
        this.$type = i;
        this.$skus = set;
        this.this$0 = googleStoreFront;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new GoogleStoreFront$querySkuDetails$2(this.$type, this.$skus, this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.android.billingclient.api.a m;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            int i2 = this.$type;
            Set<String> set = this.$skus;
            GoogleStoreFront googleStoreFront = this.this$0;
            this.L$0 = set;
            this.L$1 = googleStoreFront;
            this.I$0 = i2;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(this), 1);
            cancellableContinuationImpl.initCancellability();
            g a2 = g.c().c(i2 == 1 ? "subs" : "inapp").b(i.X0(set)).a();
            zq3.g(a2, "build(...)");
            m = googleStoreFront.m();
            m.h(a2, new a(cancellableContinuationImpl, googleStoreFront));
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
        return ((GoogleStoreFront$querySkuDetails$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
