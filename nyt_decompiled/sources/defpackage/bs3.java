package defpackage;

import androidx.fragment.app.FragmentManager;
import com.nytimes.android.libs.iterate.IterateUserType;

/* loaded from: classes4.dex */
public interface bs3 {

    public static final class a {
        public static void a(bs3 bs3Var) {
        }

        public static void b(bs3 bs3Var, FragmentManager fragmentManager) {
            zq3.h(fragmentManager, "fragmentManager");
        }

        public static void c(bs3 bs3Var, FragmentManager fragmentManager) {
            zq3.h(fragmentManager, "fragmentManager");
        }

        public static void d(bs3 bs3Var, FragmentManager fragmentManager) {
            zq3.h(fragmentManager, "fragmentManager");
        }

        public static void e(bs3 bs3Var, FragmentManager fragmentManager) {
            zq3.h(fragmentManager, "fragmentManager");
        }

        public static void f(bs3 bs3Var, FragmentManager fragmentManager) {
            zq3.h(fragmentManager, "fragmentManager");
        }

        public static void g(bs3 bs3Var, IterateUserType iterateUserType, String str) {
            zq3.h(iterateUserType, "userType");
            zq3.h(str, "agentId");
        }
    }

    void a(IterateUserType iterateUserType, String str);

    void b(FragmentManager fragmentManager);

    void c(FragmentManager fragmentManager);

    void d(FragmentManager fragmentManager);

    void e();

    void f(FragmentManager fragmentManager);

    void g(FragmentManager fragmentManager);
}
