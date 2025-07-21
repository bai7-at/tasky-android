package com.nytimes.android.subauth.credentialmanager.providers.helpers;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleSignInHelper", f = "GoogleSignInHelper.kt", l = {42, 45}, m = "ssoLogin$subauth_google_credentialmanager_release")
/* loaded from: classes4.dex */
final class GoogleSignInHelper$ssoLogin$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GoogleSignInHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoogleSignInHelper$ssoLogin$1(GoogleSignInHelper googleSignInHelper, by0 by0Var) {
        super(by0Var);
        this.this$0 = googleSignInHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.e(null, null, 0, null, this);
    }
}
