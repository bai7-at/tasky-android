package defpackage;

import com.nytimes.android.recent.RecentlyViewedUnfearFragment;
import com.nytimes.android.saved.SaveHandler;

/* loaded from: classes4.dex */
public abstract class ws6 implements op4 {
    public static void a(RecentlyViewedUnfearFragment recentlyViewedUnfearFragment, xr6 xr6Var) {
        recentlyViewedUnfearFragment.analytics = xr6Var;
    }

    public static void b(RecentlyViewedUnfearFragment recentlyViewedUnfearFragment, SaveHandler saveHandler) {
        recentlyViewedUnfearFragment.saveHandler = saveHandler;
    }

    public static void c(RecentlyViewedUnfearFragment recentlyViewedUnfearFragment, uq7 uq7Var) {
        recentlyViewedUnfearFragment.sharingManager = uq7Var;
    }
}
