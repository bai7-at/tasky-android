package com.nytimes.android.subauth.core.purr.directive;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.hm6;
import defpackage.uo6;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class PurrDirectiveOverrider {
    public static final Companion Companion = new Companion(null);
    public static final String NO_OVERRIDE = "NO OVERRIDE";
    private final String adsV2Key;
    private final String adsV3Key;
    private final String caliNoticesKey;
    private final String dataConsentKey;
    private final String dataOptV2Key;
    private final String dataPrefKey;
    private final String emailMarketingOptInKey;
    private final String firstPartyKey;
    private final String limitSensitivePIKey;
    private final SharedPreferences sharedPrefs;
    private final String tcfUIKey;
    private final String trackersV2Key;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PurrDirectiveOverrider(Context context, SharedPreferences sharedPreferences) {
        zq3.h(context, "context");
        zq3.h(sharedPreferences, "sharedPrefs");
        this.sharedPrefs = sharedPreferences;
        String string = context.getString(hm6.purr_key_trackers_V2);
        zq3.g(string, "getString(...)");
        this.trackersV2Key = string;
        String string2 = context.getString(hm6.purr_key_ads_V2);
        zq3.g(string2, "getString(...)");
        this.adsV2Key = string2;
        String string3 = context.getString(hm6.purr_key_ads_V3);
        zq3.g(string3, "getString(...)");
        this.adsV3Key = string3;
        String string4 = context.getString(hm6.purr_key_data_opt_v2);
        zq3.g(string4, "getString(...)");
        this.dataOptV2Key = string4;
        String string5 = context.getString(hm6.purr_key_data_consent);
        zq3.g(string5, "getString(...)");
        this.dataConsentKey = string5;
        String string6 = context.getString(hm6.purr_key_data_pref);
        zq3.g(string6, "getString(...)");
        this.dataPrefKey = string6;
        String string7 = context.getString(hm6.purr_key_cali_notices);
        zq3.g(string7, "getString(...)");
        this.caliNoticesKey = string7;
        String string8 = context.getString(hm6.purr_key_email_marketing_opt_in);
        zq3.g(string8, "getString(...)");
        this.emailMarketingOptInKey = string8;
        String string9 = context.getString(hm6.purr_key_limit_sensitive_pi);
        zq3.g(string9, "getString(...)");
        this.limitSensitivePIKey = string9;
        String string10 = context.getString(hm6.purr_key_tcf_ui);
        zq3.g(string10, "getString(...)");
        this.tcfUIKey = string10;
        String string11 = context.getString(hm6.purr_key_first_party_targeting);
        zq3.g(string11, "getString(...)");
        this.firstPartyKey = string11;
    }

    private final PurrPrivacyDirective createOverriddenDirective(PurrPrivacyDirective purrPrivacyDirective, String str) {
        if (purrPrivacyDirective instanceof PurrAcceptableTrackersDirectiveV2) {
            return new PurrAcceptableTrackersDirectiveV2(AcceptableTracker.valueOf(str));
        }
        if (purrPrivacyDirective instanceof PurrAdvertisingConfigurationDirectiveV2) {
            return new PurrAdvertisingConfigurationDirectiveV2(AdConfiguration.valueOf(str));
        }
        if (purrPrivacyDirective instanceof PurrAdvertisingConfigurationDirectiveV3) {
            return new PurrAdvertisingConfigurationDirectiveV3(AdConfiguration.valueOf(str));
        }
        if (purrPrivacyDirective instanceof PurrDataSaleOptOutDirectiveV2) {
            return new PurrDataSaleOptOutDirectiveV2(DataSaleOptOutDirectiveValueV2.valueOf(str));
        }
        if (purrPrivacyDirective instanceof PurrShowDataProcessingPreferenceDirective) {
            return new PurrShowDataProcessingPreferenceDirective(DataProcessingPreferenceDirectiveValue.valueOf(str));
        }
        if (purrPrivacyDirective instanceof PurrShowDataProcessingConsentDirective) {
            return new PurrShowDataProcessingConsentDirective(ToggleableDirectiveValue.valueOf(str));
        }
        if (purrPrivacyDirective instanceof PurrShowCaliforniaNoticesUiDirective) {
            return new PurrShowCaliforniaNoticesUiDirective(ToggleableDirectiveValue.valueOf(str));
        }
        if (purrPrivacyDirective instanceof PurrEmailMarketingOptInUiDirective) {
            return new PurrEmailMarketingOptInUiDirective(EmailMarketingOptInDirectiveValue.valueOf(str));
        }
        if (purrPrivacyDirective instanceof PurrShowLimitSensitivePIUiDirective) {
            return new PurrShowLimitSensitivePIUiDirective(ToggleableDirectiveValue.valueOf(str));
        }
        if (purrPrivacyDirective instanceof PurrTCFUIDirective) {
            return new PurrTCFUIDirective(ToggleableDirectiveValue.valueOf(str));
        }
        if (purrPrivacyDirective instanceof PurrFirstPartyBehavioralTargetingDirective) {
            return new PurrFirstPartyBehavioralTargetingDirective(FirstPartyDirectiveValue.valueOf(str));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String getKey(PurrPrivacyDirective purrPrivacyDirective) {
        if (purrPrivacyDirective instanceof PurrAcceptableTrackersDirectiveV2) {
            return this.trackersV2Key;
        }
        if (purrPrivacyDirective instanceof PurrAdvertisingConfigurationDirectiveV2) {
            return this.adsV2Key;
        }
        if (purrPrivacyDirective instanceof PurrAdvertisingConfigurationDirectiveV3) {
            return this.adsV3Key;
        }
        if (purrPrivacyDirective instanceof PurrDataSaleOptOutDirectiveV2) {
            return this.dataOptV2Key;
        }
        if (purrPrivacyDirective instanceof PurrShowDataProcessingPreferenceDirective) {
            return this.dataPrefKey;
        }
        if (purrPrivacyDirective instanceof PurrShowDataProcessingConsentDirective) {
            return this.dataConsentKey;
        }
        if (purrPrivacyDirective instanceof PurrShowCaliforniaNoticesUiDirective) {
            return this.caliNoticesKey;
        }
        if (purrPrivacyDirective instanceof PurrEmailMarketingOptInUiDirective) {
            return this.emailMarketingOptInKey;
        }
        if (purrPrivacyDirective instanceof PurrShowLimitSensitivePIUiDirective) {
            return this.limitSensitivePIKey;
        }
        if (purrPrivacyDirective instanceof PurrTCFUIDirective) {
            return this.tcfUIKey;
        }
        if (purrPrivacyDirective instanceof PurrFirstPartyBehavioralTargetingDirective) {
            return this.firstPartyKey;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final PrivacyConfiguration applyOverrides(PrivacyConfiguration privacyConfiguration) {
        zq3.h(privacyConfiguration, "config");
        List<PurrPrivacyDirective> directives = privacyConfiguration.getDirectives();
        LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(i.w(directives, 10)), 16));
        for (Object obj : directives) {
            linkedHashMap.put(getKey((PurrPrivacyDirective) obj), obj);
        }
        Map x = t.x(linkedHashMap);
        for (Map.Entry entry : x.entrySet()) {
            String overriddenValue = getOverriddenValue((PurrPrivacyDirective) entry.getValue());
            if (overriddenValue != null) {
                x.put(entry.getKey(), createOverriddenDirective((PurrPrivacyDirective) entry.getValue(), overriddenValue));
            }
        }
        ArrayList arrayList = new ArrayList(x.size());
        Iterator it2 = x.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add((PurrPrivacyDirective) ((Map.Entry) it2.next()).getValue());
        }
        return PrivacyConfiguration.copy$default(privacyConfiguration, i.X0(arrayList), null, 0, 0L, 14, null);
    }

    public final String getOverriddenValue(PurrPrivacyDirective purrPrivacyDirective) {
        zq3.h(purrPrivacyDirective, "directive");
        String string = this.sharedPrefs.getString(getKey(purrPrivacyDirective), NO_OVERRIDE);
        if (string == null || h.d0(string) || zq3.c(string, NO_OVERRIDE)) {
            return null;
        }
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ PurrDirectiveOverrider(android.content.Context r1, android.content.SharedPreferences r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            android.content.SharedPreferences r2 = androidx.preference.g.b(r1)
            java.lang.String r3 = "getDefaultSharedPreferences(...)"
            defpackage.zq3.g(r2, r3)
        Ld:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purr.directive.PurrDirectiveOverrider.<init>(android.content.Context, android.content.SharedPreferences, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
