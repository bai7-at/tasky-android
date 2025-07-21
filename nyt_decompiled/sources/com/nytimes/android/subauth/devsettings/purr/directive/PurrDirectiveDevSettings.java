package com.nytimes.android.subauth.devsettings.purr.directive;

import android.content.Context;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.m;
import androidx.compose.ui.text.font.o;
import com.nytimes.android.devsettings.base.item.DevSettingXmlItem;
import com.nytimes.android.devsettings.common.DevSettingLazySummaryItem;
import com.nytimes.android.subauth.core.purr.directive.PurrAcceptableTrackersDirectiveV2;
import com.nytimes.android.subauth.core.purr.directive.PurrAdvertisingConfigurationDirectiveV2;
import com.nytimes.android.subauth.core.purr.directive.PurrAdvertisingConfigurationDirectiveV3;
import com.nytimes.android.subauth.core.purr.directive.PurrDataSaleOptOutDirectiveV2;
import com.nytimes.android.subauth.core.purr.directive.PurrDirectiveOverrider;
import com.nytimes.android.subauth.core.purr.directive.PurrEmailMarketingOptInUiDirective;
import com.nytimes.android.subauth.core.purr.directive.PurrFirstPartyBehavioralTargetingDirective;
import com.nytimes.android.subauth.core.purr.directive.PurrPrivacyDirective;
import com.nytimes.android.subauth.core.purr.directive.PurrShowCaliforniaNoticesUiDirective;
import com.nytimes.android.subauth.core.purr.directive.PurrShowDataProcessingConsentDirective;
import com.nytimes.android.subauth.core.purr.directive.PurrShowDataProcessingPreferenceDirective;
import com.nytimes.android.subauth.core.purr.directive.PurrShowLimitSensitivePIUiDirective;
import com.nytimes.android.subauth.core.purr.directive.PurrTCFUIDirective;
import com.nytimes.android.subauth.devsettings.purr.env.PurrEnvDevSettings;
import defpackage.jo6;
import defpackage.jo7;
import defpackage.jy7;
import defpackage.l74;
import defpackage.li8;
import defpackage.m60;
import defpackage.nn0;
import defpackage.ph8;
import defpackage.r41;
import defpackage.un1;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3ApplicationInterceptor;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class PurrDirectiveDevSettings {
    public static final PurrDirectiveDevSettings a = new PurrDirectiveDevSettings();

    private PurrDirectiveDevSettings() {
    }

    private final String c(PurrPrivacyDirective purrPrivacyDirective) {
        if (purrPrivacyDirective instanceof PurrAcceptableTrackersDirectiveV2) {
            return "Acceptable Trackers V2";
        }
        if (purrPrivacyDirective instanceof PurrAdvertisingConfigurationDirectiveV2) {
            return "Ad Configuration V2";
        }
        if (purrPrivacyDirective instanceof PurrAdvertisingConfigurationDirectiveV3) {
            return "Ad Configuration V3";
        }
        if (purrPrivacyDirective instanceof PurrDataSaleOptOutDirectiveV2) {
            return "Show Data Sale Opt Out V2";
        }
        if (purrPrivacyDirective instanceof PurrShowDataProcessingPreferenceDirective) {
            return "Data Processing Preference";
        }
        if (purrPrivacyDirective instanceof PurrShowDataProcessingConsentDirective) {
            return "Data Processing Consent UI";
        }
        if (purrPrivacyDirective instanceof PurrShowCaliforniaNoticesUiDirective) {
            return "Show California Notices UI";
        }
        if (purrPrivacyDirective instanceof PurrEmailMarketingOptInUiDirective) {
            return "Email Marketing Opt In UI V2";
        }
        if (purrPrivacyDirective instanceof PurrShowLimitSensitivePIUiDirective) {
            return "Show Limit Sensitive PI UI";
        }
        if (purrPrivacyDirective instanceof PurrTCFUIDirective) {
            return "Show TCF UI";
        }
        if (purrPrivacyDirective instanceof PurrFirstPartyBehavioralTargetingDirective) {
            return "First Party Behavioral Targeting";
        }
        return null;
    }

    private final String d(PurrPrivacyDirective purrPrivacyDirective) {
        if (purrPrivacyDirective instanceof PurrAcceptableTrackersDirectiveV2) {
            return String.valueOf(((PurrAcceptableTrackersDirectiveV2) purrPrivacyDirective).getValue());
        }
        if (purrPrivacyDirective instanceof PurrAdvertisingConfigurationDirectiveV2) {
            return String.valueOf(((PurrAdvertisingConfigurationDirectiveV2) purrPrivacyDirective).getValue());
        }
        if (purrPrivacyDirective instanceof PurrAdvertisingConfigurationDirectiveV3) {
            return String.valueOf(((PurrAdvertisingConfigurationDirectiveV3) purrPrivacyDirective).getValue());
        }
        if (purrPrivacyDirective instanceof PurrDataSaleOptOutDirectiveV2) {
            return String.valueOf(((PurrDataSaleOptOutDirectiveV2) purrPrivacyDirective).getValue());
        }
        if (purrPrivacyDirective instanceof PurrShowDataProcessingPreferenceDirective) {
            return String.valueOf(((PurrShowDataProcessingPreferenceDirective) purrPrivacyDirective).getValue());
        }
        if (purrPrivacyDirective instanceof PurrShowDataProcessingConsentDirective) {
            return String.valueOf(((PurrShowDataProcessingConsentDirective) purrPrivacyDirective).getValue());
        }
        if (purrPrivacyDirective instanceof PurrShowCaliforniaNoticesUiDirective) {
            return String.valueOf(((PurrShowCaliforniaNoticesUiDirective) purrPrivacyDirective).getValue());
        }
        if (purrPrivacyDirective instanceof PurrEmailMarketingOptInUiDirective) {
            return String.valueOf(((PurrEmailMarketingOptInUiDirective) purrPrivacyDirective).getValue());
        }
        if (purrPrivacyDirective instanceof PurrShowLimitSensitivePIUiDirective) {
            return String.valueOf(((PurrShowLimitSensitivePIUiDirective) purrPrivacyDirective).getValue());
        }
        if (purrPrivacyDirective instanceof PurrTCFUIDirective) {
            return String.valueOf(((PurrTCFUIDirective) purrPrivacyDirective).getValue());
        }
        if (purrPrivacyDirective instanceof PurrFirstPartyBehavioralTargetingDirective) {
            return String.valueOf(((PurrFirstPartyBehavioralTargetingDirective) purrPrivacyDirective).getValue());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a f(com.nytimes.android.subauth.core.purr.a aVar, List list, PurrDirectiveOverrider purrDirectiveOverrider, int i, Context context) {
        String str = "Location: " + PurrEnvDevSettings.a.a(context);
        String str2 = "Cache Lifetime: " + PurrCacheDevSettings.a.a(i);
        String str3 = "isUsingCache: " + aVar.e();
        String j = aVar.j();
        if (j == null) {
            j = EmbraceOkHttp3ApplicationInterceptor.UNKNOWN_EXCEPTION;
        }
        a.C0064a c0064a = new a.C0064a(0, 1, null);
        c0064a.i("\n" + str + "\n" + str2 + "\n" + str3 + "\n" + j + "\n\n");
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                PurrPrivacyDirective purrPrivacyDirective = (PurrPrivacyDirective) it2.next();
                PurrDirectiveDevSettings purrDirectiveDevSettings = a;
                String c = purrDirectiveDevSettings.c(purrPrivacyDirective);
                if (c != null) {
                    c0064a.i(c + ": " + purrDirectiveDevSettings.d(purrPrivacyDirective) + " ");
                    String overriddenValue = purrDirectiveOverrider.getOverriddenValue(purrPrivacyDirective);
                    if (overriddenValue != null) {
                        int n = c0064a.n(new jy7(nn0.b.e(), 0L, (o) null, (l) null, (m) null, (e) null, (String) null, 0L, (m60) null, (li8) null, (l74) null, 0L, (ph8) null, (jo7) null, 16382, (DefaultConstructorMarker) null));
                        try {
                            c0064a.i("\n    - Override: " + overriddenValue);
                            ww8 ww8Var = ww8.a;
                        } finally {
                            c0064a.k(n);
                        }
                    }
                    c0064a.i("\n");
                }
            }
        } else {
            c0064a.i("Directives Uninitialized!!");
        }
        return c0064a.o();
    }

    public final un1 b(com.nytimes.android.subauth.core.purr.a aVar, PurrDirectiveOverrider purrDirectiveOverrider, Context context, String str) {
        zq3.h(aVar, "purrManager");
        zq3.h(purrDirectiveOverrider, "directiveOverrider");
        zq3.h(context, "context");
        return new DevSettingLazySummaryItem("Current PURR State (Click to refresh)", null, new PurrDirectiveDevSettings$currentPURRStateDevSetting$1(aVar, purrDirectiveOverrider, context, null), null, null, null, r41.a.a(), str == null ? "Current PURR State (Click to refresh)" : str, false, true, 314, null);
    }

    public final un1 e(String str) {
        return new DevSettingXmlItem("Override PURR Directives", null, jo6.purr_directive_dev_settings_screen, r41.a.a(), str == null ? "Override PURR Directives" : str, false, 34, null);
    }
}
