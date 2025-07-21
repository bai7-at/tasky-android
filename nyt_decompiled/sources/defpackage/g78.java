package defpackage;

import com.nytimes.android.subauth.core.auth.models.LoginMethod;
import com.nytimes.android.subauth.core.auth.network.response.LoginResponse;
import com.nytimes.android.subauth.core.auth.network.response.c;

/* loaded from: classes4.dex */
public interface g78 {

    public static final class a {
        public static /* synthetic */ void a(g78 g78Var, String str, q22 q22Var, Exception exc, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onGraphQLErrorResponse");
            }
            if ((i & 2) != 0) {
                q22Var = null;
            }
            if ((i & 4) != 0) {
                exc = null;
            }
            g78Var.S(str, q22Var, exc);
        }

        public static /* synthetic */ void b(g78 g78Var, String str, LoginMethod loginMethod, LoginResponse loginResponse, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onLoginFailure");
            }
            if ((i & 4) != 0) {
                loginResponse = null;
            }
            g78Var.l(str, loginMethod, loginResponse);
        }
    }

    void B(String str);

    void G(String str, String str2, boolean z);

    void M(c.a aVar, String str, boolean z);

    void S(String str, q22 q22Var, Exception exc);

    void f(String str, String str2);

    void l(String str, LoginMethod loginMethod, LoginResponse loginResponse);

    void n(String str, String str2, String str3);

    void x(String str);
}
