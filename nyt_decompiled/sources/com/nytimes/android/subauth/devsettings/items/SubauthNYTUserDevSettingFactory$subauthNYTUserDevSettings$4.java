package com.nytimes.android.subauth.devsettings.items;

import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscriptionEntitlement;
import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.collections.i;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthNYTUserDevSettingFactory$subauthNYTUserDevSettings$4", f = "SubauthNYTUserDevSettingFactory.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthNYTUserDevSettingFactory$subauthNYTUserDevSettings$4 extends SuspendLambda implements ss2 {
    final /* synthetic */ NYTUser $user;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthNYTUserDevSettingFactory$subauthNYTUserDevSettings$4(NYTUser nYTUser, by0 by0Var) {
        super(1, by0Var);
        this.$user = nYTUser;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new SubauthNYTUserDevSettingFactory$subauthNYTUserDevSettings$4(this.$user, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((SubauthNYTUserDevSettingFactory$subauthNYTUserDevSettings$4) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        return i.u0(this.$user.t().getActiveEntitlements(), ",", null, null, 0, null, new ss2() { // from class: com.nytimes.android.subauth.devsettings.items.SubauthNYTUserDevSettingFactory$subauthNYTUserDevSettings$4.1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(UserSubscriptionEntitlement userSubscriptionEntitlement) {
                zq3.h(userSubscriptionEntitlement, "it");
                return userSubscriptionEntitlement.getRawValue();
            }
        }, 30, null);
    }
}
