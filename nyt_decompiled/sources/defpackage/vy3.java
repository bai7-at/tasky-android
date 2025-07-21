package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import com.nytimes.android.growthui.common.models.DataConfigId;
import com.nytimes.android.growthui.landingpage.LandingPageActivity;
import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import com.nytimes.android.subauth.core.purchase.analytics.CampaignCodeSource;
import defpackage.uy3;

/* loaded from: classes4.dex */
public final class vy3 implements uy3 {
    private final Application a;

    public vy3(Application application) {
        zq3.h(application, "application");
        this.a = application;
    }

    @Override // defpackage.uy3
    public Intent a() {
        return LandingPageActivity.Companion.a(this.a, DataConfigId.PlayTab, null);
    }

    @Override // defpackage.uy3
    public Intent b(CampaignCodeSource campaignCodeSource, RegiInterface regiInterface, String str, String str2) {
        zq3.h(campaignCodeSource, "campaignCodeSource");
        zq3.h(regiInterface, "regiInterface");
        zq3.h(str, "referrer");
        return f(regiInterface, campaignCodeSource, str, str2);
    }

    @Override // defpackage.uy3
    public void c(CampaignCodeSource campaignCodeSource, RegiInterface regiInterface, String str, String str2) {
        zq3.h(campaignCodeSource, "campaignCodeSource");
        zq3.h(regiInterface, "regiInterface");
        zq3.h(str, "referrer");
        this.a.startActivity(LandingPageActivity.Companion.a(this.a, DataConfigId.AllAccess, null));
    }

    @Override // defpackage.uy3
    public Intent d(Activity activity) {
        zq3.h(activity, "activity");
        return LandingPageActivity.Companion.b(activity, DataConfigId.AllAccessLandingPageAsPaywall, null);
    }

    @Override // defpackage.uy3
    public void e(boolean z) {
        Intent a = LandingPageActivity.Companion.a(this.a, DataConfigId.PlayTab, null);
        a.putExtra("IS_FROM_WORDLEBOT_EXTRA", z);
        this.a.startActivity(a);
    }

    @Override // defpackage.uy3
    public Intent f(RegiInterface regiInterface, CampaignCodeSource campaignCodeSource, String str, String str2) {
        zq3.h(regiInterface, "regiInterface");
        zq3.h(campaignCodeSource, "campaignCodeSource");
        zq3.h(str, "referrer");
        return LandingPageActivity.Companion.a(this.a, DataConfigId.AllAccess, null);
    }

    @Override // defpackage.uy3
    public Intent g() {
        return uy3.a.a(this, RegiInterface.LinkDlSubscribe, CampaignCodeSource.SUBSCRIBE, "", null, 8, null);
    }

    @Override // defpackage.uy3
    public Intent h(CampaignCodeSource campaignCodeSource, RegiInterface regiInterface, String str, String str2) {
        zq3.h(campaignCodeSource, "campaignCodeSource");
        zq3.h(regiInterface, "regiInterface");
        zq3.h(str, "referrer");
        zq3.h(str2, "sku");
        return uy3.a.a(this, regiInterface, campaignCodeSource, str, null, 8, null);
    }
}
