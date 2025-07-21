package defpackage;

import androidx.fragment.app.f;
import com.nytimes.android.subauth.core.api.listeners.LogoutSource;
import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public interface o98 {

    public static final class a {
        public static /* synthetic */ Object a(o98 o98Var, String str, String str2, RegiInterface regiInterface, by0 by0Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: login");
            }
            if ((i & 4) != 0) {
                regiInterface = null;
            }
            return o98Var.s(str, str2, regiInterface, by0Var);
        }

        public static /* synthetic */ Object b(o98 o98Var, f fVar, String str, RegiInterface regiInterface, by0 by0Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loginWithFacebookSSO");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                regiInterface = null;
            }
            return o98Var.k(fVar, str, regiInterface, by0Var);
        }

        public static /* synthetic */ Object c(o98 o98Var, f fVar, String str, String str2, RegiInterface regiInterface, by0 by0Var, int i, Object obj) {
            if (obj == null) {
                return o98Var.p(fVar, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : regiInterface, by0Var);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loginWithGoogleSSO");
        }

        public static /* synthetic */ Object d(o98 o98Var, String str, String str2, String str3, RegiInterface regiInterface, by0 by0Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loginWithWebSSO");
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            return o98Var.j(str, str2, str3, regiInterface, by0Var);
        }

        public static /* synthetic */ Object e(o98 o98Var, LogoutSource logoutSource, by0 by0Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logout");
            }
            if ((i & 1) != 0) {
                logoutSource = LogoutSource.USER_LOGOUT;
            }
            return o98Var.z(logoutSource, by0Var);
        }

        public static /* synthetic */ Object f(o98 o98Var, f fVar, String str, by0 by0Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: oneTapLogin");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            return o98Var.i(fVar, str, by0Var);
        }

        public static /* synthetic */ Object g(o98 o98Var, String str, String str2, String str3, String str4, RegiInterface regiInterface, by0 by0Var, int i, Object obj) {
            if (obj == null) {
                return o98Var.w(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : regiInterface, by0Var);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
    }

    public static final class b {
        private final Integer a;
        private final String b;

        public b(Integer num, String str) {
            this.a = num;
            this.b = str;
        }

        public final Integer a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b);
        }

        public int hashCode() {
            Integer num = this.a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.b;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "ForceLogoutData(forceLogoutErrorCode=" + this.a + ", sessionRefreshRequestNYTS=" + this.b + ")";
        }
    }

    Object A(String str, String str2, f fVar, RegiInterface regiInterface, by0 by0Var);

    boolean H();

    String b();

    Flow c();

    Object d(String str, String str2, String str3, String str4, f fVar, RegiInterface regiInterface, by0 by0Var);

    Object e(String str, by0 by0Var);

    Object g(by0 by0Var);

    Object h(String str, by0 by0Var);

    Object i(f fVar, String str, by0 by0Var);

    Object j(String str, String str2, String str3, RegiInterface regiInterface, by0 by0Var);

    Object k(f fVar, String str, RegiInterface regiInterface, by0 by0Var);

    Flow m();

    Object n(String str, String str2, by0 by0Var);

    Object p(f fVar, String str, String str2, RegiInterface regiInterface, by0 by0Var);

    Object q(by0 by0Var);

    Object s(String str, String str2, RegiInterface regiInterface, by0 by0Var);

    Object t(f fVar, by0 by0Var);

    Object u(String str, String str2, by0 by0Var);

    Object w(String str, String str2, String str3, String str4, RegiInterface regiInterface, by0 by0Var);

    Object y(String str, String str2, by0 by0Var);

    Object z(LogoutSource logoutSource, by0 by0Var);
}
