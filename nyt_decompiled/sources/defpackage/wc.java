package defpackage;

import android.app.Activity;
import android.app.Application;
import defpackage.g42;

/* loaded from: classes2.dex */
public interface wc extends g42 {

    public static final class a {
        public static void a(wc wcVar, uc ucVar) {
            zq3.h(ucVar, "event");
            g42.a.a(wcVar, ucVar);
        }

        public static void b(wc wcVar, Activity activity) {
            zq3.h(activity, "activity");
        }

        public static void c(wc wcVar, Activity activity) {
            zq3.h(activity, "activity");
        }

        public static void d(wc wcVar, Application application) {
            zq3.h(application, "application");
        }

        public static void e(wc wcVar, m98 m98Var) {
            zq3.h(m98Var, "user");
        }
    }

    void a(m98 m98Var);

    void c(Activity activity);

    void d(Application application);

    void e(Activity activity);
}
