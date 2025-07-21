package io.embrace.android.embracesdk.config.behavior;

import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.remote.RemoteConfig;
import io.embrace.android.embracesdk.config.remote.WebViewVitals;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class WebViewVitalsBehavior extends MergedConfigBehavior<ww8, RemoteConfig> {
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_MAX_VITALS = 300;
    private static final float DEFAULT_WEB_VITALS_PCT = 100.0f;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewVitalsBehavior(BehaviorThresholdCheck behaviorThresholdCheck, qs2 qs2Var) {
        super(behaviorThresholdCheck, new qs2() { // from class: io.embrace.android.embracesdk.config.behavior.WebViewVitalsBehavior.1
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final ww8 mo865invoke() {
                return null;
            }
        }, qs2Var);
        zq3.h(behaviorThresholdCheck, "thresholdCheck");
        zq3.h(qs2Var, "remoteSupplier");
    }

    private final float getWebVitalsPct() {
        WebViewVitals webViewVitals;
        Float pctEnabled;
        RemoteConfig remote = getRemote();
        return (remote == null || (webViewVitals = remote.getWebViewVitals()) == null || (pctEnabled = webViewVitals.getPctEnabled()) == null) ? DEFAULT_WEB_VITALS_PCT : pctEnabled.floatValue();
    }

    public final int getMaxWebViewVitals() {
        WebViewVitals webViewVitals;
        Integer maxVitals;
        RemoteConfig remote = getRemote();
        if (remote == null || (webViewVitals = remote.getWebViewVitals()) == null || (maxVitals = webViewVitals.getMaxVitals()) == null) {
            return 300;
        }
        return maxVitals.intValue();
    }

    public final boolean isWebViewVitalsEnabled() {
        return getThresholdCheck().isBehaviorEnabled(getWebVitalsPct());
    }
}
