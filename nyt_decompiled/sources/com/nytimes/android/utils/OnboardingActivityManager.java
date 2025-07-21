package com.nytimes.android.utils;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.nytimes.android.features.notifications.push.ComposeNotificationsActivity;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.onboarding.compose.ComposeOnboardingActivity;
import com.nytimes.android.subauth.core.auth.util.OneTapLifecycleObserver;
import com.nytimes.android.subauth.core.auth.util.SmartLockLifecycleObserver;
import com.nytimes.android.widget.BrazilDisclaimer;
import defpackage.by0;
import defpackage.cu;
import defpackage.tr8;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class OnboardingActivityManager {
    public static final a Companion = new a(null);
    public static final int i = 8;
    private final Activity a;
    private final AppPreferences b;
    private final com.nytimes.android.entitlements.a c;
    private final BrazilDisclaimer d;
    private final SmartLockLifecycleObserver e;
    private final OneTapLifecycleObserver f;
    private final MutableStateFlow g;
    private final StateFlow h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public OnboardingActivityManager(Activity activity, AppPreferences appPreferences, com.nytimes.android.entitlements.a aVar, BrazilDisclaimer brazilDisclaimer, SmartLockLifecycleObserver smartLockLifecycleObserver, OneTapLifecycleObserver oneTapLifecycleObserver) {
        zq3.h(activity, "activity");
        zq3.h(appPreferences, "appPreferences");
        zq3.h(aVar, "eCommClient");
        zq3.h(brazilDisclaimer, "brazilDisclaimer");
        zq3.h(smartLockLifecycleObserver, "smartLockLifecycleObserver");
        zq3.h(oneTapLifecycleObserver, "oneTapLifecycleObserver");
        this.a = activity;
        this.b = appPreferences;
        this.c = aVar;
        this.d = brazilDisclaimer;
        this.e = smartLockLifecycleObserver;
        this.f = oneTapLifecycleObserver;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.g = MutableStateFlow;
        this.h = FlowKt.asStateFlow(MutableStateFlow);
    }

    private final boolean d() {
        return this.b.n("DeferredOnboarding", false) | this.b.n("FreshInstallLaunch", true);
    }

    private final String e() {
        return this.a.getIntent().getStringExtra("com.nytimes.android.extra.LANDINGPAGE_NAME");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(cu cuVar, by0 by0Var) {
        Object m;
        this.c.k(cuVar);
        if (!(cuVar instanceof cu.i)) {
            return ((cuVar instanceof cu.b) && (m = m(by0Var)) == kotlin.coroutines.intrinsics.a.h()) ? m : ww8.a;
        }
        Object m2 = m(by0Var);
        return m2 == kotlin.coroutines.intrinsics.a.h() ? m2 : ww8.a;
    }

    private final Job i(Lifecycle lifecycle, LifecycleCoroutineScope lifecycleCoroutineScope, boolean z) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(lifecycleCoroutineScope, null, null, new OnboardingActivityManager$initSmartLockTask$1(z, lifecycle, this, lifecycleCoroutineScope, null), 3, null);
        return launch$default;
    }

    private final void k() {
        this.a.getIntent().removeExtra("com.nytimes.android.extra.LANDINGPAGE_NAME");
        tr8.a(ComposeNotificationsActivity.Companion.a(this.a), this.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.utils.OnboardingActivityManager$launchOneTap$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.utils.OnboardingActivityManager$launchOneTap$1 r0 = (com.nytimes.android.utils.OnboardingActivityManager$launchOneTap$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.utils.OnboardingActivityManager$launchOneTap$1 r0 = new com.nytimes.android.utils.OnboardingActivityManager$launchOneTap$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r5)
            com.nytimes.android.subauth.core.auth.util.OneTapLifecycleObserver r4 = r4.f
            r0.label = r3
            java.lang.Object r5 = r4.f(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            cu r5 = (defpackage.cu) r5
            boolean r4 = r5 instanceof cu.f
            r0 = 0
            if (r4 == 0) goto L4e
            java.lang.String r4 = "Success logging in with one tap"
            java.lang.Object[] r5 = new java.lang.Object[r0]
            com.nytimes.android.logging.NYTLogger.l(r4, r5)
            goto L89
        L4e:
            boolean r4 = r5 instanceof cu.d
            if (r4 == 0) goto L5a
            java.lang.String r4 = "Failed one tap login"
            java.lang.Object[] r5 = new java.lang.Object[r0]
            com.nytimes.android.logging.NYTLogger.g(r4, r5)
            goto L89
        L5a:
            boolean r4 = r5 instanceof cu.h
            if (r4 == 0) goto L66
            java.lang.String r4 = "Failed to read from one tap"
            java.lang.Object[] r5 = new java.lang.Object[r0]
            com.nytimes.android.logging.NYTLogger.g(r4, r5)
            goto L89
        L66:
            boolean r4 = r5 instanceof cu.b
            if (r4 == 0) goto L72
            java.lang.String r4 = "One tap has already run for this version"
            java.lang.Object[] r5 = new java.lang.Object[r0]
            com.nytimes.android.logging.NYTLogger.l(r4, r5)
            goto L89
        L72:
            boolean r4 = r5 instanceof cu.c
            if (r4 == 0) goto L7e
            java.lang.String r4 = "User cancelled one tap"
            java.lang.Object[] r5 = new java.lang.Object[r0]
            com.nytimes.android.logging.NYTLogger.l(r4, r5)
            goto L89
        L7e:
            boolean r4 = r5 instanceof cu.i
            if (r4 == 0) goto L89
            java.lang.String r4 = "Smart lock failure during one tap. Shouldn't happen"
            java.lang.Object[] r5 = new java.lang.Object[r0]
            com.nytimes.android.logging.NYTLogger.g(r4, r5)
        L89:
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.utils.OnboardingActivityManager.m(by0):java.lang.Object");
    }

    public final StateFlow f() {
        return this.h;
    }

    public final void g(int i2) {
        if (i2 == 1) {
            this.a.finish();
        } else {
            this.d.displayBrazilDisclaimer();
        }
    }

    public final boolean j() {
        if (zq3.c(e(), "notifications")) {
            k();
            return true;
        }
        NYTLogger.A("launchLandingPage() was not consumed", new Object[0]);
        return false;
    }

    public final void l(Activity activity) {
        zq3.h(activity, "activity");
        if (p()) {
            activity.startActivityForResult(new Intent(activity, (Class<?>) ComposeOnboardingActivity.class), 1433);
        }
    }

    public final void n(Lifecycle lifecycle, LifecycleCoroutineScope lifecycleCoroutineScope, Bundle bundle) {
        zq3.h(lifecycle, "lifecycle");
        zq3.h(lifecycleCoroutineScope, "lifecycleScoped");
        boolean z = bundle == null && e() == null && p();
        if (z) {
            l(this.a);
        } else {
            j();
        }
        if (!z) {
            this.d.displayBrazilDisclaimer();
        }
        i(lifecycle, lifecycleCoroutineScope, z);
        this.g.setValue(Boolean.valueOf(z));
    }

    public final void o() {
        this.b.f("FreshInstallLaunch", false);
    }

    public final boolean p() {
        return d();
    }

    public final void q() {
        this.g.setValue(Boolean.FALSE);
    }
}
