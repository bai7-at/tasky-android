package com.nytimes.android.subauth.core.purchase;

import android.app.Activity;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.y28;
import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

@fc1(c = "com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$purchaseProduct$4", f = "SubauthPurchaseManager.kt", l = {198, 202, 201, 217, 219}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthPurchaseManager$purchaseProduct$4 extends SuspendLambda implements gt2 {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ String $campaignCode;
    final /* synthetic */ Set<String> $defaultPurchaseEntitlements;
    final /* synthetic */ ss2 $offerIdProvider;
    final /* synthetic */ String $productId;
    final /* synthetic */ int $productType;
    final /* synthetic */ MutableSharedFlow<y28> $resultFlow;
    Object L$0;
    int label;
    final /* synthetic */ SubauthPurchaseManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthPurchaseManager$purchaseProduct$4(SubauthPurchaseManager subauthPurchaseManager, String str, int i, ss2 ss2Var, Activity activity, String str2, Set set, MutableSharedFlow mutableSharedFlow, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = subauthPurchaseManager;
        this.$productId = str;
        this.$productType = i;
        this.$offerIdProvider = ss2Var;
        this.$activity = activity;
        this.$campaignCode = str2;
        this.$defaultPurchaseEntitlements = set;
        this.$resultFlow = mutableSharedFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SubauthPurchaseManager$purchaseProduct$4(this.this$0, this.$productId, this.$productType, this.$offerIdProvider, this.$activity, this.$campaignCode, this.$defaultPurchaseEntitlements, this.$resultFlow, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$purchaseProduct$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SubauthPurchaseManager$purchaseProduct$4) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
