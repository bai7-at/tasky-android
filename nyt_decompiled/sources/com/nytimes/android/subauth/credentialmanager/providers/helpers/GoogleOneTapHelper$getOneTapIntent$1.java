package com.nytimes.android.subauth.credentialmanager.providers.helpers;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleOneTapHelper", f = "GoogleOneTapHelper.kt", l = {105, 106}, m = "getOneTapIntent")
/* loaded from: classes4.dex */
final class GoogleOneTapHelper$getOneTapIntent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GoogleOneTapHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoogleOneTapHelper$getOneTapIntent$1(GoogleOneTapHelper googleOneTapHelper, by0 by0Var) {
        super(by0Var);
        this.this$0 = googleOneTapHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        d = this.this$0.d(null, null, this);
        return d;
    }
}
