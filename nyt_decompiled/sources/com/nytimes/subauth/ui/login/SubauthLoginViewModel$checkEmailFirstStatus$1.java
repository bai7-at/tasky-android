package com.nytimes.subauth.ui.login;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.AdvertisementType;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.subauth.ui.login.SubauthLoginViewModel", f = "SubauthLoginViewModel.kt", l = {183, 194, 201, 205, AdvertisementType.ON_DEMAND_PRE_ROLL}, m = "checkEmailFirstStatus")
/* loaded from: classes4.dex */
final class SubauthLoginViewModel$checkEmailFirstStatus$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubauthLoginViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthLoginViewModel$checkEmailFirstStatus$1(SubauthLoginViewModel subauthLoginViewModel, by0 by0Var) {
        super(by0Var);
        this.this$0 = subauthLoginViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object M;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        M = this.this$0.M(null, this);
        return M;
    }
}
