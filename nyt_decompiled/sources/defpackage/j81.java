package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.f;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.dailyfive.domain.DailyFiveAsset;
import com.nytimes.android.dailyfive.domain.GamesAsset;
import com.nytimes.android.dailyfive.domain.NumberedArticleTrendingNode;
import com.nytimes.android.dailyfive.domain.NumberedGuideTrendingNode;
import com.nytimes.android.dailyfive.domain.NumberedInteractiveTrendingNode;
import com.nytimes.android.dailyfive.domain.b;
import com.nytimes.android.dailyfive.domain.d;
import com.nytimes.android.navigation.NavigationSource;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public final class j81 {
    private final tr3 a;
    private final Fragment b;
    private final b35 c;

    public j81(tr3 tr3Var, Fragment fragment, b35 b35Var) {
        zq3.h(tr3Var, "itemToDetailNavigator");
        zq3.h(fragment, "fragment");
        zq3.h(b35Var, "navigationStateHolder");
        this.a = tr3Var;
        this.b = fragment;
        this.c = b35Var;
    }

    private final y25 c(DailyFiveAsset dailyFiveAsset, String str, String str2, String str3) {
        String str4;
        if (!(dailyFiveAsset.b() instanceof d)) {
            return null;
        }
        b b = dailyFiveAsset.b();
        if (b instanceof NumberedArticleTrendingNode) {
            str4 = AssetConstants.ARTICLE_TYPE;
        } else if (b instanceof NumberedInteractiveTrendingNode) {
            str4 = AssetConstants.INTERACTIVE_TYPE;
        } else {
            if (!(b instanceof NumberedGuideTrendingNode)) {
                throw new NoWhenBranchMatchedException();
            }
            str4 = AssetConstants.DAILY_FIVE_GUIDE;
        }
        String str5 = str4;
        String e = dailyFiveAsset.b().e();
        String d = dailyFiveAsset.b().d();
        boolean z = dailyFiveAsset.b() instanceof NumberedInteractiveTrendingNode;
        NavigationSource navigationSource = NavigationSource.FOLLOW;
        List c = dailyFiveAsset.c();
        return new y25(e, str5, d, str, str, z, false, null, null, navigationSource, str2, "asset tap", str3, null, null, null, c != null ? t71.a(c) : null, null, null, 450816, null);
    }

    private final y25 d(GamesAsset gamesAsset, String str) {
        return new y25(gamesAsset.c().e(), AssetConstants.DAILY_FIVE_GAME, gamesAsset.c().d(), str, str, false, false, null, null, NavigationSource.FOLLOW, gamesAsset.b(), "TODAY’S GAMES", "Carousel.dailyGames", null, null, null, null, null, null, 516352, null);
    }

    public final void a(DailyFiveAsset dailyFiveAsset, String str, String str2) {
        zq3.h(dailyFiveAsset, "asset");
        zq3.h(str, "sectionTitle");
        zq3.h(str2, "moduleContext");
        this.c.c();
        y25 c = c(dailyFiveAsset, str, dailyFiveAsset.a(), str2);
        if (c != null) {
            tr3 tr3Var = this.a;
            f requireActivity = this.b.requireActivity();
            zq3.g(requireActivity, "requireActivity(...)");
            tr3Var.b(c, requireActivity, this.b);
        }
    }

    public final void b(String str, GamesAsset gamesAsset, Fragment fragment) {
        zq3.h(str, "sectionName");
        zq3.h(gamesAsset, "gamesAsset");
        zq3.h(fragment, "fragment");
        this.c.b().setValue(Boolean.TRUE);
        this.c.c();
        y25 d = d(gamesAsset, str);
        if (d != null) {
            tr3 tr3Var = this.a;
            f requireActivity = fragment.requireActivity();
            zq3.g(requireActivity, "requireActivity(...)");
            tr3Var.b(d, requireActivity, fragment);
        }
    }
}
