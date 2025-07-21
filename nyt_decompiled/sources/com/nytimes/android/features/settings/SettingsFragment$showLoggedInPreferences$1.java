package com.nytimes.android.features.settings;

import androidx.preference.Preference;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.settings.SettingsFragment$showLoggedInPreferences$1", f = "SettingsFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SettingsFragment$showLoggedInPreferences$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ SettingsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsFragment$showLoggedInPreferences$1(SettingsFragment settingsFragment, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = settingsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SettingsFragment$showLoggedInPreferences$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Preference userNamePreference;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        this.this$0.setupManageSubPreference();
        userNamePreference = this.this$0.getUserNamePreference();
        userNamePreference.F0(this.this$0.getECommClient().g());
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SettingsFragment$showLoggedInPreferences$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
