package com.nytimes.android;

import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import com.nytimes.android.video.FullscreenToolsController;
import defpackage.b04;
import defpackage.cr5;
import defpackage.gt7;
import defpackage.op4;
import defpackage.r57;

/* loaded from: classes2.dex */
public abstract class a implements op4 {
    public static void a(FullscreenMediaActivity fullscreenMediaActivity, b04 b04Var) {
        fullscreenMediaActivity.analyticsClient = b04Var;
    }

    public static void b(FullscreenMediaActivity fullscreenMediaActivity, cr5 cr5Var) {
        fullscreenMediaActivity.performanceTrackerClient = cr5Var;
    }

    public static void c(FullscreenMediaActivity fullscreenMediaActivity, RecentlyViewedManager recentlyViewedManager) {
        fullscreenMediaActivity.recentlyViewedManager = recentlyViewedManager;
    }

    public static void d(FullscreenMediaActivity fullscreenMediaActivity, r57 r57Var) {
        fullscreenMediaActivity.sectionFrontStore = r57Var;
    }

    public static void e(FullscreenMediaActivity fullscreenMediaActivity, b04 b04Var) {
        fullscreenMediaActivity.sharingManager = b04Var;
    }

    public static void f(FullscreenMediaActivity fullscreenMediaActivity, gt7 gt7Var) {
        fullscreenMediaActivity.singleFullMediaPresenter = gt7Var;
    }

    public static void g(FullscreenMediaActivity fullscreenMediaActivity, SnackbarUtil snackbarUtil) {
        fullscreenMediaActivity.snackbarUtil = snackbarUtil;
    }

    public static void h(FullscreenMediaActivity fullscreenMediaActivity, FullscreenToolsController fullscreenToolsController) {
        fullscreenMediaActivity.toolsController = fullscreenToolsController;
    }
}
