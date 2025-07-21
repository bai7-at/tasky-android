package com.nytimes.android.subauth.devsettings.items;

import defpackage.by0;
import defpackage.fc1;
import defpackage.q98;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$6", f = "SubauthUserDevSettingFactory.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthUserDevSettingFactory$userDevSettings$6 extends SuspendLambda implements ss2 {
    final /* synthetic */ q98 $subauthUser;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserDevSettingFactory$userDevSettings$6(q98 q98Var, by0 by0Var) {
        super(1, by0Var);
        this.$subauthUser = q98Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new SubauthUserDevSettingFactory$userDevSettings$6(this.$subauthUser, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((SubauthUserDevSettingFactory$userDevSettings$6) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        String str = (String) this.$subauthUser.r().get("NYT-S");
        return str == null ? "" : str;
    }
}
