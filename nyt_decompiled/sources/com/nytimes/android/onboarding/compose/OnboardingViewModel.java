package com.nytimes.android.onboarding.compose;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.subauth.core.auth.util.SmartLockLifecycleObserver;
import com.nytimes.android.utils.AppPreferences;
import defpackage.cu;
import defpackage.e52;
import defpackage.s42;
import defpackage.tx1;
import defpackage.u32;
import defpackage.zq3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.Job;

/* loaded from: classes4.dex */
public final class OnboardingViewModel extends q {
    private final AppPreferences a;
    private final com.nytimes.android.entitlements.a b;
    private final b c;
    private final ET2Scope d;
    private final CoroutineDispatcher e;
    private Job f;

    public OnboardingViewModel(AppPreferences appPreferences, com.nytimes.android.entitlements.a aVar, b bVar, ET2Scope eT2Scope, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(appPreferences, "appPreferences");
        zq3.h(aVar, "ecommClient");
        zq3.h(bVar, "navStateConductor");
        zq3.h(eT2Scope, "eT2Scope");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        this.a = appPreferences;
        this.b = aVar;
        this.c = bVar;
        this.d = eT2Scope;
        this.e = coroutineDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(cu cuVar) {
        this.b.k(cuVar);
        j();
    }

    private final s42 m(boolean z) {
        return new s42(z ? DebugKt.DEBUG_PROPERTY_VALUE_ON : DebugKt.DEBUG_PROPERTY_VALUE_OFF, z ? JsonDocumentFields.EFFECT_VALUE_ALLOW : "Don't Allow", null, null, null, null, null, null, "system push notifications", 252, null);
    }

    public final Job j() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new OnboardingViewModel$fastForward$1(this, null), 3, null);
        return launch$default;
    }

    public final void l(Lifecycle lifecycle, SmartLockLifecycleObserver smartLockLifecycleObserver) {
        Job launch$default;
        zq3.h(lifecycle, "lifecycle");
        zq3.h(smartLockLifecycleObserver, "smartLock");
        this.a.f("DeferredOnboarding", false);
        if (this.f == null) {
            lifecycle.a(smartLockLifecycleObserver);
            launch$default = BuildersKt__Builders_commonKt.launch$default(r.a(this), this.e, null, new OnboardingViewModel$observeLoginAndSmartlockEvents$1(this, smartLockLifecycleObserver, null), 2, null);
            this.f = launch$default;
        }
    }

    public final void n(boolean z) {
        tx1 c = this.d.c();
        if (c != null) {
            ET2PageScope.DefaultImpls.a(c, new e52.e(), m(z), new u32(null, "onboarding", "tap", 1, null), null, 8, null);
        }
    }
}
