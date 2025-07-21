package com.nytimes.android.subauth.credentialmanager.providers.helpers;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleSmartLockHelper", f = "GoogleSmartLockHelper.kt", l = {86, 100}, m = "saveCredential$subauth_google_credentialmanager_release")
/* loaded from: classes4.dex */
final class GoogleSmartLockHelper$saveCredential$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GoogleSmartLockHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoogleSmartLockHelper$saveCredential$1(GoogleSmartLockHelper googleSmartLockHelper, by0 by0Var) {
        super(by0Var);
        this.this$0 = googleSmartLockHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.e(null, 0, null, null, this);
    }
}
