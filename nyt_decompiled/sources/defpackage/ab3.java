package defpackage;

import com.apollographql.apollo.api.http.HttpMethod;
import com.facebook.AuthenticationTokenClaims;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class ab3 {
    private final HttpMethod a;
    private final String b;
    private final List c;
    private final pa3 d;
    private final m62 e;

    public static final class a {
        private final HttpMethod a;
        private final String b;
        private pa3 c;
        private final List d;
        private m62 e;

        public a(HttpMethod httpMethod, String str) {
            zq3.h(httpMethod, "method");
            zq3.h(str, "url");
            this.a = httpMethod;
            this.b = str;
            this.d = new ArrayList();
            this.e = m62.b;
        }

        public final a a(m62 m62Var) {
            zq3.h(m62Var, "executionContext");
            this.e = this.e.c(m62Var);
            return this;
        }

        public final a b(String str, String str2) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(str2, "value");
            this.d.add(new va3(str, str2));
            return this;
        }

        public final a c(List list) {
            zq3.h(list, "headers");
            this.d.addAll(list);
            return this;
        }

        public final a d(pa3 pa3Var) {
            zq3.h(pa3Var, "body");
            this.c = pa3Var;
            return this;
        }

        public final ab3 e() {
            return new ab3(this.a, this.b, this.d, this.c, this.e, null);
        }
    }

    public /* synthetic */ ab3(HttpMethod httpMethod, String str, List list, pa3 pa3Var, m62 m62Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(httpMethod, str, list, pa3Var, m62Var);
    }

    public static /* synthetic */ a f(ab3 ab3Var, HttpMethod httpMethod, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            httpMethod = ab3Var.a;
        }
        if ((i & 2) != 0) {
            str = ab3Var.b;
        }
        return ab3Var.e(httpMethod, str);
    }

    public final pa3 a() {
        return this.d;
    }

    public final List b() {
        return this.c;
    }

    public final HttpMethod c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public final a e(HttpMethod httpMethod, String str) {
        zq3.h(httpMethod, "method");
        zq3.h(str, "url");
        a aVar = new a(httpMethod, str);
        pa3 pa3Var = this.d;
        if (pa3Var != null) {
            aVar.d(pa3Var);
        }
        aVar.c(this.c);
        return aVar;
    }

    private ab3(HttpMethod httpMethod, String str, List list, pa3 pa3Var, m62 m62Var) {
        this.a = httpMethod;
        this.b = str;
        this.c = list;
        this.d = pa3Var;
        this.e = m62Var;
    }
}
