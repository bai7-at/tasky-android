package defpackage;

import android.app.Application;
import com.nytimes.abtests.b;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.abra.AbraManagerBuilder;
import com.nytimes.android.abra.utilities.AbraClientLogger;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.utils.AppPreferences;

/* loaded from: classes3.dex */
public final class q0 {
    public static final q0 a = new q0();

    public static final class a implements AbraClientLogger {
        a() {
        }

        @Override // com.nytimes.android.abra.utilities.AbraClientLogger
        public void debug(String str) {
            zq3.h(str, "message");
            NYTLogger.d(str, new Object[0]);
        }

        @Override // com.nytimes.android.abra.utilities.AbraClientLogger
        public void error(String str) {
            zq3.h(str, "message");
            NYTLogger.g(str, new Object[0]);
        }

        @Override // com.nytimes.android.abra.utilities.AbraClientLogger
        public void info(String str) {
            zq3.h(str, "message");
            NYTLogger.l(str, new Object[0]);
        }
    }

    private q0() {
    }

    public final AbraManager a(Application application, b04 b04Var, t tVar, u0 u0Var) {
        zq3.h(application, "application");
        zq3.h(b04Var, "client");
        zq3.h(tVar, "reporter");
        zq3.h(u0Var, "paramProvider");
        AbraManager build = new AbraManagerBuilder(application, u0Var, tVar, sj6.abra_allocator, sj6.abra_rules).logger(new a()).okHttpClient(b04Var).build();
        build.registerTestSpecs(b.a());
        build.initializeManager();
        return build;
    }

    public final u0 b(Application application, AppPreferences appPreferences, String str, cb2 cb2Var, b04 b04Var) {
        zq3.h(application, "application");
        zq3.h(appPreferences, "appPreferences");
        zq3.h(str, "appVersion");
        zq3.h(cb2Var, "featureFlagUtil");
        zq3.h(b04Var, "subauthClient");
        return new u0(cb2Var.m(), application, b.a(), appPreferences, str, b04Var);
    }

    public final t c(boolean z) {
        return new t(z);
    }
}
