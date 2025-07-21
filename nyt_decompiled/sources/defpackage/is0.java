package defpackage;

import com.nytimes.android.onboarding.compose.ComposeOnboardingActivity;
import com.nytimes.android.onboarding.compose.b;
import com.nytimes.android.subauth.core.auth.util.SmartLockLifecycleObserver;

/* loaded from: classes4.dex */
public abstract class is0 implements op4 {
    public static void a(ComposeOnboardingActivity composeOnboardingActivity, b bVar) {
        composeOnboardingActivity.navStateConductor = bVar;
    }

    public static void b(ComposeOnboardingActivity composeOnboardingActivity, SmartLockLifecycleObserver smartLockLifecycleObserver) {
        composeOnboardingActivity.smartLock = smartLockLifecycleObserver;
    }
}
