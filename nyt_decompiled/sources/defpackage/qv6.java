package defpackage;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class qv6 extends lr6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv6(aw6... aw6VarArr) {
        super((aw6[]) Arrays.copyOf(aw6VarArr, aw6VarArr.length));
        zq3.h(aw6VarArr, "providers");
    }

    public final String A() {
        return c("android_post_auth_configs");
    }

    public final String B() {
        return c("android_PRO_PLO");
    }

    public final String C() {
        return c("android_productLandingPageInfo_athenaImpact2");
    }

    public final String D() {
        return c("android_regibundleMessaging");
    }

    public final String E() {
        return c("android_regiwall");
    }

    public final String F() {
        return c("android_update_worker_params");
    }

    public final String G() {
        return c("android_wordlebotPaywall");
    }

    public final boolean f() {
        return a("android_appsFlyerEnabled");
    }

    public final String g() {
        return c("android_banned_et2_urls");
    }

    public final String h() {
        return c("config_source");
    }

    public final boolean i() {
        return a("android_dataDogEnabled");
    }

    public final boolean j() {
        return a("android_dataDogTracingEnabled");
    }

    public final String k() {
        return c("android_dockMessaging");
    }

    public final boolean l() {
        return a("featureFlag_onetap_accountready_enabled");
    }

    public final String m() {
        return c("feedback_subject");
    }

    public final String n() {
        return c("android_games_destination_config");
    }

    public final String o() {
        return c("android_games_hub_config_entitled");
    }

    public final String p() {
        return c("android_gamesLandingPageADA");
    }

    public final float q() {
        return Float.parseFloat(c("staticValues_gatewaySheetOffset"));
    }

    public final String r() {
        return c("android_truncator");
    }

    public final int s() {
        return b("android_home_scrollPercentage").intValue();
    }

    public final boolean t() {
        return a("android_hybridSpellingBeeIsEnabled");
    }

    public final boolean u() {
        return a("featureFlag_inAppReview_Android");
    }

    public final String v() {
        return c("meter_gatewayOfflineValueProp");
    }

    public final String w() {
        return c("android_games_hub_config_non_entitled");
    }

    public final String x() {
        return c("android_paywall");
    }

    public final int y() {
        return b("android_play_tab_scrollPercentage").intValue();
    }

    public final String z() {
        return c("android_poisonPilling");
    }
}
