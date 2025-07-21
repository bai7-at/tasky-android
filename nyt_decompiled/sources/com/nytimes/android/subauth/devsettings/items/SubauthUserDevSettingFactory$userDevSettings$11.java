package com.nytimes.android.subauth.devsettings.items;

import com.nytimes.android.subauth.core.api.client.NYTUser;
import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$11", f = "SubauthUserDevSettingFactory.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthUserDevSettingFactory$userDevSettings$11 extends SuspendLambda implements ss2 {
    final /* synthetic */ NYTUser $user;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserDevSettingFactory$userDevSettings$11(NYTUser nYTUser, by0 by0Var) {
        super(1, by0Var);
        this.$user = nYTUser;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new SubauthUserDevSettingFactory$userDevSettings$11(this.$user, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((SubauthUserDevSettingFactory$userDevSettings$11) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        String p = this.$user.p();
        return p == null ? "" : p;
    }
}
