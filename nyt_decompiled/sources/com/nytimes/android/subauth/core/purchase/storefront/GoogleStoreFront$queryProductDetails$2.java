package com.nytimes.android.subauth.core.purchase.storefront;

import com.android.billingclient.api.d;
import com.android.billingclient.api.e;
import com.android.billingclient.api.f;
import defpackage.by0;
import defpackage.e46;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.hc1;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.zq3;
import java.util.ArrayList;
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

@fc1(c = "com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront$queryProductDetails$2", f = "GoogleStoreFront.kt", l = {559}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GoogleStoreFront$queryProductDetails$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ Set<String> $productIds;
    final /* synthetic */ int $type;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ GoogleStoreFront this$0;

    static final class a implements e46 {
        final /* synthetic */ CancellableContinuation a;
        final /* synthetic */ GoogleStoreFront b;

        a(CancellableContinuation cancellableContinuation, GoogleStoreFront googleStoreFront) {
            this.a = cancellableContinuation;
            this.b = googleStoreFront;
        }

        @Override // defpackage.e46
        public final void a(d dVar, List list) {
            Map map;
            zq3.h(dVar, "result");
            zq3.h(list, "details");
            if (this.a.isActive()) {
                ul8.a.z("SUBAUTH").l("onProductDetailsResponse: " + dVar.b() + " " + dVar.a(), new Object[0]);
                GoogleStoreFront googleStoreFront = this.b;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    e eVar = (e) it2.next();
                    map = googleStoreFront.g;
                    String d = eVar.d();
                    zq3.g(d, "getProductId(...)");
                    zq3.e(eVar);
                    map.put(d, eVar);
                }
                this.a.resumeWith(Result.b(list));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoogleStoreFront$queryProductDetails$2(int i, Set set, GoogleStoreFront googleStoreFront, by0 by0Var) {
        super(2, by0Var);
        this.$type = i;
        this.$productIds = set;
        this.this$0 = googleStoreFront;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new GoogleStoreFront$queryProductDetails$2(this.$type, this.$productIds, this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.android.billingclient.api.a m;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            int i2 = this.$type;
            Set<String> set = this.$productIds;
            GoogleStoreFront googleStoreFront = this.this$0;
            this.L$0 = set;
            this.L$1 = googleStoreFront;
            this.I$0 = i2;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(this), 1);
            cancellableContinuationImpl.initCancellability();
            String str = i2 == 1 ? "subs" : "inapp";
            Set<String> set2 = set;
            ArrayList arrayList = new ArrayList(i.w(set2, 10));
            for (String str2 : set2) {
                f.b.a a2 = f.b.a();
                if (str2 == null) {
                    str2 = "";
                }
                arrayList.add(a2.b(str2).c(str).a());
            }
            com.android.billingclient.api.f a3 = com.android.billingclient.api.f.a().b(arrayList).a();
            zq3.g(a3, "build(...)");
            m = googleStoreFront.m();
            m.f(a3, new a(cancellableContinuationImpl, googleStoreFront));
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
            kotlin.f.b(obj);
        }
        return obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((GoogleStoreFront$queryProductDetails$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
