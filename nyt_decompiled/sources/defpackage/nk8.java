package defpackage;

import kotlin.text.h;

/* loaded from: classes4.dex */
public interface nk8 {

    public static final class a {
        public static boolean a(nk8 nk8Var) {
            if (nk8Var.d() != null && (!h.d0(r0))) {
                return true;
            }
            String token = nk8Var.getToken();
            return token != null && (h.d0(token) ^ true);
        }
    }

    boolean c();

    String d();

    String getToken();
}
