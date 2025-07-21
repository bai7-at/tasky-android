package com.nytimes.android.subauth.devsettings.items;

import android.content.Context;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.q98;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$10", f = "SubauthUserDevSettingFactory.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthUserDevSettingFactory$userDevSettings$10 extends SuspendLambda implements gt2 {
    final /* synthetic */ q98 $subauthUser;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserDevSettingFactory$userDevSettings$10(q98 q98Var, by0 by0Var) {
        super(2, by0Var);
        this.$subauthUser = q98Var;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Context context, by0 by0Var) {
        return ((SubauthUserDevSettingFactory$userDevSettings$10) create(context, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SubauthUserDevSettingFactory$userDevSettings$10(this.$subauthUser, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.$subauthUser.x();
        return ww8.a;
    }
}
