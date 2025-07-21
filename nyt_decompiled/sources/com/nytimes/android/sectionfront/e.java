package com.nytimes.android.sectionfront;

import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import com.nytimes.android.video.VideoAutoPlayScrollListener;
import defpackage.cb2;
import defpackage.hb5;
import defpackage.lu6;
import defpackage.mu6;
import defpackage.op4;
import defpackage.p76;
import defpackage.r57;
import defpackage.tr3;
import defpackage.vb2;
import defpackage.vg7;
import defpackage.z4;

/* loaded from: classes4.dex */
public abstract class e implements op4 {
    public static void a(SectionFrontFragment sectionFrontFragment, ET2Scope eT2Scope) {
        sectionFrontFragment.et2Scope = eT2Scope;
    }

    public static void b(SectionFrontFragment sectionFrontFragment, cb2 cb2Var) {
        sectionFrontFragment.featureFlagUtil = cb2Var;
    }

    public static void c(SectionFrontFragment sectionFrontFragment, vb2 vb2Var) {
        sectionFrontFragment.feedPerformanceTracker = vb2Var;
    }

    public static void d(SectionFrontFragment sectionFrontFragment, hb5 hb5Var) {
        sectionFrontFragment.mediaControl = hb5Var;
    }

    public static void e(SectionFrontFragment sectionFrontFragment, z4 z4Var) {
        sectionFrontFragment.mediaManager = z4Var;
    }

    public static void f(SectionFrontFragment sectionFrontFragment, p76 p76Var) {
        sectionFrontFragment.multiColumnSectionFrontAdapterProvider = p76Var;
    }

    public static void g(SectionFrontFragment sectionFrontFragment, tr3 tr3Var) {
        sectionFrontFragment.navigator = tr3Var;
    }

    public static void h(SectionFrontFragment sectionFrontFragment, NetworkStatus networkStatus) {
        sectionFrontFragment.networkStatus = networkStatus;
    }

    public static void i(SectionFrontFragment sectionFrontFragment, p76 p76Var) {
        sectionFrontFragment.oneColumnSectionFrontAdapterProvider = p76Var;
    }

    public static void j(SectionFrontFragment sectionFrontFragment, p76 p76Var) {
        sectionFrontFragment.photoVidAdapterProvider = p76Var;
    }

    public static void k(SectionFrontFragment sectionFrontFragment, vg7 vg7Var) {
        sectionFrontFragment.presenter = vg7Var;
    }

    public static void l(SectionFrontFragment sectionFrontFragment, RecentlyViewedManager recentlyViewedManager) {
        sectionFrontFragment.recentlyViewedManager = recentlyViewedManager;
    }

    public static void m(SectionFrontFragment sectionFrontFragment, lu6 lu6Var) {
        sectionFrontFragment.regibundleOfferEventSender = lu6Var;
    }

    public static void n(SectionFrontFragment sectionFrontFragment, mu6 mu6Var) {
        sectionFrontFragment.regibundleScrollListener = mu6Var;
    }

    public static void o(SectionFrontFragment sectionFrontFragment, r57 r57Var) {
        sectionFrontFragment.sfRefresher = r57Var;
    }

    public static void p(SectionFrontFragment sectionFrontFragment, SnackbarUtil snackbarUtil) {
        sectionFrontFragment.snackbarUtil = snackbarUtil;
    }

    public static void q(SectionFrontFragment sectionFrontFragment, VideoAutoPlayScrollListener videoAutoPlayScrollListener) {
        sectionFrontFragment.videoAutoPlayScrollListener = videoAutoPlayScrollListener;
    }
}
