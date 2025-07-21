package com.nytimes.android.messaging.postloginregioffers.view;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.messaging.postloginregioffers.view.PostRegiLoginOfferViewModel$getUserInfo$1", f = "PostRegiLoginOfferViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PostRegiLoginOfferViewModel$getUserInfo$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ PostRegiLoginOfferViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostRegiLoginOfferViewModel$getUserInfo$1(PostRegiLoginOfferViewModel postRegiLoginOfferViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = postRegiLoginOfferViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PostRegiLoginOfferViewModel$getUserInfo$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        mutableStateFlow = this.this$0.g;
        String L = this.this$0.q().L();
        if (L == null) {
            L = "<not logged in>";
        }
        mutableStateFlow.setValue(L);
        mutableStateFlow2 = this.this$0.i;
        String D = this.this$0.q().D();
        if (D == null) {
            D = "";
        }
        mutableStateFlow2.setValue(D);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((PostRegiLoginOfferViewModel$getUserInfo$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
