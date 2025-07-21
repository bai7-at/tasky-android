package com.nytimes.subauth.ui.login;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.AdvertisementType;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.subauth.ui.login.SubauthLoginViewModel", f = "SubauthLoginViewModel.kt", l = {AdvertisementType.BRANDED_ON_DEMAND_MID_ROLL, 238, 250, 257, 262}, m = "handleEmailStatus")
/* loaded from: classes4.dex */
final class SubauthLoginViewModel$handleEmailStatus$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubauthLoginViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthLoginViewModel$handleEmailStatus$1(SubauthLoginViewModel subauthLoginViewModel, by0 by0Var) {
        super(by0Var);
        this.this$0 = subauthLoginViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e0;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        e0 = this.this$0.e0(null, null, false, this);
        return e0;
    }
}
