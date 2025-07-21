package com.nytimes.android.features.you.youtab;

import android.content.Context;
import com.nytimes.android.utils.AppPreferences;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.features.you.youtab.FeaturesYouTabModule$provideDevSettingItem$1", f = "FeaturesYouTabModule.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FeaturesYouTabModule$provideDevSettingItem$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ AppPreferences $appPreferences;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeaturesYouTabModule$provideDevSettingItem$1(AppPreferences appPreferences, by0 by0Var) {
        super(2, by0Var);
        this.$appPreferences = appPreferences;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Context context, by0 by0Var) {
        return ((FeaturesYouTabModule$provideDevSettingItem$1) create(context, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new FeaturesYouTabModule$provideDevSettingItem$1(this.$appPreferences, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.$appPreferences.f("interestsOnboarding", true);
        return ww8.a;
    }
}
