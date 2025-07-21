package defpackage;

import android.app.Application;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.devsettings.base.composables.DevSettingUI;
import com.nytimes.android.devsettings.base.group.DevSettingGroupExpandable;
import com.nytimes.android.devsettings.common.DevSettingSwitchItem;
import com.nytimes.android.devsettings.common.DevSettingSwitchItemKt;
import com.nytimes.android.feedback.FeedbackFieldProviderImpl;
import com.nytimes.android.feedback.FeedbackProvider;
import com.nytimes.android.feedback.providers.FeedbackResourceProviderImpl;
import com.nytimes.android.feedback.zendesk.ZendeskProvider;
import com.nytimes.android.feedback.zendesk.ZendeskSdk;
import com.nytimes.android.utils.AppPreferences;
import defpackage.yn1;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class zc2 {
    public static final zc2 a = new zc2();

    private zc2() {
    }

    public final wc2 a(so1 so1Var, AppPreferences appPreferences, qv6 qv6Var, tc2 tc2Var, ed2 ed2Var, zm2 zm2Var, b05 b05Var) {
        zq3.h(so1Var, "deviceConfig");
        zq3.h(appPreferences, "appPreferences");
        zq3.h(qv6Var, "remoteConfig");
        zq3.h(tc2Var, "feedbackAppDependencies");
        zq3.h(ed2Var, "resourceProvider");
        zq3.h(zm2Var, "fontScaleManager");
        zq3.h(b05Var, "clock");
        return new FeedbackFieldProviderImpl(so1Var, appPreferences, qv6Var, tc2Var, ed2Var, zm2Var, b05Var);
    }

    public final boolean b(tc2 tc2Var) {
        zq3.h(tc2Var, "dependencies");
        return tc2Var.l();
    }

    public final wn1 c() {
        DevSettingSwitchItem a2;
        a2 = DevSettingSwitchItemKt.a("SLO/SLI ZenDesk Production", (r23 & 2) != 0 ? null : "Enable sending customer service feedback to PROD environment. This should only be used for testing.", (r23 & 4) != 0 ? null : "Do NOT use PROD environment", "com.nytimes.android.feedback.ZENDESK_ENV", (r23 & 16) != 0 ? false : false, (r23 & 32) != 0 ? false : true, (r23 & 64) != 0 ? DevSettingUI.c.a : null, (r23 & 128) != 0 ? null : null, (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? "SLO/SLI ZenDesk Production" : null, (r23 & 512) != 0 ? null : null);
        return new DevSettingGroupExpandable("Feedback", i.e(a2), null, false, yn1.a.b, null, false, false, 236, null);
    }

    public final FeedbackProvider d(h05 h05Var, ZendeskSdk zendeskSdk, wc2 wc2Var, ed2 ed2Var, qv6 qv6Var) {
        zq3.h(h05Var, "jobScheduler");
        zq3.h(zendeskSdk, "zendeskSdk");
        zq3.h(wc2Var, "feedbackFieldProvider");
        zq3.h(ed2Var, "resourceProvider");
        zq3.h(qv6Var, "remoteConfig");
        return new ZendeskProvider(h05Var, zendeskSdk, wc2Var, qv6Var, ed2Var);
    }

    public final ed2 e(Application application, zm2 zm2Var) {
        zq3.h(application, "application");
        zq3.h(zm2Var, "fontScaleManager");
        return new FeedbackResourceProviderImpl(application, zm2Var);
    }
}
