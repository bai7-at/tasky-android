package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import com.nytimes.android.subauth.core.purchase.analytics.CampaignCodeSource;

/* loaded from: classes4.dex */
public interface uy3 {

    public static final class a {
        public static /* synthetic */ Intent a(uy3 uy3Var, RegiInterface regiInterface, CampaignCodeSource campaignCodeSource, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIntent");
            }
            if ((i & 8) != 0) {
                str2 = null;
            }
            return uy3Var.f(regiInterface, campaignCodeSource, str, str2);
        }

        public static /* synthetic */ Intent b(uy3 uy3Var, CampaignCodeSource campaignCodeSource, RegiInterface regiInterface, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getProductLandingIntent");
            }
            if ((i & 8) != 0) {
                str2 = null;
            }
            return uy3Var.b(campaignCodeSource, regiInterface, str, str2);
        }

        public static /* synthetic */ void c(uy3 uy3Var, CampaignCodeSource campaignCodeSource, RegiInterface regiInterface, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchProductLandingActivity");
            }
            if ((i & 8) != 0) {
                str2 = null;
            }
            uy3Var.c(campaignCodeSource, regiInterface, str, str2);
        }
    }

    Intent a();

    Intent b(CampaignCodeSource campaignCodeSource, RegiInterface regiInterface, String str, String str2);

    void c(CampaignCodeSource campaignCodeSource, RegiInterface regiInterface, String str, String str2);

    Intent d(Activity activity);

    void e(boolean z);

    Intent f(RegiInterface regiInterface, CampaignCodeSource campaignCodeSource, String str, String str2);

    Intent g();

    Intent h(CampaignCodeSource campaignCodeSource, RegiInterface regiInterface, String str, String str2);
}
