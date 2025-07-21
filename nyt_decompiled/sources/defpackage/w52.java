package defpackage;

import com.facebook.AuthenticationTokenClaims;

/* loaded from: classes2.dex */
public interface w52 {

    public static final class a {
        public static void a(w52 w52Var, String str, Integer num) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            if (num != null) {
                w52Var.b(str, num.intValue());
            } else {
                w52Var.g(str);
            }
        }

        public static void b(w52 w52Var, String str, Long l) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            if (l != null) {
                w52Var.e(str, l.longValue());
            } else {
                w52Var.g(str);
            }
        }

        public static void c(w52 w52Var, String str, String str2) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            if (str2 != null) {
                w52Var.a(str, str2);
            } else {
                w52Var.g(str);
            }
        }
    }

    void a(String str, String str2);

    void b(String str, int i);

    void c(String str, String str2);

    void d(String str, Integer num);

    void e(String str, long j);

    void f(String str, Long l);

    void g(String str);
}
