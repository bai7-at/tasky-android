package com.nytimes.android.entitlements.debugging;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.entitlements.debugging.SubauthShowNewsUserStatePreference", f = "SubauthShowNewsUserStatePreference.kt", l = {90, 91}, m = "parsePurchase")
/* loaded from: classes4.dex */
final class SubauthShowNewsUserStatePreference$parsePurchase$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubauthShowNewsUserStatePreference this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthShowNewsUserStatePreference$parsePurchase$1(SubauthShowNewsUserStatePreference subauthShowNewsUserStatePreference, by0 by0Var) {
        super(by0Var);
        this.this$0 = subauthShowNewsUserStatePreference;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object R0;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        R0 = this.this$0.R0(this);
        return R0;
    }
}
