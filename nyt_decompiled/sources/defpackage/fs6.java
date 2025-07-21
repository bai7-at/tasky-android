package defpackage;

import com.nytimes.android.comments.comments.data.store.CommentsStore;
import com.nytimes.android.entitlements.b;
import com.nytimes.android.recent.RecentlyViewedFragment;
import com.nytimes.android.recent.SavingBridge;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import com.nytimes.android.utils.snackbar.SnackbarUtil;

/* loaded from: classes4.dex */
public abstract class fs6 implements op4 {
    public static void a(RecentlyViewedFragment recentlyViewedFragment, xr6 xr6Var) {
        recentlyViewedFragment.analytics = xr6Var;
    }

    public static void b(RecentlyViewedFragment recentlyViewedFragment, CommentsStore commentsStore) {
        recentlyViewedFragment.commentStore = commentsStore;
    }

    public static void c(RecentlyViewedFragment recentlyViewedFragment, cb2 cb2Var) {
        recentlyViewedFragment.featureFlagUtil = cb2Var;
    }

    public static void d(RecentlyViewedFragment recentlyViewedFragment, qq3 qq3Var) {
        recentlyViewedFragment.internalPreferences = qq3Var;
    }

    public static void e(RecentlyViewedFragment recentlyViewedFragment, RecentlyViewedManager recentlyViewedManager) {
        recentlyViewedFragment.recentlyViewedManager = recentlyViewedManager;
    }

    public static void f(RecentlyViewedFragment recentlyViewedFragment, SavingBridge savingBridge) {
        recentlyViewedFragment.savedBridge = savingBridge;
    }

    public static void g(RecentlyViewedFragment recentlyViewedFragment, uq7 uq7Var) {
        recentlyViewedFragment.sharingManager = uq7Var;
    }

    public static void h(RecentlyViewedFragment recentlyViewedFragment, b bVar) {
        recentlyViewedFragment.signInClient = bVar;
    }

    public static void i(RecentlyViewedFragment recentlyViewedFragment, SnackbarUtil snackbarUtil) {
        recentlyViewedFragment.snackbarUtil = snackbarUtil;
    }
}
