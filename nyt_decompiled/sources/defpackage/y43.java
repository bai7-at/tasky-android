package defpackage;

import android.app.Application;
import com.nytimes.android.growthui.R;
import com.nytimes.android.growthui.common.models.DataConfigId;
import com.nytimes.android.growthui.landingpage.data.AllAccessLandingPageConfigRepository;
import com.nytimes.android.growthui.landingpage.data.GamesLandingPageConfigRepository;
import com.nytimes.android.growthui.paywall.models.remoteconfig.PaywallConfigRepository;
import com.nytimes.android.growthui.postauth.models.remoteconfig.PostAuthConfigRepository;
import com.nytimes.android.growthui.regibundle.RegibundleConfigRepository;
import com.squareup.moshi.i;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public final class y43 {
    private final String a(Application application, int i) {
        InputStream openRawResource = application.getResources().openRawResource(i);
        zq3.g(openRawResource, "openRawResource(...)");
        byte[] bArr = new byte[openRawResource.available()];
        openRawResource.read(bArr);
        openRawResource.close();
        Charset defaultCharset = Charset.defaultCharset();
        zq3.g(defaultCharset, "defaultCharset(...)");
        return new String(bArr, defaultCharset);
    }

    public final PaywallConfigRepository b(Application application, p53 p53Var, i iVar) {
        zq3.h(application, "application");
        zq3.h(p53Var, "growthUIRemoteConfig");
        zq3.h(iVar, "moshi");
        return new PaywallConfigRepository(DataConfigId.AllAccessPaywall, a(application, R.raw.fallback_paywall_info), p53Var, iVar);
    }

    public final PostAuthConfigRepository c(Application application, p53 p53Var, r53 r53Var, i iVar) {
        zq3.h(application, "application");
        zq3.h(p53Var, "growthUIRemoteConfig");
        zq3.h(r53Var, "growthUISubscription");
        zq3.h(iVar, "moshi");
        return new PostAuthConfigRepository(DataConfigId.AllAccessPostLogin, a(application, R.raw.fallback_all_access_post_auth_info), r53Var, p53Var, iVar);
    }

    public final PostAuthConfigRepository d(Application application, p53 p53Var, r53 r53Var, i iVar) {
        zq3.h(application, "application");
        zq3.h(p53Var, "growthUIRemoteConfig");
        zq3.h(r53Var, "growthUISubscription");
        zq3.h(iVar, "moshi");
        return new PostAuthConfigRepository(DataConfigId.AllAccessPostRegistration, a(application, R.raw.fallback_all_access_post_auth_info), r53Var, p53Var, iVar);
    }

    public final PostAuthConfigRepository e(Application application, p53 p53Var, r53 r53Var, i iVar) {
        zq3.h(application, "application");
        zq3.h(p53Var, "growthUIRemoteConfig");
        zq3.h(r53Var, "growthUISubscription");
        zq3.h(iVar, "moshi");
        return new PostAuthConfigRepository(DataConfigId.GamesPostLogin, a(application, R.raw.fallback_games_post_auth_info), r53Var, p53Var, iVar);
    }

    public final PostAuthConfigRepository f(Application application, p53 p53Var, r53 r53Var, i iVar) {
        zq3.h(application, "application");
        zq3.h(p53Var, "growthUIRemoteConfig");
        zq3.h(r53Var, "growthUISubscription");
        zq3.h(iVar, "moshi");
        return new PostAuthConfigRepository(DataConfigId.GamesPostRegistration, a(application, R.raw.fallback_games_post_auth_info), r53Var, p53Var, iVar);
    }

    public final gy3 g(Application application, r53 r53Var, p53 p53Var, i iVar) {
        zq3.h(application, "application");
        zq3.h(r53Var, "growthUISubscription");
        zq3.h(p53Var, "growthUIRemoteConfig");
        zq3.h(iVar, "moshi");
        return new AllAccessLandingPageConfigRepository(DataConfigId.AllAccess, a(application, R.raw.fallback_all_access_product_landing_info), r53Var, p53Var, iVar);
    }

    public final gy3 h(Application application, r53 r53Var, p53 p53Var, i iVar) {
        zq3.h(application, "application");
        zq3.h(r53Var, "growthUISubscription");
        zq3.h(p53Var, "growthUIRemoteConfig");
        zq3.h(iVar, "moshi");
        return new AllAccessLandingPageConfigRepository(DataConfigId.AllAccessLandingPageAsPaywall, a(application, R.raw.fallback_all_access_product_landing_info), r53Var, p53Var, iVar);
    }

    public final gy3 i(Application application, p53 p53Var, r53 r53Var, i iVar) {
        zq3.h(application, "application");
        zq3.h(p53Var, "growthUIRemoteConfig");
        zq3.h(r53Var, "growthUISubscription");
        zq3.h(iVar, "moshi");
        return new GamesLandingPageConfigRepository(DataConfigId.Games, a(application, R.raw.fallback_games_product_landing_info), r53Var, p53Var, iVar);
    }

    public final gy3 j(Application application, p53 p53Var, r53 r53Var, i iVar) {
        zq3.h(application, "application");
        zq3.h(p53Var, "growthUIRemoteConfig");
        zq3.h(r53Var, "growthUISubscription");
        zq3.h(iVar, "moshi");
        return new GamesLandingPageConfigRepository(DataConfigId.PlayTab, a(application, R.raw.fallback_playtab_product_landing_info), r53Var, p53Var, iVar);
    }

    public final RegibundleConfigRepository k(Application application, p53 p53Var, r53 r53Var, i iVar) {
        zq3.h(application, "application");
        zq3.h(p53Var, "growthUIRemoteConfig");
        zq3.h(r53Var, "growthUISubscription");
        zq3.h(iVar, "moshi");
        return new RegibundleConfigRepository(DataConfigId.Regibundle, a(application, R.raw.fallback_regibundle_info), r53Var, p53Var, iVar);
    }

    public final PaywallConfigRepository l(Application application, p53 p53Var, i iVar) {
        zq3.h(application, "application");
        zq3.h(p53Var, "growthUIRemoteConfig");
        zq3.h(iVar, "moshi");
        return new PaywallConfigRepository(DataConfigId.WordlebotPaywall, a(application, R.raw.fallback_wordlebot_paywall_info), p53Var, iVar);
    }
}
