package com.nytimes.android.subauth.core.auth;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.core.auth.SubauthUserManager", f = "SubauthUserManager.kt", l = {768, 769, 776, 786, 792}, m = "handleSuccessfulLogin")
/* loaded from: classes4.dex */
final class SubauthUserManager$handleSuccessfulLogin$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubauthUserManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserManager$handleSuccessfulLogin$1(SubauthUserManager subauthUserManager, by0 by0Var) {
        super(by0Var);
        this.this$0 = subauthUserManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object i0;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        i0 = this.this$0.i0(null, null, this);
        return i0;
    }
}
