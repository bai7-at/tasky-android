package com.nytimes.android.messaging.postloginregioffers;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.messaging.postloginregioffers.PostLoginRegiOfferManager", f = "PostLoginRegiOfferManager.kt", l = {35}, m = "showPostLoginOrPostRegiOffer")
/* loaded from: classes4.dex */
final class PostLoginRegiOfferManager$showPostLoginOrPostRegiOffer$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PostLoginRegiOfferManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostLoginRegiOfferManager$showPostLoginOrPostRegiOffer$1(PostLoginRegiOfferManager postLoginRegiOfferManager, by0 by0Var) {
        super(by0Var);
        this.this$0 = postLoginRegiOfferManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.c(null, null, this);
    }
}
