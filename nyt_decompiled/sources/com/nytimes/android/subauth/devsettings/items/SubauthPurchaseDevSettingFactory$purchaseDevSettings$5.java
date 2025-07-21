package com.nytimes.android.subauth.devsettings.items;

import android.content.Context;
import defpackage.b98;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthPurchaseDevSettingFactory$purchaseDevSettings$5", f = "SubauthPurchaseDevSettingFactory.kt", l = {206}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthPurchaseDevSettingFactory$purchaseDevSettings$5 extends SuspendLambda implements gt2 {
    final /* synthetic */ b98 $subauthPurchase;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthPurchaseDevSettingFactory$purchaseDevSettings$5(b98 b98Var, by0 by0Var) {
        super(2, by0Var);
        this.$subauthPurchase = b98Var;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Context context, by0 by0Var) {
        return ((SubauthPurchaseDevSettingFactory$purchaseDevSettings$5) create(context, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SubauthPurchaseDevSettingFactory$purchaseDevSettings$5(this.$subauthPurchase, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            b98 b98Var = this.$subauthPurchase;
            this.label = 1;
            if (b98Var.b(this) == h) {
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
