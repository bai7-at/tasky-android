package com.nytimes.android.subauth.core.purchase;

import com.nytimes.android.subauth.core.api.listeners.PurchaseLinkSource;
import defpackage.by0;
import defpackage.d54;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

@fc1(c = "com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$linkNYTAccountToPurchase$2", f = "SubauthPurchaseManager.kt", l = {387, 389, 398}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthPurchaseManager$linkNYTAccountToPurchase$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ PurchaseLinkSource $linkSource;
    final /* synthetic */ MutableSharedFlow<d54> $resultFlow;
    final /* synthetic */ String $sku;
    int label;
    final /* synthetic */ SubauthPurchaseManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthPurchaseManager$linkNYTAccountToPurchase$2(String str, SubauthPurchaseManager subauthPurchaseManager, PurchaseLinkSource purchaseLinkSource, MutableSharedFlow mutableSharedFlow, by0 by0Var) {
        super(2, by0Var);
        this.$sku = str;
        this.this$0 = subauthPurchaseManager;
        this.$linkSource = purchaseLinkSource;
        this.$resultFlow = mutableSharedFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SubauthPurchaseManager$linkNYTAccountToPurchase$2(this.$sku, this.this$0, this.$linkSource, this.$resultFlow, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r11.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L26
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            kotlin.f.b(r12)
            goto L83
        L16:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L1e:
            kotlin.f.b(r12)
            goto L61
        L22:
            kotlin.f.b(r12)
            goto L40
        L26:
            kotlin.f.b(r12)
            java.lang.String r12 = r11.$sku
            if (r12 != 0) goto L52
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager r12 = r11.this$0
            ba1 r12 = r12.N()
            kotlinx.coroutines.flow.Flow r12 = r12.getData()
            r11.label = r4
            java.lang.Object r12 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r12, r11)
            if (r12 != r0) goto L40
            return r0
        L40:
            s16 r12 = (defpackage.s16) r12
            if (r12 == 0) goto L51
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$a r1 = com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager.Companion
            s16$a r1 = r1.b()
            java.lang.Object r12 = r12.c(r1)
            java.lang.String r12 = (java.lang.String) r12
            goto L52
        L51:
            r12 = 0
        L52:
            if (r12 == 0) goto L64
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager r1 = r11.this$0
            com.nytimes.android.subauth.core.api.listeners.PurchaseLinkSource r4 = r11.$linkSource
            r11.label = r3
            java.lang.Object r12 = com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager.D(r1, r12, r4, r11)
            if (r12 != r0) goto L61
            return r0
        L61:
            d54 r12 = (defpackage.d54) r12
            goto L78
        L64:
            com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager r12 = r11.this$0
            com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager r3 = r12.Q()
            d54$g r12 = d54.g.b
            com.nytimes.android.subauth.core.api.listeners.PurchaseLinkSource r8 = r11.$linkSource
            r9 = 3
            r10 = 0
            r4 = 0
            r5 = 0
            java.lang.String r6 = "No Saved Purchase to Link to"
            r7 = r12
            d98.a.a(r3, r4, r5, r6, r7, r8, r9, r10)
        L78:
            kotlinx.coroutines.flow.MutableSharedFlow<d54> r1 = r11.$resultFlow
            r11.label = r2
            java.lang.Object r11 = r1.emit(r12, r11)
            if (r11 != r0) goto L83
            return r0
        L83:
            ww8 r11 = defpackage.ww8.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$linkNYTAccountToPurchase$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SubauthPurchaseManager$linkNYTAccountToPurchase$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
