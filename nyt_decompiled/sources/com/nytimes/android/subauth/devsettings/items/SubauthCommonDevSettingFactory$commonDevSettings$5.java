package com.nytimes.android.subauth.devsettings.items;

import android.content.Context;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.xz8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthCommonDevSettingFactory$commonDevSettings$5", f = "SubauthCommonDevSettingFactory.kt", l = {130}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthCommonDevSettingFactory$commonDevSettings$5 extends SuspendLambda implements gt2 {
    final /* synthetic */ xz8 $userDetailsProvider;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthCommonDevSettingFactory$commonDevSettings$5(xz8 xz8Var, by0 by0Var) {
        super(2, by0Var);
        this.$userDetailsProvider = xz8Var;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Context context, by0 by0Var) {
        return ((SubauthCommonDevSettingFactory$commonDevSettings$5) create(context, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SubauthCommonDevSettingFactory$commonDevSettings$5(this.$userDetailsProvider, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            xz8 xz8Var = this.$userDetailsProvider;
            this.label = 1;
            if (xz8Var.c(true, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }
}
