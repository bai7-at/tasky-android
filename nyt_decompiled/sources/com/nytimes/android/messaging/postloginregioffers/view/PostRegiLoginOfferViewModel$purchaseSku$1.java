package com.nytimes.android.messaging.postloginregioffers.view;

import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.messaging.postloginregioffers.view.PostRegiLoginOfferViewModel;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.jk;
import defpackage.ww8;
import defpackage.y28;
import defpackage.z58;
import defpackage.z88;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.messaging.postloginregioffers.view.PostRegiLoginOfferViewModel$purchaseSku$1", f = "PostRegiLoginOfferViewModel.kt", l = {79}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PostRegiLoginOfferViewModel$purchaseSku$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ jk $activity;
    final /* synthetic */ String $analyticsRegion;
    final /* synthetic */ boolean $isPostRegiOffer;
    final /* synthetic */ String $sku;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ PostRegiLoginOfferViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostRegiLoginOfferViewModel$purchaseSku$1(String str, PostRegiLoginOfferViewModel postRegiLoginOfferViewModel, jk jkVar, String str2, boolean z, by0 by0Var) {
        super(2, by0Var);
        this.$sku = str;
        this.this$0 = postRegiLoginOfferViewModel;
        this.$activity = jkVar;
        this.$analyticsRegion = str2;
        this.$isPostRegiOffer = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PostRegiLoginOfferViewModel$purchaseSku$1(this.$sku, this.this$0, this.$activity, this.$analyticsRegion, this.$isPostRegiOffer, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        String str;
        boolean z;
        PostRegiLoginOfferViewModel postRegiLoginOfferViewModel;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        MutableStateFlow mutableStateFlow4;
        MutableStateFlow mutableStateFlow5;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            String str2 = this.$sku;
            if (str2 != null) {
                PostRegiLoginOfferViewModel postRegiLoginOfferViewModel2 = this.this$0;
                jk jkVar = this.$activity;
                String str3 = this.$analyticsRegion;
                boolean z2 = this.$isPostRegiOffer;
                mutableStateFlow = postRegiLoginOfferViewModel2.m;
                mutableStateFlow.setValue(cc0.a(true));
                z58 q = postRegiLoginOfferViewModel2.q();
                this.L$0 = postRegiLoginOfferViewModel2;
                this.L$1 = str2;
                this.Z$0 = z2;
                this.label = 1;
                Object a = z88.b.a(q, jkVar, str2, null, null, str3, this, 12, null);
                if (a == h) {
                    return h;
                }
                str = str2;
                z = z2;
                obj = a;
                postRegiLoginOfferViewModel = postRegiLoginOfferViewModel2;
            }
            return ww8.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z = this.Z$0;
        str = (String) this.L$1;
        postRegiLoginOfferViewModel = (PostRegiLoginOfferViewModel) this.L$0;
        f.b(obj);
        y28 y28Var = (y28) obj;
        if (y28Var instanceof y28.b) {
            postRegiLoginOfferViewModel.v(PostRegiLoginOfferViewModel.a.c.a);
        } else if (y28Var instanceof y28.a.b) {
            mutableStateFlow5 = postRegiLoginOfferViewModel.m;
            mutableStateFlow5.setValue(cc0.a(false));
            NYTLogger.d("Post Login Regi Offer Purchase Sku " + str + " Succeeded!", new Object[0]);
            if (z) {
                postRegiLoginOfferViewModel.v(PostRegiLoginOfferViewModel.a.C0364a.a);
            }
        } else if (y28Var instanceof y28.a.f) {
            NYTLogger.d("Post Login Regi Offer Purchase  Sku " + str + " Purchase Cancelled.", new Object[0]);
            mutableStateFlow4 = postRegiLoginOfferViewModel.m;
            mutableStateFlow4.setValue(cc0.a(false));
            postRegiLoginOfferViewModel.v(PostRegiLoginOfferViewModel.a.d.a);
        } else if (y28Var instanceof y28.a.g) {
            NYTLogger.g("Post Login Regi Offer Purchase  Sku " + str + " Purchase Failed: " + y28Var, new Object[0]);
            mutableStateFlow3 = postRegiLoginOfferViewModel.m;
            mutableStateFlow3.setValue(cc0.a(false));
            postRegiLoginOfferViewModel.v(PostRegiLoginOfferViewModel.a.b.a);
        } else if (y28Var instanceof y28.a) {
            NYTLogger.g("Post Login Regi Offer Purchase  Sku " + str + " Purchase Failed: " + y28Var, new Object[0]);
            mutableStateFlow2 = postRegiLoginOfferViewModel.m;
            mutableStateFlow2.setValue(cc0.a(false));
            postRegiLoginOfferViewModel.v(PostRegiLoginOfferViewModel.a.b.a);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((PostRegiLoginOfferViewModel$purchaseSku$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
