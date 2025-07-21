package com.nytimes.android.subauth.devsettings.items;

import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.services.s3.internal.Constants;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory", f = "SubauthUserDevSettingFactory.kt", l = {411, Constants.FAILED_PRECONDITION_STATUS_CODE}, m = "registerTestUser")
/* loaded from: classes4.dex */
final class SubauthUserDevSettingFactory$registerTestUser$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubauthUserDevSettingFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserDevSettingFactory$registerTestUser$1(SubauthUserDevSettingFactory subauthUserDevSettingFactory, by0 by0Var) {
        super(by0Var);
        this.this$0 = subauthUserDevSettingFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object i;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        i = this.this$0.i(null, null, this);
        return i;
    }
}
