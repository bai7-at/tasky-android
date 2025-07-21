package com.nytimes.android.subauth.core.auth;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.core.auth.SubauthUserManager", f = "SubauthUserManager.kt", l = {417, 429}, m = "linkWithSSO")
/* loaded from: classes4.dex */
final class SubauthUserManager$linkWithSSO$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubauthUserManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserManager$linkWithSSO$1(SubauthUserManager subauthUserManager, by0 by0Var) {
        super(by0Var);
        this.this$0 = subauthUserManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object k0;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        k0 = this.this$0.k0(null, null, null, null, null, this);
        return k0;
    }
}
