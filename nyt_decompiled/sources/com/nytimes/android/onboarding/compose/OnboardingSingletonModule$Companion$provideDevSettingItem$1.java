package com.nytimes.android.onboarding.compose;

import android.content.Context;
import com.nytimes.android.utils.AppPreferences;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.onboarding.compose.OnboardingSingletonModule$Companion$provideDevSettingItem$1", f = "OnboardingSingletonModule.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class OnboardingSingletonModule$Companion$provideDevSettingItem$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ AppPreferences $appPreferences;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnboardingSingletonModule$Companion$provideDevSettingItem$1(AppPreferences appPreferences, by0 by0Var) {
        super(2, by0Var);
        this.$appPreferences = appPreferences;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Context context, by0 by0Var) {
        return ((OnboardingSingletonModule$Companion$provideDevSettingItem$1) create(context, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new OnboardingSingletonModule$Companion$provideDevSettingItem$1(this.$appPreferences, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        AppPreferences appPreferences = this.$appPreferences;
        appPreferences.f("FreshInstallLaunch", true);
        appPreferences.f("DeferredOnboarding", false);
        return ww8.a;
    }
}
