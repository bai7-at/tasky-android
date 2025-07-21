package com.nytimes.android.onboarding.compose.splash;

import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.nytimes.android.onboarding.compose.b;
import defpackage.zq3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public final class OnboardingSplashViewModel extends q {
    private final b a;
    private final CoroutineDispatcher b;

    public OnboardingSplashViewModel(b bVar, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(bVar, "onboardingScreenConductor");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        this.a = bVar;
        this.b = coroutineDispatcher;
    }

    public final void f() {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), this.b, null, new OnboardingSplashViewModel$nextScreen$1(this, null), 2, null);
    }
}
