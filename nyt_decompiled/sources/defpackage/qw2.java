package defpackage;

import com.nytimes.android.ArticlePageEventSender;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.gateway.GatewayFragmentCard;
import com.nytimes.android.gateway.GatewayFragmentManager;
import com.nytimes.android.messaging.OfflineCard;
import com.nytimes.android.messaging.regiwall.DismissibleRegiwallCard;
import com.nytimes.android.messaging.regiwall.RegiwallCard;
import com.nytimes.android.messaging.truncator.TruncatorCard;
import com.nytimes.android.utils.AppPreferences;

/* loaded from: classes4.dex */
public abstract class qw2 implements op4 {
    public static void a(GatewayFragmentCard gatewayFragmentCard, AbraManager abraManager) {
        gatewayFragmentCard.abraManager = abraManager;
    }

    public static void b(GatewayFragmentCard gatewayFragmentCard, AppPreferences appPreferences) {
        gatewayFragmentCard.appPreferences = appPreferences;
    }

    public static void c(GatewayFragmentCard gatewayFragmentCard, ArticlePageEventSender articlePageEventSender) {
        gatewayFragmentCard.articlePageEventSender = articlePageEventSender;
    }

    public static void d(GatewayFragmentCard gatewayFragmentCard, DismissibleRegiwallCard dismissibleRegiwallCard) {
        gatewayFragmentCard.dismissibleRegiwallCard = dismissibleRegiwallCard;
    }

    public static void e(GatewayFragmentCard gatewayFragmentCard, GatewayFragmentManager gatewayFragmentManager) {
        gatewayFragmentCard.gatewayFragmentManager = gatewayFragmentManager;
    }

    public static void f(GatewayFragmentCard gatewayFragmentCard, sw2 sw2Var) {
        gatewayFragmentCard.gatewayPresenter = sw2Var;
    }

    public static void g(GatewayFragmentCard gatewayFragmentCard, uy3 uy3Var) {
        gatewayFragmentCard.launchProductLandingHelper = uy3Var;
    }

    public static void h(GatewayFragmentCard gatewayFragmentCard, OfflineCard offlineCard) {
        gatewayFragmentCard.offlineCard = offlineCard;
    }

    public static void i(GatewayFragmentCard gatewayFragmentCard, RegiwallCard regiwallCard) {
        gatewayFragmentCard.regiwallCard = regiwallCard;
    }

    public static void j(GatewayFragmentCard gatewayFragmentCard, TruncatorCard truncatorCard) {
        gatewayFragmentCard.truncatorCard = truncatorCard;
    }

    public static void k(GatewayFragmentCard gatewayFragmentCard, id9 id9Var) {
        gatewayFragmentCard.webActivityNavigator = id9Var;
    }
}
