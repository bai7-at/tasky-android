package com.nytimes.android.onboarding.compose;

import androidx.compose.runtime.Composer;
import com.nytimes.android.features.notifications.push.NotificationsScreenKt;
import com.nytimes.android.push.NotificationsChannel;
import com.nytimes.android.push.NotificationsGroupItems;
import defpackage.ca5;
import defpackage.gt2;
import defpackage.it2;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$OnboardingScaffoldKt {
    public static final ComposableSingletons$OnboardingScaffoldKt a = new ComposableSingletons$OnboardingScaffoldKt();
    public static gt2 b = zr0.c(-546726168, false, new gt2() { // from class: com.nytimes.android.onboarding.compose.ComposableSingletons$OnboardingScaffoldKt$lambda-1$1
        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return ww8.a;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.i()) {
                composer.K();
                return;
            }
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-546726168, i, -1, "com.nytimes.android.onboarding.compose.ComposableSingletons$OnboardingScaffoldKt.lambda-1.<anonymous> (OnboardingScaffold.kt:85)");
            }
            NotificationsScreenKt.f(composer, 0);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
    });
    public static gt2 c = zr0.c(280080259, false, new gt2() { // from class: com.nytimes.android.onboarding.compose.ComposableSingletons$OnboardingScaffoldKt$lambda-2$1
        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return ww8.a;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.i()) {
                composer.K();
                return;
            }
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(280080259, i, -1, "com.nytimes.android.onboarding.compose.ComposableSingletons$OnboardingScaffoldKt.lambda-2.<anonymous> (OnboardingScaffold.kt:167)");
            }
            OnboardingScaffoldKt.c(5, 9, new qs2() { // from class: com.nytimes.android.onboarding.compose.ComposableSingletons$OnboardingScaffoldKt$lambda-2$1.1
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m617invoke() {
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m617invoke();
                    return ww8.a;
                }
            }, ca5.a(), new it2() { // from class: com.nytimes.android.onboarding.compose.ComposableSingletons$OnboardingScaffoldKt$lambda-2$1.2
                public final void b(NotificationsGroupItems notificationsGroupItems, NotificationsChannel notificationsChannel, boolean z) {
                    zq3.h(notificationsGroupItems, "<anonymous parameter 0>");
                    zq3.h(notificationsChannel, "<anonymous parameter 1>");
                }

                @Override // defpackage.it2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    b((NotificationsGroupItems) obj, (NotificationsChannel) obj2, ((Boolean) obj3).booleanValue());
                    return ww8.a;
                }
            }, Boolean.TRUE, composer, 225718, 0);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
    });

    public final gt2 a() {
        return b;
    }
}
