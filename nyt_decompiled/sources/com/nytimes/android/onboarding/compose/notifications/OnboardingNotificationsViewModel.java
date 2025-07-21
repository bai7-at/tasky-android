package com.nytimes.android.onboarding.compose.notifications;

import android.content.SharedPreferences;
import androidx.lifecycle.r;
import com.appsflyer.AppsFlyerProperties;
import com.nytimes.android.api.config.model.Channel;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2SimpleScope;
import com.nytimes.android.features.notifications.push.NotificationsViewModel;
import com.nytimes.android.latestfeed.feed.FeedStore;
import com.nytimes.android.onboarding.compose.b;
import com.nytimes.android.push.PushClientManager;
import defpackage.la5;
import defpackage.zq3;
import java.util.List;
import java.util.Locale;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;

/* loaded from: classes4.dex */
public final class OnboardingNotificationsViewModel extends NotificationsViewModel {
    public static final a Companion = new a(null);
    public static final int t = 8;
    private final ET2SimpleScope l;
    private final la5 m;
    private final b n;
    private final CoroutineDispatcher r;
    private final List s;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingNotificationsViewModel(FeedStore feedStore, ET2SimpleScope eT2SimpleScope, PushClientManager pushClientManager, la5 la5Var, SharedPreferences sharedPreferences, b bVar, CoroutineDispatcher coroutineDispatcher) {
        super(feedStore, eT2SimpleScope, pushClientManager, sharedPreferences, coroutineDispatcher);
        zq3.h(feedStore, "feedStore");
        zq3.h(eT2SimpleScope, "et2Scope");
        zq3.h(pushClientManager, "pushClientManager");
        zq3.h(la5Var, "notificationsHelper");
        zq3.h(sharedPreferences, "sharedPreferences");
        zq3.h(bVar, "navStateConductor");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        this.l = eT2SimpleScope;
        this.m = la5Var;
        this.n = bVar;
        this.r = coroutineDispatcher;
        p();
        this.s = i.o("breaking news", "morning briefing", "top stories", "your times experience", "offers and opportunities");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:25|26))(2:27|28)|12|(3:15|(2:17|18)(1:20)|13)|21|22|23))|31|6|7|(0)(0)|12|(1:13)|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0031, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
    
        com.nytimes.android.logging.NYTLogger.h(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[Catch: Exception -> 0x0031, TRY_LEAVE, TryCatch #0 {Exception -> 0x0031, blocks: (B:11:0x002d, B:13:0x0047, B:15:0x004d, B:28:0x003e), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(java.util.List r6, defpackage.by0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.nytimes.android.onboarding.compose.notifications.OnboardingNotificationsViewModel$pushAllSubscribedTags$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.onboarding.compose.notifications.OnboardingNotificationsViewModel$pushAllSubscribedTags$1 r0 = (com.nytimes.android.onboarding.compose.notifications.OnboardingNotificationsViewModel$pushAllSubscribedTags$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.onboarding.compose.notifications.OnboardingNotificationsViewModel$pushAllSubscribedTags$1 r0 = new com.nytimes.android.onboarding.compose.notifications.OnboardingNotificationsViewModel$pushAllSubscribedTags$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.L$1
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.L$0
            com.nytimes.android.onboarding.compose.notifications.OnboardingNotificationsViewModel r6 = (com.nytimes.android.onboarding.compose.notifications.OnboardingNotificationsViewModel) r6
            kotlin.f.b(r7)     // Catch: java.lang.Exception -> L31
            goto L47
        L31:
            r5 = move-exception
            goto L60
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            kotlin.f.b(r7)
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: java.lang.Exception -> L31
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> L31
            r4 = r6
            r6 = r5
            r5 = r4
        L47:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Exception -> L31
            if (r7 == 0) goto L63
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Exception -> L31
            com.nytimes.android.push.NotificationsGroupItems r7 = (com.nytimes.android.push.NotificationsGroupItems) r7     // Catch: java.lang.Exception -> L31
            r0.L$0 = r6     // Catch: java.lang.Exception -> L31
            r0.L$1 = r5     // Catch: java.lang.Exception -> L31
            r0.label = r3     // Catch: java.lang.Exception -> L31
            java.lang.Object r7 = r6.G(r7, r0)     // Catch: java.lang.Exception -> L31
            if (r7 != r1) goto L47
            return r1
        L60:
            com.nytimes.android.logging.NYTLogger.h(r5)
        L63:
            ww8 r5 = defpackage.ww8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.onboarding.compose.notifications.OnboardingNotificationsViewModel.F(java.util.List, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(com.nytimes.android.push.NotificationsGroupItems r6, defpackage.by0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.nytimes.android.onboarding.compose.notifications.OnboardingNotificationsViewModel$pushChannelData$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.onboarding.compose.notifications.OnboardingNotificationsViewModel$pushChannelData$1 r0 = (com.nytimes.android.onboarding.compose.notifications.OnboardingNotificationsViewModel$pushChannelData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.onboarding.compose.notifications.OnboardingNotificationsViewModel$pushChannelData$1 r0 = new com.nytimes.android.onboarding.compose.notifications.OnboardingNotificationsViewModel$pushChannelData$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r5 = r0.L$2
            com.nytimes.android.push.NotificationsChannel r5 = (com.nytimes.android.push.NotificationsChannel) r5
            java.lang.Object r5 = r0.L$1
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.L$0
            com.nytimes.android.onboarding.compose.notifications.OnboardingNotificationsViewModel r6 = (com.nytimes.android.onboarding.compose.notifications.OnboardingNotificationsViewModel) r6
            kotlin.f.b(r7)
            goto L4d
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3d:
            kotlin.f.b(r7)
            java.util.List r6 = r6.d()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            r4 = r6
            r6 = r5
            r5 = r4
        L4d:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L6e
            java.lang.Object r7 = r5.next()
            com.nytimes.android.push.NotificationsChannel r7 = (com.nytimes.android.push.NotificationsChannel) r7
            boolean r2 = r7.g()
            if (r2 == 0) goto L4d
            r0.L$0 = r6
            r0.L$1 = r5
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r7 = r6.t(r7, r3, r0)
            if (r7 != r1) goto L4d
            return r1
        L6e:
            ww8 r5 = defpackage.ww8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.onboarding.compose.notifications.OnboardingNotificationsViewModel.G(com.nytimes.android.push.NotificationsGroupItems, by0):java.lang.Object");
    }

    public final Job E() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new OnboardingNotificationsViewModel$nextScreen$1(this, null), 3, null);
        return launch$default;
    }

    public final Job H() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(r.a(this), this.r, null, new OnboardingNotificationsViewModel$trackPage$1(this, null), 2, null);
        return launch$default;
    }

    @Override // com.nytimes.android.features.notifications.push.NotificationsViewModel
    public boolean r(Channel channel) {
        zq3.h(channel, AppsFlyerProperties.CHANNEL);
        List list = this.s;
        String lowerCase = channel.getTitle().toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        return this.m.b(channel) | list.contains(lowerCase);
    }
}
