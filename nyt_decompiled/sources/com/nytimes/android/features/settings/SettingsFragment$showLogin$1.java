package com.nytimes.android.features.settings;

import com.nytimes.android.entitlements.b;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.settings.SettingsFragment$showLogin$1", f = "SettingsFragment.kt", l = {500}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SettingsFragment$showLogin$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ SettingsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsFragment$showLogin$1(SettingsFragment settingsFragment, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = settingsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SettingsFragment$showLogin$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            com.nytimes.android.entitlements.a eCommClient = this.this$0.getECommClient();
            androidx.fragment.app.f requireActivity = this.this$0.requireActivity();
            zq3.g(requireActivity, "requireActivity(...)");
            this.label = 1;
            if (b.a.a(eCommClient, requireActivity, null, "Settings", this, 2, null) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        this.this$0.getAccountSettingsPresenter().h();
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SettingsFragment$showLogin$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
