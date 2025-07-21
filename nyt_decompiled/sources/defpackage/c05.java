package defpackage;

import java.net.URLEncoder;
import java.util.Map;
import kotlin.collections.i;
import okhttp3.Interceptor;

/* loaded from: classes4.dex */
public interface c05 {
    public static final a Companion = a.$$INSTANCE;

    public static final class a {
        static final /* synthetic */ a $$INSTANCE = new a();

        private a() {
        }

        public final String a(Map map, boolean z) {
            zq3.h(map, "cookies");
            StringBuilder sb = new StringBuilder(64);
            int i = 0;
            for (Object obj : map.entrySet()) {
                int i2 = i + 1;
                if (i < 0) {
                    i.v();
                }
                Map.Entry entry = (Map.Entry) obj;
                if (i > 0) {
                    sb.append(';');
                }
                String str = (String) entry.getValue();
                if (z) {
                    str = URLEncoder.encode(str, yj0.b.name());
                }
                sb.append((String) entry.getKey());
                sb.append('=');
                sb.append(str);
                i = i2;
            }
            String sb2 = sb.toString();
            zq3.g(sb2, "toString(...)");
            return sb2;
        }
    }

    public static final class b {
        public static /* synthetic */ Object a(c05 c05Var, String str, String str2, boolean z, by0 by0Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: convertNYTCookies");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return c05Var.v(str, str2, z, by0Var);
        }

        public static /* synthetic */ String b(c05 c05Var, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCachedNYTSCookie");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            return c05Var.m(z);
        }
    }

    Object a(String str, by0 by0Var);

    Object c(String str, by0 by0Var);

    Object d(by0 by0Var);

    Object f(String str, String str2, by0 by0Var);

    Object k(String str, by0 by0Var);

    Object l(String str, by0 by0Var);

    String m(boolean z);

    Object n(by0 by0Var);

    Object o(by0 by0Var);

    Interceptor p();

    Object q(by0 by0Var);

    void r(String str);

    Object s(by0 by0Var);

    Object t(by0 by0Var);

    Object u(String str, by0 by0Var);

    Object v(String str, String str2, boolean z, by0 by0Var);
}
