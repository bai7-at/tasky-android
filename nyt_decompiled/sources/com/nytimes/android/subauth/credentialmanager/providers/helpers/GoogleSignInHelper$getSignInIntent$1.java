package com.nytimes.android.subauth.credentialmanager.providers.helpers;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleSignInHelper", f = "GoogleSignInHelper.kt", l = {65}, m = "getSignInIntent")
/* loaded from: classes4.dex */
final class GoogleSignInHelper$getSignInIntent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GoogleSignInHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoogleSignInHelper$getSignInIntent$1(GoogleSignInHelper googleSignInHelper, by0 by0Var) {
        super(by0Var);
        this.this$0 = googleSignInHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        c = this.this$0.c(null, null, null, this);
        return c;
    }
}
