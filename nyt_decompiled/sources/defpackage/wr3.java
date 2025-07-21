package defpackage;

import android.app.Application;
import androidx.fragment.app.FragmentManager;
import com.nytimes.android.libs.iterate.IterateSurveyReporterImpl;
import com.nytimes.android.libs.iterate.IterateUserType;
import com.nytimes.android.utils.AppPreferences;
import defpackage.bs3;

/* loaded from: classes4.dex */
public final class wr3 {
    public static final wr3 a = new wr3();

    public static final class a implements bs3 {
        a() {
        }

        @Override // defpackage.bs3
        public void a(IterateUserType iterateUserType, String str) {
            bs3.a.g(this, iterateUserType, str);
        }

        @Override // defpackage.bs3
        public void b(FragmentManager fragmentManager) {
            bs3.a.c(this, fragmentManager);
        }

        @Override // defpackage.bs3
        public void c(FragmentManager fragmentManager) {
            bs3.a.e(this, fragmentManager);
        }

        @Override // defpackage.bs3
        public void d(FragmentManager fragmentManager) {
            bs3.a.b(this, fragmentManager);
        }

        @Override // defpackage.bs3
        public void e() {
            bs3.a.a(this);
        }

        @Override // defpackage.bs3
        public void f(FragmentManager fragmentManager) {
            bs3.a.f(this, fragmentManager);
        }

        @Override // defpackage.bs3
        public void g(FragmentManager fragmentManager) {
            bs3.a.d(this, fragmentManager);
        }
    }

    private wr3() {
    }

    public final bs3 a(cb2 cb2Var, AppPreferences appPreferences, b05 b05Var, Application application) {
        zq3.h(cb2Var, "featureFlagUtil");
        zq3.h(appPreferences, "preferences");
        zq3.h(b05Var, "nytClock");
        zq3.h(application, "application");
        return cb2Var.w() ? new IterateSurveyReporterImpl(cb2Var, appPreferences, b05Var, application) : new a();
    }
}
