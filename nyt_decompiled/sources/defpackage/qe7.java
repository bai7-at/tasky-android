package defpackage;

import com.nytimes.android.SectionActivity;
import com.nytimes.android.menu.MenuManager;
import com.nytimes.android.saved.SavedManager;
import com.nytimes.android.utils.NetworkStatus;

/* loaded from: classes2.dex */
public abstract class qe7 implements op4 {
    public static void a(SectionActivity sectionActivity, jc jcVar) {
        sectionActivity.analyticsClient = jcVar;
    }

    public static void b(SectionActivity sectionActivity, zc zcVar) {
        sectionActivity.analyticsEventReporter = zcVar;
    }

    public static void c(SectionActivity sectionActivity, z58 z58Var) {
        sectionActivity.eCommClient = z58Var;
    }

    public static void d(SectionActivity sectionActivity, cb2 cb2Var) {
        sectionActivity.featureFlagUtil = cb2Var;
    }

    public static void e(SectionActivity sectionActivity, MenuManager menuManager) {
        sectionActivity.menuManager = menuManager;
    }

    public static void f(SectionActivity sectionActivity, NetworkStatus networkStatus) {
        sectionActivity.networkStatus = networkStatus;
    }

    public static void g(SectionActivity sectionActivity, SavedManager savedManager) {
        sectionActivity.savedManager = savedManager;
    }

    public static void h(SectionActivity sectionActivity, nf7 nf7Var) {
        sectionActivity.sectionFrontFragmentFactory = nf7Var;
    }

    public static void i(SectionActivity sectionActivity, bh7 bh7Var) {
        sectionActivity.sectionFrontRefresher = bh7Var;
    }
}
