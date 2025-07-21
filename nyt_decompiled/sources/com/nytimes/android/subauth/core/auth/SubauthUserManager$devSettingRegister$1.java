package com.nytimes.android.subauth.core.auth;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.core.auth.SubauthUserManager", f = "SubauthUserManager.kt", l = {917}, m = "devSettingRegister")
/* loaded from: classes4.dex */
final class SubauthUserManager$devSettingRegister$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubauthUserManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserManager$devSettingRegister$1(SubauthUserManager subauthUserManager, by0 by0Var) {
        super(by0Var);
        this.this$0 = subauthUserManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.o(null, null, this);
    }
}
