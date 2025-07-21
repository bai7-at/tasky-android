package defpackage;

import android.app.Application;
import android.content.res.Resources;
import com.nytimes.android.remoteconfig.FirebaseConfigSource;
import io.reactivex.subjects.BehaviorSubject;

/* loaded from: classes4.dex */
public final class tv6 {
    public static final tv6 a = new tv6();

    public static final class a implements pg8 {
        a() {
        }

        @Override // defpackage.pg8
        public Object a(og8 og8Var) {
            zq3.h(og8Var, "task");
            return vg8.a(og8Var);
        }
    }

    private tv6() {
    }

    public final String a(Resources resources) {
        zq3.h(resources, "res");
        return resources.getString(zl6.eventTrackerSourceApp) + resources.getString(zl6.eventTrackerAppPostfix);
    }

    public final com.google.firebase.remoteconfig.a b(Application application) {
        zq3.h(application, "context");
        aj2 a2 = bi2.a.a(application);
        if (a2 == null) {
            uh2.p(application);
            com.google.firebase.remoteconfig.a i = com.google.firebase.remoteconfig.a.i();
            zq3.e(i);
            return i;
        }
        uh2 r = uh2.r(application, a2, String.valueOf(a2.e()));
        zq3.g(r, "initializeApp(...)");
        com.google.firebase.remoteconfig.a j = com.google.firebase.remoteconfig.a.j(r);
        zq3.e(j);
        return j;
    }

    public final qv6 c(FirebaseConfigSource firebaseConfigSource, d07 d07Var) {
        zq3.h(firebaseConfigSource, "firebase");
        zq3.h(d07Var, "resources");
        return new qv6(firebaseConfigSource, d07Var);
    }

    public final BehaviorSubject d() {
        return hj2.a();
    }

    public final pg8 e() {
        return new a();
    }
}
