package com.nytimes.android.subauth.core.purchase;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager", f = "SubauthPurchaseManager.kt", l = {237, 246}, m = "processPurchaseStatus")
/* loaded from: classes4.dex */
final class SubauthPurchaseManager$processPurchaseStatus$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubauthPurchaseManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthPurchaseManager$processPurchaseStatus$1(SubauthPurchaseManager subauthPurchaseManager, by0 by0Var) {
        super(by0Var);
        this.this$0 = subauthPurchaseManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c0;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        c0 = this.this$0.c0(null, null, null, null, this);
        return c0;
    }
}
