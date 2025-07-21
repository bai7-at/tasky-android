package com.nytimes.android.subauth.credentialmanager.providers.wrappers;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.credentialmanager.providers.wrappers.GoogleSdkWrapper", f = "GoogleSdkWrapper.kt", l = {181}, m = "beginOneTapSignIn")
/* loaded from: classes4.dex */
final class GoogleSdkWrapper$beginOneTapSignIn$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GoogleSdkWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoogleSdkWrapper$beginOneTapSignIn$1(GoogleSdkWrapper googleSdkWrapper, by0 by0Var) {
        super(by0Var);
        this.this$0 = googleSdkWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.a(null, null, this);
    }
}
