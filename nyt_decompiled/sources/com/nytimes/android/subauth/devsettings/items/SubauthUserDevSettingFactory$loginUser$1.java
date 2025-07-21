package com.nytimes.android.subauth.devsettings.items;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory", f = "SubauthUserDevSettingFactory.kt", l = {427, 439}, m = "loginUser")
/* loaded from: classes4.dex */
final class SubauthUserDevSettingFactory$loginUser$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubauthUserDevSettingFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserDevSettingFactory$loginUser$1(SubauthUserDevSettingFactory subauthUserDevSettingFactory, by0 by0Var) {
        super(by0Var);
        this.this$0 = subauthUserDevSettingFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        f = this.this$0.f(false, null, null, this);
        return f;
    }
}
