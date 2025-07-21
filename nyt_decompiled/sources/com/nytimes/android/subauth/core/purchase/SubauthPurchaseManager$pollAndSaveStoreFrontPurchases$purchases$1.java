package com.nytimes.android.subauth.core.purchase;

import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$pollAndSaveStoreFrontPurchases$purchases$1", f = "SubauthPurchaseManager.kt", l = {861}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthPurchaseManager$pollAndSaveStoreFrontPurchases$purchases$1 extends SuspendLambda implements ss2 {
    int label;
    final /* synthetic */ SubauthPurchaseManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthPurchaseManager$pollAndSaveStoreFrontPurchases$purchases$1(SubauthPurchaseManager subauthPurchaseManager, by0 by0Var) {
        super(1, by0Var);
        this.this$0 = subauthPurchaseManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new SubauthPurchaseManager$pollAndSaveStoreFrontPurchases$purchases$1(this.this$0, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((SubauthPurchaseManager$pollAndSaveStoreFrontPurchases$purchases$1) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            SubauthPurchaseManager subauthPurchaseManager = this.this$0;
            this.label = 1;
            obj = subauthPurchaseManager.g(this);
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
}
