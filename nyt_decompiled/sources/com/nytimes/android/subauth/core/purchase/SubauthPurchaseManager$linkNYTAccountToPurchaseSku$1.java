package com.nytimes.android.subauth.core.purchase;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager", f = "SubauthPurchaseManager.kt", l = {407, 409, 413, 423, 435, 442}, m = "linkNYTAccountToPurchaseSku")
/* loaded from: classes4.dex */
final class SubauthPurchaseManager$linkNYTAccountToPurchaseSku$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubauthPurchaseManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthPurchaseManager$linkNYTAccountToPurchaseSku$1(SubauthPurchaseManager subauthPurchaseManager, by0 by0Var) {
        super(by0Var);
        this.this$0 = subauthPurchaseManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object Z;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        Z = this.this$0.Z(null, null, this);
        return Z;
    }
}
