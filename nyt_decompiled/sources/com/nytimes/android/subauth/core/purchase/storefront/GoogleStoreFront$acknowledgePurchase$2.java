package com.nytimes.android.subauth.core.purchase.storefront;

import com.android.billingclient.api.d;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.s3;
import defpackage.t3;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront$acknowledgePurchase$2", f = "GoogleStoreFront.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GoogleStoreFront$acknowledgePurchase$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $token;
    int label;
    final /* synthetic */ GoogleStoreFront this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoogleStoreFront$acknowledgePurchase$2(String str, GoogleStoreFront googleStoreFront, by0 by0Var) {
        super(2, by0Var);
        this.$token = str;
        this.this$0 = googleStoreFront;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(d dVar) {
        ul8.a.z("SUBAUTH").a("Purchase acknowledgement result is: %s with message %s", Integer.valueOf(dVar.b()), dVar.a());
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new GoogleStoreFront$acknowledgePurchase$2(this.$token, this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.android.billingclient.api.a m;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        s3.a b = s3.b().b(this.$token);
        zq3.g(b, "setPurchaseToken(...)");
        m = this.this$0.m();
        m.a(b.a(), new t3() { // from class: com.nytimes.android.subauth.core.purchase.storefront.a
            @Override // defpackage.t3
            public final void a(d dVar) {
                GoogleStoreFront$acknowledgePurchase$2.c(dVar);
            }
        });
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((GoogleStoreFront$acknowledgePurchase$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
