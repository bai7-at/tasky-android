package com.nytimes.android.subauth.core.purchase;

import androidx.datastore.preferences.core.MutablePreferences;
import com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager;
import defpackage.by0;
import defpackage.cc0;
import defpackage.d54;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.s16;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager$saveLastLinkStatus$2", f = "SubauthPurchaseManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthPurchaseManager$saveLastLinkStatus$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ d54 $linkNYTAccountToPurchaseStatus;
    final /* synthetic */ String $skuToLink;
    final /* synthetic */ String $subscriptionId;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthPurchaseManager$saveLastLinkStatus$2(String str, d54 d54Var, String str2, by0 by0Var) {
        super(2, by0Var);
        this.$skuToLink = str;
        this.$linkNYTAccountToPurchaseStatus = d54Var;
        this.$subscriptionId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        SubauthPurchaseManager$saveLastLinkStatus$2 subauthPurchaseManager$saveLastLinkStatus$2 = new SubauthPurchaseManager$saveLastLinkStatus$2(this.$skuToLink, this.$linkNYTAccountToPurchaseStatus, this.$subscriptionId, by0Var);
        subauthPurchaseManager$saveLastLinkStatus$2.L$0 = obj;
        return subauthPurchaseManager$saveLastLinkStatus$2;
    }

    @Override // defpackage.gt2
    public final Object invoke(MutablePreferences mutablePreferences, by0 by0Var) {
        return ((SubauthPurchaseManager$saveLastLinkStatus$2) create(mutablePreferences, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String b;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
        SubauthPurchaseManager.a aVar = SubauthPurchaseManager.Companion;
        s16.a b2 = aVar.b();
        String str = this.$skuToLink;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        mutablePreferences.j(b2, str);
        mutablePreferences.j(aVar.c(), cc0.c(this.$linkNYTAccountToPurchaseStatus.a()));
        s16.a d = aVar.d();
        String str3 = this.$subscriptionId;
        if (str3 == null) {
            str3 = "";
        }
        mutablePreferences.j(d, str3);
        s16.a a = aVar.a();
        d54 d54Var = this.$linkNYTAccountToPurchaseStatus;
        d54.c cVar = d54Var instanceof d54.c ? (d54.c) d54Var : null;
        if (cVar != null && (b = cVar.b()) != null) {
            str2 = b;
        }
        mutablePreferences.j(a, str2);
        return ww8.a;
    }
}
